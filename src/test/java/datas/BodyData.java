package datas;

import pojos.Sign_Up_POJO;

import static datas.GlobalData.*;

public class BodyData {
    public static Sign_Up_POJO validSignUpBody(){

        // Her çağırıldığında yeni bir kayıt datası oluşturur.

        GlobalData.generateNewUser();

        return new Sign_Up_POJO(currentName,currentEmail,currentPassword);
    }
    public static Sign_Up_POJO currentSignUpBody(){
        return new Sign_Up_POJO(currentName,currentEmail,currentPassword);
    }
    public static Sign_Up_POJO invalidSignUpBody(String name, String email, String password){
        return new Sign_Up_POJO(name,email,password);

    }
}
