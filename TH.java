public class TH extends Exception{
    public static void validate(int age) throws ArithmeticException {
        if(age<18){
            throw  new ArithmeticException("The Person is not eligible to vote");
        }
        else{
            System.out.println("The person is eligible to vote");
        }
    }
    public static void main(String[] args) {
            validate(13);
            System.out.println("rest of the code");
        }
}