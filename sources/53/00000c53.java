package bb;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {
    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T extends Collection<Y>, Y> T c(T t11) {
        if (t11.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t11;
    }

    public static <T> T d(T t11) {
        return (T) e(t11, "Argument must not be null");
    }

    public static <T> T e(T t11, String str) {
        Objects.requireNonNull(t11, str);
        return t11;
    }
}