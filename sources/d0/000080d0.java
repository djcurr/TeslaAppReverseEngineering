package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class o extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<o> f35820g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", declaredName = "Invalid", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35821a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35822b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35823c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35824d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final u f35825e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final u f35826f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o> {
        a(com.squareup.wire.b bVar, n00.d<o> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ShiftState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            u uVar5 = null;
            u uVar6 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, reader.e(d11));
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
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.b());
            protoAdapter.encodeWithTag(writer, 2, value.e());
            protoAdapter.encodeWithTag(writer, 3, value.f());
            protoAdapter.encodeWithTag(writer, 4, value.d());
            protoAdapter.encodeWithTag(writer, 5, value.c());
            protoAdapter.encodeWithTag(writer, 6, value.g());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.e()) + protoAdapter.encodedSizeWithTag(3, value.f()) + protoAdapter.encodedSizeWithTag(4, value.d()) + protoAdapter.encodedSizeWithTag(5, value.c()) + protoAdapter.encodedSizeWithTag(6, value.g());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o redact(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            u b11 = value.b();
            u redact = b11 == null ? null : u.f35845a.redact(b11);
            u e11 = value.e();
            u redact2 = e11 == null ? null : u.f35845a.redact(e11);
            u f11 = value.f();
            u redact3 = f11 == null ? null : u.f35845a.redact(f11);
            u d11 = value.d();
            u redact4 = d11 == null ? null : u.f35845a.redact(d11);
            u c11 = value.c();
            u redact5 = c11 == null ? null : u.f35845a.redact(c11);
            u g11 = value.g();
            return value.a(redact, redact2, redact3, redact4, redact5, g11 != null ? u.f35845a.redact(g11) : null, okio.i.f42656d);
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
        f35820g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(o.class), com.squareup.wire.o.PROTO_3);
    }

    public o() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ o(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) == 0 ? uVar6 : null, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public final o a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, unknownFields);
    }

    public final u b() {
        return this.f35821a;
    }

    public final u c() {
        return this.f35825e;
    }

    public final u d() {
        return this.f35824d;
    }

    public final u e() {
        return this.f35822b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), oVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35821a, oVar.f35821a) && kotlin.jvm.internal.s.c(this.f35822b, oVar.f35822b) && kotlin.jvm.internal.s.c(this.f35823c, oVar.f35823c) && kotlin.jvm.internal.s.c(this.f35824d, oVar.f35824d) && kotlin.jvm.internal.s.c(this.f35825e, oVar.f35825e) && kotlin.jvm.internal.s.c(this.f35826f, oVar.f35826f);
        }
        return false;
    }

    public final u f() {
        return this.f35823c;
    }

    public final u g() {
        return this.f35826f;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35821a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35822b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35823c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35824d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35825e;
            int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
            u uVar6 = this.f35826f;
            int hashCode7 = hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m643newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35821a;
        if (uVar != null) {
            arrayList.add("CarServer_Invalid=" + uVar);
        }
        u uVar2 = this.f35822b;
        if (uVar2 != null) {
            arrayList.add("P=" + uVar2);
        }
        u uVar3 = this.f35823c;
        if (uVar3 != null) {
            arrayList.add("R=" + uVar3);
        }
        u uVar4 = this.f35824d;
        if (uVar4 != null) {
            arrayList.add("N=" + uVar4);
        }
        u uVar5 = this.f35825e;
        if (uVar5 != null) {
            arrayList.add("D=" + uVar5);
        }
        u uVar6 = this.f35826f;
        if (uVar6 != null) {
            arrayList.add("SNA=" + uVar6);
        }
        l02 = e0.l0(arrayList, ", ", "ShiftState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m643newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, okio.i unknownFields) {
        super(f35820g, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35821a = uVar;
        this.f35822b = uVar2;
        this.f35823c = uVar3;
        this.f35824d = uVar4;
        this.f35825e = uVar5;
        this.f35826f = uVar6;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6) <= 1)) {
            throw new IllegalArgumentException("At most one of CarServer_Invalid, P, R, N, D, SNA may be non-null".toString());
        }
    }
}