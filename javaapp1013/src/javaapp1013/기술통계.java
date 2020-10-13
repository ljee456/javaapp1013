package javaapp1013;

public class 기술통계 {

	public static void main(String[] args) {
		//이름 배열 만들기
		String [] names = {"서울","대전","대구","부산","광주","울산"};
		
		//정수 배열 만들기
		int [] scores = {92, 53, 91, 64, 33, 96};
		
		//90점이 넘는 데이터의 합계와 개수 그리고 평균을 구하기
		//평균은 소수 첫쨰자리까지 구하기 - 소수 둘째 자리에서 반올림
		
		//합계를 저장할 변수와 개수를 구할 변수를 생성
		int sum =0;
		int cnt =0;
		
		//배열 순회
		for(int score : scores) {
			//90이 넘는 데이터를 만나면 score는 sum에추가
			//개수는 1씩 증가
			if(score > 90) {
				sum = sum + score;
				cnt = cnt + 1;
			}
		}
		//합계와 개수 출력
		System.out.printf("90이 넘는 합계:%d\n",sum);
		System.out.printf("90이 넘는 개수:%d\n",cnt);
		
		//평균
		//나누기를 할 때는 나누는 수가 0인지 확인하고 작업
		if(cnt == 0) {
			System.out.printf("조건에 맞는 데이터가 없습니다.\n");
		}else {
			//소수 부분을 구하기 위해서 sum을 double로 형변환해서 수행
			double avg = (double)sum / cnt;
			//소수 2째 자리에서 반올림해서 출력하기 위해서
			//실수 출력 형식을 .1f로 설정(.1은  소수 첫쨰 자리 .2는 소수 둘쨰자리)
			System.out.printf("90이 넘는 데이터 평균:%.1f\n",avg);
		}
		//최대값과 최소값 구하기
		//최대값을 저장할 변수를 생성 - 아주 작은 값이나 배열의 첫번째 값으로 초기화
		int max = 0;
		//최소값을 저장할 변수를 생성 - 아주 큰 값이나 배열의 첫번째 값으로 초기화
		int min = 100;
		//배열을 순회하면서 max나 min보다 큰 값이나 작은 값을 만나면 그 값으로 교체
		for(int score : scores) {
			//최대값
			if(max < score) {
				max = score;
			}
			//최소값
			if(min > score) {
				min = score;
			}
		}
		System.out.printf("최대값: %d\n",max);
		System.out.printf("최소값: %d\n",min);
		
		
		
		
		
		
		
		
	}

}
