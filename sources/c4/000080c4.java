package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class k extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<k> f35794f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35795a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35796b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final u f35797c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: d  reason: collision with root package name */
    private final u f35798d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final u f35799e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, n00.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearSeatHeaters", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public k decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            u uVar5 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new k(uVar, uVar2, uVar3, uVar4, uVar5, reader.e(d11));
                } else if (g11 == 1) {
                    uVar = u.f35845a.decode(reader);
                } else if (g11 == 2) {
                    uVar2 = u.f35845a.decode(reader);
                } else if (g11 == 3) {
                    uVar4 = u.f35845a.decode(reader);
                } else if (g11 == 4) {
                    uVar3 = u.f35845a.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    uVar5 = u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, k value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.f());
            protoAdapter.encodeWithTag(writer, 2, value.b());
            protoAdapter.encodeWithTag(writer, 4, value.e());
            protoAdapter.encodeWithTag(writer, 3, value.d());
            protoAdapter.encodeWithTag(writer, 5, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(k value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(4, value.e()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(5, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public k redact(k value) {
            kotlin.jvm.internal.s.g(value, "value");
            u f11 = value.f();
            u redact = f11 == null ? null : u.f35845a.redact(f11);
            u b11 = value.b();
            u redact2 = b11 == null ? null : u.f35845a.redact(b11);
            u e11 = value.e();
            u redact3 = e11 == null ? null : u.f35845a.redact(e11);
            u d11 = value.d();
            u redact4 = d11 == null ? null : u.f35845a.redact(d11);
            u c11 = value.c();
            return value.a(redact, redact2, redact3, redact4, c11 != null ? u.f35845a.redact(c11) : null, okio.i.f42656d);
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
        f35794f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(k.class), com.squareup.wire.o.PROTO_3);
    }

    public k() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ k(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) == 0 ? uVar5 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
    }

    public final k a(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new k(uVar, uVar2, uVar3, uVar4, uVar5, unknownFields);
    }

    public final u b() {
        return this.f35796b;
    }

    public final u c() {
        return this.f35799e;
    }

    public final u d() {
        return this.f35798d;
    }

    public final u e() {
        return this.f35797c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), kVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35795a, kVar.f35795a) && kotlin.jvm.internal.s.c(this.f35796b, kVar.f35796b) && kotlin.jvm.internal.s.c(this.f35797c, kVar.f35797c) && kotlin.jvm.internal.s.c(this.f35798d, kVar.f35798d) && kotlin.jvm.internal.s.c(this.f35799e, kVar.f35799e);
        }
        return false;
    }

    public final u f() {
        return this.f35795a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35795a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35796b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35797c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35798d;
            int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
            u uVar5 = this.f35799e;
            int hashCode6 = hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m639newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35795a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35796b;
        if (uVar2 != null) {
            arrayList.add("Base=" + uVar2);
        }
        u uVar3 = this.f35797c;
        if (uVar3 != null) {
            arrayList.add("Gentherm=" + uVar3);
        }
        u uVar4 = this.f35798d;
        if (uVar4 != null) {
            arrayList.add("Executive=" + uVar4);
        }
        u uVar5 = this.f35799e;
        if (uVar5 != null) {
            arrayList.add("BaseModelX=" + uVar5);
        }
        l02 = e0.l0(arrayList, ", ", "RearSeatHeaters{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m639newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, okio.i unknownFields) {
        super(f35794f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35795a = uVar;
        this.f35796b = uVar2;
        this.f35797c = uVar3;
        this.f35798d = uVar4;
        this.f35799e = uVar5;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1)) {
            throw new IllegalArgumentException("At most one of None, Base, Gentherm, Executive, BaseModelX may be non-null".toString());
        }
    }
}