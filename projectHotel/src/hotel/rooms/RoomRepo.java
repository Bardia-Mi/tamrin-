package hotel.rooms;

import hotel.view.CheckInForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;


    public RoomRepo() throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hotel", "myjava123");
        connection.setAutoCommit (false);
    }

    public void insert(RoomEnti roomEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("insert into rooms(id,code,roomnum,type,facilities,salary) values (?,?,?,?,?,?)");
        preparedStatement.setLong (1,roomEnti.getId());
        preparedStatement.setInt (2,roomEnti.getCode());
        preparedStatement.setInt (3,roomEnti.getNumber());
        preparedStatement.setString (4,roomEnti.getType());
        preparedStatement.setString (5,roomEnti.getFacilities());
        preparedStatement.setInt (6,roomEnti.getSalary());
        preparedStatement.executeUpdate ();
    }

    public void update (RoomEnti roomEnti) throws Exception{
        preparedStatement=connection.prepareStatement ("update rooms set code=?,roomnum=? , type =?, facilities=?, salary=? where id=? ");
        preparedStatement.setInt (1,roomEnti.getCode ());
        preparedStatement.setInt (2,roomEnti.getNumber ());
        preparedStatement.setString (3,roomEnti.getType ());
        preparedStatement.setString(4,roomEnti.getFacilities ());
        preparedStatement.setInt(5,roomEnti.getSalary ());
        preparedStatement.setLong (6,roomEnti.getId ());
        preparedStatement.executeUpdate ();
    }

    public void delete(long id) throws Exception{
        preparedStatement=connection.prepareStatement ("delete from rooms where id=?");
        preparedStatement.setLong (1,id);
        preparedStatement.executeUpdate ();
    }

    public List<RoomEnti> select() throws Exception{
        preparedStatement=connection.prepareStatement ("select * from rooms");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<RoomEnti> roomEntiList=new ArrayList<>();
        while (resultSet.next ()){
            RoomEnti roomEnti=new RoomEnti (); // call by reference
            roomEnti.setId (resultSet.getLong ("id"));
            roomEnti.setCode (resultSet.getInt ("code"));
            roomEnti.setNumber (resultSet.getInt ("number"));
            roomEnti.setType (resultSet.getString ("type"));
            roomEnti.setFacilities (resultSet.getString ("facilities"));
            roomEnti.setSalary (resultSet.getInt ("salary"));
            roomEntiList.add (roomEnti);
        }
        return roomEntiList;
    }


    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }
}
