package pack2;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerScore = 0;
		int compScore = 0;
		int playNum = 0;
		int n;
		
	for (n = 1; n <= 7; n++) {
		System.out.println("Stage " + n);
    Scanner sc = new Scanner (System.in);
	System.out.print("가위 바위 보 중 하나를 입력하시오:  ");
	String user = sc.nextLine();
	System.out.print("컴퓨터: ");

	
	int userNum= (int)(Math.random()*10) + 1;
    if ((userNum == 1) || (userNum == 4) || (userNum == 7)) 
    	System.out.println("가위");
    else if ((userNum == 2) || (userNum == 5) || (userNum ==8)) 
    	System.out.println("바위");
    else if ((userNum == 3) || (userNum == 6) || (userNum ==9))
    	System.out.println("보");
   
	
    if (user.equals("가위")) 
    	playNum = 1;
    	else if (user.equals("바위"))
    		playNum = 2;
    		else if (user.equals("보"))
    			playNum = 3;

    switch (playNum) {
    case 1:
    	if ((userNum % 3) == 1)
    		System.out.println("비겼습니다.");
    	else if ((userNum % 3) == 2) {
    		System.out.println("졌습니다.");
    	compScore++; }
    	else if ((userNum % 3) == 0) {
    		System.out.println("이겼습니다.");
    	playerScore++; }
    	break;
    case 2:
    	if ((userNum % 3) == 1) {
    		System.out.println("이겼습니다.");
    	playerScore++; }
    	else if ((userNum % 3) == 2)
    		System.out.println("비겼습니다.");
    	else if ((userNum % 3) == 0) {
    		System.out.println("졌습니다.");
    	compScore++; }
    	break;
    case 3:
    	if ((userNum % 3) == 1) {
    		System.out.println("졌습니다.");
    	compScore++; }
    	else if ((userNum % 3)== 2) {
    		System.out.println("이겼습니다.");
    	playerScore++; }
    	else if ((userNum % 3) == 0)
    		System.out.println("비겼습니다.");
    	break;
    }
    System.out.println("컴퓨터와 나의 스코어= " + compScore + ":" + playerScore );
    
}
	if(compScore > playerScore)
System.out.println("우승자 Computer!");
	else if (compScore < playerScore)
		System.out.println("우승자 User!");
	else System.out.println("컴퓨터와의 대결에서 비겼습니다!");
	}

}
