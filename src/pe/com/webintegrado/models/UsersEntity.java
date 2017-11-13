package pe.com.webintegrado.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity {

    public UsersEntity() {
        super();
        setTableName("user");
    }

    public UsersEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

    public User findById(int id){
        return findByCriteria(
                String.format("WHERE id = %d",id)
        ).get(0);
    }

    public User findByLastName(String lastName){
        return findByCriteria(
                String.format("WHERE last_name = %s",lastName)
        ).get(0);
    }

    public List<User> findAll(){
        return findByCriteria("");
    }

    public List<User> findByCriteria(String criteria) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<User> users = new ArrayList<>();
            while(rs.next())
                users.add(User.from(rs));

            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public User create(User user){
        return executeUpdate(String.format(
                "INSERT INTO %s(id, first_name, last_name, telefono, address, email) " +
                        "VALUES(%d, '%s', '%s', %d, '%s', '%s')",
                getTableName(),
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getPhone(),
                user.getAddress(),
                user.getEmail()
        )) ? user : null;
    }

    private int getMaxId() {
        String sql = "SELECT MAX(id) AS max_id FROM user";
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            return resultSet.next() ?
                    resultSet.getInt("max_id") : 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public User create(String firstName,
                       String lastName,
                       int phone,
                       String address,
                       String email) {
        return create(
                getMaxId()+1,
                firstName,
                lastName,
                phone,
                address,
                email);
    }

    public User create(int id,
                       String firstName,
                       String lastName,
                       int phone,
                       String address,
                       String email) {
        return create(new User(
                id,
                firstName,
                lastName,
                phone,
                address,
                email));
    }
}
