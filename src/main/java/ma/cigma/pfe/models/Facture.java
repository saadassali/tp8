package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TFacture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column
    Date date;
    @Column
    double amount;
    public Facture(Date date,double amount) {
        this.date = date;
        this.amount=amount;
    }
    @Override
    public String toString() {
        return "facture{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }


}
