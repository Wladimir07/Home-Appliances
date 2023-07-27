package aparati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aparati.model.Stanje;

@Repository
public interface StanjeRepository extends JpaRepository<Stanje, Long>{

}
