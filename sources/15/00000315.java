package androidx.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class c1 implements androidx.camera.core.impl.q0 {

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f2180e;

    /* renamed from: f  reason: collision with root package name */
    private String f2181f;

    /* renamed from: a  reason: collision with root package name */
    final Object f2176a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final SparseArray<b.a<g0>> f2177b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<com.google.common.util.concurrent.c<g0>> f2178c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final List<g0> f2179d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f2182g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.c<g0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f2183a;

        a(int i11) {
            this.f2183a = i11;
        }

        @Override // androidx.concurrent.futures.b.c
        public Object a(b.a<g0> aVar) {
            synchronized (c1.this.f2176a) {
                c1.this.f2177b.put(this.f2183a, aVar);
            }
            return "getImageProxy(id: " + this.f2183a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(List<Integer> list, String str) {
        this.f2181f = null;
        this.f2180e = list;
        this.f2181f = str;
        f();
    }

    private void f() {
        synchronized (this.f2176a) {
            for (Integer num : this.f2180e) {
                int intValue = num.intValue();
                this.f2178c.put(intValue, androidx.concurrent.futures.b.a(new a(intValue)));
            }
        }
    }

    @Override // androidx.camera.core.impl.q0
    public List<Integer> a() {
        return Collections.unmodifiableList(this.f2180e);
    }

    @Override // androidx.camera.core.impl.q0
    public com.google.common.util.concurrent.c<g0> b(int i11) {
        com.google.common.util.concurrent.c<g0> cVar;
        synchronized (this.f2176a) {
            if (!this.f2182g) {
                cVar = this.f2178c.get(i11);
                if (cVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i11);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(g0 g0Var) {
        synchronized (this.f2176a) {
            if (this.f2182g) {
                return;
            }
            Integer c11 = g0Var.l1().a().c(this.f2181f);
            if (c11 != null) {
                b.a<g0> aVar = this.f2177b.get(c11.intValue());
                if (aVar != null) {
                    this.f2179d.add(g0Var);
                    aVar.c(g0Var);
                    return;
                }
                throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + c11);
            }
            throw new IllegalArgumentException("CaptureId is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        synchronized (this.f2176a) {
            if (this.f2182g) {
                return;
            }
            for (g0 g0Var : this.f2179d) {
                g0Var.close();
            }
            this.f2179d.clear();
            this.f2178c.clear();
            this.f2177b.clear();
            this.f2182g = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f2176a) {
            if (this.f2182g) {
                return;
            }
            for (g0 g0Var : this.f2179d) {
                g0Var.close();
            }
            this.f2179d.clear();
            this.f2178c.clear();
            this.f2177b.clear();
            f();
        }
    }
}