package com.mckelviesmith.JobApplicationTracker.Repositories;

import com.mckelviesmith.JobApplicationTracker.Entities.Job;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, UUID> {

}
