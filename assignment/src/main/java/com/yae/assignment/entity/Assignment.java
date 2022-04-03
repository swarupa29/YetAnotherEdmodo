package com.yae.assignment.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assignment {
    @Id
    @GeneratedValue
    long id;
    String assignmentTitle;
    String assignmentDescription;
    Date assignedDate;
    Date deadlineDate;
    long teacher;
    long classAssigned;
    @ElementCollection
    List<Long> submissions;
}