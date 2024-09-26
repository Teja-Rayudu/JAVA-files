public class Twinprime {
    public static boolean Isprime(int n){
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        for(int i=2;i<=1000;i++){
            if(Isprime(i)){
                int j=i+2;
                if(Isprime(j)){
                    System.out.println(i+","+ j);
                }
            }
        }
    }
}

