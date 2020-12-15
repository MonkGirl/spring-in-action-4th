package com.springinaction.chapter5.spittr.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spitter {

    private Long id;

    @NotNull
    @Size(min = 5, max = 16, message = "长度必须大于5个字节小于16个字节")
    private String username;

    @NotNull
    @Size(min = 5, max = 25, message = "长度必须大于5个字节小于25个字节")
    private String password;

    @NotNull
    @Size(min = 2, max = 30, message = "长度必须大于2个字节小于30个字节")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30, message = "长度必须大于2个字节小于30个字节")
    private String lastName;

    @Email
    private String email;

    public Spitter() {
        super();
    }

    public Spitter(String username, String password, String firstName, String lastName) {
        this(null, username, password, firstName, lastName, null);
    }

    public Spitter(String username, String password, String firstName, String lastName, String email) {
        this(null, username, password, firstName, lastName, email);
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName) {
        this(id, username, password, firstName, lastName, null);
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password", "email");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password", "email");
    }
}
