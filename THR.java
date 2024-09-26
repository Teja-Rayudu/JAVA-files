class THR{
    static void method() throws ArithmeticException{
        System.out.println("Inside the method()");
        throw new  ArithmeticException("throw arithmetic Exception ");
    }
   public static void main(String[] args){
    try{
        method();
    }
    catch(ArithmeticException e){
        System.out.println("Error"+e);
    }
   }
}