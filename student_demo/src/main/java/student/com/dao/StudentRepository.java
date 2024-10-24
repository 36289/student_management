package student.com.dao;

import java.util.List; // 修改导入

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // find支持的关键字：And, Between, In, StartingWith
    List<Student> findByEmail(String email);

    List<Student> findByAgeBetween(int minAge, int maxAge);

    List<Student> findByNameStartingWith(String namePrefix);

    // 通过原生 SQL/JPQL 查询
    @Query("select s from Student s where s.email = :email")
    List<Student> findByEmail2(@Param("email") String email);
}
