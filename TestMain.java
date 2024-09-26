class Test<String,Integer>{
      String obj;
      int obj1;
      Test(String obj,int obj1){
        this.obj=obj;
        this.obj1=obj1;
      }
      public void getObject(){
        System.out.println(obj+" and "+obj1);
      }
}
class TestMain{
    public static void main(String[] args) {
        Test<String,Integer> sob= new Test<>("VIT_AP",10);
       sob.getObject();
    }
}