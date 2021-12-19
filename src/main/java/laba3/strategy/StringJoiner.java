package laba3.strategy;

import lombok.NonNull;

import java.util.List;

public class StringJoiner implements StrategyService {
    private Strategy strategy;

    public StringJoiner(
            @NonNull Strategy strategy
    )
    {
        this.strategy = strategy;
    }

    @Override
    @NonNull
    public String exec(@NonNull List<String> strings) {
        String result = "";

        if (strings.isEmpty()) {
            return result;
        }

        return strategy.process(strings);
    }

    public StrategyService setStrategy(
            @NonNull Strategy strategy
    )
    {
        this.strategy = strategy;
        return this;
    }
}
