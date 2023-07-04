package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class s extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<s> f35835e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35836a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35837b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u f35838c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final u f35839d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s> {
        a(com.squareup.wire.b bVar, n00.d<s> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ThirdRowSeatType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            u uVar3 = null;
            u uVar4 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s(uVar, uVar2, uVar3, uVar4, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, s value) {
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
        public int encodedSize(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s redact(s value) {
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
        f35835e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(s.class), com.squareup.wire.o.PROTO_3);
    }

    public s() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ s(u uVar, u uVar2, u uVar3, u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public final s a(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s(uVar, uVar2, uVar3, uVar4, unknownFields);
    }

    public final u b() {
        return this.f35839d;
    }

    public final u c() {
        return this.f35837b;
    }

    public final u d() {
        return this.f35838c;
    }

    public final u e() {
        return this.f35836a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), sVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35836a, sVar.f35836a) && kotlin.jvm.internal.s.c(this.f35837b, sVar.f35837b) && kotlin.jvm.internal.s.c(this.f35838c, sVar.f35838c) && kotlin.jvm.internal.s.c(this.f35839d, sVar.f35839d);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35836a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35837b;
            int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
            u uVar3 = this.f35838c;
            int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
            u uVar4 = this.f35839d;
            int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m646newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35836a;
        if (uVar != null) {
            arrayList.add("None=" + uVar);
        }
        u uVar2 = this.f35837b;
        if (uVar2 != null) {
            arrayList.add("FuturisFoldFlat=" + uVar2);
        }
        u uVar3 = this.f35838c;
        if (uVar3 != null) {
            arrayList.add("FuturisNoFoldFlat=" + uVar3);
        }
        u uVar4 = this.f35839d;
        if (uVar4 != null) {
            arrayList.add("FlatFold=" + uVar4);
        }
        l02 = e0.l0(arrayList, ", ", "ThirdRowSeatType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m646newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, u uVar2, u uVar3, u uVar4, okio.i unknownFields) {
        super(f35835e, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35836a = uVar;
        this.f35837b = uVar2;
        this.f35838c = uVar3;
        this.f35839d = uVar4;
        if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
            throw new IllegalArgumentException("At most one of None, FuturisFoldFlat, FuturisNoFoldFlat, FlatFold may be non-null".toString());
        }
    }
}