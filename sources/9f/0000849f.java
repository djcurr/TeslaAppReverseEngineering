package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class v1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<v1> f37670b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plainText", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37671a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<v1> {
        a(com.squareup.wire.b bVar, n00.d<v1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ResultReason", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v1(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v1 redact(v1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return v1.b(value, null, okio.i.f42656d, 1, null);
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
        f37670b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(v1.class), com.squareup.wire.o.PROTO_3);
    }

    public v1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ v1(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ v1 b(v1 v1Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = v1Var.f37671a;
        }
        if ((i11 & 2) != 0) {
            iVar = v1Var.unknownFields();
        }
        return v1Var.a(str, iVar);
    }

    public final v1 a(String str, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v1(str, unknownFields);
    }

    public final String c() {
        return this.f37671a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), v1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37671a, v1Var.f37671a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.f37671a;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m744newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String str = this.f37671a;
        if (str != null) {
            String i11 = mr.d.i(str);
            arrayList.add("plain_text=" + i11);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ResultReason{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m744newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(String str, okio.i unknownFields) {
        super(f37670b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37671a = str;
    }
}