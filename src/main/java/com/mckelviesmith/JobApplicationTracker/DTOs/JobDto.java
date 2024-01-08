package com.mckelviesmith.JobApplicationTracker.DTOs;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {

  private String company;

  private String position;

  private String location;

  private Boolean remote;

  private Date date;

}
