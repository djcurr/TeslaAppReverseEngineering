package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c3 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c3> f7966b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PublicKey#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final b2 f7967a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c3> {
        a(com.squareup.wire.b bVar, n00.d<c3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPNewSensorData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            b2 b2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c3(b2Var, reader.e(d11));
                } else if (g11 == 1) {
                    b2Var = b2.f7941b.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                b2.f7941b.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + b2.f7941b.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c3 redact(c3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            b2 b11 = value.b();
            return value.a(b11 == null ? null : b2.f7941b.redact(b11), okio.i.f42656d);
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
        f7966b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c3.class), com.squareup.wire.o.PROTO_3);
    }

    public c3() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c3(b2 b2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : b2Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final c3 a(b2 b2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new c3(b2Var, unknownFields);
    }

    public final b2 b() {
        return this.f7967a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), c3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f7967a, c3Var.f7967a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            b2 b2Var = this.f7967a;
            int hashCode2 = hashCode + (b2Var != null ? b2Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m21newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        b2 b2Var = this.f7967a;
        if (b2Var != null) {
            arrayList.add("sensorPublicKey=" + b2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "TPNewSensorData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m21newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(b2 b2Var, okio.i unknownFields) {
        super(f7966b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7967a = b2Var;
    }
}