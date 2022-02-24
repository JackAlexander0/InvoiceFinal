public class Main {

    public static void main(String[] args) {
	    Invoice invoice = new Invoice(new Customer("Jack\n1st Line Here\n2nd Line Here\n"));


        invoice.addItem(new LineItem(1,new Product("Toaster",3.50)));
        invoice.addItem(new LineItem(4,new Product("Computer",1000)));
        invoice.addItem(new LineItem(2,new Product("TV",550)));

        System.out.println(invoice.print());
    }
}
