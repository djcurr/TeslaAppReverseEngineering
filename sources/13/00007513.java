package ib;

import a40.a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class y extends a {

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30312q = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30313t = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30314w = null;

    /* renamed from: o  reason: collision with root package name */
    private int f30315o;

    /* renamed from: p  reason: collision with root package name */
    private int[] f30316p;

    static {
        n();
    }

    public y() {
        super("vmhd");
        this.f30315o = 0;
        this.f30316p = new int[3];
        r(1);
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("VideoMediaHeaderBox.java", y.class);
        f30312q = bVar.f("method-execution", bVar.e("1", "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "int"), 39);
        f30313t = bVar.f("method-execution", bVar.e("1", "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "[I"), 43);
        f30314w = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 71);
        bVar.f("method-execution", bVar.e("1", "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 75);
        bVar.f("method-execution", bVar.e("1", "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 79);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f30315o = hb.d.h(byteBuffer);
        this.f30316p = new int[3];
        for (int i11 = 0; i11 < 3; i11++) {
            this.f30316p[i11] = hb.d.h(byteBuffer);
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.e(byteBuffer, this.f30315o);
        for (int i11 : this.f30316p) {
            hb.e.e(byteBuffer, i11);
        }
    }

    @Override // mp.a
    protected long d() {
        return 12L;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30314w, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + u() + ";opcolor0=" + v()[0] + ";opcolor1=" + v()[1] + ";opcolor2=" + v()[2] + "]";
    }

    public int u() {
        mp.f.b().c(d40.b.b(f30312q, this, this));
        return this.f30315o;
    }

    public int[] v() {
        mp.f.b().c(d40.b.b(f30313t, this, this));
        return this.f30316p;
    }
}