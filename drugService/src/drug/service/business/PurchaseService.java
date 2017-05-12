package drug.service.business;

import java.util.List;
import java.util.Map;

import drug.entity.BusinessVo;

public interface PurchaseService {

	public List<BusinessVo> findAll(Map<String, String> params);
	public String updatePurchase(Map<String, String> params);
}
