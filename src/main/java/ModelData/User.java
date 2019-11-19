package ModelData;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Size(max = 10, min = 2)
    private String name;

    @NotNull
    @Max(100)
    @Min(0)
    private Integer id;

    @NotNull
    @Size(max = 12, min = 6)
    private String password;

    @NotNull
    @Max(150)
    @Min(18)
    private Integer age;

    @NotNull
    @Size(max = 1, min = 1)
    private String sex;

    @NotNull
    @Size(max = 50, min = 5)
    private String adress;

    public User() {
    }

    public User(String name, String password, Integer age, String sex, String adress) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
