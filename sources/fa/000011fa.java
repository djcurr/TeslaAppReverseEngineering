package ci;

import ak.k0;
import com.google.android.exoplayer2.v0;
import com.stripe.android.StripePaymentController;
import fj.v;

/* loaded from: classes3.dex */
public class d implements k {

    /* renamed from: a  reason: collision with root package name */
    private final zj.i f9158a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9159b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9160c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9161d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9162e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9163f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9164g;

    /* renamed from: h  reason: collision with root package name */
    private final long f9165h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f9166i;

    /* renamed from: j  reason: collision with root package name */
    private int f9167j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9168k;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private zj.i f9169a;

        /* renamed from: b  reason: collision with root package name */
        private int f9170b = StripePaymentController.PAYMENT_REQUEST_CODE;

        /* renamed from: c  reason: collision with root package name */
        private int f9171c = StripePaymentController.PAYMENT_REQUEST_CODE;

        /* renamed from: d  reason: collision with root package name */
        private int f9172d = 2500;

        /* renamed from: e  reason: collision with root package name */
        private int f9173e = 5000;

        /* renamed from: f  reason: collision with root package name */
        private int f9174f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f9175g = false;

        /* renamed from: h  reason: collision with root package name */
        private int f9176h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f9177i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f9178j;

        public d a() {
            ak.a.f(!this.f9178j);
            this.f9178j = true;
            if (this.f9169a == null) {
                this.f9169a = new zj.i(true, 65536);
            }
            return new d(this.f9169a, this.f9170b, this.f9171c, this.f9172d, this.f9173e, this.f9174f, this.f9175g, this.f9176h, this.f9177i);
        }

        @Deprecated
        public d b() {
            return a();
        }

        public a c(zj.i iVar) {
            ak.a.f(!this.f9178j);
            this.f9169a = iVar;
            return this;
        }

        public a d(int i11, int i12, int i13, int i14) {
            ak.a.f(!this.f9178j);
            d.k(i13, 0, "bufferForPlaybackMs", "0");
            d.k(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
            d.k(i11, i13, "minBufferMs", "bufferForPlaybackMs");
            d.k(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            d.k(i12, i11, "maxBufferMs", "minBufferMs");
            this.f9170b = i11;
            this.f9171c = i12;
            this.f9172d = i13;
            this.f9173e = i14;
            return this;
        }

        public a e(boolean z11) {
            ak.a.f(!this.f9178j);
            this.f9175g = z11;
            return this;
        }

        public a f(int i11) {
            ak.a.f(!this.f9178j);
            this.f9174f = i11;
            return this;
        }
    }

    public d() {
        this(new zj.i(true, 65536), StripePaymentController.PAYMENT_REQUEST_CODE, StripePaymentController.PAYMENT_REQUEST_CODE, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(int i11, int i12, String str, String str2) {
        boolean z11 = i11 >= i12;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        ak.a.b(z11, sb2.toString());
    }

    private static int m(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3 || i11 == 5 || i11 == 6) {
                        return 131072;
                    }
                    if (i11 == 7) {
                        return 0;
                    }
                    throw new IllegalArgumentException();
                }
                return 131072000;
            }
            return 13107200;
        }
        return 144310272;
    }

    private void n(boolean z11) {
        int i11 = this.f9163f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        this.f9167j = i11;
        this.f9168k = false;
        if (z11) {
            this.f9158a.g();
        }
    }

    @Override // ci.k
    public void a() {
        n(false);
    }

    @Override // ci.k
    public boolean b() {
        return this.f9166i;
    }

    @Override // ci.k
    public long c() {
        return this.f9165h;
    }

    @Override // ci.k
    public boolean d(long j11, float f11, boolean z11, long j12) {
        long d02 = k0.d0(j11, f11);
        long j13 = z11 ? this.f9162e : this.f9161d;
        if (j12 != -9223372036854775807L) {
            j13 = Math.min(j12 / 2, j13);
        }
        return j13 <= 0 || d02 >= j13 || (!this.f9164g && this.f9158a.f() >= this.f9167j);
    }

    @Override // ci.k
    public zj.b e() {
        return this.f9158a;
    }

    @Override // ci.k
    public void f() {
        n(true);
    }

    @Override // ci.k
    public void g(v0[] v0VarArr, v vVar, xj.g[] gVarArr) {
        int i11 = this.f9163f;
        if (i11 == -1) {
            i11 = l(v0VarArr, gVarArr);
        }
        this.f9167j = i11;
        this.f9158a.h(i11);
    }

    @Override // ci.k
    public void h() {
        n(true);
    }

    @Override // ci.k
    public boolean i(long j11, long j12, float f11) {
        boolean z11 = true;
        boolean z12 = this.f9158a.f() >= this.f9167j;
        long j13 = this.f9159b;
        if (f11 > 1.0f) {
            j13 = Math.min(k0.W(j13, f11), this.f9160c);
        }
        if (j12 < Math.max(j13, 500000L)) {
            if (!this.f9164g && z12) {
                z11 = false;
            }
            this.f9168k = z11;
            if (!z11 && j12 < 500000) {
                ak.o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= this.f9160c || z12) {
            this.f9168k = false;
        }
        return this.f9168k;
    }

    protected int l(v0[] v0VarArr, xj.g[] gVarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < v0VarArr.length; i12++) {
            if (gVarArr[i12] != null) {
                i11 += m(v0VarArr[i12].d());
            }
        }
        return Math.max(13107200, i11);
    }

    protected d(zj.i iVar, int i11, int i12, int i13, int i14, int i15, boolean z11, int i16, boolean z12) {
        k(i13, 0, "bufferForPlaybackMs", "0");
        k(i14, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i11, i13, "minBufferMs", "bufferForPlaybackMs");
        k(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i12, i11, "maxBufferMs", "minBufferMs");
        k(i16, 0, "backBufferDurationMs", "0");
        this.f9158a = iVar;
        this.f9159b = b.c(i11);
        this.f9160c = b.c(i12);
        this.f9161d = b.c(i13);
        this.f9162e = b.c(i14);
        this.f9163f = i15;
        this.f9167j = i15 == -1 ? 13107200 : i15;
        this.f9164g = z11;
        this.f9165h = b.c(i16);
        this.f9166i = z12;
    }
}