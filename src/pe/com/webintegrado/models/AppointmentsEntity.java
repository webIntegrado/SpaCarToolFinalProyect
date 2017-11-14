package pe.com.webintegrado.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentsEntity extends BaseEntity {

    public AppointmentsEntity() {
        super();
        setTableName("appointment");
    }

    public AppointmentsEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

    public Appointment findById(int id,
                                UsersEntity usersEntity,
                                AutoShopsEntity autoShopsEntity) {
        return findByCriteria(
                String.format("WHERE id = %d", id), usersEntity,autoShopsEntity).get(0);
    }

    public List<Appointment> findAllByUserId(int userId,
                                UsersEntity usersEntity,
                                AutoShopsEntity autoShopsEntity) {
        return findByCriteria(
                String.format("WHERE user_id = %d", userId), usersEntity,autoShopsEntity);
    }

    public List<Appointment> findByCriteria(String criteria,
                                            UsersEntity usersEntity,
                                            AutoShopsEntity autoShopsEntity) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Appointment> appointments = new ArrayList<>();
            while(rs.next())
                appointments.add(Appointment.from(rs, usersEntity,autoShopsEntity));

            return appointments;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<Appointment> findAll(UsersEntity usersEntity,
                                     AutoShopsEntity autoShopsEntity ) {
        return findByCriteria("", usersEntity,autoShopsEntity);
    }

    public boolean create(Appointment appointment) {
        return executeUpdate(String.format(
                "INSERT INTO %s(id, description, date_created, date_delivery, auto_shop_id, user_id) VALUES(%d, '%s', "+appointment.getDateCreated()+", "+appointment.getDateDelivery()+", %d, %d)",
                getTableName(), appointment.getId(), appointment.getDescription(), appointment.getAutoShop().getId(),appointment.getUser().getId()));
    }

    public boolean create(int id,
                          String description,
                          Date dateCreated,
                          Date dateDelivery,
                          AutoShop autoShop,
                          User user) {
        return create(new Appointment(
                id,
                description,
                dateCreated,
                dateDelivery,
                user,
                autoShop));
    }

    public boolean create(int id,
                          String description,
                          Date dateCreated,
                          Date dateDelivery,
                          int autoShopId,
                          int userId){
        return executeUpdate(String.format(
                "INSERT INTO %s(id, description, date_created, date_delivery, auto_shop_id, user_id) VALUES(%d, '%s', "+dateCreated+", "+dateDelivery+", %d, %d)",
                getTableName(), id, description, autoShopId,userId));

    }

}
