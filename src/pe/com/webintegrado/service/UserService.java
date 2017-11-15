package pe.com.webintegrado.service;

import pe.com.webintegrado.repository.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }

    public String loginByEmail(String email){
        String result = "loginFailure";
        if(userRepository != null){
            boolean status = userRepository.loginWithEmail(email);
            if(status){
                result = "loginSuccess";
            }
        }
        return result;
    }
}
