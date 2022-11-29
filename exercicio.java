package unifatecie;
import java.util.Scanner;
public class L10E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double gasosa=3.15;
        int tt=45;
        double quant;
        double capB=0;
        double vlr=0;
        boolean completo = false;
        // false = tanque incompleto
        // true = tanque completo
        System.out.println("Quantos litros de gasolina já tem dentro do seu tanque");
        quant=input.nextInt();
        
        do{
            capB += 0.5;
            System.out.println("Abastecendo... "+capB);
            if((quant + capB + 0.5)>tt){
            vlr = gasosa * capB;
            completo=true;
            }
        }while(completo==false);
        System.out.println("Quantidade de litros: "+capB);
        System.out.println("Valor total: R$"+vlr);
    }
}
