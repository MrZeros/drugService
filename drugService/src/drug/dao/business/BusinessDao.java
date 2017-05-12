package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.BusinessVo;

public interface BusinessDao {
	public List<BusinessVo> findAll();
	public List<BusinessVo> findByStatus(Map<String, String> params);
	public int audit(Map<String, String> params);
}
