import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter Principal amount: 2500");
        double principal = 2500;
        System.out.print("Enter Rate of interest: 5 ");
        double rate = 5;
        System.out.print("Enter Time (in years): 4 ");
        double time = 4;
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
        sc.close();
    } 
}
