class Games{
    
		int cricket;
		int footBall;
		
		public Games(int n,int m){
			cricket=n;
			footBall=m;
		}
		
		public void getGames(){
			System.out.println("Cricket : "+cricket+" footBall : "+footBall);
		}
}		

public class Main{
	public static void main(String args[]){
	
		Games g1=new Games(45,25);
		g1.getGames();
		Games g2=new Games(78,63);
		g2.getGames();
	}
}
	