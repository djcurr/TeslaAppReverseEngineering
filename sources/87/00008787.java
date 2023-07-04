package mt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;

/* loaded from: classes6.dex */
public final class m extends com.squareup.wire.f {

    /* renamed from: w */
    public static final ProtoAdapter<m> f39158w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "speedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a */
    private final int f39159a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "powerOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b */
    private final int f39160b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "odometerInHundredthsOfAMileOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: c */
    private final int f39161c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "speedFloatOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: d */
    private final float f39162d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ShiftState#ADAPTER", jsonName = "shiftState", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: e */
    private final kt.o f39163e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: f */
    private final Instant f39164f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastTrafficUpdate", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: g */
    private final Instant f39165g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", jsonName = "activeRouteCoordinates", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: h */
    private final kt.f f39166h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 102)

    /* renamed from: i */
    private final Integer f39167i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 103)

    /* renamed from: j */
    private final Integer f39168j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "odometerInHundredthsOfAMile", tag = 105)

    /* renamed from: k */
    private final Integer f39169k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "speedFloat", tag = 106)

    /* renamed from: l */
    private final Float f39170l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activeRouteDestination", tag = 7)

    /* renamed from: m */
    private final String f39171m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteMinutesToArrival", tag = 8)

    /* renamed from: n */
    private final Float f39172n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteMilesToArrival", tag = 9)

    /* renamed from: o */
    private final Float f39173o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteTrafficMinutesDelay", tag = 10)

    /* renamed from: p */
    private final Float f39174p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteEnergyAtArrival", tag = 11)

    /* renamed from: q */
    private final Float f39175q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "lastRouteUpdate", tag = 14)

    /* renamed from: t */
    private final Integer f39176t;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m> {
        a(com.squareup.wire.b bVar, n00.d<m> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DriveState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            kt.o oVar = null;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            Instant instant = null;
            kt.f fVar = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Float f11 = null;
            String str = null;
            Float f12 = null;
            Float f13 = null;
            Float f14 = null;
            Float f15 = null;
            Integer num4 = null;
            float f16 = 0.0f;
            Instant instant2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m(i11, i12, i13, f16, oVar, instant, instant2, fVar, num, num2, num3, f11, str, f12, f13, f14, f15, num4, reader.e(d11));
                } else if (g11 == 14) {
                    num4 = ProtoAdapter.UINT32.decode(reader);
                } else if (g11 == 15) {
                    instant2 = ProtoAdapter.INSTANT.decode(reader);
                } else if (g11 == 102) {
                    num = ProtoAdapter.UINT32.decode(reader);
                } else if (g11 == 103) {
                    num2 = ProtoAdapter.INT32.decode(reader);
                } else if (g11 == 105) {
                    num3 = ProtoAdapter.INT32.decode(reader);
                } else if (g11 != 106) {
                    switch (g11) {
                        case 1:
                            oVar = kt.o.f35820g.decode(reader);
                            continue;
                        case 2:
                            i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                            continue;
                        case 3:
                            i12 = ProtoAdapter.INT32.decode(reader).intValue();
                            continue;
                        case 4:
                            instant = ProtoAdapter.INSTANT.decode(reader);
                            continue;
                        case 5:
                            i13 = ProtoAdapter.INT32.decode(reader).intValue();
                            continue;
                        case 6:
                            f16 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            continue;
                        case 7:
                            str = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            f12 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 9:
                            f13 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 10:
                            f14 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 11:
                            f15 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 12:
                            fVar = kt.f.f35777c.decode(reader);
                            continue;
                        default:
                            reader.m(g11);
                            continue;
                    }
                } else {
                    f11 = ProtoAdapter.FLOAT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, m value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.q() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.q()));
            }
            if (value.n() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.n()));
            }
            if (value.l() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.l()));
            }
            if (!(value.s() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.s()));
            }
            if (value.o() != null) {
                kt.o.f35820g.encodeWithTag(writer, 1, value.o());
            }
            if (value.t() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.t());
            }
            if (value.j() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 15, value.j());
            }
            if (value.c() != null) {
                kt.f.f35777c.encodeWithTag(writer, 12, value.c());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(writer, 102, value.p());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 103, value.m());
            protoAdapter2.encodeWithTag(writer, 105, value.k());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            protoAdapter3.encodeWithTag(writer, 106, value.r());
            ProtoAdapter.STRING.encodeWithTag(writer, 7, value.d());
            protoAdapter3.encodeWithTag(writer, 8, value.g());
            protoAdapter3.encodeWithTag(writer, 9, value.f());
            protoAdapter3.encodeWithTag(writer, 10, value.h());
            protoAdapter3.encodeWithTag(writer, 11, value.e());
            protoAdapter.encodeWithTag(writer, 14, value.i());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.q() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.q()));
            }
            if (value.n() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.n()));
            }
            if (value.l() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.l()));
            }
            if (!(value.s() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.s()));
            }
            if (value.o() != null) {
                z11 += kt.o.f35820g.encodedSizeWithTag(1, value.o());
            }
            if (value.t() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.t());
            }
            if (value.j() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.j());
            }
            if (value.c() != null) {
                z11 += kt.f.f35777c.encodedSizeWithTag(12, value.c());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(102, value.p());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(103, value.m()) + protoAdapter2.encodedSizeWithTag(105, value.k());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            return encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(106, value.r()) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.d()) + protoAdapter3.encodedSizeWithTag(8, value.g()) + protoAdapter3.encodedSizeWithTag(9, value.f()) + protoAdapter3.encodedSizeWithTag(10, value.h()) + protoAdapter3.encodedSizeWithTag(11, value.e()) + protoAdapter.encodedSizeWithTag(14, value.i());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m redact(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.o o11 = value.o();
            kt.o redact = o11 == null ? null : kt.o.f35820g.redact(o11);
            Instant t11 = value.t();
            Instant redact2 = t11 == null ? null : ProtoAdapter.INSTANT.redact(t11);
            Instant j11 = value.j();
            Instant redact3 = j11 == null ? null : ProtoAdapter.INSTANT.redact(j11);
            kt.f c11 = value.c();
            return m.b(value, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, redact, redact2, redact3, c11 == null ? null : kt.f.f35777c.redact(c11), null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, 261903, null);
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
        f39158w = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(m.class), com.squareup.wire.o.PROTO_3);
    }

    public m() {
        this(0, 0, 0, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public /* synthetic */ m(int i11, int i12, int i13, float f11, kt.o oVar, Instant instant, Instant instant2, kt.f fVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, okio.i iVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) == 0 ? i13 : 0, (i14 & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i14 & 16) != 0 ? null : oVar, (i14 & 32) != 0 ? null : instant, (i14 & 64) != 0 ? null : instant2, (i14 & 128) != 0 ? null : fVar, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : num2, (i14 & 1024) != 0 ? null : num3, (i14 & 2048) != 0 ? null : f12, (i14 & 4096) != 0 ? null : str, (i14 & PKIFailureInfo.certRevoked) != 0 ? null : f13, (i14 & 16384) != 0 ? null : f14, (i14 & 32768) != 0 ? null : f15, (i14 & 65536) != 0 ? null : f16, (i14 & 131072) != 0 ? null : num4, (i14 & 262144) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ m b(m mVar, int i11, int i12, int i13, float f11, kt.o oVar, Instant instant, Instant instant2, kt.f fVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, okio.i iVar, int i14, Object obj) {
        return mVar.a((i14 & 1) != 0 ? mVar.f39159a : i11, (i14 & 2) != 0 ? mVar.f39160b : i12, (i14 & 4) != 0 ? mVar.f39161c : i13, (i14 & 8) != 0 ? mVar.f39162d : f11, (i14 & 16) != 0 ? mVar.f39163e : oVar, (i14 & 32) != 0 ? mVar.f39164f : instant, (i14 & 64) != 0 ? mVar.f39165g : instant2, (i14 & 128) != 0 ? mVar.f39166h : fVar, (i14 & 256) != 0 ? mVar.f39167i : num, (i14 & 512) != 0 ? mVar.f39168j : num2, (i14 & 1024) != 0 ? mVar.f39169k : num3, (i14 & 2048) != 0 ? mVar.f39170l : f12, (i14 & 4096) != 0 ? mVar.f39171m : str, (i14 & PKIFailureInfo.certRevoked) != 0 ? mVar.f39172n : f13, (i14 & 16384) != 0 ? mVar.f39173o : f14, (i14 & 32768) != 0 ? mVar.f39174p : f15, (i14 & 65536) != 0 ? mVar.f39175q : f16, (i14 & 131072) != 0 ? mVar.f39176t : num4, (i14 & 262144) != 0 ? mVar.unknownFields() : iVar);
    }

    public final m a(int i11, int i12, int i13, float f11, kt.o oVar, Instant instant, Instant instant2, kt.f fVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m(i11, i12, i13, f11, oVar, instant, instant2, fVar, num, num2, num3, f12, str, f13, f14, f15, f16, num4, unknownFields);
    }

    public final kt.f c() {
        return this.f39166h;
    }

    public final String d() {
        return this.f39171m;
    }

    public final Float e() {
        return this.f39175q;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), mVar.unknownFields()) && this.f39159a == mVar.f39159a && this.f39160b == mVar.f39160b && this.f39161c == mVar.f39161c) {
                return ((this.f39162d > mVar.f39162d ? 1 : (this.f39162d == mVar.f39162d ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f39163e, mVar.f39163e) && kotlin.jvm.internal.s.c(this.f39164f, mVar.f39164f) && kotlin.jvm.internal.s.c(this.f39165g, mVar.f39165g) && kotlin.jvm.internal.s.c(this.f39166h, mVar.f39166h) && kotlin.jvm.internal.s.c(this.f39167i, mVar.f39167i) && kotlin.jvm.internal.s.c(this.f39168j, mVar.f39168j) && kotlin.jvm.internal.s.c(this.f39169k, mVar.f39169k) && kotlin.jvm.internal.s.b(this.f39170l, mVar.f39170l) && kotlin.jvm.internal.s.c(this.f39171m, mVar.f39171m) && kotlin.jvm.internal.s.b(this.f39172n, mVar.f39172n) && kotlin.jvm.internal.s.b(this.f39173o, mVar.f39173o) && kotlin.jvm.internal.s.b(this.f39174p, mVar.f39174p) && kotlin.jvm.internal.s.b(this.f39175q, mVar.f39175q) && kotlin.jvm.internal.s.c(this.f39176t, mVar.f39176t);
            }
            return false;
        }
        return false;
    }

    public final Float f() {
        return this.f39173o;
    }

    public final Float g() {
        return this.f39172n;
    }

    public final Float h() {
        return this.f39174p;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f39159a)) * 37) + Integer.hashCode(this.f39160b)) * 37) + Integer.hashCode(this.f39161c)) * 37) + Float.hashCode(this.f39162d)) * 37;
            kt.o oVar = this.f39163e;
            int hashCode2 = (hashCode + (oVar != null ? oVar.hashCode() : 0)) * 37;
            Instant instant = this.f39164f;
            int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.f39165g;
            int hashCode4 = (hashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
            kt.f fVar = this.f39166h;
            int hashCode5 = (hashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            Integer num = this.f39167i;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f39168j;
            int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Integer num3 = this.f39169k;
            int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37;
            Float f11 = this.f39170l;
            int hashCode9 = (hashCode8 + (f11 != null ? f11.hashCode() : 0)) * 37;
            String str = this.f39171m;
            int hashCode10 = (hashCode9 + (str != null ? str.hashCode() : 0)) * 37;
            Float f12 = this.f39172n;
            int hashCode11 = (hashCode10 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.f39173o;
            int hashCode12 = (hashCode11 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.f39174p;
            int hashCode13 = (hashCode12 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Float f15 = this.f39175q;
            int hashCode14 = (hashCode13 + (f15 != null ? f15.hashCode() : 0)) * 37;
            Integer num4 = this.f39176t;
            int hashCode15 = hashCode14 + (num4 != null ? num4.hashCode() : 0);
            this.hashCode = hashCode15;
            return hashCode15;
        }
        return i11;
    }

    public final Integer i() {
        return this.f39176t;
    }

    public final Instant j() {
        return this.f39165g;
    }

    public final Integer k() {
        return this.f39169k;
    }

    public final int l() {
        return this.f39161c;
    }

    public final Integer m() {
        return this.f39168j;
    }

    public final int n() {
        return this.f39160b;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m785newBuilder();
    }

    public final kt.o o() {
        return this.f39163e;
    }

    public final Integer p() {
        return this.f39167i;
    }

    public final int q() {
        return this.f39159a;
    }

    public final Float r() {
        return this.f39170l;
    }

    public final float s() {
        return this.f39162d;
    }

    public final Instant t() {
        return this.f39164f;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f39159a;
        arrayList.add("speed_OBSOLETE=" + i11);
        int i12 = this.f39160b;
        arrayList.add("power_OBSOLETE=" + i12);
        int i13 = this.f39161c;
        arrayList.add("odometer_in_hundredths_of_a_mile_OBSOLETE=" + i13);
        float f11 = this.f39162d;
        arrayList.add("speed_float_OBSOLETE=" + f11);
        kt.o oVar = this.f39163e;
        if (oVar != null) {
            arrayList.add("shift_state=" + oVar);
        }
        Instant instant = this.f39164f;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Instant instant2 = this.f39165g;
        if (instant2 != null) {
            arrayList.add("last_traffic_update=" + instant2);
        }
        kt.f fVar = this.f39166h;
        if (fVar != null) {
            arrayList.add("active_route_coordinates=" + fVar);
        }
        Integer num = this.f39167i;
        if (num != null) {
            arrayList.add("speed=" + num);
        }
        Integer num2 = this.f39168j;
        if (num2 != null) {
            arrayList.add("power=" + num2);
        }
        Integer num3 = this.f39169k;
        if (num3 != null) {
            arrayList.add("odometer_in_hundredths_of_a_mile=" + num3);
        }
        Float f12 = this.f39170l;
        if (f12 != null) {
            arrayList.add("speed_float=" + f12);
        }
        String str = this.f39171m;
        if (str != null) {
            String i14 = mr.d.i(str);
            arrayList.add("active_route_destination=" + i14);
        }
        Float f13 = this.f39172n;
        if (f13 != null) {
            arrayList.add("active_route_minutes_to_arrival=" + f13);
        }
        Float f14 = this.f39173o;
        if (f14 != null) {
            arrayList.add("active_route_miles_to_arrival=" + f14);
        }
        Float f15 = this.f39174p;
        if (f15 != null) {
            arrayList.add("active_route_traffic_minutes_delay=" + f15);
        }
        Float f16 = this.f39175q;
        if (f16 != null) {
            arrayList.add("active_route_energy_at_arrival=" + f16);
        }
        Integer num4 = this.f39176t;
        if (num4 != null) {
            arrayList.add("last_route_update=" + num4);
        }
        l02 = e0.l0(arrayList, ", ", "DriveState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m785newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i11, int i12, int i13, float f11, kt.o oVar, Instant instant, Instant instant2, kt.f fVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, okio.i unknownFields) {
        super(f39158w, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39159a = i11;
        this.f39160b = i12;
        this.f39161c = i13;
        this.f39162d = f11;
        this.f39163e = oVar;
        this.f39164f = instant;
        this.f39165g = instant2;
        this.f39166h = fVar;
        this.f39167i = num;
        this.f39168j = num2;
        this.f39169k = num3;
        this.f39170l = f12;
        this.f39171m = str;
        this.f39172n = f13;
        this.f39173o = f14;
        this.f39174p = f15;
        this.f39175q = f16;
        this.f39176t = num4;
    }
}