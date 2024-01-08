package com.mckelviesmith.JobApplicationTracker.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobs")
@NoArgsConstructor
@Data
public class Job {

  @Id
  private UUID uuid;

  private String company;

  private String position;

  private String location;

  private Boolean remote;

  private Date date;

}
