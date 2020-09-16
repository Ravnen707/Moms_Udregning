import java.util.Scanner;

    public class Opg_Moms_Udregning {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Input pris der er købt for");
            double pris = input.nextDouble();

            double moms = pris * 0.06;
            System.out.println("Salgets skat er DKK" + (int) (moms * 100) / 100.0);
            plusTyskMoms(pris);
            plusDanskMoms(pris);
        }

        public static void plusTyskMoms(double pris) {

            pris = pris * 0.16;

            System.out.println("Tysk moms i DKK " + (int) (pris * 100) / 100.0);


        }

        public static void plusDanskMoms(double pris) {

            pris = pris * 0.25;

            System.out.println("Dansk moms i DKK " + (int) (pris * 100) / 100.0);
        }

    }
