package kt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class h extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<h> f35780c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "allWeek", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final u f35781a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final u f35782b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, n00.d<h> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.OffPeakChargingTimes", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            u uVar = null;
            u uVar2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h(uVar, uVar2, reader.e(d11));
                } else if (g11 == 1) {
                    uVar = u.f35845a.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    uVar2 = u.f35845a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, h value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            ProtoAdapter<u> protoAdapter = u.f35845a;
            protoAdapter.encodeWithTag(writer, 1, value.b());
            protoAdapter.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            ProtoAdapter<u> protoAdapter = u.f35845a;
            return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h redact(h value) {
            kotlin.jvm.internal.s.g(value, "value");
            u b11 = value.b();
            u redact = b11 == null ? null : u.f35845a.redact(b11);
            u c11 = value.c();
            return value.a(redact, c11 != null ? u.f35845a.redact(c11) : null, okio.i.f42656d);
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
        f35780c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(h.class), com.squareup.wire.o.PROTO_3);
    }

    public h() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ h(u uVar, u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final h a(u uVar, u uVar2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new h(uVar, uVar2, unknownFields);
    }

    public final u b() {
        return this.f35781a;
    }

    public final u c() {
        return this.f35782b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), hVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f35781a, hVar.f35781a) && kotlin.jvm.internal.s.c(this.f35782b, hVar.f35782b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            u uVar = this.f35781a;
            int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
            u uVar2 = this.f35782b;
            int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m636newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        u uVar = this.f35781a;
        if (uVar != null) {
            arrayList.add("all_week=" + uVar);
        }
        u uVar2 = this.f35782b;
        if (uVar2 != null) {
            arrayList.add("weekdays=" + uVar2);
        }
        l02 = e0.l0(arrayList, ", ", "OffPeakChargingTimes{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m636newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, u uVar2, okio.i unknownFields) {
        super(f35780c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f35781a = uVar;
        this.f35782b = uVar2;
        if (!(mr.d.c(uVar, uVar2) <= 1)) {
            throw new IllegalArgumentException("At most one of all_week, weekdays may be non-null".toString());
        }
    }
}