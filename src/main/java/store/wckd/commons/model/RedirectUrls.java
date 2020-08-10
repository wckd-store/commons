package store.wckd.commons.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedirectUrls implements Serializable {

    private String success = "";
    private String pending = "";
    private String failure = "";

}
