package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class q1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<q1> f37572b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37573a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<q1> {
        a(com.squareup.wire.b bVar, n00.d<q1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PseudonymSyncResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public q1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new q1(str, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, q1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(q1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public q1 redact(q1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return q1.b(value, null, okio.i.f42656d, 1, null);
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
        f37572b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(q1.class), com.squareup.wire.o.PROTO_3);
    }

    public q1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ q1(String str, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ q1 b(q1 q1Var, String str, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = q1Var.f37573a;
        }
        if ((i11 & 2) != 0) {
            iVar = q1Var.unknownFields();
        }
        return q1Var.a(str, iVar);
    }

    public final q1 a(String pseudonym, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(pseudonym, "pseudonym");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new q1(pseudonym, unknownFields);
    }

    public final String c() {
        return this.f37573a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), q1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37573a, q1Var.f37573a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37573a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m721newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37573a);
        arrayList.add("pseudonym=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "PseudonymSyncResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m721newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(String pseudonym, okio.i unknownFields) {
        super(f37572b, unknownFields);
        kotlin.jvm.internal.s.g(pseudonym, "pseudonym");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37573a = pseudonym;
    }
}