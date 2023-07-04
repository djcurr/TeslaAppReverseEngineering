package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* loaded from: classes5.dex */
public interface h0 {
    <T> void a(T t11, Writer writer);

    void b(i2 i2Var, OutputStream outputStream);

    <T> T c(Reader reader, Class<T> cls);

    i2 d(InputStream inputStream);

    String e(Map<String, Object> map);
}