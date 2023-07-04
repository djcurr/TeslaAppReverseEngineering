package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class u1 extends com.squareup.wire.f {

    /* renamed from: t  reason: collision with root package name */
    public static final ProtoAdapter<u1> f37630t;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ActionStatus#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final lt.b f37631a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleData#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final w2 f37632b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.SessionInfo#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final xt.h f37633c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.StreamMessage#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final d2 f37634d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NearbyChargingSites#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final k1 f37635e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleDataSubscriptionResponse#ADAPTER", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final z2 f37636f;
    @com.squareup.wire.q(adapter = "com.teslamotors.protocol.Vitals#ADAPTER", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final ov.d f37637g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VitalsSubscriptionResponse#ADAPTER", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final d3 f37638h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.Ping#ADAPTER", tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final o1 f37639i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final n1 f37640j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PseudonymSyncResponse#ADAPTER", tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final q1 f37641k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetRateTariffResponse#ADAPTER", tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final j0 f37642l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse#ADAPTER", tag = 13)

    /* renamed from: m  reason: collision with root package name */
    private final i1 f37643m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetManagedChargingSitesResponse#ADAPTER", tag = 14)

    /* renamed from: n  reason: collision with root package name */
    private final g0 f37644n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChargeOnSolarFeatureResponse#ADAPTER", tag = 15)

    /* renamed from: o  reason: collision with root package name */
    private final y f37645o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.AddManagedChargingSiteResponse#ADAPTER", tag = 16)

    /* renamed from: p  reason: collision with root package name */
    private final d f37646p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.centerdisplay.server.Response#ADAPTER", tag = 17)

    /* renamed from: q  reason: collision with root package name */
    private final nt.c f37647q;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<u1> {
        a(com.squareup.wire.b bVar, n00.d<u1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Response", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u1 mo28decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            lt.b bVar = null;
            w2 w2Var = null;
            xt.h hVar = null;
            d2 d2Var = null;
            k1 k1Var = null;
            z2 z2Var = null;
            ov.d dVar = null;
            d3 d3Var = null;
            o1 o1Var = null;
            n1 n1Var = null;
            q1 q1Var = null;
            j0 j0Var = null;
            g0 g0Var = null;
            y yVar = null;
            d dVar2 = null;
            nt.c cVar = null;
            i1 i1Var = null;
            while (true) {
                int g11 = reader.g();
                j0 j0Var2 = j0Var;
                if (g11 == -1) {
                    return new u1(bVar, w2Var, hVar, d2Var, k1Var, z2Var, dVar, d3Var, o1Var, n1Var, q1Var, j0Var2, i1Var, g0Var, yVar, dVar2, cVar, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        bVar = lt.b.f37343c.mo28decode(reader);
                        break;
                    case 2:
                        w2Var = w2.f37685n.mo28decode(reader);
                        break;
                    case 3:
                        hVar = xt.h.f57714f.mo28decode(reader);
                        break;
                    case 4:
                        d2Var = d2.f37365c.mo28decode(reader);
                        break;
                    case 5:
                        k1Var = k1.f37500e.mo28decode(reader);
                        break;
                    case 6:
                        z2Var = z2.f37740c.mo28decode(reader);
                        break;
                    case 7:
                        dVar = ov.d.f45187d.mo28decode(reader);
                        break;
                    case 8:
                        d3Var = d3.f37368c.mo28decode(reader);
                        break;
                    case 9:
                        o1Var = o1.f37543d.mo28decode(reader);
                        break;
                    case 10:
                        n1Var = n1.f37534d.mo28decode(reader);
                        break;
                    case 11:
                        q1Var = q1.f37572b.mo28decode(reader);
                        break;
                    case 12:
                        j0Var = j0.f37443b.mo28decode(reader);
                        continue;
                    case 13:
                        i1Var = i1.f37434c.mo28decode(reader);
                        break;
                    case 14:
                        g0Var = g0.f37413b.mo28decode(reader);
                        break;
                    case 15:
                        yVar = y.f37717b.mo28decode(reader);
                        break;
                    case 16:
                        dVar2 = d.f37360c.mo28decode(reader);
                        break;
                    case 17:
                        cVar = nt.c.f41868b.mo28decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
                j0Var = j0Var2;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                lt.b.f37343c.encodeWithTag(writer, 1, value.b());
            }
            w2.f37685n.encodeWithTag(writer, 2, value.o());
            xt.h.f57714f.encodeWithTag(writer, 3, value.i());
            d2.f37365c.encodeWithTag(writer, 4, value.n());
            k1.f37500e.encodeWithTag(writer, 5, value.g());
            z2.f37740c.encodeWithTag(writer, 6, value.p());
            ov.d.f45187d.encodeWithTag(writer, 7, value.q());
            d3.f37368c.encodeWithTag(writer, 8, value.r());
            o1.f37543d.encodeWithTag(writer, 9, value.l());
            n1.f37534d.encodeWithTag(writer, 10, value.k());
            q1.f37572b.encodeWithTag(writer, 11, value.m());
            j0.f37443b.encodeWithTag(writer, 12, value.h());
            i1.f37434c.encodeWithTag(writer, 13, value.j());
            g0.f37413b.encodeWithTag(writer, 14, value.f());
            y.f37717b.encodeWithTag(writer, 15, value.e());
            d.f37360c.encodeWithTag(writer, 16, value.c());
            nt.c.f41868b.encodeWithTag(writer, 17, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.b() != null) {
                z11 += lt.b.f37343c.encodedSizeWithTag(1, value.b());
            }
            return z11 + w2.f37685n.encodedSizeWithTag(2, value.o()) + xt.h.f57714f.encodedSizeWithTag(3, value.i()) + d2.f37365c.encodedSizeWithTag(4, value.n()) + k1.f37500e.encodedSizeWithTag(5, value.g()) + z2.f37740c.encodedSizeWithTag(6, value.p()) + ov.d.f45187d.encodedSizeWithTag(7, value.q()) + d3.f37368c.encodedSizeWithTag(8, value.r()) + o1.f37543d.encodedSizeWithTag(9, value.l()) + n1.f37534d.encodedSizeWithTag(10, value.k()) + q1.f37572b.encodedSizeWithTag(11, value.m()) + j0.f37443b.encodedSizeWithTag(12, value.h()) + i1.f37434c.encodedSizeWithTag(13, value.j()) + g0.f37413b.encodedSizeWithTag(14, value.f()) + y.f37717b.encodedSizeWithTag(15, value.e()) + d.f37360c.encodedSizeWithTag(16, value.c()) + nt.c.f41868b.encodedSizeWithTag(17, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u1 redact(u1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            lt.b b11 = value.b();
            lt.b redact = b11 == null ? null : lt.b.f37343c.redact(b11);
            w2 o11 = value.o();
            w2 redact2 = o11 == null ? null : w2.f37685n.redact(o11);
            xt.h i11 = value.i();
            xt.h redact3 = i11 == null ? null : xt.h.f57714f.redact(i11);
            d2 n11 = value.n();
            d2 redact4 = n11 == null ? null : d2.f37365c.redact(n11);
            k1 g11 = value.g();
            k1 redact5 = g11 == null ? null : k1.f37500e.redact(g11);
            z2 p11 = value.p();
            z2 redact6 = p11 == null ? null : z2.f37740c.redact(p11);
            ov.d q11 = value.q();
            ov.d redact7 = q11 == null ? null : ov.d.f45187d.redact(q11);
            d3 r11 = value.r();
            d3 redact8 = r11 == null ? null : d3.f37368c.redact(r11);
            o1 l11 = value.l();
            o1 redact9 = l11 == null ? null : o1.f37543d.redact(l11);
            n1 k11 = value.k();
            n1 redact10 = k11 == null ? null : n1.f37534d.redact(k11);
            q1 m11 = value.m();
            q1 redact11 = m11 == null ? null : q1.f37572b.redact(m11);
            j0 h11 = value.h();
            j0 redact12 = h11 == null ? null : j0.f37443b.redact(h11);
            i1 j11 = value.j();
            i1 redact13 = j11 == null ? null : i1.f37434c.redact(j11);
            g0 f11 = value.f();
            g0 redact14 = f11 == null ? null : g0.f37413b.redact(f11);
            y e11 = value.e();
            y redact15 = e11 == null ? null : y.f37717b.redact(e11);
            d c11 = value.c();
            d redact16 = c11 == null ? null : d.f37360c.redact(c11);
            nt.c d11 = value.d();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, redact14, redact15, redact16, d11 == null ? null : nt.c.f41868b.redact(d11), okio.i.f42656d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f37630t = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(u1.class), com.squareup.wire.o.PROTO_3);
    }

    public u1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public /* synthetic */ u1(lt.b bVar, w2 w2Var, xt.h hVar, d2 d2Var, k1 k1Var, z2 z2Var, ov.d dVar, d3 d3Var, o1 o1Var, n1 n1Var, q1 q1Var, j0 j0Var, i1 i1Var, g0 g0Var, y yVar, d dVar2, nt.c cVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : w2Var, (i11 & 4) != 0 ? null : hVar, (i11 & 8) != 0 ? null : d2Var, (i11 & 16) != 0 ? null : k1Var, (i11 & 32) != 0 ? null : z2Var, (i11 & 64) != 0 ? null : dVar, (i11 & 128) != 0 ? null : d3Var, (i11 & 256) != 0 ? null : o1Var, (i11 & 512) != 0 ? null : n1Var, (i11 & 1024) != 0 ? null : q1Var, (i11 & 2048) != 0 ? null : j0Var, (i11 & 4096) != 0 ? null : i1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : g0Var, (i11 & 16384) != 0 ? null : yVar, (i11 & 32768) != 0 ? null : dVar2, (i11 & 65536) != 0 ? null : cVar, (i11 & 131072) != 0 ? okio.i.f42656d : iVar);
    }

    public final u1 a(lt.b bVar, w2 w2Var, xt.h hVar, d2 d2Var, k1 k1Var, z2 z2Var, ov.d dVar, d3 d3Var, o1 o1Var, n1 n1Var, q1 q1Var, j0 j0Var, i1 i1Var, g0 g0Var, y yVar, d dVar2, nt.c cVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u1(bVar, w2Var, hVar, d2Var, k1Var, z2Var, dVar, d3Var, o1Var, n1Var, q1Var, j0Var, i1Var, g0Var, yVar, dVar2, cVar, unknownFields);
    }

    public final lt.b b() {
        return this.f37631a;
    }

    public final d c() {
        return this.f37646p;
    }

    public final nt.c d() {
        return this.f37647q;
    }

    public final y e() {
        return this.f37645o;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), u1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37631a, u1Var.f37631a) && kotlin.jvm.internal.s.c(this.f37632b, u1Var.f37632b) && kotlin.jvm.internal.s.c(this.f37633c, u1Var.f37633c) && kotlin.jvm.internal.s.c(this.f37634d, u1Var.f37634d) && kotlin.jvm.internal.s.c(this.f37635e, u1Var.f37635e) && kotlin.jvm.internal.s.c(this.f37636f, u1Var.f37636f) && kotlin.jvm.internal.s.c(this.f37637g, u1Var.f37637g) && kotlin.jvm.internal.s.c(this.f37638h, u1Var.f37638h) && kotlin.jvm.internal.s.c(this.f37639i, u1Var.f37639i) && kotlin.jvm.internal.s.c(this.f37640j, u1Var.f37640j) && kotlin.jvm.internal.s.c(this.f37641k, u1Var.f37641k) && kotlin.jvm.internal.s.c(this.f37642l, u1Var.f37642l) && kotlin.jvm.internal.s.c(this.f37643m, u1Var.f37643m) && kotlin.jvm.internal.s.c(this.f37644n, u1Var.f37644n) && kotlin.jvm.internal.s.c(this.f37645o, u1Var.f37645o) && kotlin.jvm.internal.s.c(this.f37646p, u1Var.f37646p) && kotlin.jvm.internal.s.c(this.f37647q, u1Var.f37647q);
        }
        return false;
    }

    public final g0 f() {
        return this.f37644n;
    }

    public final k1 g() {
        return this.f37635e;
    }

    public final j0 h() {
        return this.f37642l;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            lt.b bVar = this.f37631a;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
            w2 w2Var = this.f37632b;
            int hashCode3 = (hashCode2 + (w2Var != null ? w2Var.hashCode() : 0)) * 37;
            xt.h hVar = this.f37633c;
            int hashCode4 = (hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            d2 d2Var = this.f37634d;
            int hashCode5 = (hashCode4 + (d2Var != null ? d2Var.hashCode() : 0)) * 37;
            k1 k1Var = this.f37635e;
            int hashCode6 = (hashCode5 + (k1Var != null ? k1Var.hashCode() : 0)) * 37;
            z2 z2Var = this.f37636f;
            int hashCode7 = (hashCode6 + (z2Var != null ? z2Var.hashCode() : 0)) * 37;
            ov.d dVar = this.f37637g;
            int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            d3 d3Var = this.f37638h;
            int hashCode9 = (hashCode8 + (d3Var != null ? d3Var.hashCode() : 0)) * 37;
            o1 o1Var = this.f37639i;
            int hashCode10 = (hashCode9 + (o1Var != null ? o1Var.hashCode() : 0)) * 37;
            n1 n1Var = this.f37640j;
            int hashCode11 = (hashCode10 + (n1Var != null ? n1Var.hashCode() : 0)) * 37;
            q1 q1Var = this.f37641k;
            int hashCode12 = (hashCode11 + (q1Var != null ? q1Var.hashCode() : 0)) * 37;
            j0 j0Var = this.f37642l;
            int hashCode13 = (hashCode12 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
            i1 i1Var = this.f37643m;
            int hashCode14 = (hashCode13 + (i1Var != null ? i1Var.hashCode() : 0)) * 37;
            g0 g0Var = this.f37644n;
            int hashCode15 = (hashCode14 + (g0Var != null ? g0Var.hashCode() : 0)) * 37;
            y yVar = this.f37645o;
            int hashCode16 = (hashCode15 + (yVar != null ? yVar.hashCode() : 0)) * 37;
            d dVar2 = this.f37646p;
            int hashCode17 = (hashCode16 + (dVar2 != null ? dVar2.hashCode() : 0)) * 37;
            nt.c cVar = this.f37647q;
            int hashCode18 = hashCode17 + (cVar != null ? cVar.hashCode() : 0);
            this.hashCode = hashCode18;
            return hashCode18;
        }
        return i11;
    }

    public final xt.h i() {
        return this.f37633c;
    }

    public final i1 j() {
        return this.f37643m;
    }

    public final n1 k() {
        return this.f37640j;
    }

    public final o1 l() {
        return this.f37639i;
    }

    public final q1 m() {
        return this.f37641k;
    }

    public final d2 n() {
        return this.f37634d;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m738newBuilder();
    }

    public final w2 o() {
        return this.f37632b;
    }

    public final z2 p() {
        return this.f37636f;
    }

    public final ov.d q() {
        return this.f37637g;
    }

    public final d3 r() {
        return this.f37638h;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        lt.b bVar = this.f37631a;
        if (bVar != null) {
            arrayList.add("actionStatus=" + bVar);
        }
        w2 w2Var = this.f37632b;
        if (w2Var != null) {
            arrayList.add("vehicleData=" + w2Var);
        }
        xt.h hVar = this.f37633c;
        if (hVar != null) {
            arrayList.add("getSessionInfoResponse=" + hVar);
        }
        d2 d2Var = this.f37634d;
        if (d2Var != null) {
            arrayList.add("streamMessage=" + d2Var);
        }
        k1 k1Var = this.f37635e;
        if (k1Var != null) {
            arrayList.add("getNearbyChargingSites=" + k1Var);
        }
        z2 z2Var = this.f37636f;
        if (z2Var != null) {
            arrayList.add("vehicleDataSubscriptionResponse=" + z2Var);
        }
        ov.d dVar = this.f37637g;
        if (dVar != null) {
            arrayList.add("vitals=" + dVar);
        }
        d3 d3Var = this.f37638h;
        if (d3Var != null) {
            arrayList.add("vitalsSubscriptionResponse=" + d3Var);
        }
        o1 o1Var = this.f37639i;
        if (o1Var != null) {
            arrayList.add("ping=" + o1Var);
        }
        n1 n1Var = this.f37640j;
        if (n1Var != null) {
            arrayList.add("piiKeyResponse=" + n1Var);
        }
        q1 q1Var = this.f37641k;
        if (q1Var != null) {
            arrayList.add("pseudonymSyncResponse=" + q1Var);
        }
        j0 j0Var = this.f37642l;
        if (j0Var != null) {
            arrayList.add("getRateTariffResponse=" + j0Var);
        }
        i1 i1Var = this.f37643m;
        if (i1Var != null) {
            arrayList.add("navigationRouteResponse=" + i1Var);
        }
        g0 g0Var = this.f37644n;
        if (g0Var != null) {
            arrayList.add("getManagedChargingSitesResponse=" + g0Var);
        }
        y yVar = this.f37645o;
        if (yVar != null) {
            arrayList.add("getChargeOnSolarFeatureResponse=" + yVar);
        }
        d dVar2 = this.f37646p;
        if (dVar2 != null) {
            arrayList.add("addManagedChargingSiteResponse=" + dVar2);
        }
        nt.c cVar = this.f37647q;
        if (cVar != null) {
            arrayList.add("centerDisplayResponse=" + cVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "Response{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m738newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(lt.b bVar, w2 w2Var, xt.h hVar, d2 d2Var, k1 k1Var, z2 z2Var, ov.d dVar, d3 d3Var, o1 o1Var, n1 n1Var, q1 q1Var, j0 j0Var, i1 i1Var, g0 g0Var, y yVar, d dVar2, nt.c cVar, okio.i unknownFields) {
        super(f37630t, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37631a = bVar;
        this.f37632b = w2Var;
        this.f37633c = hVar;
        this.f37634d = d2Var;
        this.f37635e = k1Var;
        this.f37636f = z2Var;
        this.f37637g = dVar;
        this.f37638h = d3Var;
        this.f37639i = o1Var;
        this.f37640j = n1Var;
        this.f37641k = q1Var;
        this.f37642l = j0Var;
        this.f37643m = i1Var;
        this.f37644n = g0Var;
        this.f37645o = yVar;
        this.f37646p = dVar2;
        this.f37647q = cVar;
        if (!(mr.d.e(w2Var, hVar, d2Var, k1Var, z2Var, dVar, d3Var, o1Var, n1Var, q1Var, j0Var, i1Var, g0Var, yVar, dVar2, cVar) <= 1)) {
            throw new IllegalArgumentException("At most one of vehicleData, getSessionInfoResponse, streamMessage, getNearbyChargingSites, vehicleDataSubscriptionResponse, vitals, vitalsSubscriptionResponse, ping, piiKeyResponse, pseudonymSyncResponse, getRateTariffResponse, navigationRouteResponse, getManagedChargingSitesResponse, getChargeOnSolarFeatureResponse, addManagedChargingSiteResponse, centerDisplayResponse may be non-null".toString());
        }
    }
}