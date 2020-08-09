package store.wckd.commons.paymentservice.dto;

import lombok.*;
import store.wckd.commons.paymentservice.enumeration.AutoReturn;
import store.wckd.commons.paymentservice.enumeration.PaymentGateway;
import store.wckd.commons.paymentservice.model.Item;
import store.wckd.commons.paymentservice.model.Payer;
import store.wckd.commons.paymentservice.model.RedirectUrls;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCreateRequestDTO {

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
