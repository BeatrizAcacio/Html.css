import java.util.Scanner ;
public class Numero {  
    public static Scanner leia = new Scanner(System.in); 
    public static void main(String[] args){
        int Numero;
        System.out.println("Digite um número:");
        
        num(Numero=leia.nextInt());
    }

    public static void num(int Numero){   

        if(Numero % 2==0){
           System.out.println( "Par.");
        }else{
            System.out.println( "Ímpar.");
        }

        }
        }