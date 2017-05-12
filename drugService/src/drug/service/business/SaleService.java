package drug.service.business;

import java.util.List;
import java.util.Map;

import drug.entity.SaleVo;

public interface SaleService {

	public List<SaleVo> findAll(Map<String, String> params);

}
