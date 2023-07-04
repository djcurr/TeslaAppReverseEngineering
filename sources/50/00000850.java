package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
class z {

    /* renamed from: a  reason: collision with root package name */
    final b f5711a;

    /* renamed from: b  reason: collision with root package name */
    a f5712b = new a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f5713a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f5714b;

        /* renamed from: c  reason: collision with root package name */
        int f5715c;

        /* renamed from: d  reason: collision with root package name */
        int f5716d;

        /* renamed from: e  reason: collision with root package name */
        int f5717e;

        a() {
        }

        void a(int i11) {
            this.f5713a = i11 | this.f5713a;
        }

        boolean b() {
            int i11 = this.f5713a;
            if ((i11 & 7) == 0 || (i11 & (c(this.f5716d, this.f5714b) << 0)) != 0) {
                int i12 = this.f5713a;
                if ((i12 & 112) == 0 || (i12 & (c(this.f5716d, this.f5715c) << 4)) != 0) {
                    int i13 = this.f5713a;
                    if ((i13 & 1792) == 0 || (i13 & (c(this.f5717e, this.f5714b) << 8)) != 0) {
                        int i14 = this.f5713a;
                        return (i14 & 28672) == 0 || (i14 & (c(this.f5717e, this.f5715c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        int c(int i11, int i12) {
            if (i11 > i12) {
                return 1;
            }
            return i11 == i12 ? 2 : 4;
        }

        void d() {
            this.f5713a = 0;
        }

        void e(int i11, int i12, int i13, int i14) {
            this.f5714b = i11;
            this.f5715c = i12;
            this.f5716d = i13;
            this.f5717e = i14;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        View a(int i11);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(b bVar) {
        this.f5711a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i11, int i12, int i13, int i14) {
        int c11 = this.f5711a.c();
        int d11 = this.f5711a.d();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View a11 = this.f5711a.a(i11);
            this.f5712b.e(c11, d11, this.f5711a.b(a11), this.f5711a.e(a11));
            if (i13 != 0) {
                this.f5712b.d();
                this.f5712b.a(i13);
                if (this.f5712b.b()) {
                    return a11;
                }
            }
            if (i14 != 0) {
                this.f5712b.d();
                this.f5712b.a(i14);
                if (this.f5712b.b()) {
                    view = a11;
                }
            }
            i11 += i15;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i11) {
        this.f5712b.e(this.f5711a.c(), this.f5711a.d(), this.f5711a.b(view), this.f5711a.e(view));
        if (i11 != 0) {
            this.f5712b.d();
            this.f5712b.a(i11);
            return this.f5712b.b();
        }
        return false;
    }
}