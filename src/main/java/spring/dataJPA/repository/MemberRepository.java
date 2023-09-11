package spring.dataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.dataJPA.entitiy.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
