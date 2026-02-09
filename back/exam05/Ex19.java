package back.exam05;

public class Ex19 {

    public static void main(String[] args) {
        String str1 = "뉴욕/파리/시드니/멜버른/런던/모스크바";

        String[] array = str1.split("/"); // / 를 기준으로 배열로 만든다 {'뉴욕', '파리', '시드니', '멜버른', '런던', '모스크바'}

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
