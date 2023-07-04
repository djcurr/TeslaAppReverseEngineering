package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class n extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<n> f37529b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37530a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<n> {
        a(com.squareup.wire.b bVar, n00.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.CreateStreamSession", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n redact(n value) {
            kotlin.jvm.internal.s.g(value, "value");
            return n.b(value, null, okio.i.f42656d, 1, null);
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
        f37529b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(n.class), com.squareup.wire.o.PROTO_3);
    }

    public n() {
        this(null, null, 3, null);
    }

    public /* synthetic */ n(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ n b(n nVar, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nVar.f37530a;
        }
        if ((i11 & 2) != 0) {
            iVar = nVar.unknownFields();
        }
        return nVar.a(str, iVar);
    }

    public final n a(String sessionId, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n(sessionId, unknownFields);
    }

    public final String c() {
        return this.f37530a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), nVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f37530a, nVar.f37530a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37530a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m707newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37530a);
        arrayList.add("sessionId=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "CreateStreamSession{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m707newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String sessionId, okio.i unknownFields) {
        super(f37529b, unknownFields);
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37530a = sessionId;
    }
}