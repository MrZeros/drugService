package drug.service.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.common.BAConst;
import drug.dao.business.BusinessDao;
import drug.entity.BusinessVo;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessDao businessDao;
	
	public List<BusinessVo> findAll() {
		return businessDao.findAll();
	}

	@Override
	public List<BusinessVo> findByStatus(Map<String,String> params) {
		return businessDao.findByStatus(params);
	}
	
	@Override
	public String audit(Map<String, String> params) {
		String status=params.get("status");
//		if("2".equals(status)){
			int n=businessDao.audit(params);
			if(n==1)return BAConst.SUCCESS;
//		}
		return BAConst.ERROR;
	}

}
