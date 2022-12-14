public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if(yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if(name == null || name.isBlank()) {
            this.name = "Информация не предоставлена";
        } else {
            this.name = name;
        }
        if(town == null || town.isBlank()) {
            this.town = "Информация не предоставлена";
        } else {
            this.town = town;
        }
        if(jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Информация не предоставлена";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public void printGreeting() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town
        + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
