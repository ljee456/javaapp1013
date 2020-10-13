package javaapp1013;

public class ArreyTest {

	public static void main(String[] args) {
		//이름(문자열) 배열과 점수(정수 - int) 배열을 생성해서 데이터를 3개씩 삽입
		//이름은 배열을 생성할 때 바로 초기화를 할 것이고 점수는 배열을 생성한 후 값을 대입
		//배열의 데이터를 전부 접근해서 출력하기: 출력은 이름은 ???이고 점수는 ??점입니다
		
		//이름배열을 생성과 동시에 초기화
		String [] names = {"케인", "알리", "손흥민","로셀소","오리에"};
		
		//점수3개를 저장할 수 있는 배열을 만들고 값을 대입
		int [] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 7;
		score[3] = 18;
		score[4] = 24;
		
		//반복문을 사용하지 않고 인덱스만 이용해서 출력
		//System.out.printf("이름은 %s이고 점수는 %d입니다.\n",names[0],score[0]);
		//System.out.printf("이름은 %s이고 점수는 %d입니다.\n",names[1],score[1]);
		//System.out.printf("이름은 %s이고 점수는 %d입니다.\n",names[2],score[2]);
		
		//for를 사용
		//반복문을 사용하면 유지보수가 수월해진다
		//3이라고 배열의 데이터 개수를 설정하는 부분을 수정
		//배열의 속성으로 설정 이유:데이터가 변경이 되도 출력하는 부분을 수정 할 수 있다
		for(int i=0; i<names.length; i=i+1) {
			System.out.printf("이름은 %s이고 등번호는 %d입니다.\n",names[i],score[i]);
		}
		//.으로 접근하거나 [인덱스]로 데이터를 접근하게되면 메모리를 한 번 더 찾아가야 한다
		//반복문 등에서 동일한 데이터를 여러번 . 이나[인덱스]를 이용해서 찾아가면 비효율적이다
		//이런경우에는 이 데이터를 가까운 곳에 저장해두고 접근하는 것이 좋다
		int len = names.length;
		for(int i=0; i<len; i=i+1) {
			System.out.printf("이름은 %s\n",names[i]);
		}
		
		//빠른 열거를 이용한 names의 데이터 출력
		for(String name : names) {
			System.out.printf("이름은 %s\n",name);
		}
		
		
		
		
		
//		int i =0;		
//		String [] name1 = {"lee","jae"};
//		
//		double [] gm = new double[2];
//		gm[0] = 12.1;
//		gm[1] = 32.2;
		
		//while 사용
//		while(i <= 1) {
//			System.out.printf("이름은 %s이고 점수는 %3.1f입니다.\n",name1[i],gm[i]);
//			i=i+1;
//		}
	}

}
