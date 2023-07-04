package kotlin.reflect.jvm.internal.impl.types.checker;

import k20.d0;

/* loaded from: classes5.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f35179a;

    /* renamed from: b  reason: collision with root package name */
    private final t f35180b;

    public t(d0 type, t tVar) {
        kotlin.jvm.internal.s.g(type, "type");
        this.f35179a = type;
        this.f35180b = tVar;
    }

    public final t a() {
        return this.f35180b;
    }

    public final d0 b() {
        return this.f35179a;
    }
}