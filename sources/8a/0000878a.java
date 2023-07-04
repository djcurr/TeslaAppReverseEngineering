package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class n extends com.squareup.wire.f {

    /* renamed from: l */
    public static final ProtoAdapter<n> f39177l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "gui24HourTimeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: a */
    private final boolean f39178a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showRangeUnitsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: b */
    private final boolean f39179b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TirePressureUnit#ADAPTER", jsonName = "guiTirepressureUnitsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: c */
    private final g f39180c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$SpeedUnit#ADAPTER", jsonName = "guiDistanceUnits", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: d */
    private final e f39181d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TemperatureUnit#ADAPTER", jsonName = "guiTemperatureUnits", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: e */
    private final f f39182e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$ChargeRateUnit#ADAPTER", jsonName = "guiChargeRateUnits", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: f */
    private final a f39183f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$RangeDisplay#ADAPTER", jsonName = "guiRangeDisplay", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: g */
    private final d f39184g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: h */
    private final Instant f39185h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "gui24HourTime", tag = 104)

    /* renamed from: i */
    private final Boolean f39186i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showRangeUnits", tag = 106)

    /* renamed from: j */
    private final Boolean f39187j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings$TirePressureUnit#ADAPTER", jsonName = "guiTirepressureUnits", tag = 108)

    /* renamed from: k */
    private final g f39188k;

    /* loaded from: classes6.dex */
    public static final class a extends com.squareup.wire.f {

        /* renamed from: e */
        public static final ProtoAdapter<a> f39189e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39190a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39191b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39192c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39193d;

        /* renamed from: mt.n$a$a */
        /* loaded from: classes6.dex */
        public static final class C0757a extends ProtoAdapter<a> {
            C0757a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.ChargeRateUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public a decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new a(uVar, uVar2, uVar3, uVar4, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 == 3) {
                        uVar3 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 4) {
                        reader.m(g11);
                    } else {
                        uVar4 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, a value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.e());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public a redact(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u b11 = value.b();
                kt.u redact = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u e11 = value.e();
                kt.u redact3 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u c11 = value.c();
                return value.a(redact, redact2, redact3, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39189e = new C0757a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), com.squareup.wire.o.PROTO_3);
        }

        public a() {
            this(null, null, null, null, null, 31, null);
        }

        public /* synthetic */ a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
        }

        public final a a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new a(uVar, uVar2, uVar3, uVar4, unknownFields);
        }

        public final kt.u b() {
            return this.f39190a;
        }

        public final kt.u c() {
            return this.f39193d;
        }

        public final kt.u d() {
            return this.f39191b;
        }

        public final kt.u e() {
            return this.f39192c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39190a, aVar.f39190a) && kotlin.jvm.internal.s.c(this.f39191b, aVar.f39191b) && kotlin.jvm.internal.s.c(this.f39192c, aVar.f39192c) && kotlin.jvm.internal.s.c(this.f39193d, aVar.f39193d);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39190a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39191b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39192c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39193d;
                int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m787newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39190a;
            if (uVar != null) {
                arrayList.add("Invalid=" + uVar);
            }
            kt.u uVar2 = this.f39191b;
            if (uVar2 != null) {
                arrayList.add("KilometersPerHour=" + uVar2);
            }
            kt.u uVar3 = this.f39192c;
            if (uVar3 != null) {
                arrayList.add("MilesPerHour=" + uVar3);
            }
            kt.u uVar4 = this.f39193d;
            if (uVar4 != null) {
                arrayList.add("kW=" + uVar4);
            }
            l02 = e0.l0(arrayList, ", ", "ChargeRateUnit{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m787newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            super(f39189e, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39190a = uVar;
            this.f39191b = uVar2;
            this.f39192c = uVar3;
            this.f39193d = uVar4;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
                throw new IllegalArgumentException("At most one of Invalid, KilometersPerHour, MilesPerHour, kW may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends ProtoAdapter<n> {
        b(com.squareup.wire.b bVar, n00.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n decode(com.squareup.wire.k reader) {
            long j11;
            g gVar;
            kotlin.jvm.internal.s.g(reader, "reader");
            g gVar2 = g.TirePressureUnitPsi;
            long d11 = reader.d();
            e eVar = null;
            boolean z11 = false;
            boolean z12 = false;
            f fVar = null;
            a aVar = null;
            d dVar = null;
            Instant instant = null;
            Boolean bool = null;
            Boolean bool2 = null;
            g gVar3 = null;
            g gVar4 = gVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n(z11, z12, gVar4, eVar, fVar, aVar, dVar, instant, bool, bool2, gVar3, reader.e(d11));
                }
                if (g11 == 104) {
                    j11 = d11;
                    bool = ProtoAdapter.BOOL.decode(reader);
                } else if (g11 != 106) {
                    if (g11 != 108) {
                        switch (g11) {
                            case 1:
                                j11 = d11;
                                eVar = e.f39197c.decode(reader);
                                break;
                            case 2:
                                j11 = d11;
                                fVar = f.f39200c.decode(reader);
                                break;
                            case 3:
                                j11 = d11;
                                aVar = a.f39189e.decode(reader);
                                break;
                            case 4:
                                j11 = d11;
                                z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                j11 = d11;
                                dVar = d.f39194c.decode(reader);
                                break;
                            case 6:
                                j11 = d11;
                                z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                j11 = d11;
                                instant = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 8:
                                try {
                                    gVar4 = g.ADAPTER.decode(reader);
                                    j11 = d11;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                    j11 = d11;
                                    gVar = gVar4;
                                    reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                    break;
                                }
                            default:
                                reader.m(g11);
                                j11 = d11;
                                gVar = gVar4;
                                break;
                        }
                    } else {
                        j11 = d11;
                        gVar = gVar4;
                        try {
                            gVar3 = g.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                        }
                    }
                    gVar4 = gVar;
                } else {
                    j11 = d11;
                    bool2 = ProtoAdapter.BOOL.decode(reader);
                }
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.d()));
            }
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.l()));
            }
            if (value.j() != g.TirePressureUnitPsi) {
                g.ADAPTER.encodeWithTag(writer, 8, value.j());
            }
            if (value.f() != null) {
                e.f39197c.encodeWithTag(writer, 1, value.f());
            }
            if (value.h() != null) {
                f.f39200c.encodeWithTag(writer, 2, value.h());
            }
            if (value.e() != null) {
                a.f39189e.encodeWithTag(writer, 3, value.e());
            }
            if (value.g() != null) {
                d.f39194c.encodeWithTag(writer, 5, value.g());
            }
            if (value.m() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.m());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 104, value.c());
            protoAdapter.encodeWithTag(writer, 106, value.k());
            g.ADAPTER.encodeWithTag(writer, 108, value.i());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.d()));
            }
            if (value.l()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.l()));
            }
            if (value.j() != g.TirePressureUnitPsi) {
                z11 += g.ADAPTER.encodedSizeWithTag(8, value.j());
            }
            if (value.f() != null) {
                z11 += e.f39197c.encodedSizeWithTag(1, value.f());
            }
            if (value.h() != null) {
                z11 += f.f39200c.encodedSizeWithTag(2, value.h());
            }
            if (value.e() != null) {
                z11 += a.f39189e.encodedSizeWithTag(3, value.e());
            }
            if (value.g() != null) {
                z11 += d.f39194c.encodedSizeWithTag(5, value.g());
            }
            if (value.m() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.m());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return z11 + protoAdapter.encodedSizeWithTag(104, value.c()) + protoAdapter.encodedSizeWithTag(106, value.k()) + g.ADAPTER.encodedSizeWithTag(108, value.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n redact(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            e f11 = value.f();
            e redact = f11 == null ? null : e.f39197c.redact(f11);
            f h11 = value.h();
            f redact2 = h11 == null ? null : f.f39200c.redact(h11);
            a e11 = value.e();
            a redact3 = e11 == null ? null : a.f39189e.redact(e11);
            d g11 = value.g();
            d redact4 = g11 == null ? null : d.f39194c.redact(g11);
            Instant m11 = value.m();
            return n.b(value, false, false, null, redact, redact2, redact3, redact4, m11 == null ? null : ProtoAdapter.INSTANT.redact(m11), null, null, null, okio.i.f42656d, 1799, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<d> f39194c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39195a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39196b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.RangeDisplay", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public d decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new d(uVar, uVar2, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        uVar2 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, d value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public d redact(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u b11 = value.b();
                kt.u redact = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                return value.a(redact, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39194c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), com.squareup.wire.o.PROTO_3);
        }

        public d() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ d(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final d a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new d(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39195a;
        }

        public final kt.u c() {
            return this.f39196b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39195a, dVar.f39195a) && kotlin.jvm.internal.s.c(this.f39196b, dVar.f39196b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39195a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39196b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m788newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39195a;
            if (uVar != null) {
                arrayList.add("Ideal=" + uVar);
            }
            kt.u uVar2 = this.f39196b;
            if (uVar2 != null) {
                arrayList.add("Rated=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "RangeDisplay{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m788newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39194c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39195a = uVar;
            this.f39196b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of Ideal, Rated may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<e> f39197c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39198a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39199b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.SpeedUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public e decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(uVar, uVar2, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        uVar2 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, e value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public e redact(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u b11 = value.b();
                kt.u redact = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                return value.a(redact, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39197c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), com.squareup.wire.o.PROTO_3);
        }

        public e() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ e(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final e a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new e(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39198a;
        }

        public final kt.u c() {
            return this.f39199b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39198a, eVar.f39198a) && kotlin.jvm.internal.s.c(this.f39199b, eVar.f39199b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39198a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39199b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m789newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39198a;
            if (uVar != null) {
                arrayList.add("KilometersPerHour=" + uVar);
            }
            kt.u uVar2 = this.f39199b;
            if (uVar2 != null) {
                arrayList.add("MilesPerHour=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "SpeedUnit{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m789newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39197c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39198a = uVar;
            this.f39199b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of KilometersPerHour, MilesPerHour may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<f> f39200c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39201a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39202b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<f> {
            a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.GuiSettings.TemperatureUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public f decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new f(uVar, uVar2, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        uVar2 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, f value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.c());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public f redact(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u c11 = value.c();
                kt.u redact = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                return value.a(redact, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
            f39200c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), com.squareup.wire.o.PROTO_3);
        }

        public f() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ f(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final f a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new f(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39202b;
        }

        public final kt.u c() {
            return this.f39201a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), fVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39201a, fVar.f39201a) && kotlin.jvm.internal.s.c(this.f39202b, fVar.f39202b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39201a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39202b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m790newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39201a;
            if (uVar != null) {
                arrayList.add("TemperatureF=" + uVar);
            }
            kt.u uVar2 = this.f39202b;
            if (uVar2 != null) {
                arrayList.add("TemperatureC=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "TemperatureUnit{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m790newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39200c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39201a = uVar;
            this.f39202b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of TemperatureF, TemperatureC may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum g implements com.squareup.wire.p {
        TirePressureUnitPsi(0),
        TirePressureUnitBar(1);
        
        public static final ProtoAdapter<g> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<g> {
            a(n00.d<g> dVar, com.squareup.wire.o oVar, g gVar) {
                super(dVar, oVar, gVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g d(int i11) {
                return g.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        return null;
                    }
                    return g.TirePressureUnitBar;
                }
                return g.TirePressureUnitPsi;
            }
        }

        static {
            g gVar;
            ADAPTER = new a(m0.b(g.class), com.squareup.wire.o.PROTO_3, gVar);
        }

        g(int i11) {
            this.value = i11;
        }

        public static final g fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new c(null);
        f39177l = new b(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(n.class), com.squareup.wire.o.PROTO_3);
    }

    public n() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ n(boolean z11, boolean z12, g gVar, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) == 0 ? z12 : false, (i11 & 4) != 0 ? g.TirePressureUnitPsi : gVar, (i11 & 8) != 0 ? null : eVar, (i11 & 16) != 0 ? null : fVar, (i11 & 32) != 0 ? null : aVar, (i11 & 64) != 0 ? null : dVar, (i11 & 128) != 0 ? null : instant, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2, (i11 & 1024) == 0 ? gVar2 : null, (i11 & 2048) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ n b(n nVar, boolean z11, boolean z12, g gVar, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar2, okio.i iVar, int i11, Object obj) {
        return nVar.a((i11 & 1) != 0 ? nVar.f39178a : z11, (i11 & 2) != 0 ? nVar.f39179b : z12, (i11 & 4) != 0 ? nVar.f39180c : gVar, (i11 & 8) != 0 ? nVar.f39181d : eVar, (i11 & 16) != 0 ? nVar.f39182e : fVar, (i11 & 32) != 0 ? nVar.f39183f : aVar, (i11 & 64) != 0 ? nVar.f39184g : dVar, (i11 & 128) != 0 ? nVar.f39185h : instant, (i11 & 256) != 0 ? nVar.f39186i : bool, (i11 & 512) != 0 ? nVar.f39187j : bool2, (i11 & 1024) != 0 ? nVar.f39188k : gVar2, (i11 & 2048) != 0 ? nVar.unknownFields() : iVar);
    }

    public final n a(boolean z11, boolean z12, g gui_tirepressure_units_OBSOLETE, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(gui_tirepressure_units_OBSOLETE, "gui_tirepressure_units_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n(z11, z12, gui_tirepressure_units_OBSOLETE, eVar, fVar, aVar, dVar, instant, bool, bool2, gVar, unknownFields);
    }

    public final Boolean c() {
        return this.f39186i;
    }

    public final boolean d() {
        return this.f39178a;
    }

    public final a e() {
        return this.f39183f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), nVar.unknownFields()) && this.f39178a == nVar.f39178a && this.f39179b == nVar.f39179b && this.f39180c == nVar.f39180c && kotlin.jvm.internal.s.c(this.f39181d, nVar.f39181d) && kotlin.jvm.internal.s.c(this.f39182e, nVar.f39182e) && kotlin.jvm.internal.s.c(this.f39183f, nVar.f39183f) && kotlin.jvm.internal.s.c(this.f39184g, nVar.f39184g) && kotlin.jvm.internal.s.c(this.f39185h, nVar.f39185h) && kotlin.jvm.internal.s.c(this.f39186i, nVar.f39186i) && kotlin.jvm.internal.s.c(this.f39187j, nVar.f39187j) && this.f39188k == nVar.f39188k;
        }
        return false;
    }

    public final e f() {
        return this.f39181d;
    }

    public final d g() {
        return this.f39184g;
    }

    public final f h() {
        return this.f39182e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39178a)) * 37) + Boolean.hashCode(this.f39179b)) * 37) + this.f39180c.hashCode()) * 37;
            e eVar = this.f39181d;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
            f fVar = this.f39182e;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            a aVar = this.f39183f;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 37;
            d dVar = this.f39184g;
            int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            Instant instant = this.f39185h;
            int hashCode6 = (hashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
            Boolean bool = this.f39186i;
            int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39187j;
            int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            g gVar = this.f39188k;
            int hashCode9 = hashCode8 + (gVar != null ? gVar.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final g i() {
        return this.f39188k;
    }

    public final g j() {
        return this.f39180c;
    }

    public final Boolean k() {
        return this.f39187j;
    }

    public final boolean l() {
        return this.f39179b;
    }

    public final Instant m() {
        return this.f39185h;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m786newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f39178a;
        arrayList.add("gui_24_hour_time_OBSOLETE=" + z11);
        boolean z12 = this.f39179b;
        arrayList.add("show_range_units_OBSOLETE=" + z12);
        g gVar = this.f39180c;
        arrayList.add("gui_tirepressure_units_OBSOLETE=" + gVar);
        e eVar = this.f39181d;
        if (eVar != null) {
            arrayList.add("gui_distance_units=" + eVar);
        }
        f fVar = this.f39182e;
        if (fVar != null) {
            arrayList.add("gui_temperature_units=" + fVar);
        }
        a aVar = this.f39183f;
        if (aVar != null) {
            arrayList.add("gui_charge_rate_units=" + aVar);
        }
        d dVar = this.f39184g;
        if (dVar != null) {
            arrayList.add("gui_range_display=" + dVar);
        }
        Instant instant = this.f39185h;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.f39186i;
        if (bool != null) {
            arrayList.add("gui_24_hour_time=" + bool);
        }
        Boolean bool2 = this.f39187j;
        if (bool2 != null) {
            arrayList.add("show_range_units=" + bool2);
        }
        g gVar2 = this.f39188k;
        if (gVar2 != null) {
            arrayList.add("gui_tirepressure_units=" + gVar2);
        }
        l02 = e0.l0(arrayList, ", ", "GuiSettings{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m786newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, boolean z12, g gui_tirepressure_units_OBSOLETE, e eVar, f fVar, a aVar, d dVar, Instant instant, Boolean bool, Boolean bool2, g gVar, okio.i unknownFields) {
        super(f39177l, unknownFields);
        kotlin.jvm.internal.s.g(gui_tirepressure_units_OBSOLETE, "gui_tirepressure_units_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39178a = z11;
        this.f39179b = z12;
        this.f39180c = gui_tirepressure_units_OBSOLETE;
        this.f39181d = eVar;
        this.f39182e = fVar;
        this.f39183f = aVar;
        this.f39184g = dVar;
        this.f39185h = instant;
        this.f39186i = bool;
        this.f39187j = bool2;
        this.f39188k = gVar;
    }
}