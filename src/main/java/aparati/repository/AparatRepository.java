package aparati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aparati.model.Aparat;

@Repository
public interface AparatRepository extends JpaRepository<Aparat, Long> {
	
	Aparat findOneById(Long id);
	
	

}
