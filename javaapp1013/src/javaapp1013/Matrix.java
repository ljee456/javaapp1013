package javaapp1013;

public class Matrix {

	public static void main(String[] args) {
		//문자열 2차원 배열
		String[][] names = {
				{"케인","알리","손흥민"},{"시소코","요리스","라멜라"}
		};
		//행의 순회
/*		for(int i=0; i<names.length; i=i+1) {
			//열의 순회
			for(int j=0; j<names[i].length; j=j+1) {
				System.out.printf("%-10s",names[i][j]);
			}
			System.out.printf("\n");
		}
*/

		//빠른 열거 이용
		//배열의 배열이므로 처음에는 배열에 저장하고
/*		for(String[] temp : names) {
			//그 배열을 다시 순서대로 순회
			for(String ipa : temp) {
				System.out.printf("%10s",ipa);
			}
			System.out.printf("\n");
		}
*/	
		
		//일차원 배열을 이차원 배열 처럼 이용
		//이 구조는 실무에서도 많이 이용
		String [] player = {"케인","알리","손흥민","라멜라",
				"사네", "살라", "아놀드", "반다이크"};
		
		for(int i=0; i<player.length; i=i+1) {
			System.out.printf("%-15s",player[i]);
			if(i % 4 == 3) {
				System.out.printf("\n");
			}
		}
		
		
		
		
	}

}
