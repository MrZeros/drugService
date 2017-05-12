package drug.service.user;

import java.util.List;
import java.util.Map;

import drug.entity.Function;
import drug.entity.RoleVo;
import drug.entity.UserSession;

public interface UserService {

	public String login(UserSession user);
	public void getUserDetail(UserSession user);
	public String getUserNumLimit(String uid);
	public List<UserSession> findAll(Map<String, String> params);
	public List<RoleVo> findAllRoles(Map<String, String> params);
	public List<Function> findAllFunc(Map<String, String> params);
}
