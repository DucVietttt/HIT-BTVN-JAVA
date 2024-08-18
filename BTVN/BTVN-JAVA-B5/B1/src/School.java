import java.util.Scanner;
public class School {
    private String Name;
    private String Date;
    public School(){

    }
    Scanner sc=new Scanner(System.in);
    public School(String Tentruong,String Ngayvao){
        this.Name=Tentruong;
        this.Date=Ngayvao;
    }
    public String getName(){
        return Name;
    }
    public String getDate(){
        return Date;
    }
    public void setName(Scanner sc){
        this.Name=sc.nextLine();
    }
    public void setDate(Scanner sc){
        this.Date=sc.nextLine();
    }

}
