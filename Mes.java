import java.util.Scanner ; 
public class Mes {  
    public static Scanner leia = new Scanner(System.in); 
    public static void main(String[] args){
        int mes;
        System.out.println("Digite um número:");
        
        num(mes=leia.nextInt());
    }

    public static void num(int mes){    

            switch (mes) {
            case 01:
            System.out.print("janeiro.");
                break;
            case 02:
            System.out.print("fevereiro.");
                break;
            case 03:
            System.out.print("março.");
                break;
            case 04:
             System.out.print("abril.");
                break;
            case 05:
            System.out.print("maio.");
                break;
            case 06:
            System.out.print("junho.");
                break;
            case 07:
            System.out.print("julho.");
                break;
            case 8:
            System.out.print("agosto.");
                break;
            case 9:
            System.out.print("setembro.");
                break;
            case 10:
            System.out.print("outubro.");
                break;
            case 11:
            System.out.print("novembro");
                break;
            case 12:
            System.out.print("dezembro.");
                break;
            default:
            System.out.println("Valor invalido.");
                break;
            }
    }
}

    