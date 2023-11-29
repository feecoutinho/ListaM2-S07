package lista.devinhouse.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import lista.devinhouse.veiculos.model.Multa;

@Repository
public interface MultaRepository extends JpaRepository<Multa,Integer> {
}