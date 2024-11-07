package banking.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @JoinColumn(name = "product_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name ="balance")
    private Long balance;

    protected Account(){};

    @Builder
    public Account(Long id, Client client, Product product, String accountNumber, Long balance) {
        this.id = id;
        this.client = client;
        this.product = product;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


}
