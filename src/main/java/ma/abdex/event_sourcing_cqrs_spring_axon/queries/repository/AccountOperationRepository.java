package ma.abdex.event_sourcing_cqrs_spring_axon.queries.repository;

import ma.abdex.event_sourcing_cqrs_spring_axon.queries.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
}
