package wi;

import ak.k0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ci.i;
import ci.j;
import ci.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wi.a;

/* loaded from: classes3.dex */
public final class f extends ci.a implements Handler.Callback {

    /* renamed from: l  reason: collision with root package name */
    private final c f55904l;

    /* renamed from: m  reason: collision with root package name */
    private final e f55905m;

    /* renamed from: n  reason: collision with root package name */
    private final Handler f55906n;

    /* renamed from: o  reason: collision with root package name */
    private final d f55907o;

    /* renamed from: p  reason: collision with root package name */
    private final a[] f55908p;

    /* renamed from: q  reason: collision with root package name */
    private final long[] f55909q;

    /* renamed from: t  reason: collision with root package name */
    private int f55910t;

    /* renamed from: w  reason: collision with root package name */
    private int f55911w;

    /* renamed from: x  reason: collision with root package name */
    private b f55912x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f55913y;

    /* renamed from: z  reason: collision with root package name */
    private long f55914z;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f55902a);
    }

    private void Q(a aVar, List<a.b> list) {
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            i D = aVar.c(i11).D();
            if (D != null && this.f55904l.a(D)) {
                b b11 = this.f55904l.b(D);
                byte[] bArr = (byte[]) ak.a.e(aVar.c(i11).D1());
                this.f55907o.f();
                this.f55907o.r(bArr.length);
                ((ByteBuffer) k0.j(this.f55907o.f13264c)).put(bArr);
                this.f55907o.s();
                a a11 = b11.a(this.f55907o);
                if (a11 != null) {
                    Q(a11, list);
                }
            } else {
                list.add(aVar.c(i11));
            }
        }
    }

    private void R() {
        Arrays.fill(this.f55908p, (Object) null);
        this.f55910t = 0;
        this.f55911w = 0;
    }

    private void S(a aVar) {
        Handler handler = this.f55906n;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            T(aVar);
        }
    }

    private void T(a aVar) {
        this.f55905m.r(aVar);
    }

    @Override // ci.a
    protected void H() {
        R();
        this.f55912x = null;
    }

    @Override // ci.a
    protected void J(long j11, boolean z11) {
        R();
        this.f55913y = false;
    }

    @Override // ci.a
    protected void N(i[] iVarArr, long j11, long j12) {
        this.f55912x = this.f55904l.b(iVarArr[0]);
    }

    @Override // ci.n
    public int a(i iVar) {
        if (this.f55904l.a(iVar)) {
            return n.l(iVar.L == null ? 4 : 2);
        }
        return n.l(0);
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean c() {
        return this.f55913y;
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            T((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.v0
    public void v(long j11, long j12) {
        if (!this.f55913y && this.f55911w < 5) {
            this.f55907o.f();
            j D = D();
            int O = O(D, this.f55907o, false);
            if (O == -4) {
                if (this.f55907o.l()) {
                    this.f55913y = true;
                } else {
                    d dVar = this.f55907o;
                    dVar.f55903i = this.f55914z;
                    dVar.s();
                    a a11 = ((b) k0.j(this.f55912x)).a(this.f55907o);
                    if (a11 != null) {
                        ArrayList arrayList = new ArrayList(a11.d());
                        Q(a11, arrayList);
                        if (!arrayList.isEmpty()) {
                            a aVar = new a(arrayList);
                            int i11 = this.f55910t;
                            int i12 = this.f55911w;
                            int i13 = (i11 + i12) % 5;
                            this.f55908p[i13] = aVar;
                            this.f55909q[i13] = this.f55907o.f13266e;
                            this.f55911w = i12 + 1;
                        }
                    }
                }
            } else if (O == -5) {
                this.f55914z = ((i) ak.a.e(D.f9243b)).f9209p;
            }
        }
        if (this.f55911w > 0) {
            long[] jArr = this.f55909q;
            int i14 = this.f55910t;
            if (jArr[i14] <= j11) {
                S((a) k0.j(this.f55908p[i14]));
                a[] aVarArr = this.f55908p;
                int i15 = this.f55910t;
                aVarArr[i15] = null;
                this.f55910t = (i15 + 1) % 5;
                this.f55911w--;
            }
        }
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.f55905m = (e) ak.a.e(eVar);
        this.f55906n = looper == null ? null : k0.w(looper, this);
        this.f55904l = (c) ak.a.e(cVar);
        this.f55907o = new d();
        this.f55908p = new a[5];
        this.f55909q = new long[5];
    }
}