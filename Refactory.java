package RefactoryDemoPackage;

import RefactoryDemoPacage.Enumeration;
import RefactoryDemoPacage.MyCollection;
import RefactoryDemoPacage.Order;

public class RefactoryDemo2 {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		int count=0;
		//print banner
		printBanner();

		//calculate outstanding
		while (e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			count++;
		}

		// print details
		printDetails(outstanding, count);
	}
	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}
	private void printDetails(double outstanding, int count) {
		System.out.println("name: " + _name);
		Syatem.out.println("amount: " + outstanding);
		System.out.println("Count: " + count)
	}

}
