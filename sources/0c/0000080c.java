package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    final b f5507a;

    /* renamed from: b  reason: collision with root package name */
    final a f5508b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f5509c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f5510a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f5511b;

        a() {
        }

        private void c() {
            if (this.f5511b == null) {
                this.f5511b = new a();
            }
        }

        void a(int i11) {
            if (i11 >= 64) {
                a aVar = this.f5511b;
                if (aVar != null) {
                    aVar.a(i11 - 64);
                    return;
                }
                return;
            }
            this.f5510a &= ~(1 << i11);
        }

        int b(int i11) {
            a aVar = this.f5511b;
            if (aVar == null) {
                if (i11 >= 64) {
                    return Long.bitCount(this.f5510a);
                }
                return Long.bitCount(this.f5510a & ((1 << i11) - 1));
            } else if (i11 < 64) {
                return Long.bitCount(this.f5510a & ((1 << i11) - 1));
            } else {
                return aVar.b(i11 - 64) + Long.bitCount(this.f5510a);
            }
        }

        boolean d(int i11) {
            if (i11 < 64) {
                return (this.f5510a & (1 << i11)) != 0;
            }
            c();
            return this.f5511b.d(i11 - 64);
        }

        void e(int i11, boolean z11) {
            if (i11 >= 64) {
                c();
                this.f5511b.e(i11 - 64, z11);
                return;
            }
            long j11 = this.f5510a;
            boolean z12 = (Long.MIN_VALUE & j11) != 0;
            long j12 = (1 << i11) - 1;
            this.f5510a = ((j11 & (~j12)) << 1) | (j11 & j12);
            if (z11) {
                h(i11);
            } else {
                a(i11);
            }
            if (z12 || this.f5511b != null) {
                c();
                this.f5511b.e(0, z12);
            }
        }

        boolean f(int i11) {
            if (i11 >= 64) {
                c();
                return this.f5511b.f(i11 - 64);
            }
            long j11 = 1 << i11;
            long j12 = this.f5510a;
            boolean z11 = (j12 & j11) != 0;
            long j13 = j12 & (~j11);
            this.f5510a = j13;
            long j14 = j11 - 1;
            this.f5510a = (j13 & j14) | Long.rotateRight((~j14) & j13, 1);
            a aVar = this.f5511b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f5511b.f(0);
            }
            return z11;
        }

        void g() {
            this.f5510a = 0L;
            a aVar = this.f5511b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i11) {
            if (i11 >= 64) {
                c();
                this.f5511b.h(i11 - 64);
                return;
            }
            this.f5510a |= 1 << i11;
        }

        public String toString() {
            if (this.f5511b == null) {
                return Long.toBinaryString(this.f5510a);
            }
            return this.f5511b.toString() + "xx" + Long.toBinaryString(this.f5510a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i11);

        int b();

        void c(View view);

        RecyclerView.e0 d(View view);

        void e(int i11);

        void f(View view, int i11);

        void g();

        int h(View view);

        void i(View view);

        void j(int i11);

        void k(View view, int i11, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar) {
        this.f5507a = bVar;
    }

    private int h(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int b11 = this.f5507a.b();
        int i12 = i11;
        while (i12 < b11) {
            int b12 = i11 - (i12 - this.f5508b.b(i12));
            if (b12 == 0) {
                while (this.f5508b.d(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += b12;
        }
        return -1;
    }

    private void l(View view) {
        this.f5509c.add(view);
        this.f5507a.c(view);
    }

    private boolean t(View view) {
        if (this.f5509c.remove(view)) {
            this.f5507a.i(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i11, boolean z11) {
        int h11;
        if (i11 < 0) {
            h11 = this.f5507a.b();
        } else {
            h11 = h(i11);
        }
        this.f5508b.e(h11, z11);
        if (z11) {
            l(view);
        }
        this.f5507a.f(view, h11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(View view, boolean z11) {
        a(view, -1, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        int h11;
        if (i11 < 0) {
            h11 = this.f5507a.b();
        } else {
            h11 = h(i11);
        }
        this.f5508b.e(h11, z11);
        if (z11) {
            l(view);
        }
        this.f5507a.k(view, h11, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i11) {
        int h11 = h(i11);
        this.f5508b.f(h11);
        this.f5507a.e(h11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i11) {
        int size = this.f5509c.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f5509c.get(i12);
            RecyclerView.e0 d11 = this.f5507a.d(view);
            if (d11.getLayoutPosition() == i11 && !d11.isInvalid() && !d11.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View f(int i11) {
        return this.f5507a.a(h(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f5507a.b() - this.f5509c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View i(int i11) {
        return this.f5507a.a(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f5507a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(View view) {
        int h11 = this.f5507a.h(view);
        if (h11 >= 0) {
            this.f5508b.h(h11);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(View view) {
        int h11 = this.f5507a.h(view);
        if (h11 == -1 || this.f5508b.d(h11)) {
            return -1;
        }
        return h11 - this.f5508b.b(h11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f5509c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.f5508b.g();
        for (int size = this.f5509c.size() - 1; size >= 0; size--) {
            this.f5507a.i(this.f5509c.get(size));
            this.f5509c.remove(size);
        }
        this.f5507a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(View view) {
        int h11 = this.f5507a.h(view);
        if (h11 < 0) {
            return;
        }
        if (this.f5508b.f(h11)) {
            t(view);
        }
        this.f5507a.j(h11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i11) {
        int h11 = h(i11);
        View a11 = this.f5507a.a(h11);
        if (a11 == null) {
            return;
        }
        if (this.f5508b.f(h11)) {
            t(a11);
        }
        this.f5507a.j(h11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(View view) {
        int h11 = this.f5507a.h(view);
        if (h11 == -1) {
            t(view);
            return true;
        } else if (this.f5508b.d(h11)) {
            this.f5508b.f(h11);
            t(view);
            this.f5507a.j(h11);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(View view) {
        int h11 = this.f5507a.h(view);
        if (h11 >= 0) {
            if (this.f5508b.d(h11)) {
                this.f5508b.a(h11);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f5508b.toString() + ", hidden list:" + this.f5509c.size();
    }
}