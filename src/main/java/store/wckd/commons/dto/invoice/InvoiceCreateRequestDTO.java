package store.wckd.commons.dto.invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import store.wckd.commons.enumeration.AutoReturn;
import store.wckd.commons.enumeration.PaymentGateway;
import store.wckd.commons.model.Item;
import store.wckd.commons.model.Payer;
import store.wckd.commons.model.RedirectUrls;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceCreateRequestDTO implements Serializable {

    @NotNull
    private PaymentGateway paymentGateway;

    @NotNull
    @Valid
    private Item[] items;

    @NotNull
    @Valid
    private Payer payer;

    @NotNull
    @Valid
    private RedirectUrls redirectUrls;

    @NotNull
    private AutoReturn autoReturn = AutoReturn.APPROVED;

    @NotNull
    private String externalReference = "";

    @NotNull
    @Size(max = 500)
    private String notificationUrl = "";

}
