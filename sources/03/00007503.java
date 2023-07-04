package ib;

import a40.a;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public class k extends mp.c {
    private static final /* synthetic */ a.InterfaceC0010a A = null;
    private static final /* synthetic */ a.InterfaceC0010a B = null;
    private static final /* synthetic */ a.InterfaceC0010a C = null;
    private static final /* synthetic */ a.InterfaceC0010a E = null;
    private static final /* synthetic */ a.InterfaceC0010a F = null;
    private static final /* synthetic */ a.InterfaceC0010a G = null;
    private static final /* synthetic */ a.InterfaceC0010a H = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30244x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30245y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30246z = null;

    /* renamed from: o  reason: collision with root package name */
    private Date f30247o;

    /* renamed from: p  reason: collision with root package name */
    private Date f30248p;

    /* renamed from: q  reason: collision with root package name */
    private long f30249q;

    /* renamed from: t  reason: collision with root package name */
    private long f30250t;

    /* renamed from: w  reason: collision with root package name */
    private String f30251w;

    static {
        n();
    }

    public k() {
        super("mdhd");
        this.f30247o = new Date();
        this.f30248p = new Date();
        this.f30251w = "eng";
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("MediaHeaderBox.java", k.class);
        f30244x = bVar.f("method-execution", bVar.e("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        f30245y = bVar.f("method-execution", bVar.e("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        H = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        f30246z = bVar.f("method-execution", bVar.e("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 54);
        A = bVar.f("method-execution", bVar.e("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "long"), 58);
        B = bVar.f("method-execution", bVar.e("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        C = bVar.f("method-execution", bVar.e("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        bVar.f("method-execution", bVar.e("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        E = bVar.f("method-execution", bVar.e("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", "", "void"), 87);
        F = bVar.f("method-execution", bVar.e("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", "", "void"), 91);
        G = bVar.f("method-execution", bVar.e("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
    }

    public void A(long j11) {
        mp.f.b().c(d40.b.c(F, this, this, c40.a.e(j11)));
        this.f30250t = j11;
    }

    public void B(String str) {
        mp.f.b().c(d40.b.c(G, this, this, str));
        this.f30251w = str;
    }

    public void C(long j11) {
        mp.f.b().c(d40.b.c(E, this, this, c40.a.e(j11)));
        this.f30249q = j11;
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        if (p() == 1) {
            this.f30247o = pp.c.b(hb.d.k(byteBuffer));
            this.f30248p = pp.c.b(hb.d.k(byteBuffer));
            this.f30249q = hb.d.j(byteBuffer);
            this.f30250t = hb.d.k(byteBuffer);
        } else {
            this.f30247o = pp.c.b(hb.d.j(byteBuffer));
            this.f30248p = pp.c.b(hb.d.j(byteBuffer));
            this.f30249q = hb.d.j(byteBuffer);
            this.f30250t = hb.d.j(byteBuffer);
        }
        this.f30251w = hb.d.f(byteBuffer);
        hb.d.h(byteBuffer);
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (p() == 1) {
            hb.e.h(byteBuffer, pp.c.a(this.f30247o));
            hb.e.h(byteBuffer, pp.c.a(this.f30248p));
            hb.e.g(byteBuffer, this.f30249q);
            hb.e.h(byteBuffer, this.f30250t);
        } else {
            hb.e.g(byteBuffer, pp.c.a(this.f30247o));
            hb.e.g(byteBuffer, pp.c.a(this.f30248p));
            hb.e.g(byteBuffer, this.f30249q);
            hb.e.g(byteBuffer, this.f30250t);
        }
        hb.e.d(byteBuffer, this.f30251w);
        hb.e.e(byteBuffer, 0);
    }

    @Override // mp.a
    protected long d() {
        return (p() == 1 ? 32L : 20L) + 2 + 2;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(H, this, this));
        return "MediaHeaderBox[creationTime=" + u() + ";modificationTime=" + x() + ";timescale=" + y() + ";duration=" + v() + ";language=" + w() + "]";
    }

    public Date u() {
        mp.f.b().c(d40.b.b(f30244x, this, this));
        return this.f30247o;
    }

    public long v() {
        mp.f.b().c(d40.b.b(A, this, this));
        return this.f30250t;
    }

    public String w() {
        mp.f.b().c(d40.b.b(B, this, this));
        return this.f30251w;
    }

    public Date x() {
        mp.f.b().c(d40.b.b(f30245y, this, this));
        return this.f30248p;
    }

    public long y() {
        mp.f.b().c(d40.b.b(f30246z, this, this));
        return this.f30249q;
    }

    public void z(Date date) {
        mp.f.b().c(d40.b.c(C, this, this, date));
        this.f30247o = date;
    }
}