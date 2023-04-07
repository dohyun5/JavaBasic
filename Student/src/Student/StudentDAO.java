package Student;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StudentDAO extends DAO{
	
	private static StudentDAO stdDao = null;
	
	private StudentDAO() {
		
	}
	public static StudentDAO getInstance() {
		if(stdDao == null) {
			stdDao = new StudentDAO();
		}
		return stdDao;
	}
	
	public List<StudentDTO> getStudentList(){
		List<StudentDTO> list = new ArrayList<>();
		StudentDTO std = null;
		
		try {
			conn();
			String sql = "SELECT * FROM student";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				std = new StudentDTO();
				
				std.setStudentNo(rs.getInt("student_no"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentMajor(rs.getString("student_major"));
				std.setStudentScore(rs.getInt("student_score"));
				list.add(std);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	public int stdAdd(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "insert into student (student_no,student_name,student_major,student_score) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentNo());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentMajor());
			pstmt.setInt(4, std.getStudentScore());
			
			result = pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	public int stdUpdate(StudentDTO std) {
		int result = 0;
		
		try {
			conn();
			String sql = "update student set student_major = ? where student_no = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentMajor());
			pstmt.setInt(2, std.getStudentNo());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return result;
	}
	
	public int stdDelete(int studentId) {
		int result = 0;
		
		try {
			conn();
			String sql = "delete from student where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, studentId);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
