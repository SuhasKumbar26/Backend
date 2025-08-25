package TypesOfClasses.SingleTon.EagerInitialization;

public class DbConnection {

    private static DbConnection conObj = new DbConnection();
    private DbConnection(){
    }

    public static DbConnection getInstance(){
        return conObj;
    }

}
