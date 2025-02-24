package edu.kh.oarr.run;

import edu.kh.oarr.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1,"홍길동",19,'m',"01022223333","서울 잠실");
		emp[2] = new Employee(2,"강말순","교육부","강사",20,'f',1000000,0.01,"01011112222","서울 마곡");

		for(int i=0; i<emp.length; i++) {
			System.out.printf("emp[%d] : ",i);
			System.out.println(emp[i].information());
		}
		
		System.out.println();
		
		emp[0] = new Employee(0,"김말똥","영업부","팀장",30,'m',3000000,0.2,"01055559999","전라도 광주");
		emp[1] = new Employee(1,"홍길동","기획부","부장",19,'m',4000000,0.3,"01022223333","서울 잠실");
		
		for(int i=0; i<2; i++) {
			System.out.printf("emp[%d] : ",i);
			System.out.println(emp[i].information());
		}
		
		System.out.println();
		
		int sum=0;
		
		for(int i=0; i<emp.length; i++) {
			System.out.printf("%s의 연봉 : %d원\n",emp[i].getEmpName(),(int)(emp[i].getSalary()*12*(1+emp[i].getBonusPoint())));
			
			sum+=(int)(emp[i].getSalary()*12*(1+emp[i].getBonusPoint()));
		}
		
		System.out.println();
		System.out.printf("직원들의 평균 연봉 : %d원",sum/3);
		
	}

}
