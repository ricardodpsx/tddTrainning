package hello;

/**
 * Created by ricardo.pacheco on 2/26/16.
 */
public class DataBaseConnection {

    public void connect() throws RuntimeException {

        slowStuffHappening();

        if(Math.random() < 0.5)
            throw new RuntimeException();
    }

    public void closeConnection() {

    }

    private void slowStuffHappening() {
        try{
            Thread.sleep(1000);
        } catch(Exception e) {

        }
    }


    public String[] query(String s) {

        String[] l = new String[]{
                "ricardo:pacheco:05/07/2016", "juan:perez:05/05/2016", "jhon:doe:05/05/2016",
                "someone:else:05/05/2016",
                "maria:cruz:05/05/2016", "mike:myers:05/05/2016", "leo:putz:06/05/2016"
        };

        return l;
    }

    public String getTableName() {
        slowStuffHappening();
        return "db.user";
    }



}
