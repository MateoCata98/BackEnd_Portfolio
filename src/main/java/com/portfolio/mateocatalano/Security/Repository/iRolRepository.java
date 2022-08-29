
package com.portfolio.mateocatalano.Security.Repository;

import com.portfolio.mateocatalano.Security.Entity.Rol;
import com.portfolio.mateocatalano.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
