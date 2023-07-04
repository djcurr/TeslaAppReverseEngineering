package lt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class f2 extends com.squareup.wire.f {

    /* renamed from: y  reason: collision with root package name */
    public static final ProtoAdapter<f2> f37389y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final long f37390a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final String f37391b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "availableStalls", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f37392c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billingInfo", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final String f37393d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billingTime", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final String f37394e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final String f37395f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final String f37396g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "distanceMiles", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final float f37397h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final String f37398i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final kt.f f37399j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k  reason: collision with root package name */
    private final String f37400k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l  reason: collision with root package name */
    private final String f37401l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "siteClosed", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: m  reason: collision with root package name */
    private final boolean f37402m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: n  reason: collision with root package name */
    private final String f37403n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "streetAddress", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: o  reason: collision with root package name */
    private final String f37404o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalStalls", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: p  reason: collision with root package name */
    private final int f37405p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "withinRange", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: q  reason: collision with root package name */
    private final boolean f37406q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxPowerKw", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: t  reason: collision with root package name */
    private final int f37407t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "outOfOrderStallsNumber", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: w  reason: collision with root package name */
    private final int f37408w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "outOfOrderStallsNames", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: x  reason: collision with root package name */
    private final String f37409x;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f2> {
        a(com.squareup.wire.b bVar, n00.d<f2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Superchargers", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            boolean z12 = false;
            int i13 = 0;
            int i14 = 0;
            String str2 = "";
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            String str6 = str5;
            String str7 = str6;
            long j11 = 0;
            float f11 = 0.0f;
            kt.f fVar = null;
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            String str11 = str10;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f2(j11, str, i11, str2, str8, str9, str10, f11, str11, fVar, str3, str4, z11, str5, str6, i12, z12, i13, i14, str7, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        j11 = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        str = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        i11 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        str2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        str8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 6:
                        str9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        str10 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 9:
                        str11 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        fVar = kt.f.f35777c.decode(reader);
                        break;
                    case 11:
                        str3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        str4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 13:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 14:
                        str5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 15:
                        str6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 16:
                        i12 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 17:
                        z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 18:
                        i13 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 19:
                        i14 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 20:
                        str7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.k() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.k()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.d()));
            }
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.f(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.f());
            }
            if (!kotlin.jvm.internal.s.c(value.g(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.g());
            }
            if (!kotlin.jvm.internal.s.c(value.h(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.h());
            }
            if (!(value.i() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 8, Float.valueOf(value.i()));
            }
            if (!kotlin.jvm.internal.s.c(value.j(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.j());
            }
            if (value.l() != null) {
                kt.f.f35777c.encodeWithTag(writer, 10, value.l());
            }
            if (!kotlin.jvm.internal.s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 11, value.getName());
            }
            if (!kotlin.jvm.internal.s.c(value.p(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 12, value.p());
            }
            if (value.q()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.q()));
            }
            if (!kotlin.jvm.internal.s.c(value.r(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 14, value.r());
            }
            if (!kotlin.jvm.internal.s.c(value.s(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 15, value.s());
            }
            if (value.t() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.t()));
            }
            if (value.u()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.u()));
            }
            if (value.m() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 18, Integer.valueOf(value.m()));
            }
            if (value.o() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.o()));
            }
            if (!kotlin.jvm.internal.s.c(value.n(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 20, value.n());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.k() != 0) {
                z11 += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.k()));
            }
            if (!kotlin.jvm.internal.s.c(value.c(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.c());
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.d()));
            }
            if (!kotlin.jvm.internal.s.c(value.e(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(4, value.e());
            }
            if (!kotlin.jvm.internal.s.c(value.f(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(5, value.f());
            }
            if (!kotlin.jvm.internal.s.c(value.g(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(6, value.g());
            }
            if (!kotlin.jvm.internal.s.c(value.h(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(7, value.h());
            }
            if (!(value.i() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.i()));
            }
            if (!kotlin.jvm.internal.s.c(value.j(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.j());
            }
            if (value.l() != null) {
                z11 += kt.f.f35777c.encodedSizeWithTag(10, value.l());
            }
            if (!kotlin.jvm.internal.s.c(value.getName(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getName());
            }
            if (!kotlin.jvm.internal.s.c(value.p(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(12, value.p());
            }
            if (value.q()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.q()));
            }
            if (!kotlin.jvm.internal.s.c(value.r(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(14, value.r());
            }
            if (!kotlin.jvm.internal.s.c(value.s(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(15, value.s());
            }
            if (value.t() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.t()));
            }
            if (value.u()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.u()));
            }
            if (value.m() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.m()));
            }
            if (value.o() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.o()));
            }
            return !kotlin.jvm.internal.s.c(value.n(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(20, value.n()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f2 redact(f2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.f l11 = value.l();
            return f2.b(value, 0L, null, 0, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, l11 == null ? null : kt.f.f35777c.redact(l11), null, null, false, null, null, 0, false, 0, 0, null, okio.i.f42656d, 1048063, null);
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
        f37389y = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f2.class), com.squareup.wire.o.PROTO_3);
    }

    public f2() {
        this(0L, null, 0, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, false, null, null, 0, false, 0, 0, null, null, 2097151, null);
    }

    public /* synthetic */ f2(long j11, String str, int i11, String str2, String str3, String str4, String str5, float f11, String str6, kt.f fVar, String str7, String str8, boolean z11, String str9, String str10, int i12, boolean z12, int i13, int i14, String str11, okio.i iVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0L : j11, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? "" : str4, (i15 & 64) != 0 ? "" : str5, (i15 & 128) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i15 & 256) != 0 ? "" : str6, (i15 & 512) != 0 ? null : fVar, (i15 & 1024) != 0 ? "" : str7, (i15 & 2048) != 0 ? "" : str8, (i15 & 4096) != 0 ? false : z11, (i15 & PKIFailureInfo.certRevoked) != 0 ? "" : str9, (i15 & 16384) != 0 ? "" : str10, (i15 & 32768) != 0 ? 0 : i12, (i15 & 65536) != 0 ? false : z12, (i15 & 131072) != 0 ? 0 : i13, (i15 & 262144) != 0 ? 0 : i14, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? "" : str11, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f2 b(f2 f2Var, long j11, String str, int i11, String str2, String str3, String str4, String str5, float f11, String str6, kt.f fVar, String str7, String str8, boolean z11, String str9, String str10, int i12, boolean z12, int i13, int i14, String str11, okio.i iVar, int i15, Object obj) {
        return f2Var.a((i15 & 1) != 0 ? f2Var.f37390a : j11, (i15 & 2) != 0 ? f2Var.f37391b : str, (i15 & 4) != 0 ? f2Var.f37392c : i11, (i15 & 8) != 0 ? f2Var.f37393d : str2, (i15 & 16) != 0 ? f2Var.f37394e : str3, (i15 & 32) != 0 ? f2Var.f37395f : str4, (i15 & 64) != 0 ? f2Var.f37396g : str5, (i15 & 128) != 0 ? f2Var.f37397h : f11, (i15 & 256) != 0 ? f2Var.f37398i : str6, (i15 & 512) != 0 ? f2Var.f37399j : fVar, (i15 & 1024) != 0 ? f2Var.f37400k : str7, (i15 & 2048) != 0 ? f2Var.f37401l : str8, (i15 & 4096) != 0 ? f2Var.f37402m : z11, (i15 & PKIFailureInfo.certRevoked) != 0 ? f2Var.f37403n : str9, (i15 & 16384) != 0 ? f2Var.f37404o : str10, (i15 & 32768) != 0 ? f2Var.f37405p : i12, (i15 & 65536) != 0 ? f2Var.f37406q : z12, (i15 & 131072) != 0 ? f2Var.f37407t : i13, (i15 & 262144) != 0 ? f2Var.f37408w : i14, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? f2Var.f37409x : str11, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? f2Var.unknownFields() : iVar);
    }

    public final f2 a(long j11, String amenities, int i11, String billing_info, String billing_time, String city, String country, float f11, String district, kt.f fVar, String name, String postal_code, boolean z11, String state, String street_address, int i12, boolean z12, int i13, int i14, String out_of_order_stalls_names, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(amenities, "amenities");
        kotlin.jvm.internal.s.g(billing_info, "billing_info");
        kotlin.jvm.internal.s.g(billing_time, "billing_time");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        kotlin.jvm.internal.s.g(district, "district");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(postal_code, "postal_code");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(street_address, "street_address");
        kotlin.jvm.internal.s.g(out_of_order_stalls_names, "out_of_order_stalls_names");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f2(j11, amenities, i11, billing_info, billing_time, city, country, f11, district, fVar, name, postal_code, z11, state, street_address, i12, z12, i13, i14, out_of_order_stalls_names, unknownFields);
    }

    public final String c() {
        return this.f37391b;
    }

    public final int d() {
        return this.f37392c;
    }

    public final String e() {
        return this.f37393d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            f2 f2Var = (f2) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), f2Var.unknownFields()) && this.f37390a == f2Var.f37390a && kotlin.jvm.internal.s.c(this.f37391b, f2Var.f37391b) && this.f37392c == f2Var.f37392c && kotlin.jvm.internal.s.c(this.f37393d, f2Var.f37393d) && kotlin.jvm.internal.s.c(this.f37394e, f2Var.f37394e) && kotlin.jvm.internal.s.c(this.f37395f, f2Var.f37395f) && kotlin.jvm.internal.s.c(this.f37396g, f2Var.f37396g)) {
                return ((this.f37397h > f2Var.f37397h ? 1 : (this.f37397h == f2Var.f37397h ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f37398i, f2Var.f37398i) && kotlin.jvm.internal.s.c(this.f37399j, f2Var.f37399j) && kotlin.jvm.internal.s.c(this.f37400k, f2Var.f37400k) && kotlin.jvm.internal.s.c(this.f37401l, f2Var.f37401l) && this.f37402m == f2Var.f37402m && kotlin.jvm.internal.s.c(this.f37403n, f2Var.f37403n) && kotlin.jvm.internal.s.c(this.f37404o, f2Var.f37404o) && this.f37405p == f2Var.f37405p && this.f37406q == f2Var.f37406q && this.f37407t == f2Var.f37407t && this.f37408w == f2Var.f37408w && kotlin.jvm.internal.s.c(this.f37409x, f2Var.f37409x);
            }
            return false;
        }
        return false;
    }

    public final String f() {
        return this.f37394e;
    }

    public final String g() {
        return this.f37395f;
    }

    public final String getName() {
        return this.f37400k;
    }

    public final String h() {
        return this.f37396g;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.f37390a)) * 37) + this.f37391b.hashCode()) * 37) + Integer.hashCode(this.f37392c)) * 37) + this.f37393d.hashCode()) * 37) + this.f37394e.hashCode()) * 37) + this.f37395f.hashCode()) * 37) + this.f37396g.hashCode()) * 37) + Float.hashCode(this.f37397h)) * 37) + this.f37398i.hashCode()) * 37;
            kt.f fVar = this.f37399j;
            int hashCode2 = ((((((((((((((((((((hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.f37400k.hashCode()) * 37) + this.f37401l.hashCode()) * 37) + Boolean.hashCode(this.f37402m)) * 37) + this.f37403n.hashCode()) * 37) + this.f37404o.hashCode()) * 37) + Integer.hashCode(this.f37405p)) * 37) + Boolean.hashCode(this.f37406q)) * 37) + Integer.hashCode(this.f37407t)) * 37) + Integer.hashCode(this.f37408w)) * 37) + this.f37409x.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    public final float i() {
        return this.f37397h;
    }

    public final String j() {
        return this.f37398i;
    }

    public final long k() {
        return this.f37390a;
    }

    public final kt.f l() {
        return this.f37399j;
    }

    public final int m() {
        return this.f37407t;
    }

    public final String n() {
        return this.f37409x;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m678newBuilder();
    }

    public final int o() {
        return this.f37408w;
    }

    public final String p() {
        return this.f37401l;
    }

    public final boolean q() {
        return this.f37402m;
    }

    public final String r() {
        return this.f37403n;
    }

    public final String s() {
        return this.f37404o;
    }

    public final int t() {
        return this.f37405p;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        long j11 = this.f37390a;
        arrayList.add("id=" + j11);
        String i11 = mr.d.i(this.f37391b);
        arrayList.add("amenities=" + i11);
        int i12 = this.f37392c;
        arrayList.add("available_stalls=" + i12);
        String i13 = mr.d.i(this.f37393d);
        arrayList.add("billing_info=" + i13);
        String i14 = mr.d.i(this.f37394e);
        arrayList.add("billing_time=" + i14);
        String i15 = mr.d.i(this.f37395f);
        arrayList.add("city=" + i15);
        String i16 = mr.d.i(this.f37396g);
        arrayList.add("country=" + i16);
        float f11 = this.f37397h;
        arrayList.add("distance_miles=" + f11);
        String i17 = mr.d.i(this.f37398i);
        arrayList.add("district=" + i17);
        kt.f fVar = this.f37399j;
        if (fVar != null) {
            arrayList.add("location=" + fVar);
        }
        String i18 = mr.d.i(this.f37400k);
        arrayList.add("name=" + i18);
        String i19 = mr.d.i(this.f37401l);
        arrayList.add("postal_code=" + i19);
        boolean z11 = this.f37402m;
        arrayList.add("site_closed=" + z11);
        String i21 = mr.d.i(this.f37403n);
        arrayList.add("state=" + i21);
        String i22 = mr.d.i(this.f37404o);
        arrayList.add("street_address=" + i22);
        int i23 = this.f37405p;
        arrayList.add("total_stalls=" + i23);
        boolean z12 = this.f37406q;
        arrayList.add("within_range=" + z12);
        int i24 = this.f37407t;
        arrayList.add("max_power_kw=" + i24);
        int i25 = this.f37408w;
        arrayList.add("out_of_order_stalls_number=" + i25);
        String i26 = mr.d.i(this.f37409x);
        arrayList.add("out_of_order_stalls_names=" + i26);
        l02 = wz.e0.l0(arrayList, ", ", "Superchargers{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final boolean u() {
        return this.f37406q;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m678newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j11, String amenities, int i11, String billing_info, String billing_time, String city, String country, float f11, String district, kt.f fVar, String name, String postal_code, boolean z11, String state, String street_address, int i12, boolean z12, int i13, int i14, String out_of_order_stalls_names, okio.i unknownFields) {
        super(f37389y, unknownFields);
        kotlin.jvm.internal.s.g(amenities, "amenities");
        kotlin.jvm.internal.s.g(billing_info, "billing_info");
        kotlin.jvm.internal.s.g(billing_time, "billing_time");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        kotlin.jvm.internal.s.g(district, "district");
        kotlin.jvm.internal.s.g(name, "name");
        kotlin.jvm.internal.s.g(postal_code, "postal_code");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(street_address, "street_address");
        kotlin.jvm.internal.s.g(out_of_order_stalls_names, "out_of_order_stalls_names");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37390a = j11;
        this.f37391b = amenities;
        this.f37392c = i11;
        this.f37393d = billing_info;
        this.f37394e = billing_time;
        this.f37395f = city;
        this.f37396g = country;
        this.f37397h = f11;
        this.f37398i = district;
        this.f37399j = fVar;
        this.f37400k = name;
        this.f37401l = postal_code;
        this.f37402m = z11;
        this.f37403n = state;
        this.f37404o = street_address;
        this.f37405p = i12;
        this.f37406q = z12;
        this.f37407t = i13;
        this.f37408w = i14;
        this.f37409x = out_of_order_stalls_names;
    }
}