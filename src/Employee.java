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
    
    
}
