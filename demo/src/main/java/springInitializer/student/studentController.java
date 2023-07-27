package springInitializer.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class studentController {
    private  studentService studentService;
    @Autowired
    public studentController(studentService studentService) {
        this.studentService =  studentService;
    }

    @GetMapping
    public List<student> getStudents() {
    return studentService.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody student student){
        studentService.addNewStudent(student);
    }
}
