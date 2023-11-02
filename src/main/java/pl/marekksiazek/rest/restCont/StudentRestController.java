package pl.marekksiazek.rest.restCont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.marekksiazek.rest.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for "/students" - return students list

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Marek", "Książek"));
        theStudents.add(new Student("Łukasz", "Szyba"));
        theStudents.add(new Student("Paweł", "Bartoszewski"));


        return theStudents;
    }


}
