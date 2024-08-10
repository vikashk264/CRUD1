package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {

    private Long id;

    private String stsName;

    private String stsEmail;

    private String stdPass;

    public StudentDto() {
    }

    public StudentDto(Long id, String stsName, String stsEmail, String stdPass) {
        this.id = id;
        this.stsName = stsName;
        this.stsEmail = stsEmail;
        this.stdPass = stdPass;
    }

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStsName() {
        return stsName;
    }

    public void setStsName(String stsName) {
        this.stsName = stsName;
    }

    public String getStsEmail() {
        return stsEmail;
    }

    public void setStsEmail(String stsEmail) {
        this.stsEmail = stsEmail;
    }

    public String getStdPass() {
        return stdPass;
    }

    public void setStdPass(String stdPass) {
        this.stdPass = stdPass;
    }*/
}
