import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args){
        int heat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sicaklik değeri giriniz: ");
        heat = sc.nextInt();
        String res = heat < 5 ? "Kayak yapabilirsin.":heat>=5 && heat <=15 ? "sinemaya gidebilirsin.":heat > 15 && heat<=25?"piknik":"yüzme";
        System.out.println(res);
    }
}
