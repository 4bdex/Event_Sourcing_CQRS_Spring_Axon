package ma.abdex.event_sourcing_cqrs_spring_axon.commands.controllers;

import ma.abdex.event_sourcing_cqrs_spring_axon.commands.excepetions.InsufficientBalanceException;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.services.AccountCommandService;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.CreateAccountRequestDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.CreditAccountRequestDTO;
import ma.abdex.event_sourcing_cqrs_spring_axon.commands.dto.DebitAccountRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping(path="/commands")
public class AccountCommandRestController {

    private final AccountCommandService accountCommandService;

    public AccountCommandRestController(AccountCommandService accountCommandService) {
        this.accountCommandService = accountCommandService;
    }
    @PostMapping(path = "/accounts/create")
    public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequestDTO accountRequestDTO){
       return accountCommandService.createAccount(accountRequestDTO);
    }
    @PutMapping(path = "/accounts/debit")
    public CompletableFuture<String> debitAccount(@RequestBody DebitAccountRequestDTO debitAccountRequestDTO){
        return accountCommandService.debitAccount(debitAccountRequestDTO);
    }
    @PutMapping(path = "/accounts/credit")
    public CompletableFuture<String> creditAccount(@RequestBody CreditAccountRequestDTO creditAccountRequestDTO){
        return accountCommandService.creditAccount(creditAccountRequestDTO);
    }
    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<String> exceptionHandler(InsufficientBalanceException exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
