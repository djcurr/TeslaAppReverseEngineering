package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<g0> f37413b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagedChargingSite#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<w0> f37414a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g0> {
        a(com.squareup.wire.b bVar, n00.d<g0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetManagedChargingSitesResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g0(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(w0.f37678d.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            w0.f37678d.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + w0.f37678d.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g0 redact(g0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(mr.d.a(value.b(), w0.f37678d), okio.i.f42656d);
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
        f37413b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g0.class), com.squareup.wire.o.PROTO_3);
    }

    public g0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ g0(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final g0 a(List<w0> sites, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(sites, "sites");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g0(sites, unknownFields);
    }

    public final List<w0> b() {
        return this.f37414a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), g0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37414a, g0Var.f37414a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f37414a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m680newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f37414a.isEmpty()) {
            List<w0> list = this.f37414a;
            arrayList.add("sites=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "GetManagedChargingSitesResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m680newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List<w0> sites, okio.i unknownFields) {
        super(f37413b, unknownFields);
        kotlin.jvm.internal.s.g(sites, "sites");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37414a = mr.d.g("sites", sites);
    }
}