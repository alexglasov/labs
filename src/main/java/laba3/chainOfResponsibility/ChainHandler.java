package laba3.chainOfResponsibility;

import lombok.NonNull;

public interface ChainHandler {
    void process(@NonNull Request request);

    ChainHandler next();

    ChainHandler next(ChainHandler chainHandler);
}