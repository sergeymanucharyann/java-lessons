package univercity_project.repasitory;

import oop_homework.inheritance.exercise3.Student;
import univercity_project.model.addres.Address;

import java.util.List;

public interface StudentRepository {

    void add(univercity_project.model.human.student.Student student);

    void add(Student student);

    univercity_project.model.human.student.Student deleteBy(int id);

    List<univercity_project.model.human.student.Student> getAllBy(String firstName);

    List<univercity_project.model.human.student.Student> getAllBy(String firstName, String lastName);

    univercity_project.model.human.student.Student getBy(int id);

    //TODO getByDegree

    List<Address> getAddressListBy(int id);
}