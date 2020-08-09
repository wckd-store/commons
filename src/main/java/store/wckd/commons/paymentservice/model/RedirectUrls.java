package store.wckd.commons.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedirectUrls implements Serializable {

    private String paymentUrl;

    private String sandboxPaymentUrl;

}
