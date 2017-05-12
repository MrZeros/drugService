package drug.service.business;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.dao.business.SalesDao;
import drug.entity.SaleVo;

@Service("saleService")
public class SaleServiceImpl implements SaleService{

	@Autowired
	private SalesDao saleDao;
	@Override
	public List<SaleVo> findAll(Map<String, String> params) {
		return saleDao.findAll(params);
	}

}
