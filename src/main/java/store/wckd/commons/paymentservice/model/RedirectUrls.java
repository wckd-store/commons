package store.wckd.commons.paymentservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedirectUrls {

    @NotNull
    @Size(max = 600)
    private String success = "";

    @NotNull
    @Size(max = 600)
    private String pending = "";

    @NotNull
    @Size(max = 600)
    private String failure = "";

}
