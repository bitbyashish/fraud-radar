package com.fraudradar.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction submit(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAll() {
        return transactionRepository.findAll();
    }

    public List<Transaction> getByUser(String userId) {
        return transactionRepository.findByUserId(userId);
    }

    public List<Transaction> getByStatus(TransactionStatus status) {
        return transactionRepository.findByStatus(status);
    }
}