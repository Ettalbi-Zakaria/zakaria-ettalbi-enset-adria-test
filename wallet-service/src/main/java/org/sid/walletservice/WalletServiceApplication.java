package org.sid.walletservice;

import org.sid.walletservice.entities.Client;
import org.sid.walletservice.entities.Wallet;
import org.sid.walletservice.repositories.ClientRepository;
import org.sid.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
        return args -> {
            Client client = new Client();
            client.setNom("zakaria");
            client.setEmail("zakaria@gmail.com");
            clientRepository.save(client);
            /***************************/
            Client client1 = new Client();
            client.setNom("hamza");
            client.setEmail("hamza@gmail.com");
            clientRepository.save(client1);
            /**************************/
            Wallet wallet = new Wallet();
            wallet.setDevise("MAD");
            wallet.setClient(client);
            wallet.setSolde(5000);
            wallet.setDateCreation(new Date());
            walletRepository.save(wallet);
            /***********************/
            Wallet wallet1 = new Wallet();
            wallet1.setDevise("MAD");
            wallet1.setClient(client1);
            wallet1.setSolde(7500);
            wallet1.setDateCreation(new Date());
            walletRepository.save(wallet1);
        };
    }
}
