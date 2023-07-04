package ci;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import fj.r;

/* loaded from: classes3.dex */
public abstract class a implements v0, n {

    /* renamed from: a  reason: collision with root package name */
    private final int f9142a;

    /* renamed from: c  reason: collision with root package name */
    private o f9144c;

    /* renamed from: d  reason: collision with root package name */
    private int f9145d;

    /* renamed from: e  reason: collision with root package name */
    private int f9146e;

    /* renamed from: f  reason: collision with root package name */
    private r f9147f;

    /* renamed from: g  reason: collision with root package name */
    private i[] f9148g;

    /* renamed from: h  reason: collision with root package name */
    private long f9149h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9151j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9152k;

    /* renamed from: b  reason: collision with root package name */
    private final j f9143b = new j();

    /* renamed from: i  reason: collision with root package name */
    private long f9150i = Long.MIN_VALUE;

    public a(int i11) {
        this.f9142a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExoPlaybackException A(Throwable th2, i iVar) {
        return B(th2, iVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExoPlaybackException B(Throwable th2, i iVar, boolean z11) {
        int i11;
        if (iVar != null && !this.f9152k) {
            this.f9152k = true;
            try {
                i11 = n.z(a(iVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f9152k = false;
            }
            return ExoPlaybackException.c(th2, getName(), E(), iVar, i11, z11);
        }
        i11 = 4;
        return ExoPlaybackException.c(th2, getName(), E(), iVar, i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o C() {
        return (o) ak.a.e(this.f9144c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j D() {
        this.f9143b.a();
        return this.f9143b;
    }

    protected final int E() {
        return this.f9145d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final i[] F() {
        return (i[]) ak.a.e(this.f9148g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean G() {
        return g() ? this.f9151j : ((r) ak.a.e(this.f9147f)).isReady();
    }

    protected abstract void H();

    protected void I(boolean z11, boolean z12) {
    }

    protected abstract void J(long j11, boolean z11);

    protected void K() {
    }

    protected void L() {
    }

    protected void M() {
    }

    protected abstract void N(i[] iVarArr, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int O(j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        int f11 = ((r) ak.a.e(this.f9147f)).f(jVar, decoderInputBuffer, z11);
        if (f11 == -4) {
            if (decoderInputBuffer.l()) {
                this.f9150i = Long.MIN_VALUE;
                return this.f9151j ? -4 : -3;
            }
            long j11 = decoderInputBuffer.f13266e + this.f9149h;
            decoderInputBuffer.f13266e = j11;
            this.f9150i = Math.max(this.f9150i, j11);
        } else if (f11 == -5) {
            i iVar = (i) ak.a.e(jVar.f9243b);
            if (iVar.f9209p != Long.MAX_VALUE) {
                jVar.f9243b = iVar.a().i0(iVar.f9209p + this.f9149h).E();
            }
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int P(long j11) {
        return ((r) ak.a.e(this.f9147f)).p(j11 - this.f9149h);
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public final int d() {
        return this.f9142a;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void disable() {
        ak.a.f(this.f9146e == 1);
        this.f9143b.a();
        this.f9146e = 0;
        this.f9147f = null;
        this.f9148g = null;
        this.f9151j = false;
        H();
    }

    @Override // com.google.android.exoplayer2.v0
    public final r f() {
        return this.f9147f;
    }

    @Override // com.google.android.exoplayer2.v0
    public final boolean g() {
        return this.f9150i == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.v0
    public final int getState() {
        return this.f9146e;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void h() {
        this.f9151j = true;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void j(i[] iVarArr, r rVar, long j11, long j12) {
        ak.a.f(!this.f9151j);
        this.f9147f = rVar;
        this.f9150i = j12;
        this.f9148g = iVarArr;
        this.f9149h = j12;
        N(iVarArr, j11, j12);
    }

    @Override // com.google.android.exoplayer2.t0.b
    public void m(int i11, Object obj) {
    }

    @Override // com.google.android.exoplayer2.v0
    public final void n() {
        ((r) ak.a.e(this.f9147f)).a();
    }

    @Override // com.google.android.exoplayer2.v0
    public final boolean o() {
        return this.f9151j;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void p(o oVar, i[] iVarArr, r rVar, long j11, boolean z11, boolean z12, long j12, long j13) {
        ak.a.f(this.f9146e == 0);
        this.f9144c = oVar;
        this.f9146e = 1;
        I(z11, z12);
        j(iVarArr, rVar, j12, j13);
        J(j11, z11);
    }

    @Override // com.google.android.exoplayer2.v0
    public final n q() {
        return this;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void reset() {
        ak.a.f(this.f9146e == 0);
        this.f9143b.a();
        K();
    }

    @Override // com.google.android.exoplayer2.v0
    public final void setIndex(int i11) {
        this.f9145d = i11;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void start() {
        ak.a.f(this.f9146e == 1);
        this.f9146e = 2;
        L();
    }

    @Override // com.google.android.exoplayer2.v0
    public final void stop() {
        ak.a.f(this.f9146e == 2);
        this.f9146e = 1;
        M();
    }

    @Override // ci.n
    public int u() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.v0
    public final long w() {
        return this.f9150i;
    }

    @Override // com.google.android.exoplayer2.v0
    public final void x(long j11) {
        this.f9151j = false;
        this.f9150i = j11;
        J(j11, false);
    }

    @Override // com.google.android.exoplayer2.v0
    public ak.q y() {
        return null;
    }
}