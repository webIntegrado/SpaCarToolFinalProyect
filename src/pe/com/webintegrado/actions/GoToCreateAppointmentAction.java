package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;

public class GoToCreateAppointmentAction extends ActionSupport {
    public String execute() throws Exception{
        return SUCCESS;
    }

    private int userId;
    private int autoShopId;

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
