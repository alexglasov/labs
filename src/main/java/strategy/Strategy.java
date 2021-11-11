package strategy;

import lombok.NonNull;

import java.util.List;

public interface Strategy {
    @NonNull
    String process(@NonNull List<String> strings);
}
