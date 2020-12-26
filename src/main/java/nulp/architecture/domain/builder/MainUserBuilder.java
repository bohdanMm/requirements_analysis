package nulp.architecture.domain.builder;

import nulp.architecture.domain.MainUser;
import nulp.architecture.enums.Role;

public class MainUserBuilder {
    private static MainUser mainUser;
    private static MainUserBuilder thisBuilder;

    public static MainUserBuilder builder() {
        mainUser = new MainUser();
        thisBuilder = new MainUserBuilder();
        return thisBuilder;
    }

    public MainUserBuilder phoneNumber(String phoneNumber) {
        mainUser.setPhoneNumber(phoneNumber);
        return thisBuilder;
    }

    public MainUserBuilder password(String password) {
        mainUser.setPassword(password);
        return thisBuilder;
    }

    public MainUserBuilder email(String email) {
        mainUser.setEmail(email);
        return thisBuilder;
    }

    public MainUserBuilder role(Role role) {
        mainUser.setRole(role);
        return thisBuilder;
    }

    public MainUser build() {
        MainUser mainUserToReturn = mainUser;
        mainUser = null;
        return mainUserToReturn;
    }

    private MainUserBuilder(){
    }

}
