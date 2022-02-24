import javax.sound.sampled.Line;
import java.util.ArrayList;

public class Invoice {
    private Customer customer;
    private ArrayList<LineItem> lineItems;

    public Invoice(Customer customer, ArrayList<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public Invoice(Customer customer) {
        this.customer = customer;
        lineItems = new ArrayList<LineItem>();
    }

    public Invoice() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String print() {
        double totalDue = 0;

        StringBuilder ret = new StringBuilder();
        ret.append("                                    INVOICE\n\n");
        ret.append(customer.getAddress() + "\n\n");

        ret.append("====================================================================\n");
        ret.append("Item                         Quantity    Price       Total\n");

        for (LineItem li : lineItems) {
            totalDue += li.getLineTotal();

            ret.append(String.format("%-30s",li.getProduct().getDescription()));
            ret.append(String.format("%5d",li.getQuantity()));
            ret.append(String.format("%10.2f",li.getProduct().getBasePrice()));
            ret.append(String.format("%13.2f\n",li.getQuantity() * li.getProduct().getBasePrice()));
        }
        ret.append("====================================================================\n");
        ret.append("Amount Due: " + totalDue);

        return ret.toString();

    }

    public void addItem(LineItem li) {
        lineItems.add(li);
    }
}
