package com.binde.banking_app.mapper;

import com.binde.banking_app.dto.AccountDto;
import com.binde.banking_app.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolder(),
                accountDto.getBalance()
        );
        return account;

    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolder(),
                account.getBalance()
        );
        return accountDto;
    }
}
