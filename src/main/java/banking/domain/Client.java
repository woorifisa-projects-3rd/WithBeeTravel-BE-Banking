package banking.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "pin_number", nullable = false)
    private String pinNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "has_wibee_card", nullable = false)
    private int hasWibeeCard;

    protected Client() {}

    @Builder
    public Client(Long id, String email, String password, String pinNumber, String name, int hasWibeeCard) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.pinNumber = pinNumber;
        this.name = name;
        this.hasWibeeCard = hasWibeeCard;
    }
}