package io.grpc;

import com.google.common.io.BaseEncoding;
import io.grpc.r0;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f30583a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final BaseEncoding f30584b = r0.f31580e;

    /* loaded from: classes5.dex */
    public interface a<T> extends r0.i<T> {
    }

    public static int a(r0 r0Var) {
        return r0Var.h();
    }

    public static <T> r0.f<T> b(String str, a<T> aVar) {
        boolean z11 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z11 = true;
        }
        return r0.f.g(str, z11, aVar);
    }

    public static r0 c(byte[]... bArr) {
        return new r0(bArr);
    }

    public static byte[][] d(r0 r0Var) {
        return r0Var.p();
    }
}