package back.exam05;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        // 마트 영수증 출력

        Scanner sc = new Scanner(System.in);

        String oneThingPrice = "";
        int totalPrice = 0;

        while (true) {
            System.out.println("상품명: ");
            String name = sc.nextLine();

            if (name.toLowerCase().equals("end")) {
                break;
            }

            System.out.println("해당 상품 가격: ");
            String price = sc.nextLine();

            System.out.println("해당 상품 구매 개수: ");
            String many = sc.nextLine();

            int namePrice = Integer.parseInt(price) * Integer.parseInt(many);

            String array = name + "," + price + "," + many + "," + namePrice;

            oneThingPrice = oneThingPrice + "/" + array;

            totalPrice = totalPrice + namePrice;
        }

        sc.close();

        oneThingPrice = oneThingPrice.substring(1);

        String[] array1 = oneThingPrice.split("/");

        for (int i = 0; i < array1.length; i++) {
            String[] array2 = array1[i].split(","); // {"aaa", "aaa", "aaa", "aaa"} {"bbb", .....
            System.out.println(array2[0] + "\t" + array2[1] + "\t" + array2[2] + "\t" + array2[3]);
        }

        System.out.println(" ========================== ");

        for (int i = 0; i < array1.length; i++) {

        }

        System.out.println("총 합계:      " + totalPrice);
    }

}
