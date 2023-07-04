package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* loaded from: classes5.dex */
final class g1 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final g1 f32260a = new g1();

    private g1() {
    }

    public static g1 f() {
        return f32260a;
    }

    @Override // io.sentry.h0
    public <T> void a(T t11, Writer writer) {
    }

    @Override // io.sentry.h0
    public void b(i2 i2Var, OutputStream outputStream) {
    }

    @Override // io.sentry.h0
    public <T> T c(Reader reader, Class<T> cls) {
        return null;
    }

    @Override // io.sentry.h0
    public i2 d(InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.h0
    public String e(Map<String, Object> map) {
        return "";
    }
}