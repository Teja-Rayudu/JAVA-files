class UserDefinedException extends Exception{
    public UserDefinedException(String st){
        super(st);
    }
}
public class Testthrow3{
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("this is user defined function");
        }
        catch(UserDefinedException us){
            System.out.println("caught the exception");
            System.out.println(us.getMessage());
        }
    }
}