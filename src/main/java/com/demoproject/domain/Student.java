package com.demoproject.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Student")
@Getter
@Setter
public class Student {
    @Id
    private int id;
    private  String name;
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}
