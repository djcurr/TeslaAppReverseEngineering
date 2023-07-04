package o30;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ib.o;
import ib.s;
import ib.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import op.n;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: q  reason: collision with root package name */
    private static Map<Integer, Integer> f42234q;

    /* renamed from: a  reason: collision with root package name */
    private long f42235a;

    /* renamed from: c  reason: collision with root package name */
    private long f42237c;

    /* renamed from: d  reason: collision with root package name */
    private String f42238d;

    /* renamed from: e  reason: collision with root package name */
    private ib.a f42239e;

    /* renamed from: f  reason: collision with root package name */
    private o f42240f;

    /* renamed from: g  reason: collision with root package name */
    private LinkedList<Integer> f42241g;

    /* renamed from: h  reason: collision with root package name */
    private int f42242h;

    /* renamed from: j  reason: collision with root package name */
    private int f42244j;

    /* renamed from: k  reason: collision with root package name */
    private int f42245k;

    /* renamed from: l  reason: collision with root package name */
    private float f42246l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Long> f42247m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f42248n;

    /* renamed from: o  reason: collision with root package name */
    private long f42249o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f42250p;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<e> f42236b = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private Date f42243i = new Date();

    static {
        HashMap hashMap = new HashMap();
        f42234q = hashMap;
        hashMap.put(96000, 0);
        f42234q.put(88200, 1);
        f42234q.put(64000, 2);
        f42234q.put(48000, 3);
        f42234q.put(44100, 4);
        f42234q.put(32000, 5);
        f42234q.put(24000, 6);
        f42234q.put(22050, 7);
        f42234q.put(16000, 8);
        f42234q.put(12000, 9);
        f42234q.put(11025, 10);
        f42234q.put(8000, 11);
    }

    public g(int i11, MediaFormat mediaFormat, boolean z11) {
        this.f42235a = 0L;
        this.f42237c = 0L;
        this.f42239e = null;
        this.f42240f = null;
        this.f42241g = null;
        this.f42246l = BitmapDescriptorFactory.HUE_RED;
        ArrayList<Long> arrayList = new ArrayList<>();
        this.f42247m = arrayList;
        this.f42248n = false;
        this.f42249o = 0L;
        this.f42250p = true;
        this.f42235a = i11;
        if (!z11) {
            arrayList.add(3015L);
            this.f42237c = 3015L;
            this.f42245k = mediaFormat.getInteger(Snapshot.WIDTH);
            this.f42244j = mediaFormat.getInteger(Snapshot.HEIGHT);
            this.f42242h = 90000;
            this.f42241g = new LinkedList<>();
            this.f42238d = "vide";
            this.f42239e = new y();
            this.f42240f = new o();
            String string = mediaFormat.getString("mime");
            if (string.equals("video/avc")) {
                jb.c cVar = new jb.c("avc1");
                cVar.L(1);
                cVar.t0(24);
                cVar.u0(1);
                cVar.D0(72.0d);
                cVar.F0(72.0d);
                cVar.G0(this.f42245k);
                cVar.C0(this.f42244j);
                yp.a aVar = new yp.a();
                if (mediaFormat.getByteBuffer("csd-0") != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.position(4);
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    arrayList2.add(bArr);
                    ArrayList arrayList3 = new ArrayList();
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.position(4);
                    byte[] bArr2 = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr2);
                    arrayList3.add(bArr2);
                    aVar.x(arrayList2);
                    aVar.v(arrayList3);
                }
                aVar.o(13);
                aVar.p(100);
                aVar.r(-1);
                aVar.q(-1);
                aVar.s(-1);
                aVar.t(1);
                aVar.u(3);
                aVar.w(0);
                cVar.l(aVar);
                this.f42240f.l(cVar);
                return;
            } else if (string.equals("video/mp4v")) {
                jb.c cVar2 = new jb.c("mp4v");
                cVar2.L(1);
                cVar2.t0(24);
                cVar2.u0(1);
                cVar2.D0(72.0d);
                cVar2.F0(72.0d);
                cVar2.G0(this.f42245k);
                cVar2.C0(this.f42244j);
                this.f42240f.l(cVar2);
                return;
            } else {
                return;
            }
        }
        arrayList.add(1024L);
        this.f42237c = 1024L;
        this.f42246l = 1.0f;
        this.f42242h = mediaFormat.getInteger("sample-rate");
        this.f42238d = "soun";
        this.f42239e = new s();
        this.f42240f = new o();
        jb.b bVar = new jb.b("mp4a");
        bVar.e0(mediaFormat.getInteger("channel-count"));
        bVar.n0(mediaFormat.getInteger("sample-rate"));
        bVar.L(1);
        bVar.p0(16);
        np.b bVar2 = new np.b();
        op.h hVar = new op.h();
        hVar.i(0);
        n nVar = new n();
        nVar.h(2);
        hVar.j(nVar);
        op.e eVar = new op.e();
        eVar.l(64);
        eVar.m(5);
        eVar.j(1536);
        eVar.k(96000L);
        eVar.i(96000L);
        op.a aVar2 = new op.a();
        aVar2.p(2);
        aVar2.r(f42234q.get(Integer.valueOf((int) bVar.a0())).intValue());
        aVar2.q(bVar.R());
        eVar.h(aVar2);
        hVar.h(eVar);
        ByteBuffer f11 = hVar.f();
        bVar2.w(hVar);
        bVar2.u(f11);
        bVar.l(bVar2);
        this.f42240f.l(bVar);
    }

    public void a(long j11, MediaCodec.BufferInfo bufferInfo) {
        boolean z11 = (this.f42248n || (bufferInfo.flags & 1) == 0) ? false : true;
        this.f42236b.add(new e(j11, bufferInfo.size));
        LinkedList<Integer> linkedList = this.f42241g;
        if (linkedList != null && z11) {
            linkedList.add(Integer.valueOf(this.f42236b.size()));
        }
        long j12 = bufferInfo.presentationTimeUs;
        this.f42249o = j12;
        long j13 = (((j12 - this.f42249o) * this.f42242h) + 500000) / 1000000;
        if (!this.f42250p) {
            ArrayList<Long> arrayList = this.f42247m;
            arrayList.add(arrayList.size() - 1, Long.valueOf(j13));
            this.f42237c += j13;
        }
        this.f42250p = false;
    }

    public Date b() {
        return this.f42243i;
    }

    public long c() {
        return this.f42237c;
    }

    public String d() {
        return this.f42238d;
    }

    public int e() {
        return this.f42244j;
    }

    public ib.a f() {
        return this.f42239e;
    }

    public o g() {
        return this.f42240f;
    }

    public ArrayList<Long> h() {
        return this.f42247m;
    }

    public ArrayList<e> i() {
        return this.f42236b;
    }

    public long[] j() {
        LinkedList<Integer> linkedList = this.f42241g;
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        long[] jArr = new long[this.f42241g.size()];
        for (int i11 = 0; i11 < this.f42241g.size(); i11++) {
            jArr[i11] = this.f42241g.get(i11).intValue();
        }
        return jArr;
    }

    public int k() {
        return this.f42242h;
    }

    public long l() {
        return this.f42235a;
    }

    public float m() {
        return this.f42246l;
    }

    public int n() {
        return this.f42245k;
    }

    public boolean o() {
        return this.f42248n;
    }
}