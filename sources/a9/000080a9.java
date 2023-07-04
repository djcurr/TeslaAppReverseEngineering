package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class b extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<b> f35728e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35729a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35730b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35731c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35732d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargePortLatchState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b(uVar, uVar2, uVar3, uVar4, reader.e(d11));
                } else if (g11 == 1) {
                    uVar = u.f35845a.decode(reader);
                } else if (g11 == 2) {
                    uVar2 = u.f35845a.decode(reader);
                } else if (g11 == 3) {
                    uVar3 = u.f35845a.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    uVar4 = u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.e());
            protoAdapter.encodeWithTag(writer, 2, value.c());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            protoAdapter.encodeWithTag(writer, 4, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b redact(b value) {
            kotlin.jvm.internal.s.g(value, "value");
            u e11 = value.e();
            u redact = e11 == null ? null : u.f35845a.redact(e11);
            u c11 = value.c();
            u redact2 = c11 == null ? null : u.f35845a.redact(c11);
            u d11 = value.d();
            u redact3 = d11 == null ? null : u.f35845a.redact(d11);
            u b11 = value.b();
            return value.a(redact, redact2, redact3, b11 != null ? u.f35845a.redact(b11) : null, okio.i.f42656d);
        }
    }

    /* renamed from: kt.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0682b {
        private C0682b() {
        }

        public /* synthetic */ C0682b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0682b(null);
        f35728e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), com.squareup.wire.o.PROTO_3);
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ b(u uVar, u uVar2, u uVar3, u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public final b a(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b(uVar, uVar2, uVar3, uVar4, unknownFields);
    }

    public final u b() {
        return this.f35732d;
    }

    public final u c() {
        return this.f35730b;
    }

    public final u d() {
        return this.f35731c;
    }

    public final u e() {
        return this.f35729a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35729a, bVar.f35729a) && kotlin.jvm.internal.s.c(this.f35730b, bVar.f35730b) && kotlin.jvm.internal.s.c(this.f35731c, bVar.f35731c) && kotlin.jvm.internal.s.c(this.f35732d, bVar.f35732d);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35729a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35730b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35731c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35732d;
            int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m631newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35729a;
        if (uVar != null) {
            arrayList.add("SNA=" + uVar);
        }
        u uVar2 = this.f35730b;
        if (uVar2 != null) {
            arrayList.add("Disengaged=" + uVar2);
        }
        u uVar3 = this.f35731c;
        if (uVar3 != null) {
            arrayList.add("Engaged=" + uVar3);
        }
        u uVar4 = this.f35732d;
        if (uVar4 != null) {
            arrayList.add("Blocking=" + uVar4);
        }
        l02 = e0.l0(arrayList, ", ", "ChargePortLatchState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m631newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        super(f35728e, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35729a = uVar;
        this.f35730b = uVar2;
        this.f35731c = uVar3;
        this.f35732d = uVar4;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
            throw new IllegalArgumentException("At most one of SNA, Disengaged, Engaged, Blocking may be non-null".toString());
        }
    }
}