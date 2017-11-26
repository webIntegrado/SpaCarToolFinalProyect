package pe.com.webintegrado.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AutoShop {
    private int id;
    private String name;
    private String address;
    private String type;

    public AutoShop() {
    }

    public AutoShop(int id, String name, String address, String type) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static AutoShop from(ResultSet rs){
        try {
            return new AutoShop(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("type")
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
