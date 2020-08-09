package store.wckd.commons.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payer implements Serializable {

    @Size(max = 256)
    private String name = "";

    @Size(max = 256)
    private String surname = "";

    @Email
    @Size(max = 256)
    private String email = "";


}
