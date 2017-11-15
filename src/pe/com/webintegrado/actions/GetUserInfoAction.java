package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.User;

public class GetUserInfoAction extends ActionSupport {

    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private User userInfo;
    private int userId;

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
