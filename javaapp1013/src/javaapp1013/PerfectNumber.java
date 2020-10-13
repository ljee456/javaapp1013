package javaapp1013;

public class PerfectNumber {

	public static void main(String[] args) {
		//2~1000까지 완전수 개수 구하기
		//완전수:자기 자신을 제외한 약수의 합이 자기 자신과 동일한 수
		
		//1.완전수를 저장할 변수만들기
		int cnt = 0;
		
		//2.2~1000까지
		for(int su=2; su <=2000; su=su+1) {
			//약수의 합을 저장하기 위한 변수
			int sum = 1; //1은 모든 수의 약수이므로 미리 합을 구함
			//약수를 구하기 위해서
			for(int i=2; i<=su/2; i=i+1) {
				if(su % i ==0) {
					sum = sum + i;
				}
			}
			if(su == sum) {
				cnt=cnt+1;
				System.out.printf("완전 수: %d\n",su);
			}
		}
		
		System.out.printf("완전 수 개수: %d\n",cnt);


	}

}
