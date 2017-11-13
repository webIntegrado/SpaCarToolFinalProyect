package pe.com.webintegrado.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Vehicule {
    private int id;
    private String brand;
    private String model;
    private Date yearBought;
    private String palte;
    private User user;

    public Vehicule() {
    }

    public Vehicule(int id, String brand, String model, Date yearBought, String palte, User user) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearBought = yearBought;
        this.palte = palte;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Vehicule setId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Vehicule setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Vehicule setModel(String model) {
        this.model = model;
        return this;
    }

    public Date getYearBought() {
        return yearBought;
    }

    public Vehicule setYearBought(Date yearBought) {
        this.yearBought = yearBought;
        return this;
    }

    public String getPalte() {
        return palte;
    }

    public Vehicule setPalte(String palte) {
        this.palte = palte;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Vehicule setUser(User user) {
        this.user = user;
        return this;
    }

    public static Vehicule from(ResultSet rs,UsersEntity usersEntity){
        Vehicule vehicule = new Vehicule();
        try {
            return vehicule.setId(rs.getInt("id"))
                    .setBrand(rs.getString("brand"))
                    .setModel(rs.getString("model"))
                    .setYearBought(rs.getDate("year_bought"))
                    .setPalte(rs.getString("plate"))
                    .setUser(usersEntity.findById(rs.getInt("user_id")));
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
