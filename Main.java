import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		runHanoi2(3);

	}
	
	public static void runHanoi(int n){
		runHanoi(n,'a','b','c');
	}
	
    public static void runHanoi(int n, char a, char b, char c){
		if(n==1){
			System.out.println("Move the top disk from "+ a + " to "+c);
		}else{
			runHanoi(n-1,a,c,b);
			runHanoi(1,a,b,c);
			runHanoi(n-1,b,a,c);
		}
		
	}
    
  //Implement Hanoi Towers using stacks
    
    public static void runHanoi2(int n){
		runHanoi2(n,'a','b','c');
	}
    
    public static void runHanoi2(int n, char x, char y, char z){
    	
    	Stack<Quad> stack=new Stack<Quad>();
    	stack.push(new Quad(n,x,y,z));
    	
    	while(!stack.isEmpty()){
    		Quad q=stack.pop();
    		if(q.n==1){
    			System.out.println("Move the top disk from "+ q.a + " to "+q.c);
    		}else{
    			stack.push(new Quad(q.n-1,q.b,q.a,q.c));
    			stack.push(new Quad(1,q.a,q.b,q.c));
    			stack.push(new Quad(q.n-1,q.a,q.c,q.b));
    			
    		}
    	}

    }

}
