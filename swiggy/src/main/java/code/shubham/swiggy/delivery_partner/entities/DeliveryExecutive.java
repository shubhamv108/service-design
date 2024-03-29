package code.shubham.swiggy.delivery_partner.entities;

import code.shubham.swiggy.user.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import code.shubham.swiggy.commons.entities.base.BaseAbstractAuditableEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "delivery_executives")
public class DeliveryExecutive extends BaseAbstractAuditableEntity {

    private String currentLocationGeoCode;

    @ManyToOne
    @JoinColumn(name = "delivery_executive_status_id", referencedColumnName = "id", nullable = false)
    private DeliveryExecutiveStatus status;

    @OneToMany(mappedBy = "deliveryExecutive", fetch = FetchType.LAZY)
    private Collection<DeliveryExecutiveRating> deliveryExecutiveRatings;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, unique = true)
    private User userId;
}
