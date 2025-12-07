package ma.abdex.event_sourcing_cqrs_spring_axon.queries.repository;

import ma.abdex.event_sourcing_cqrs_spring_axon.queries.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
