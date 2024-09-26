import java.util.Scanner;
public class States{
   public static void main(String[] args) {
    String[] st=new String[8];
    st[0]="Assam";
    st[1]="Uttar Pradesh";
    st[2]="Maharastra";
    st[3]="Bihar";
    st[4]="Goa";
    st[5]="Jharkhand";
    st[6]="Haryana";
    st[7]="Gujarat";
    String[] cp=new String[8];
    cp[0]="Dispur";
    cp[1]="Lucknow";
    cp[2]="Mumbai";
    cp[3]="Patna";
    cp[4]="Panaji";
    cp[5]="Ranchi";
    cp[6]="Chhattisgarh";
    cp[7]="Gandhinagar";
   try{
    Scanner s=new Scanner(System.in);
    int ip=s.nextInt();
    String sa=st[ip];
    String ca=cp[ip];
    System.out.print("The Capital of "+sa+"is"+ca);
   }
   catch(ArrayIndexOutOfBoundsException e){
    System.out.println("error:"+ e);
   }
 }
}