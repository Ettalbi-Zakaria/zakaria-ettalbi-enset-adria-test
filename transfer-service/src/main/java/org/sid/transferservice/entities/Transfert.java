package org.sid.transferservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.transferservice.enums.Etat;
import org.sid.transferservice.model.Wallet;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Transfert {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double montant;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestination;
}
