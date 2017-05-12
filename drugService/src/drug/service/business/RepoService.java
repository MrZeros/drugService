package drug.service.business;

import java.util.List;
import java.util.Map;

import drug.entity.Repostory;

public interface RepoService {
	
	public List<Repostory> findAll(Map<String, String> params);
 }
