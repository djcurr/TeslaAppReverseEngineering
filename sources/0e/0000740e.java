package i10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l10.n;
import l10.p;
import l10.q;
import l10.r;
import l10.w;
import wz.e0;
import wz.r0;
import wz.x;

/* loaded from: classes5.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l10.g f29557a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<q, Boolean> f29558b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<r, Boolean> f29559c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<u10.f, List<r>> f29560d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<u10.f, n> f29561e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<u10.f, w> f29562f;

    /* renamed from: i10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0566a extends u implements h00.l<r, Boolean> {
        C0566a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(r m11) {
            s.g(m11, "m");
            return Boolean.valueOf(((Boolean) a.this.f29558b.invoke(m11)).booleanValue() && !p.c(m11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(l10.g jClass, h00.l<? super q, Boolean> memberFilter) {
        u20.h S;
        u20.h q11;
        u20.h S2;
        u20.h q12;
        int t11;
        int e11;
        int d11;
        s.g(jClass, "jClass");
        s.g(memberFilter, "memberFilter");
        this.f29557a = jClass;
        this.f29558b = memberFilter;
        C0566a c0566a = new C0566a();
        this.f29559c = c0566a;
        S = e0.S(jClass.A());
        q11 = u20.p.q(S, c0566a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : q11) {
            u10.f name = ((r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f29560d = linkedHashMap;
        S2 = e0.S(this.f29557a.getFields());
        q12 = u20.p.q(S2, this.f29558b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : q12) {
            linkedHashMap2.put(((n) obj3).getName(), obj3);
        }
        this.f29561e = linkedHashMap2;
        Collection<w> n11 = this.f29557a.n();
        h00.l<q, Boolean> lVar = this.f29558b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : n11) {
            if (((Boolean) lVar.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        t11 = x.t(arrayList, 10);
        e11 = r0.e(t11);
        d11 = m00.l.d(e11, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(d11);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((w) obj5).getName(), obj5);
        }
        this.f29562f = linkedHashMap3;
    }

    @Override // i10.b
    public Set<u10.f> a() {
        u20.h S;
        u20.h<r> q11;
        S = e0.S(this.f29557a.A());
        q11 = u20.p.q(S, this.f29559c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar : q11) {
            linkedHashSet.add(rVar.getName());
        }
        return linkedHashSet;
    }

    @Override // i10.b
    public w b(u10.f name) {
        s.g(name, "name");
        return this.f29562f.get(name);
    }

    @Override // i10.b
    public Set<u10.f> c() {
        return this.f29562f.keySet();
    }

    @Override // i10.b
    public Set<u10.f> d() {
        u20.h S;
        u20.h<n> q11;
        S = e0.S(this.f29557a.getFields());
        q11 = u20.p.q(S, this.f29558b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : q11) {
            linkedHashSet.add(nVar.getName());
        }
        return linkedHashSet;
    }

    @Override // i10.b
    public n e(u10.f name) {
        s.g(name, "name");
        return this.f29561e.get(name);
    }

    @Override // i10.b
    public Collection<r> f(u10.f name) {
        List i11;
        s.g(name, "name");
        List<r> list = this.f29560d.get(name);
        if (list == null) {
            i11 = wz.w.i();
            return i11;
        }
        return list;
    }
}