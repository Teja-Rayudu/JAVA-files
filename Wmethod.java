public class Wmethod{
    public static void main(String[] args) {
        byte a=1;
        Byte byteobj=new Byte(a);

        int b=10;
        Integer intobj=new Integer(b);
        float c =18.6f;
        Float floatobj=new Float(c);

        double d=250.5;
        Double doubleobj=new Double(d);

        char e='a';
        Character charobj=new Character(e);

        short f=123;
        Short shortobj=new Short(f);

        long g=1234556778;
        Long longobj=new Long(g);
        System.out.println("Byte object byteobj="+byteobj);
        System.out.println("Integer object intobj="+intobj);
        System.out.println("Long object longobj="+longobj);
        System.out.println("Character object charobj="+charobj);
        byte bv=byteobj;
        int iv=intobj;
        float fv=floatobj;
        double dv=doubleobj;
        char cv=charobj;
        System.out.println("printing unwrapped values");
        System.out.println("byte:"+bv);
        System.out.println("int:"+iv);
        System.out.println("float:"+fv);
        System.out.println("double"+dv);
        System.out.println("char:"+cv);






    }
}