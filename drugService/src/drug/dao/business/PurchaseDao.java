package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.BusinessVo;

/**
 * �ɹ���
 * @author 11732
 *
 */
public interface PurchaseDao {
	public List<BusinessVo> findAll(Map<String, String> params);
	public int updatePurchase(Map<String, String> params);
}
