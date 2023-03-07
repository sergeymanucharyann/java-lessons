package univercity_project.repasitory;

import oop_homework.inheritance.exercise3.Student;
import univercity_project.model.group.Group;
import univercity_project.model.human.proffesor.Professor;

import java.util.List;

public interface GroupRepository {

    void add(Group group);

    Group deleteBy(String name);

    Group getBy(String name);

    List<Group> getAll();

    int getCountOfAll();

    List<Student> getStudentsBy(String groupName);

    int getCountOfStudentsBy(String groupName);

    List<Professor> getProfessorsBy(String groupName);
}
