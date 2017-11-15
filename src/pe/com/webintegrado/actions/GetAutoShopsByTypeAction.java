package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.AutoShop;

import java.util.List;

public class GetAutoShopsByTypeAction extends ActionSupport {
    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private List<AutoShop> autoShopsByType;
    private String type;

    public List<AutoShop> getAutoShopsByType() {
        return autoShopsByType;
    }

    public void setAutoShopsByType(List<AutoShop> autoShopsByType) {
        this.autoShopsByType = autoShopsByType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
