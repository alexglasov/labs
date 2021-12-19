package laba3.strategy;

import lombok.NonNull;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class CommaSeparatedStrategy implements Strategy {
    @NonNull
    @Override
    public String process(
            @NonNull List<String> strings
    )
    {
        return StringUtils.join(strings, ",");
    }
}
