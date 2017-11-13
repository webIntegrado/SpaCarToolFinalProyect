package pe.com.webintegrado.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehiculesEntity extends BaseEntity {
    public VehiculesEntity() {
        super();
        setTableName("vehicule");
    }

    public VehiculesEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

    public Vehicule findById(String id, AppointmentsEntity appointmentsEntity,UsersEntity usersEntity, AutoShopsEntity autoShopsEntity) {
        return findByCriteria(
                String.format("WHERE country_id = %d", id), appointmentsEntity,usersEntity,autoShopsEntity).get(0);
    }

    public List<Vehicule> findByCriteria(String criteria, AppointmentsEntity appointmentsEntity,UsersEntity usersEntity, AutoShopsEntity autoShopsEntity) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Vehicule> vehicules = new ArrayList<>();
            while(rs.next())
                vehicules.add(Vehicule.from(rs,appointmentsEntity,usersEntity,autoShopsEntity));

            return vehicules;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public Vehicule findByPlate(String plate, AppointmentsEntity appointmentsEntity,UsersEntity usersEntity, AutoShopsEntity autoShopsEntity) {
        return findByCriteria(
                String.format("WHERE plate = '%s'", plate), appointmentsEntity,usersEntity,autoShopsEntity).get(0);
    }

    public List<Vehicule> findAll(AppointmentsEntity appointmentsEntity,UsersEntity usersEntity, AutoShopsEntity autoShopsEntity) {
        return findByCriteria("", appointmentsEntity,usersEntity,autoShopsEntity);
    }

    public boolean create(Vehicule vehicule) {
        return executeUpdate(String.format(
                "INSERT INTO %s(id, brand, model,year_bought,plate,appointment_id) VALUES(%d, '%s', '%s', "+vehicule.getYearBought()+", '%s', %d)",
                getTableName(), vehicule.getId(), vehicule.getBrand(), vehicule.getModel(),vehicule.getPalte(),vehicule.getAppointment().getId()));
    }

    public boolean create(int id, String brand, String model, Date yearBought, String plate, Appointment appointment) {
        return create(new Vehicule(
                id,
                brand,
                model,
                yearBought,
                plate,
                appointment
        ));
    }

}
