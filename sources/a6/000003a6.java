package androidx.camera.core.internal;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.f1;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.o;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;
import androidx.camera.core.n0;
import d0.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import z.d;
import z.z0;

/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements z.b {

    /* renamed from: a  reason: collision with root package name */
    private s f2395a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet<s> f2396b;

    /* renamed from: c  reason: collision with root package name */
    private final p f2397c;

    /* renamed from: d  reason: collision with root package name */
    private final q1 f2398d;

    /* renamed from: e  reason: collision with root package name */
    private final a f2399e;

    /* renamed from: g  reason: collision with root package name */
    private z0 f2401g;

    /* renamed from: f  reason: collision with root package name */
    private final List<f1> f2400f = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private n f2402h = o.a();

    /* renamed from: i  reason: collision with root package name */
    private final Object f2403i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f2404j = true;

    /* renamed from: k  reason: collision with root package name */
    private d0 f2405k = null;

    /* loaded from: classes.dex */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f2406a = new ArrayList();

        a(LinkedHashSet<s> linkedHashSet) {
            Iterator<s> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                this.f2406a.add(it2.next().i().a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f2406a.equals(((a) obj).f2406a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2406a.hashCode() * 53;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        p1<?> f2407a;

        /* renamed from: b  reason: collision with root package name */
        p1<?> f2408b;

        b(p1<?> p1Var, p1<?> p1Var2) {
            this.f2407a = p1Var;
            this.f2408b = p1Var2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<s> linkedHashSet, p pVar, q1 q1Var) {
        this.f2395a = linkedHashSet.iterator().next();
        LinkedHashSet<s> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f2396b = linkedHashSet2;
        this.f2399e = new a(linkedHashSet2);
        this.f2397c = pVar;
        this.f2398d = q1Var;
    }

    private void g() {
        synchronized (this.f2403i) {
            CameraControlInternal e11 = this.f2395a.e();
            this.f2405k = e11.e();
            e11.j();
        }
    }

    private Map<f1, Size> k(r rVar, List<f1> list, List<f1> list2, Map<f1, b> map) {
        ArrayList arrayList = new ArrayList();
        String a11 = rVar.a();
        HashMap hashMap = new HashMap();
        for (f1 f1Var : list2) {
            arrayList.add(this.f2397c.a(a11, f1Var.h(), f1Var.b()));
            hashMap.put(f1Var, f1Var.b());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (f1 f1Var2 : list) {
                b bVar = map.get(f1Var2);
                hashMap2.put(f1Var2.p(rVar, bVar.f2407a, bVar.f2408b), f1Var2);
            }
            Map<p1<?>, Size> b11 = this.f2397c.b(a11, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((f1) entry.getValue(), b11.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    public static a m(LinkedHashSet<s> linkedHashSet) {
        return new a(linkedHashSet);
    }

    private Map<f1, b> o(List<f1> list, q1 q1Var, q1 q1Var2) {
        HashMap hashMap = new HashMap();
        for (f1 f1Var : list) {
            hashMap.put(f1Var, new b(f1Var.g(false, q1Var), f1Var.g(true, q1Var2)));
        }
        return hashMap;
    }

    private void r() {
        synchronized (this.f2403i) {
            if (this.f2405k != null) {
                this.f2395a.e().f(this.f2405k);
            }
        }
    }

    private void t(Map<f1, Size> map, Collection<f1> collection) {
        synchronized (this.f2403i) {
            if (this.f2401g != null) {
                Map<f1, Rect> a11 = h.a(this.f2395a.e().b(), this.f2395a.i().c().intValue() == 0, this.f2401g.a(), this.f2395a.i().h(this.f2401g.c()), this.f2401g.d(), this.f2401g.b(), map);
                for (f1 f1Var : collection) {
                    f1Var.F((Rect) v3.h.f(a11.get(f1Var)));
                }
            }
        }
    }

    @Override // z.b
    public CameraControl a() {
        return this.f2395a.e();
    }

    @Override // z.b
    public d b() {
        return this.f2395a.i();
    }

    public void c(Collection<f1> collection) {
        synchronized (this.f2403i) {
            ArrayList<f1> arrayList = new ArrayList();
            for (f1 f1Var : collection) {
                if (this.f2400f.contains(f1Var)) {
                    n0.a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(f1Var);
                }
            }
            Map<f1, b> o11 = o(arrayList, this.f2402h.j(), this.f2398d);
            try {
                Map<f1, Size> k11 = k(this.f2395a.i(), arrayList, this.f2400f, o11);
                t(k11, collection);
                for (f1 f1Var2 : arrayList) {
                    b bVar = o11.get(f1Var2);
                    f1Var2.v(this.f2395a, bVar.f2407a, bVar.f2408b);
                    f1Var2.H((Size) v3.h.f(k11.get(f1Var2)));
                }
                this.f2400f.addAll(arrayList);
                if (this.f2404j) {
                    this.f2395a.f(arrayList);
                }
                for (f1 f1Var3 : arrayList) {
                    f1Var3.t();
                }
            } catch (IllegalArgumentException e11) {
                throw new CameraException(e11.getMessage());
            }
        }
    }

    public void d() {
        synchronized (this.f2403i) {
            if (!this.f2404j) {
                this.f2395a.f(this.f2400f);
                r();
                for (f1 f1Var : this.f2400f) {
                    f1Var.t();
                }
                this.f2404j = true;
            }
        }
    }

    public void l() {
        synchronized (this.f2403i) {
            if (this.f2404j) {
                g();
                this.f2395a.h(new ArrayList(this.f2400f));
                this.f2404j = false;
            }
        }
    }

    public a n() {
        return this.f2399e;
    }

    public List<f1> p() {
        ArrayList arrayList;
        synchronized (this.f2403i) {
            arrayList = new ArrayList(this.f2400f);
        }
        return arrayList;
    }

    public void q(Collection<f1> collection) {
        synchronized (this.f2403i) {
            this.f2395a.h(collection);
            for (f1 f1Var : collection) {
                if (this.f2400f.contains(f1Var)) {
                    f1Var.y(this.f2395a);
                } else {
                    n0.c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + f1Var);
                }
            }
            this.f2400f.removeAll(collection);
        }
    }

    public void s(z0 z0Var) {
        synchronized (this.f2403i) {
            this.f2401g = z0Var;
        }
    }
}