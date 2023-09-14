package spring.dataJPA.entitiy;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name"})
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id;
    private String name;


    @OneToMany(mappedBy = "team") // 외래키가 없는 곳에 mappedBy 하기
    private List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
}
