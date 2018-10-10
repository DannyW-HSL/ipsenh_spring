package nl.a_team.ipsenh_spring.test;


import nl.a_team.ipsenh_spring.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
}
