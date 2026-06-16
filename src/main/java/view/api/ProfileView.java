package view.api;

import model.user.User;

public interface ProfileView extends View {
    void errorSameUsername();

    void errorSameNickname();

    void errorSameEmail();

    void errorSamePassword();

    void errorWrongPassword();

    void showUserInfo(User user);
}
