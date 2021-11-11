package chainOfResponsibility;

import lombok.NonNull;

public class SessionChainHandler extends AbstractChainHandler {
    private static final String KEY = "session";

    @Override
    public void handle(
            @NonNull Request request
    )
    {
        if (request.getHeaders().containsKey(KEY)) {
            request.setSession(request.getHeaders().get(KEY));
        }
    }
}
