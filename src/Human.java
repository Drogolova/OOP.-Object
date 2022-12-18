public class Human {

    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {

        setYearOfBirth(yearOfBirth);

        if(name == null || name.isBlank()) {
            this.name = "Информация не предоставлена";
        } else {
            this.name = name;
        }
        setTown(town);

        if(jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Информация не предоставлена";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(town == null || town.isBlank()) {
            this.town = "Информация не предоставлена";
        } else {
            this.town = town;
        }
    }

    public void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town
        + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
