package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class p extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<p> f39228e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarState#ADAPTER", jsonName = "chargeOnSolarState", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final mt.a f39229a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chargeOnSolarGatewayDin", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f39230b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "teslaElectricAssetId", tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f39231c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minutesToLowerLimit", tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final Integer f39232d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, n00.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ManagedChargingState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            mt.a aVar = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p(aVar, str, str2, num, reader.e(d11));
                } else if (g11 == 1) {
                    aVar = mt.a.f38948i.decode(reader);
                } else if (g11 == 2) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 == 3) {
                    str2 = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    num = ProtoAdapter.INT32.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d() != null) {
                mt.a.f38948i.encodeWithTag(writer, 1, value.d());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(writer, 2, value.c());
            protoAdapter.encodeWithTag(writer, 3, value.f());
            ProtoAdapter.INT32.encodeWithTag(writer, 4, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d() != null) {
                z11 += mt.a.f38948i.encodedSizeWithTag(1, value.d());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return z11 + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.f()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p redact(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            mt.a d11 = value.d();
            return p.b(value, d11 == null ? null : mt.a.f38948i.redact(d11), null, null, null, okio.i.f42656d, 14, null);
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
        f39228e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(p.class), com.squareup.wire.o.PROTO_3);
    }

    public p() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ p(mt.a aVar, String str, String str2, Integer num, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : aVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) == 0 ? num : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ p b(p pVar, mt.a aVar, String str, String str2, Integer num, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = pVar.f39229a;
        }
        if ((i11 & 2) != 0) {
            str = pVar.f39230b;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = pVar.f39231c;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            num = pVar.f39232d;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            iVar = pVar.unknownFields();
        }
        return pVar.a(aVar, str3, str4, num2, iVar);
    }

    public final p a(mt.a aVar, String str, String str2, Integer num, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p(aVar, str, str2, num, unknownFields);
    }

    public final String c() {
        return this.f39230b;
    }

    public final mt.a d() {
        return this.f39229a;
    }

    public final Integer e() {
        return this.f39232d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), pVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39229a, pVar.f39229a) && kotlin.jvm.internal.s.c(this.f39230b, pVar.f39230b) && kotlin.jvm.internal.s.c(this.f39231c, pVar.f39231c) && kotlin.jvm.internal.s.c(this.f39232d, pVar.f39232d);
        }
        return false;
    }

    public final String f() {
        return this.f39231c;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            mt.a aVar = this.f39229a;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
            String str = this.f39230b;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.f39231c;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Integer num = this.f39232d;
            int hashCode5 = hashCode4 + (num != null ? num.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m793newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        mt.a aVar = this.f39229a;
        if (aVar != null) {
            arrayList.add("charge_on_solar_state=" + aVar);
        }
        String str = this.f39230b;
        if (str != null) {
            String i11 = mr.d.i(str);
            arrayList.add("charge_on_solar_gateway_din=" + i11);
        }
        String str2 = this.f39231c;
        if (str2 != null) {
            String i12 = mr.d.i(str2);
            arrayList.add("tesla_electric_asset_id=" + i12);
        }
        Integer num = this.f39232d;
        if (num != null) {
            arrayList.add("minutes_to_lower_limit=" + num);
        }
        l02 = e0.l0(arrayList, ", ", "ManagedChargingState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m793newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mt.a aVar, String str, String str2, Integer num, okio.i unknownFields) {
        super(f39228e, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39229a = aVar;
        this.f39230b = str;
        this.f39231c = str2;
        this.f39232d = num;
    }
}