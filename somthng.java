interface inface{
    final int a=10;
    void display();
}
class somthng implements inface{
    public void display(){
        System.out.println("VIT AP");
    }
    public static void main(String[] args) {
        somthng obj=new somthng();
        obj.display();
        System.out.println(obj.a);
    }
}