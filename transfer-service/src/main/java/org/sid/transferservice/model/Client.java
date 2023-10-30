package org.sid.transferservice.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data @AllArgsConstructor @NoArgsConstructor
public class Client {
    private Long id ;
    private String nom;
    private String email;
    private Collection<Wallet> wallet;
}
