package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.HrService;

// video tutorial https://www.youtube.com/watch?v=u4Pn1rdv5Is

public class LoginAction extends ActionSupport{
    HrService service = new HrService();
    private int userId;
    private String userEmail;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String execute() throws Exception{
        int userId = service.loginUser(getUserEmail());
        this.userId = userId;
        if(userId != 0){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }
}
