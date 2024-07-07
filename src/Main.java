import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen yapmak istediğiniz işlemi seçiniz: \n");
        System.out.println("1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme \n");
        int seçiniz = scanner.nextInt();
        System.out.println("lutfen işlemi yapmak istedıgınız sayıları sırasıyla gırınız:");
        float girdi1 =scanner.nextFloat();
        float girdi2 = scanner.nextFloat();
        float sonuc = 0;

        switch(seçiniz){

            case 1:
                sonuc = girdi1 +girdi2;
                break;
            case 2:
                sonuc = girdi1 - girdi2;
                break;
            case 3:
                sonuc = girdi1 * girdi2;
                break;
            case 4:
                if (girdi2 != 0) {
                    sonuc = girdi1 / girdi2;
                } else {
                    System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz.");
                    return;  // Early return to avoid printing the result
                }
            default:
                System.out.println("TANIMSIZ İFADE !");
                break;

        }
        System.out.println("İşleminizin sonucu = " + sonuc);
    }
}