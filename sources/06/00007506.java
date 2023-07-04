package ib;

import a40.a;
import androidx.recyclerview.widget.l;
import java.nio.ByteBuffer;
import java.util.Date;
import org.spongycastle.math.Primes;

/* loaded from: classes.dex */
public class n extends mp.c {
    private static final /* synthetic */ a.InterfaceC0010a H = null;
    private static final /* synthetic */ a.InterfaceC0010a K = null;
    private static final /* synthetic */ a.InterfaceC0010a L = null;
    private static final /* synthetic */ a.InterfaceC0010a O = null;
    private static final /* synthetic */ a.InterfaceC0010a P = null;
    private static final /* synthetic */ a.InterfaceC0010a Q = null;
    private static final /* synthetic */ a.InterfaceC0010a R = null;
    private static final /* synthetic */ a.InterfaceC0010a T = null;
    private static final /* synthetic */ a.InterfaceC0010a Y = null;

    /* renamed from: b1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30252b1 = null;

    /* renamed from: g1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30253g1 = null;

    /* renamed from: p1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30254p1 = null;

    /* renamed from: x1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30255x1 = null;

    /* renamed from: y1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30256y1 = null;
    private int A;
    private int B;
    private int C;
    private int E;
    private int F;
    private int G;

    /* renamed from: o  reason: collision with root package name */
    private Date f30257o;

    /* renamed from: p  reason: collision with root package name */
    private Date f30258p;

    /* renamed from: q  reason: collision with root package name */
    private long f30259q;

    /* renamed from: t  reason: collision with root package name */
    private long f30260t;

    /* renamed from: w  reason: collision with root package name */
    private double f30261w;

    /* renamed from: x  reason: collision with root package name */
    private float f30262x;

    /* renamed from: y  reason: collision with root package name */
    private pp.g f30263y;

    /* renamed from: z  reason: collision with root package name */
    private long f30264z;

    static {
        n();
    }

