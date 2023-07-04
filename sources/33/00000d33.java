package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<e> f7980b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AlertHandlePulledWithoutAuth#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final f f7981a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.Alert", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public e decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            f fVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new e(fVar, reader.e(d11));
                } else if (g11 == 1) {
                    fVar = f.f7987g.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, e value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            f.f7987g.encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + f.f7987g.encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public e redact(e value) {
            kotlin.jvm.internal.s.g(value, "value");
            f b11 = value.b();
            return value.a(b11 == null ? null : f.f7987g.redact(b11), okio.i.f42656d);
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
        f7980b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(e.class), com.squareup.wire.o.PROTO_3);
    }

    public e() {
        this(null, null, 3, null);
    }

    public /* synthetic */ e(f fVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final e a(f fVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new e(fVar, unknownFields);
    }

    public final f b() {
        return this.f7981a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f7981a, eVar.f7981a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            f fVar = this.f7981a;
            int hashCode2 = hashCode + (fVar != null ? fVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m24newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        f fVar = this.f7981a;
        if (fVar != null) {
            arrayList.add("alertHandlePulledWithoutAuth=" + fVar);
        }
        l02 = wz.e0.l0(arrayList, ", ", "Alert{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m24newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, okio.i unknownFields) {
        super(f7980b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7981a = fVar;
    }
}