class Test<Double,Integer>{
  double obj;
  int obj1;
  Test(double obj,int obj1){
    this.obj=obj;
    this.obj1=obj1;
  }
  public void getObject(){
    System.out.println(obj+" and "+obj1);
  }
}
class TestMain1{
public static void main(String[] args) {
    Test<String,Integer> sob= new Test<>(13.7,10);
   sob.getObject();
}
}