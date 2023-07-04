package ck;

import ak.k0;
import ak.v;
import ci.i;
import ci.n;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class b extends ci.a {

    /* renamed from: l  reason: collision with root package name */
    private final DecoderInputBuffer f9269l;

    /* renamed from: m  reason: collision with root package name */
    private final v f9270m;

    /* renamed from: n  reason: collision with root package name */
    private long f9271n;

    /* renamed from: o  reason: collision with root package name */
    private a f9272o;

    /* renamed from: p  reason: collision with root package name */
    private long f9273p;

    public b() {
        super(6);
        this.f9269l = new DecoderInputBuffer(1);
        this.f9270m = new v();
    }

    private float[] Q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f9270m.M(byteBuffer.array(), byteBuffer.limit());
        this.f9270m.O(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11] = Float.intBitsToFloat(this.f9270m.p());
        }
        return fArr;
    }

    private void R() {
        a aVar = this.f9272o;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // ci.a
    protected void H() {
        R();
    }

    @Override // ci.a
    protected void J(long j11, boolean z11) {
        this.f9273p = Long.MIN_VALUE;
        R();
    }

    @Override // ci.a
    protected void N(i[] iVarArr, long j11, long j12) {
        this.f9271n = j12;
    }

    @Override // ci.n
    public int a(i iVar) {
        if ("application/x-camera-motion".equals(iVar.f9205l)) {
            return n.l(4);
        }
        return n.l(0);
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean c() {
        return g();
    }

    @Override // com.google.android.exoplayer2.v0, ci.n
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.v0
    public boolean isReady() {
        return true;
    }

    @Override // ci.a, com.google.android.exoplayer2.t0.b
    public void m(int i11, Object obj) {
        if (i11 == 7) {
            this.f9272o = (a) obj;
        } else {
            super.m(i11, obj);
        }
    }

    @Override // com.google.android.exoplayer2.v0
    public void v(long j11, long j12) {
        while (!g() && this.f9273p < 100000 + j11) {
            this.f9269l.f();
            if (O(D(), this.f9269l, false) != -4 || this.f9269l.l()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f9269l;
            this.f9273p = decoderInputBuffer.f13266e;
            if (this.f9272o != null && !decoderInputBuffer.k()) {
                this.f9269l.s();
                float[] Q = Q((ByteBuffer) k0.j(this.f9269l.f13264c));
                if (Q != null) {
                    ((a) k0.j(this.f9272o)).a(this.f9273p - this.f9271n, Q);
                }
            }
        }
    }
}