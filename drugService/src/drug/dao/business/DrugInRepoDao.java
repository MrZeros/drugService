package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.DrugInfo;

/**
 * 库存中药品信息
 * @author 11732
 *
 */
public interface DrugInRepoDao {
	
	public List<DrugInfo> findAll(Map<String, String> params);
}
