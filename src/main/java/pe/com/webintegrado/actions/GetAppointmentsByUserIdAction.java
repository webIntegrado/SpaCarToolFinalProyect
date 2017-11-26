package pe.com.webintegrado.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.webintegrado.models.Appointment;

import java.util.List;

public class GetAppointmentsByUserIdAction extends ActionSupport {
    public String execute() throws Exception{
        //TODO: do something
        return SUCCESS;
    }

    private int userId;
    private List<Appointment> appointmentsFromUser;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Appointment> getAppointmentsFromUser() {
        return appointmentsFromUser;
    }

    public void setAppointmentsFromUser(List<Appointment> appointmentsFromUser) {
        this.appointmentsFromUser = appointmentsFromUser;
    }
}
