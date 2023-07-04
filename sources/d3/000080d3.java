package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class p extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<p> f35827d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35828a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35829b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35830c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, n00.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SpoilerType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p(uVar, uVar2, uVar3, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, p value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.c());
            protoAdapter.encodeWithTag(writer, 2, value.d());
            protoAdapter.encodeWithTag(writer, 3, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p redact(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            u c11 = value.c();
            u redact = c11 == null ? null : u.f35845a.redact(c11);
            u d11 = value.d();
            u redact2 = d11 == null ? null : u.f35845a.redact(d11);
            u b11 = value.b();
            return value.a(redact, redact2, b11 != null ? u.f35845a.redact(b11) : null, okio.i.f42656d);
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
        f35827d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(p.class), com.squareup.wire.o.PROTO_3);
    }

    public p() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ p(u uVar, u uVar2, u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public final p a(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p(uVar, uVar2, uVar3, unknownFields);
    }

    public final u b() {
        return this.f35830c;
    }

    public final u c() {
        return this.f35828a;
    }

    public final u d() {
        return this.f35829b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), pVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35828a, pVar.f35828a) && kotlin.jvm.internal.s.c(this.f35829b, pVar.f35829b) && kotlin.jvm.internal.s.c(this.f35830c, pVar.f35830c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35828a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35829b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35830c;
            int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m644newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35828a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35829b;
        if (uVar2 != null) {
            arrayList.add("Passive=" + uVar2);
        }
        u uVar3 = this.f35830c;
        if (uVar3 != null) {
            arrayList.add("Active=" + uVar3);
        }
        l02 = e0.l0(arrayList, ", ", "SpoilerType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m644newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, u uVar2, u uVar3, okio.i unknownFields) {
        super(f35827d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35828a = uVar;
        this.f35829b = uVar2;
        this.f35830c = uVar3;
        if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
            throw new IllegalArgumentException("At most one of None, Passive, Active may be non-null".toString());
        }
    }
}