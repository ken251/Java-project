public class Lecturer extends SalariedEmp{
    private String[] courses;
    public Lecturer(String name, String add, int number, double salary, int DayWorked,String[]Course) {
        super(name, add, number, salary, DayWorked);
        setCourses(Course);
    }
    public void setCourses(String[]C){
        courses = C;
    }
    public String[] Course(){
        return courses;
    }
    public  void NetPay() {
        float days = ManageDuration();
        String bonus;
        if (days > 0) {
            bonus = "Yes";

        } else {
            bonus = "No";
        }
        System.out.print("Employee Name: " + getName() + "\nEmployee Type: Salaried Lecturer\n" + "Monthly Salary: ");
        if (days > 0) {
            System.out.print(Math.ceil((computePay() + ((ManageDuration() * getSalary())/20))) + "\n");
        } else {
            System.out.print((computePay())+"\n");
        }
        System.out.print("Bonus: ");
        if (days > 0) {
            System.out.print(((ManageDuration() * getSalary())/20) + "\n");
        } else {
            System.out.println(0);
        }


        System.out.print("Remarks: ");
        if (bonus.equals("Yes")) {
            System.out.println("Bonus won for extra " + ManageDuration() + " days worked");
        } else if (days < 0) {

            System.out.print("Warning! minimum number of days not met by " + (days) * -1 + " days(s)");

        } else {
            System.out.println("Exact number of days met");

        }


    }}
