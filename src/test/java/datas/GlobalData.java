package datas;

import com.github.javafaker.Faker;

public class GlobalData {

    public static String currentName;
    public static String currentEmail;
    public static String currentPassword;


    private  static Faker faker=new Faker();


    public static String randomName(){
        return  faker.name().firstName();
    }
    public static String randomEmail(){
        return faker.internet().emailAddress();
    }
    public static String randomPassword(){
        return faker.internet().password(8,15,true, false,true);
    }

    public static void generateNewUser(){

        currentName = randomName();
        currentEmail=randomEmail();
        currentPassword=randomPassword();
    }
}
