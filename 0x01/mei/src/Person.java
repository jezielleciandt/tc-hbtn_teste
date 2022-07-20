import java.util.Calendar;

public class Person {
    private String name, surname;
    private int birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer, float salary) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
        this.salary = salary;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String fullName(){
        return String.format("%s %s", getName(),getSurname());
    }
    public float calculateYearlySalary(){
        return getSalary()*12;
    }
//    private long calculateAge(){
//        Date today = new Date();
//        long difference = today.getTime() - getBirthDate().getTime();
//        TimeUnit time = TimeUnit.DAYS;
//        return time.convert(difference, TimeUnit.MILLISECONDS) / 365;
//    }
    public int calculateAge(){
        int time = Calendar.getInstance().get(Calendar.YEAR);
        return time - getBirthDate();
    }
    public boolean isMEI(){
        if(calculateYearlySalary()< 130000
                && calculateAge()>18
                && isAnotherCompanyOwner() == false
                && isPensioner() == false
                && isPublicServer() == false){
            return true;
        }
        return false;
    }
}
