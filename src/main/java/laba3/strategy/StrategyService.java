package laba3.strategy;

import lombok.NonNull;

import java.util.List;

public interface StrategyService {
    String exec(List<String> strings);

    StrategyService setStrategy(@NonNull Strategy strategy);
}
