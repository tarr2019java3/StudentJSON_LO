package pl.sda.student;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan",
                "Kowalski",
                32);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student);
        studentList.add(student);
        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("lista.json", studentList);

        jsonUtils.readList("lista.json");

    }
}
