package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class s2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<s2> f8203c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.DelaySleepRequest#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final k0 f8204a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SleepManagerCommand_E#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final r2 f8205b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s2> {
        a(com.squareup.wire.b bVar, n00.d<s2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SleepManagerRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            k0 k0Var = null;
            r2 r2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s2(k0Var, r2Var, reader.e(d11));
                } else if (g11 == 1) {
                    k0Var = k0.f8075b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        r2Var = r2.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            k0.f8075b.encodeWithTag(writer, 1, value.c());
            r2.ADAPTER.encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + k0.f8075b.encodedSizeWithTag(1, value.c()) + r2.ADAPTER.encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s2 redact(s2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            k0 c11 = value.c();
            return s2.b(value, c11 == null ? null : k0.f8075b.redact(c11), null, okio.i.f42656d, 2, null);
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
        f8203c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s2.class), com.squareup.wire.o.PROTO_3);
    }

    public s2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ s2(k0 k0Var, r2 r2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : k0Var, (i11 & 2) != 0 ? null : r2Var, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s2 b(s2 s2Var, k0 k0Var, r2 r2Var, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            k0Var = s2Var.f8204a;
        }
        if ((i11 & 2) != 0) {
            r2Var = s2Var.f8205b;
        }
        if ((i11 & 4) != 0) {
            iVar = s2Var.unknownFields();
        }
        return s2Var.a(k0Var, r2Var, iVar);
    }

    public final s2 a(k0 k0Var, r2 r2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s2(k0Var, r2Var, unknownFields);
    }

    public final k0 c() {
        return this.f8204a;
    }

    public final r2 d() {
        return this.f8205b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), s2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8204a, s2Var.f8204a) && this.f8205b == s2Var.f8205b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            k0 k0Var = this.f8204a;
            int hashCode2 = (hashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 37;
            r2 r2Var = this.f8205b;
            int hashCode3 = hashCode2 + (r2Var != null ? r2Var.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m72newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        k0 k0Var = this.f8204a;
        if (k0Var != null) {
            arrayList.add("delaySleepRequest=" + k0Var);
        }
        r2 r2Var = this.f8205b;
        if (r2Var != null) {
            arrayList.add("sleepManagerCommand=" + r2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "SleepManagerRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m72newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(k0 k0Var, r2 r2Var, okio.i unknownFields) {
        super(f8203c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8204a = k0Var;
        this.f8205b = r2Var;
        if (!(mr.d.c(k0Var, r2Var) <= 1)) {
            throw new IllegalArgumentException("At most one of delaySleepRequest, sleepManagerCommand may be non-null".toString());
        }
    }
}