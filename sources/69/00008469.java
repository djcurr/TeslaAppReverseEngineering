package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class s extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<s> f37586c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37587a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37588b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<s> {
        a(com.squareup.wire.b bVar, n00.d<s> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DrivingSpeedLimitAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public s decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new s(z11, str, reader.e(d11));
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
        public void encode(com.squareup.wire.l writer, s value) {
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
        public int encodedSize(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c()));
            }
            return !kotlin.jvm.internal.s.c(value.d(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public s redact(s value) {
            kotlin.jvm.internal.s.g(value, "value");
            return s.b(value, false, null, okio.i.f42656d, 3, null);
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
        f37586c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(s.class), com.squareup.wire.o.PROTO_3);
    }

    public s() {
        this(false, null, null, 7, null);
    }

    public /* synthetic */ s(boolean z11, String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ s b(s sVar, boolean z11, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sVar.f37587a;
        }
        if ((i11 & 2) != 0) {
            str = sVar.f37588b;
        }
        if ((i11 & 4) != 0) {
            iVar = sVar.unknownFields();
        }
        return sVar.a(z11, str, iVar);
    }

    public final s a(boolean z11, String pin, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(pin, "pin");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new s(z11, pin, unknownFields);
    }

    public final boolean c() {
        return this.f37587a;
    }

    public final String d() {
        return this.f37588b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), sVar.unknownFields()) && this.f37587a == sVar.f37587a && kotlin.jvm.internal.s.c(this.f37588b, sVar.f37588b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f37587a)) * 37) + this.f37588b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m727newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f37587a;
        arrayList.add("activate=" + z11);
        String i11 = mr.d.i(this.f37588b);
        arrayList.add("pin=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "DrivingSpeedLimitAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m727newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z11, String pin, okio.i unknownFields) {
        super(f37586c, unknownFields);
        kotlin.jvm.internal.s.g(pin, "pin");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37587a = z11;
        this.f37588b = pin;
    }
}