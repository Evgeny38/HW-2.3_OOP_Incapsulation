import java.time.LocalDate;

public class Human {
    private String name;
    private Integer age;
    private String town;
    private String job;
    private Integer birthYear;

    public Human(String name, Integer age, String town, String job) {
        this.setName(name) ;
        this.setAge(age);
        this.setTown(town) ;
        this.setJob(job) ;
        this.birthYear = LocalDate.now().getYear() - age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }else{
            this.name = "Информация не указана.";
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        }else {
            this.age = 0;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }else{
            this.town = "Информация не указана.";
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        }else{
            this.job = "Трудоголик из Москвы!";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился(-ась) в " + birthYear + " году" +
                ". Я работаю в должности: " + job + ". Будем знакомы!" ;
    }
}
