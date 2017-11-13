package pe.com.webintegrado.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoShopsEntity extends BaseEntity {

    public AutoShopsEntity() {
        super();
        setTableName("auto_shop");
    }

    public AutoShopsEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

    public AutoShop findById(int id) {
        return findByCriteria(
                String.format("WHERE id = %d", id)).get(0);
    }

    public List<AutoShop> findByCriteria(String criteria) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<AutoShop> autoShops = new ArrayList<>();
            while(rs.next())
                autoShops.add(AutoShop.from(rs));

            return autoShops;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public AutoShop findByName(String name) {
        return findByCriteria(
                String.format("WHERE name = '%s'", name)).get(0);
    }

    public List<AutoShop> findAll() {
        return findByCriteria("");
    }
}
