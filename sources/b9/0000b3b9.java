package t0;

import ch.qos.logback.core.CoreConstants;
import f2.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final f f51245a;

    /* renamed from: b  reason: collision with root package name */
    private e f51246b;

    /* renamed from: c  reason: collision with root package name */
    private o f51247c;

    public a(f bringRectangleOnScreenRequester, e parent, o oVar) {
        s.g(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        s.g(parent, "parent");
        this.f51245a = bringRectangleOnScreenRequester;
        this.f51246b = parent;
        this.f51247c = oVar;
    }

    public final f a() {
        return this.f51245a;
    }

    public final o b() {
        return this.f51247c;
    }

    public final e c() {
        return this.f51246b;
    }

    public final void d(o oVar) {
        this.f51247c = oVar;
    }

    public final void e(e eVar) {
        s.g(eVar, "<set-?>");
        this.f51246b = eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f51245a, aVar.f51245a) && s.c(this.f51246b, aVar.f51246b) && s.c(this.f51247c, aVar.f51247c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f51245a.hashCode() * 31) + this.f51246b.hashCode()) * 31;
        o oVar = this.f51247c;
        return hashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public String toString() {
        return "BringIntoViewData(bringRectangleOnScreenRequester=" + this.f51245a + ", parent=" + this.f51246b + ", layoutCoordinates=" + this.f51247c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a(f fVar, e eVar, o oVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? e.f51264j1.b() : eVar, (i11 & 4) != 0 ? null : oVar);
    }
}