package codingTest;

public class Trio {

	public static void main(String[] args) {
		//삼총사 배열
		int [] trio1 = {-2, 3, 0, 2, -5};
		System.out.println("trio1의 삼총사 : "+ getTrioNum(trio1));
		
		int [] trio2 = {-3, -2, -1, 0, 1, 2, 3};
		System.out.println("trio2의 삼총사 : "+ getTrioNum(trio2));
		
		int [] trio3 = {-1, 1, -1, 1};
		System.out.println("trio3의 삼총사 : "+ getTrioNum(trio3));
		
		
		

	}
	
	public static int getTrioNum(int[] number) {
		int cnt = 0;
		for(int i1 = 0; i1<number.length-2; i1++) {
			for(int i2 = i1+1; i2<number.length-1; i2++) {
				for(int i3 = i2+1; i3<number.length; i3++) {
					if((number[i1] + number[i2] + number[i3]) == 0) {
						cnt++;
					}
						
				}
			}
		}
		
		return cnt;
	}

}
