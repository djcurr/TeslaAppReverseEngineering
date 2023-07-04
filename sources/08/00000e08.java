package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class s0 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<s0> f8200c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Genealogy#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final q0 f8201a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GenealogyStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final t0 f8202b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s0> {
        a(com.squareup.wire.b bVar, n00.d<s0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.GenealogyResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            t0 t0Var = t0.GENEALOGY_STATUS_NONE;
            long d11 = reader.d();
            q0 q0Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s0(q0Var, t0Var, reader.e(d11));
                } else if (g11 == 1) {
                    q0Var = q0.f8181c.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        t0Var = t0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                q0.f8181c.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != t0.GENEALOGY_STATUS_NONE) {
                t0.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += q0.f8181c.encodedSizeWithTag(1, value.c());
            }
            return value.d() != t0.GENEALOGY_STATUS_NONE ? z11 + t0.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s0 redact(s0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            q0 c11 = value.c();
            return s0.b(value, c11 == null ? null : q0.f8181c.redact(c11), null, okio.i.f42656d, 2, null);
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
        f8200c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s0.class), com.squareup.wire.o.PROTO_3);
    }

    public s0() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ s0(q0 q0Var, t0 t0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : q0Var, (i11 & 2) != 0 ? t0.GENEALOGY_STATUS_NONE : t0Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s0 b(s0 s0Var, q0 q0Var, t0 t0Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            q0Var = s0Var.f8201a;
        }
        if ((i11 & 2) != 0) {
            t0Var = s0Var.f8202b;
        }
        if ((i11 & 4) != 0) {
            iVar = s0Var.unknownFields();
        }
        return s0Var.a(q0Var, t0Var, iVar);
    }

    public final s0 a(q0 q0Var, t0 status, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(status, "status");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s0(q0Var, status, unknownFields);
    }

    public final q0 c() {
        return this.f8201a;
    }

    public final t0 d() {
        return this.f8202b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), s0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8201a, s0Var.f8201a) && this.f8202b == s0Var.f8202b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            q0 q0Var = this.f8201a;
            int hashCode2 = ((hashCode + (q0Var != null ? q0Var.hashCode() : 0)) * 37) + this.f8202b.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m71newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        q0 q0Var = this.f8201a;
        if (q0Var != null) {
            arrayList.add("currentGenealogy=" + q0Var);
        }
        t0 t0Var = this.f8202b;
        arrayList.add("status=" + t0Var);
        l02 = wz.e0.l0(arrayList, ", ", "GenealogyResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m71newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q0 q0Var, t0 status, okio.i unknownFields) {
        super(f8200c, unknownFields);
        kotlin.jvm.internal.s.g(status, "status");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8201a = q0Var;
        this.f8202b = status;
    }
}