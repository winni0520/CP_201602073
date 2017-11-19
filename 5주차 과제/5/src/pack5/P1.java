package pack5;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[] = new int[10];
int k, max, min;
for(k = 0; k <= 9; k++)
	num[k] = (int)(Math.random()*100);
max = num[0];
for(k = 1; k <= 9; k++) 
	if (num[k]>max)
		max = num[k];
System.out.println("10개의 수 중 가장 큰 숫자: " + max); 
min = num[0];
for(k = 1; k <= 9; k++) 
	if (num[k]<min)
		min = num[k];
System.out.println("10개의 수 중 가장 작은 숫자: " + min); 
	}

}