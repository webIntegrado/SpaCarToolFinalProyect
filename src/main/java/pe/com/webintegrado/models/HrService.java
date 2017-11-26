package pe.com.webintegrado.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class HrService {

    private Connection connection;
    private HrDataStore dataStore;

    public HrService(){
        try {
            InitialContext context = new InitialContext();
            dataStore = new HrDataStore();
            connection = ((DataSource)context
                    .lookup("jdbc/SpaCarTool"))
                    .getConnection();
            dataStore.setConnection(connection);
        }catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public HrDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(HrDataStore dataStore){
        this.dataStore = dataStore;
    }

    public User getCurrentUser (int userId){
        return dataStore.findUserById(userId);
    }

    public User loginUser (String email){
        return dataStore.loginUser(email);
    }

    public boolean registerUser(String firstName,
                                String lastName,
                                int phone,
                                String address,
                                String email){
        return dataStore.registerUser(firstName,lastName,phone,address,email);
    }

    public AutoShop getAutoShopInfo(int id){
        return dataStore.findAutoShopById(id);
    }

    public List<AutoShop> listAutoShopsByType(String type){
        return dataStore.findAllAutoShopsByType(type);
    }

    public List<Vehicule> listVehiculesByUserId(int id){
        return dataStore.findAllVehiculesByUserId(id);
    }

    public boolean createAppointment(int id,
                                     String description,
                                     java.sql.Date dateCreated,
                                     java.sql.Date datedelivery,
                                     int userId,
                                     int autoShopId){
        return dataStore.createAppointment(id,description,dateCreated,datedelivery,userId,autoShopId);
    }

    public List<Appointment> listAppointmentsByUserId(int id){
        return dataStore.findAllAppointmentByUserId(id);
    }
}
