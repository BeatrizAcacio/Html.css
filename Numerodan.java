import java.util.Scanner ;
public class Numerodan{
    public static Scanner leia = new Scanner(System.in); 
    public static void main(String []args){
        int num;
        System.out.println("digite um numero:");
        num=leia.nextInt();
        System.out.println(parImpar(num));
    }
    public static String parImpar(int num){
        if(num%2==0)
        {
            return "verdadeiro";
        }
        else
        {
            return "falso";
        }
    }

}