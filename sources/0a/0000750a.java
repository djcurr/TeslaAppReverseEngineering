package ib;

import a40.a;
import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class r extends mp.c {

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30274p = null;

    /* renamed from: q  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30275q = null;

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ a.InterfaceC0010a f30276t = null;

    /* renamed from: o  reason: collision with root package name */
    List<a> f30277o;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f30278a;

        /* renamed from: b  reason: collision with root package name */
        long f30279b;

        /* renamed from: c  reason: collision with root package name */
        long f30280c;

        public a(long j11, long j12, long j13) {
            this.f30278a = j11;
            this.f30279b = j12;
            this.f30280c = j13;
        }

        public long a() {
            return this.f30278a;
        }

        public long b() {
            return this.f30280c;
        }

        public long c() {
            return this.f30279b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30278a == aVar.f30278a && this.f30280c == aVar.f30280c && this.f30279b == aVar.f30279b;
        }

        public int hashCode() {
            long j11 = this.f30278a;
            long j12 = this.f30279b;
            long j13 = this.f30280c;
            return (((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) ((j13 >>> 32) ^ j13));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f30278a + ", samplesPerChunk=" + this.f30279b + ", sampleDescriptionIndex=" + this.f30280c + CoreConstants.CURLY_RIGHT;
        }
    }

    static {
        n();
    }

    public r() {
        super("stsc");
        this.f30277o = Collections.emptyList();
    }

    private static /* synthetic */ void n() {
        d40.b bVar = new d40.b("SampleToChunkBox.java", r.class);
        f30274p = bVar.f("method-execution", bVar.e("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        f30275q = bVar.f("method-execution", bVar.e("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", "", "void"), 51);
        f30276t = bVar.f("method-execution", bVar.e("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        bVar.f("method-execution", bVar.e("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", "", "[J"), 95);
    }

    @Override // mp.a
    public void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        int a11 = pp.b.a(hb.d.j(byteBuffer));
        this.f30277o = new ArrayList(a11);
        for (int i11 = 0; i11 < a11; i11++) {
            this.f30277o.add(new a(hb.d.j(byteBuffer), hb.d.j(byteBuffer), hb.d.j(byteBuffer)));
        }
    }

    @Override // mp.a
    protected void c(ByteBuffer byteBuffer) {
        t(byteBuffer);
        hb.e.g(byteBuffer, this.f30277o.size());
        for (a aVar : this.f30277o) {
            hb.e.g(byteBuffer, aVar.a());
            hb.e.g(byteBuffer, aVar.c());
            hb.e.g(byteBuffer, aVar.b());
        }
    }

    @Override // mp.a
    protected long d() {
        return (this.f30277o.size() * 12) + 8;
    }

    public String toString() {
        mp.f.b().c(d40.b.b(f30276t, this, this));
        return "SampleToChunkBox[entryCount=" + this.f30277o.size() + "]";
    }

    public List<a> u() {
        mp.f.b().c(d40.b.b(f30274p, this, this));
        return this.f30277o;
    }

    public void v(List<a> list) {
        mp.f.b().c(d40.b.c(f30275q, this, this, list));
        this.f30277o = list;
    }
}