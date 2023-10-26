import java.util.*;

class Guesser{
	int guessNum;
	
	int guessNum() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Guesser guess the number");
	
			guessNum=sc.nextInt();
		
			return guessNum;
		
	}
}

class Player{
	int guessNum;
	
	int guessNum() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Player guess the number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g= new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayers() {
		Player p1= new Player();
		numFromPlayer1=p1.guessNum();
		
		Player p2= new Player();
		numFromPlayer2=p2.guessNum();
		
		Player p3= new Player();
		numFromPlayer3=p3.guessNum();
	}
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3) {
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2){
				System.out.println("Player 1 and player 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3){
				System.out.println("Player 1 and player 3 won the game");
			}
			else {
				System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2){
			 if(numFromGuesser==numFromPlayer3){
					System.out.println("Player 2 and player 3 won the game");
			 }
			 else {
				 System.out.println("Player 2 won the game");
			 }
			 
		}
		else if(numFromGuesser==numFromPlayer3){
			System.out.println("Player 3 won the game");
		}
		else {
			System.out.println("No one won");
		}
	}
	
}
public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total 4 will play the game, one guesser and 3 players.\nFirst guesser will give the number and then players will guess the number and \nwho guesses the same number as guesser that player will win.\n");
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
