package tt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class c extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<c> f52528d;
    @q(adapter = "com.tesla.generated.monitoring.EmptyAttributes#ADAPTER", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final d f52529a;
    @q(adapter = "com.tesla.generated.monitoring.TimeToInteractiveAttributes#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final j f52530b;
    @q(adapter = "com.tesla.generated.monitoring.AttributeList#ADAPTER", declaredName = "AttributeList", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final tt.b f52531c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, n00.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.AttributesPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public c decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            d dVar = null;
            j jVar = null;
            tt.b bVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new c(dVar, jVar, bVar, reader.e(d11));
                } else if (g11 == 1) {
                    dVar = d.f52532b.decode(reader);
                } else if (g11 == 2) {
                    jVar = j.f52546d.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    bVar = tt.b.f52524d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, c value) {
            s.g(writer, "writer");
            s.g(value, "value");
            d.f52532b.encodeWithTag(writer, 1, value.c());
            j.f52546d.encodeWithTag(writer, 2, value.d());
            tt.b.f52524d.encodeWithTag(writer, 3, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(c value) {
            s.g(value, "value");
            return value.unknownFields().z() + d.f52532b.encodedSizeWithTag(1, value.c()) + j.f52546d.encodedSizeWithTag(2, value.d()) + tt.b.f52524d.encodedSizeWithTag(3, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public c redact(c value) {
            s.g(value, "value");
            d c11 = value.c();
            d redact = c11 == null ? null : d.f52532b.redact(c11);
            j d11 = value.d();
            j redact2 = d11 == null ? null : j.f52546d.redact(d11);
            tt.b b11 = value.b();
            return value.a(redact, redact2, b11 != null ? tt.b.f52524d.redact(b11) : null, okio.i.f42656d);
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
        f52528d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), o.PROTO_3);
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ c(d dVar, j jVar, tt.b bVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dVar, (i11 & 2) != 0 ? null : jVar, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public final c a(d dVar, j jVar, tt.b bVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new c(dVar, jVar, bVar, unknownFields);
    }

    public final tt.b b() {
        return this.f52531c;
    }

    public final d c() {
        return this.f52529a;
    }

    public final j d() {
        return this.f52530b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return s.c(unknownFields(), cVar.unknownFields()) && s.c(this.f52529a, cVar.f52529a) && s.c(this.f52530b, cVar.f52530b) && s.c(this.f52531c, cVar.f52531c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            d dVar = this.f52529a;
            int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 37;
            j jVar = this.f52530b;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 37;
            tt.b bVar = this.f52531c;
            int hashCode4 = hashCode3 + (bVar != null ? bVar.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1108newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        d dVar = this.f52529a;
        if (dVar != null) {
            arrayList.add("noAttributes=" + dVar);
        }
        j jVar = this.f52530b;
        if (jVar != null) {
            arrayList.add("timeToInteractiveAttributes=" + jVar);
        }
        tt.b bVar = this.f52531c;
        if (bVar != null) {
            arrayList.add("monitoring_AttributeList=" + bVar);
        }
        l02 = e0.l0(arrayList, ", ", "AttributesPayload{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1108newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, j jVar, tt.b bVar, okio.i unknownFields) {
        super(f52528d, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f52529a = dVar;
        this.f52530b = jVar;
        this.f52531c = bVar;
        if (!(mr.d.d(dVar, jVar, bVar) <= 1)) {
            throw new IllegalArgumentException("At most one of noAttributes, timeToInteractiveAttributes, monitoring_AttributeList may be non-null".toString());
        }
    }
}