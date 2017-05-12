package drug.service.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.common.BAConst;
import drug.dao.user.UserDao;
import drug.entity.Function;
import drug.entity.RoleVo;
import drug.entity.UserSession;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public String login(UserSession user) {
		int count=userDao.login(user);
		if(count==0){
			return BAConst.ERROR;
		}
		return BAConst.SUCCESS;
	}
	/**
	 * 获取用户明细（权限）
	 */
	public void getUserDetail(UserSession user){
		String uid=user.getUser_id();
		List<String> roles=userDao.getRoles(uid);
		Map<Function,Map> perssions=getPermissions(roles);
		user.setRoles(roles);
		user.setFuncs(perssions);
		
	}
	/**
	 * 获取用户所有权限
	 */
	private Map<Function,Map> getPermissions(List<String> roles){
		Map<Function, Map> permissions=new HashMap<Function, Map>();
		for (String role : roles) {
			List<Function> pT1=userDao.getT1Permissions(role);
			for (Function t1 : pT1) {
				permissions.put(t1, new HashMap<Function, Map>());
			}
		}
		getMorePermissions(permissions);
		return permissions;
	}
	/**
	 * 获取子级权限
	 * @param permissions
	 */
	private void getMorePermissions(Map<Function, Map> map){
		if(map.size()==0)return;
		Set<Entry<Function, Map>> entrySet=map.entrySet();
		for (Entry<Function, Map> entry : entrySet){
			Function func=entry.getKey();
			Map second=entry.getValue();
			List<Function> childPermissions=userDao.getChildPermissions(func.getFunc_id());
			for (Function childPermission : childPermissions) {
				Map<Function, Map<Function, Map>> value=new HashMap<Function,Map<Function, Map>>();
				second.put(childPermission, value);
				getMorePermissions(second);
			}
		}
	}
	/**
	 * 获取用户的子集权限
	 */
	public String getUserNumLimit(String uid) {
		String status=userDao.getUserNumLimit(uid);
		if(status==null||"".equals(status.trim())){
			return "0";
		}
		return status;
	}
	@Override
	public List<UserSession> findAll(Map<String, String> params) {
		return userDao.findAll(params);
	}
	@Override
	public List<RoleVo> findAllRoles(Map<String, String> params) {
		return userDao.findAllRoles(params);
	}
	@Override
	public List<Function> findAllFunc(Map<String, String> params) {
		return userDao.findAllFunc(params);
	}

}
