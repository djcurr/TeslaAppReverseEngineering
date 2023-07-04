package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<p1> f37564b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "lastKnownPseudonymHashed", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f37565a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p1> {
        a(com.squareup.wire.b bVar, n00.d<p1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PseudonymSyncRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p1(iVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p1 redact(p1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return p1.b(value, null, okio.i.f42656d, 1, null);
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
        f37564b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p1.class), com.squareup.wire.o.PROTO_3);
    }

    public p1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ p1(okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ p1 b(p1 p1Var, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = p1Var.f37565a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = p1Var.unknownFields();
        }
        return p1Var.a(iVar, iVar2);
    }

    public final p1 a(okio.i last_known_pseudonym_hashed, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(last_known_pseudonym_hashed, "last_known_pseudonym_hashed");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p1(last_known_pseudonym_hashed, unknownFields);
    }

    public final okio.i c() {
        return this.f37565a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), p1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37565a, p1Var.f37565a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37565a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m717newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f37565a;
        arrayList.add("last_known_pseudonym_hashed=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "PseudonymSyncRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m717newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(okio.i last_known_pseudonym_hashed, okio.i unknownFields) {
        super(f37564b, unknownFields);
        kotlin.jvm.internal.s.g(last_known_pseudonym_hashed, "last_known_pseudonym_hashed");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37565a = last_known_pseudonym_hashed;
    }
}