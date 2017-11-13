package pe.com.webintegrado.models;

import java.sql.Connection;
import java.util.List;

public class HrDataStore {
    private Connection connection;
    private UsersEntity usersEntity;
    private AutoShopsEntity autoShopsEntity;
    private AppointmentsEntity appointmentsEntity;
    private VehiculesEntity vehiculesEntity;

    public HrDataStore(Connection connection) {
        this.connection = connection;
    }

    public HrDataStore() {
    }

    private UsersEntity getUsersEntity(){
        if(usersEntity == null){
            usersEntity = new UsersEntity();
            usersEntity.setConnection(connection);
        }
        return usersEntity;
    }

    private AutoShopsEntity getAutoShopsEntity(){
        if(autoShopsEntity == null){
            autoShopsEntity = new AutoShopsEntity();
            autoShopsEntity.setConnection(connection);
        }
        return autoShopsEntity;
    }

    private AppointmentsEntity getAppointmentsEntity(){
        if(appointmentsEntity == null){
            appointmentsEntity = new AppointmentsEntity();
            appointmentsEntity.setConnection(connection);
        }
        return appointmentsEntity;
    }

    private VehiculesEntity getVehiculesEntity(){
        if(vehiculesEntity == null){
            vehiculesEntity = new VehiculesEntity();
            vehiculesEntity.setConnection(connection);
        }
        return vehiculesEntity;
    }

    public User findUserById(int id){
        if(connection == null) return null;
        return getUsersEntity().findById(id);
    }

    public AutoShop findAutoShopById(int id){
        if(connection == null) return null ;
        return getAutoShopsEntity().findById(id);
    }

    public Appointment findAppointmentById(int id){
        if(connection == null) return null ;
        return getAppointmentsEntity().findById(id,getUsersEntity(),getAutoShopsEntity());
    }

    public Vehicule findVehiculeById(int id){
        if(connection == null) return null ;
        return getVehiculesEntity().findById(id,getUsersEntity());
    }

    public List<AutoShop> findAllAutoShopsByType(String type){
        if(connection == null) return null ;
        return getAutoShopsEntity().findAllByType(type);
    }

    public List<AutoShop> findAllAutoShops(){
        if(connection == null) return null ;
        return getAutoShopsEntity().findAll();
    }

    public List<Vehicule> findAllVehiculesByUserId(int userId){
        if(connection == null) return null ;
        return getVehiculesEntity().findAllByUserId(userId,getUsersEntity());
    }
}
