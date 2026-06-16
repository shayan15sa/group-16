package view.api;

public interface AuthView extends View {
    public void errorDuplicateName();

    public void errorWeakPassword();

    public void errorRepeatPasswordDoseNotMatch();

    public void errorNicknameLength();

    public void errorWrongEmailPattern();

    public void showUserCreated();

    public void errorWrongUsernameOrPassword();

    public void errorWrongUsernameOrEmail();

    public void errorWrongSecurityAnswer();

    public void showUserLoggedIn();

    public void showPasswordChanged();

}
