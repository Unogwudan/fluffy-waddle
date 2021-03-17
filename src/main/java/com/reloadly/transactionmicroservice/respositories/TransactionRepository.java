package com.reloadly.transactionmicroservice.respositories;

import com.reloadly.transactionmicroservice.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findById(long id);

    List<Transaction> findTransactionsByAccountId(Long accountId);
}
