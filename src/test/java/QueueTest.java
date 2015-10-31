import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
        KFCQueue queue = new KFCQueue();

    @Test
    public void isEmpty(){
        boolean expected = true;
        boolean actual = queue.isEmpty();
        assertEquals("Queue is not empty",expected,actual);
    }

    @Test
    public void isNotEmpty(){
        boolean expected = false;
        queue.enQueue("A");
        boolean actual = queue.isEmpty();
        assertEquals("Queue is Empty",expected,actual);
    }

    @Test
    public void whenHaveOneCustomerThenCallCountQueueReturnOne(){
        int expected = 1;
        queue.enQueue("A");
        int actual = queue.countQueue();
        assertEquals("Queue is not One Customer",expected,actual);
    }

    @Test
    public void whenHaveTwoCustomerThenCallCountQueueReturnTwo(){
        int expected = 2;
        queue.enQueue("A");
        queue.enQueue("B");
        int actual = queue.countQueue();
        assertEquals("Queue is not Two Customer",expected,actual);
    }

    @Test
    public void whenHaveThreeCustomerThenCallCountQueueReturnThree(){
        int expected = 3;
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        int actual = queue.countQueue();
        assertEquals("Queue is not Three Customer",expected,actual);
    }

    @Test
    public void whenPutCustomerAThenReturnA() {
        String expected = "A";
        queue.enQueue("A");
        String actual = queue.showQueueCustomer();
        assertEquals("Customer is not A",expected,actual);
    }

    @Test
     public void whenPutCustomerAAndBThenReturnAAndB() {
        String expected = "A,B";
        queue.enQueue("A");
        queue.enQueue("B");
        String actual = queue.showQueueCustomer();
        assertEquals("Customer is not A.B",expected,actual);
    }

    @Test
    public void whenCustomerHaveABThenDeQA() {
        String expected = "B";
        queue.enQueue("A");
        queue.enQueue("B");
        queue.deQueue();
        String actual = queue.showQueueCustomer();
        assertEquals("Customer is not A",expected,actual);
    }

    @Test
    public void whenCustomerHaveABCThenDeQA() {
        String expected = "C";
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.deQueue();
        String actual = queue.showQueueCustomer();
        assertEquals("Customer is not A",expected,actual);
    }

}
