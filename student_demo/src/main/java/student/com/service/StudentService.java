package student.com.service;

import java.util.List;

import student.com.dto.StudentDTO;

public interface StudentService {

    StudentDTO getStudentById(long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudentById(long id, String name, String email);

    List<StudentDTO> getStudentsByAges(int maxAge, int minAge);
}