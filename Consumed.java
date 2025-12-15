package Problem;

public class Consumed extends  Thread{
    Company c;
    Consumed (Company c){
        this.c=c;
    }

    public void run(){
        for(int i=0 ; i<10 ; i++){
            try{
                this.c.Consumer_item();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
