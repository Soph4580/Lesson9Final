public class PartTimeEmployee extends Employee {
    
    public PartTimeEmployee(){
        super();
    }
    
    public double getPay(){
        double emplpay = (rate*hours);
        totalpay+=emplpay;
        return emplpay;
    }
    
}
