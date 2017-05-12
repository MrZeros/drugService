package drug.service.business;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.dao.business.DrugInRepoDao;
import drug.entity.DrugInfo;

@Service("drugService")
public class DrugServiceImpl implements DrugService{

	@Autowired
	private DrugInRepoDao drugDao;
	
	public List<DrugInfo> findAllDrug(Map<String, String> params) {
		
		return drugDao.findAll(params);
	}

}
