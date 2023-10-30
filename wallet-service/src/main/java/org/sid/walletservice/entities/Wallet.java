package org.sid.walletservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Wallet {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    private String devise;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Client client;
}
