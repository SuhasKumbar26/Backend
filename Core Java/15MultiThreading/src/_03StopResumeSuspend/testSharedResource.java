package _03StopResumeSuspend;

public class testSharedResource {
    public static void main(String[] args) {
        SharedResource sharedResourceObj = new SharedResource(3);

        System.out.println("ReadWriteExample method is started");

        Thread th1 = new Thread(() -> {
            try {
                for (int i = 0; i < 6; i++) {
                    sharedResourceObj.produce(i);
                }
            } catch (Exception e){
                System.out.println("Error");
            }
        });

        Thread th2 = new Thread(() ->{
           try {
               for (int i = 0; i < 6; i++) {
                   sharedResourceObj.consumer();
               }
           } catch (Exception e){
               System.out.println("Error");
           }
        });

        th1.start();
        th2.start();
    }
}
