package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class j3 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<j3> f8072c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SignedMessage#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final o2 f8073a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnsignedMessage#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final n3 f8074b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j3> {
        a(com.squareup.wire.b bVar, n00.d<j3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ToVCSECMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            o2 o2Var = null;
            n3 n3Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j3(o2Var, n3Var, reader.e(d11));
                } else if (g11 == 1) {
                    o2Var = o2.f8141g.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    n3Var = n3.Y.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            o2.f8141g.encodeWithTag(writer, 1, value.b());
            n3.Y.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + o2.f8141g.encodedSizeWithTag(1, value.b()) + n3.Y.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j3 redact(j3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            o2 b11 = value.b();
            o2 redact = b11 == null ? null : o2.f8141g.redact(b11);
            n3 c11 = value.c();
            return value.a(redact, c11 != null ? n3.Y.redact(c11) : null, okio.i.f42656d);
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
        f8072c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(j3.class), com.squareup.wire.o.PROTO_3);
    }

    public j3() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ j3(o2 o2Var, n3 n3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : o2Var, (i11 & 2) != 0 ? null : n3Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final j3 a(o2 o2Var, n3 n3Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j3(o2Var, n3Var, unknownFields);
    }

    public final o2 b() {
        return this.f8073a;
    }

    public final n3 c() {
        return this.f8074b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), j3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8073a, j3Var.f8073a) && kotlin.jvm.internal.s.c(this.f8074b, j3Var.f8074b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            o2 o2Var = this.f8073a;
            int hashCode2 = (hashCode + (o2Var != null ? o2Var.hashCode() : 0)) * 37;
            n3 n3Var = this.f8074b;
            int hashCode3 = hashCode2 + (n3Var != null ? n3Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m43newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        o2 o2Var = this.f8073a;
        if (o2Var != null) {
            arrayList.add("signedMessage=" + o2Var);
        }
        n3 n3Var = this.f8074b;
        if (n3Var != null) {
            arrayList.add("unsignedMessage=" + n3Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ToVCSECMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m43newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(o2 o2Var, n3 n3Var, okio.i unknownFields) {
        super(f8072c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8073a = o2Var;
        this.f8074b = n3Var;
        if (!(mr.d.c(o2Var, n3Var) <= 1)) {
            throw new IllegalArgumentException("At most one of signedMessage, unsignedMessage may be non-null".toString());
        }
    }
}