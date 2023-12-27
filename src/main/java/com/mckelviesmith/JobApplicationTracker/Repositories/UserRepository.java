package com.mckelviesmith.JobApplicationTracker.Repositories;

import com.mckelviesmith.JobApplicationTracker.Entities.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {

}
