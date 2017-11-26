package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.HrService;

public class RegisterAction extends ActionSupport {
    private HrService service = new HrService();

    public String execute() throws Exception{
        if(service.registerUser(
                getFirstName(),
                getLastName(),
                getPhone(),
                getAddress(),
                getEmail())){
            return SUCCESS;
        }else {
            return INPUT;
        }
    }

    private String firstName;
    private String lastName;
    private int phone;
    private String address;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
