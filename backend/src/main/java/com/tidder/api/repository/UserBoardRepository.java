package com.tidder.api.repository;

import com.tidder.api.domain.associative.UserBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserBoardRepository extends JpaRepository<UserBoard, Long> {
}
