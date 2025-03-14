class Operators{
    public static void main(String args[]){
	    //01.unaryOperator
        int a=12;
        int b=~a;
        System.out.println(b+"\n");
    
		//02.logicalOperators
		boolean q=true,k=false;
		boolean c=(q||k);
		System.out.println(c+"\n");
		
		//03.relationalOperator
		int d=10,e=20;
		boolean f=(d<e);
		System.out.println(f+"\n");
		
		//04.asignmentOperator
		long g=100L;//Simple assignment
		g+=50;//Compound assignment
		System.out.println(g+"\n");
		
		//05.ternaryOperator
		short i=56,j=92,max;
		max=(i>j)?i:j;
		System.out.println(max);
	}
}