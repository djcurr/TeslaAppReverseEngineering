package s0;

import h2.j0;
import java.util.List;
import java.util.Map;
import vz.b0;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final j0<f> f49796a;

    /* renamed from: b  reason: collision with root package name */
    private final c<h> f49797b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Integer> f49798c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, Integer> f49799d;

    public l(j0<f> itemScope, c<h> list, List<Integer> headerIndexes, m00.i nearestItemsRange) {
        kotlin.jvm.internal.s.g(itemScope, "itemScope");
        kotlin.jvm.internal.s.g(list, "list");
        kotlin.jvm.internal.s.g(headerIndexes, "headerIndexes");
        kotlin.jvm.internal.s.g(nearestItemsRange, "nearestItemsRange");
        this.f49796a = itemScope;
        this.f49797b = list;
        this.f49798c = headerIndexes;
        this.f49799d = m.c(nearestItemsRange, list);
    }

    @Override // r0.f
    public Map<Object, Integer> a() {
        return this.f49799d;
    }

    @Override // r0.f
    public h00.p<c1.i, Integer, b0> b(int i11) {
        b b11 = d.b(this.f49797b, i11);
        int c11 = i11 - b11.c();
        h00.p<q0.d, Integer, h00.p<c1.i, Integer, b0>> a11 = ((h) b11.a()).a();
        f a12 = this.f49796a.a();
        kotlin.jvm.internal.s.e(a12);
        return a11.invoke(a12, Integer.valueOf(c11));
    }

    @Override // r0.f
    public int c() {
        return this.f49797b.b();
    }

    @Override // r0.f
    public Object d(int i11) {
        b b11 = d.b(this.f49797b, i11);
        int c11 = i11 - b11.c();
        h00.l<Integer, Object> b12 = ((h) b11.a()).b();
        Object invoke = b12 == null ? null : b12.invoke(Integer.valueOf(c11));
        return invoke == null ? q0.j.a(i11) : invoke;
    }

    @Override // s0.k
    public List<Integer> e() {
        return this.f49798c;
    }
}