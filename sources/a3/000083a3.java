package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class d2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<d2> f37365c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final String f37366a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = MessageExtension.FIELD_DATA, label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f37367b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d2> {
        a(com.squareup.wire.b bVar, n00.d<d2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.StreamMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d2(str, iVar, reader.e(d11));
                } else if (g11 == 1) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(1, value.d());
            }
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d2 redact(d2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return d2.b(value, null, null, okio.i.f42656d, 3, null);
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
        f37365c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(d2.class), com.squareup.wire.o.PROTO_3);
    }

    public d2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ d2(String str, okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? okio.i.f42656d : iVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ d2 b(d2 d2Var, String str, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = d2Var.f37366a;
        }
        if ((i11 & 2) != 0) {
            iVar = d2Var.f37367b;
        }
        if ((i11 & 4) != 0) {
            iVar2 = d2Var.unknownFields();
        }
        return d2Var.a(str, iVar, iVar2);
    }

    public final d2 a(String sessionId, okio.i data_, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(data_, "data_");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new d2(sessionId, data_, unknownFields);
    }

    public final okio.i c() {
        return this.f37367b;
    }

    public final String d() {
        return this.f37366a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            d2 d2Var = (d2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), d2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37366a, d2Var.f37366a) && kotlin.jvm.internal.s.c(this.f37367b, d2Var.f37367b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f37366a.hashCode()) * 37) + this.f37367b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m668newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37366a);
        arrayList.add("sessionId=" + i11);
        okio.i iVar = this.f37367b;
        arrayList.add("data_=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "StreamMessage{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m668newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(String sessionId, okio.i data_, okio.i unknownFields) {
        super(f37365c, unknownFields);
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(data_, "data_");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37366a = sessionId;
        this.f37367b = data_;
    }
}