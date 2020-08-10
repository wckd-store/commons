package store.wckd.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Serializable {

    @Size(max = 256)
    private String id = "";

    @Size(max = 256)
    private String title = "";

    @Size(max = 256)
    private String description = "";

    @Size(max = 600)
    private String pictureUrl = "";

    @Size(max = 256)
    private String categoryId = "";

    @NotNull
    private Integer quantity = 1;

    @NotNull
    @Size(max = 3)
    private String currencyId = "BRL";

    @NotNull
    private Float unitPrice;

}
