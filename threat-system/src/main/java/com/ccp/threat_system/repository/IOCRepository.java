package com.ccp.threat_system.repository;

import com.ccp.threat_system.entity.IOCData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOCRepository extends JpaRepository<IOCData, Long> {
}