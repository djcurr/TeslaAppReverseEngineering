package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class m extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<m> f35811e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35812a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35813b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35814c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35815d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m> {
        a(com.squareup.wire.b bVar, n00.d<m> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RoofColor", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m(uVar, uVar2, uVar3, uVar4, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, m value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.e());
            protoAdapter.encodeWithTag(writer, 2, value.d());
            protoAdapter.encodeWithTag(writer, 3, value.b());
            protoAdapter.encodeWithTag(writer, 4, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b()) + protoAdapter.encodedSizeWithTag(4, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m redact(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            u e11 = value.e();
            u redact = e11 == null ? null : u.f35845a.redact(e11);
            u d11 = value.d();
            u redact2 = d11 == null ? null : u.f35845a.redact(d11);
            u b11 = value.b();
            u redact3 = b11 == null ? null : u.f35845a.redact(b11);
            u c11 = value.c();
            return value.a(redact, redact2, redact3, c11 != null ? u.f35845a.redact(c11) : null, okio.i.f42656d);
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
        f35811e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(m.class), com.squareup.wire.o.PROTO_3);
    }

    public m() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ m(u uVar, u uVar2, u uVar3, u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public final m a(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m(uVar, uVar2, uVar3, uVar4, unknownFields);
    }

    public final u b() {
        return this.f35814c;
    }

    public final u c() {
        return this.f35815d;
    }

    public final u d() {
        return this.f35813b;
    }

    public final u e() {
        return this.f35812a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), mVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35812a, mVar.f35812a) && kotlin.jvm.internal.s.c(this.f35813b, mVar.f35813b) && kotlin.jvm.internal.s.c(this.f35814c, mVar.f35814c) && kotlin.jvm.internal.s.c(this.f35815d, mVar.f35815d);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35812a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35813b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35814c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35815d;
            int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m641newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35812a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35813b;
        if (uVar2 != null) {
            arrayList.add("Glass=" + uVar2);
        }
        u uVar3 = this.f35814c;
        if (uVar3 != null) {
            arrayList.add("Black=" + uVar3);
        }
        u uVar4 = this.f35815d;
        if (uVar4 != null) {
            arrayList.add("Colored=" + uVar4);
        }
        l02 = e0.l0(arrayList, ", ", "RoofColor{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m641newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        super(f35811e, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35812a = uVar;
        this.f35813b = uVar2;
        this.f35814c = uVar3;
        this.f35815d = uVar4;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
            throw new IllegalArgumentException("At most one of None, Glass, Black, Colored may be non-null".toString());
        }
    }
}