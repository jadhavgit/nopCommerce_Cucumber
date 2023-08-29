package JavaPrograms;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.eid=101;
		emp.ename="John";
		emp.sal=80000.00;
		emp.deptno=10;
		emp.job="Manager";
		emp.display();
		
		Employee emp1=new Employee();
		emp1.eid=102;
		emp1.ename="David";
		emp1.sal=90000.00;
		emp1.deptno=11;
		emp1.job="Tester";
		emp1.display();

}
}