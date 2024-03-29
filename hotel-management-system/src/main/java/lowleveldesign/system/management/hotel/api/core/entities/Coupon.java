package lowleveldesign.system.management.hotel.api.core.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lowleveldesign.system.management.hotel.api.core.entities.base.BaseAbstractAuditableEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coupons")
public class Coupon extends BaseAbstractAuditableEntity {

    @Column(name = "coupon_code", nullable = false)
    private String code;

    private Double discountAmount;
    private Double discountPercentage;

    @Builder.Default
    private int maxUsage = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expires_at", nullable = false)
    private Date expiresAt;

}
