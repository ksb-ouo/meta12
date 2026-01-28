public class Ex03 {

    public static void main(String[] args) {

        // 세 점수의 평균이 60점 이상이면 합격, 아니면 불합격

        int kor = 90;
        int eng = 80;
        int mat = 70;
        // 각각의 점수 (국, 영, 수)

        int scores = (kor + eng + mat);
        // 총점

        double average = scores / 3.0;
        // 평균
        // scores가 int이므로, 결과를 double(소수점까지 보이도록)로 표현하기 위해 3을 3.0(double type)으로 적는다

        if (average >= 60) { // if문으로 평균이 60 이상일 경우, 미만일 경우를 나누기 위함
            System.out.println("평균 점수 " + average + "로, 합격입니다.");
        } else {
            System.out.println("평균 점수 " + average + "로, 불합격입니다. 다시 시험을 보세요.");
        }

        // 참고용

        // if (조건) {
        // 참일 경우
        // } else {
        // 거짓일 경우
        // }
    }

}