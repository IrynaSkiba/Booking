package itechart.booking;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
public class MyResponse<T> {
    private int code;
    @Nullable
    private T data;
    @Nullable
    private String errorContent;

    public MyResponse(int code, T data, String errorContent) {
        this.code = code;
        this.data = data;
        this.errorContent = errorContent;
    }

    public MyResponse() {
    }

    @Override
    public String toString() {
        return "{" +
                "\"code\":" + code +
                ", \"data\":" + data +
                ", \"error-content\":\"" + errorContent + '\"' +
                '}';
    }

}
