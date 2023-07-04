package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class q3 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<q3> f8187c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CodeDescriptor#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final h0 f8188a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterStatus#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final r3 f8189b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q3> {
        a(com.squareup.wire.b bVar, n00.d<q3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UpdaterResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            h0 h0Var = null;
            r3 r3Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q3(h0Var, r3Var, reader.e(d11));
                } else if (g11 == 1) {
                    h0Var = h0.f8029d.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    r3Var = r3.f8193d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            h0.f8029d.encodeWithTag(writer, 1, value.b());
            r3.f8193d.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + h0.f8029d.encodedSizeWithTag(1, value.b()) + r3.f8193d.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q3 redact(q3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            h0 b11 = value.b();
            h0 redact = b11 == null ? null : h0.f8029d.redact(b11);
            r3 c11 = value.c();
            return value.a(redact, c11 != null ? r3.f8193d.redact(c11) : null, okio.i.f42656d);
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
        f8187c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(q3.class), com.squareup.wire.o.PROTO_3);
    }

    public q3() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ q3(h0 h0Var, r3 r3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : r3Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final q3 a(h0 h0Var, r3 r3Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q3(h0Var, r3Var, unknownFields);
    }

    public final h0 b() {
        return this.f8188a;
    }

    public final r3 c() {
        return this.f8189b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q3) {
            q3 q3Var = (q3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), q3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8188a, q3Var.f8188a) && kotlin.jvm.internal.s.c(this.f8189b, q3Var.f8189b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            h0 h0Var = this.f8188a;
            int hashCode2 = (hashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            r3 r3Var = this.f8189b;
            int hashCode3 = hashCode2 + (r3Var != null ? r3Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m67newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.f8188a;
        if (h0Var != null) {
            arrayList.add("codeDescriptorMessage=" + h0Var);
        }
        r3 r3Var = this.f8189b;
        if (r3Var != null) {
            arrayList.add("updaterStatus=" + r3Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "UpdaterResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m67newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(h0 h0Var, r3 r3Var, okio.i unknownFields) {
        super(f8187c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8188a = h0Var;
        this.f8189b = r3Var;
        if (!(mr.d.c(h0Var, r3Var) <= 1)) {
            throw new IllegalArgumentException("At most one of codeDescriptorMessage, updaterStatus may be non-null".toString());
        }
    }
}