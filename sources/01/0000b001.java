package r2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f49110a;

    /* renamed from: b  reason: collision with root package name */
    private final l f49111b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49112c;

    private p(int i11, l lVar, int i12) {
        this.f49110a = i11;
        this.f49111b = lVar;
        this.f49112c = i12;
    }

    public /* synthetic */ p(int i11, l lVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, lVar, i12);
    }

    @Override // r2.d
    public l a() {
        return this.f49111b;
    }

    @Override // r2.d
    public int c() {
        return this.f49112c;
    }

    public final int d() {
        return this.f49110a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f49110a == pVar.f49110a && s.c(a(), pVar.a()) && j.f(c(), pVar.c());
        }
        return false;
    }

    public int hashCode() {
        return (((this.f49110a * 31) + a().hashCode()) * 31) + j.g(c());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f49110a + ", weight=" + a() + ", style=" + ((Object) j.h(c())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}