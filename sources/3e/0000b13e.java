package rz;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class j {
    public static <T> T a(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new IllegalArgumentException(str);
    }
}