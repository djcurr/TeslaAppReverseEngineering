package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<c> f7959b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyIdentifier#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e1 f7960a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ActiveKey", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            e1 e1Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(e1Var, reader.e(d11));
                } else if (g11 == 1) {
                    e1Var = e1.f7982b.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.b() != null) {
                e1.f7982b.encodeWithTag(writer, 1, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.b() != null ? z11 + e1.f7982b.encodedSizeWithTag(1, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            kotlin.jvm.internal.s.g(value, "value");
            e1 b11 = value.b();
            return value.a(b11 == null ? null : e1.f7982b.redact(b11), okio.i.f42656d);
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
        f7959b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(c.class), com.squareup.wire.o.PROTO_3);
    }

    public c() {
        this(null, null, 3, null);
    }

    public /* synthetic */ c(e1 e1Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : e1Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final c a(e1 e1Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new c(e1Var, unknownFields);
    }

    public final e1 b() {
        return this.f7960a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f7960a, cVar.f7960a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            e1 e1Var = this.f7960a;
            int hashCode2 = hashCode + (e1Var != null ? e1Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m18newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e1 e1Var = this.f7960a;
        if (e1Var != null) {
            arrayList.add("activeKey=" + e1Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ActiveKey{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m18newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e1 e1Var, okio.i unknownFields) {
        super(f7959b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7960a = e1Var;
    }
}