
package com.portfolio.mateocatalano.repository;


import com.portfolio.mateocatalano.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
         public Optional<Educacion> findByNombreI(String nombreI);
         public boolean existsByNombreI(String nombreI);
}
