import java.util.Scanner;

public class Main {
    /**
     * @param args penjelasan
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi segilima: ");
        double sisi = input.nextDouble();

        double luas = hitungLuasSegilima(sisi);

        System.out.println("Luas segilima dengan sisi " + sisi + " adalah: " + luas);
    }

    public static double hitungLuasSegilima(double sisi) {
        // Formula luas segilima
        double luas = (5 * sisi * sisi) / (4 * Math.tan(Math.PI / 5));
        return luas;
    }
}
