public class Main {
    public static void main (String [] args){
      String[] name = {"Allan", "Judge"};
    Lecturer lect = new Lecturer("Allan", "454",434,30000,210, name);
    Lecturer lect2 = new Lecturer("Kennedy", "PUUE4",675,3000,270, name);
    Lecturer lect3 = new Lecturer("Bruno", "PHHL90",343,5655,120, name);
        lect.NetPay();
        System.out.println("");
        lect2.NetPay();
        System.out.println("");
        lect3.NetPay();
        System.out.println("\n");

       Cleaner clean = new Cleaner("Josphine", "494",41000,72,20, "Corridor");
        Cleaner clean1 = new Cleaner("Brian", "PNRB009",67095,36,20,"Office");
       Cleaner clean2 = new Cleaner("Antonet", "53PP",34983,10,20,"Classes");
        clean.NetPay();
        System.out.println("\n");
       clean1.NetPay();
        System.out.println("\n");
        clean2.NetPay();
    }

}
