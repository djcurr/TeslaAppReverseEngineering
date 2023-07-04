package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class z2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<z2> f37740c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: a  reason: collision with root package name */
    private final n1 f37741a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final String f37742b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<z2> {
        a(com.squareup.wire.b bVar, n00.d<z2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleDataSubscriptionResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public z2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            n1 n1Var = null;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new z2(n1Var, str, reader.e(d11));
                } else if (g11 == 3) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    n1Var = n1.f37534d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, z2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != null) {
                n1.f37534d.encodeWithTag(writer, 4, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(z2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != null) {
                z11 += n1.f37534d.encodedSizeWithTag(4, value.d());
            }
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public z2 redact(z2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            n1 d11 = value.d();
            return z2.b(value, d11 == null ? null : n1.f37534d.redact(d11), null, okio.i.f42656d, 2, null);
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
        f37740c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(z2.class), com.squareup.wire.o.PROTO_3);
    }

    public z2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ z2(n1 n1Var, String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : n1Var, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ z2 b(z2 z2Var, n1 n1Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            n1Var = z2Var.f37741a;
        }
        if ((i11 & 2) != 0) {
            str = z2Var.f37742b;
        }
        if ((i11 & 4) != 0) {
            iVar = z2Var.unknownFields();
        }
        return z2Var.a(n1Var, str, iVar);
    }

    public final z2 a(n1 n1Var, String error, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(error, "error");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new z2(n1Var, error, unknownFields);
    }

    public final String c() {
        return this.f37742b;
    }

    public final n1 d() {
        return this.f37741a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), z2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37741a, z2Var.f37741a) && kotlin.jvm.internal.s.c(this.f37742b, z2Var.f37742b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            n1 n1Var = this.f37741a;
            int hashCode2 = ((hashCode + (n1Var != null ? n1Var.hashCode() : 0)) * 37) + this.f37742b.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m761newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        n1 n1Var = this.f37741a;
        if (n1Var != null) {
            arrayList.add("piiKeyResponse=" + n1Var);
        }
        String i11 = mr.d.i(this.f37742b);
        arrayList.add("error=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleDataSubscriptionResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m761newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(n1 n1Var, String error, okio.i unknownFields) {
        super(f37740c, unknownFields);
        kotlin.jvm.internal.s.g(error, "error");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37741a = n1Var;
        this.f37742b = error;
    }
}