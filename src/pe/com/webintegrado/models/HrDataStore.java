package pe.com.webintegrado.models;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.util.Date;
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

    public void setConnection(Connection connection) {
        this.connection = connection;
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

    /**
     * findUserById: get user info by id
     *
     * @param id: user id
     * @return user info
     */
    public User findUserById(int id){
        if(connection == null) return null;
        return getUsersEntity().findById(id);
    }

    /**
     * RegisterUser: register new user
     *
     * @param firstName
     * @param lastName
     * @param phone
     * @param address
     * @param email
     * @return true if success or false if failure
     */
    public boolean registerUser(String firstName,
                                String lastName,
                                int phone,
                                String address,
                                String email){
        if(connection == null) return false;
        User newUser = getUsersEntity().create(firstName,lastName,phone,address,email);
        return newUser != null;
    }

    /**
     * loginUser: login the user by email
     *
     * @param email
     * @return id from logged user
     */
    public int loginUser(String email){
        if(connection == null) return 0;
        int userId = getUsersEntity().findByEmail(email).getId();
        if (userId != 0){
            return userId;
        }else {
            return 0;
        }
    }

    /**
     * findAutoShopById: get auto shop by id
     *
     * @param id
     * @return auto shop object
     */
    public AutoShop findAutoShopById(int id){
        if(connection == null) return null ;
        return getAutoShopsEntity().findById(id);
    }

    /**
     * findAllAutoShopsByType: filter auto shops by type
     *
     * @param type
     * @return list of auto shops
     */
    public List<AutoShop> findAllAutoShopsByType(String type){
        if(connection == null) return null ;
        return getAutoShopsEntity().findAllByType(type);
    }

    /**
     * findAllVehiculesByUserId
     *
     * @param userId
     * @return list of vehicules from a user
     */
    public List<Vehicule> findAllVehiculesByUserId(int userId){
        if(connection == null) return null ;
        return getVehiculesEntity().findAllByUserId(userId,getUsersEntity());
    }

    /**
     * createAppointment
     *
     * @param id
     * @param description
     * @param dateCreated
     * @param datedelivery
     * @param userId
     * @param autoShopId
     * @return true if success or false if failure
     */
    public boolean createAppointment(int id,
                                     String description,
                                     Date dateCreated,
                                     Date datedelivery,
                                     int userId,
                                     int autoShopId) {
        return connection != null && getAppointmentsEntity().create(id, description, dateCreated, datedelivery, autoShopId, userId);
    }

    /**
     * findAllAppointmentByUserId
     *
     * @param userId
     * @return list of appointments of user
     */
    public List<Appointment> findAllAppointmentByUserId (int userId){
        if(connection == null) return null ;
        return getAppointmentsEntity().findAllByUserId(userId,getUsersEntity(),getAutoShopsEntity());
    }
}
