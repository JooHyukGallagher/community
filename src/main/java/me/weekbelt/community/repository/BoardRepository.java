package me.weekbelt.community.repository;

import me.weekbelt.community.domain.Board;
import me.weekbelt.community.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
