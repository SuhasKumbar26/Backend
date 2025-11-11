package TypesOfClasses.SingleTon.BillPughSolution;

public class DbConnection {

    private DbConnection(){

    }

    private static class DbConnectionHelper{
        private static final DbConnection connection = new DbConnection();
    }

    public static DbConnection getInstance(){
        return DbConnectionHelper.connection;
    }
}
