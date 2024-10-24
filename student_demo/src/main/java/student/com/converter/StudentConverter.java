package student.com.converter;

import student.com.dao.Student;
import student.com.dto.StudentDTO;

public class StudentConverter {
  public static StudentDTO convertStudent(Student student){
  StudentDTO studentDTO=new StudentDTO();
  studentDTO.setId(student.getId());
  studentDTO.setName(student.getName());
  studentDTO.setEmail(student.getEmail());
  return studentDTO;
 }
 public static Student convertStudent(StudentDTO studentDTO) {
  Student student = new Student();
  student.setName(studentDTO.getName());
  student.setEmail(studentDTO.getEmail());
  return student;
}
public static Object convertToEntity(StudentDTO studentDTO) {
  // TODO Auto-generated method stub
  throw new UnsupportedOperationException("Unimplemented method 'convertToEntity'");
}

}
