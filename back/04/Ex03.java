public class Ex03 {

    public static void main(String[] args) {

        // 세 점수의 평균이 60점 이상이면 통과, 아니면 탈락

        int kor = 90;
        int eng = 80;
        int mat = 70;
        // 각각의 점수 (국, 영, 수)

        int scores = (kor + eng + mat);
        // 총점

        double average = scores / 3.0; // scores가 int기 때문에 double에 담기 위해서 3을 3.0(double type)으로 적는다
        // 평균

        if (average >= 60) {
            System.out.println("통과입니다.");
        } else {
            System.out.println("탈락입니다, 다시 시험을 보세요.");
        }

    }

}