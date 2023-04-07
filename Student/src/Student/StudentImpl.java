package Student;

import java.util.List;
import java.util.Scanner;

public class StudentImpl {
	
	Scanner sc = new Scanner(System.in);
	
	public void getStudentList() {
		List<StudentDTO> list = StudentDAO.getInstance().getStudentList();
		int sum = 0;
		for(int i=0;i<list.size();i++) {
			System.out.println("학번 : " + list.get(i).getStudentNo());
			System.out.println("이름 : " + list.get(i).getStudentName());
			System.out.println("전공 : " + list.get(i).getStudentMajor());
			System.out.println("점수 : " + list.get(i).getStudentScore());
			sum += list.get(i).getStudentScore();
		}
		System.out.println("=====총점=====");
		System.out.println(sum);
		System.out.println("=====평균=====");
		System.out.println((double)sum/list.size());
		
	}
	public void stdAdd() {
		StudentDTO std = new StudentDTO();
		
		System.out.println("학번 >");
		int stdNo = Integer.parseInt(sc.nextLine());
		System.out.println("이름 >");
		String stdName = sc.nextLine();
		System.out.println("전공 >");
		String stdMajor = sc.nextLine();
		System.out.println("점수 >");
		int stdScore = Integer.parseInt(sc.nextLine());
		
		std.setStudentNo(stdNo);
		
		
		
	}
	
	
	
	
}
