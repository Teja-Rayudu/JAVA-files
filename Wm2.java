
class Wm2{
    public static void main(String[] args) {
        Integer I=Integer.valueOf("10");
        System.out.println(I);
        Double D=Double.valueOf("10.0");
        System.out.println(D);
        Boolean B =Boolean.valueOf("true");
        System.out.println(B);
        Byte BT=Byte.valueOf("3");
        System.out.println(BT);
        int num=Integer.parseInt("10");
        float flt=Float.parseFloat("10.2366664");
        double dl=Double.parseDouble("2.398754337884");
        byte bt=Byte.parseByte("2");
        boolean bo=Boolean.parseBoolean("true");
        System.out.println("Integer value="+num);
        System.out.println("float value="+flt);
        System.out.println("double value="+dl);
        System.out.println("byte valute="+bt);
        System.out.println("boolean value="+bo);

        Integer num1= new Integer(10);
        String str=num1.toString();
        System.out.println(str);



    }
}