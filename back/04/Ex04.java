import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 직접 입력하여 값을 부여하는 것: Scanner 클래스를 이용
		
		Scanner sc = new Scanner(System.in);  // Scanner를 사용하기 위해 적어주어야 하는 부분
		
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();  // String: 문자열  // nextLine: Enter를 입력하기 전까지 입력한 내용을 변수에 담음
		// String name = sc.next();  // nextLine과 다르게 문자열 중간에 공백이 있다면 공백이 없는 첫 번째 단어 부분만 담음

		
		
		System.out.println("국어점수를 입력하세요: ");
		String kor_ = sc.nextLine();
		
		System.out.println("영어점수를 입력하세요: ");
		String eng_ = sc.nextLine();
		
		System.out.println("수학점수를 입력하세요: ");
		String mat_ = sc.nextLine();
		
		System.out.println(name + " / " + kor_ + " / " + eng_ + " / " + mat_);
		
		sc.close();  // Scanner 클래스 사용 종료
		
		
		// 입력 > 처리 > 출력
		// Interger: 괄호 안의 변수를 정수로 바꾸는 역할
		
		int kor = Integer.parseInt(kor_);  // 'kor_' 변수를 문자열에서 정수로 바꿈
		int eng = Integer.parseInt(eng_);
		int mat = Integer.parseInt(mat_);
		
		int total = kor + eng + mat;
		
		Double average = total / 3.0;
		
		if ( average >= 60 ) {
			System.out.println("축하드립니다, 평균 " + average + "점으로, 합격하셨습니다.");
		} else {
			System.out.println("평균 " + average + "점, 불합격입니다. 재시험 대상입니다.");
		}
		
		System.out.println("------ 프로그램 종료 ------");
	}

}
