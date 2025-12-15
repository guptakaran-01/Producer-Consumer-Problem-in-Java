package Problem;

public class Company {

    int item;
    boolean flag =false;

    public synchronized void  Produce_item(int i) throws InterruptedException{
        if(flag){
            wait();
        }
        this.item=i;
        flag=!flag;
        System.out.println("Produced : "+ item);
        notify();
    }

    public synchronized int Consumer_item() throws InterruptedException{
        if(!flag){
            wait();
        }
        System.out.println("Consumed : "+ this.item);
        flag=!flag;
        notify();
        return this.item;
    }
}
