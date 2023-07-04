package c30;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e {
    public static final <T> a<? extends T> a(g30.b<T> bVar, f30.c decoder, String str) {
        s.g(bVar, "<this>");
        s.g(decoder, "decoder");
        a<? extends T> c11 = bVar.c(decoder, str);
        if (c11 != null) {
            return c11;
        }
        g30.c.a(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final <T> h<T> b(g30.b<T> bVar, f30.f encoder, T value) {
        s.g(bVar, "<this>");
        s.g(encoder, "encoder");
        s.g(value, "value");
        h<T> d11 = bVar.d(encoder, value);
        if (d11 != null) {
            return d11;
        }
        g30.c.b(m0.b(value.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}