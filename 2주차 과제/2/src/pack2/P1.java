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
	System.out.print("���� ���� �� �� �ϳ��� �Է��Ͻÿ�:  ");
	String user = sc.nextLine();
	System.out.print("��ǻ��: ");

	
	int userNum= (int)(Math.random()*10) + 1;
    if ((userNum == 1) || (userNum == 4) || (userNum == 7)) 
    	System.out.println("����");
    else if ((userNum == 2) || (userNum == 5) || (userNum ==8)) 
    	System.out.println("����");
    else if ((userNum == 3) || (userNum == 6) || (userNum ==9))
    	System.out.println("��");
   
	
    if (user.equals("����")) 
    	playNum = 1;
    	else if (user.equals("����"))
    		playNum = 2;
    		else if (user.equals("��"))
    			playNum = 3;

    switch (playNum) {
    case 1:
    	if ((userNum % 3) == 1)
    		System.out.println("�����ϴ�.");
    	else if ((userNum % 3) == 2) {
    		System.out.println("�����ϴ�.");
    	compScore++; }
    	else if ((userNum % 3) == 0) {
    		System.out.println("�̰���ϴ�.");
    	playerScore++; }
    	break;
    case 2:
    	if ((userNum % 3) == 1) {
    		System.out.println("�̰���ϴ�.");
    	playerScore++; }
    	else if ((userNum % 3) == 2)
    		System.out.println("�����ϴ�.");
    	else if ((userNum % 3) == 0) {
    		System.out.println("�����ϴ�.");
    	compScore++; }
    	break;
    case 3:
    	if ((userNum % 3) == 1) {
    		System.out.println("�����ϴ�.");
    	compScore++; }
    	else if ((userNum % 3)== 2) {
    		System.out.println("�̰���ϴ�.");
    	playerScore++; }
    	else if ((userNum % 3) == 0)
    		System.out.println("�����ϴ�.");
    	break;
    }
    System.out.println("��ǻ�Ϳ� ���� ���ھ�= " + compScore + ":" + playerScore );
    
}
	if(compScore > playerScore)
System.out.println("����� Computer!");
	else if (compScore < playerScore)
		System.out.println("����� User!");
	else System.out.println("��ǻ�Ϳ��� ��ῡ�� �����ϴ�!");
	}

}
