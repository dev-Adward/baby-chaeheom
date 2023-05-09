package com.app.babybaby.repository.user.follow;

import com.app.babybaby.entity.member.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long>, FollowQueryDsl {
}
