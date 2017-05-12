package drug.dao.business;

import java.util.List;
import java.util.Map;

import drug.entity.Repostory;

/**
 * ≤÷ø‚–≈œ¢±Ì
 * @author 11732
 *
 */
public interface RepostoryDao {

	public List<Repostory> findAll(Map<String, String> params);
}
