package drug.dao.user;

import java.util.List;
import java.util.Map;

import drug.entity.Function;
import drug.entity.RoleVo;
import drug.entity.UserSession;

public interface UserDao {
	public int login(UserSession userSession);
	/**
	 * ��ȡ�û���ɫ
	 * @param uid
	 * @return
	 */
	public List<String> getRoles(String uid);
	/**
	 * ��ȡT1��Ȩ��
	 * @param rid
	 * @return
	 */
	public List<Function> getT1Permissions(String rid);
	/**
	 * ��ȡ�Ӽ�Ȩ��
	 * @param fid
	 * @return
	 */
	public List<Function> getChildPermissions(String fid);
	/**
	 * ��ȡ�û�����ֵȨ��
	 * @return
	 */
	public String getUserNumLimit(String uid);
	/**
	 * ��ȡ�����û���Ϣ
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
