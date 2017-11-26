package pe.com.webintegrado.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Appointment {

    private int id;
    private String description;
    private java.sql.Date dateCreated;
    private java.sql.Date dateDelivery;
    private User user;
    private AutoShop autoShop;

    public Appointment() {
    }

    public Appointment(int id, String description, java.sql.Date dateCreated, java.sql.Date dateDelivery, User user, AutoShop autoShop) {
        this.id = id;
        this.description = description;
        this.dateCreated = dateCreated;
        this.dateDelivery = dateDelivery;
        this.user = user;
        this.autoShop = autoShop;
    }

    public int getId() {
        return id;
    }

    public Appointment setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Appointment setDescription(String description) {
        this.description = description;
        return this;
    }

    public java.sql.Date getDateCreated() {
        return dateCreated;
    }

    public Appointment setDateCreated(java.sql.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public java.sql.Date getDateDelivery() {
        return dateDelivery;
    }

    public Appointment setDateDelivery(java.sql.Date dateDelivery) {
        this.dateDelivery = dateDelivery;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Appointment setUser(User user) {
        this.user = user;
        return this;
    }

    public AutoShop getAutoShop() {
        return autoShop;
    }

    public Appointment setAutoShop(AutoShop autoShop) {
        this.autoShop = autoShop;
        return this;
    }


    public static Appointment from (ResultSet rs,
                                    UsersEntity usersEntity,
                                    AutoShopsEntity autoShopsEntity){
        Appointment appointment = new Appointment();
        try {
            return appointment.setId(rs.getInt("id"))
                    .setDescription(rs.getString("description"))
                    .setDateCreated(rs.getDate("date_created"))
                    .setDateDelivery(rs.getDate("date_delivery"))
                    .setAutoShop(autoShopsEntity.findById(rs.getInt("auto_shop_id")))
                    .setUser(usersEntity.findById(rs.getInt("user_id")));
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
