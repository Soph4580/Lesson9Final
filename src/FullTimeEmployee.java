public class FullTimeEmployee extends Employee {
   
    public FullTimeEmployee (){
        super();
    }
    
    public double getPay(){
        double emplpay;
        
        if (hours>40)
            emplpay = (rate*40)+((rate*2)*(hours-40));
        else
            emplpay = (rate*hours);
        totalpay+=emplpay;
        return emplpay;
    }
}
