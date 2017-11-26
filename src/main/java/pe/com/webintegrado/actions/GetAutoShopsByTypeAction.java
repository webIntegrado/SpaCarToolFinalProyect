package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.AutoShop;
import pe.com.webintegrado.models.HrService;

import java.util.List;

public class GetAutoShopsByTypeAction extends ActionSupport {
    private HrService service = new HrService();
    public String execute() throws Exception{
        List<AutoShop> autoShops = service.listAutoShopsByType(getType());
        if(!autoShops.isEmpty()) {
            setAutoShopsByType(autoShops);
            return SUCCESS;
        }else {
            return INPUT;
        }
    }

    private List<AutoShop> autoShopsByType;
    private int userId;
    private String type;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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
