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
		System.out.println("0��° ���� �Ǻ���ġ ������ " + zero + "�Դϴ�.");
	
	else if (n == 1) 
		System.out.println("1��° ���� �Ǻ���ġ ������ " + first + "�Դϴ�.");
	
	else {
		sum = zero + first;
		System.out.println(n + "���� ���� �Ǻ���ġ ������ " + sum + "�Դϴ�.");
	zero=first;
	first=sum;
	}
	}

}
}