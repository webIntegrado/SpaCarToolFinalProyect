package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.AutoShop;
import pe.com.webintegrado.models.HrService;

public class GetAutoShopInfoAction extends ActionSupport {
    HrService service = new HrService();
    public String execute() throws Exception{
        AutoShop autoShop = service.getAutoShopInfo(getAutoShopId());
        if(autoShop != null){
            this.name = autoShop.getName();
            this.address = autoShop.getAddress();
            this.type = autoShop.getType();
            return SUCCESS;
        }else {
            return INPUT;
        }
    }

    private int autoShopId;
    private int userId;
    private AutoShop autoShopInfo;
    private String name;
    private String address;
    private String type;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
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

    public AutoShop getAutoShopInfo() {
        return autoShopInfo;
    }

    public void setAutoShopInfo(AutoShop autoShopInfo) {
        this.autoShopInfo = autoShopInfo;
    }
}
