package store.wckd.commons.paymentservice.dto.invoice.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import store.wckd.commons.paymentservice.enumeration.AutoReturn;
import store.wckd.commons.paymentservice.enumeration.PaymentGateway;
import store.wckd.commons.paymentservice.model.Item;
import store.wckd.commons.paymentservice.model.Payer;
import store.wckd.commons.paymentservice.model.RedirectUrls;

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
    @Size(max = 500)
    private String notificationUrl = "";

}
