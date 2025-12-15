package Problem;

public class MainCP {
    public static void main(String[] args){
        Company c= new Company();
        Producer p=new Producer(c);
        Consumed t=new Consumed(c);

        p.start();
        t.start();
    }
}
