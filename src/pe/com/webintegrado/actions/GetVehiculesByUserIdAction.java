package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.Vehicule;

import java.util.List;

public class GetVehiculesByUserIdAction extends ActionSupport {
    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private List<Vehicule> vehiculesFromUser;
    private int userId;

    public List<Vehicule> getVehiculesFromUser() {
        return vehiculesFromUser;
    }

    public void setVehiculesFromUser(List<Vehicule> vehiculesFromUser) {
        this.vehiculesFromUser = vehiculesFromUser;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
