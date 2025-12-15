package Problem;

public class Producer extends Thread{
    Company c;
    Producer (Company c){
        this.c=c;
    }

    public void run(){
        for(int i=0 ; i<10 ; i++){

            try{
                this.c.Produce_item(i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
