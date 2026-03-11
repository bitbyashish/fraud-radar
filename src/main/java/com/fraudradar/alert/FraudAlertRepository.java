package com.fraudradar.alert;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FraudAlertRepository extends JpaRepository<FraudAlert, String> {

    List<FraudAlert> findByUserId(String userId);

    List<FraudAlert> findByStatus(AlertStatus status);

    List<FraudAlert> findBySeverity(AlertSeverity severity);

    long countByStatus(AlertStatus status);
}