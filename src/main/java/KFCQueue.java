import java.util.ArrayList;
import java.util.List;

public class KFCQueue {
    private int count;
    String customerList ="";

    public boolean isEmpty() {
        if (count > 0) {
            return false;
        }
        return true;
    }

    public void enQueue(String customerName) {
        customerList += customerName;
        count++;
    }

    public int countQueue() {
        return count;
    }


    public String showQueueCustomer() {

        return customerList;
    }
}
