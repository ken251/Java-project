public class Cleaner  extends ParTimeEmp {
    private String Location_Assigned;
    public Cleaner(String names, String address, int number, float hrsWorked, double hourRate, String Location) {
        super(names, address, number, hrsWorked, hourRate);
        setLocation(Location);

    }
    public void setLocation(String Loc){
        Location_Assigned = Loc;
    }
    public String getLocation(){
        return Location_Assigned;
    }
    public void CleanerInfo(){
        System.out.println();
    }
    public void NetPay(){
        float days = ManageDuration();
        String bonus;
        if (days>0){
            bonus = "Yes";

        }
        else{
            bonus = "No";
        }
        System.out.print("Employee Name: "+ getName()+"\nEmployee Type: Part Time Cleaner\n" + "Monthly Wage: " );
        if(days > 0) {
            System.out.println((computePay() + (ManageDuration() * getRate())));
        }else{
            System.out.print((computePay()) + "\n");
        }
        System.out.print("Bonus: ");
        if(days> 0){
            System.out.print(+(( ManageDuration()*getRate()))+"\n");
        }
        else{
            System.out.println(0);
        }


        System.out.print("Remarks: ");
        if (bonus.equals("Yes")){
            System.out.print("Bonus won for extra "+ ManageDuration()+ " days worked" );
        }

        else if ( days<0){

                System.out.print("Warning! minimum number of hours not met by " + (days) * -1 + " hour(s)");

        }
        else{
            System.out.println("Exact number of hours met");
        }



    }

}
