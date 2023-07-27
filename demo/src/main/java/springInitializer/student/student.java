package springInitializer.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class student {
    @Id
    @SequenceGenerator(name = "student_sequence",
                        sequenceName = "student_sequence",
                         allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    @Transient
    private Integer age;
    private LocalDate Date;
    private  String email;

    public student(long id,
                   String name,
                   LocalDate date,
                   String email) {
        this.id = id;
        this.name = name;
        Date = date;
        this.email = email;
    }

    public student(String name,
                   LocalDate date,
                   String email) {
        this.name = name;
        Date = date;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return Period.between(this.Date, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Date=" + Date +
                ", email='" + email + '\'' +
                '}';
    }
}
