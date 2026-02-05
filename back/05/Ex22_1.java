import java.util.Scanner;

public class Ex22_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("메모: ");
            String memo = sc.nextLine();

            if (msg == "") {
                msg = msg + memo;
            } else {
                msg = msg + ", " + memo;
            }
        }

        sc.close();

        // msg = msg.substring(1, msg.length());
        System.out.println("msg: " + msg);
    }

}