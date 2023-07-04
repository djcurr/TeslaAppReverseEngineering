package o30;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ch.qos.logback.core.util.FileSize;
import ib.j;
import ib.k;
import ib.l;
import ib.m;
import ib.n;
import ib.p;
import ib.q;
import ib.r;
import ib.t;
import ib.u;
import ib.v;
import ib.w;
import ib.x;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private C0834b f42194a = null;

    /* renamed from: b  reason: collision with root package name */
    private c f42195b = null;

    /* renamed from: c  reason: collision with root package name */
    private FileOutputStream f42196c = null;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f42197d = null;

    /* renamed from: e  reason: collision with root package name */
    private long f42198e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f42199f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f42200g = true;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<g, long[]> f42201h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private ByteBuffer f42202i = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o30.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0834b implements ib.b {

        /* renamed from: a  reason: collision with root package name */
        private long f42203a;

        /* renamed from: b  reason: collision with root package name */
        private long f42204b;

        private C0834b(b bVar) {
            this.f42203a = FileSize.GB_COEFFICIENT;
            this.f42204b = 0L;
        }

        private boolean d(long j11) {
            return j11 + 8 < 4294967296L;
        }

        @Override // ib.b
        public long a() {
            return this.f42203a + 16;
        }

        public long b() {
            return this.f42203a;
        }

        public long c() {
            return this.f42204b;
        }

        public void e(long j11) {
            this.f42203a = j11;
        }

        public void f(long j11) {
            this.f42204b = j11;
        }

        @Override // ib.b
        public void g(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long a11 = a();
            if (d(a11)) {
                hb.e.g(allocate, a11);
            } else {
                hb.e.g(allocate, 1L);
            }
            allocate.put(hb.c.J("mdat"));
            if (d(a11)) {
                allocate.put(new byte[8]);
            } else {
                hb.e.h(allocate, a11);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        @Override // ib.b
        public void j(ib.d dVar) {
        }
    }

    private void n() {
        long position = this.f42197d.position();
        this.f42197d.position(this.f42194a.c());
        this.f42194a.g(this.f42197d);
        this.f42197d.position(position);
        this.f42194a.f(0L);
        this.f42194a.e(0L);
        this.f42196c.flush();
    }

    public static long o(long j11, long j12) {
        return j12 == 0 ? j11 : o(j12, j11 % j12);
    }

    public int a(MediaFormat mediaFormat, boolean z11) {
        return this.f42195b.b(mediaFormat, z11);
    }

    protected ib.h b() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("3gp4");
        return new ib.h("isom", 0L, linkedList);
    }

    public b c(c cVar) {
        this.f42195b = cVar;
        FileOutputStream fileOutputStream = new FileOutputStream(cVar.c());
        this.f42196c = fileOutputStream;
        this.f42197d = fileOutputStream.getChannel();
        ib.h b11 = b();
        b11.g(this.f42197d);
        long a11 = this.f42198e + b11.a();
        this.f42198e = a11;
        this.f42199f += a11;
        this.f42194a = new C0834b();
        this.f42202i = ByteBuffer.allocateDirect(4);
        return this;
    }

    protected m d(c cVar) {
        m mVar = new m();
        n nVar = new n();
        nVar.B(new Date());
        nVar.E(new Date());
        nVar.D(pp.g.f46818j);
        long p11 = p(cVar);
        Iterator<g> it2 = cVar.e().iterator();
        long j11 = 0;
        while (it2.hasNext()) {
            g next = it2.next();
            long c11 = (next.c() * p11) / next.k();
            if (c11 > j11) {
                j11 = c11;
            }
        }
        nVar.C(j11);
        nVar.G(p11);
        nVar.F(cVar.e().size() + 1);
        mVar.l(nVar);
        Iterator<g> it3 = cVar.e().iterator();
        while (it3.hasNext()) {
            mVar.l(l(it3.next(), cVar));
        }
        return mVar;
    }

    protected ib.b e(g gVar) {
        q qVar = new q();
        h(gVar, qVar);
        k(gVar, qVar);
        i(gVar, qVar);
        g(gVar, qVar);
        j(gVar, qVar);
        f(gVar, qVar);
        return qVar;
    }

    protected void f(g gVar, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it2 = gVar.i().iterator();
        long j11 = -1;
        while (it2.hasNext()) {
            e next = it2.next();
            long a11 = next.a();
            if (j11 != -1 && j11 != a11) {
                j11 = -1;
            }
            if (j11 == -1) {
                arrayList.add(Long.valueOf(a11));
            }
            j11 = next.b() + a11;
        }
        long[] jArr = new long[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        t tVar = new t();
        tVar.v(jArr);
        qVar.l(tVar);
    }

    protected void g(g gVar, q qVar) {
        r rVar = new r();
        rVar.v(new LinkedList());
        int size = gVar.i().size();
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < size) {
            e eVar = gVar.i().get(i12);
            i13++;
            if (i12 == size + (-1) || eVar.a() + eVar.b() != gVar.i().get(i12 + 1).a()) {
                if (i11 != i13) {
                    rVar.u().add(new r.a(i14, i13, 1L));
                    i11 = i13;
                }
                i14++;
                i13 = 0;
            }
            i12++;
        }
        qVar.l(rVar);
    }

    protected void h(g gVar, q qVar) {
        qVar.l(gVar.g());
    }

    protected void i(g gVar, q qVar) {
        long[] j11 = gVar.j();
        if (j11 == null || j11.length <= 0) {
            return;
        }
        u uVar = new u();
        uVar.u(j11);
        qVar.l(uVar);
    }

    protected void j(g gVar, q qVar) {
        p pVar = new p();
        pVar.w(this.f42201h.get(gVar));
        qVar.l(pVar);
    }

    protected void k(g gVar, q qVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it2 = gVar.h().iterator();
        v.a aVar = null;
        while (it2.hasNext()) {
            long longValue = it2.next().longValue();
            if (aVar != null && aVar.b() == longValue) {
                aVar.c(aVar.a() + 1);
            } else {
                aVar = new v.a(1L, longValue);
                arrayList.add(aVar);
            }
        }
        v vVar = new v();
        vVar.u(arrayList);
        qVar.l(vVar);
    }

    protected w l(g gVar, c cVar) {
        w wVar = new w();
        x xVar = new x();
        xVar.G(true);
        xVar.I(true);
        xVar.J(true);
        if (gVar.o()) {
            xVar.L(pp.g.f46818j);
        } else {
            xVar.L(cVar.d());
        }
        xVar.D(0);
        xVar.E(gVar.b());
        xVar.F((gVar.c() * p(cVar)) / gVar.k());
        xVar.H(gVar.e());
        xVar.P(gVar.n());
        xVar.K(0);
        xVar.M(new Date());
        xVar.N(gVar.l() + 1);
        xVar.O(gVar.m());
        wVar.l(xVar);
        j jVar = new j();
        wVar.l(jVar);
        k kVar = new k();
        kVar.z(gVar.b());
        kVar.A(gVar.c());
        kVar.C(gVar.k());
        kVar.B("eng");
        jVar.l(kVar);
        ib.i iVar = new ib.i();
        iVar.x(gVar.o() ? "SoundHandle" : "VideoHandle");
        iVar.w(gVar.d());
        jVar.l(iVar);
        l lVar = new l();
        lVar.l(gVar.f());
        ib.f fVar = new ib.f();
        ib.g gVar2 = new ib.g();
        fVar.l(gVar2);
        ib.e eVar = new ib.e();
        eVar.r(1);
        gVar2.l(eVar);
        lVar.l(fVar);
        lVar.l(e(gVar));
        jVar.l(lVar);
        return wVar;
    }

    public void m(boolean z11) {
        if (this.f42194a.b() != 0) {
            n();
        }
        Iterator<g> it2 = this.f42195b.e().iterator();
        while (it2.hasNext()) {
            g next = it2.next();
            ArrayList<e> i11 = next.i();
            int size = i11.size();
            long[] jArr = new long[size];
            for (int i12 = 0; i12 < size; i12++) {
                jArr[i12] = i11.get(i12).b();
            }
            this.f42201h.put(next, jArr);
        }
        d(this.f42195b).g(this.f42197d);
        this.f42196c.flush();
        this.f42197d.close();
        this.f42196c.close();
    }

    public long p(c cVar) {
        long k11 = !cVar.e().isEmpty() ? cVar.e().iterator().next().k() : 0L;
        Iterator<g> it2 = cVar.e().iterator();
        while (it2.hasNext()) {
            k11 = o(it2.next().k(), k11);
        }
        return k11;
    }

    public boolean q(int i11, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z11) {
        if (this.f42200g) {
            this.f42194a.e(0L);
            this.f42194a.g(this.f42197d);
            this.f42194a.f(this.f42198e);
            this.f42198e += 16;
            this.f42199f += 16;
            this.f42200g = false;
        }
        C0834b c0834b = this.f42194a;
        c0834b.e(c0834b.b() + bufferInfo.size);
        long j11 = this.f42199f + bufferInfo.size;
        this.f42199f = j11;
        int i12 = (j11 > 32768L ? 1 : (j11 == 32768L ? 0 : -1));
        boolean z12 = true;
        if (i12 >= 0) {
            n();
            this.f42200g = true;
            this.f42199f -= 32768;
        } else {
            z12 = false;
        }
        this.f42195b.a(i11, this.f42198e, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (z11 ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (!z11) {
            this.f42202i.position(0);
            this.f42202i.putInt(bufferInfo.size - 4);
            this.f42202i.position(0);
            this.f42197d.write(this.f42202i);
        }
        this.f42197d.write(byteBuffer);
        this.f42198e += bufferInfo.size;
        if (z12) {
            this.f42196c.flush();
        }
        return z12;
    }
}