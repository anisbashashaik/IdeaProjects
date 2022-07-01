import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<User> lstUser = new ArrayList<User>();
        lstUser.add(new User(1, "A", "a@gmail.com", "apassword"));
        lstUser.add(new User(2, "B", "b@gmail.com", "bpassword"));
        lstUser.add(new User(3, "C", "c@gmail.com", "cpassword"));
        lstUser.add(new User(4, "D", "d@gmail.com", "dpassword"));
        List<UserDTO> lstUserDTO = lstUser.stream().map((User user) -> new UserDTO(user.getId(), user.getName(), user.getEmailID())).collect(Collectors.toList());
        lstUserDTO.forEach(user -> System.out.println(user.toString()));
    }

}

class UserDTO {
    private int id;
    private String name;
    private String emailID;


    public UserDTO(int id, String name, String emailID) {
        this.id = id;
        this.name = name;
        this.emailID = emailID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}

class User {
    private int id;
    private String name;
    private String emailID;
    private String password;

    public User(int id, String name, String emailID, String password) {
        this.id = id;
        this.name = name;
        this.emailID = emailID;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailID='" + emailID + '\'' +
                '}';
    }
}