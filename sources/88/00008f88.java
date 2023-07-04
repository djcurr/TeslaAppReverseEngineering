package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import m00.l;
import okio.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lokio/f;", "", "isProbablyUtf8", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(f isProbablyUtf8) {
        long j11;
        s.g(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            f fVar = new f();
            j11 = l.j(isProbablyUtf8.P0(), 64L);
            isProbablyUtf8.m(fVar, 0L, j11);
            for (int i11 = 0; i11 < 16; i11++) {
                if (fVar.N0()) {
                    return true;
                }
                int I0 = fVar.I0();
                if (Character.isISOControl(I0) && !Character.isWhitespace(I0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}