import java.util.Scanner;
public class Kreuzprodukt {
    public static void main(String[] args){
        int num1, num2, num3, num4, num5, num6, k1, k2, k3;
        String ab;


        Scanner sc = new Scanner(System.in);

        do {


            System.out.print("Gib die x1 Koordinate des ersten Vektors an: ");
            num1 = sc.nextInt();

            System.out.print("Gib die x2 Koordinate des ersten Vektors an: ");
            num2 = sc.nextInt();

            System.out.print("Gib die x3 Koordinate des ersten Vektors an: ");
            num3 = sc.nextInt();

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println("So richtig?:(j/n)");
            ab = sc.next();
            //mögliche if-Abfrage, falls ja dann weiter zum zweiten Vektor.
            //Falls nein, erneute Eingabe des ersten Vektors.

        }while (ab.equalsIgnoreCase("n"));

        if (ab.equalsIgnoreCase("j"))
            do {
                System.out.print("Gib die x1 Koordinate des zweiten Vektors an: ");
                num4 = sc.nextInt();

                System.out.print("Gib die x2 Koordinate des zweiten Vektors an: ");
                num5 = sc.nextInt();

                System.out.print("Gib die x3 Koordinate des zweiten Vektors an: ");
                num6 = sc.nextInt();

                //System.out.println(num4);
                //System.out.println(num5);
                //System.out.println(num6);
                //System.out.println("So richtig?:(ja/nein)");
                //mögliche if-Abfrage, falls ja dann weiter zur Rechnung.
                //Falls nein, erneute Eingabe des zweiten Vektors.
                k1 = num2*num6-num3*num5;
                k2 = num3*num4-num1*num6;
                k3 = num1*num5-num2*num4;

                System.out.println("Das Kreuzprodukt der beiden Vektoren ist: ("+k1+"|"+k2+"|"+k3+")");
            } while (ab.equalsIgnoreCase("n"));


        else {
            System.out.println("du kek sollst nen passenden Buchstaben eingeben!");
        }
            //System.out.println("du kek sollst nen passenden Buchstaben eingeben!");

        //System.out.print("Gib die x1 Koordinate des zweiten Vektors an: ");
        //num4 = sc.nextInt();

        //System.out.print("Gib die x2 Koordinate des zweiten Vektors an: ");
        //num5 = sc.nextInt();

        //System.out.print("Gib die x3 Koordinate des zweiten Vektors an: ");
        //num6 = sc.nextInt();

        //System.out.println(num4);
        //System.out.println(num5);
        //System.out.println(num6);
        //System.out.println("So richtig?:(ja/nein)");
        //mögliche if-Abfrage, falls ja dann weiter zur Rechnung.
        //Falls nein, erneute Eingabe des zweiten Vektors.



        //k1 = num2*num6-num3*num5;
        //k2 = num3*num4-num1*num6;
        //k3 = num1*num5-num2*num4;

        //System.out.println("Das Kreuzprodukt der beiden Vektoren ist: ("+k1+"|"+k2+"|"+k3+")");
    }
}
