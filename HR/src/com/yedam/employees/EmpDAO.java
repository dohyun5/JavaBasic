package com.yedam.employees;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO extends DAO{
	//java -> JDBC통해서 -> DB통해서 -> Employees Table에 접근
	//Employees 조회, 추가, 수정, 삭제(CRUD)
	
	//SingleTon
	private static EmpDAO empDao = null;
		//2. 객체 생성 [만들었지만 사용은 하지 못함]
	private EmpDAO() {
		//1. private로 객체 생성 막음 [클래스 내부에서만 사용가능]
	}
	
	public static EmpDAO getInstance() { //employeesTable에 접근할때 생성.
		if(empDao == null) {
			empDao = new EmpDAO();
		}
		return empDao;
	}//3.private로 막아둔것을 공개 해서 불러서 사용하도록
		//여러개 만들지 않고 하나 만든것을 계속 사용.
	
	//CRUD 
	
	//1.전체 조회
	//SELECT * FROM employees;
	//EmpDTO 객체 1개 = 1개의 row 
	//list -> EmpDTO  객체를 담아서 사용. -> 전체row를 조회.
	
	public List<EmpDTO> getEmployeesList(){
		//list, set, map
		//list -> 순서. 
		List<EmpDTO> list = new ArrayList<>();
		//list[0] ->첫번째 row
		//list[1] ->두번째 row ...
		EmpDTO emp = null;
		
		try {
			conn();
			String sql = "SELECT * FROM employees";
			//SELECT 문 사용시
			//1. statement => where 조건이 없으면 쓰기 편함.
			//"SELECT * FROM employees where hire_date" + data
			//2. preparedStatement => where 조건이 있어도 쓰기 편함
			
			stmt = conn.createStatement();//조회하기 위해 연결
			
			//SQL 실행
			
			rs = stmt.executeQuery(sql); // 
			
			//sql결과 조회
			//ResultSet -> next() - 다음 row가 존재하면 True, 없으면 False (사용하는 이유 : 데이터가 몇개인지 모르는 상황 while+ rs의 next() )
			while(rs.next()) {
				//서로 다른 row를 서로 다른 객체에 저장하기 위해서
				emp = new EmpDTO();
				
				emp.setEmployeeId(rs.getInt("employee_id")); //조회된 결과의 column명이 와야한다 DB에서 AS로 정의했다면 정의한 이름으로 가져와야 한다.
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				
				list.add(emp); 
					
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();//문제가 생기던 말던 접속해제 해줘야 한다. 
		}
		
		return list;
		
	}
	//2. 단건 조회
	
	public EmpDTO getEmployee(int employeeId) {
		EmpDTO emp = null;
		try {
			conn();
			
			String sql = "SELECT * FROM employees"
						+ " WHERE employee_id = ?"; 
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);//물음표 부분에 데이터(employeeId)를 넣으라는 문장
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				emp = new EmpDTO();
				
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setHireDate(rs.getDate("hire_date"));
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();//오류 추적해서 출력해달라
		}finally {
			disconn();
		}
		//emp == null -> rs.next() == false -> 데이터 조회 X
		//emp != null -> rs.next() == true -> 데이터 조회 O
 		return emp;
		
	}
	
	//3. 추가
	public int empAdd(EmpDTO emp) {
		//데이터 입력 후 제대로 들어갔는지 사용하기 위한 용도 (result)
		//1행이 입력되었습니다.
		//result = 1;
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO employees"
					+ "(employee_id, last_name, email, hire_date, job_id)"
					+ "VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);//쿼리문 넣어준다
			pstmt.setInt(1, emp.getEmployeeId()); //앞의 숫자는 위의 ? 의 순서
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			
			//DML 사용할 때 쓰는 메소드
			//반환 값이 1 또는 0 
			//1 : 데이터 정상 입력
			//2 : 데이터 입력 안됨
			result = pstmt.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
		
		
	}
	
	
	//4. 수정
	public int empUpdate(EmpDTO emp) {
		
		int result = 0;
		try {
			conn();
			String sql = "update employees set salary = ? where employee_id = ?";
			pstmt= conn.prepareStatement(sql);
			pstmt.setDouble(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return result;
	}
	
	
	//5. 삭제
	
	public int empDelete(int employeeId) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from employees where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			 
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
