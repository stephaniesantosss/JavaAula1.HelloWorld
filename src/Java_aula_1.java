import java.util.Scanner;

public class Java_aula_1 {
	
	public static void main (String args[]){
		
//      boolean valor = false;

		 

      //IF e ELSE para verdadeiro ou falso
//      if(valor == true) {
//      System.out.println("logica verdadeira");
//      
//      } else {
//          System.out.println("logica falsa");
//      }
//  }
      
      //estrutura de repetição WHILE de 1 até 10
//      int valor = 1;
//      while (valor < 10) {
//          valor++;
//          System.out.println(valor);
//          }
//      }
      
      //estrutura de repetição FOR de 1 até 10
//      for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//      }
      
      //Estrutura de condições CASE
      int dia = 3; //dia recebe valor (3)
      switch (dia) {
        case 1:
          System.out.println("Segunda");
          break;
        case 2:
          System.out.println("Terça");
          break;
        case 3: //como dia é 3 ele para nesse CASE e imprime quarta
          System.out.println("Quarta");
          break;
        case 4:
          System.out.println("Quinta");
          break;
        case 5:
          System.out.println("Sexta");
          break;
        case 6:
          System.out.println("Sabado");
          break;
        case 7:
          System.out.println("Domingo");
          break;
        default:
          System.out.println("Numero não corresponde a nenhum dia");
      }
  }
}