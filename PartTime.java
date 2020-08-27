public class PartTime extends Employee  {
    private float hrs;
    private double hourRate;

    public PartTime(String name, String address, int number, float hrsWorked, double hourRate){
        super(name, address,number);
        setHrsWorked(hrsWorked);
        setRate(hourRate);
    }
    public void setHrsWorked(float __hourWork){
      hrs = __hourWork;
    }
    public void setRate(double rateWorkedAt){
        hourRate = rateWorkedAt;
    }
    public float getHours(){
      return hrs;
    }
    public double getRate(){
        return hourRate;
    }

    public void mailCheck(){
        System.out.println("Within mail check of Part time class");
        System.out.println("Monthly mail check for Number "+ getNumber() + " worked for " + getHours() + " hours at a rate of " + getRate() + " per hour");
    }
    public double computePay(){

        return hrs * hourRate ;
    }



}
