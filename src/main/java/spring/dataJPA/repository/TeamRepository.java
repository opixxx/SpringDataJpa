package spring.dataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.dataJPA.entitiy.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
