package de.hah.jpa.restController;


import de.hah.jpa.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api3")
public class RestApi2 {


    @GetMapping("/student")
    public Student getStudentInfo() {
        Student s = new Student(1, "hesam", 16, "Hamburg");
        return s;
    }


    @PostMapping("/addstudent")
    public String addStudentInfo(@RequestBody Student student) {
        return "studen Data Added";
    }

    @PostMapping("/addstudent2")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        String msg = "Student data added";
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }
}
