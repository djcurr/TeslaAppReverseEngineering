package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class h1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<h1> f8033b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatus#ADAPTER", label = q.a.REPEATED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<g1> f8034a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h1> {
        a(com.squareup.wire.b bVar, n00.d<h1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyStatusInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h1(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(g1.f8016g.decode(reader));
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            g1.f8016g.asRepeated().encodeWithTag(writer, 1, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + g1.f8016g.asRepeated().encodedSizeWithTag(1, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h1 redact(h1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.a(mr.d.a(value.b(), g1.f8016g), okio.i.f42656d);
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
        f8033b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(h1.class), com.squareup.wire.o.PROTO_3);
    }

    public h1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ h1(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public final h1 a(List<g1> keyStatuses, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(keyStatuses, "keyStatuses");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h1(keyStatuses, unknownFields);
    }

    public final List<g1> b() {
        return this.f8034a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), h1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8034a, h1Var.f8034a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8034a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m35newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f8034a.isEmpty()) {
            List<g1> list = this.f8034a;
            arrayList.add("keyStatuses=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "KeyStatusInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m35newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(List<g1> keyStatuses, okio.i unknownFields) {
        super(f8033b, unknownFields);
        kotlin.jvm.internal.s.g(keyStatuses, "keyStatuses");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8034a = mr.d.g("keyStatuses", keyStatuses);
    }
}