package test;

public class MethodExample {
	public static void HighScore(String Name, int score)
	{
		if(score>=1000)
			System.out.println(Name+" got position 1");
		else if(score>=500 && score<1000)
			System.out.println(Name+" got position 2");
		else if(score>=100 && score<500)
			System.out.println(Name+" got position 3");
		else
			System.out.println(Name+" got position 4");
	}
	public static void main(String[] args) {
		String Name="Player 1";
		int score=100;
		HighScore(Name,score);
		
	}

}
