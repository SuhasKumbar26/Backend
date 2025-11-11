package _02ThreadLifeCycle.SharedResource;

public class TestSharedResources {
    public static void main(String[] args) {
        System.out.println("ReadWriteExample method is started ");
        SharedResource sharedResourceObject = new SharedResource();

        Thread producerThread = new Thread( () -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e){
                System.out.println("Thread slept to much");
            }
            sharedResourceObject.addItem();
        });

        Thread consumerThread = new Thread(sharedResourceObject::consumeItem);

        producerThread.start();
        consumerThread.start();
    }
}
