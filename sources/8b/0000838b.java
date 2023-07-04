package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c> f37352b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagedChargingSite#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final w0 f37353a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AddManagedChargingSiteRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            w0 w0Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(w0Var, reader.e(d11));
                } else if (g11 == 1) {
                    w0Var = w0.f37678d.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                w0.f37678d.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + w0.f37678d.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            kotlin.jvm.internal.s.g(value, "value");
            w0 b11 = value.b();
            return value.a(b11 == null ? null : w0.f37678d.redact(b11), okio.i.f42656d);
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
        f37352b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
    }

    public c() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c(w0 w0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : w0Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final c a(w0 w0Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new c(w0Var, unknownFields);
    }

    public final w0 b() {
        return this.f37353a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37353a, cVar.f37353a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            w0 w0Var = this.f37353a;
            int hashCode2 = hashCode + (w0Var != null ? w0Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m660newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        w0 w0Var = this.f37353a;
        if (w0Var != null) {
            arrayList.add("site=" + w0Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "AddManagedChargingSiteRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m660newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w0 w0Var, okio.i unknownFields) {
        super(f37352b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37353a = w0Var;
    }
}