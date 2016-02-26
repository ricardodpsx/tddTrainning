package hello;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ricardo.pacheco on 2/26/16.
 */
public class UserDao {

    static DataBaseConnection db = new DataBaseConnection();

    String name, lastName;
    Date birthDate;

    public static ArrayList<UserDao> listUsers() {
        db.connect();
        String[] users = db.query("Select * from users");
        db.closeConnection();

        ArrayList<UserDao> lusers = new ArrayList<>();
        if(users != null)
        for(String s : users) {
            String[] parts = s.split(":");
            lusers.add(new UserDao(parts[0], parts[1], new Date(parts[2])));
        }

        return lusers;
    }

    public UserDao(String name, String lastName, Date date) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = date;
    }



    public int calculateAge() {
        return new Date().getYear() - birthDate.getYear();
    }

    public static String tableName() {
        return db.getTableName().split("\\.")[1];
    }

}
