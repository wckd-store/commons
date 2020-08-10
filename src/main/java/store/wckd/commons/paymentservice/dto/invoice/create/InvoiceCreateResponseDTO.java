package store.wckd.commons.paymentservice.dto.invoice.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceCreateResponseDTO implements Serializable {

    private String invoiceUrl;
    private String invoiceSandboxUrl;

}
