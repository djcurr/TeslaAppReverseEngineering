package net.time4j.format;

import java.util.Objects;

/* loaded from: classes5.dex */
final class q<A> implements net.time4j.engine.c<A> {

    /* renamed from: a  reason: collision with root package name */
    private final String f41259a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<A> f41260b;

    private q(String str, Class<A> cls) {
        Objects.requireNonNull(str, "Missing name of attribute key.");
        Objects.requireNonNull(cls, "Missing type of attribute.");
        this.f41259a = str;
        this.f41260b = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <A> q<A> a(String str, Class<A> cls) {
        return new q<>(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f41259a.equals(qVar.f41259a) && this.f41260b.equals(qVar.f41260b);
        }
        return false;
    }

    public int hashCode() {
        return this.f41259a.hashCode();
    }

    @Override // net.time4j.engine.c
    public String name() {
        return this.f41259a;
    }

    public String toString() {
        return this.f41260b.getName() + "@" + this.f41259a;
    }

    @Override // net.time4j.engine.c
    public Class<A> type() {
        return this.f41260b;
    }
}