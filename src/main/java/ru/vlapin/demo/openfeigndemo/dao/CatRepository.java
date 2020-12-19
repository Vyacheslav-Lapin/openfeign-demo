package ru.vlapin.demo.openfeigndemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.openfeigndemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
