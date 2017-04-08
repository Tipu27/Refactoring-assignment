package RefactoryDemoPacage;

public class RefactoryDemo {

	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		int count=0;
		//print banner
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");

		//calculate outstanding
		while (e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			count++;
		}

		// print details
		System.out.println("name: " + _name);
		Syatem.out.println("amount: " + outstanding);
		System.out.println("Count: " + count)
	}

}
