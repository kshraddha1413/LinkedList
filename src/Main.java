import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer c1=new Customer(25.0, "tim");
		Customer c2=c1;
		c2.setBalance(50.0);
		System.out.println("after change:"+c1.getBalance());
		ArrayList<Integer> arrlist = new ArrayList<Integer>(); 

	    // use add() method to add elements in the list 
	    arrlist.add(15); 
	    arrlist.add(20); 
	    arrlist.add(25); 

	    // prints all the elements available in list 
	    for (Integer number : arrlist) { 
	        System.out.println("Number = " + number); 
		
		
	    } 
	    arrlist.add(1, 13);
	    for (Integer number : arrlist) { 
	        System.out.println("Number = " + number); 
		
		
	    } 
	    


	}

}
