package itechart.booking.repository;

import itechart.booking.model.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepository extends JpaRepository<Tariff,Long> {
    Tariff getById(Long id);
}
