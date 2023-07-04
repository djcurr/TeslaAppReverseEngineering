package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class l2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<l2> f8086c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPStationaryConfig#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final g3 f8087a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.TPMotionConfig#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final b3 f8088b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l2> {
        a(com.squareup.wire.b bVar, n00.d<l2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SetTPConfigration", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            g3 g3Var = null;
            b3 b3Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new l2(g3Var, b3Var, reader.e(d11));
                } else if (g11 == 1) {
                    g3Var = g3.f8023f.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    b3Var = b3.f7943d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                g3.f8023f.encodeWithTag(writer, 1, value.c());
            }
            if (value.b() != null) {
                b3.f7943d.encodeWithTag(writer, 2, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += g3.f8023f.encodedSizeWithTag(1, value.c());
            }
            return value.b() != null ? z11 + b3.f7943d.encodedSizeWithTag(2, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l2 redact(l2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            g3 c11 = value.c();
            g3 redact = c11 == null ? null : g3.f8023f.redact(c11);
            b3 b11 = value.b();
            return value.a(redact, b11 != null ? b3.f7943d.redact(b11) : null, okio.i.f42656d);
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
        f8086c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(l2.class), com.squareup.wire.o.PROTO_3);
    }

    public l2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ l2(g3 g3Var, b3 b3Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : g3Var, (i11 & 2) != 0 ? null : b3Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final l2 a(g3 g3Var, b3 b3Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l2(g3Var, b3Var, unknownFields);
    }

    public final b3 b() {
        return this.f8088b;
    }

    public final g3 c() {
        return this.f8087a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), l2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8087a, l2Var.f8087a) && kotlin.jvm.internal.s.c(this.f8088b, l2Var.f8088b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            g3 g3Var = this.f8087a;
            int hashCode2 = (hashCode + (g3Var != null ? g3Var.hashCode() : 0)) * 37;
            b3 b3Var = this.f8088b;
            int hashCode3 = hashCode2 + (b3Var != null ? b3Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m48newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        g3 g3Var = this.f8087a;
        if (g3Var != null) {
            arrayList.add("stationaryConfig=" + g3Var);
        }
        b3 b3Var = this.f8088b;
        if (b3Var != null) {
            arrayList.add("motionConfig=" + b3Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "SetTPConfigration{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m48newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(g3 g3Var, b3 b3Var, okio.i unknownFields) {
        super(f8086c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8087a = g3Var;
        this.f8088b = b3Var;
    }
}