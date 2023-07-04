package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class u extends mp.c {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30287p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30288q = null;

    /* renamed from: o  reason: collision with root package name */
    private long[] f30289o;

    static {
        n();
    }

    public u() {
        super("stss");
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("SyncSampleBox.java", u.class);
        bVar.f("method-execution", bVar.e("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        f30287p = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        f30288q = bVar.f("method-execution", bVar.e("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", "void"), 81);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a11 = pp.b.a(hb.d.j(byteBuffer));
        this.f30289o = new long[a11];
        for (int i11 = 0; i11 < a11; i11++) {
            this.f30289o[i11] = hb.d.j(byteBuffer);
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30289o.length);
        for (long j11 : this.f30289o) {
            hb.e.g(byteBuffer, j11);
        }
    }

    @Override // mp.a
    protected long d() {
        return (this.f30289o.length * 4) + 8;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30287p, this, this));
        return "SyncSampleBox[entryCount=" + this.f30289o.length + "]";
    }

    public void u(long[] jArr) {
        mp.f.b().c(d40.b.c(f30288q, this, this, jArr));
        this.f30289o = jArr;
    }
}