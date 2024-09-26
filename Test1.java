import java.util.*;
class Table{
    synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
            System.out.println("*****************");
        }
    }
}
class Mythread extends Thread{
    Table tab = new Table();
    int num;
    Mythread(Table tab,int num){
        this.tab=tab;
        this.num=num;
    }
    public void run(){
        tab.printTable(num);
    }
}
class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        


    }
}