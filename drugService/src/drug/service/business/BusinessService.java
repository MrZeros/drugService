package drug.service.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import drug.entity.BusinessVo;
import drug.entity.DrugInfo;

public interface BusinessService {

	public List<BusinessVo> findAll();
	
	public List<BusinessVo> findByStatus(Map<String,String> params);
	public String audit(Map<String, String> params);
}
