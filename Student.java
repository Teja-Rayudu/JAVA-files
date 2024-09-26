
import java.io.DataInputStream;
class Student{
    private int rollno;
    private String name;
    DataInputStream dis = new DataInputStream(System.in);
    public void getrollno(){
        try{
            System.out.println("Enter rollno");
            rollno = Integer.parseInt(dis.readLine());
            System.out.println("Enter the name");
            name=dis.readLine();
        }
        catch(Exception e){
            
        }
    }
    void putrollno(){
            System.out.println("Roll no:"+rollno);
            System.out.println("Name:"+name);
        }
    
    
}
class marks extends Student{
    protected int m1,m2,m3;
    void getmarks(){
        try{
            System.out.println("Enter marks");
            m1=Integer.parseInt(dis.readLine());
            m2=Integer.parseInt(dis.readLine());
            m3=Integer.parseInt(dis.readLine());
        }
        catch(Exception e){
            
        }
    }
        void putmarks(){
            System.out.println("m1:"+m1);
            System.out.println("m2:"+m2);
            System.out.println("m3:"+m3);
        }
    
}
class results extends marks{
    void display(){
        int total = m1+m2+m3;
        System.out.println("The result is :"+ total);
    }
}
class Mdemo{
    public static void main(String args[]){
        results r=new results();
        r.getrollno();
        r.getmarks();
        r.putrollno();
        r.putmarks();
        r.display();
    }
}