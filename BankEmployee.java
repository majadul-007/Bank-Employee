public class BankEmployee {
    private  String empName;
    private   String Id;
    private  double salary;
//    private

      public  BankEmployee(){

    }

    public BankEmployee(String  empName, String Id, double salary){
        this.empName = empName;
        this.Id = Id;
        this.salary = salary;

      }

    public  void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setId(String id) {
        Id = id;
    }

    public  void setSalary(double salary) {
        this.salary = salary;
    }
    public  String getEmpName(){
          return empName;
    }

    public String getId() {
        return Id;
    }

    public double getSalary() {
        return salary;
    }

    public   void showInfo(){
          System.out.println("Employe Name: " + empName);
          System.out.println("Employe Id: " + Id);
          System.out.println("Employe Salary: " + salary);

    }

}
