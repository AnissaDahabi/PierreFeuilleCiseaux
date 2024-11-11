package PierreFeuilleCiseaux;
import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] pfc = {"pierre", "feuille", "ciseaux"};
            String tourOrdi = pfc[new Random().nextInt(pfc.length)];
            String tourJoueur;

            while (true) {
                System.out.println("Choisissez entre pierre, feuille et ciseaux : ");
                tourJoueur = scanner.nextLine().toLowerCase();

                if (tourJoueur.equals("pierre") || tourJoueur.equals("feuille") || tourJoueur.equals("ciseaux")) {
                    break;
                }
                System.out.println("Ce que vous avez écrit (" + tourJoueur + ") n'est pas valide.");
            }

            System.out.println("L'ordinateur a choisi: " + tourOrdi);

            if (tourJoueur.equals(tourOrdi)) {
                System.out.println("Egalité !");
            } else if (tourJoueur.equals("pierre")) {
                if (tourOrdi.equals("feuille")) {
                    System.out.println("Vous avez perdu!");
                } else if (tourOrdi.equals("ciseaux")) {
                    System.out.println("Vous avez gagné!");
                }
            } else if (tourJoueur.equals("feuille")) {
                if (tourOrdi.equals("pierre")) {
                    System.out.println("Vous avez gagné!");
                } else if (tourOrdi.equals("ciseaux")) {
                    System.out.println("Vous avez perdu!");
                }
            } else if (tourJoueur.equals("ciseaux")) {
                if (tourOrdi.equals("pierre")) {
                    System.out.println("Vous avez perdu!");
                } else if (tourOrdi.equals("feuille")) {
                    System.out.println("Vous avez gagné!");
                }
            }
            System.out.println("Souhaitez-vous rejouer? oui/non");
            String rejouer = scanner.nextLine().toLowerCase();
            if(!rejouer.equals("oui")){
                break;
            }
        }
    }
}
