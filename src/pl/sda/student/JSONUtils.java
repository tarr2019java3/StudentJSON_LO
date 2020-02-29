package pl.sda.student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {

    public void writeList(String filename, List<Student> students){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filename), students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readList(String filename){
        ObjectMapper objectMapper = new ObjectMapper();
        Student[] students = null;
        try {
            students = objectMapper.readValue(new File(filename), Student[].class);
            for(Student stu: students){
                System.out.println(stu.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(students);
    }
}
