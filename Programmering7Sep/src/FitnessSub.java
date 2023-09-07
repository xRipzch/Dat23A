//import Scanner

import java.util.Scanner;

//public class
public class FitnessSub {
    //main method
    public static void main(String[] args) {
        //define scanner
        Scanner in = new Scanner(System.in);
        //define variable
        boolean student = student(in);
        boolean pensionist = pensionist(in);
        int medlemskabLængde = medlemskabLængde(in);
        boolean fødselsdag = fødselsdag(in);
        boolean passiv = passiv(in);

        //define pris og tilkald methods
        double pris = run(student, pensionist, medlemskabLængde, fødselsdag, passiv);
        System.out.println("Din abonnementspris er: " + pris + " kr.");
    }

    //run metoder der tager alle inputs fra brugeren og regner medelskabs prisen ud
    public static double run(boolean student, boolean pensionist, int medlemskabLængde, boolean fødselsdag, boolean passiv) {
        int grundPris = 300;
        double rabat = 0.0;

        if (student) {
            rabat = 0.4;
        } else if (pensionist) {
            rabat = 0.2;
        }

        if (medlemskabLængde % 12 == 0) {
            rabat += 0.35;
        } else if (medlemskabLængde == 6) {
            rabat += 0.10;
        } else if (medlemskabLængde == 3) {
            rabat += 0.05;
        }

        if (fødselsdag) {
            rabat += 0.15;
        }

        if (passiv) {
            rabat = 0;
            grundPris = 25;
        }

        return grundPris - (grundPris * rabat);
    }

    //public static metode der tager input fra brugeren og retunere student-true/false
    public static boolean student(Scanner in) {
        System.out.println("Er du student? (JA/NEJ): ");
        return in.nextLine().equalsIgnoreCase("JA");
    }

    //public static metode der tager input fra brugeren og retunere pentionist-true/false
    public static boolean pensionist(Scanner in) {
        System.out.println("Er du pensionist? (JA/NEJ): ");
        return in.nextLine().equalsIgnoreCase("JA");
    }

    //public static metode der tager input fra brugern og retunere en int medlemskabLænge i måneder
    public static int medlemskabLængde(Scanner in) {
        System.out.println("Hvor mange måneder har du haft medlemsskab? (kun et tal fks. 12)");
        return in.nextInt();
    }

    //public static metode der tager input fra brugeren og retunere fødelsdag-true/false
    public static boolean fødselsdag(Scanner in) {
        System.out.println("Har du haft fødselsdag denne måned (JA/NEJ): ");
        in.nextLine(); // Scanner bug
        return in.nextLine().equalsIgnoreCase("JA");
    }

    //public static metode der tager input fra brugeren og retunere passiv-true/false
    public static boolean passiv(Scanner in) {
        System.out.println("Er dit abonnement passivt? (JA/NEJ): ");
        return in.nextLine().equalsIgnoreCase("JA");
    }
}