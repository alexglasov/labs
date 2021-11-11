package chainOfResponsibility;

import lombok.NonNull;
import org.apache.commons.lang.StringUtils;

import java.util.stream.Stream;

public class HeadersChainHandler extends AbstractChainHandler {
    private static final String DELIMITER = ":";

    @Override
    void handle(
            @NonNull Request request
    )
    {
        String[] headers = StringUtils.split(request.getInputStream(), "\n");

        for (String header : headers) {
            if (header.isEmpty()) {
                return;
            }

            String[] arr = StringUtils.split(header, DELIMITER);

            if (arr.length != 0) {
                request.getHeaders().put(arr[0].trim(), arr[1].trim());
            }
        }
    }
}
