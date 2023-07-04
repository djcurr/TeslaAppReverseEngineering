package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class e implements r {

    /* renamed from: a  reason: collision with root package name */
    final r f5502a;

    /* renamed from: b  reason: collision with root package name */
    int f5503b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f5504c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f5505d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f5506e = null;

    public e(r rVar) {
        this.f5502a = rVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void a(int i11, int i12) {
        int i13;
        if (this.f5503b == 1 && i11 >= (i13 = this.f5504c)) {
            int i14 = this.f5505d;
            if (i11 <= i13 + i14) {
                this.f5505d = i14 + i12;
                this.f5504c = Math.min(i11, i13);
                return;
            }
        }
        e();
        this.f5504c = i11;
        this.f5505d = i12;
        this.f5503b = 1;
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i11, int i12) {
        int i13;
        if (this.f5503b == 2 && (i13 = this.f5504c) >= i11 && i13 <= i11 + i12) {
            this.f5505d += i12;
            this.f5504c = i11;
            return;
        }
        e();
        this.f5504c = i11;
        this.f5505d = i12;
        this.f5503b = 2;
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i11, int i12, Object obj) {
        int i13;
        if (this.f5503b == 3) {
            int i14 = this.f5504c;
            int i15 = this.f5505d;
            if (i11 <= i14 + i15 && (i13 = i11 + i12) >= i14 && this.f5506e == obj) {
                this.f5504c = Math.min(i11, i14);
                this.f5505d = Math.max(i15 + i14, i13) - this.f5504c;
                return;
            }
        }
        e();
        this.f5504c = i11;
        this.f5505d = i12;
        this.f5506e = obj;
        this.f5503b = 3;
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i11, int i12) {
        e();
        this.f5502a.d(i11, i12);
    }

    public void e() {
        int i11 = this.f5503b;
        if (i11 == 0) {
            return;
        }
        if (i11 == 1) {
            this.f5502a.a(this.f5504c, this.f5505d);
        } else if (i11 == 2) {
            this.f5502a.b(this.f5504c, this.f5505d);
        } else if (i11 == 3) {
            this.f5502a.c(this.f5504c, this.f5505d, this.f5506e);
        }
        this.f5506e = null;
        this.f5503b = 0;
    }
}