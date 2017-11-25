package pe.com.webintegrado.models;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseEntity {
    Connection connection;
    String tableName;

    public BaseEntity(Connection connection, String tableName) {
        this.connection = connection;
        this.tableName = tableName;
    }

    public BaseEntity() {
    }

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public BaseEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public String getBaseStatement() {
        return "SELECT * FROM ".concat(tableName).concat(" ");
    }

    public boolean executeUpdate(String sql) {
        try {
            int result = getConnection()
                    .createStatement()
                    .executeUpdate(sql);
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean excuteUpdateV2(int id,
                                  String description,
                                  java.sql.Date dateCreated,
                                  java.sql.Date dateDelivery,
                                  int autoShopId,
                                  int userId) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("INSERT INTO appointment(id, description, date_created, date_delivery, auto_shop_id, user_id) VALUES(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, 0);
            ps.setString(2, description);
            ps.setDate(3, dateCreated);
            ps.setDate(4, dateDelivery);
            ps.setInt(5, autoShopId);
            ps.setInt(6,3);

            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
