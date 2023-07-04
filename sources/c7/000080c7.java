package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class l extends com.squareup.wire.f {

    /* renamed from: k  reason: collision with root package name */
    public static final ProtoAdapter<l> f35800k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35801a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35802b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35803c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35804d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final u f35805e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final u f35806f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final u f35807g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final u f35808h;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final u f35809i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final u f35810j;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l> {
        a(com.squareup.wire.b bVar, n00.d<l> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearSeatType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l decode(com.squareup.wire.k reader) {
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
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, reader.e(d11));
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
                        uVar9 = u.f35845a.decode(reader);
                        break;
                    case 10:
                        uVar10 = u.f35845a.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.b());
            protoAdapter.encodeWithTag(writer, 2, value.i());
            protoAdapter.encodeWithTag(writer, 3, value.c());
            protoAdapter.encodeWithTag(writer, 4, value.j());
            protoAdapter.encodeWithTag(writer, 5, value.d());
            protoAdapter.encodeWithTag(writer, 6, value.f());
            protoAdapter.encodeWithTag(writer, 7, value.k());
            protoAdapter.encodeWithTag(writer, 8, value.g());
            protoAdapter.encodeWithTag(writer, 9, value.h());
            protoAdapter.encodeWithTag(writer, 10, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.i()) + protoAdapter.encodedSizeWithTag(3, value.c()) + protoAdapter.encodedSizeWithTag(4, value.j()) + protoAdapter.encodedSizeWithTag(5, value.d()) + protoAdapter.encodedSizeWithTag(6, value.f()) + protoAdapter.encodedSizeWithTag(7, value.k()) + protoAdapter.encodedSizeWithTag(8, value.g()) + protoAdapter.encodedSizeWithTag(9, value.h()) + protoAdapter.encodedSizeWithTag(10, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l redact(l value) {
            kotlin.jvm.internal.s.g(value, "value");
            u b11 = value.b();
            u redact = b11 == null ? null : u.f35845a.redact(b11);
            u i11 = value.i();
            u redact2 = i11 == null ? null : u.f35845a.redact(i11);
            u c11 = value.c();
            u redact3 = c11 == null ? null : u.f35845a.redact(c11);
            u j11 = value.j();
            u redact4 = j11 == null ? null : u.f35845a.redact(j11);
            u d11 = value.d();
            u redact5 = d11 == null ? null : u.f35845a.redact(d11);
            u f11 = value.f();
            u redact6 = f11 == null ? null : u.f35845a.redact(f11);
            u k11 = value.k();
            u redact7 = k11 == null ? null : u.f35845a.redact(k11);
            u g11 = value.g();
            u redact8 = g11 == null ? null : u.f35845a.redact(g11);
            u h11 = value.h();
            u redact9 = h11 == null ? null : u.f35845a.redact(h11);
            u e11 = value.e();
            return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, e11 != null ? u.f35845a.redact(e11) : null, okio.i.f42656d);
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
        f35800k = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(l.class), com.squareup.wire.o.PROTO_3);
    }

    public l() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ l(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) == 0 ? uVar10 : null, (i11 & 1024) != 0 ? okio.i.f42656d : iVar);
    }

    public final l a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, unknownFields);
    }

    public final u b() {
        return this.f35801a;
    }

    public final u c() {
        return this.f35803c;
    }

    public final u d() {
        return this.f35805e;
    }

    public final u e() {
        return this.f35810j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), lVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35801a, lVar.f35801a) && kotlin.jvm.internal.s.c(this.f35802b, lVar.f35802b) && kotlin.jvm.internal.s.c(this.f35803c, lVar.f35803c) && kotlin.jvm.internal.s.c(this.f35804d, lVar.f35804d) && kotlin.jvm.internal.s.c(this.f35805e, lVar.f35805e) && kotlin.jvm.internal.s.c(this.f35806f, lVar.f35806f) && kotlin.jvm.internal.s.c(this.f35807g, lVar.f35807g) && kotlin.jvm.internal.s.c(this.f35808h, lVar.f35808h) && kotlin.jvm.internal.s.c(this.f35809i, lVar.f35809i) && kotlin.jvm.internal.s.c(this.f35810j, lVar.f35810j);
        }
        return false;
    }

    public final u f() {
        return this.f35806f;
    }

    public final u g() {
        return this.f35808h;
    }

    public final u h() {
        return this.f35809i;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35801a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35802b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35803c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35804d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35805e;
            int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
            u uVar6 = this.f35806f;
            int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
            u uVar7 = this.f35807g;
            int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
            u uVar8 = this.f35808h;
            int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
            u uVar9 = this.f35809i;
            int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
            u uVar10 = this.f35810j;
            int hashCode11 = hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }
        return i11;
    }

    public final u i() {
        return this.f35802b;
    }

    public final u j() {
        return this.f35804d;
    }

    public final u k() {
        return this.f35807g;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m640newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35801a;
        if (uVar != null) {
            arrayList.add("Base=" + uVar);
        }
        u uVar2 = this.f35802b;
        if (uVar2 != null) {
            arrayList.add("Recaro=" + uVar2);
        }
        u uVar3 = this.f35803c;
        if (uVar3 != null) {
            arrayList.add("Executive=" + uVar3);
        }
        u uVar4 = this.f35804d;
        if (uVar4 != null) {
            arrayList.add("TwoSeat=" + uVar4);
        }
        u uVar5 = this.f35805e;
        if (uVar5 != null) {
            arrayList.add("FoldFlat=" + uVar5);
        }
        u uVar6 = this.f35806f;
        if (uVar6 != null) {
            arrayList.add("FoldFlatMotorized=" + uVar6);
        }
        u uVar7 = this.f35807g;
        if (uVar7 != null) {
            arrayList.add("TwoSeatConsole=" + uVar7);
        }
        u uVar8 = this.f35808h;
        if (uVar8 != null) {
            arrayList.add("FoldFlatTwoMotor=" + uVar8);
        }
        u uVar9 = this.f35809i;
        if (uVar9 != null) {
            arrayList.add("FoldFlatTwoMotorHall=" + uVar9);
        }
        u uVar10 = this.f35810j;
        if (uVar10 != null) {
            arrayList.add("FoldFlatHallBuckles=" + uVar10);
        }
        l02 = e0.l0(arrayList, ", ", "RearSeatType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m640newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10, okio.i unknownFields) {
        super(f35800k, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35801a = uVar;
        this.f35802b = uVar2;
        this.f35803c = uVar3;
        this.f35804d = uVar4;
        this.f35805e = uVar5;
        this.f35806f = uVar6;
        this.f35807g = uVar7;
        this.f35808h = uVar8;
        this.f35809i = uVar9;
        this.f35810j = uVar10;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10) <= 1)) {
            throw new IllegalArgumentException("At most one of Base, Recaro, Executive, TwoSeat, FoldFlat, FoldFlatMotorized, TwoSeatConsole, FoldFlatTwoMotor, FoldFlatTwoMotorHall, FoldFlatHallBuckles may be non-null".toString());
        }
    }
}