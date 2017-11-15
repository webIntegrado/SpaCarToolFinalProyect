package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.AutoShop;

public class GetAutoShopInfoAction extends ActionSupport {
    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private int autoShopId;
    private AutoShop autoShopInfo;

    public int getAutoShopId() {
        return autoShopId;
    }

    public void setAutoShopId(int autoShopId) {
        this.autoShopId = autoShopId;
    }

    public AutoShop getAutoShopInfo() {
        return autoShopInfo;
    }

    public void setAutoShopInfo(AutoShop autoShopInfo) {
        this.autoShopInfo = autoShopInfo;
    }
}
