package e00;

import java.io.Closeable;

/* loaded from: classes5.dex */
public final class b {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                vz.f.a(th2, th3);
            }
        }
    }
}