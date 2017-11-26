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

    public Vehicule findById(int id,UsersEntity usersEntity ) {
        return findByCriteria(
                String.format("WHERE country_id = %d", id),usersEntity).get(0);
    }

    public List<Vehicule> findByCriteria(String criteria, UsersEntity usersEntity) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Vehicule> vehicules = new ArrayList<Vehicule>();
            while(rs.next())
                vehicules.add(Vehicule.from(rs,usersEntity));

            return vehicules;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public Vehicule findByPlate(String plate,UsersEntity usersEntity ) {
        return findByCriteria(
                String.format("WHERE plate = '%s'", plate),usersEntity).get(0);
    }

    public List<Vehicule> findAll(UsersEntity usersEntity ) {
        return findByCriteria("",usersEntity);
    }

    public List<Vehicule> findAllByUserId(int userId,UsersEntity usersEntity){
        return findByCriteria(
                String.format("WHERE user_id = %d",userId),usersEntity
        );
    }

    public boolean create(Vehicule vehicule) {
        return executeUpdate(String.format(
                "INSERT INTO %s(id, brand, model,year_bought,plate,appointment_id) VALUES(%d, '%s', '%s', "+vehicule.getYearBought()+", '%s', %d)",
                getTableName(), vehicule.getId(), vehicule.getBrand(), vehicule.getModel(),vehicule.getPalte(),vehicule.getUser().getId()));
    }

    public boolean create(int id, String brand, String model, Date yearBought, String plate, User user) {
        return create(new Vehicule(
                id,
                brand,
                model,
                yearBought,
                plate,
                user
        ));
    }

}
