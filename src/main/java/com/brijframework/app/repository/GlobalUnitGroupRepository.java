package com.brijframework.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.app.entities.EOGlobalUnitGroup;

@Repository
@Transactional
public interface GlobalUnitGroupRepository extends JpaRepository<EOGlobalUnitGroup, Long>{
	
	EOGlobalUnitGroup findOneByTypeId(String typeId);

	EOGlobalUnitGroup findAllByTypeId(String typeId);

	int countByTypeId(String typeId);

	Optional<EOGlobalUnitGroup> findByTypeId(String typeId);


}
