package com.example.demo.UserPack;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String nick;
    private String password;

    public User(Long id, String name, String surname, String email, String nick, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.nick = nick;
        this.password = password;
    }

    public User(String name, String surname, String email, String nick, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.nick = nick;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
