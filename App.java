package couleur.java;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class App {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Quelle couleur souhaitez-vous ? ");
        String couleur = clavier.nextLine();

        if (couleur.equals("b") || couleur.equals("B")) {
            System.out.println("Vous avez choisi le bleu");
        } else if (couleur.equals("v") || couleur.equals("V")) {
            System.out.println("Vous avez choisi le vert.");
        } else if (couleur.equals("r") || couleur.equals("R")) {
            System.out.println("Vous avez choisi le rouge.");
        } else {
            System.out.println("Connais pas.");
        }

        {

        }

    }

}
