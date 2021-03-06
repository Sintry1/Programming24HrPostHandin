package localelection.programming24hr.repositories;

import localelection.programming24hr.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    Candidate findCandidateById(Long id);
    List<Candidate> findCandidateByPartyId(int id);
    List<Candidate> deleteCandidateById(int id);
    List<Candidate> findCandidateByFirstName(String firstName);
}
