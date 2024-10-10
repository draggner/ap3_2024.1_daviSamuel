package unidade2.exercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscreveArquivoGigante {
  public static void main(String[] args) {

    String fileCSV = "livro.csv";

    String[] nomesAutores = { "ALVES G. S. D.", "ALVES G. G. J.", "ALVES C. G. J." };
    String[] titulosLivros = { "Capítulo I - The Three Dragon Hunters of Tagmar",
        "Capítulo II - Tagmar Dragon Land Slaughters", "Capítulo III - Dragon Abyss in the Deep Tagmar" };

    Random random = new Random();
    boolean append = false;

    try {
      BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(fileCSV, append));
      for (long control = 0; control <= 9871035L; control++) {
        long idLivro = control;
        String umAutor = nomesAutores[random.nextInt(nomesAutores.length)];
        String umTitulo = titulosLivros[random.nextInt(titulosLivros.length)];

        double preco = 10 + (500 - 50) * random.nextDouble();

        Livro livro = new Livro(idLivro, umAutor, umTitulo, preco);

        arquivoCSV.write(livro.toString());

        if (control % 100 == 0) {
          System.out.println("Progresso em: " + control + " Livros Escritos.");
        }
      }
      arquivoCSV.close();
    } catch (IOException error) {
      error.printStackTrace();
    }

    System.out.println("Encerrado!");
  }
}