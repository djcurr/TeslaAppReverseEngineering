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
public final class g extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<g> f50641c;
    @q(adapter = "com.tesla.generated.managedcharging.SessionConfigs#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f50642a;
    @q(adapter = "com.tesla.generated.managedcharging.ChargeOnSolarResponse#ADAPTER", jsonName = "chargeOnSolar", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final d f50643b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ManageVehicleChargingResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            i iVar = null;
            d dVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(iVar, dVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = i.f50647b.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    dVar = d.f50636c.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, g value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != null) {
                i.f50647b.encodeWithTag(writer, 1, value.c());
            }
            if (value.b() != null) {
                d.f50636c.encodeWithTag(writer, 2, value.b());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != null) {
                z11 += i.f50647b.encodedSizeWithTag(1, value.c());
            }
            return value.b() != null ? z11 + d.f50636c.encodedSizeWithTag(2, value.b()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            s.g(value, "value");
            i c11 = value.c();
            i redact = c11 == null ? null : i.f50647b.redact(c11);
            d b11 = value.b();
            return value.a(redact, b11 != null ? d.f50636c.redact(b11) : null, okio.i.f42656d);
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
        f50641c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), o.PROTO_3);
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ g(i iVar, d dVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : iVar, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? okio.i.f42656d : iVar2);
    }

    public final g a(i iVar, d dVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new g(iVar, dVar, unknownFields);
    }

    public final d b() {
        return this.f50643b;
    }

    public final i c() {
        return this.f50642a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(unknownFields(), gVar.unknownFields()) && s.c(this.f50642a, gVar.f50642a) && s.c(this.f50643b, gVar.f50643b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            i iVar = this.f50642a;
            int hashCode2 = (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 37;
            d dVar = this.f50643b;
            int hashCode3 = hashCode2 + (dVar != null ? dVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1103newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f50642a;
        if (iVar != null) {
            arrayList.add("configs=" + iVar);
        }
        d dVar = this.f50643b;
        if (dVar != null) {
            arrayList.add("charge_on_solar=" + dVar);
        }
        l02 = e0.l0(arrayList, ", ", "ManageVehicleChargingResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1103newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, d dVar, okio.i unknownFields) {
        super(f50641c, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f50642a = iVar;
        this.f50643b = dVar;
    }
}