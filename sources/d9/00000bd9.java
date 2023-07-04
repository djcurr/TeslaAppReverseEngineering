package b10;

/* loaded from: classes5.dex */
public final class o extends d implements l10.m {

    /* renamed from: c  reason: collision with root package name */
    private final Enum<?> f7316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u10.f fVar, Enum<?> value) {
        super(fVar, null);
        kotlin.jvm.internal.s.g(value, "value");
        this.f7316c = value;
    }

    @Override // l10.m
    public u10.b d() {
        Class<?> enumClass = this.f7316c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        kotlin.jvm.internal.s.f(enumClass, "enumClass");
        return b.a(enumClass);
    }

    @Override // l10.m
    public u10.f e() {
        return u10.f.f(this.f7316c.name());
    }
}