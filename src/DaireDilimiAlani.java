import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        int r, angle;
        double pi = 3.14, area;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz:");
        r = inp.nextInt();
        System.out.print("Merkez Açısı Ölçüsünü Giriniz:");
        angle = inp.nextInt();

        area=(pi*(r*r)*angle)/360;
        System.out.println("Dairenin Alanı:"+ area);

    }
}
