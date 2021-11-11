package strategy;

import lombok.NonNull;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class SemicolonSeparatedStrategy implements Strategy {
    @NonNull
    @Override
    public String process(
            @NonNull List<String> strings
    ) {
        return StringUtils.join(strings, ";");
    }

}
