package chainOfResponsibility;

import lombok.NonNull;

public class PathChainHandler extends AbstractChainHandler {
    private static final String KEY = "path";

    @Override
    public void handle(
            @NonNull Request request
    )
    {
        if(request.getHeaders().containsKey(KEY)) {
            request.setPath(request.getHeaders().get(KEY));
        }
    }
}
