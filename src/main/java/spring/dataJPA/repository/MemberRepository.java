package spring.dataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.dataJPA.entitiy.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);
}
