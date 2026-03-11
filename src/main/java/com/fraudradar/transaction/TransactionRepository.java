package com.fraudradar.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

    List<Transaction> findByUserId(String userId);

    List<Transaction> findByUserIdAndCreatedAtAfter(String userId, LocalDateTime after);

    List<Transaction> findByStatus(TransactionStatus status);

    long countByUserIdAndCreatedAtAfter(String userId, LocalDateTime after);
}