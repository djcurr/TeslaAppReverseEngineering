package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class r extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<r> f35831d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35832a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35833b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35834c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, n00.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SunRoofType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public r decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new r(uVar, uVar2, uVar3, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, r value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.d());
            protoAdapter.encodeWithTag(writer, 2, value.b());
            protoAdapter.encodeWithTag(writer, 3, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public r redact(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            u d11 = value.d();
            u redact = d11 == null ? null : u.f35845a.redact(d11);
            u b11 = value.b();
            u redact2 = b11 == null ? null : u.f35845a.redact(b11);
            u c11 = value.c();
            return value.a(redact, redact2, c11 != null ? u.f35845a.redact(c11) : null, okio.i.f42656d);
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
        f35831d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(r.class), com.squareup.wire.o.PROTO_3);
    }

    public r() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ r(u uVar, u uVar2, u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public final r a(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new r(uVar, uVar2, uVar3, unknownFields);
    }

    public final u b() {
        return this.f35833b;
    }

    public final u c() {
        return this.f35834c;
    }

    public final u d() {
        return this.f35832a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), rVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35832a, rVar.f35832a) && kotlin.jvm.internal.s.c(this.f35833b, rVar.f35833b) && kotlin.jvm.internal.s.c(this.f35834c, rVar.f35834c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35832a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35833b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35834c;
            int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m645newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35832a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35833b;
        if (uVar2 != null) {
            arrayList.add("Gen1=" + uVar2);
        }
        u uVar3 = this.f35834c;
        if (uVar3 != null) {
            arrayList.add("Gen2=" + uVar3);
        }
        l02 = e0.l0(arrayList, ", ", "SunRoofType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m645newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        super(f35831d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35832a = uVar;
        this.f35833b = uVar2;
        this.f35834c = uVar3;
        if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
            throw new IllegalArgumentException("At most one of None, Gen1, Gen2 may be non-null".toString());
        }
    }
}