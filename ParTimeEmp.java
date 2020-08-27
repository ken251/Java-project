public class ParTimeEmp extends PartTime implements ManageWork {
    private static final int MinHours = 40;
    private float extraHours;
    public ParTimeEmp(String names, String address, int number, float hrsWorked, double hourRate){
        super(names, address, number,hrsWorked, hourRate);
    }
    public float ManageDuration(){

          extraHours = getHours() - MinHours;
          return extraHours;

     }

}
