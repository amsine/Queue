import java.util.ArrayList;
import java.util.List;

public class KFCQueue {
    private int count;
    ArrayList<String> customerList = new ArrayList<String>();

    public boolean isEmpty() {
        if (count > 0) {
            return false;
        }
        return true;
    }

    public void enQueue(String customerName) {
        customerList.add(customerName);
        count++;
    }

    public int countQueue() {
        return count;
    }

//    public void deQueue(){
//        if(!isEmpty()){
//            customerList.remove(0);
//            count--;
//        }else{
//            System.out.print("");
//        }
//    }

    public String showQueueCustomer() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += customerList.get(i);
            if (i < count - 1)
                result += ",";
        }
        return result;
    }

    public void deQueue() {

        while (count > 1) {

            customerList.remove(0);
            count--;
        }
            System.out.print("Have Not Queue");
    }
}
