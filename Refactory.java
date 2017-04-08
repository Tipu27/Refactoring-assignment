package RefactoryDemoPacage;

public class RefactoryDemo3 {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		int count=0;
		//print banner
		printBanner();

		//calculate outstanding
		outstanding = calculateOutstanding(e, outstanding);

		// print details
		printDetails(outstanding);
	}
	private void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		Syatem.out.println("amount: " + outstanding);
		//System.out.println("Count: " + count)
	}
	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}
	private double calculateOutstanding(Enumeration e, double outstanding) {
		while (e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			//count++;
		}
		return outstanding;
	}
}
