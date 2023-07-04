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
public final class o extends com.squareup.wire.f {
    public static final ProtoAdapter<o> A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "latitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final float f39203a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "longitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final float f39204b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "headingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final int f39205c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "gpsAsOfOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d */
    private final long f39206d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nativeLocationSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e */
    private final boolean f39207e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLatitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f */
    private final float f39208f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLongitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g */
    private final float f39209g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLatitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: h */
    private final float f39210h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLongitudeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: i */
    private final float f39211i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkNearbyOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: j */
    private final boolean f39212j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LocationState$GPSCoordinateType#ADAPTER", jsonName = "nativeType", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: k */
    private final c f39213k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: l */
    private final Instant f39214l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 101)

    /* renamed from: m */
    private final Float f39215m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 102)

    /* renamed from: n */
    private final Float f39216n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 103)

    /* renamed from: o */
    private final Integer f39217o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "gpsAsOf", tag = 104)

    /* renamed from: p */
    private final Long f39218p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nativeLocationSupported", tag = 105)

    /* renamed from: q */
    private final Boolean f39219q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLatitude", tag = 106)

    /* renamed from: t */
    private final Float f39220t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLongitude", tag = 107)

    /* renamed from: w */
    private final Float f39221w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLatitude", tag = 109)

    /* renamed from: x */
    private final Float f39222x;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLongitude", tag = 110)

    /* renamed from: y */
    private final Float f39223y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkNearby", tag = 112)

    /* renamed from: z */
    private final Boolean f39224z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o> {
        a(com.squareup.wire.b bVar, n00.d<o> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LocationState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            c cVar = null;
            int i11 = 0;
            boolean z11 = false;
            boolean z12 = false;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            Instant instant = null;
            Float f17 = null;
            Long l11 = null;
            Boolean bool = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Float f22 = null;
            Boolean bool2 = null;
            long j11 = 0;
            Float f23 = null;
            Integer num = null;
            while (true) {
                int g11 = reader.g();
                int i12 = i11;
                if (g11 == -1) {
                    return new o(f11, f12, i12, j11, z11, f13, f14, f15, f16, z12, cVar, instant, f17, f23, num, l11, bool, f18, f19, f21, f22, bool2, reader.e(d11));
                }
                if (g11 == 109) {
                    f21 = ProtoAdapter.FLOAT.decode(reader);
                } else if (g11 == 110) {
                    f22 = ProtoAdapter.FLOAT.decode(reader);
                } else if (g11 != 112) {
                    switch (g11) {
                        case 1:
                            f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 2:
                            f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 3:
                            i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                            continue;
                        case 4:
                            j11 = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 5:
                            z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            f13 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 7:
                            f14 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 8:
                            cVar = c.f39225c.decode(reader);
                            break;
                        case 9:
                            f15 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 10:
                            f16 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 11:
                            instant = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 12:
                            z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            switch (g11) {
                                case 101:
                                    f17 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 102:
                                    f23 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 103:
                                    num = ProtoAdapter.UINT32.decode(reader);
                                    break;
                                case 104:
                                    l11 = ProtoAdapter.UINT64.decode(reader);
                                    break;
                                case 105:
                                    bool = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 106:
                                    f18 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 107:
                                    f19 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                default:
                                    reader.m(g11);
                                    break;
                            }
                    }
                } else {
                    bool2 = ProtoAdapter.BOOL.decode(reader);
                }
                i11 = i12;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.n() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.n()));
            }
            if (!(value.p() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.p()));
            }
            if (value.j() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.j()));
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.h()));
            }
            if (value.t()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.t()));
            }
            if (!(value.r() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.r()));
            }
            if (!(value.v() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.v()));
            }
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 9, Float.valueOf(value.d()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 10, Float.valueOf(value.f()));
            }
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, Boolean.valueOf(value.l()));
            }
            if (value.w() != null) {
                c.f39225c.encodeWithTag(writer, 8, value.w());
            }
            if (value.x() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 11, value.x());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 101, value.m());
            protoAdapter.encodeWithTag(writer, 102, value.o());
            ProtoAdapter.UINT32.encodeWithTag(writer, 103, value.i());
            ProtoAdapter.UINT64.encodeWithTag(writer, 104, value.g());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 105, value.s());
            protoAdapter.encodeWithTag(writer, 106, value.q());
            protoAdapter.encodeWithTag(writer, 107, value.u());
            protoAdapter.encodeWithTag(writer, 109, value.c());
            protoAdapter.encodeWithTag(writer, 110, value.e());
            protoAdapter2.encodeWithTag(writer, 112, value.k());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.n() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.n()));
            }
            if (!(value.p() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.p()));
            }
            if (value.j() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.j()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.h()));
            }
            if (value.t()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.t()));
            }
            if (!(value.r() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.r()));
            }
            if (!(value.v() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.v()));
            }
            if (!(value.d() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(9, Float.valueOf(value.d()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(10, Float.valueOf(value.f()));
            }
            if (value.l()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.l()));
            }
            if (value.w() != null) {
                z11 += c.f39225c.encodedSizeWithTag(8, value.w());
            }
            if (value.x() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.x());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(101, value.m()) + protoAdapter.encodedSizeWithTag(102, value.o()) + ProtoAdapter.UINT32.encodedSizeWithTag(103, value.i()) + ProtoAdapter.UINT64.encodedSizeWithTag(104, value.g());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(105, value.s()) + protoAdapter.encodedSizeWithTag(106, value.q()) + protoAdapter.encodedSizeWithTag(107, value.u()) + protoAdapter.encodedSizeWithTag(109, value.c()) + protoAdapter.encodedSizeWithTag(110, value.e()) + protoAdapter2.encodedSizeWithTag(112, value.k());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o redact(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            c w11 = value.w();
            c redact = w11 == null ? null : c.f39225c.redact(w11);
            Instant x11 = value.x();
            return o.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, redact, x11 == null ? null : ProtoAdapter.INSTANT.redact(x11), null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, 4191231, null);
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

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<c> f39225c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39226a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39227b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.LocationState.GPSCoordinateType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 != 2) {
                        reader.m(g11);
                    } else {
                        uVar2 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u b11 = value.b();
                kt.u redact = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                return value.a(redact, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39225c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39226a;
        }

        public final kt.u c() {
            return this.f39227b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39226a, cVar.f39226a) && kotlin.jvm.internal.s.c(this.f39227b, cVar.f39227b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39226a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39227b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m792newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39226a;
            if (uVar != null) {
                arrayList.add("GCJ=" + uVar);
            }
            kt.u uVar2 = this.f39227b;
            if (uVar2 != null) {
                arrayList.add("WGS=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "GPSCoordinateType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m792newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39225c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39226a = uVar;
            this.f39227b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of GCJ, WGS may be non-null".toString());
            }
        }
    }

    static {
        new b(null);
        A = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(o.class), com.squareup.wire.o.PROTO_3);
    }

    public o() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ o(float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f11, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? 0.0f : f13, (i12 & 64) != 0 ? 0.0f : f14, (i12 & 128) != 0 ? 0.0f : f15, (i12 & 256) == 0 ? f16 : BitmapDescriptorFactory.HUE_RED, (i12 & 512) == 0 ? z12 : false, (i12 & 1024) != 0 ? null : cVar, (i12 & 2048) != 0 ? null : instant, (i12 & 4096) != 0 ? null : f17, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : f18, (i12 & 16384) != 0 ? null : num, (i12 & 32768) != 0 ? null : l11, (i12 & 65536) != 0 ? null : bool, (i12 & 131072) != 0 ? null : f19, (i12 & 262144) != 0 ? null : f21, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f22, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : f23, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool2, (i12 & 4194304) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ o b(o oVar, float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, okio.i iVar, int i12, Object obj) {
        return oVar.a((i12 & 1) != 0 ? oVar.f39203a : f11, (i12 & 2) != 0 ? oVar.f39204b : f12, (i12 & 4) != 0 ? oVar.f39205c : i11, (i12 & 8) != 0 ? oVar.f39206d : j11, (i12 & 16) != 0 ? oVar.f39207e : z11, (i12 & 32) != 0 ? oVar.f39208f : f13, (i12 & 64) != 0 ? oVar.f39209g : f14, (i12 & 128) != 0 ? oVar.f39210h : f15, (i12 & 256) != 0 ? oVar.f39211i : f16, (i12 & 512) != 0 ? oVar.f39212j : z12, (i12 & 1024) != 0 ? oVar.f39213k : cVar, (i12 & 2048) != 0 ? oVar.f39214l : instant, (i12 & 4096) != 0 ? oVar.f39215m : f17, (i12 & PKIFailureInfo.certRevoked) != 0 ? oVar.f39216n : f18, (i12 & 16384) != 0 ? oVar.f39217o : num, (i12 & 32768) != 0 ? oVar.f39218p : l11, (i12 & 65536) != 0 ? oVar.f39219q : bool, (i12 & 131072) != 0 ? oVar.f39220t : f19, (i12 & 262144) != 0 ? oVar.f39221w : f21, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? oVar.f39222x : f22, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? oVar.f39223y : f23, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? oVar.f39224z : bool2, (i12 & 4194304) != 0 ? oVar.unknownFields() : iVar);
    }

    public final o a(float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o(f11, f12, i11, j11, z11, f13, f14, f15, f16, z12, cVar, instant, f17, f18, num, l11, bool, f19, f21, f22, f23, bool2, unknownFields);
    }

    public final Float c() {
        return this.f39222x;
    }

    public final float d() {
        return this.f39210h;
    }

    public final Float e() {
        return this.f39223y;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), oVar.unknownFields())) {
                if (this.f39203a == oVar.f39203a) {
                    if ((this.f39204b == oVar.f39204b) && this.f39205c == oVar.f39205c && this.f39206d == oVar.f39206d && this.f39207e == oVar.f39207e) {
                        if (this.f39208f == oVar.f39208f) {
                            if (this.f39209g == oVar.f39209g) {
                                if (this.f39210h == oVar.f39210h) {
                                    return ((this.f39211i > oVar.f39211i ? 1 : (this.f39211i == oVar.f39211i ? 0 : -1)) == 0) && this.f39212j == oVar.f39212j && kotlin.jvm.internal.s.c(this.f39213k, oVar.f39213k) && kotlin.jvm.internal.s.c(this.f39214l, oVar.f39214l) && kotlin.jvm.internal.s.b(this.f39215m, oVar.f39215m) && kotlin.jvm.internal.s.b(this.f39216n, oVar.f39216n) && kotlin.jvm.internal.s.c(this.f39217o, oVar.f39217o) && kotlin.jvm.internal.s.c(this.f39218p, oVar.f39218p) && kotlin.jvm.internal.s.c(this.f39219q, oVar.f39219q) && kotlin.jvm.internal.s.b(this.f39220t, oVar.f39220t) && kotlin.jvm.internal.s.b(this.f39221w, oVar.f39221w) && kotlin.jvm.internal.s.b(this.f39222x, oVar.f39222x) && kotlin.jvm.internal.s.b(this.f39223y, oVar.f39223y) && kotlin.jvm.internal.s.c(this.f39224z, oVar.f39224z);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f39211i;
    }

    public final Long g() {
        return this.f39218p;
    }

    public final long h() {
        return this.f39206d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((unknownFields().hashCode() * 37) + Float.hashCode(this.f39203a)) * 37) + Float.hashCode(this.f39204b)) * 37) + Integer.hashCode(this.f39205c)) * 37) + Long.hashCode(this.f39206d)) * 37) + Boolean.hashCode(this.f39207e)) * 37) + Float.hashCode(this.f39208f)) * 37) + Float.hashCode(this.f39209g)) * 37) + Float.hashCode(this.f39210h)) * 37) + Float.hashCode(this.f39211i)) * 37) + Boolean.hashCode(this.f39212j)) * 37;
            c cVar = this.f39213k;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
            Instant instant = this.f39214l;
            int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
            Float f11 = this.f39215m;
            int hashCode4 = (hashCode3 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f39216n;
            int hashCode5 = (hashCode4 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Integer num = this.f39217o;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 37;
            Long l11 = this.f39218p;
            int hashCode7 = (hashCode6 + (l11 != null ? l11.hashCode() : 0)) * 37;
            Boolean bool = this.f39219q;
            int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
            Float f13 = this.f39220t;
            int hashCode9 = (hashCode8 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.f39221w;
            int hashCode10 = (hashCode9 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Float f15 = this.f39222x;
            int hashCode11 = (hashCode10 + (f15 != null ? f15.hashCode() : 0)) * 37;
            Float f16 = this.f39223y;
            int hashCode12 = (hashCode11 + (f16 != null ? f16.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39224z;
            int hashCode13 = hashCode12 + (bool2 != null ? bool2.hashCode() : 0);
            this.hashCode = hashCode13;
            return hashCode13;
        }
        return i11;
    }

    public final Integer i() {
        return this.f39217o;
    }

    public final int j() {
        return this.f39205c;
    }

    public final Boolean k() {
        return this.f39224z;
    }

    public final boolean l() {
        return this.f39212j;
    }

    public final Float m() {
        return this.f39215m;
    }

    public final float n() {
        return this.f39203a;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m791newBuilder();
    }

    public final Float o() {
        return this.f39216n;
    }

    public final float p() {
        return this.f39204b;
    }

    public final Float q() {
        return this.f39220t;
    }

    public final float r() {
        return this.f39208f;
    }

    public final Boolean s() {
        return this.f39219q;
    }

    public final boolean t() {
        return this.f39207e;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        float f11 = this.f39203a;
        arrayList.add("latitude_OBSOLETE=" + f11);
        float f12 = this.f39204b;
        arrayList.add("longitude_OBSOLETE=" + f12);
        int i11 = this.f39205c;
        arrayList.add("heading_OBSOLETE=" + i11);
        long j11 = this.f39206d;
        arrayList.add("gps_as_of_OBSOLETE=" + j11);
        boolean z11 = this.f39207e;
        arrayList.add("native_location_supported_OBSOLETE=" + z11);
        float f13 = this.f39208f;
        arrayList.add("native_latitude_OBSOLETE=" + f13);
        float f14 = this.f39209g;
        arrayList.add("native_longitude_OBSOLETE=" + f14);
        float f15 = this.f39210h;
        arrayList.add("corrected_latitude_OBSOLETE=" + f15);
        float f16 = this.f39211i;
        arrayList.add("corrected_longitude_OBSOLETE=" + f16);
        boolean z12 = this.f39212j;
        arrayList.add("homelink_nearby_OBSOLETE=" + z12);
        c cVar = this.f39213k;
        if (cVar != null) {
            arrayList.add("native_type=" + cVar);
        }
        Instant instant = this.f39214l;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Float f17 = this.f39215m;
        if (f17 != null) {
            arrayList.add("latitude=" + f17);
        }
        Float f18 = this.f39216n;
        if (f18 != null) {
            arrayList.add("longitude=" + f18);
        }
        Integer num = this.f39217o;
        if (num != null) {
            arrayList.add("heading=" + num);
        }
        Long l11 = this.f39218p;
        if (l11 != null) {
            arrayList.add("gps_as_of=" + l11);
        }
        Boolean bool = this.f39219q;
        if (bool != null) {
            arrayList.add("native_location_supported=" + bool);
        }
        Float f19 = this.f39220t;
        if (f19 != null) {
            arrayList.add("native_latitude=" + f19);
        }
        Float f21 = this.f39221w;
        if (f21 != null) {
            arrayList.add("native_longitude=" + f21);
        }
        Float f22 = this.f39222x;
        if (f22 != null) {
            arrayList.add("corrected_latitude=" + f22);
        }
        Float f23 = this.f39223y;
        if (f23 != null) {
            arrayList.add("corrected_longitude=" + f23);
        }
        Boolean bool2 = this.f39224z;
        if (bool2 != null) {
            arrayList.add("homelink_nearby=" + bool2);
        }
        l02 = e0.l0(arrayList, ", ", "LocationState{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final Float u() {
        return this.f39221w;
    }

    public final float v() {
        return this.f39209g;
    }

    public final c w() {
        return this.f39213k;
    }

    public final Instant x() {
        return this.f39214l;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m791newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, okio.i unknownFields) {
        super(A, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39203a = f11;
        this.f39204b = f12;
        this.f39205c = i11;
        this.f39206d = j11;
        this.f39207e = z11;
        this.f39208f = f13;
        this.f39209g = f14;
        this.f39210h = f15;
        this.f39211i = f16;
        this.f39212j = z12;
        this.f39213k = cVar;
        this.f39214l = instant;
        this.f39215m = f17;
        this.f39216n = f18;
        this.f39217o = num;
        this.f39218p = l11;
        this.f39219q = bool;
        this.f39220t = f19;
        this.f39221w = f21;
        this.f39222x = f22;
        this.f39223y = f23;
        this.f39224z = bool2;
    }
}