package TypesOfClasses.SingleTon.DoubleLock;

public class DbConnection {
    private static volatile DbConnection conObj;

    private DbConnection(){

    }

    public static DbConnection getInstance(){
        if (conObj == null){
            synchronized (DbConnection.class){
                if (conObj == null){
                    conObj = new DbConnection();
                }
            }
        }
        return conObj;
    }
}
