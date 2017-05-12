package drug.controller;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import drug.common.BAConst;
import drug.common.Pub;
import drug.entity.BusinessVo;
import drug.entity.DrugInfo;
import drug.entity.Function;
import drug.entity.Repostory;
import drug.entity.RoleVo;
import drug.entity.SaleVo;
import drug.entity.UserSession;
import drug.service.business.BusinessService;
import drug.service.business.DrugService;
import drug.service.business.PurchaseService;
import drug.service.business.RepoService;
import drug.service.business.SaleService;
import drug.service.user.UserService;


@Controller
public class MainController {

	@Autowired
	private UserService userService;
	@Autowired
	private BusinessService businessService;
	@Autowired
	private DrugService drugService;
	@Autowired
	private RepoService repoService;
	@Autowired
	private PurchaseService purchaseService;
	@Autowired
	private SaleService saleService;
	
	@RequestMapping("login.do")
	@ResponseBody
	public String login(@RequestBody Map session,HttpServletRequest req,HttpServletResponse resp){
		String userId=(String) session.get("userId");
		String userPasswd=(String) session.get("userPasswd");
		UserSession user=new UserSession();
		user.setUser_id(userId);
		user.setUser_passwd(userPasswd);
		String resCode=userService.login(user);
		if(BAConst.SUCCESS.equals(resCode)){
			HttpSession sion=req.getSession();
			sion.setAttribute("user", user);
			return "";
		}
		return "login error";
	}
	@RequestMapping("index.do")
	public String mappingIndex(HttpServletRequest req,HttpServletResponse resp){
		HttpSession session=req.getSession();
		UserSession user=(UserSession) session.getAttribute("user");
		userService.getUserDetail(user);
		Map<Function,Map> permissions=user.getFuncs();
		System.out.println(permissions);
		session.setAttribute("user", user);
		return "index";
	}
	@RequestMapping("main.do")
	public String mappingMain(HttpServletRequest req,HttpServletResponse resp){
		System.out.println("main.do");
		return "main";
	}
	
	
	@RequestMapping("business.do")
	public String mappingBusiness(HttpServletRequest req,HttpServletResponse resp){
//		List<BusinessVo> list=businessService.findAll();
		String level1=req.getParameter("level1");
		String level2=req.getParameter("level2");
		System.out.println("level1="+level1+",level2="+level2);
		Function f1=new Function();
		Function f2=new Function();
		f1.setFunc_id(level1);
		f2.setFunc_id(level2);
		HttpSession session=req.getSession();
		UserSession user=(UserSession) session.getAttribute("user");
		Map<Function, Map> map=user.getFuncs();
		Map buttons=Pub.findFunc(map, f1, f2);
		Set<Function> bs=buttons.keySet();
		System.out.println(bs);
		String statuses=userService.getUserNumLimit(user.getUser_id());
		List<String> status=Arrays.asList(statuses.split(","));
		System.out.println(status);
		if(!status.contains("1")){
			for (Function f : bs) {
				if(f.getFunc_id().equals("inspect")){
					bs.remove(f);
					break;
				}
			}
		}
		System.out.println(bs);
		if(!status.contains("2")){
			for (Function f : bs) {
				if(f.getFunc_id().equals("audit")){
					bs.remove(f);
					break;
				}
			}
		}
		System.out.println(bs);
		if(!status.contains("4")){
			for (Function f : bs) {
				if(f.getFunc_id().equals("instore")){
					bs.remove(f);
					break;
				}
			}
		}
		req.setAttribute("status", status);
		req.setAttribute("buttons", bs);
		System.out.println(status);
		return "business";
	}
	@ResponseBody
	@RequestMapping("businessData.do")
	public List<BusinessVo> mappingBusinessData(HttpServletRequest req,HttpServletResponse resp,@RequestBody Map map){
		String status=(String) map.get("status");
		String startDate=(String) map.get("startDate");
		String endDate=(String) map.get("endDate");
		String page=(String) map.get("page");
		System.out.println(status+","+startDate+","+endDate+","+page);
		Map<String, String> params=new HashMap<String, String>();
		params.put("status", status);
		params.put("startDate", startDate);
		params.put("endDate", endDate);
		params.put("page", page);
		List<BusinessVo> datas=businessService.findByStatus(params);
		System.out.println(datas.size());
		for (BusinessVo businessVo : datas) {
			System.out.println(businessVo);
		}
		return datas;
	}
	@ResponseBody
	@RequestMapping("auditData.do")
	public String mappingAuditData(HttpServletRequest req,HttpServletResponse resp,@RequestBody Map map){
		HttpSession session=req.getSession();
		UserSession user=(UserSession) session.getAttribute("user");
		String name=user.getUser_id();
		map.put("name", name);
		return businessService.audit(map);
	}
	/**
	 * 库存管理
	 */
	@RequestMapping("repostory.do")
	public String mappingRepoMsg(HttpServletRequest req,HttpServletResponse resp){
		Map<String, String> map=new HashMap<String, String>();
		map.put("status", "1");
		List<Repostory> repos=repoService.findAll(map);
		req.setAttribute("repos", repos);
		return "repostory";
	}
	@RequestMapping("repostoryData.do")
	@ResponseBody
	public List<Repostory> mappingRepostoryData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String status=map.get("status");
		String search=map.get("search");
		if("All".equals(status)){
			map.put("status", null);
		}
		if("".equals(search.trim())){
			map.put("search", null);
		}
		System.out.println(map);
		List<Repostory> repos=repoService.findAll(map);
		return repos;
	}
	/**
	 * 采购管理
	 */
	@RequestMapping("purchase.do")
	public String mappingPurchaseMsg(HttpServletRequest req,HttpServletResponse resp){
		
		return "purchase";
	}
	@RequestMapping("purchaseData.do")
	@ResponseBody
	public List<BusinessVo> mappingPurchaseData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String search=map.get("search");
		if("".equals(search.trim())){
			map.put("search", null);
		}
		System.out.println(map);
		List<BusinessVo> purchase=purchaseService.findAll(map);
		return purchase;
	}
	@RequestMapping("purchaseConfirm.do")
	@ResponseBody
	public String mappingPurchaseConfirm(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		System.out.println(map);
		return purchaseService.updatePurchase(map);
	}
	/**
	 * 销售管理
	 */
	@RequestMapping("drugMsg.do")
	public String mappingDrgMsg(HttpServletRequest req,HttpServletResponse resp){
		List<Repostory> repos=repoService.findAll(new HashMap<String, String>());
		req.setAttribute("repos", repos);
		return "drugInfo";
	}
	@RequestMapping("drugData.do")
	@ResponseBody
	public List<DrugInfo> mappingDrugData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String repo=map.get("repoNo");
		if("All".equals(repo)){
			map.put("repoNo", null);
		}
		String search=map.get("search");
		if(search==null||"".equals(search.trim())){
			map.put("search", null);
		}
		List<DrugInfo> drugs=drugService.findAllDrug(map);
		return drugs;
	}
	@RequestMapping("sales.do")
	public String mappingSalesMsg(HttpServletRequest req,HttpServletResponse resp){
		return "sales";
	}
	@RequestMapping("salesData.do")
	@ResponseBody
	public List<SaleVo> mappingSalesData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String search=map.get("search");
		if(search==null||"".equals(search.trim())){
			map.put("search", null);
		}
		List<SaleVo> sales=saleService.findAll(map);
		return sales;
	}
	/**
	 * 系统管理
	 */
	@RequestMapping("roleMsg.do")
	public String mappingRolesMsg(HttpServletRequest req,HttpServletResponse resp){
		Map<String, String> params=new HashMap<String, String>();
		params.put("page", "1");
		params.put("search", null);
		List<RoleVo> allRoles=userService.findAllRoles(params);
		req.setAttribute("allRoles", allRoles);
		return "role";
	}
	@RequestMapping("roleData.do")
	@ResponseBody
	public List<RoleVo> mappingRoleData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String search=map.get("search");
		if(search==null||"".equals(search.trim())){
			map.put("search", null);
		}
		List<RoleVo> allRoles=userService.findAllRoles(map);
		return allRoles;
	}
	@RequestMapping("funcMsg.do")
	public String mappingFuncMsg(HttpServletRequest req,HttpServletResponse resp){
		Map<String, String> params=new HashMap<String, String>();
		params.put("page", "1");
		params.put("search", null);
		List<Function> allFuncs=userService.findAllFunc(params);
		req.setAttribute("allFuncs", allFuncs);
		return "function";
	}
	@RequestMapping("funcData.do")
	@ResponseBody
	public List<Function> mappingFuncData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String search=map.get("search");
		if(search==null||"".equals(search.trim())){
			map.put("search", null);
		}
		List<Function> allFuncs=userService.findAllFunc(map);
		return allFuncs;
	}
	@RequestMapping("userMsg.do")
	public String mappingUserMsg(HttpServletRequest req,HttpServletResponse resp){
		Map<String, String> params=new HashMap<String, String>();
		params.put("page", "1");
		params.put("search", null);
		List<UserSession> allUsers=userService.findAll(params);
		req.setAttribute("allUsers", allUsers);
		return "user";
	}
	@RequestMapping("userData.do")
	@ResponseBody
	public List<UserSession> mappingUserData(@RequestBody Map<String, String> map,HttpServletRequest req,HttpServletResponse resp){
		String search=map.get("search");
		if(search==null||"".equals(search.trim())){
			map.put("search", null);
		}
		List<UserSession> allUsers=userService.findAll(map);
		return allUsers;
	}
}
