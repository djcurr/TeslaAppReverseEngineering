package st;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class d extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<d> f50636c;
    @q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarLimits#ADAPTER", jsonName = "solarLimits", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final st.a f50637a;
    @q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarNoChargeRecommended#ADAPTER", jsonName = "noChargeRecommended", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final c f50638b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ChargeOnSolarResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            st.a aVar = null;
            c cVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(aVar, cVar, reader.e(d11));
                } else if (g11 == 1) {
                    aVar = st.a.f50632b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    cVar = c.f50634b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            st.a.f50632b.encodeWithTag(writer, 1, value.c());
            c.f50634b.encodeWithTag(writer, 2, value.b());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            return value.unknownFields().z() + st.a.f50632b.encodedSizeWithTag(1, value.c()) + c.f50634b.encodedSizeWithTag(2, value.b());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            st.a c11 = value.c();
            st.a redact = c11 == null ? null : st.a.f50632b.redact(c11);
            c b11 = value.b();
            return value.a(redact, b11 != null ? c.f50634b.redact(b11) : null, okio.i.f42656d);
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
        f50636c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ d(st.a aVar, c cVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final d a(st.a aVar, c cVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new d(aVar, cVar, unknownFields);
    }

    public final c b() {
        return this.f50638b;
    }

    public final st.a c() {
        return this.f50637a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f50637a, dVar.f50637a) && s.c(this.f50638b, dVar.f50638b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            st.a aVar = this.f50637a;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            c cVar = this.f50638b;
            int hashCode3 = hashCode2 + (cVar != null ? cVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1101newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        st.a aVar = this.f50637a;
        if (aVar != null) {
            arrayList.add("solar_limits=" + aVar);
        }
        c cVar = this.f50638b;
        if (cVar != null) {
            arrayList.add("no_charge_recommended=" + cVar);
        }
        l02 = e0.l0(arrayList, ", ", "ChargeOnSolarResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1101newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(st.a aVar, c cVar, okio.i unknownFields) {
        super(f50636c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f50637a = aVar;
        this.f50638b = cVar;
        if (!(mr.d.c(aVar, cVar) <= 1)) {
            throw new IllegalArgumentException("At most one of solar_limits, no_charge_recommended may be non-null".toString());
        }
    }
}