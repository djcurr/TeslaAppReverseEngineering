package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e2 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<e2> f7984c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f7985a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final okio.i f7986b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e2> {
        a(com.squareup.wire.b bVar, n00.d<e2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.RCISignature", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            okio.i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e2(iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(c11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            okio.i c11 = value.c();
            okio.i iVar = okio.i.f42656d;
            if (!kotlin.jvm.internal.s.c(c11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            return !kotlin.jvm.internal.s.c(value.d(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e2 redact(e2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return e2.b(value, null, null, okio.i.f42656d, 3, null);
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
        f7984c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(e2.class), com.squareup.wire.o.PROTO_3);
    }

    public e2() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ e2(okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ e2 b(e2 e2Var, okio.i iVar, okio.i iVar2, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = e2Var.f7985a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = e2Var.f7986b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = e2Var.unknownFields();
        }
        return e2Var.a(iVar, iVar2, iVar3);
    }

    public final e2 a(okio.i nonce, okio.i tag, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(nonce, "nonce");
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e2(nonce, tag, unknownFields);
    }

    public final okio.i c() {
        return this.f7985a;
    }

    public final okio.i d() {
        return this.f7986b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), e2Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f7985a, e2Var.f7985a) && kotlin.jvm.internal.s.c(this.f7986b, e2Var.f7986b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f7985a.hashCode()) * 37) + this.f7986b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m26newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f7985a;
        arrayList.add("nonce=" + iVar);
        okio.i iVar2 = this.f7986b;
        arrayList.add("tag=" + iVar2);
        l02 = wz.e0.l0(arrayList, ", ", "RCISignature{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m26newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(okio.i nonce, okio.i tag, okio.i unknownFields) {
        super(f7984c, unknownFields);
        kotlin.jvm.internal.s.g(nonce, "nonce");
        kotlin.jvm.internal.s.g(tag, "tag");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7985a = nonce;
        this.f7986b = tag;
    }
}