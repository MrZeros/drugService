package drug.service.business;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import drug.dao.business.RepostoryDao;
import drug.entity.Repostory;

@Service("repoService")
public class RepoServiceImpl implements RepoService {

	@Autowired
	private RepostoryDao repoDao;
	
	public List<Repostory> findAll(Map<String, String> params) {
		return repoDao.findAll(params);
	}

}
