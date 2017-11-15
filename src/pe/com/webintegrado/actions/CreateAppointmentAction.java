package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class CreateAppointmentAction extends ActionSupport {
    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private int id;
    private String description;
    private Date dateCreated;
    private Date datedelivery;
    private int userId;
    private int autoShopId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDatedelivery() {
        return datedelivery;
    }

    public void setDatedelivery(Date datedelivery) {
        this.datedelivery = datedelivery;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAutoShopId() {
        return autoShopId;
    }

    public void setAutoShopId(int autoShopId) {
        this.autoShopId = autoShopId;
    }
}
