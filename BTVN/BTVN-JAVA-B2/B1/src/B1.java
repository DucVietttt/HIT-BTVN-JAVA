import java.util.Scanner;
public class B1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble();
    double pi=3.14;
    double DT=pi*r*r;
    double CV=2*pi*r;
    System.out.printf("%.3f %.3f",CV,DT);
    }
}