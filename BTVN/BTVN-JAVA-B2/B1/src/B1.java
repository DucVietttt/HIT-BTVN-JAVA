import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class B1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Moi ban nhap ban kinh hinh tron: ");
    double r=sc.nextDouble();
    double pi=3.14;
    double DT=pi*r*r;
    double CV=2*pi*r;
    System.out.printf("%.3f %.3f",CV,DT);
    }
}