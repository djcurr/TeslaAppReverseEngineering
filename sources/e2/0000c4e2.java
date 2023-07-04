package zj;

import ak.k0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f60446a;

    /* renamed from: b  reason: collision with root package name */
    private final int f60447b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f60448c;

    /* renamed from: d  reason: collision with root package name */
    private final a[] f60449d;

    /* renamed from: e  reason: collision with root package name */
    private int f60450e;

    /* renamed from: f  reason: collision with root package name */
    private int f60451f;

    /* renamed from: g  reason: collision with root package name */
    private int f60452g;

    /* renamed from: h  reason: collision with root package name */
    private a[] f60453h;

    public i(boolean z11, int i11) {
        this(z11, i11, 0);
    }

    @Override // zj.b
    public synchronized void a(a[] aVarArr) {
        int i11 = this.f60452g;
        int length = aVarArr.length + i11;
        a[] aVarArr2 = this.f60453h;
        if (length >= aVarArr2.length) {
            this.f60453h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i11 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f60453h;
            int i12 = this.f60452g;
            this.f60452g = i12 + 1;
            aVarArr3[i12] = aVar;
        }
        this.f60451f -= aVarArr.length;
        notifyAll();
    }

    @Override // zj.b
    public synchronized a b() {
        a aVar;
        this.f60451f++;
        int i11 = this.f60452g;
        if (i11 > 0) {
            a[] aVarArr = this.f60453h;
            int i12 = i11 - 1;
            this.f60452g = i12;
            aVar = (a) ak.a.e(aVarArr[i12]);
            this.f60453h[this.f60452g] = null;
        } else {
            aVar = new a(new byte[this.f60447b], 0);
        }
        return aVar;
    }

    @Override // zj.b
    public synchronized void c() {
        int i11 = 0;
        int max = Math.max(0, k0.l(this.f60450e, this.f60447b) - this.f60451f);
        int i12 = this.f60452g;
        if (max >= i12) {
            return;
        }
        if (this.f60448c != null) {
            int i13 = i12 - 1;
            while (i11 <= i13) {
                a aVar = (a) ak.a.e(this.f60453h[i11]);
                if (aVar.f60422a == this.f60448c) {
                    i11++;
                } else {
                    a aVar2 = (a) ak.a.e(this.f60453h[i13]);
                    if (aVar2.f60422a != this.f60448c) {
                        i13--;
                    } else {
                        a[] aVarArr = this.f60453h;
                        aVarArr[i11] = aVar2;
                        aVarArr[i13] = aVar;
                        i13--;
                        i11++;
                    }
                }
            }
            max = Math.max(max, i11);
            if (max >= this.f60452g) {
                return;
            }
        }
        Arrays.fill(this.f60453h, max, this.f60452g, (Object) null);
        this.f60452g = max;
    }

    @Override // zj.b
    public synchronized void d(a aVar) {
        a[] aVarArr = this.f60449d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // zj.b
    public int e() {
        return this.f60447b;
    }

    public synchronized int f() {
        return this.f60451f * this.f60447b;
    }

    public synchronized void g() {
        if (this.f60446a) {
            h(0);
        }
    }

    public synchronized void h(int i11) {
        boolean z11 = i11 < this.f60450e;
        this.f60450e = i11;
        if (z11) {
            c();
        }
    }

    public i(boolean z11, int i11, int i12) {
        ak.a.a(i11 > 0);
        ak.a.a(i12 >= 0);
        this.f60446a = z11;
        this.f60447b = i11;
        this.f60452g = i12;
        this.f60453h = new a[i12 + 100];
        if (i12 > 0) {
            this.f60448c = new byte[i12 * i11];
            for (int i13 = 0; i13 < i12; i13++) {
                this.f60453h[i13] = new a(this.f60448c, i13 * i11);
            }
        } else {
            this.f60448c = null;
        }
        this.f60449d = new a[1];
    }
}