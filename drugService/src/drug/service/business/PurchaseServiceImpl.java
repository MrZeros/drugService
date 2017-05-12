package drug.service.business;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.common.BAConst;
import drug.dao.business.PurchaseDao;
import drug.entity.BusinessVo;

@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseDao purchaseDao;
	
	public List<BusinessVo> findAll(Map<String, String> params) {
		return purchaseDao.findAll(params);
	}

	@Override
	public String updatePurchase(Map<String, String> params) {
		int n=purchaseDao.updatePurchase(params);
		if(n!=1)return BAConst.ERROR;
		return BAConst.SUCCESS;
	}

}
