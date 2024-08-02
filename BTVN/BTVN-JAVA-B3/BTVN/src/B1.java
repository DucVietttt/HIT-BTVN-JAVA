import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class B1{
    public static final String S1="Square";
    public static final String S2="Triangle";
    public static final String S3="Circle";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();
         boolean KT1=S1.equals(name);
         boolean KT2=S2.equals(name);
         boolean KT3=S3.equals(name);
         if(KT1==true){
             int a=sc.nextInt();
             if(a<0){
                 System.out.printf("%f",-1);
             }
             else {
                 System.out.printf("%d", a * a);
             }
         }
         else if(KT2==true){
             int a=sc.nextInt();
             int b=sc.nextInt();
             int c=sc.nextInt();
             if(a+b<c || a+c<b || b+c<a || a<0 || b<0 || c<0){
                 System.out.print(-1);
             }
             else {
                 double p = ((a + b + c)*1.0)/2;
                 double DT = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
                 System.out.printf("%.2f", DT);
             }
         }
         else if(KT3==true){
             int r=sc.nextInt();
             if(r<0){
                 System.out.println(-1);
             }
             else {
                 double dt = Math.PI * Math.pow(r, 2);
                 System.out.printf("%.2f", dt);
             }
         }
         else{
             System.out.println("Hinh dang khong hop le!");
         }
    }
}
