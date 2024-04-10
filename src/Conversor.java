import java.util.List;

public record Conversor(
    String base_code,
    String target_code,
    Double conversion_rate
) {
}
