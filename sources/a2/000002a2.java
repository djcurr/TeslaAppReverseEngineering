package androidx.appcompat.widget;

/* loaded from: classes.dex */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1855a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1856b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1857c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f1858d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f1859e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1860f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1861g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1862h = false;

    public int a() {
        return this.f1861g ? this.f1855a : this.f1856b;
    }

    public int b() {
        return this.f1855a;
    }

    public int c() {
        return this.f1856b;
    }

    public int d() {
        return this.f1861g ? this.f1856b : this.f1855a;
    }

    public void e(int i11, int i12) {
        this.f1862h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f1859e = i11;
            this.f1855a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f1860f = i12;
            this.f1856b = i12;
        }
    }

    public void f(boolean z11) {
        if (z11 == this.f1861g) {
            return;
        }
        this.f1861g = z11;
        if (!this.f1862h) {
            this.f1855a = this.f1859e;
            this.f1856b = this.f1860f;
        } else if (z11) {
            int i11 = this.f1858d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1859e;
            }
            this.f1855a = i11;
            int i12 = this.f1857c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f1860f;
            }
            this.f1856b = i12;
        } else {
            int i13 = this.f1857c;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f1859e;
            }
            this.f1855a = i13;
            int i14 = this.f1858d;
            if (i14 == Integer.MIN_VALUE) {
                i14 = this.f1860f;
            }
            this.f1856b = i14;
        }
    }

    public void g(int i11, int i12) {
        this.f1857c = i11;
        this.f1858d = i12;
        this.f1862h = true;
        if (this.f1861g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f1855a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f1856b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1855a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f1856b = i12;
        }
    }
}