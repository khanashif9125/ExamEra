package com.exam.repo;

import com.exam.model.Result;
import com.exam.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result,Long> {
}
