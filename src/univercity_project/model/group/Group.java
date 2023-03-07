package univercity_project.model.group;

import oop_homework.inheritance.exercise3.Student;
import univercity_project.model.human.proffesor.Professor;
import univercity_project.model.subject.Subject;

import java.util.List;

public class Group {

    private String name;
    private List<Student> students;
    private List<Professor> professors;
    private List<Subject> subjects;

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", professors=" + professors +
                ", subjects=" + subjects +
                "}\n";
    }
}
