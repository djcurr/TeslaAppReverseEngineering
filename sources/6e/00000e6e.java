package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class z extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<z> f8292c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Certificate#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final w f8293a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CertificateStatus_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final a0 f8294b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<z> {
        a(com.squareup.wire.b bVar, n00.d<z> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.CertificateResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public z decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            a0 a0Var = a0.CERTIFICATE_STATUS_NONE;
            long d11 = reader.d();
            w wVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new z(wVar, a0Var, reader.e(d11));
                } else if (g11 == 1) {
                    wVar = w.f8229b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        a0Var = a0.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, z value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != null) {
                w.f8229b.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != a0.CERTIFICATE_STATUS_NONE) {
                a0.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(z value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += w.f8229b.encodedSizeWithTag(1, value.c());
            }
            return value.d() != a0.CERTIFICATE_STATUS_NONE ? z11 + a0.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public z redact(z value) {
            kotlin.jvm.internal.s.g(value, "value");
            w c11 = value.c();
            return z.b(value, c11 == null ? null : w.f8229b.redact(c11), null, okio.i.f42656d, 2, null);
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
        f8292c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(z.class), com.squareup.wire.o.PROTO_3);
    }

    public z() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ z(w wVar, a0 a0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : wVar, (i11 & 2) != 0 ? a0.CERTIFICATE_STATUS_NONE : a0Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ z b(z zVar, w wVar, a0 a0Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wVar = zVar.f8293a;
        }
        if ((i11 & 2) != 0) {
            a0Var = zVar.f8294b;
        }
        if ((i11 & 4) != 0) {
            iVar = zVar.unknownFields();
        }
        return zVar.a(wVar, a0Var, iVar);
    }

    public final z a(w wVar, a0 certificateStatus, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(certificateStatus, "certificateStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new z(wVar, certificateStatus, unknownFields);
    }

    public final w c() {
        return this.f8293a;
    }

    public final a0 d() {
        return this.f8294b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), zVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f8293a, zVar.f8293a) && this.f8294b == zVar.f8294b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            w wVar = this.f8293a;
            int hashCode2 = ((hashCode + (wVar != null ? wVar.hashCode() : 0)) * 37) + this.f8294b.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m90newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        w wVar = this.f8293a;
        if (wVar != null) {
            arrayList.add("certificate=" + wVar);
        }
        a0 a0Var = this.f8294b;
        arrayList.add("certificateStatus=" + a0Var);
        l02 = wz.e0.l0(arrayList, ", ", "CertificateResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m90newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar, a0 certificateStatus, okio.i unknownFields) {
        super(f8292c, unknownFields);
        kotlin.jvm.internal.s.g(certificateStatus, "certificateStatus");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8293a = wVar;
        this.f8294b = certificateStatus;
    }
}