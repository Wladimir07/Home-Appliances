package aparati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aparati.model.Kategorija;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija, Long>{

}
