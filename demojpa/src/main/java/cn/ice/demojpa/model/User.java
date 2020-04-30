package cn.ice.demojpa.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private int id;
    private String name;
    private String pwd;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String password) {
        this.pwd = password;
    }

    public User() {
    }

    public User( String name, String pwd) {

        this.name = name;
        this.pwd = pwd;
    }
}
