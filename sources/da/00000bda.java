package b10;

import b10.w;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class p extends r implements l10.n {

    /* renamed from: a  reason: collision with root package name */
    private final Field f7317a;

    public p(Field member) {
        kotlin.jvm.internal.s.g(member, "member");
        this.f7317a = member;
    }

    @Override // l10.n
    public boolean H() {
        return S().isEnumConstant();
    }

    @Override // l10.n
    public boolean N() {
        return false;
    }

    @Override // b10.r
    /* renamed from: U */
    public Field S() {
        return this.f7317a;
    }

    @Override // l10.n
    /* renamed from: V */
    public w getType() {
        w.a aVar = w.f7324a;
        Type genericType = S().getGenericType();
        kotlin.jvm.internal.s.f(genericType, "member.genericType");
        return aVar.a(genericType);
    }
}