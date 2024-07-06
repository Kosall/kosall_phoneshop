package org.kosal.phoneshop.kosal1_phoneshop.repository;

import java.util.List;

import org.kosal.phoneshop.kosal1_phoneshop.entities.Brand;
import org.kosal.phoneshop.kosal1_phoneshop.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{
	List<Model>findByBrandId(Long id);
	

}
