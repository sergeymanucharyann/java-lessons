package univercity_project.model.univercity;

import univercity_project.model.addres.Address;
import univercity_project.model.group.Group;

import java.util.List;

public class University {
    private String name;
    private Address address;
    private List<Group> groups;

    public University(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "courses=" + groups +
                ", name='" + name + '\'' +
                ", address=" + address +
                "}\n";
    }
}
