package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class k1 extends com.squareup.wire.f {

    /* renamed from: e  reason: collision with root package name */
    public static final ProtoAdapter<k1> f37500e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final Instant f37501a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "congestionSyncTimeUtcSecs", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b  reason: collision with root package name */
    private final long f37502b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.DestinationCharging#ADAPTER", jsonName = "destinationCharging", label = q.a.REPEATED, tag = 2)

    /* renamed from: c  reason: collision with root package name */
    private final List<p> f37503c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.Superchargers#ADAPTER", label = q.a.REPEATED, tag = 3)

    /* renamed from: d  reason: collision with root package name */
    private final List<f2> f37504d;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<k1> {
        a(com.squareup.wire.b bVar, n00.d<k1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NearbyChargingSites", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public k1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long d11 = reader.d();
            Instant instant = null;
            long j11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new k1(instant, arrayList, arrayList2, j11, reader.e(d11));
                } else if (g11 == 1) {
                    instant = ProtoAdapter.INSTANT.decode(reader);
                } else if (g11 == 2) {
                    arrayList.add(p.f37548m.decode(reader));
                } else if (g11 == 3) {
                    arrayList2.add(f2.f37389y.decode(reader));
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, k1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.f() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.f());
            }
            p.f37548m.asRepeated().encodeWithTag(writer, 2, value.d());
            f2.f37389y.asRepeated().encodeWithTag(writer, 3, value.e());
            if (value.c() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 4, Long.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(k1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.f());
            }
            int encodedSizeWithTag = z11 + p.f37548m.asRepeated().encodedSizeWithTag(2, value.d()) + f2.f37389y.asRepeated().encodedSizeWithTag(3, value.e());
            return value.c() != 0 ? encodedSizeWithTag + ProtoAdapter.INT64.encodedSizeWithTag(4, Long.valueOf(value.c())) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public k1 redact(k1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            Instant f11 = value.f();
            return k1.b(value, f11 == null ? null : ProtoAdapter.INSTANT.redact(f11), mr.d.a(value.d(), p.f37548m), mr.d.a(value.e(), f2.f37389y), 0L, okio.i.f42656d, 8, null);
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
        f37500e = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(k1.class), com.squareup.wire.o.PROTO_3);
    }

    public k1() {
        this(null, null, null, 0L, null, 31, null);
    }

    public /* synthetic */ k1(Instant instant, List list, List list2, long j11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? wz.w.i() : list, (i11 & 4) != 0 ? wz.w.i() : list2, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ k1 b(k1 k1Var, Instant instant, List list, List list2, long j11, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = k1Var.f37501a;
        }
        List<p> list3 = list;
        if ((i11 & 2) != 0) {
            list3 = k1Var.f37503c;
        }
        List list4 = list3;
        List<f2> list5 = list2;
        if ((i11 & 4) != 0) {
            list5 = k1Var.f37504d;
        }
        List list6 = list5;
        if ((i11 & 8) != 0) {
            j11 = k1Var.f37502b;
        }
        long j12 = j11;
        if ((i11 & 16) != 0) {
            iVar = k1Var.unknownFields();
        }
        return k1Var.a(instant, list4, list6, j12, iVar);
    }

    public final k1 a(Instant instant, List<p> destination_charging, List<f2> superchargers, long j11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(destination_charging, "destination_charging");
        kotlin.jvm.internal.s.g(superchargers, "superchargers");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new k1(instant, destination_charging, superchargers, j11, unknownFields);
    }

    public final long c() {
        return this.f37502b;
    }

    public final List<p> d() {
        return this.f37503c;
    }

    public final List<f2> e() {
        return this.f37504d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), k1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37501a, k1Var.f37501a) && kotlin.jvm.internal.s.c(this.f37503c, k1Var.f37503c) && kotlin.jvm.internal.s.c(this.f37504d, k1Var.f37504d) && this.f37502b == k1Var.f37502b;
        }
        return false;
    }

    public final Instant f() {
        return this.f37501a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Instant instant = this.f37501a;
            int hashCode2 = ((((((hashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.f37503c.hashCode()) * 37) + this.f37504d.hashCode()) * 37) + Long.hashCode(this.f37502b);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m698newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        Instant instant = this.f37501a;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        if (!this.f37503c.isEmpty()) {
            List<p> list = this.f37503c;
            arrayList.add("destination_charging=" + list);
        }
        if (!this.f37504d.isEmpty()) {
            List<f2> list2 = this.f37504d;
            arrayList.add("superchargers=" + list2);
        }
        long j11 = this.f37502b;
        arrayList.add("congestion_sync_time_utc_secs=" + j11);
        l02 = wz.e0.l0(arrayList, ", ", "NearbyChargingSites{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m698newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Instant instant, List<p> destination_charging, List<f2> superchargers, long j11, okio.i unknownFields) {
        super(f37500e, unknownFields);
        kotlin.jvm.internal.s.g(destination_charging, "destination_charging");
        kotlin.jvm.internal.s.g(superchargers, "superchargers");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37501a = instant;
        this.f37502b = j11;
        this.f37503c = mr.d.g("destination_charging", destination_charging);
        this.f37504d = mr.d.g("superchargers", superchargers);
    }
}