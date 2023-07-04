package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class w extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<w> f8229b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CertificateInParts#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final x f8230a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<w> {
        a(com.squareup.wire.b bVar, n00.d<w> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.Certificate", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public w decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            x xVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new w(xVar, reader.e(d11));
                } else if (g11 == 1) {
                    xVar = x.f8244d.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, w value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            x.f8244d.encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(w value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + x.f8244d.encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public w redact(w value) {
            kotlin.jvm.internal.s.g(value, "value");
            x b11 = value.b();
            return value.a(b11 == null ? null : x.f8244d.redact(b11), okio.i.f42656d);
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
        f8229b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(w.class), com.squareup.wire.o.PROTO_3);
    }

    public w() {
        this(null, null, 3, null);
    }

    public /* synthetic */ w(x xVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : xVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final w a(x xVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new w(xVar, unknownFields);
    }

    public final x b() {
        return this.f8230a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), wVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f8230a, wVar.f8230a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            x xVar = this.f8230a;
            int hashCode2 = hashCode + (xVar != null ? xVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m80newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        x xVar = this.f8230a;
        if (xVar != null) {
            arrayList.add("certificateInParts=" + xVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "Certificate{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m80newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, okio.i unknownFields) {
        super(f8229b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8230a = xVar;
    }
}