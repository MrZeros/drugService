package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.DrugInfo;

/**
 * �����ҩƷ��Ϣ
 * @author 11732
 *
 */
public interface DrugInRepoDao {
	
	public List<DrugInfo> findAll(Map<String, String> params);
}
