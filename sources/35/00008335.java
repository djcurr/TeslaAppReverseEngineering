package ln;

import java.util.Iterator;
import java.util.Set;
import ul.q;

/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a */
    private final String f37241a;

    /* renamed from: b */
    private final d f37242b;

    c(Set<f> set, d dVar) {
        this.f37241a = e(set);
        this.f37242b = dVar;
    }

    public static /* synthetic */ i b(ul.e eVar) {
        return d(eVar);
    }

    public static ul.d<i> c() {
        return ul.d.c(i.class).b(q.l(f.class)).f(new ul.h() { // from class: ln.b
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return c.b(eVar);
            }
        }).d();
    }

    public static /* synthetic */ i d(ul.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it2 = set.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it2.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ln.i
    public String a() {
        if (this.f37242b.b().isEmpty()) {
            return this.f37241a;
        }
        return this.f37241a + ' ' + e(this.f37242b.b());
    }
}