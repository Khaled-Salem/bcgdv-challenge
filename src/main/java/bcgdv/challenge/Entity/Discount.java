package bcgdv.challenge.Entity;

import javax.persistence.*;

@Entity
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "watch_id" , insertable = false, updatable = false)
    private Integer watchId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "deducted_value")
    private Integer deductedValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "watch_id", nullable = false)
    private Watch watch;



    public Integer getId() {
        return id;
    }

    public Integer getWatchId() {
        return watchId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDeductedValue() {
        return deductedValue;
    }

    public void setDeductedValue(Integer deductedValue) {
        this.deductedValue = deductedValue;
    }
}
