package hello;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by ricardo.pacheco on 2/26/16.
 */
public class TestUserDao {
    @Test
    public void superBasicExample() {
        UserDao testUser = new UserDao("TestName","TestLasName", new Date("05/06/2000"));

        /**
         *  This test achieves 100% coverage in the method calculateAge
         *  Does it mean that this is a good testing?
         */
        assertEquals(testUser.calculateAge(), 16);

    }

    @Test
    public void mockingAndStubbing() {
        DataBaseConnection g = mock(DataBaseConnection.class);

        /** Note how the db is Package scope, but We can access it here because our
         * UT are in the same scope as the tested class
         */
        UserDao.db = mock(DataBaseConnection.class);

        when(UserDao.db.getTableName())
                .thenReturn("sys.user");

        assertEquals("user", UserDao.tableName());


    }


    //Exceptions are information, We need to test the unhappy Paths.
    @Test(expected = RuntimeException.class)
    public void testingOverExceptions() {
        DataBaseConnection db= mock(DataBaseConnection.class);
        //when(s.println("Hello")).thenThrow(new PrinterException());
        doThrow(new RuntimeException()).when(db).connect();
        UserDao.db = db;

        db.connect();
    }

    //Sometimes It's important that that a method is called inside
    //Take care with over-whiteboxing
    @Test
    public void verityMethodCalls() {
        UserDao.db = mock(DataBaseConnection.class);

        UserDao.listUsers();

        //There are also way to verify that one method is called after other
        verify(UserDao.db, times(1)).connect();
        verify(UserDao.db, times(1)).closeConnection();

    }

}
