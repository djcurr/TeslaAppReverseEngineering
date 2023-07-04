package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p1 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<p1> f8176b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.PACKED, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f8177a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p1> {
        a(com.squareup.wire.b bVar, n00.d<p1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.MISessionStopped", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p1(arrayList, reader.e(d11));
                }
                if (g11 == 1) {
                    arrayList.add(ProtoAdapter.UINT32.decode(reader));
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
            ProtoAdapter.UINT32.asPacked().encodeWithTag(writer, 1, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.unknownFields().z() + ProtoAdapter.UINT32.asPacked().encodedSizeWithTag(1, value.c());
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
        f8176b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p1.class), com.squareup.wire.o.PROTO_3);
    }

    public p1() {
        this(null, null, 3, null);
    }

    public /* synthetic */ p1(List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? wz.w.i() : list, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p1 b(p1 p1Var, List list, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = p1Var.f8177a;
        }
        if ((i11 & 2) != 0) {
            iVar = p1Var.unknownFields();
        }
        return p1Var.a(list, iVar);
    }

    public final p1 a(List<Integer> sessionId, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p1(sessionId, unknownFields);
    }

    public final List<Integer> c() {
        return this.f8177a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            p1 p1Var = (p1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), p1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8177a, p1Var.f8177a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f8177a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m63newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.f8177a.isEmpty()) {
            List<Integer> list = this.f8177a;
            arrayList.add("sessionId=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "MISessionStopped{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m63newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(List<Integer> sessionId, okio.i unknownFields) {
        super(f8176b, unknownFields);
        kotlin.jvm.internal.s.g(sessionId, "sessionId");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8177a = mr.d.g("sessionId", sessionId);
    }
}