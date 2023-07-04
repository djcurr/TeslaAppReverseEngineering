package ib;

import a40.a;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.Date;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* loaded from: classes.dex */
public class x extends mp.c {
    private static final /* synthetic */ a.InterfaceC0010a C = null;
    private static final /* synthetic */ a.InterfaceC0010a E = null;
    private static final /* synthetic */ a.InterfaceC0010a F = null;
    private static final /* synthetic */ a.InterfaceC0010a G = null;
    private static final /* synthetic */ a.InterfaceC0010a H = null;
    private static final /* synthetic */ a.InterfaceC0010a K = null;
    private static final /* synthetic */ a.InterfaceC0010a L = null;
    private static final /* synthetic */ a.InterfaceC0010a O = null;
    private static final /* synthetic */ a.InterfaceC0010a P = null;
    private static final /* synthetic */ a.InterfaceC0010a Q = null;
    private static final /* synthetic */ a.InterfaceC0010a Q1 = null;
    private static final /* synthetic */ a.InterfaceC0010a R = null;
    private static final /* synthetic */ a.InterfaceC0010a T = null;
    private static final /* synthetic */ a.InterfaceC0010a V1 = null;
    private static final /* synthetic */ a.InterfaceC0010a Y = null;

    /* renamed from: b1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30295b1 = null;

    /* renamed from: b2  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30296b2 = null;

    /* renamed from: g1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30297g1 = null;

    /* renamed from: g2  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30298g2 = null;

    /* renamed from: p1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30299p1 = null;

    /* renamed from: p2  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30300p2 = null;

    /* renamed from: x1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30301x1 = null;

    /* renamed from: x2  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30302x2 = null;

    /* renamed from: y1  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30303y1 = null;
    private double A;
    private double B;

    /* renamed from: o  reason: collision with root package name */
    private Date f30304o;

    /* renamed from: p  reason: collision with root package name */
    private Date f30305p;

    /* renamed from: q  reason: collision with root package name */
    private long f30306q;

    /* renamed from: t  reason: collision with root package name */
    private long f30307t;

    /* renamed from: w  reason: collision with root package name */
    private int f30308w;

    /* renamed from: x  reason: collision with root package name */
    private int f30309x;

    /* renamed from: y  reason: collision with root package name */
    private float f30310y;

    /* renamed from: z  reason: collision with root package name */
    private pp.g f30311z;

    static {
        n();
    }

