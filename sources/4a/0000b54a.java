package ti;

import ci.i;
import java.util.Arrays;
import java.util.Collections;
import org.spongycastle.crypto.tls.CipherSuite;
import ti.i0;

/* loaded from: classes3.dex */
public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f52143l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final k0 f52144a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f52145b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f52146c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f52147d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final u f52148e;

    /* renamed from: f  reason: collision with root package name */
    private b f52149f;

    /* renamed from: g  reason: collision with root package name */
    private long f52150g;

    /* renamed from: h  reason: collision with root package name */
    private String f52151h;

    /* renamed from: i  reason: collision with root package name */
    private ji.x f52152i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52153j;

    /* renamed from: k  reason: collision with root package name */
    private long f52154k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f52155f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f52156a;

        /* renamed from: b  reason: collision with root package name */
        private int f52157b;

        /* renamed from: c  reason: collision with root package name */
        public int f52158c;

        /* renamed from: d  reason: collision with root package name */
        public int f52159d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f52160e;

        public a(int i11) {
            this.f52160e = new byte[i11];
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f52156a) {
                int i13 = i12 - i11;
                byte[] bArr2 = this.f52160e;
                int length = bArr2.length;
                int i14 = this.f52158c;
                if (length < i14 + i13) {
                    this.f52160e = Arrays.copyOf(bArr2, (i14 + i13) * 2);
                }
                System.arraycopy(bArr, i11, this.f52160e, this.f52158c, i13);
                this.f52158c += i13;
            }
        }

        public boolean b(int i11, int i12) {
            int i13 = this.f52157b;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i11 == 179 || i11 == 181) {
                                this.f52158c -= i12;
                                this.f52156a = false;
                                return true;
                            }
                        } else if ((i11 & 240) != 32) {
                            ak.o.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f52159d = this.f52158c;
                            this.f52157b = 4;
                        }
                    } else if (i11 > 31) {
                        ak.o.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f52157b = 3;
                    }
                } else if (i11 != 181) {
                    ak.o.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f52157b = 2;
                }
            } else if (i11 == 176) {
                this.f52157b = 1;
                this.f52156a = true;
            }
            byte[] bArr = f52155f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f52156a = false;
            this.f52158c = 0;
            this.f52157b = 0;
        }
    }

    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ji.x f52161a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f52162b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f52163c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f52164d;

        /* renamed from: e  reason: collision with root package name */
        private int f52165e;

        /* renamed from: f  reason: collision with root package name */
        private int f52166f;

        /* renamed from: g  reason: collision with root package name */
        private long f52167g;

        /* renamed from: h  reason: collision with root package name */
        private long f52168h;

        public b(ji.x xVar) {
            this.f52161a = xVar;
        }

        public void a(byte[] bArr, int i11, int i12) {
            if (this.f52163c) {
                int i13 = this.f52166f;
                int i14 = (i11 + 1) - i13;
                if (i14 < i12) {
                    this.f52164d = ((bArr[i14] & 192) >> 6) == 0;
                    this.f52163c = false;
                    return;
                }
                this.f52166f = i13 + (i12 - i11);
            }
        }

        public void b(long j11, int i11, boolean z11) {
            if (this.f52165e == 182 && z11 && this.f52162b) {
                boolean z12 = this.f52164d;
                this.f52161a.f(this.f52168h, z12 ? 1 : 0, (int) (j11 - this.f52167g), i11, null);
            }
            if (this.f52165e != 179) {
                this.f52167g = j11;
            }
        }

        public void c(int i11, long j11) {
            this.f52165e = i11;
            this.f52164d = false;
            this.f52162b = i11 == 182 || i11 == 179;
            this.f52163c = i11 == 182;
            this.f52166f = 0;
            this.f52168h = j11;
        }

        public void d() {
            this.f52162b = false;
            this.f52163c = false;
            this.f52164d = false;
            this.f52165e = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(k0 k0Var) {
        this.f52144a = k0Var;
        if (k0Var != null) {
            this.f52148e = new u(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 128);
            this.f52145b = new ak.v();
            return;
        }
        this.f52148e = null;
        this.f52145b = null;
    }

    private static ci.i b(a aVar, int i11, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f52160e, aVar.f52158c);
        ak.u uVar = new ak.u(copyOf);
        uVar.s(i11);
        uVar.s(4);
        uVar.q();
        uVar.r(8);
        if (uVar.g()) {
            uVar.r(4);
            uVar.r(3);
        }
        int h11 = uVar.h(4);
        float f11 = 1.0f;
        if (h11 == 15) {
            int h12 = uVar.h(8);
            int h13 = uVar.h(8);
            if (h13 == 0) {
                ak.o.h("H263Reader", "Invalid aspect ratio");
            } else {
                f11 = h12 / h13;
            }
        } else {
            float[] fArr = f52143l;
            if (h11 < fArr.length) {
                f11 = fArr[h11];
            } else {
                ak.o.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (uVar.g()) {
            uVar.r(2);
            uVar.r(1);
            if (uVar.g()) {
                uVar.r(15);
                uVar.q();
                uVar.r(15);
                uVar.q();
                uVar.r(15);
                uVar.q();
                uVar.r(3);
                uVar.r(11);
                uVar.q();
                uVar.r(15);
                uVar.q();
            }
        }
        if (uVar.h(2) != 0) {
            ak.o.h("H263Reader", "Unhandled video object layer shape");
        }
        uVar.q();
        int h14 = uVar.h(16);
        uVar.q();
        if (uVar.g()) {
            if (h14 == 0) {
                ak.o.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i12 = 0;
                for (int i13 = h14 - 1; i13 > 0; i13 >>= 1) {
                    i12++;
                }
                uVar.r(i12);
            }
        }
        uVar.q();
        int h15 = uVar.h(13);
        uVar.q();
        int h16 = uVar.h(13);
        uVar.q();
        uVar.q();
        return new i.b().S(str).e0("video/mp4v-es").j0(h15).Q(h16).a0(f11).T(Collections.singletonList(copyOf)).E();
    }

    @Override // ti.m
    public void a() {
        ak.t.a(this.f52146c);
        this.f52147d.c();
        b bVar = this.f52149f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f52148e;
        if (uVar != null) {
            uVar.d();
        }
        this.f52150g = 0L;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52149f);
        ak.a.h(this.f52152i);
        int e11 = vVar.e();
        int f11 = vVar.f();
        byte[] d11 = vVar.d();
        this.f52150g += vVar.a();
        this.f52152i.e(vVar, vVar.a());
        while (true) {
            int c11 = ak.t.c(d11, e11, f11, this.f52146c);
            if (c11 == f11) {
                break;
            }
            int i11 = c11 + 3;
            int i12 = vVar.d()[i11] & 255;
            int i13 = c11 - e11;
            int i14 = 0;
            if (!this.f52153j) {
                if (i13 > 0) {
                    this.f52147d.a(d11, e11, c11);
                }
                if (this.f52147d.b(i12, i13 < 0 ? -i13 : 0)) {
                    ji.x xVar = this.f52152i;
                    a aVar = this.f52147d;
                    xVar.d(b(aVar, aVar.f52159d, (String) ak.a.e(this.f52151h)));
                    this.f52153j = true;
                }
            }
            this.f52149f.a(d11, e11, c11);
            u uVar = this.f52148e;
            if (uVar != null) {
                if (i13 > 0) {
                    uVar.a(d11, e11, c11);
                } else {
                    i14 = -i13;
                }
                if (this.f52148e.b(i14)) {
                    u uVar2 = this.f52148e;
                    ((ak.v) ak.k0.j(this.f52145b)).M(this.f52148e.f52287d, ak.t.k(uVar2.f52287d, uVar2.f52288e));
                    ((k0) ak.k0.j(this.f52144a)).a(this.f52154k, this.f52145b);
                }
                if (i12 == 178 && vVar.d()[c11 + 2] == 1) {
                    this.f52148e.e(i12);
                }
            }
            int i15 = f11 - c11;
            this.f52149f.b(this.f52150g - i15, i15, this.f52153j);
            this.f52149f.c(i12, this.f52154k);
            e11 = i11;
        }
        if (!this.f52153j) {
            this.f52147d.a(d11, e11, f11);
        }
        this.f52149f.a(d11, e11, f11);
        u uVar3 = this.f52148e;
        if (uVar3 != null) {
            uVar3.a(d11, e11, f11);
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52151h = dVar.b();
        ji.x f11 = jVar.f(dVar.c(), 2);
        this.f52152i = f11;
        this.f52149f = new b(f11);
        k0 k0Var = this.f52144a;
        if (k0Var != null) {
            k0Var.b(jVar, dVar);
        }
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52154k = j11;
    }
}