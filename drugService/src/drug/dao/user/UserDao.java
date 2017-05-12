package drug.dao.user;

import java.util.List;
import java.util.Map;

import drug.entity.Function;
import drug.entity.RoleVo;
import drug.entity.UserSession;

public interface UserDao {
	public int login(UserSession userSession);
	/**
	 * 获取用户角色
	 * @param uid
	 * @return
	 */
	public List<String> getRoles(String uid);
	/**
	 * 获取T1级权限
	 * @param rid
	 * @return
	 */
	public List<Function> getT1Permissions(String rid);
	/**
	 * 获取子集权限
	 * @param fid
	 * @return
	 */
	public List<Function> getChildPermissions(String fid);
	/**
	 * 获取用户的数值权限
	 * @return
	 */
	public String getUserNumLimit(String uid);
	/**
	 * 获取所有用户信息
	 */
	public List<UserSession> findAll(Map<String, String> params);
	/**
	 * 
	 */
	public List<RoleVo> findAllRoles(Map<String,String> params);
	/**
	 * 
	 */
	public List<Function> findAllFunc(Map<String,String> params);
}
