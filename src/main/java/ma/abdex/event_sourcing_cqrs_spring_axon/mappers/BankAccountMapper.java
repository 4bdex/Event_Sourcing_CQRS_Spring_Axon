package ma.abdex.event_sourcing_cqrs_spring_axon.mappers;


import ma.abdex.event_sourcing_cqrs_spring_axon.queries.dto.AccountOperationResponseDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.queries.dto.BankAccountResponseDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.queries.entities.AccountOperation;
import ma.abdex.event_sourcing_cqrs_spring_axon.queries.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
