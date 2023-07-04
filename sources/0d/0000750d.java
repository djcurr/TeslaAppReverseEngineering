package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class t extends c {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30284q = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30285t = null;

    /* renamed from: p  reason: collision with root package name */
    private long[] f30286p;

    static {
        n();
    }

    public t() {
        super("stco");
        this.f30286p = new long[0];
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("StaticChunkOffsetBox.java", t.class);
        f30284q = bVar.f("method-execution", bVar.e("1", "getChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "", "", "", "[J"), 39);
        f30285t = bVar.f("method-execution", bVar.e("1", "setChunkOffsets", "com.coremedia.iso.boxes.StaticChunkOffsetBox", "[J", "chunkOffsets", "", "void"), 48);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a11 = pp.b.a(hb.d.j(byteBuffer));
        this.f30286p = new long[a11];
        for (int i11 = 0; i11 < a11; i11++) {
            this.f30286p[i11] = hb.d.j(byteBuffer);
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30286p.length);
        for (long j11 : this.f30286p) {
            hb.e.g(byteBuffer, j11);
        }
    }

    @Override // mp.a
    protected long d() {
        return (this.f30286p.length * 4) + 8;
    }

    @Override // ib.c
    public long[] u() {
        mp.f.b().c(d40.b.b(f30284q, this, this));
        return this.f30286p;
    }

    public void v(long[] jArr) {
        mp.f.b().c(d40.b.c(f30285t, this, this, jArr));
        this.f30286p = jArr;
    }
}