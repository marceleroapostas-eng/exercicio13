import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
       
      Scanner leitor = new
            Scanner(System.in);
      
      double salario, prestacao;
      
      System.out.printf("Digite o salario bruto: ");
      salario = leitor.nextDouble();
      
      System.out.printf("Digite o valor da prestacao: ");
      prestacao = leitor.nextDouble();
      
      if (prestacao <= salario * 0.30){
      System.out.printf("Emprestimo pode ser concedido");
    } else {
    
            System.out.printf("Emprestimo nao pode ser concedido");
            }
          
          leitor.close();
      }
      
      
    }

