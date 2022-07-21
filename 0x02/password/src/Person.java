public class Person {

    public boolean checkUser(String userName) {
        if (userName.length() > 7 && !userName.matches("[!@#$%^&*()_+=-{}/?|~`']*")) {
            return true;
        }
        return false;
    }
    public boolean checkPassword(String password){
        if(password.length() > 7 && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$")){
            return true;
        }
        return false;
    }
}
