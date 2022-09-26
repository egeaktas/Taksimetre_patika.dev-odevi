import java.util.Scanner;
public class Pratik4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, km_fiyat = 2.2, acilis = 10, tutar;
        System.out.println("kaç km gidildi: ");
        km = input.nextDouble();
        tutar = acilis + km*km_fiyat;
        if (tutar<20){
            tutar = 20;
        }

        System.out.print(tutar + " tl tuttu.");
    }
}