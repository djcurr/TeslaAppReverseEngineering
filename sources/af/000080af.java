package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;

/* loaded from: classes6.dex */
public final class d extends com.squareup.wire.f {

    /* renamed from: q  reason: collision with root package name */
    public static final ProtoAdapter<d> f35738q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35739a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35740b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35741c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35742d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final u f35743e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final u f35744f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final u f35745g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final u f35746h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)

    /* renamed from: i  reason: collision with root package name */
    private final u f35747i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 13)

    /* renamed from: j  reason: collision with root package name */
    private final u f35748j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 14)

    /* renamed from: k  reason: collision with root package name */
    private final u f35749k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 15)

    /* renamed from: l  reason: collision with root package name */
    private final u f35750l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 16)

    /* renamed from: m  reason: collision with root package name */
    private final u f35751m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

    /* renamed from: n  reason: collision with root package name */
    private final u f35752n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

    /* renamed from: o  reason: collision with root package name */
    private final u f35753o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)

    /* renamed from: p  reason: collision with root package name */
    private final u f35754p;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.EfficiencyPackage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            u uVar5 = null;
            u uVar6 = null;
            u uVar7 = null;
            u uVar8 = null;
            u uVar9 = null;
            u uVar10 = null;
            u uVar11 = null;
            u uVar12 = null;
            u uVar13 = null;
            u uVar14 = null;
            u uVar15 = null;
            u uVar16 = null;
            while (true) {
                int g11 = reader.g();
                u uVar17 = uVar12;
                if (g11 == -1) {
                    return new d(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar17, uVar16, uVar13, uVar14, uVar15, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        uVar = u.f35845a.decode(reader);
                        break;
                    case 2:
                        uVar2 = u.f35845a.decode(reader);
                        break;
                    case 3:
                        uVar3 = u.f35845a.decode(reader);
                        break;
                    case 4:
                        uVar4 = u.f35845a.decode(reader);
                        break;
                    case 5:
                        uVar5 = u.f35845a.decode(reader);
                        break;
                    case 6:
                        uVar6 = u.f35845a.decode(reader);
                        break;
                    case 7:
                        uVar7 = u.f35845a.decode(reader);
                        break;
                    case 8:
                        uVar8 = u.f35845a.decode(reader);
                        break;
                    case 9:
                        uVar13 = u.f35845a.decode(reader);
                        break;
                    case 10:
                        uVar14 = u.f35845a.decode(reader);
                        break;
                    case 11:
                        uVar15 = u.f35845a.decode(reader);
                        break;
                    case 12:
                        uVar9 = u.f35845a.decode(reader);
                        break;
                    case 13:
                        uVar10 = u.f35845a.decode(reader);
                        break;
                    case 14:
                        uVar11 = u.f35845a.decode(reader);
                        break;
                    case 15:
                        uVar12 = u.f35845a.decode(reader);
                        continue;
                    case 16:
                        uVar16 = u.f35845a.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
                uVar12 = uVar17;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.b());
            protoAdapter.encodeWithTag(writer, 2, value.f());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            protoAdapter.encodeWithTag(writer, 4, value.e());
            protoAdapter.encodeWithTag(writer, 5, value.g());
            protoAdapter.encodeWithTag(writer, 6, value.j());
            protoAdapter.encodeWithTag(writer, 7, value.c());
            protoAdapter.encodeWithTag(writer, 8, value.k());
            protoAdapter.encodeWithTag(writer, 12, value.i());
            protoAdapter.encodeWithTag(writer, 13, value.h());
            protoAdapter.encodeWithTag(writer, 14, value.m());
            protoAdapter.encodeWithTag(writer, 15, value.n());
            protoAdapter.encodeWithTag(writer, 16, value.l());
            protoAdapter.encodeWithTag(writer, 9, value.p());
            protoAdapter.encodeWithTag(writer, 10, value.o());
            protoAdapter.encodeWithTag(writer, 11, value.q());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.f()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.e()) + protoAdapter.encodedSizeWithTag(5, value.g()) + protoAdapter.encodedSizeWithTag(6, value.j()) + protoAdapter.encodedSizeWithTag(7, value.c()) + protoAdapter.encodedSizeWithTag(8, value.k()) + protoAdapter.encodedSizeWithTag(12, value.i()) + protoAdapter.encodedSizeWithTag(13, value.h()) + protoAdapter.encodedSizeWithTag(14, value.m()) + protoAdapter.encodedSizeWithTag(15, value.n()) + protoAdapter.encodedSizeWithTag(16, value.l()) + protoAdapter.encodedSizeWithTag(9, value.p()) + protoAdapter.encodedSizeWithTag(10, value.o()) + protoAdapter.encodedSizeWithTag(11, value.q());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            kotlin.jvm.internal.s.g(value, "value");
            u b11 = value.b();
            u redact = b11 == null ? null : u.f35845a.redact(b11);
            u f11 = value.f();
            u redact2 = f11 == null ? null : u.f35845a.redact(f11);
            u d11 = value.d();
            u redact3 = d11 == null ? null : u.f35845a.redact(d11);
            u e11 = value.e();
            u redact4 = e11 == null ? null : u.f35845a.redact(e11);
            u g11 = value.g();
            u redact5 = g11 == null ? null : u.f35845a.redact(g11);
            u j11 = value.j();
            u redact6 = j11 == null ? null : u.f35845a.redact(j11);
            u c11 = value.c();
            u redact7 = c11 == null ? null : u.f35845a.redact(c11);
            u k11 = value.k();
            u redact8 = k11 == null ? null : u.f35845a.redact(k11);
            u i11 = value.i();
            u redact9 = i11 == null ? null : u.f35845a.redact(i11);
            u h11 = value.h();
            u redact10 = h11 == null ? null : u.f35845a.redact(h11);
            u m11 = value.m();
            u redact11 = m11 == null ? null : u.f35845a.redact(m11);
            u n11 = value.n();
            u redact12 = n11 == null ? null : u.f35845a.redact(n11);
            u l11 = value.l();
            u redact13 = l11 == null ? null : u.f35845a.redact(l11);
            u p11 = value.p();
            u redact14 = p11 == null ? null : u.f35845a.redact(p11);
            u o11 = value.o();
            u redact15 = o11 == null ? null : u.f35845a.redact(o11);
            u q11 = value.q();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, redact14, redact15, q11 == null ? null : u.f35845a.redact(q11), okio.i.f42656d);
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
        f35738q = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), com.squareup.wire.o.PROTO_3);
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ d(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) != 0 ? null : uVar10, (i11 & 1024) != 0 ? null : uVar11, (i11 & 2048) != 0 ? null : uVar12, (i11 & 4096) != 0 ? null : uVar13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : uVar14, (i11 & 16384) != 0 ? null : uVar15, (i11 & 32768) != 0 ? null : uVar16, (i11 & 65536) != 0 ? okio.i.f42656d : iVar);
    }

    public final d a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, unknownFields);
    }

    public final u b() {
        return this.f35739a;
    }

    public final u c() {
        return this.f35745g;
    }

    public final u d() {
        return this.f35741c;
    }

    public final u e() {
        return this.f35742d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35739a, dVar.f35739a) && kotlin.jvm.internal.s.c(this.f35740b, dVar.f35740b) && kotlin.jvm.internal.s.c(this.f35741c, dVar.f35741c) && kotlin.jvm.internal.s.c(this.f35742d, dVar.f35742d) && kotlin.jvm.internal.s.c(this.f35743e, dVar.f35743e) && kotlin.jvm.internal.s.c(this.f35744f, dVar.f35744f) && kotlin.jvm.internal.s.c(this.f35745g, dVar.f35745g) && kotlin.jvm.internal.s.c(this.f35746h, dVar.f35746h) && kotlin.jvm.internal.s.c(this.f35747i, dVar.f35747i) && kotlin.jvm.internal.s.c(this.f35748j, dVar.f35748j) && kotlin.jvm.internal.s.c(this.f35749k, dVar.f35749k) && kotlin.jvm.internal.s.c(this.f35750l, dVar.f35750l) && kotlin.jvm.internal.s.c(this.f35751m, dVar.f35751m) && kotlin.jvm.internal.s.c(this.f35752n, dVar.f35752n) && kotlin.jvm.internal.s.c(this.f35753o, dVar.f35753o) && kotlin.jvm.internal.s.c(this.f35754p, dVar.f35754p);
        }
        return false;
    }

    public final u f() {
        return this.f35740b;
    }

    public final u g() {
        return this.f35743e;
    }

    public final u h() {
        return this.f35748j;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35739a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35740b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35741c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35742d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35743e;
            int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
            u uVar6 = this.f35744f;
            int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
            u uVar7 = this.f35745g;
            int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
            u uVar8 = this.f35746h;
            int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
            u uVar9 = this.f35747i;
            int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
            u uVar10 = this.f35748j;
            int hashCode11 = (hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0)) * 37;
            u uVar11 = this.f35749k;
            int hashCode12 = (hashCode11 + (uVar11 != null ? uVar11.hashCode() : 0)) * 37;
            u uVar12 = this.f35750l;
            int hashCode13 = (hashCode12 + (uVar12 != null ? uVar12.hashCode() : 0)) * 37;
            u uVar13 = this.f35751m;
            int hashCode14 = (hashCode13 + (uVar13 != null ? uVar13.hashCode() : 0)) * 37;
            u uVar14 = this.f35752n;
            int hashCode15 = (hashCode14 + (uVar14 != null ? uVar14.hashCode() : 0)) * 37;
            u uVar15 = this.f35753o;
            int hashCode16 = (hashCode15 + (uVar15 != null ? uVar15.hashCode() : 0)) * 37;
            u uVar16 = this.f35754p;
            int hashCode17 = hashCode16 + (uVar16 != null ? uVar16.hashCode() : 0);
            this.hashCode = hashCode17;
            return hashCode17;
        }
        return i11;
    }

    public final u i() {
        return this.f35747i;
    }

    public final u j() {
        return this.f35744f;
    }

    public final u k() {
        return this.f35746h;
    }

    public final u l() {
        return this.f35751m;
    }

    public final u m() {
        return this.f35749k;
    }

    public final u n() {
        return this.f35750l;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m633newBuilder();
    }

    public final u o() {
        return this.f35753o;
    }

    public final u p() {
        return this.f35752n;
    }

    public final u q() {
        return this.f35754p;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35739a;
        if (uVar != null) {
            arrayList.add("Default=" + uVar);
        }
        u uVar2 = this.f35740b;
        if (uVar2 != null) {
            arrayList.add("M3SRPlus2020=" + uVar2);
        }
        u uVar3 = this.f35741c;
        if (uVar3 != null) {
            arrayList.add("M3LR2020=" + uVar3);
        }
        u uVar4 = this.f35742d;
        if (uVar4 != null) {
            arrayList.add("M3LRPerformance2020=" + uVar4);
        }
        u uVar5 = this.f35743e;
        if (uVar5 != null) {
            arrayList.add("M3SRPlus2020Q4GFSH=" + uVar5);
        }
        u uVar6 = this.f35744f;
        if (uVar6 != null) {
            arrayList.add("MY2020=" + uVar6);
        }
        u uVar7 = this.f35745g;
        if (uVar7 != null) {
            arrayList.add("M32021=" + uVar7);
        }
        u uVar8 = this.f35746h;
        if (uVar8 != null) {
            arrayList.add("MY2021=" + uVar8);
        }
        u uVar9 = this.f35747i;
        if (uVar9 != null) {
            arrayList.add("M3SRPlus2021Q3GFSH=" + uVar9);
        }
        u uVar10 = this.f35748j;
        if (uVar10 != null) {
            arrayList.add("M3SRPlus2021Q3FREMONT=" + uVar10);
        }
        u uVar11 = this.f35749k;
        if (uVar11 != null) {
            arrayList.add("MYSRPlus2021Q3GFSH=" + uVar11);
        }
        u uVar12 = this.f35750l;
        if (uVar12 != null) {
            arrayList.add("MYSRPlus2022Q1TX=" + uVar12);
        }
        u uVar13 = this.f35751m;
        if (uVar13 != null) {
            arrayList.add("MYRWDEU2022=" + uVar13);
        }
        u uVar14 = this.f35752n;
        if (uVar14 != null) {
            arrayList.add("SX2020=" + uVar14);
        }
        u uVar15 = this.f35753o;
        if (uVar15 != null) {
            arrayList.add("S2=" + uVar15);
        }
        u uVar16 = this.f35754p;
        if (uVar16 != null) {
            arrayList.add("SX2020H2=" + uVar16);
        }
        l02 = e0.l0(arrayList, ", ", "EfficiencyPackage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m633newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, u uVar11, u uVar12, u uVar13, u uVar14, u uVar15, u uVar16, okio.i unknownFields) {
        super(f35738q, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35739a = uVar;
        this.f35740b = uVar2;
        this.f35741c = uVar3;
        this.f35742d = uVar4;
        this.f35743e = uVar5;
        this.f35744f = uVar6;
        this.f35745g = uVar7;
        this.f35746h = uVar8;
        this.f35747i = uVar9;
        this.f35748j = uVar10;
        this.f35749k = uVar11;
        this.f35750l = uVar12;
        this.f35751m = uVar13;
        this.f35752n = uVar14;
        this.f35753o = uVar15;
        this.f35754p = uVar16;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16) <= 1)) {
            throw new IllegalArgumentException("At most one of Default, M3SRPlus2020, M3LR2020, M3LRPerformance2020, M3SRPlus2020Q4GFSH, MY2020, M32021, MY2021, M3SRPlus2021Q3GFSH, M3SRPlus2021Q3FREMONT, MYSRPlus2021Q3GFSH, MYSRPlus2022Q1TX, MYRWDEU2022, SX2020, S2, SX2020H2 may be non-null".toString());
        }
    }
}