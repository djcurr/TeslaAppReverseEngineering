package ql;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sl.a;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final sm.b<sl.a> f48356a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48357b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f48358c = null;

    public b(Context context, sm.b<sl.a> bVar, String str) {
        this.f48356a = bVar;
        this.f48357b = str;
    }

    private void a(a.c cVar) {
        this.f48356a.get().g(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g11 = g();
        for (a aVar : list) {
            while (arrayDeque.size() >= g11) {
                i(((a.c) arrayDeque.pollFirst()).f50447b);
            }
            a.c d11 = aVar.d(this.f48357b);
            a(d11);
            arrayDeque.offer(d11);
        }
    }

    private static List<a> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(a.a(map));
        }
        return arrayList;
    }

    private List<a.c> d() {
        return this.f48356a.get().f(this.f48357b, "");
    }

    private ArrayList<a> e(List<a> list, Set<String> set) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!set.contains(aVar.b())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f50447b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f48358c == null) {
            this.f48358c = Integer.valueOf(this.f48356a.get().e(this.f48357b));
        }
        return this.f48358c.intValue();
    }

    private void i(String str) {
        this.f48356a.get().clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f50447b);
        }
    }

    private void l(List<a> list) {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (a aVar : list) {
            hashSet.add(aVar.b());
        }
        List<a.c> d11 = d();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : d11) {
            hashSet2.add(cVar.f50447b);
        }
        j(f(d11, hashSet));
        b(e(list, hashSet2));
    }

    private void m() {
        if (this.f48356a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}