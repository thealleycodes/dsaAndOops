package Oops2;

class Employee
{
    private int salary;
    public String employeeName;
    public void setSalary(Integer i){
        salary = i;
    }
    public void setEmployeeName(String val){
        employeeName  = val;
    }
    public void getData(){
        System.out.println(salary+" "+ employeeName);
    }
}

public class lect2 {
    public static void main(String[] args) {
    Employee obj1 = new Employee();
    obj1.setSalary(123);
    obj1.setEmployeeName("raj");
    obj1.getData();

    Employee obj2 = new Employee();
    System.out.println(obj1.employeeName);
    System.out.println(obj2.employeeName);
    }

}
