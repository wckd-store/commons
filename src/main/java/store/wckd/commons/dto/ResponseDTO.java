package store.wckd.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import store.wckd.commons.enumeration.ResposeStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {

    private ResposeStatus status;
    private T data;

    public static <T> ResponseDTO<T> ok(T data) {
        return new ResponseDTO<>(ResposeStatus.OK, data);
    }

    public static <T> ResponseDTO<T> error(T data) {
        return new ResponseDTO<>(ResposeStatus.ERROR, data);
    }

}
