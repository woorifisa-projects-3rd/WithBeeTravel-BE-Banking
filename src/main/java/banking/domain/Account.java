package banking.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "accounts")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long id;

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @Enumerated(EnumType.STRING)
    private Product product;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name ="balance")
    private Long balance;

    @OneToMany(mappedBy = "account")
    private List<History> histories = new ArrayList<>();

}
