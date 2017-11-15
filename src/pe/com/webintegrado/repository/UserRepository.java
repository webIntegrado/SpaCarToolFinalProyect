package pe.com.webintegrado.repository;

import pe.com.webintegrado.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {
    private Connection connection;

    public UserRepository() {
        connection = DbUtil.getConnection();
    }

    public boolean loginWithEmail(String email){
        if(connection != null){
            try {
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT COUNT(*) FROM user WHERE email = ?");
                preparedStatement.setString(1,email);

                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet != null){
                    while (resultSet.next()) {
                        if (resultSet.getInt(1) == 1) {
                            return true;
                        }
                    }
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        return false;
    }
}
