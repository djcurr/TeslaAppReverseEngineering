package e00;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
final class d extends ByteArrayOutputStream {
    public d(int i11) {
        super(i11);
    }

    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        s.f(buf, "buf");
        return buf;
    }
}