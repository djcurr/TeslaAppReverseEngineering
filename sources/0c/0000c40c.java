package z2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f60073a;

    /* renamed from: b  reason: collision with root package name */
    private final List<h00.l<y, vz.b0>> f60074b;

    /* renamed from: c  reason: collision with root package name */
    private final e f60075c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f60076d;

    /* renamed from: e  reason: collision with root package name */
    private final u f60077e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f60078f;

    /* renamed from: g  reason: collision with root package name */
    private s f60079g;

    /* renamed from: h  reason: collision with root package name */
    private s f60080h;

    public d(Object id2) {
        kotlin.jvm.internal.s.g(id2, "id");
        this.f60073a = id2;
        ArrayList arrayList = new ArrayList();
        this.f60074b = arrayList;
        Integer PARENT = d3.e.f23545e;
        kotlin.jvm.internal.s.f(PARENT, "PARENT");
        this.f60075c = new e(PARENT);
        this.f60076d = new q(id2, -2, arrayList);
        new q(id2, 0, arrayList);
        this.f60077e = new g(id2, 0, arrayList);
        this.f60078f = new q(id2, -1, arrayList);
        new q(id2, 1, arrayList);
        new g(id2, 1, arrayList);
        new f(id2, arrayList);
        s.a aVar = s.f60131a;
        this.f60079g = aVar.a();
        this.f60080h = aVar.a();
        b0.f60065a.a();
        float f11 = 0;
        x2.g.f(f11);
        x2.g.f(f11);
        x2.g.f(f11);
    }

    public final void a(y state) {
        kotlin.jvm.internal.s.g(state, "state");
        Iterator<T> it2 = this.f60074b.iterator();
        while (it2.hasNext()) {
            ((h00.l) it2.next()).invoke(state);
        }
    }

    public final a0 b() {
        return this.f60078f;
    }

    public final e c() {
        return this.f60075c;
    }

    public final a0 d() {
        return this.f60076d;
    }

    public final u e() {
        return this.f60077e;
    }
}