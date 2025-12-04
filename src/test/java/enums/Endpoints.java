package enums;

public enum Endpoints {

    SIGN_IN_SOCIAL("/sign-in/social"),
    GET_SESSION("/get-session"),
    SIGN_OUT("/sign-out"),
    SIGN_UP_EMAIL ("/sign-up/email"),
    SIGN_IN_EMAIL("/sign-in/email"),
    FORGET_PASSWORD("/forget-password"),
    RESET_PASSWORD("/reset-password"),
    VERIFY_EMAIL("/verify-email"),
    SEND_VERIFICATION_EMAIL("/send-verification-email"),
    CHANGE_EMAIL("/change-email"),
    CHANGE_PASSWORD("/change-password"),
    UPDATE_USER("/update-user"),
    DELETE_USER("/delete-user"),
    RESET_PASSWORD_TOKEN("/reset-password/:token"),
    LIST_SESSIONS("/list-sessions"),
    REVOKE_SESSION("/revoke-session"),
    REVOKE_SESSIONS("/revoke-sessions"),
    REVOKE_OTHER_SESSIONS("/revoke-other-sessions"),
    LINK_SOCIAL("/link-social"),
    LIST_ACCOUNTS("/list-accounts"),
    DELETE_USER_CALLBACK("/delete-user/callback"),
    UNLINK_ACCOUNT("/unlink-account"),
    OK("/ok"),
    ERROR("error");

private final String path;
Endpoints(String path){
    this.path=path;
    }
   public String getPath(){
    return path;
    }

}
