package store.wckd.commons.dto;

import store.wckd.commons.enumeration.ResposeStatus;

public class ResponseDTO<T> {

    private ResposeStatus status;
    private T data;

}
