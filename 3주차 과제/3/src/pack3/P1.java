package pack3;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int zero=0;
int first=1;
int sum;
int n;

for(n=0; n<=10; n++) {
	if(n ==0) 
		System.out.println("0번째 항의 피보나치 수열은 " + zero + "입니다.");
	
	else if (n == 1) 
		System.out.println("1번째 항의 피보나치 수열은 " + first + "입니다.");
	
	else {
		sum = zero + first;
		System.out.println(n + "번쩨 항의 피보나치 수열은 " + sum + "입니다.");
	zero=first;
	first=sum;
	}
	}

}
}