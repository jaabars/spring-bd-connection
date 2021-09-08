package kg.easy.springbdconnection.repository;

import kg.easy.springbdconnection.models.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.CacheRequest;
import java.util.List;

@Repository
public interface CarRepo extends JpaRepository<Car,Long> {

    List<Car> findAllByActiveIs(Boolean runAndDrive);
}
