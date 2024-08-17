package unidade1.exercicio1;

import java.util.Scanner;
import unidade1.exercicio1.Questao1;

/**
 * Class Coodernadas
 * 
 * 
 * Este programa demonstra a inicialização de inserir valores de coordenadas especificas para descobrir a distância e amplitude.
 * 
 * @author Davi Samuel G. A.
 * @version 1.1
 * @since 2024-08-17
 * 
 * COD: 695686780
*/

public class Coodernadas {
  public static void main(String[] args) {
    
    Questao1 umQuestao1 = new Questao1();
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe as Coordenadas de X e Y nesta respectiva ordem: ");

    System.out.println("Valor de X1: ");
    double x1 = teclado.nextDouble();
    umQuestao1.setX1(x1);
    System.out.println(umQuestao1.getX1());

    System.out.println("Valor de X2: ");
    double x2 = teclado.nextDouble();
    umQuestao1.setX2(x2);
    System.out.println(umQuestao1.getX2());

    System.out.println("Valor de Y1: ");
    double y1 = teclado.nextDouble();
    umQuestao1.setY1(y1);
    System.out.println(umQuestao1.getY1());

    System.out.println("Valor de Y2: ");
    double y2 = teclado.nextDouble();
    umQuestao1.setY2(y2);
    System.out.println(umQuestao1.getY2());

    double distancia = umQuestao1.distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    umQuestao1.setDistancia(distancia);
    System.out.println("Valor Total da Distância: " + umQuestao1.getDistancia());

    // Dar continuidade a parti daqui

    teclado.close();
  }
}
