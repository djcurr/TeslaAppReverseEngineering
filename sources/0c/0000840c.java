package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class l0 extends com.squareup.wire.f {

    /* renamed from: i  reason: collision with root package name */
    public static final ProtoAdapter<l0> f37508i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetGuiSettings#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final d0 f37509a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChargeState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final z f37510b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetClimateState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final a0 f37511c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetDriveState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final c0 f37512d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final m0 f37513e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleConfig#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final k0 f37514f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetLocationState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final e0 f37515g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetClosuresState#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final b0 f37516h;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l0> {
        a(com.squareup.wire.b bVar, n00.d<l0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetVehicleData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l0 mo28decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            d0 d0Var = null;
            z zVar = null;
            a0 a0Var = null;
            c0 c0Var = null;
            m0 m0Var = null;
            k0 k0Var = null;
            e0 e0Var = null;
            b0 b0Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l0(d0Var, zVar, a0Var, c0Var, m0Var, k0Var, e0Var, b0Var, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        d0Var = d0.f37363a.mo28decode(reader);
                        break;
                    case 2:
                        zVar = z.f37736a.mo28decode(reader);
                        break;
                    case 3:
                        a0Var = a0.f37337a.mo28decode(reader);
                        break;
                    case 4:
                        c0Var = c0.f37354a.mo28decode(reader);
                        break;
                    case 5:
                        m0Var = m0.f37524a.mo28decode(reader);
                        break;
                    case 6:
                        k0Var = k0.f37499a.mo28decode(reader);
                        break;
                    case 7:
                        e0Var = e0.f37376a.mo28decode(reader);
                        break;
                    case 8:
                        b0Var = b0.f37346a.mo28decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.f() != null) {
                d0.f37363a.encodeWithTag(writer, 1, value.f());
            }
            if (value.b() != null) {
                z.f37736a.encodeWithTag(writer, 2, value.b());
            }
            if (value.c() != null) {
                a0.f37337a.encodeWithTag(writer, 3, value.c());
            }
            if (value.e() != null) {
                c0.f37354a.encodeWithTag(writer, 4, value.e());
            }
            if (value.i() != null) {
                m0.f37524a.encodeWithTag(writer, 5, value.i());
            }
            if (value.h() != null) {
                k0.f37499a.encodeWithTag(writer, 6, value.h());
            }
            if (value.g() != null) {
                e0.f37376a.encodeWithTag(writer, 7, value.g());
            }
            if (value.d() != null) {
                b0.f37346a.encodeWithTag(writer, 8, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f() != null) {
                z11 += d0.f37363a.encodedSizeWithTag(1, value.f());
            }
            if (value.b() != null) {
                z11 += z.f37736a.encodedSizeWithTag(2, value.b());
            }
            if (value.c() != null) {
                z11 += a0.f37337a.encodedSizeWithTag(3, value.c());
            }
            if (value.e() != null) {
                z11 += c0.f37354a.encodedSizeWithTag(4, value.e());
            }
            if (value.i() != null) {
                z11 += m0.f37524a.encodedSizeWithTag(5, value.i());
            }
            if (value.h() != null) {
                z11 += k0.f37499a.encodedSizeWithTag(6, value.h());
            }
            if (value.g() != null) {
                z11 += e0.f37376a.encodedSizeWithTag(7, value.g());
            }
            return value.d() != null ? z11 + b0.f37346a.encodedSizeWithTag(8, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l0 redact(l0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            d0 f11 = value.f();
            d0 redact = f11 == null ? null : d0.f37363a.redact(f11);
            z b11 = value.b();
            z redact2 = b11 == null ? null : z.f37736a.redact(b11);
            a0 c11 = value.c();
            a0 redact3 = c11 == null ? null : a0.f37337a.redact(c11);
            c0 e11 = value.e();
            c0 redact4 = e11 == null ? null : c0.f37354a.redact(e11);
            m0 i11 = value.i();
            m0 redact5 = i11 == null ? null : m0.f37524a.redact(i11);
            k0 h11 = value.h();
            k0 redact6 = h11 == null ? null : k0.f37499a.redact(h11);
            e0 g11 = value.g();
            e0 redact7 = g11 == null ? null : e0.f37376a.redact(g11);
            b0 d11 = value.d();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, d11 != null ? b0.f37346a.redact(d11) : null, okio.i.f42656d);
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
        f37508i = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(l0.class), com.squareup.wire.o.PROTO_3);
    }

    public l0() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ l0(d0 d0Var, z zVar, a0 a0Var, c0 c0Var, m0 m0Var, k0 k0Var, e0 e0Var, b0 b0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d0Var, (i11 & 2) != 0 ? null : zVar, (i11 & 4) != 0 ? null : a0Var, (i11 & 8) != 0 ? null : c0Var, (i11 & 16) != 0 ? null : m0Var, (i11 & 32) != 0 ? null : k0Var, (i11 & 64) != 0 ? null : e0Var, (i11 & 128) == 0 ? b0Var : null, (i11 & 256) != 0 ? okio.i.f42656d : iVar);
    }

    public final l0 a(d0 d0Var, z zVar, a0 a0Var, c0 c0Var, m0 m0Var, k0 k0Var, e0 e0Var, b0 b0Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l0(d0Var, zVar, a0Var, c0Var, m0Var, k0Var, e0Var, b0Var, unknownFields);
    }

    public final z b() {
        return this.f37510b;
    }

    public final a0 c() {
        return this.f37511c;
    }

    public final b0 d() {
        return this.f37516h;
    }

    public final c0 e() {
        return this.f37512d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0) {
            l0 l0Var = (l0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), l0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37509a, l0Var.f37509a) && kotlin.jvm.internal.s.c(this.f37510b, l0Var.f37510b) && kotlin.jvm.internal.s.c(this.f37511c, l0Var.f37511c) && kotlin.jvm.internal.s.c(this.f37512d, l0Var.f37512d) && kotlin.jvm.internal.s.c(this.f37513e, l0Var.f37513e) && kotlin.jvm.internal.s.c(this.f37514f, l0Var.f37514f) && kotlin.jvm.internal.s.c(this.f37515g, l0Var.f37515g) && kotlin.jvm.internal.s.c(this.f37516h, l0Var.f37516h);
        }
        return false;
    }

    public final d0 f() {
        return this.f37509a;
    }

    public final e0 g() {
        return this.f37515g;
    }

    public final k0 h() {
        return this.f37514f;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            d0 d0Var = this.f37509a;
            int hashCode2 = (hashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
            z zVar = this.f37510b;
            int hashCode3 = (hashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 37;
            a0 a0Var = this.f37511c;
            int hashCode4 = (hashCode3 + (a0Var != null ? a0Var.hashCode() : 0)) * 37;
            c0 c0Var = this.f37512d;
            int hashCode5 = (hashCode4 + (c0Var != null ? c0Var.hashCode() : 0)) * 37;
            m0 m0Var = this.f37513e;
            int hashCode6 = (hashCode5 + (m0Var != null ? m0Var.hashCode() : 0)) * 37;
            k0 k0Var = this.f37514f;
            int hashCode7 = (hashCode6 + (k0Var != null ? k0Var.hashCode() : 0)) * 37;
            e0 e0Var = this.f37515g;
            int hashCode8 = (hashCode7 + (e0Var != null ? e0Var.hashCode() : 0)) * 37;
            b0 b0Var = this.f37516h;
            int hashCode9 = hashCode8 + (b0Var != null ? b0Var.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }
        return i11;
    }

    public final m0 i() {
        return this.f37513e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m701newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        d0 d0Var = this.f37509a;
        if (d0Var != null) {
            arrayList.add("getGuiSettings=" + d0Var);
        }
        z zVar = this.f37510b;
        if (zVar != null) {
            arrayList.add("getChargeState=" + zVar);
        }
        a0 a0Var = this.f37511c;
        if (a0Var != null) {
            arrayList.add("getClimateState=" + a0Var);
        }
        c0 c0Var = this.f37512d;
        if (c0Var != null) {
            arrayList.add("getDriveState=" + c0Var);
        }
        m0 m0Var = this.f37513e;
        if (m0Var != null) {
            arrayList.add("getVehicleState=" + m0Var);
        }
        k0 k0Var = this.f37514f;
        if (k0Var != null) {
            arrayList.add("getVehicleConfig=" + k0Var);
        }
        e0 e0Var = this.f37515g;
        if (e0Var != null) {
            arrayList.add("getLocationState=" + e0Var);
        }
        b0 b0Var = this.f37516h;
        if (b0Var != null) {
            arrayList.add("getClosuresState=" + b0Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "GetVehicleData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m701newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d0 d0Var, z zVar, a0 a0Var, c0 c0Var, m0 m0Var, k0 k0Var, e0 e0Var, b0 b0Var, okio.i unknownFields) {
        super(f37508i, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37509a = d0Var;
        this.f37510b = zVar;
        this.f37511c = a0Var;
        this.f37512d = c0Var;
        this.f37513e = m0Var;
        this.f37514f = k0Var;
        this.f37515g = e0Var;
        this.f37516h = b0Var;
    }
}