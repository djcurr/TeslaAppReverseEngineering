package kx;

import java.util.Objects;
import retrofit2.s;

/* loaded from: classes5.dex */
public final class d<T> {
    private d(s<T> sVar, Throwable th2) {
    }

    public static <T> d<T> a(Throwable th2) {
        Objects.requireNonNull(th2, "error == null");
        return new d<>(null, th2);
    }

    public static <T> d<T> b(s<T> sVar) {
        Objects.requireNonNull(sVar, "response == null");
        return new d<>(sVar, null);
    }
}