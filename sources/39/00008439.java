package lt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class p extends com.squareup.wire.f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoAdapter<p> f37548m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f37549a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37550b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final String f37551c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f37552d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "distanceMiles", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final float f37553e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final String f37554f;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final kt.f f37555g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final String f37556h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final String f37557i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final String f37558j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "streetAddress", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final String f37559k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "withinRange", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final boolean f37560l;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<p> {
        a(com.squareup.wire.b bVar, n00.d<p> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DestinationCharging", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public p decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            String str2 = "";
            String str3 = str2;
            long j11 = 0;
            float f11 = 0.0f;
            kt.f fVar = null;
            boolean z11 = false;
            String str4 = str3;
            String str5 = str4;
            String str6 = str5;
            String str7 = str6;
            String str8 = str7;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new p(j11, str, str4, str5, f11, str6, fVar, str7, str8, str2, str3, z11, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        j11 = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        str = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        str4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        str5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 6:
                        str6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        fVar = kt.f.f35777c.decode(reader);
                        break;
                    case 8:
                        str7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 9:
                        str8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 11:
                        str3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, p value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.h() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.h()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.e());
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, Float.valueOf(value.f()));
            }
            if (!kotlin.jvm.internal.s.c(value.g(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.g());
            }
            if (value.i() != null) {
                kt.f.f35777c.encodeWithTag(writer, 7, value.i());
            }
            if (!kotlin.jvm.internal.s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getName());
            }
            if (!kotlin.jvm.internal.s.c(value.j(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.j());
            }
            if (!kotlin.jvm.internal.s.c(value.k(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 10, value.k());
            }
            if (!kotlin.jvm.internal.s.c(value.l(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 11, value.l());
            }
            if (value.m()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, Boolean.valueOf(value.m()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.h() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.h()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.c());
            }
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(3, value.d());
            }
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.e());
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.f()));
            }
            if (!kotlin.jvm.internal.s.c(value.g(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(6, value.g());
            }
            if (value.i() != null) {
                z11 += kt.f.f35777c.encodedSizeWithTag(7, value.i());
            }
            if (!kotlin.jvm.internal.s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getName());
            }
            if (!kotlin.jvm.internal.s.c(value.j(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.j());
            }
            if (!kotlin.jvm.internal.s.c(value.k(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(10, value.k());
            }
            if (!kotlin.jvm.internal.s.c(value.l(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(11, value.l());
            }
            return value.m() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.m())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public p redact(p value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.f i11 = value.i();
            return p.b(value, 0L, null, null, null, BitmapDescriptorFactory.HUE_RED, null, i11 == null ? null : kt.f.f35777c.redact(i11), null, null, null, null, false, okio.i.f42656d, 4031, null);
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
        f37548m = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(p.class), com.squareup.wire.o.PROTO_3);
    }

    public p() {
        this(0L, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, false, null, 8191, null);
    }

    public /* synthetic */ p(long j11, String str, String str2, String str3, float f11, String str4, kt.f fVar, String str5, String str6, String str7, String str8, boolean z11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? null : fVar, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? "" : str6, (i11 & 512) != 0 ? "" : str7, (i11 & 1024) == 0 ? str8 : "", (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ p b(p pVar, long j11, String str, String str2, String str3, float f11, String str4, kt.f fVar, String str5, String str6, String str7, String str8, boolean z11, okio.i iVar, int i11, Object obj) {
        return pVar.a((i11 & 1) != 0 ? pVar.f37549a : j11, (i11 & 2) != 0 ? pVar.f37550b : str, (i11 & 4) != 0 ? pVar.f37551c : str2, (i11 & 8) != 0 ? pVar.f37552d : str3, (i11 & 16) != 0 ? pVar.f37553e : f11, (i11 & 32) != 0 ? pVar.f37554f : str4, (i11 & 64) != 0 ? pVar.f37555g : fVar, (i11 & 128) != 0 ? pVar.f37556h : str5, (i11 & 256) != 0 ? pVar.f37557i : str6, (i11 & 512) != 0 ? pVar.f37558j : str7, (i11 & 1024) != 0 ? pVar.f37559k : str8, (i11 & 2048) != 0 ? pVar.f37560l : z11, (i11 & 4096) != 0 ? pVar.unknownFields() : iVar);
    }

    public final p a(long j11, String amenities, String city, String country, float f11, String district, kt.f fVar, String name, String postal_code, String state, String street_address, boolean z11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(amenities, "amenities");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        kotlin.jvm.internal.s.g(district, "district");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(postal_code, "postal_code");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(street_address, "street_address");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new p(j11, amenities, city, country, f11, district, fVar, name, postal_code, state, street_address, z11, unknownFields);
    }

    public final String c() {
        return this.f37550b;
    }

    public final String d() {
        return this.f37551c;
    }

    public final String e() {
        return this.f37552d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), pVar.unknownFields()) && this.f37549a == pVar.f37549a && kotlin.jvm.internal.s.c(this.f37550b, pVar.f37550b) && kotlin.jvm.internal.s.c(this.f37551c, pVar.f37551c) && kotlin.jvm.internal.s.c(this.f37552d, pVar.f37552d)) {
                return ((this.f37553e > pVar.f37553e ? 1 : (this.f37553e == pVar.f37553e ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f37554f, pVar.f37554f) && kotlin.jvm.internal.s.c(this.f37555g, pVar.f37555g) && kotlin.jvm.internal.s.c(this.f37556h, pVar.f37556h) && kotlin.jvm.internal.s.c(this.f37557i, pVar.f37557i) && kotlin.jvm.internal.s.c(this.f37558j, pVar.f37558j) && kotlin.jvm.internal.s.c(this.f37559k, pVar.f37559k) && this.f37560l == pVar.f37560l;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f37553e;
    }

    public final String g() {
        return this.f37554f;
    }

    public final String getName() {
        return this.f37556h;
    }

    public final long h() {
        return this.f37549a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.f37549a)) * 37) + this.f37550b.hashCode()) * 37) + this.f37551c.hashCode()) * 37) + this.f37552d.hashCode()) * 37) + Float.hashCode(this.f37553e)) * 37) + this.f37554f.hashCode()) * 37;
            kt.f fVar = this.f37555g;
            int hashCode2 = ((((((((((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.f37556h.hashCode()) * 37) + this.f37557i.hashCode()) * 37) + this.f37558j.hashCode()) * 37) + this.f37559k.hashCode()) * 37) + Boolean.hashCode(this.f37560l);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final kt.f i() {
        return this.f37555g;
    }

    public final String j() {
        return this.f37557i;
    }

    public final String k() {
        return this.f37558j;
    }

    public final String l() {
        return this.f37559k;
    }

    public final boolean m() {
        return this.f37560l;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m715newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f37549a;
        arrayList.add("id=" + j11);
        String i11 = mr.d.i(this.f37550b);
        arrayList.add("amenities=" + i11);
        String i12 = mr.d.i(this.f37551c);
        arrayList.add("city=" + i12);
        String i13 = mr.d.i(this.f37552d);
        arrayList.add("country=" + i13);
        float f11 = this.f37553e;
        arrayList.add("distance_miles=" + f11);
        String i14 = mr.d.i(this.f37554f);
        arrayList.add("district=" + i14);
        kt.f fVar = this.f37555g;
        if (fVar != null) {
            arrayList.add("location=" + fVar);
        }
        String i15 = mr.d.i(this.f37556h);
        arrayList.add("name=" + i15);
        String i16 = mr.d.i(this.f37557i);
        arrayList.add("postal_code=" + i16);
        String i17 = mr.d.i(this.f37558j);
        arrayList.add("state=" + i17);
        String i18 = mr.d.i(this.f37559k);
        arrayList.add("street_address=" + i18);
        boolean z11 = this.f37560l;
        arrayList.add("within_range=" + z11);
        l02 = wz.e0.l0(arrayList, ", ", "DestinationCharging{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m715newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j11, String amenities, String city, String country, float f11, String district, kt.f fVar, String name, String postal_code, String state, String street_address, boolean z11, okio.i unknownFields) {
        super(f37548m, unknownFields);
        kotlin.jvm.internal.s.g(amenities, "amenities");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        kotlin.jvm.internal.s.g(district, "district");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(postal_code, "postal_code");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(street_address, "street_address");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37549a = j11;
        this.f37550b = amenities;
        this.f37551c = city;
        this.f37552d = country;
        this.f37553e = f11;
        this.f37554f = district;
        this.f37555g = fVar;
        this.f37556h = name;
        this.f37557i = postal_code;
        this.f37558j = state;
        this.f37559k = street_address;
        this.f37560l = z11;
    }
}