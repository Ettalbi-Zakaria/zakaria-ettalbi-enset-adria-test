package org.sid.transferservice;

import org.sid.transferservice.entities.Transfert;
import org.sid.transferservice.enums.Etat;
import org.sid.transferservice.fein.WalletRestClient;
import org.sid.transferservice.model.Wallet;
import org.sid.transferservice.repositories.TransfertRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class TransferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start1(TransfertRepository transfertRepository, WalletRestClient walletRestClient){
		return args -> {
			Wallet walletsource = walletRestClient.getWalletById(2L);
			Wallet walletDsestination = walletRestClient.getWalletById(1L);
			Transfert transfert = new Transfert();
			transfert.setDate(new Date());
			transfert.setEtat(Etat.VALIDATED);
			transfert.setMontant(500);
			transfert.setWalletSource(walletsource);
			transfert.setWalletDestination(walletDsestination);
			transfertRepository.save(transfert);

		};
	}
}
