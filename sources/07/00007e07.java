package kj;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;

/* loaded from: classes3.dex */
final class m implements fj.r {

    /* renamed from: a  reason: collision with root package name */
    private final int f34755a;

    /* renamed from: b  reason: collision with root package name */
    private final q f34756b;

    /* renamed from: c  reason: collision with root package name */
    private int f34757c = -1;

    public m(q qVar, int i11) {
        this.f34756b = qVar;
        this.f34755a = i11;
    }

    private boolean c() {
        int i11 = this.f34757c;
        return (i11 == -1 || i11 == -3 || i11 == -2) ? false : true;
    }

    @Override // fj.r
    public void a() {
        int i11 = this.f34757c;
        if (i11 == -2) {
            throw new SampleQueueMappingException(this.f34756b.t().a(this.f34755a).a(0).f9205l);
        }
        if (i11 == -1) {
            this.f34756b.T();
        } else if (i11 != -3) {
            this.f34756b.U(i11);
        }
    }

    public void b() {
        ak.a.a(this.f34757c == -1);
        this.f34757c = this.f34756b.y(this.f34755a);
    }

    public void d() {
        if (this.f34757c != -1) {
            this.f34756b.o0(this.f34755a);
            this.f34757c = -1;
        }
    }

    @Override // fj.r
    public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        if (this.f34757c == -3) {
            decoderInputBuffer.e(4);
            return -4;
        } else if (c()) {
            return this.f34756b.d0(this.f34757c, jVar, decoderInputBuffer, z11);
        } else {
            return -3;
        }
    }

    @Override // fj.r
    public boolean isReady() {
        return this.f34757c == -3 || (c() && this.f34756b.Q(this.f34757c));
    }

    @Override // fj.r
    public int p(long j11) {
        if (c()) {
            return this.f34756b.n0(this.f34757c, j11);
        }
        return 0;
    }
}