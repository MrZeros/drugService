package drug;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import drug.common.DbUtil;

public class DrugTestCase {

	/**
	 * 测试连接
	 */
	@Test
	public void test() {
		String s="1";
		String[] ss=s.split(",");
		System.out.println(ss[0]);
	}
//	@Test
	/**
	 * 测试多层权限
	 */
	public void testPermission(){
		String uid="sa";
		Connection conn=DbUtil.getConnection();
		String sql="select role_id from db_user_role t where t.user_id=?";
		List<String> roles=new ArrayList<String>();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, uid);
			rs=ps.executeQuery();
			while(rs.next()){
				String role_id=rs.getString("role_id");
				roles.add(role_id);
			}
			getPerssion(roles);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.closeConnection(conn, ps, rs);
		}
	}
	public void getPerssion(List<String> roles){
		Map<String, Map> permissions=new HashMap<String, Map>();
		String sql="select func_id from db_role_func t where t.role_id=?";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=DbUtil.getConnection();
			ps=conn.prepareStatement(sql);
			for (String role : roles) {
				ps.setString(1, role);
				rs=ps.executeQuery();
				while(rs.next()){
					permissions.put(rs.getString("func_id"), new HashMap<String, Map>());
				}
			}
			getMorePession(permissions, conn);
			System.out.println(permissions);
			Set set=showPermission(permissions,"sys_manager");
			for (Object object : set) {
				System.out.println("二级权限为："+object);
			}
		} catch (Exception e) {
			
		}finally{
			DbUtil.closeConnection(conn, ps, rs);
		}
	}
	/**
	 * 根据已知权限，获取下级权限，如果无已知权限，则获取一级权限
	 * @param permissions
	 * @param index
	 */
	public Set showPermission(Map<String, Map> permissions,String index){
		if(index==null||"".equals(index.trim())){
			return permissions.keySet();
		}
		Map value=permissions.get(index);
		return showPermission(value, null);
	}
	/**
	 * 获取多层权限
	 * @param map
	 * @param conn
	 */
	public void getMorePession(Map map,Connection conn){
		if(map.size()==0)return;
		String sql="select * from db_func t where t.parent_func_id=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Set<Entry<String, Map>> entrySet=map.entrySet();
		try {
			ps=conn.prepareStatement(sql);
			for (Entry<String, Map> entry : entrySet) {
				String func_id=entry.getKey();
				Map second=entry.getValue();
				ps.setString(1, func_id);
				rs=ps.executeQuery();
				while(rs.next()){
					Map<String, Map<String, Map>> value=new HashMap<String,Map<String, Map>>();
					second.put(rs.getString("func_id"),value);
					getMorePession(second, conn);
				}
			}
		} catch (Exception e) {
		}finally{
			DbUtil.closeConnection(null, ps, rs);
		}
		
	}
}
