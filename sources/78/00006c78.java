package ezvcard.util;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class f {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}