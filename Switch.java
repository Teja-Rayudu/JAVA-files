import java.util.*;
class Switch{
    /*public static void switchPairs(ArrayList<String> numbers){
        for(int i=0;i<numbers.size()-1;i+=2){
        String temp = numbers[0];
        numbers[0]=numbers[1];
        numbers[1]=temp;
    }*/
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("six");
        int max=
        numbers.removeAll(numbers);
        System.out.println(numbers);
        Iterator<String> it=numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}