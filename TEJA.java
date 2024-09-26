class Test<character,String>{
    char obj;
    String  obj1;
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
      Test<character,String> sob= new Test<>("y","Teja");
     sob.getObject();
  }
}