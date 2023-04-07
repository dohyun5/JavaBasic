package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepDAO extends DAO{
	private static DepDAO depDao = null;
	private DepDAO() {
		
	}
	public static DepDAO getInstance() {
		if(depDao == null) {
			depDao = new DepDAO();
		}
		return depDao;
	}
	
	//전체 조회
	public List<DepDTO> getDepartmentsList(){
		List<DepDTO> list = new ArrayList<>();
		
		DepDTO dep = null;
		
		try {
			conn();
			String sql = "SELECT * FROM departments";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dep = new DepDTO();
				
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				
				list.add(dep);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
		
	}
	// 부서 정보 조회
	public DepDTO getDepartments(int departmentId) {
		DepDTO dep = null;
		try {
			conn();
			String sql = "SELECT * FROM departments WHERE department_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dep = new DepDTO();
				
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return dep;
		
		
	}
	
	//추가 
	public int depAdd(DepDTO dep) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO departments"
						+"(department_id, department_name)"
						+"VALUES(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dep.getDepartmentId());
			pstmt.setString(2, dep.getDepartmentName());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
		
		
	}
	
	//수정
	public int depUpdate(DepDTO dep) {
		int result = 0;
		try {
			conn();
			String sql = "update departments set manager_id = ? where department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dep.getManagerId());
			pstmt.setInt(2, dep.getDepartmentId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//삭제 
	public int depDelete(int departmentId) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from departments where department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, departmentId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
	
	
	
	
	
	
}
