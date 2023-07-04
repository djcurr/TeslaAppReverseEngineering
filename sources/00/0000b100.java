package rr;

import ch.qos.logback.core.CoreConstants;
import h00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.u;
import wz.v;
import wz.x;

/* loaded from: classes2.dex */
public final class b<StackedT> {

    /* renamed from: a  reason: collision with root package name */
    private final List<StackedT> f49644a;

    /* renamed from: b  reason: collision with root package name */
    private final StackedT f49645b;

    /* renamed from: c  reason: collision with root package name */
    private final List<StackedT> f49646c;

    public b(StackedT bottom, List<? extends StackedT> rest) {
        List d11;
        List<StackedT> y02;
        s.g(bottom, "bottom");
        s.g(rest, "rest");
        d11 = v.d(bottom);
        y02 = e0.y0(d11, rest);
        this.f49644a = y02;
        this.f49645b = (StackedT) u.n0(y02);
        this.f49646c = y02.subList(0, y02.size() - 1);
    }

    public final List<StackedT> a() {
        return this.f49646c;
    }

    public final List<StackedT> b() {
        return this.f49644a;
    }

    public final StackedT c() {
        return this.f49645b;
    }

    public final <R> b<R> d(l<? super StackedT, ? extends R> transform) {
        int t11;
        s.g(transform, "transform");
        List<StackedT> list = this.f49644a;
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (StackedT stackedt : list) {
            arrayList.add(transform.invoke(stackedt));
        }
        return c.a(arrayList);
    }

    public boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return s.c(bVar != null ? bVar.f49644a : null, this.f49644a);
    }

    public int hashCode() {
        return this.f49644a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) b.class.getSimpleName());
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb2.append(this.f49644a);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(StackedT r2, StackedT... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "bottom"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "rest"
            kotlin.jvm.internal.s.g(r3, r0)
            java.util.List r3 = wz.l.s0(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.b.<init>(java.lang.Object, java.lang.Object[]):void");
    }
}