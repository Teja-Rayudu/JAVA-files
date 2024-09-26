
class Wrapper{
    public static void main(String args[]){
        Integer num1= new Integer(5);
        Integer num2=new Integer(5);
        Integer num3=Integer.valueOf(5);
        Integer num4=Integer.valueOf(5);
        boolean value1=(num1==num2);
        boolean value2=(num3==num4);
        System.out.println(value1);
        System.out.println(value2);
    }
}