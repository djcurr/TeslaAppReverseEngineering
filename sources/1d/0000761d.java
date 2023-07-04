package io.grpc.internal;

import io.grpc.t0;
import java.net.URI;

/* loaded from: classes5.dex */
public final class d0 extends io.grpc.u0 {
    @Override // io.grpc.t0.d
    public String a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.u0
    public boolean d() {
        return true;
    }

    @Override // io.grpc.u0
    public int e() {
        return 5;
    }

    @Override // io.grpc.t0.d
    /* renamed from: f */
    public c0 b(URI uri, t0.b bVar) {
        if ("dns".equals(uri.getScheme())) {
            String str = (String) com.google.common.base.u.p(uri.getPath(), "targetPath");
            com.google.common.base.u.l(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
            return new c0(uri.getAuthority(), str.substring(1), bVar, q0.f31172o, com.google.common.base.y.c(), io.grpc.i0.a(d0.class.getClassLoader()));
        }
        return null;
    }
}