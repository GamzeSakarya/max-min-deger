import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int girilenSayi = 5;

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        int enKucukEnYakin = min;
        int enBuyukEnYakin = max;

        for (int eleman : list) {
            if (eleman < girilenSayi && girilenSayi - eleman < girilenSayi - enKucukEnYakin) {
                enKucukEnYakin = eleman;
            }
            if (eleman > girilenSayi && eleman - girilenSayi < enBuyukEnYakin - girilenSayi) {
                enBuyukEnYakin = eleman;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
    }
}
