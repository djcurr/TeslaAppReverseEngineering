package e10;

import java.util.EnumMap;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<a, q> f24502a;

    public w(EnumMap<a, q> defaultQualifiers) {
        kotlin.jvm.internal.s.g(defaultQualifiers, "defaultQualifiers");
        this.f24502a = defaultQualifiers;
    }

    public final q a(a aVar) {
        return this.f24502a.get(aVar);
    }

    public final EnumMap<a, q> b() {
        return this.f24502a;
    }
}