package TypesOfClasses.SingleTon.Synchronization;

public class DbConnection {
    private static DbConnection conObj;

    private DbConnection(){

    }

    synchronized public static DbConnection getInstance(){
        if (conObj == null){
            conObj = new DbConnection();
        }
        return conObj;
    }
}
