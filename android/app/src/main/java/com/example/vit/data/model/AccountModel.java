package com.example.vit.data.model;

import java.util.List;

public class AccountModel {
    private String username;
    private String password;
    private String userType;
    private String fullName;
    private String gender;
    private long dateOfBirth;
    private String school;
    private String university;
    private String phone;
    private String email;
    private List<String> listRegistered;
    private List<String> listUpcoming;
    private List<String> listUnregistered;
    private List<String> listParticipated;

    public AccountModel() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getListRegistered() {
        return listRegistered;
    }

    public void setListRegistered(List<String> listRegistered) {
        this.listRegistered = listRegistered;
    }

    public List<String> getListUpcoming() {
        return listUpcoming;
    }

    public void setListUpcoming(List<String> listUpcoming) {
        this.listUpcoming = listUpcoming;
    }

    public List<String> getListUnregistered() {
        return listUnregistered;
    }

    public void setListUnregistered(List<String> listUnregistered) {
        this.listUnregistered = listUnregistered;
    }

    public List<String> getListParticipated() {
        return listParticipated;
    }

    public void setListParticipated(List<String> listParticipated) {
        this.listParticipated = listParticipated;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getFullName() {
        return fullName;
    }

}
