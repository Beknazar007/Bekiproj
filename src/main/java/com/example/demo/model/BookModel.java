package com.example.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Booking")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String login;
    String email;
    String number;
    String data;
    String  time;
    String guest;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookModel bookTable = (BookModel) o;
        return Objects.equals(id, bookTable.id) && Objects.equals(login, bookTable.login) && Objects.equals(email, bookTable.email) && Objects.equals(number, bookTable.number) && Objects.equals(data, bookTable.data) && Objects.equals(time, bookTable.time) && Objects.equals(guest, bookTable.guest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, number, data, time, guest);
    }

    @Override
    public String toString() {
        return "BookTable{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", guest='" + guest + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
}
