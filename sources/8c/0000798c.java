package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class m implements a0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f32325b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final h0 f32326a;

    public m(h0 h0Var) {
        this.f32326a = h0Var;
    }

    private j2 b(byte[] bArr, int i11, int i12) {
        return (j2) this.f32326a.c(new StringReader(new String(bArr, i11, i12, f32325b)), j2.class);
    }

    private a3 c(byte[] bArr, int i11, int i12) {
        return (a3) this.f32326a.c(new StringReader(new String(bArr, i11, i12, f32325b)), a3.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        r11 = new io.sentry.i2(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.i2 a(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.m.a(java.io.InputStream):io.sentry.i2");
    }
}