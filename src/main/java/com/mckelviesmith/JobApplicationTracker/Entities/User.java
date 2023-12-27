package com.mckelviesmith.JobApplicationTracker.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Data
public class User {

  @Id
  private UUID uuid;

  private String name;

  private String username;

  private String password;

}

