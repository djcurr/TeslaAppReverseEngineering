package l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.i0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f35990c;

    /* renamed from: d  reason: collision with root package name */
    h0 f35991d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35992e;

    /* renamed from: b  reason: collision with root package name */
    private long f35989b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f35993f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<g0> f35988a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f35994a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f35995b = 0;

        a() {
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            int i11 = this.f35995b + 1;
            this.f35995b = i11;
            if (i11 == h.this.f35988a.size()) {
                h0 h0Var = h.this.f35991d;
                if (h0Var != null) {
                    h0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.i0, androidx.core.view.h0
        public void c(View view) {
            if (this.f35994a) {
                return;
            }
            this.f35994a = true;
            h0 h0Var = h.this.f35991d;
            if (h0Var != null) {
                h0Var.c(null);
            }
        }

        void d() {
            this.f35995b = 0;
            this.f35994a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f35992e) {
            Iterator<g0> it2 = this.f35988a.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
            this.f35992e = false;
        }
    }

    void b() {
        this.f35992e = false;
    }

    public h c(g0 g0Var) {
        if (!this.f35992e) {
            this.f35988a.add(g0Var);
        }
        return this;
    }

    public h d(g0 g0Var, g0 g0Var2) {
        this.f35988a.add(g0Var);
        g0Var2.h(g0Var.c());
        this.f35988a.add(g0Var2);
        return this;
    }

    public h e(long j11) {
        if (!this.f35992e) {
            this.f35989b = j11;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f35992e) {
            this.f35990c = interpolator;
        }
        return this;
    }

    public h g(h0 h0Var) {
        if (!this.f35992e) {
            this.f35991d = h0Var;
        }
        return this;
    }

    public void h() {
        if (this.f35992e) {
            return;
        }
        Iterator<g0> it2 = this.f35988a.iterator();
        while (it2.hasNext()) {
            g0 next = it2.next();
            long j11 = this.f35989b;
            if (j11 >= 0) {
                next.d(j11);
            }
            Interpolator interpolator = this.f35990c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f35991d != null) {
                next.f(this.f35993f);
            }
            next.j();
        }
        this.f35992e = true;
    }
}