package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m3 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<m3> f8102c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8103a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureStatuses#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final g0 f8104b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m3> {
        a(com.squareup.wire.b bVar, n00.d<m3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UnsecureNotification", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            g0 g0Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m3(z11, g0Var, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    g0Var = g0.f8008h.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, m3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            if (value.c() != null) {
                g0.f8008h.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            return value.c() != null ? z11 + g0.f8008h.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m3 redact(m3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            g0 c11 = value.c();
            return m3.b(value, false, c11 == null ? null : g0.f8008h.redact(c11), okio.i.f42656d, 1, null);
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
        f8102c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m3.class), com.squareup.wire.o.PROTO_3);
    }

    public m3() {
        this(false, null, null, 7, null);
    }

    public /* synthetic */ m3(boolean z11, g0 g0Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : g0Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ m3 b(m3 m3Var, boolean z11, g0 g0Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = m3Var.f8103a;
        }
        if ((i11 & 2) != 0) {
            g0Var = m3Var.f8104b;
        }
        if ((i11 & 4) != 0) {
            iVar = m3Var.unknownFields();
        }
        return m3Var.a(z11, g0Var, iVar);
    }

    public final m3 a(boolean z11, g0 g0Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m3(z11, g0Var, unknownFields);
    }

    public final g0 c() {
        return this.f8104b;
    }

    public final boolean d() {
        return this.f8103a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m3) {
            m3 m3Var = (m3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), m3Var.unknownFields()) && this.f8103a == m3Var.f8103a && kotlin.jvm.internal.s.c(this.f8104b, m3Var.f8104b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f8103a)) * 37;
            g0 g0Var = this.f8104b;
            int hashCode2 = hashCode + (g0Var != null ? g0Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m53newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f8103a;
        arrayList.add("notifyUser=" + z11);
        g0 g0Var = this.f8104b;
        if (g0Var != null) {
            arrayList.add("closureStatuses=" + g0Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "UnsecureNotification{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m53newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(boolean z11, g0 g0Var, okio.i unknownFields) {
        super(f8102c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8103a = z11;
        this.f8104b = g0Var;
    }
}