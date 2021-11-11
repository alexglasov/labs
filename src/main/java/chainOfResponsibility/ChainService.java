package chainOfResponsibility;

import lombok.NonNull;

public class ChainService {
    public Request exec(
            @NonNull String inputStream
    )
    {
        Request request = new Request();
        request.setInputStream(inputStream);

        ChainHandler handler = new HeadersChainHandler();
        handler.next(new MethodChainHandler())
                .next(new PathChainHandler())
                .next(new SessionChainHandler());

        handler.process(request);

        return request;
    }
}
