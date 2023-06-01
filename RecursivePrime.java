import java.util.Scanner;
public class RecursivePrime {
    static boolean Prime(int a, int i){
        if(a%i==0&&i<a)
            return false;
        else if(a<=0)
            return false;
        else if(i!=a){
            Prime(a,i+1);
        }


        return true;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int a=inp.nextInt();
        int i=2;
        if(Prime(a,i)==true)
            System.out.println("Asal sayıdır.");
        else
            System.out.println("Asal sayı değildir.");


    }
}
