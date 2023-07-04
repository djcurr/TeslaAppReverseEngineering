package kz;

import io.sentry.protocol.e;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class c {
    public static e.b a(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return e.b.LANDSCAPE;
        }
        return e.b.PORTRAIT;
    }
}