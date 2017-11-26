package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.HrService;
import pe.com.webintegrado.models.User;

// video tutorial https://www.youtube.com/watch?v=u4Pn1rdv5Is

public class LoginAction extends ActionSupport{
    private HrService service = new HrService();
    private int userId;
    private String first_name;
    private String last_name;
    private int phone;
    private String address;
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String execute() throws Exception{
        User user = service.loginUser(getUserEmail());
        this.userId = user.getId();
        this.first_name = user.getFirstName();
        this.last_name = user.getLastName();
        this.phone = user.getPhone();
        this.address = user.getAddress();
        if(userId != 0){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }
}
