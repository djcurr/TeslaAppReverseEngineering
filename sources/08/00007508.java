package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class p extends mp.c {

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30267t = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30268w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30269x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30270y = null;

    /* renamed from: o  reason: collision with root package name */
    private long f30271o;

    /* renamed from: p  reason: collision with root package name */
    private long[] f30272p;

    /* renamed from: q  reason: collision with root package name */
    int f30273q;

    static {
        n();
    }

    public p() {
        super("stsz");
        this.f30272p = new long[0];
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("SampleSizeBox.java", p.class);
        f30267t = bVar.f("method-execution", bVar.e("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 50);
        bVar.f("method-execution", bVar.e("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "long", "sampleSize", "", "void"), 54);
        bVar.f("method-execution", bVar.e("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", "long"), 59);
        f30268w = bVar.f("method-execution", bVar.e("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "long"), 67);
        bVar.f("method-execution", bVar.e("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        f30269x = bVar.f("method-execution", bVar.e("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        f30270y = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f30271o = hb.d.j(byteBuffer);
        int a11 = pp.b.a(hb.d.j(byteBuffer));
        this.f30273q = a11;
        if (this.f30271o == 0) {
            this.f30272p = new long[a11];
            for (int i11 = 0; i11 < this.f30273q; i11++) {
                this.f30272p[i11] = hb.d.j(byteBuffer);
            }
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30271o);
        if (this.f30271o == 0) {
            hb.e.g(byteBuffer, this.f30272p.length);
            for (long j11 : this.f30272p) {
                hb.e.g(byteBuffer, j11);
            }
            return;
        }
        hb.e.g(byteBuffer, this.f30273q);
    }

    @Override // mp.a
    protected long d() {
        return (this.f30271o == 0 ? this.f30272p.length * 4 : 0) + 12;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30270y, this, this));
        return "SampleSizeBox[sampleSize=" + v() + ";sampleCount=" + u() + "]";
    }

    public long u() {
        int length;
        mp.f.b().c(d40.b.b(f30268w, this, this));
        if (this.f30271o > 0) {
            length = this.f30273q;
        } else {
            length = this.f30272p.length;
        }
        return length;
    }

    public long v() {
        mp.f.b().c(d40.b.b(f30267t, this, this));
        return this.f30271o;
    }

    public void w(long[] jArr) {
        mp.f.b().c(d40.b.c(f30269x, this, this, jArr));
        this.f30272p = jArr;
    }
}