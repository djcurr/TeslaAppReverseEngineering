package b10;

/* loaded from: classes5.dex */
public final class k extends d implements l10.h {

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f7312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u10.f fVar, Class<?> klass) {
        super(fVar, null);
        kotlin.jvm.internal.s.g(klass, "klass");
        this.f7312c = klass;
    }

    @Override // l10.h
    public l10.x b() {
        return w.f7324a.a(this.f7312c);
    }
}