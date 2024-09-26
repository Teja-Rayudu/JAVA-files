class WorkingCarException extends Exception{
    public WorkingCarException(String message){
        super(message);
    }

    public String getmessage() {
        return null;
    }
}
class WorkingCar{
    String VIN;
    String brand;
    int year;
    double mileage;
    double price;
    public WorkingCar(String vin,String br,int yr,double mil,double pr) throws WorkingCarException{
        if(vin.length()!=4){
            throw new WorkingCarException("Invalid VIN:VIN must be four digits.");
        }
        if(br!="Ford"&& br!="Honda"&& br!="Toyota"&&br!="Chrylser"&&br!="Other"){
            throw new WorkingCarException("Invalid BRAND: BRAND must be Ford,Toyota,Chrylser or Other");
        }
        if(yr>1997||yr<=2017){
            throw new WorkingCarException("Ivalid YEAR:Year must be in between 1997 and 2017 inclusive");
        }
        if(mil<0){
            throw new WorkingCarException("Invalid MILEAGE: mileage must be in positive");
        }
        if(pr<0){
            throw new WorkingCarException("Invalid Price: Price cannot be in negative");
        }
        VIN=vin;
        brand=br;
       year=yr;
       mileage=mil;
       price=pr;
    }
    public String getVIN(){
     return VIN;
    }
    public String getbrand(){
        return brand;
    }
    public int getyear(){
        return year;
    }
    public double getmileage(){
        return mileage;
    }
    public double getprice(){
        return price;
    }
}
public class Try{
    public static void main(String[] args) {
        WorkingCar[] car =new WorkingCar[7];
        try{
            car[0]=new WorkingCar("1234","Ford",2004,13.6,250000);
            car[1]=new WorkingCar("1634","Honda",2004,63.6,28564);
            car[2]=new WorkingCar("1264","Toyota",2004,93.6,256353);
            car[3]=new WorkingCar("1454","Chrylser",2004,13.6,254573);
            car[4]=new WorkingCar("12354","Oh",2004,13.6,250475);
            car[5]=new WorkingCar("123467","Orchad",2004,15.0,250000);
            car[6]=new WorkingCar("123454","Teja",2004,18.6,250000);
        }
        catch(WorkingCarException E){
           System.out.println("Error:"+E.getmessage());
        }
        for(WorkingCar cars:car){
            if(cars!=null){
                System.out.println("VIN:"+cars.getVIN());
                System.out.println("Brand:"+cars.getbrand());
                System.out.println("Year:"+cars.getyear());
                System.out.println("Mileage:"+cars.getmileage());
                System.out.println("Price:"+cars.getmileage());
                System.out.println();
            }
        }
    }
}