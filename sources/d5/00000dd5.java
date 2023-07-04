package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class o3 extends com.squareup.wire.f {

    /* renamed from: f  reason: collision with root package name */
    public static final ProtoAdapter<o3> f8148f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GetCodeDescriptor#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u0 f8149a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SetUpdaterLocation#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final m2 f8150b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.StageBlock#ADAPTER", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final u2 f8151c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VerifyAndInstallApp#ADAPTER", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final x3 f8152d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final okio.i f8153e;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o3> {
        a(com.squareup.wire.b bVar, n00.d<o3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UpdaterCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u0 u0Var = null;
            m2 m2Var = null;
            u2 u2Var = null;
            x3 x3Var = null;
            okio.i iVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o3(u0Var, m2Var, u2Var, x3Var, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    u0Var = u0.f8212b.decode(reader);
                } else if (g11 == 2) {
                    m2Var = m2.f8100b.decode(reader);
                } else if (g11 == 3) {
                    u2Var = u2.f8214c.decode(reader);
                } else if (g11 == 4) {
                    x3Var = x3.f8270d.decode(reader);
                } else if (g11 != 5) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            u0.f8212b.encodeWithTag(writer, 1, value.d());
            m2.f8100b.encodeWithTag(writer, 2, value.e());
            u2.f8214c.encodeWithTag(writer, 3, value.f());
            x3.f8270d.encodeWithTag(writer, 4, value.g());
            ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + u0.f8212b.encodedSizeWithTag(1, value.d()) + m2.f8100b.encodedSizeWithTag(2, value.e()) + u2.f8214c.encodedSizeWithTag(3, value.f()) + x3.f8270d.encodedSizeWithTag(4, value.g()) + ProtoAdapter.BYTES.encodedSizeWithTag(5, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o3 redact(o3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            u0 d11 = value.d();
            u0 redact = d11 == null ? null : u0.f8212b.redact(d11);
            m2 e11 = value.e();
            m2 redact2 = e11 == null ? null : m2.f8100b.redact(e11);
            u2 f11 = value.f();
            u2 redact3 = f11 == null ? null : u2.f8214c.redact(f11);
            x3 g11 = value.g();
            return o3.b(value, redact, redact2, redact3, g11 != null ? x3.f8270d.redact(g11) : null, null, okio.i.f42656d, 16, null);
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
        f8148f = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(o3.class), com.squareup.wire.o.PROTO_3);
    }

    public o3() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ o3(u0 u0Var, m2 m2Var, u2 u2Var, x3 x3Var, okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : u0Var, (i11 & 2) != 0 ? null : m2Var, (i11 & 4) != 0 ? null : u2Var, (i11 & 8) != 0 ? null : x3Var, (i11 & 16) == 0 ? iVar : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ o3 b(o3 o3Var, u0 u0Var, m2 m2Var, u2 u2Var, x3 x3Var, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            u0Var = o3Var.f8149a;
        }
        if ((i11 & 2) != 0) {
            m2Var = o3Var.f8150b;
        }
        m2 m2Var2 = m2Var;
        if ((i11 & 4) != 0) {
            u2Var = o3Var.f8151c;
        }
        u2 u2Var2 = u2Var;
        if ((i11 & 8) != 0) {
            x3Var = o3Var.f8152d;
        }
        x3 x3Var2 = x3Var;
        if ((i11 & 16) != 0) {
            iVar = o3Var.f8153e;
        }
        okio.i iVar3 = iVar;
        if ((i11 & 32) != 0) {
            iVar2 = o3Var.unknownFields();
        }
        return o3Var.a(u0Var, m2Var2, u2Var2, x3Var2, iVar3, iVar2);
    }

    public final o3 a(u0 u0Var, m2 m2Var, u2 u2Var, x3 x3Var, okio.i iVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o3(u0Var, m2Var, u2Var, x3Var, iVar, unknownFields);
    }

    public final okio.i c() {
        return this.f8153e;
    }

    public final u0 d() {
        return this.f8149a;
    }

    public final m2 e() {
        return this.f8150b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o3) {
            o3 o3Var = (o3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), o3Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8149a, o3Var.f8149a) && kotlin.jvm.internal.s.c(this.f8150b, o3Var.f8150b) && kotlin.jvm.internal.s.c(this.f8151c, o3Var.f8151c) && kotlin.jvm.internal.s.c(this.f8152d, o3Var.f8152d) && kotlin.jvm.internal.s.c(this.f8153e, o3Var.f8153e);
        }
        return false;
    }

    public final u2 f() {
        return this.f8151c;
    }

    public final x3 g() {
        return this.f8152d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u0 u0Var = this.f8149a;
            int hashCode2 = (hashCode + (u0Var != null ? u0Var.hashCode() : 0)) * 37;
            m2 m2Var = this.f8150b;
            int hashCode3 = (hashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 37;
            u2 u2Var = this.f8151c;
            int hashCode4 = (hashCode3 + (u2Var != null ? u2Var.hashCode() : 0)) * 37;
            x3 x3Var = this.f8152d;
            int hashCode5 = (hashCode4 + (x3Var != null ? x3Var.hashCode() : 0)) * 37;
            okio.i iVar = this.f8153e;
            int hashCode6 = hashCode5 + (iVar != null ? iVar.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m61newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u0 u0Var = this.f8149a;
        if (u0Var != null) {
            arrayList.add("getCodeDescriptor=" + u0Var);
        }
        m2 m2Var = this.f8150b;
        if (m2Var != null) {
            arrayList.add("setUpdaterLocation=" + m2Var);
        }
        u2 u2Var = this.f8151c;
        if (u2Var != null) {
            arrayList.add("stageBlock=" + u2Var);
        }
        x3 x3Var = this.f8152d;
        if (x3Var != null) {
            arrayList.add("verifyAndInstallApp=" + x3Var);
        }
        okio.i iVar = this.f8153e;
        if (iVar != null) {
            arrayList.add("firmwareInfo=" + iVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "UpdaterCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m61newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(u0 u0Var, m2 m2Var, u2 u2Var, x3 x3Var, okio.i iVar, okio.i unknownFields) {
        super(f8148f, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8149a = u0Var;
        this.f8150b = m2Var;
        this.f8151c = u2Var;
        this.f8152d = x3Var;
        this.f8153e = iVar;
        if (!(mr.d.e(u0Var, m2Var, u2Var, x3Var, iVar) <= 1)) {
            throw new IllegalArgumentException("At most one of getCodeDescriptor, setUpdaterLocation, stageBlock, verifyAndInstallApp, firmwareInfo may be non-null".toString());
        }
    }
}