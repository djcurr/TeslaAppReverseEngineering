package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class n extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<n> f35816d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35817a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35818b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35819c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<n> {
        a(com.squareup.wire.b bVar, n00.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SeatType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n(uVar, uVar2, uVar3, reader.e(d11));
                } else if (g11 == 1) {
                    uVar = u.f35845a.decode(reader);
                } else if (g11 == 2) {
                    uVar2 = u.f35845a.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    uVar3 = u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.b());
            protoAdapter.encodeWithTag(writer, 2, value.c());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n redact(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            u b11 = value.b();
            u redact = b11 == null ? null : u.f35845a.redact(b11);
            u c11 = value.c();
            u redact2 = c11 == null ? null : u.f35845a.redact(c11);
            u d11 = value.d();
            return value.a(redact, redact2, d11 != null ? u.f35845a.redact(d11) : null, okio.i.f42656d);
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
        f35816d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(n.class), com.squareup.wire.o.PROTO_3);
    }

    public n() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ n(u uVar, u uVar2, u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public final n a(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n(uVar, uVar2, uVar3, unknownFields);
    }

    public final u b() {
        return this.f35817a;
    }

    public final u c() {
        return this.f35818b;
    }

    public final u d() {
        return this.f35819c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), nVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35817a, nVar.f35817a) && kotlin.jvm.internal.s.c(this.f35818b, nVar.f35818b) && kotlin.jvm.internal.s.c(this.f35819c, nVar.f35819c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35817a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35818b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35819c;
            int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m642newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35817a;
        if (uVar != null) {
            arrayList.add("Base=" + uVar);
        }
        u uVar2 = this.f35818b;
        if (uVar2 != null) {
            arrayList.add("Recaro=" + uVar2);
        }
        u uVar3 = this.f35819c;
        if (uVar3 != null) {
            arrayList.add("TeslaMSGen1=" + uVar3);
        }
        l02 = e0.l0(arrayList, ", ", "SeatType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m642newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        super(f35816d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35817a = uVar;
        this.f35818b = uVar2;
        this.f35819c = uVar3;
        if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
            throw new IllegalArgumentException("At most one of Base, Recaro, TeslaMSGen1 may be non-null".toString());
        }
    }
}