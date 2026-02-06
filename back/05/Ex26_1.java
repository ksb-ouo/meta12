
import java.util.Scanner;

public class Ex26_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        String info = "";

        while (true) {
            System.out.println("상품 이름: ");
            String productName = sc.nextLine();

            if (productName.toLowerCase().equals("q")) {
                break;
            }

            System.out.println("상품 가격: ");
            String productPrice_ = sc.nextLine();

            System.out.println("구매 수량: ");
            String buyCounter_ = sc.nextLine();

            int productPrice = Integer.parseInt(productPrice_);
            int buyCounter = Integer.parseInt(buyCounter_);
            int tot = productPrice * buyCounter;
            // int productPrice = Integer.parseInt(productPrice_) *
            // Integer.parseInt(buyCounter_);

            String temp = "";
            temp = productName;
            temp = temp + "," + productPrice;
            temp = temp + "," + buyCounter;
            temp = temp + "," + tot;
            temp = temp.substring(1);
            // == String temp = productName + "," + productPrice + "," + buyCounter + "," +
            // tot;

            if (info.equals("")) { // substring 불필요
                info = temp;
            } else {
                info = info + "/" + temp;
            }
            // == info = info + "/" + temp; // substring 필요

            total = total + tot;
            System.out.println(productName + "\t" + productPrice + "\t" + buyCounter + "\t" + total);
        }

        sc.close();

        String[] array1 = info.split("/");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i].replace(",", " ... "));
        }

        System.out.println("==================");
        System.out.println("합계: " + total + "원");

        System.out.println("-- 프로그램 종료 --");

    }

}
