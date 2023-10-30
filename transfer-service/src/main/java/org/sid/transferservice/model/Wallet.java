package org.sid.transferservice.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class Wallet {
    private String id;
    private double solde;
    private Date dateCreation;
    private String devise;
    private Client client;
}
