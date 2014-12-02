public abstract class Employee {
    
    protected String name;
    protected double rate;
    protected int hours;
    
    public static double LOW_RATE = 6.75;
    public static double HIGH_RATE = 30.50;
    public static int LOW_HOURS = 1;
    public static int HIGH_HOURS = 60;
    protected static double totalpay = 0;
    
    public Employee(){
        name = "";
        rate = 0;
        hours = 0;
    }
    
    public String getNameRules(){
        return "nonblank";
    }
    
    public String getRateRules(){
        return "Between " + LOW_RATE + " and " + HIGH_RATE + " , inclusive";
    }
    
    public static String getHoursRules() {
        return "between " + LOW_HOURS + " and " + HIGH_HOURS + "inclusive";
    }
    
    public static double getTotalPay(){
        return totalpay;
    }
    
    public boolean setName(String nm) {
	
        if (nm.equals(""))
            return false;
        
        else{
            name=nm;
	return true;}
     }
    
    public boolean setRate(double rt) {
    
        boolean rateok = (rt >=LOW_RATE && rt <=HIGH_RATE);
        
        if(rateok){
            rate=rt;
        return true;}
        
        else return false;}
    
    public boolean setHours(int hrs) {
    
        boolean hoursok = (hrs>=LOW_HOURS && hrs<=HIGH_HOURS);
     
        if (hoursok){
   
            hours=hrs;

            return true;}
            else return false;}
    
    public String getName() {
	
       return name;}

      
    public abstract double getPay();
    
}
