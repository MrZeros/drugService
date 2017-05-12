package drug.service.business;

import java.util.List;
import java.util.Map;

import drug.entity.DrugInfo;

public interface DrugService {
	
	public List<DrugInfo> findAllDrug(Map<String, String> params);
}
