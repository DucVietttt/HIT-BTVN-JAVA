import java.util.Scanner;

public class B2 {
    public static void main(String[] args){
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        boolean KT=a.equals(b);
        if(KT){
            String Viethoa=a.toUpperCase();
            System.out.println(Viethoa);
        }
        else{
            String Vietthuong=a.toLowerCase();
            System.out.println(Vietthuong);
        }
    }

}
