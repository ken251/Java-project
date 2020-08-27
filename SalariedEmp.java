public class SalariedEmp extends Salary implements ManageWork {
    private final int min_num_Days = 200;
    private int DaysWorked;
    private int extradays;

    public SalariedEmp(String name, String add, int number, double salary, int DayWorked) {
        super(name, add, number, salary);
        setDaysWorked(DayWorked);
    }

    @Override
    public float ManageDuration(){
        extradays = getDaysWorked()-min_num_Days;
        return extradays;

    }

    public void setDaysWorked(int daySetter) {
        DaysWorked = daySetter;

    }
    public int getDaysWorked(){
        return DaysWorked;
    }


}
