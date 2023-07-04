package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class s2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<s2> f37608c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37609a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37610b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s2> {
        a(com.squareup.wire.b bVar, n00.d<s2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleControlSetValetModeAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s2(z11, str, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, s2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(s2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c()));
            }
            return !kotlin.jvm.internal.s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s2 redact(s2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return s2.b(value, false, null, okio.i.f42656d, 3, null);
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
        f37608c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s2.class), com.squareup.wire.o.PROTO_3);
    }

    public s2() {
        this(false, null, null, 7, null);
    }

    public /* synthetic */ s2(boolean z11, String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s2 b(s2 s2Var, boolean z11, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = s2Var.f37609a;
        }
        if ((i11 & 2) != 0) {
            str = s2Var.f37610b;
        }
        if ((i11 & 4) != 0) {
            iVar = s2Var.unknownFields();
        }
        return s2Var.a(z11, str, iVar);
    }

    public final s2 a(boolean z11, String password, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(password, "password");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s2(z11, password, unknownFields);
    }

    public final boolean c() {
        return this.f37609a;
    }

    public final String d() {
        return this.f37610b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), s2Var.unknownFields()) && this.f37609a == s2Var.f37609a && kotlin.jvm.internal.s.c(this.f37610b, s2Var.f37610b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37609a)) * 37) + this.f37610b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m731newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37609a;
        arrayList.add("on=" + z11);
        String i11 = mr.d.i(this.f37610b);
        arrayList.add("password=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "VehicleControlSetValetModeAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m731newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(boolean z11, String password, okio.i unknownFields) {
        super(f37608c, unknownFields);
        kotlin.jvm.internal.s.g(password, "password");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37609a = z11;
        this.f37610b = password;
    }
}