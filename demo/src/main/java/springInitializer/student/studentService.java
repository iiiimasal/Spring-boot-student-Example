package springInitializer.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class studentService {
    private final studentRepository studentRepository;
    @Autowired
    public studentService(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<student> getStudents() {
        return studentRepository.findAll();

    }

    public void addNewStudent(student student) {
        System.out.println(student);
    }
}
