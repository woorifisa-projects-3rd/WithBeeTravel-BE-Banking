package banking.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Table(name = "currencies")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id", nullable = false)
    private int id;

    @Column(name = "unit")
    private String unit;

    protected Currency() {}

    @Builder
    public Currency(int id, String unit) {
        this.id = id;
        this.unit = unit;
    }
}