    public n() {
        super("mvhd");
        this.f30261w = 1.0d;
        this.f30262x = 1.0f;
        this.f30263y = pp.g.f46818j;
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("MovieHeaderBox.java", n.class);
        H = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 63);
        K = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 67);
        f30252b1 = bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        f30253g1 = bVar.f("method-execution", bVar.e("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "timescale", "", "void"), Primes.SMALL_FACTOR_LIMIT);
        f30254p1 = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "duration", "", "void"), 215);
        bVar.f("method-execution", bVar.e("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), 222);
        bVar.f("method-execution", bVar.e("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), 226);
        f30255x1 = bVar.f("method-execution", bVar.e("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 230);
        f30256y1 = bVar.f("method-execution", bVar.e("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "long", "nextTrackId", "", "void"), 234);
        bVar.f("method-execution", bVar.e("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 238);
        bVar.f("method-execution", bVar.e("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 242);
        bVar.f("method-execution", bVar.e("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 246);
        L = bVar.f("method-execution", bVar.e("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 71);
        bVar.f("method-execution", bVar.e("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), l.f.DEFAULT_SWIPE_ANIMATION_DURATION);
        bVar.f("method-execution", bVar.e("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 254);
        bVar.f("method-execution", bVar.e("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 258);
        bVar.f("method-execution", bVar.e("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 262);
        bVar.f("method-execution", bVar.e("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 266);
        bVar.f("method-execution", bVar.e("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 270);
        bVar.f("method-execution", bVar.e("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 274);
        bVar.f("method-execution", bVar.e("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 278);
        bVar.f("method-execution", bVar.e("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 282);
        O = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 75);
        P = bVar.f("method-execution", bVar.e("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 79);
        Q = bVar.f("method-execution", bVar.e("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 83);
        bVar.f("method-execution", bVar.e("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 87);
        R = bVar.f("method-execution", bVar.e("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "long"), 91);
        T = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 139);
        Y = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 195);
    }

    public float A() {
        mp.f.b().c(d40.b.b(Q, this, this));
        return this.f30262x;
    }

    public void B(Date date) {
        mp.f.b().c(d40.b.c(Y, this, this, date));
        this.f30257o = date;
        if (pp.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void C(long j11) {
        mp.f.b().c(d40.b.c(f30254p1, this, this, c40.a.e(j11)));
        this.f30260t = j11;
        if (j11 >= 4294967296L) {
            s(1);
        }
    }

    public void D(pp.g gVar) {
        mp.f.b().c(d40.b.c(f30255x1, this, this, gVar));
        this.f30263y = gVar;
    }

    public void E(Date date) {
        mp.f.b().c(d40.b.c(f30252b1, this, this, date));
        this.f30258p = date;
        if (pp.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j11) {
        mp.f.b().c(d40.b.c(f30256y1, this, this, c40.a.e(j11)));
        this.f30264z = j11;
    }

    public void G(long j11) {
        mp.f.b().c(d40.b.c(f30253g1, this, this, c40.a.e(j11)));
        this.f30259q = j11;
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.f30257o = pp.c.b(hb.d.k(byteBuffer));
            this.f30258p = pp.c.b(hb.d.k(byteBuffer));
            this.f30259q = hb.d.j(byteBuffer);
            this.f30260t = hb.d.k(byteBuffer);
        } else {
            this.f30257o = pp.c.b(hb.d.j(byteBuffer));
            this.f30258p = pp.c.b(hb.d.j(byteBuffer));
            this.f30259q = hb.d.j(byteBuffer);
            this.f30260t = hb.d.j(byteBuffer);
        }
        this.f30261w = hb.d.d(byteBuffer);
        this.f30262x = hb.d.e(byteBuffer);
        hb.d.h(byteBuffer);
        hb.d.j(byteBuffer);
        hb.d.j(byteBuffer);
        this.f30263y = pp.g.a(byteBuffer);
        this.A = byteBuffer.getInt();
        this.B = byteBuffer.getInt();
        this.C = byteBuffer.getInt();
        this.E = byteBuffer.getInt();
        this.F = byteBuffer.getInt();
        this.G = byteBuffer.getInt();
        this.f30264z = hb.d.j(byteBuffer);
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (p() == 1) {
            hb.e.h(byteBuffer, pp.c.a(this.f30257o));
            hb.e.h(byteBuffer, pp.c.a(this.f30258p));
            hb.e.g(byteBuffer, this.f30259q);
            hb.e.h(byteBuffer, this.f30260t);
        } else {
            hb.e.g(byteBuffer, pp.c.a(this.f30257o));
            hb.e.g(byteBuffer, pp.c.a(this.f30258p));
            hb.e.g(byteBuffer, this.f30259q);
            hb.e.g(byteBuffer, this.f30260t);
        }
        hb.e.b(byteBuffer, this.f30261w);
        hb.e.c(byteBuffer, this.f30262x);
        hb.e.e(byteBuffer, 0);
        hb.e.g(byteBuffer, 0L);
        hb.e.g(byteBuffer, 0L);
        this.f30263y.c(byteBuffer);
        byteBuffer.putInt(this.A);
        byteBuffer.putInt(this.B);
        byteBuffer.putInt(this.C);
        byteBuffer.putInt(this.E);
        byteBuffer.putInt(this.F);
        byteBuffer.putInt(this.G);
        hb.e.g(byteBuffer, this.f30264z);
    }

    @Override // mp.a
    protected long d() {
        return (p() == 1 ? 32L : 20L) + 80;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(T, this, this));
        return "MovieHeaderBox[creationTime=" + u() + ";modificationTime=" + w() + ";timescale=" + z() + ";duration=" + v() + ";rate=" + y() + ";volume=" + A() + ";matrix=" + this.f30263y + ";nextTrackId=" + x() + "]";
    }

    public Date u() {
        mp.f.b().c(d40.b.b(H, this, this));
        return this.f30257o;
    }

    public long v() {
        mp.f.b().c(d40.b.b(O, this, this));
        return this.f30260t;
    }

    public Date w() {
        mp.f.b().c(d40.b.b(K, this, this));
        return this.f30258p;
    }

    public long x() {
        mp.f.b().c(d40.b.b(R, this, this));
        return this.f30264z;
    }

    public double y() {
        mp.f.b().c(d40.b.b(P, this, this));
        return this.f30261w;
    }

    public long z() {
        mp.f.b().c(d40.b.b(L, this, this));
        return this.f30259q;
    }
}