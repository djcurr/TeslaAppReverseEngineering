package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class o0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<o0> f8137b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8138a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o0> {
        a(com.squareup.wire.b bVar, n00.d<o0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FromRCI", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o0(iVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o0 redact(o0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return o0.b(value, null, okio.i.f42656d, 1, null);
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
        f8137b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(o0.class), com.squareup.wire.o.PROTO_3);
    }

    public o0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ o0(okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ o0 b(o0 o0Var, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = o0Var.f8138a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = o0Var.unknownFields();
        }
        return o0Var.a(iVar, iVar2);
    }

    public final o0 a(okio.i response, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(response, "response");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o0(response, unknownFields);
    }

    public final okio.i c() {
        return this.f8138a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), o0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8138a, o0Var.f8138a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8138a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m58newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8138a;
        arrayList.add("response=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "FromRCI{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m58newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(okio.i response, okio.i unknownFields) {
        super(f8137b, unknownFields);
        kotlin.jvm.internal.s.g(response, "response");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8138a = response;
    }
}