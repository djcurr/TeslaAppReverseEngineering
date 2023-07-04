package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class k2 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<k2> f8079d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8080a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8081b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f8082c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<k2> {
        a(com.squareup.wire.b bVar, n00.d<k2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.SessionInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public k2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new k2(iVar, i11, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, k2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.e());
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.c()));
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(k2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i e11 = value.e();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(e11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.e());
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.c()));
            }
            return !kotlin.jvm.internal.s.c(value.d(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public k2 redact(k2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return k2.b(value, null, 0, null, okio.i.f42656d, 7, null);
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
        f8079d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(k2.class), com.squareup.wire.o.PROTO_3);
    }

    public k2() {
        this(null, 0, null, null, 15, null);
    }

    public /* synthetic */ k2(okio.i iVar, int i11, okio.i iVar2, okio.i iVar3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? okio.i.f42656d : iVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? okio.i.f42656d : iVar2, (i12 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ k2 b(k2 k2Var, okio.i iVar, int i11, okio.i iVar2, okio.i iVar3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iVar = k2Var.f8080a;
        }
        if ((i12 & 2) != 0) {
            i11 = k2Var.f8081b;
        }
        if ((i12 & 4) != 0) {
            iVar2 = k2Var.f8082c;
        }
        if ((i12 & 8) != 0) {
            iVar3 = k2Var.unknownFields();
        }
        return k2Var.a(iVar, i11, iVar2, iVar3);
    }

    public final k2 a(okio.i token, int i11, okio.i publicKey, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(publicKey, "publicKey");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new k2(token, i11, publicKey, unknownFields);
    }

    public final int c() {
        return this.f8081b;
    }

    public final okio.i d() {
        return this.f8082c;
    }

    public final okio.i e() {
        return this.f8080a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), k2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8080a, k2Var.f8080a) && this.f8081b == k2Var.f8081b && kotlin.jvm.internal.s.c(this.f8082c, k2Var.f8082c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8080a.hashCode()) * 37) + Integer.hashCode(this.f8081b)) * 37) + this.f8082c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m46newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8080a;
        arrayList.add("token=" + iVar);
        int i11 = this.f8081b;
        arrayList.add("counter=" + i11);
        okio.i iVar2 = this.f8082c;
        arrayList.add("publicKey=" + iVar2);
        l02 = wz.e0.l0(arrayList, ", ", "SessionInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m46newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(okio.i token, int i11, okio.i publicKey, okio.i unknownFields) {
        super(f8079d, unknownFields);
        kotlin.jvm.internal.s.g(token, "token");
        kotlin.jvm.internal.s.g(publicKey, "publicKey");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8080a = token;
        this.f8081b = i11;
        this.f8082c = publicKey;
    }
}