package TypesOfClasses.SingleTon.LazyIntiallization;

public class DbConnection {

    private static DbConnection conObj;

    private DbConnection(){
    }

    public static DbConnection getInstance(){
        if(conObj == null){
            conObj = new DbConnection();
        }
        return conObj;
    }
}
