package ma.abdex.event_sourcing_cqrs_spring_axon.commands.services;

import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.CreateAccountRequestDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.CreditAccountRequestDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
