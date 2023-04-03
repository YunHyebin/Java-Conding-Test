package codingTest;

public class ChickenCoupon {

	public static void main(String[] args) {
		int chicken = 1081;
		System.out.println("먹을 수 있는 치킨" + solution(chicken));

	}

	public static int solution(int chicken) {
		int count = 0;
		int remainCoupon = 0;
		int coupon = 0;
		int chickenAte = 0;
		while (chicken / 10 != 1) {
			chickenAte += (chicken/10);
			remainCoupon += (chicken % 10);
			if(remainCoupon / 10 ==1) {
				chicken += remainCoupon;
			}
			count += chickenAte;
		}
		return count;
	}

}
