class Employee
{
    public double calculatePay(String name,double salary)
    {
        return salary;
    }
    public double calculatePay(String name, double workingHours, double hourlyRate)
    {
        return workingHours*hourlyRate;
    }
}
public class Main {
    public static void main (String[] args){
        Employee ram = new Employee();
        System.out.println(ram.calculatePay("ram",10000.0));
        System.out.println(ram.calculatePay("ram", 45.5, 500.0));
    }
}