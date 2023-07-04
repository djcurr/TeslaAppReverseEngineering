package md;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Logger f38480a = Logger.getLogger(b.class.getName());

    private b() {
    }

    public static void a(Closeable closeable, boolean z11) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e11) {
            if (z11) {
                f38480a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e11);
                return;
            }
            throw e11;
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }
}