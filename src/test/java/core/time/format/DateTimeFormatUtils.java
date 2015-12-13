package core.time.format;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public interface DateTimeFormatUtils {

	default DateTimeFormatter customLocalFormatter(String pattern) {
		return DateTimeFormatter.ofPattern(pattern, Locale.US);
	}
}