    public x() {
        super("tkhd");
        this.f30311z = pp.g.f46818j;
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("TrackHeaderBox.java", x.class);
        C = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 60);
        E = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 64);
        Q = bVar.f("method-execution", bVar.e("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 142);
        R = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        T = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), 196);
        Y = bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 203);
        f30295b1 = bVar.f("method-execution", bVar.e("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "trackId", "", "void"), Primes.SMALL_FACTOR_LIMIT);
        f30297g1 = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "long", "duration", "", "void"), 215);
        f30299p1 = bVar.f("method-execution", bVar.e("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 222);
        f30301x1 = bVar.f("method-execution", bVar.e("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 226);
        f30303y1 = bVar.f("method-execution", bVar.e("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), 230);
        Q1 = bVar.f("method-execution", bVar.e("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 234);
        F = bVar.f("method-execution", bVar.e("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 68);
        V1 = bVar.f("method-execution", bVar.e("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", Snapshot.WIDTH, "", "void"), 238);
        f30296b2 = bVar.f("method-execution", bVar.e("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", Snapshot.HEIGHT, "", "void"), 242);
        bVar.f("method-execution", bVar.e("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 247);
        bVar.f("method-execution", bVar.e("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 251);
        bVar.f("method-execution", bVar.e("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 255);
        bVar.f("method-execution", bVar.e("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 259);
        f30298g2 = bVar.f("method-execution", bVar.e("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 263);
        f30300p2 = bVar.f("method-execution", bVar.e("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 271);
        f30302x2 = bVar.f("method-execution", bVar.e("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 279);
        bVar.f("method-execution", bVar.e("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 287);
        G = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "long"), 72);
        H = bVar.f("method-execution", bVar.e("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 76);
        K = bVar.f("method-execution", bVar.e("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 80);
        L = bVar.f("method-execution", bVar.e("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 84);
        bVar.f("method-execution", bVar.e("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 88);
        O = bVar.f("method-execution", bVar.e("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 92);
        P = bVar.f("method-execution", bVar.e("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 96);
    }

    public long A() {
        mp.f.b().c(d40.b.b(F, this, this));
        return this.f30306q;
    }

    public float B() {
        mp.f.b().c(d40.b.b(L, this, this));
        return this.f30310y;
    }

    public double C() {
        mp.f.b().c(d40.b.b(O, this, this));
        return this.A;
    }

    public void D(int i11) {
        mp.f.b().c(d40.b.c(f30301x1, this, this, c40.a.d(i11)));
        this.f30309x = i11;
    }

    public void E(Date date) {
        mp.f.b().c(d40.b.c(T, this, this, date));
        this.f30304o = date;
        if (pp.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void F(long j11) {
        mp.f.b().c(d40.b.c(f30297g1, this, this, c40.a.e(j11)));
        this.f30307t = j11;
        if (j11 >= 4294967296L) {
            r(1);
        }
    }

    public void G(boolean z11) {
        mp.f.b().c(d40.b.c(f30298g2, this, this, c40.a.a(z11)));
        if (z11) {
            r(o() | 1);
        } else {
            r(o() & (-2));
        }
    }

    public void H(double d11) {
        mp.f.b().c(d40.b.c(f30296b2, this, this, c40.a.b(d11)));
        this.B = d11;
    }

    public void I(boolean z11) {
        mp.f.b().c(d40.b.c(f30300p2, this, this, c40.a.a(z11)));
        if (z11) {
            r(o() | 2);
        } else {
            r(o() & (-3));
        }
    }

    public void J(boolean z11) {
        mp.f.b().c(d40.b.c(f30302x2, this, this, c40.a.a(z11)));
        if (z11) {
            r(o() | 4);
        } else {
            r(o() & (-5));
        }
    }

    public void K(int i11) {
        mp.f.b().c(d40.b.c(f30299p1, this, this, c40.a.d(i11)));
        this.f30308w = i11;
    }

    public void L(pp.g gVar) {
        mp.f.b().c(d40.b.c(Q1, this, this, gVar));
        this.f30311z = gVar;
    }

    public void M(Date date) {
        mp.f.b().c(d40.b.c(Y, this, this, date));
        this.f30305p = date;
        if (pp.c.a(date) >= 4294967296L) {
            s(1);
        }
    }

    public void N(long j11) {
        mp.f.b().c(d40.b.c(f30295b1, this, this, c40.a.e(j11)));
        this.f30306q = j11;
    }

    public void O(float f11) {
        mp.f.b().c(d40.b.c(f30303y1, this, this, c40.a.c(f11)));
        this.f30310y = f11;
    }

    public void P(double d11) {
        mp.f.b().c(d40.b.c(V1, this, this, c40.a.b(d11)));
        this.A = d11;
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.f30304o = pp.c.b(hb.d.k(byteBuffer));
            this.f30305p = pp.c.b(hb.d.k(byteBuffer));
            this.f30306q = hb.d.j(byteBuffer);
            hb.d.j(byteBuffer);
            long j11 = byteBuffer.getLong();
            this.f30307t = j11;
            if (j11 < -1) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        } else {
            this.f30304o = pp.c.b(hb.d.j(byteBuffer));
            this.f30305p = pp.c.b(hb.d.j(byteBuffer));
            this.f30306q = hb.d.j(byteBuffer);
            hb.d.j(byteBuffer);
            this.f30307t = hb.d.j(byteBuffer);
        }
        hb.d.j(byteBuffer);
        hb.d.j(byteBuffer);
        this.f30308w = hb.d.h(byteBuffer);
        this.f30309x = hb.d.h(byteBuffer);
        this.f30310y = hb.d.e(byteBuffer);
        hb.d.h(byteBuffer);
        this.f30311z = pp.g.a(byteBuffer);
        this.A = hb.d.d(byteBuffer);
        this.B = hb.d.d(byteBuffer);
    }

    @Override // mp.a
    public void c(ByteBuffer byteBuffer) {
        mp.f.b().c(d40.b.c(Q, this, this, byteBuffer));
        t(byteBuffer);
        if (p() == 1) {
            hb.e.h(byteBuffer, pp.c.a(this.f30304o));
            hb.e.h(byteBuffer, pp.c.a(this.f30305p));
            hb.e.g(byteBuffer, this.f30306q);
            hb.e.g(byteBuffer, 0L);
            hb.e.h(byteBuffer, this.f30307t);
        } else {
            hb.e.g(byteBuffer, pp.c.a(this.f30304o));
            hb.e.g(byteBuffer, pp.c.a(this.f30305p));
            hb.e.g(byteBuffer, this.f30306q);
            hb.e.g(byteBuffer, 0L);
            hb.e.g(byteBuffer, this.f30307t);
        }
        hb.e.g(byteBuffer, 0L);
        hb.e.g(byteBuffer, 0L);
        hb.e.e(byteBuffer, this.f30308w);
        hb.e.e(byteBuffer, this.f30309x);
        hb.e.c(byteBuffer, this.f30310y);
        hb.e.e(byteBuffer, 0);
        this.f30311z.c(byteBuffer);
        hb.e.b(byteBuffer, this.A);
        hb.e.b(byteBuffer, this.B);
    }

    @Override // mp.a
    protected long d() {
        return (p() == 1 ? 36L : 24L) + 60;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(R, this, this));
        return "TrackHeaderBox[creationTime=" + v() + ";modificationTime=" + z() + ";trackId=" + A() + ";duration=" + w() + ";layer=" + y() + ";alternateGroup=" + u() + ";volume=" + B() + ";matrix=" + this.f30311z + ";width=" + C() + ";height=" + x() + "]";
    }

    public int u() {
        mp.f.b().c(d40.b.b(K, this, this));
        return this.f30309x;
    }

    public Date v() {
        mp.f.b().c(d40.b.b(C, this, this));
        return this.f30304o;
    }

    public long w() {
        mp.f.b().c(d40.b.b(G, this, this));
        return this.f30307t;
    }

    public double x() {
        mp.f.b().c(d40.b.b(P, this, this));
        return this.B;
    }

    public int y() {
        mp.f.b().c(d40.b.b(H, this, this));
        return this.f30308w;
    }

    public Date z() {
        mp.f.b().c(d40.b.b(E, this, this));
        return this.f30305p;
    }
}