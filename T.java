import java.util.*;
class T{
    public static void main(String[] args) {
        ArrayList<Integer> student = new ArrayList<>();
        student.add(4);
        student.add(6);
        student.add(9);
        student.add(6);
        student.add(5);
        student.add(0);
        student.add(6);
        Iterator<Integer> it = student.iterator();
        int totalmarks=0;
        while(it.hasNext()){
            totalmarks+=it.next();
        }
        double average = (totalmarks)/(student.size());
        System.out.println("The average of the Students in the List:"+ average);
    }
}