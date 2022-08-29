
package com.portfolio.mateocatalano.repository;


import com.portfolio.mateocatalano.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
         public Optional<Experiencia> findByNombreE(String nombreE);
         public boolean existsByNombreE(String nombreE);
}
