package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class n1 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<n1> f8107d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8108a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MIConfigurationData#ADAPTER", declaredName = "MIConfigurationData", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final k1 f8109b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.MIError_E#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final l1 f8110c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<n1> {
        a(com.squareup.wire.b bVar, n00.d<n1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.MISessionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            k1 k1Var = null;
            int i11 = 0;
            l1 l1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n1(i11, k1Var, l1Var, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    k1Var = k1.f8077b.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        l1Var = l1.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.d()));
            }
            k1.f8077b.encodeWithTag(writer, 2, value.e());
            l1.ADAPTER.encodeWithTag(writer, 3, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.d()));
            }
            return z11 + k1.f8077b.encodedSizeWithTag(2, value.e()) + l1.ADAPTER.encodedSizeWithTag(3, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n1 redact(n1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            k1 e11 = value.e();
            return n1.b(value, 0, e11 == null ? null : k1.f8077b.redact(e11), null, okio.i.f42656d, 5, null);
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
        f8107d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(n1.class), com.squareup.wire.o.PROTO_3);
    }

    public n1() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ n1(int i11, k1 k1Var, l1 l1Var, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : k1Var, (i12 & 4) != 0 ? null : l1Var, (i12 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ n1 b(n1 n1Var, int i11, k1 k1Var, l1 l1Var, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = n1Var.f8108a;
        }
        if ((i12 & 2) != 0) {
            k1Var = n1Var.f8109b;
        }
        if ((i12 & 4) != 0) {
            l1Var = n1Var.f8110c;
        }
        if ((i12 & 8) != 0) {
            iVar = n1Var.unknownFields();
        }
        return n1Var.a(i11, k1Var, l1Var, iVar);
    }

    public final n1 a(int i11, k1 k1Var, l1 l1Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n1(i11, k1Var, l1Var, unknownFields);
    }

    public final l1 c() {
        return this.f8110c;
    }

    public final int d() {
        return this.f8108a;
    }

    public final k1 e() {
        return this.f8109b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), n1Var.unknownFields()) && this.f8108a == n1Var.f8108a && kotlin.jvm.internal.s.c(this.f8109b, n1Var.f8109b) && this.f8110c == n1Var.f8110c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8108a)) * 37;
            k1 k1Var = this.f8109b;
            int hashCode2 = (hashCode + (k1Var != null ? k1Var.hashCode() : 0)) * 37;
            l1 l1Var = this.f8110c;
            int hashCode3 = hashCode2 + (l1Var != null ? l1Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m55newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8108a;
        arrayList.add("sessionId=" + i11);
        k1 k1Var = this.f8109b;
        if (k1Var != null) {
            arrayList.add("VCSEC_MIConfigurationData=" + k1Var);
        }
        l1 l1Var = this.f8110c;
        if (l1Var != null) {
            arrayList.add("errorCode=" + l1Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "MISessionResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m55newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int i11, k1 k1Var, l1 l1Var, okio.i unknownFields) {
        super(f8107d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8108a = i11;
        this.f8109b = k1Var;
        this.f8110c = l1Var;
        if (!(mr.d.c(k1Var, l1Var) <= 1)) {
            throw new IllegalArgumentException("At most one of VCSEC_MIConfigurationData, errorCode may be non-null".toString());
        }
    }
}