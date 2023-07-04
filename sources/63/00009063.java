package on;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class j {
    private static String a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String b(int i11) {
        if (i11 == 0 || i11 == 1) {
            return "h:mm:ss a z";
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return "h:mm a";
            }
            throw new IllegalArgumentException("Unknown DateFormat style: " + i11);
        }
        return "h:mm:ss a";
    }

    public static DateFormat c(int i11, int i12) {
        return new SimpleDateFormat(a(i11) + " " + b(i12), Locale.US);
    }
}