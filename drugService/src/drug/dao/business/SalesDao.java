package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.SaleVo;

/**
 * ÏúÊÛ±í
 * @author 11732
 *
 */
public interface SalesDao {

	public List<SaleVo> findAll(Map<String, String> params);
}
