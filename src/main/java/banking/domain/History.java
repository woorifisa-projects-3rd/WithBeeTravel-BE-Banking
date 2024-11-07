package banking.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curr", nullable = false)
    private Currency currency;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "rcv_am")
    private Integer rcvAm;

    @Column(name = "pay_am")
    private Integer payAm;

    @Column(name = "balance", nullable = false)
    private Integer balance;

    @Column(name = "rqspe_nm", nullable = false)
    private String rqspeNm;

    @Column(name = "is_wibee_card", nullable = false)
    private int isWibeeCard;

    protected History() {}

    @Builder
    public History(Long id, Account account, Currency currency, LocalDateTime date,
                   int rcvAm, int payAm, int balance, String rqspeNm, int isWibeeCard) {
        this.id = id;
        this.account = account;
        this.currency = currency;
        this.date = date;
        this.rcvAm = rcvAm;
        this.payAm = payAm;
        this.balance = balance;
        this.rqspeNm = rqspeNm;
        this.isWibeeCard = isWibeeCard;
    }
}
