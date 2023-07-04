package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class s0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<s0> f37589b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacSeatHeaterActions$HvacSeatHeaterAction#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f37590a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s0> {
        a(com.squareup.wire.b bVar, n00.d<s0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatHeaterActions", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s0(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(c.f37591p.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            c.f37591p.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + c.f37591p.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s0 redact(s0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(mr.d.a(value.b(), c.f37591p), okio.i.f42656d);
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

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: p  reason: collision with root package name */
        public static final ProtoAdapter<c> f37591p;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERUNKNOWN", tag = 1)

        /* renamed from: a  reason: collision with root package name */
        private final kt.u f37592a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATEROFF", tag = 2)

        /* renamed from: b  reason: collision with root package name */
        private final kt.u f37593b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERLOW", tag = 3)

        /* renamed from: c  reason: collision with root package name */
        private final kt.u f37594c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERMED", tag = 4)

        /* renamed from: d  reason: collision with root package name */
        private final kt.u f37595d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SEATHEATERHIGH", tag = 5)

        /* renamed from: e  reason: collision with root package name */
        private final kt.u f37596e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATUNKNOWN", tag = 6)

        /* renamed from: f  reason: collision with root package name */
        private final kt.u f37597f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATFRONTLEFT", tag = 7)

        /* renamed from: g  reason: collision with root package name */
        private final kt.u f37598g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATFRONTRIGHT", tag = 8)

        /* renamed from: h  reason: collision with root package name */
        private final kt.u f37599h;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARLEFT", tag = 9)

        /* renamed from: i  reason: collision with root package name */
        private final kt.u f37600i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARLEFTBACK", tag = 10)

        /* renamed from: j  reason: collision with root package name */
        private final kt.u f37601j;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARCENTER", tag = 11)

        /* renamed from: k  reason: collision with root package name */
        private final kt.u f37602k;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARRIGHT", tag = 12)

        /* renamed from: l  reason: collision with root package name */
        private final kt.u f37603l;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATREARRIGHTBACK", tag = 13)

        /* renamed from: m  reason: collision with root package name */
        private final kt.u f37604m;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATTHIRDROWLEFT", tag = 14)

        /* renamed from: n  reason: collision with root package name */
        private final kt.u f37605n;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARSEATTHIRDROWRIGHT", tag = 15)

        /* renamed from: o  reason: collision with root package name */
        private final kt.u f37606o;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacSeatHeaterActions.HvacSeatHeaterAction", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                kt.u uVar5 = null;
                kt.u uVar6 = null;
                kt.u uVar7 = null;
                kt.u uVar8 = null;
                kt.u uVar9 = null;
                kt.u uVar10 = null;
                kt.u uVar11 = null;
                kt.u uVar12 = null;
                kt.u uVar13 = null;
                kt.u uVar14 = null;
                kt.u uVar15 = null;
                while (true) {
                    int g11 = reader.g();
                    kt.u uVar16 = uVar12;
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar16, uVar15, uVar13, uVar14, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        case 7:
                            uVar7 = kt.u.f35845a.decode(reader);
                            break;
                        case 8:
                            uVar8 = kt.u.f35845a.decode(reader);
                            break;
                        case 9:
                            uVar9 = kt.u.f35845a.decode(reader);
                            break;
                        case 10:
                            uVar10 = kt.u.f35845a.decode(reader);
                            break;
                        case 11:
                            uVar11 = kt.u.f35845a.decode(reader);
                            break;
                        case 12:
                            uVar12 = kt.u.f35845a.decode(reader);
                            continue;
                        case 13:
                            uVar15 = kt.u.f35845a.decode(reader);
                            break;
                        case 14:
                            uVar13 = kt.u.f35845a.decode(reader);
                            break;
                        case 15:
                            uVar14 = kt.u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                    uVar12 = uVar16;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.p());
                protoAdapter.encodeWithTag(writer, 2, value.o());
                protoAdapter.encodeWithTag(writer, 3, value.m());
                protoAdapter.encodeWithTag(writer, 4, value.n());
                protoAdapter.encodeWithTag(writer, 5, value.l());
                protoAdapter.encodeWithTag(writer, 6, value.k());
                protoAdapter.encodeWithTag(writer, 7, value.b());
                protoAdapter.encodeWithTag(writer, 8, value.c());
                protoAdapter.encodeWithTag(writer, 9, value.e());
                protoAdapter.encodeWithTag(writer, 10, value.f());
                protoAdapter.encodeWithTag(writer, 11, value.d());
                protoAdapter.encodeWithTag(writer, 12, value.g());
                protoAdapter.encodeWithTag(writer, 13, value.h());
                protoAdapter.encodeWithTag(writer, 14, value.i());
                protoAdapter.encodeWithTag(writer, 15, value.j());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.p()) + protoAdapter.encodedSizeWithTag(2, value.o()) + protoAdapter.encodedSizeWithTag(3, value.m()) + protoAdapter.encodedSizeWithTag(4, value.n()) + protoAdapter.encodedSizeWithTag(5, value.l()) + protoAdapter.encodedSizeWithTag(6, value.k()) + protoAdapter.encodedSizeWithTag(7, value.b()) + protoAdapter.encodedSizeWithTag(8, value.c()) + protoAdapter.encodedSizeWithTag(9, value.e()) + protoAdapter.encodedSizeWithTag(10, value.f()) + protoAdapter.encodedSizeWithTag(11, value.d()) + protoAdapter.encodedSizeWithTag(12, value.g()) + protoAdapter.encodedSizeWithTag(13, value.h()) + protoAdapter.encodedSizeWithTag(14, value.i()) + protoAdapter.encodedSizeWithTag(15, value.j());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u p11 = value.p();
                kt.u redact = p11 == null ? null : kt.u.f35845a.redact(p11);
                kt.u o11 = value.o();
                kt.u redact2 = o11 == null ? null : kt.u.f35845a.redact(o11);
                kt.u m11 = value.m();
                kt.u redact3 = m11 == null ? null : kt.u.f35845a.redact(m11);
                kt.u n11 = value.n();
                kt.u redact4 = n11 == null ? null : kt.u.f35845a.redact(n11);
                kt.u l11 = value.l();
                kt.u redact5 = l11 == null ? null : kt.u.f35845a.redact(l11);
                kt.u k11 = value.k();
                kt.u redact6 = k11 == null ? null : kt.u.f35845a.redact(k11);
                kt.u b11 = value.b();
                kt.u redact7 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                kt.u redact8 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u e11 = value.e();
                kt.u redact9 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u f11 = value.f();
                kt.u redact10 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u d11 = value.d();
                kt.u redact11 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u g11 = value.g();
                kt.u redact12 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u h11 = value.h();
                kt.u redact13 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u i11 = value.i();
                kt.u redact14 = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u j11 = value.j();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, redact14, j11 == null ? null : kt.u.f35845a.redact(j11), okio.i.f42656d);
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
            f37591p = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, kt.u uVar15, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) != 0 ? null : uVar10, (i11 & 1024) != 0 ? null : uVar11, (i11 & 2048) != 0 ? null : uVar12, (i11 & 4096) != 0 ? null : uVar13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : uVar14, (i11 & 16384) != 0 ? null : uVar15, (i11 & 32768) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, kt.u uVar15, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, unknownFields);
        }

        public final kt.u b() {
            return this.f37598g;
        }

        public final kt.u c() {
            return this.f37599h;
        }

        public final kt.u d() {
            return this.f37602k;
        }

        public final kt.u e() {
            return this.f37600i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37592a, cVar.f37592a) && kotlin.jvm.internal.s.c(this.f37593b, cVar.f37593b) && kotlin.jvm.internal.s.c(this.f37594c, cVar.f37594c) && kotlin.jvm.internal.s.c(this.f37595d, cVar.f37595d) && kotlin.jvm.internal.s.c(this.f37596e, cVar.f37596e) && kotlin.jvm.internal.s.c(this.f37597f, cVar.f37597f) && kotlin.jvm.internal.s.c(this.f37598g, cVar.f37598g) && kotlin.jvm.internal.s.c(this.f37599h, cVar.f37599h) && kotlin.jvm.internal.s.c(this.f37600i, cVar.f37600i) && kotlin.jvm.internal.s.c(this.f37601j, cVar.f37601j) && kotlin.jvm.internal.s.c(this.f37602k, cVar.f37602k) && kotlin.jvm.internal.s.c(this.f37603l, cVar.f37603l) && kotlin.jvm.internal.s.c(this.f37604m, cVar.f37604m) && kotlin.jvm.internal.s.c(this.f37605n, cVar.f37605n) && kotlin.jvm.internal.s.c(this.f37606o, cVar.f37606o);
            }
            return false;
        }

        public final kt.u f() {
            return this.f37601j;
        }

        public final kt.u g() {
            return this.f37603l;
        }

        public final kt.u h() {
            return this.f37604m;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f37592a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f37593b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f37594c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f37595d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f37596e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f37597f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f37598g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f37599h;
                int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
                kt.u uVar9 = this.f37600i;
                int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
                kt.u uVar10 = this.f37601j;
                int hashCode11 = (hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0)) * 37;
                kt.u uVar11 = this.f37602k;
                int hashCode12 = (hashCode11 + (uVar11 != null ? uVar11.hashCode() : 0)) * 37;
                kt.u uVar12 = this.f37603l;
                int hashCode13 = (hashCode12 + (uVar12 != null ? uVar12.hashCode() : 0)) * 37;
                kt.u uVar13 = this.f37604m;
                int hashCode14 = (hashCode13 + (uVar13 != null ? uVar13.hashCode() : 0)) * 37;
                kt.u uVar14 = this.f37605n;
                int hashCode15 = (hashCode14 + (uVar14 != null ? uVar14.hashCode() : 0)) * 37;
                kt.u uVar15 = this.f37606o;
                int hashCode16 = hashCode15 + (uVar15 != null ? uVar15.hashCode() : 0);
                this.hashCode = hashCode16;
                return hashCode16;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f37605n;
        }

        public final kt.u j() {
            return this.f37606o;
        }

        public final kt.u k() {
            return this.f37597f;
        }

        public final kt.u l() {
            return this.f37596e;
        }

        public final kt.u m() {
            return this.f37594c;
        }

        public final kt.u n() {
            return this.f37595d;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m729newBuilder();
        }

        public final kt.u o() {
            return this.f37593b;
        }

        public final kt.u p() {
            return this.f37592a;
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f37592a;
            if (uVar != null) {
                arrayList.add("SEAT_HEATER_UNKNOWN=" + uVar);
            }
            kt.u uVar2 = this.f37593b;
            if (uVar2 != null) {
                arrayList.add("SEAT_HEATER_OFF=" + uVar2);
            }
            kt.u uVar3 = this.f37594c;
            if (uVar3 != null) {
                arrayList.add("SEAT_HEATER_LOW=" + uVar3);
            }
            kt.u uVar4 = this.f37595d;
            if (uVar4 != null) {
                arrayList.add("SEAT_HEATER_MED=" + uVar4);
            }
            kt.u uVar5 = this.f37596e;
            if (uVar5 != null) {
                arrayList.add("SEAT_HEATER_HIGH=" + uVar5);
            }
            kt.u uVar6 = this.f37597f;
            if (uVar6 != null) {
                arrayList.add("CAR_SEAT_UNKNOWN=" + uVar6);
            }
            kt.u uVar7 = this.f37598g;
            if (uVar7 != null) {
                arrayList.add("CAR_SEAT_FRONT_LEFT=" + uVar7);
            }
            kt.u uVar8 = this.f37599h;
            if (uVar8 != null) {
                arrayList.add("CAR_SEAT_FRONT_RIGHT=" + uVar8);
            }
            kt.u uVar9 = this.f37600i;
            if (uVar9 != null) {
                arrayList.add("CAR_SEAT_REAR_LEFT=" + uVar9);
            }
            kt.u uVar10 = this.f37601j;
            if (uVar10 != null) {
                arrayList.add("CAR_SEAT_REAR_LEFT_BACK=" + uVar10);
            }
            kt.u uVar11 = this.f37602k;
            if (uVar11 != null) {
                arrayList.add("CAR_SEAT_REAR_CENTER=" + uVar11);
            }
            kt.u uVar12 = this.f37603l;
            if (uVar12 != null) {
                arrayList.add("CAR_SEAT_REAR_RIGHT=" + uVar12);
            }
            kt.u uVar13 = this.f37604m;
            if (uVar13 != null) {
                arrayList.add("CAR_SEAT_REAR_RIGHT_BACK=" + uVar13);
            }
            kt.u uVar14 = this.f37605n;
            if (uVar14 != null) {
                arrayList.add("CAR_SEAT_THIRD_ROW_LEFT=" + uVar14);
            }
            kt.u uVar15 = this.f37606o;
            if (uVar15 != null) {
                arrayList.add("CAR_SEAT_THIRD_ROW_RIGHT=" + uVar15);
            }
            l02 = wz.e0.l0(arrayList, ", ", "HvacSeatHeaterAction{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder  reason: collision with other method in class */
        public /* synthetic */ Void m729newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, kt.u uVar15, okio.i unknownFields) {
            super(f37591p, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f37592a = uVar;
            this.f37593b = uVar2;
            this.f37594c = uVar3;
            this.f37595d = uVar4;
            this.f37596e = uVar5;
            this.f37597f = uVar6;
            this.f37598g = uVar7;
            this.f37599h = uVar8;
            this.f37600i = uVar9;
            this.f37601j = uVar10;
            this.f37602k = uVar11;
            this.f37603l = uVar12;
            this.f37604m = uVar13;
            this.f37605n = uVar14;
            this.f37606o = uVar15;
            if (mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1) {
                if (!(mr.d.e(uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15) <= 1)) {
                    throw new IllegalArgumentException("At most one of CAR_SEAT_UNKNOWN, CAR_SEAT_FRONT_LEFT, CAR_SEAT_FRONT_RIGHT, CAR_SEAT_REAR_LEFT, CAR_SEAT_REAR_LEFT_BACK, CAR_SEAT_REAR_CENTER, CAR_SEAT_REAR_RIGHT, CAR_SEAT_REAR_RIGHT_BACK, CAR_SEAT_THIRD_ROW_LEFT, CAR_SEAT_THIRD_ROW_RIGHT may be non-null".toString());
                }
                return;
            }
            throw new IllegalArgumentException("At most one of SEAT_HEATER_UNKNOWN, SEAT_HEATER_OFF, SEAT_HEATER_LOW, SEAT_HEATER_MED, SEAT_HEATER_HIGH may be non-null".toString());
        }
    }

    static {
        new b(null);
        f37589b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s0.class), com.squareup.wire.o.PROTO_3);
    }

    public s0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ s0(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final s0 a(List<c> hvacSeatHeaterAction, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(hvacSeatHeaterAction, "hvacSeatHeaterAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s0(hvacSeatHeaterAction, unknownFields);
    }

    public final List<c> b() {
        return this.f37590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), s0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37590a, s0Var.f37590a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37590a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m728newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f37590a.isEmpty()) {
            List<c> list = this.f37590a;
            arrayList.add("hvacSeatHeaterAction=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "HvacSeatHeaterActions{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m728newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(List<c> hvacSeatHeaterAction, okio.i unknownFields) {
        super(f37589b, unknownFields);
        kotlin.jvm.internal.s.g(hvacSeatHeaterAction, "hvacSeatHeaterAction");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37590a = mr.d.g("hvacSeatHeaterAction", hvacSeatHeaterAction);
    }
}