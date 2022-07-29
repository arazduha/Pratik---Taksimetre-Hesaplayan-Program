import java.util.Scanner;
public class test {
    public static void main(String[] args) {
      //değişkenler tanımlandı
      int km;
      double yol, a1= 2.20;
      // scanner tanımı yapıldı
      Scanner inp = new Scanner(System.in);
      //değer gir
      System.out.print("km mesafe gir= ");
      km = inp.nextInt();
      // km 2.20tl ile çarp ve ilk olarak 10 tl ile başla
      yol = (km * a1) + 10;
      //eğer değer 20 üstüyse olduğu gibi yaz değilse 20 yaz
      double sn = (yol>20) ? yol : 20;
      System.out.println("tutar=" + sn);
    }
}
