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
public final class h extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<h> f50644c;
    @q(adapter = "com.tesla.generated.managedcharging.ErrorResponse#ADAPTER", jsonName = "errorResponse", tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final f f50645a;
    @q(adapter = "com.tesla.generated.managedcharging.ManageVehicleChargingResponse#ADAPTER", jsonName = "manageVehicleChargingResponse", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final g f50646b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<h> {
        a(com.squareup.wire.b bVar, n00.d<h> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ManagedChargingAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public h decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            f fVar = null;
            g gVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new h(fVar, gVar, reader.e(d11));
                } else if (g11 == 1) {
                    fVar = f.f50639b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    gVar = g.f50641c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, h value) {
            s.g(writer, "writer");
            s.g(value, "value");
            f.f50639b.encodeWithTag(writer, 1, value.b());
            g.f50641c.encodeWithTag(writer, 2, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(h value) {
            s.g(value, "value");
            return value.unknownFields().z() + f.f50639b.encodedSizeWithTag(1, value.b()) + g.f50641c.encodedSizeWithTag(2, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public h redact(h value) {
            s.g(value, "value");
            f b11 = value.b();
            f redact = b11 == null ? null : f.f50639b.redact(b11);
            g c11 = value.c();
            return value.a(redact, c11 != null ? g.f50641c.redact(c11) : null, okio.i.f42656d);
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
        f50644c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(h.class), o.PROTO_3);
    }

    public h() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ h(f fVar, g gVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fVar, (i11 & 2) != 0 ? null : gVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public final h a(f fVar, g gVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new h(fVar, gVar, unknownFields);
    }

    public final f b() {
        return this.f50645a;
    }

    public final g c() {
        return this.f50646b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return s.c(unknownFields(), hVar.unknownFields()) && s.c(this.f50645a, hVar.f50645a) && s.c(this.f50646b, hVar.f50646b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            f fVar = this.f50645a;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37;
            g gVar = this.f50646b;
            int hashCode3 = hashCode2 + (gVar != null ? gVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1104newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        f fVar = this.f50645a;
        if (fVar != null) {
            arrayList.add("error_response=" + fVar);
        }
        g gVar = this.f50646b;
        if (gVar != null) {
            arrayList.add("manage_vehicle_charging_response=" + gVar);
        }
        l02 = e0.l0(arrayList, ", ", "ManagedChargingAction{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1104newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, g gVar, okio.i unknownFields) {
        super(f50644c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f50645a = fVar;
        this.f50646b = gVar;
        if (!(mr.d.c(fVar, gVar) <= 1)) {
            throw new IllegalArgumentException("At most one of error_response, manage_vehicle_charging_response may be non-null".toString());
        }
    }
}