package com.xyz.pw.api.data.model.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The persistent class for the unit database table.
 * 
 */
@Repository
public interface ControlSequenceDao extends JpaRepository<ControlHibernateSequence, Long> {

}

