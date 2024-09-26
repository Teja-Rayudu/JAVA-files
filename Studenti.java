import java.util.*;
class Studenti{
    String name;
    int age;
    int gradeLevel;
    ArrayList<String> Subjects;
    int m1;
    int m2;
    int m3;
    public void set(String n){
        n=name;
    }
    public void setage(int ag){
        age=ag;
    }
    public void setgradeLevel(int gl){
          gradeLevel=gl;
    }
    public void setSubjects(ArrayList<String> sub){
        Subjects=sub;
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getgradelevel(){
        return gradeLevel;
    }
    public ArrayList<String> getSub(){
        return Subjects;
    }
    public void Average(int m1,int m2,int m3){
        System.out.println("The Average is:"+(m1+m2+m2)/3)
    }
}