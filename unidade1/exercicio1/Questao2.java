package unidade1.exercicio1;

import java.util.LinkedList;
import java.util.Random;

public class Questao2 {
  public static void main(String[] args) {
    
    LinkedList<Integer> listaNumerica = new LinkedList<>();
    for (int i = 0; i < 3; i++) {
      Random aleatorio = new Random();

      int temp = aleatorio.nextInt(10000);

      listaNumerica.add(temp);
    }
  
    //   ListaNumerica umaListaNumerica = new ListaNumerica();
    //   Random aleatorio = new Random();

    //   int numb = aleatorio.nextInt(umaListaNumerica.getValor());
      
    //   if (numb <= umaListaNumerica.getValor()) {
    //     System.out.println(numb);
    //     System.out.println(umaListaNumerica.getValor());
    //     umaListaNumerica.setValor(numb);
    //   }
    //   System.out.println("Passei aqui");
    // }
  }
}
