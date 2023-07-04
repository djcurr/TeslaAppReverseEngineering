package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class y0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<y0> f37719b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.SiteController#ADAPTER", jsonName = "siteController", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final c2 f37720a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<y0> {
        a(com.squareup.wire.b bVar, n00.d<y0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ManagerType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public y0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            c2 c2Var = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new y0(c2Var, reader.e(d11));
                } else if (g11 == 1) {
                    c2Var = c2.f37356b.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, y0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            c2.f37356b.encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(y0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + c2.f37356b.encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public y0 redact(y0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            c2 b11 = value.b();
            return value.a(b11 == null ? null : c2.f37356b.redact(b11), okio.i.f42656d);
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
        f37719b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(y0.class), com.squareup.wire.o.PROTO_3);
    }

    public y0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ y0(c2 c2Var, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c2Var, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final y0 a(c2 c2Var, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new y0(c2Var, unknownFields);
    }

    public final c2 b() {
        return this.f37720a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), y0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37720a, y0Var.f37720a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            c2 c2Var = this.f37720a;
            int hashCode2 = hashCode + (c2Var != null ? c2Var.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m755newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        c2 c2Var = this.f37720a;
        if (c2Var != null) {
            arrayList.add("site_controller=" + c2Var);
        }
        l02 = wz.e0.l0(arrayList, ", ", "ManagerType{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m755newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c2 c2Var, okio.i unknownFields) {
        super(f37719b, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37720a = c2Var;
    }
}