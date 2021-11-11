package chainOfResponsibility;

import lombok.NonNull;

public class MethodChainHandler extends AbstractChainHandler {
    private static final String KEY = "method";

    @Override
    void handle(
            @NonNull Request request
    )
    {
        if (request.getHeaders().containsKey(KEY)) {
            request.setMethod(request.getHeaders().get(KEY));
        }
    }
}
