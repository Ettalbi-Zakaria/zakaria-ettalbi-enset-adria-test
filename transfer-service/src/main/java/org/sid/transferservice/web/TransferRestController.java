package org.sid.transferservice.web;

import lombok.AllArgsConstructor;
import org.sid.transferservice.entities.Transfert;
import org.sid.transferservice.repositories.TransfertRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
public class TransferRestController {
    private TransfertRepository transfertRepository;
    @GetMapping(path = "/Transfert/{id}")
    public Transfert getTransfert(@PathVariable Long id){
        Transfert transfert = new Transfert();
        return transfert;
    };
}


