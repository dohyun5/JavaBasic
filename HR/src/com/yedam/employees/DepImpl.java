package com.yedam.employees;

import java.util.List;
import java.util.Scanner;

public class DepImpl {
	Scanner sc = new Scanner(System.in);
	
	//전체 조회
	public void getDepartmentsList() {
		List<DepDTO> list = DepDAO.getInstance().getDepartmentsList();
		
		for(int i=0; i<list.size();i++) {
			System.out.print("부서ID : " + list.get(i).getDepartmentId()+ "\t");
			System.out.print("부서이름 : " + list.get(i).getDepartmentName()+ "\t");
			System.out.print("매니저ID : " + list.get(i).getManagerId()+ "\t");
			System.out.print("지역ID : " + list.get(i).getLocationId()+ "\t");
			System.out.println();
		}
//		for(Member member : list) {  향상된for문 예시
//			System.out.print("부서ID : " + list.get(i).getDepartmentId()+ "\t");
//			System.out.print("부서이름 : " + list.get(i).getDepartmentName()+ "\t");
//			System.out.print("매니저ID : " + list.get(i).getManagerId()+ "\t");
//			System.out.print("지역ID : " + list.get(i).getLocationId()+ "\t");
//			System.out.println();
//		}
		
	}
	
	// 부서 정보 조회
	public void getDepartment() {
		System.out.println("조회할 부서 번호 입력 > ");
		int departmentId = Integer.parseInt(sc.nextLine());
		DepDTO dep = DepDAO.getInstance().getDepartments(departmentId);
		
		if(dep == null) {
			System.out.println("해당 부서는 존재하지 않습니다.");
		}else {
			System.out.print("부서ID : " + dep.getDepartmentId()+ "\t");
			System.out.print("부서이름 : " + dep.getDepartmentName()+ "\t");
			System.out.print("매니저ID : " + dep.getManagerId()+ "\t");
			System.out.print("지역ID : " + dep.getLocationId()+ "\t");
			System.out.println();
		}
		
		
	}
	
	//추가
	public void depAdd() {
		DepDTO dep = new DepDTO();
		System.out.println("부서 번호 > ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("부서 이름 > ");
		String depName = sc.nextLine();
		
		dep.setDepartmentId(depId);
		dep.setDepartmentName(depName);
		
		int result = DepDAO.getInstance().depAdd(dep);
		
		if(result == 1) {
			System.out.println("생성 성공");
		}else {
			System.out.println("생성 실패");
		}
		
	}
	
	//수정
	public void depUpdate() {
		System.out.println("부서 번호 > ");
		int depId = Integer.parseInt(sc.nextLine());
		System.out.println("매니저 ID > ");
		int depManagerId = Integer.parseInt(sc.nextLine());
		
		DepDTO dep = new DepDTO();
		dep.setDepartmentId(depId);
		dep.setManagerId(depManagerId);
		
		int result = DepDAO.getInstance().depUpdate(dep);
		if(result > 0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		
	}
	//삭제 
	public void depDelete() {
		System.out.println("삭제할 부서 번호 > ");
		int depId = Integer.parseInt(sc.nextLine());
		int result = DepDAO.getInstance().depDelete(depId);
		
		if(result > 0) {
			System.out.println("정상 삭제");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	
	
	
}
