package org.sid.transferservice.fein;

import org.sid.transferservice.model.Client;
import org.sid.transferservice.model.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "WALLET-SERVICE")
public interface WalletRestClient {
    @GetMapping(path = "/wallets/{id}")
    public Wallet getWalletById(@PathVariable(name = "id") Long id);
}

