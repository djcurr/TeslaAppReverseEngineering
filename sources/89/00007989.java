package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class l1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f32322a;

    private l1(Class<T> cls) {
        this.f32322a = cls;
    }

    public static <T> l1<T> a(Class<T> cls) {
        return new l1<>(cls);
    }

    public T b() {
        return this.f32322a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}