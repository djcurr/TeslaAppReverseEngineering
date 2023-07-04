package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;

/* loaded from: classes6.dex */
public final class l extends com.squareup.wire.f {

    /* renamed from: p1 */
    public static final ProtoAdapter<l> f39108p1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverFront", tag = 101)
    private final Boolean A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverRear", tag = 102)
    private final Boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerFront", tag = 103)
    private final Boolean C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerRear", tag = 104)
    private final Boolean E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkFront", tag = 105)
    private final Boolean F;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkRear", tag = 106)
    private final Boolean G;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverFront", tag = 107)
    private final Boolean H;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerFront", tag = 108)
    private final Boolean K;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverRear", tag = 109)
    private final Boolean L;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerRear", tag = 110)
    private final Boolean O;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sunRoofPercentOpen", tag = 112)
    private final Integer P;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 113)
    private final Boolean Q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUserPresent", tag = 114)
    private final Boolean R;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStart", tag = 116)
    private final Boolean T;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetMode", tag = 117)
    private final Boolean Y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverFrontOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final boolean f39109a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenDriverRearOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final boolean f39110b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetPinNeeded", tag = 118)

    /* renamed from: b1 */
    private final Boolean f39111b1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerFrontOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final boolean f39112c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenPassengerRearOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d */
    private final boolean f39113d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkFrontOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e */
    private final boolean f39114e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "doorOpenTrunkRearOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f */
    private final boolean f39115f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverFrontOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g */
    private final boolean f39116g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeAvailable", tag = 120)

    /* renamed from: g1 */
    private final Boolean f39117g1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerFrontOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h */
    private final boolean f39118h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenDriverRearOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i */
    private final boolean f39119i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "windowOpenPassengerRearOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j */
    private final boolean f39120j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "sunRoofPercentOpenOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: k */
    private final int f39121k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "lockedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: l */
    private final boolean f39122l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isUserPresentOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: m */
    private final boolean f39123m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: n */
    private final boolean f39124n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: o */
    private final boolean f39125o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "valetPinNeededOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: p */
    private final boolean f39126p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeAvailableOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: q */
    private final boolean f39127q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$SunRoofState#ADAPTER", jsonName = "sunRoofState", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: t */
    private final e f39128t;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$DisplayState#ADAPTER", jsonName = "centerDisplayState", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: w */
    private final c f39129w;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState$SentryModeState#ADAPTER", jsonName = "sentryModeState", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: x */
    private final d f39130x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SpeedLimitMode#ADAPTER", jsonName = "speedLimitMode", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: y */
    private final t f39131y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 2000)

    /* renamed from: z */
    private final Instant f39132z;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<l> {
        a(com.squareup.wire.b bVar, n00.d<l> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public l decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            e eVar = null;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            int i11 = 0;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            c cVar = null;
            d dVar = null;
            t tVar = null;
            Instant instant = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Integer num = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            while (true) {
                int g11 = reader.g();
                boolean z28 = z11;
                if (g11 == -1) {
                    return new l(z28, z12, z13, z14, z15, z16, z17, z18, z19, z21, i11, z22, z23, z24, z25, z26, z27, eVar, cVar, dVar, tVar, instant, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, num, bool11, bool12, bool13, bool14, bool15, bool16, reader.e(d11));
                }
                if (g11 == 22) {
                    tVar = t.f39271k.decode(reader);
                } else if (g11 == 120) {
                    bool16 = ProtoAdapter.BOOL.decode(reader);
                } else if (g11 != 2000) {
                    switch (g11) {
                        case 1:
                            z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            continue;
                        case 2:
                            z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 3:
                            z13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 4:
                            z14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 5:
                            z15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            z16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 7:
                            z17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 8:
                            z18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 9:
                            z19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 10:
                            z21 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 11:
                            eVar = e.f39151g.decode(reader);
                            break;
                        case 12:
                            i11 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 13:
                            z22 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 14:
                            z23 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 15:
                            cVar = c.f39133k.decode(reader);
                            break;
                        case 16:
                            z24 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 17:
                            z25 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 18:
                            z26 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 19:
                            dVar = d.f39144g.decode(reader);
                            break;
                        case 20:
                            z27 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            switch (g11) {
                                case 101:
                                    bool = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 102:
                                    bool2 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 103:
                                    bool3 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 104:
                                    bool4 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 105:
                                    bool5 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 106:
                                    bool6 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 107:
                                    bool7 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 108:
                                    bool8 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 109:
                                    bool9 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 110:
                                    bool10 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                default:
                                    switch (g11) {
                                        case 112:
                                            num = ProtoAdapter.INT32.decode(reader);
                                            break;
                                        case 113:
                                            bool11 = ProtoAdapter.BOOL.decode(reader);
                                            break;
                                        case 114:
                                            bool12 = ProtoAdapter.BOOL.decode(reader);
                                            break;
                                        default:
                                            switch (g11) {
                                                case 116:
                                                    bool13 = ProtoAdapter.BOOL.decode(reader);
                                                    break;
                                                case 117:
                                                    bool14 = ProtoAdapter.BOOL.decode(reader);
                                                    break;
                                                case 118:
                                                    bool15 = ProtoAdapter.BOOL.decode(reader);
                                                    break;
                                                default:
                                                    reader.m(g11);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    instant = ProtoAdapter.INSTANT.decode(reader);
                }
                z11 = z28;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, l value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.e()));
            }
            if (value.g()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.g()));
            }
            if (value.i()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.i()));
            }
            if (value.k()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.k()));
            }
            if (value.m()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.m()));
            }
            if (value.o()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.o()));
            }
            if (value.G()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.G()));
            }
            if (value.K()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.K()));
            }
            if (value.I()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.I()));
            }
            if (value.M()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.M()));
            }
            if (value.y() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.y()));
            }
            if (value.q()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.q()));
            }
            if (value.O()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.O()));
            }
            if (value.s()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, Boolean.valueOf(value.s()));
            }
            if (value.C()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.C()));
            }
            if (value.E()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 18, Boolean.valueOf(value.E()));
            }
            if (value.u()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.u()));
            }
            if (value.z() != null) {
                e.f39151g.encodeWithTag(writer, 11, value.z());
            }
            if (value.c() != null) {
                c.f39133k.encodeWithTag(writer, 15, value.c());
            }
            if (value.v() != null) {
                d.f39144g.encodeWithTag(writer, 19, value.v());
            }
            if (value.w() != null) {
                t.f39271k.encodeWithTag(writer, 22, value.w());
            }
            if (value.A() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2000, value.A());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 101, value.d());
            protoAdapter.encodeWithTag(writer, 102, value.f());
            protoAdapter.encodeWithTag(writer, 103, value.h());
            protoAdapter.encodeWithTag(writer, 104, value.j());
            protoAdapter.encodeWithTag(writer, 105, value.l());
            protoAdapter.encodeWithTag(writer, 106, value.n());
            protoAdapter.encodeWithTag(writer, 107, value.F());
            protoAdapter.encodeWithTag(writer, 108, value.J());
            protoAdapter.encodeWithTag(writer, 109, value.H());
            protoAdapter.encodeWithTag(writer, 110, value.L());
            ProtoAdapter.INT32.encodeWithTag(writer, 112, value.x());
            protoAdapter.encodeWithTag(writer, 113, value.p());
            protoAdapter.encodeWithTag(writer, 114, value.N());
            protoAdapter.encodeWithTag(writer, 116, value.r());
            protoAdapter.encodeWithTag(writer, 117, value.B());
            protoAdapter.encodeWithTag(writer, 118, value.D());
            protoAdapter.encodeWithTag(writer, 120, value.t());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(l value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.e()));
            }
            if (value.g()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.g()));
            }
            if (value.i()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.i()));
            }
            if (value.k()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.k()));
            }
            if (value.m()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.m()));
            }
            if (value.o()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.o()));
            }
            if (value.G()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.G()));
            }
            if (value.K()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.K()));
            }
            if (value.I()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.I()));
            }
            if (value.M()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.M()));
            }
            if (value.y() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.y()));
            }
            if (value.q()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.q()));
            }
            if (value.O()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.O()));
            }
            if (value.s()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.s()));
            }
            if (value.C()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.C()));
            }
            if (value.E()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.E()));
            }
            if (value.u()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.u()));
            }
            if (value.z() != null) {
                z11 += e.f39151g.encodedSizeWithTag(11, value.z());
            }
            if (value.c() != null) {
                z11 += c.f39133k.encodedSizeWithTag(15, value.c());
            }
            if (value.v() != null) {
                z11 += d.f39144g.encodedSizeWithTag(19, value.v());
            }
            if (value.w() != null) {
                z11 += t.f39271k.encodedSizeWithTag(22, value.w());
            }
            if (value.A() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(2000, value.A());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return z11 + protoAdapter.encodedSizeWithTag(101, value.d()) + protoAdapter.encodedSizeWithTag(102, value.f()) + protoAdapter.encodedSizeWithTag(103, value.h()) + protoAdapter.encodedSizeWithTag(104, value.j()) + protoAdapter.encodedSizeWithTag(105, value.l()) + protoAdapter.encodedSizeWithTag(106, value.n()) + protoAdapter.encodedSizeWithTag(107, value.F()) + protoAdapter.encodedSizeWithTag(108, value.J()) + protoAdapter.encodedSizeWithTag(109, value.H()) + protoAdapter.encodedSizeWithTag(110, value.L()) + ProtoAdapter.INT32.encodedSizeWithTag(112, value.x()) + protoAdapter.encodedSizeWithTag(113, value.p()) + protoAdapter.encodedSizeWithTag(114, value.N()) + protoAdapter.encodedSizeWithTag(116, value.r()) + protoAdapter.encodedSizeWithTag(117, value.B()) + protoAdapter.encodedSizeWithTag(118, value.D()) + protoAdapter.encodedSizeWithTag(120, value.t());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public l redact(l value) {
            kotlin.jvm.internal.s.g(value, "value");
            e z11 = value.z();
            e redact = z11 == null ? null : e.f39151g.redact(z11);
            c c11 = value.c();
            c redact2 = c11 == null ? null : c.f39133k.redact(c11);
            d v11 = value.v();
            d redact3 = v11 == null ? null : d.f39144g.redact(v11);
            t w11 = value.w();
            t redact4 = w11 == null ? null : t.f39271k.redact(w11);
            Instant A = value.A();
            return l.b(value, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, redact, redact2, redact3, redact4, A == null ? null : ProtoAdapter.INSTANT.redact(A), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, -4063233, 127, null);
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

        /* renamed from: k */
        public static final ProtoAdapter<c> f39133k;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39134a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39135b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39136c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39137d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39138e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39139f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

        /* renamed from: g */
        private final kt.u f39140g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

        /* renamed from: h */
        private final kt.u f39141h;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

        /* renamed from: i */
        private final kt.u f39142i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

        /* renamed from: j */
        private final kt.u f39143j;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.DisplayState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public c decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                kt.u uVar5 = null;
                kt.u uVar6 = null;
                kt.u uVar7 = null;
                kt.u uVar8 = null;
                kt.u uVar9 = null;
                kt.u uVar10 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        case 7:
                            uVar7 = kt.u.f35845a.decode(reader);
                            break;
                        case 8:
                            uVar8 = kt.u.f35845a.decode(reader);
                            break;
                        case 9:
                            uVar9 = kt.u.f35845a.decode(reader);
                            break;
                        case 10:
                            uVar10 = kt.u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.i());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                protoAdapter.encodeWithTag(writer, 4, value.j());
                protoAdapter.encodeWithTag(writer, 5, value.f());
                protoAdapter.encodeWithTag(writer, 6, value.c());
                protoAdapter.encodeWithTag(writer, 7, value.h());
                protoAdapter.encodeWithTag(writer, 8, value.k());
                protoAdapter.encodeWithTag(writer, 9, value.e());
                protoAdapter.encodeWithTag(writer, 10, value.g());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.i()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b()) + protoAdapter.encodedSizeWithTag(4, value.j()) + protoAdapter.encodedSizeWithTag(5, value.f()) + protoAdapter.encodedSizeWithTag(6, value.c()) + protoAdapter.encodedSizeWithTag(7, value.h()) + protoAdapter.encodedSizeWithTag(8, value.k()) + protoAdapter.encodedSizeWithTag(9, value.e()) + protoAdapter.encodedSizeWithTag(10, value.g());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u i11 = value.i();
                kt.u redact = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u d11 = value.d();
                kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u b11 = value.b();
                kt.u redact3 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u j11 = value.j();
                kt.u redact4 = j11 == null ? null : kt.u.f35845a.redact(j11);
                kt.u f11 = value.f();
                kt.u redact5 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u c11 = value.c();
                kt.u redact6 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u h11 = value.h();
                kt.u redact7 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u k11 = value.k();
                kt.u redact8 = k11 == null ? null : kt.u.f35845a.redact(k11);
                kt.u e11 = value.e();
                kt.u redact9 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u g11 = value.g();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, g11 != null ? kt.u.f35845a.redact(g11) : null, okio.i.f42656d);
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
            f39133k = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) == 0 ? uVar10 : null, (i11 & 1024) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, unknownFields);
        }

        public final kt.u b() {
            return this.f39136c;
        }

        public final kt.u c() {
            return this.f39139f;
        }

        public final kt.u d() {
            return this.f39135b;
        }

        public final kt.u e() {
            return this.f39142i;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39134a, cVar.f39134a) && kotlin.jvm.internal.s.c(this.f39135b, cVar.f39135b) && kotlin.jvm.internal.s.c(this.f39136c, cVar.f39136c) && kotlin.jvm.internal.s.c(this.f39137d, cVar.f39137d) && kotlin.jvm.internal.s.c(this.f39138e, cVar.f39138e) && kotlin.jvm.internal.s.c(this.f39139f, cVar.f39139f) && kotlin.jvm.internal.s.c(this.f39140g, cVar.f39140g) && kotlin.jvm.internal.s.c(this.f39141h, cVar.f39141h) && kotlin.jvm.internal.s.c(this.f39142i, cVar.f39142i) && kotlin.jvm.internal.s.c(this.f39143j, cVar.f39143j);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39138e;
        }

        public final kt.u g() {
            return this.f39143j;
        }

        public final kt.u h() {
            return this.f39140g;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39134a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39135b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39136c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39137d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39138e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39139f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39140g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39141h;
                int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
                kt.u uVar9 = this.f39142i;
                int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
                kt.u uVar10 = this.f39143j;
                int hashCode11 = hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0);
                this.hashCode = hashCode11;
                return hashCode11;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39134a;
        }

        public final kt.u j() {
            return this.f39137d;
        }

        public final kt.u k() {
            return this.f39141h;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m782newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39134a;
            if (uVar != null) {
                arrayList.add("Off=" + uVar);
            }
            kt.u uVar2 = this.f39135b;
            if (uVar2 != null) {
                arrayList.add("Dim=" + uVar2);
            }
            kt.u uVar3 = this.f39136c;
            if (uVar3 != null) {
                arrayList.add("Accessory=" + uVar3);
            }
            kt.u uVar4 = this.f39137d;
            if (uVar4 != null) {
                arrayList.add("On=" + uVar4);
            }
            kt.u uVar5 = this.f39138e;
            if (uVar5 != null) {
                arrayList.add("Driving=" + uVar5);
            }
            kt.u uVar6 = this.f39139f;
            if (uVar6 != null) {
                arrayList.add("Charging=" + uVar6);
            }
            kt.u uVar7 = this.f39140g;
            if (uVar7 != null) {
                arrayList.add("Lock=" + uVar7);
            }
            kt.u uVar8 = this.f39141h;
            if (uVar8 != null) {
                arrayList.add("Sentry=" + uVar8);
            }
            kt.u uVar9 = this.f39142i;
            if (uVar9 != null) {
                arrayList.add("Dog=" + uVar9);
            }
            kt.u uVar10 = this.f39143j;
            if (uVar10 != null) {
                arrayList.add("Entertainment=" + uVar10);
            }
            l02 = e0.l0(arrayList, ", ", "DisplayState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m782newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, okio.i unknownFields) {
            super(f39133k, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39134a = uVar;
            this.f39135b = uVar2;
            this.f39136c = uVar3;
            this.f39137d = uVar4;
            this.f39138e = uVar5;
            this.f39139f = uVar6;
            this.f39140g = uVar7;
            this.f39141h = uVar8;
            this.f39142i = uVar9;
            this.f39143j = uVar10;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10) <= 1)) {
                throw new IllegalArgumentException("At most one of Off, Dim, Accessory, On, Driving, Charging, Lock, Sentry, Dog, Entertainment may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends com.squareup.wire.f {

        /* renamed from: g */
        public static final ProtoAdapter<d> f39144g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39145a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39146b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39147c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39148d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39149e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39150f;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.SentryModeState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public d decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                kt.u uVar5 = null;
                kt.u uVar6 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new d(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, d value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.e());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                protoAdapter.encodeWithTag(writer, 5, value.f());
                protoAdapter.encodeWithTag(writer, 6, value.g());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.f()) + protoAdapter.encodedSizeWithTag(6, value.g());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public d redact(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u e11 = value.e();
                kt.u redact = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u d11 = value.d();
                kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u b11 = value.b();
                kt.u redact3 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                kt.u redact4 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u f11 = value.f();
                kt.u redact5 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u g11 = value.g();
                return value.a(redact, redact2, redact3, redact4, redact5, g11 != null ? kt.u.f35845a.redact(g11) : null, okio.i.f42656d);
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
            f39144g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), com.squareup.wire.o.PROTO_3);
        }

        public d() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public /* synthetic */ d(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) == 0 ? uVar6 : null, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
        }

        public final d a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new d(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, unknownFields);
        }

        public final kt.u b() {
            return this.f39147c;
        }

        public final kt.u c() {
            return this.f39148d;
        }

        public final kt.u d() {
            return this.f39146b;
        }

        public final kt.u e() {
            return this.f39145a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39145a, dVar.f39145a) && kotlin.jvm.internal.s.c(this.f39146b, dVar.f39146b) && kotlin.jvm.internal.s.c(this.f39147c, dVar.f39147c) && kotlin.jvm.internal.s.c(this.f39148d, dVar.f39148d) && kotlin.jvm.internal.s.c(this.f39149e, dVar.f39149e) && kotlin.jvm.internal.s.c(this.f39150f, dVar.f39150f);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39149e;
        }

        public final kt.u g() {
            return this.f39150f;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39145a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39146b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39147c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39148d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39149e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39150f;
                int hashCode7 = hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m783newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39145a;
            if (uVar != null) {
                arrayList.add("Off=" + uVar);
            }
            kt.u uVar2 = this.f39146b;
            if (uVar2 != null) {
                arrayList.add("Idle=" + uVar2);
            }
            kt.u uVar3 = this.f39147c;
            if (uVar3 != null) {
                arrayList.add("Armed=" + uVar3);
            }
            kt.u uVar4 = this.f39148d;
            if (uVar4 != null) {
                arrayList.add("Aware=" + uVar4);
            }
            kt.u uVar5 = this.f39149e;
            if (uVar5 != null) {
                arrayList.add("Panic=" + uVar5);
            }
            kt.u uVar6 = this.f39150f;
            if (uVar6 != null) {
                arrayList.add("Quiet=" + uVar6);
            }
            l02 = e0.l0(arrayList, ", ", "SentryModeState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m783newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            super(f39144g, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39145a = uVar;
            this.f39146b = uVar2;
            this.f39147c = uVar3;
            this.f39148d = uVar4;
            this.f39149e = uVar5;
            this.f39150f = uVar6;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6) <= 1)) {
                throw new IllegalArgumentException("At most one of Off, Idle, Armed, Aware, Panic, Quiet may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends com.squareup.wire.f {

        /* renamed from: g */
        public static final ProtoAdapter<e> f39151g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39152a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39153b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39154c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39155d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39156e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39157f;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClosuresState.SunRoofState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public e decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                kt.u uVar5 = null;
                kt.u uVar6 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, reader.e(d11));
                    }
                    switch (g11) {
                        case 1:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 2:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 3:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, e value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.f());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.c());
                protoAdapter.encodeWithTag(writer, 4, value.e());
                protoAdapter.encodeWithTag(writer, 5, value.d());
                protoAdapter.encodeWithTag(writer, 6, value.g());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.c()) + protoAdapter.encodedSizeWithTag(4, value.e()) + protoAdapter.encodedSizeWithTag(5, value.d()) + protoAdapter.encodedSizeWithTag(6, value.g());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public e redact(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u f11 = value.f();
                kt.u redact = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u b11 = value.b();
                kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                kt.u redact3 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u e11 = value.e();
                kt.u redact4 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u d11 = value.d();
                kt.u redact5 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u g11 = value.g();
                return value.a(redact, redact2, redact3, redact4, redact5, g11 != null ? kt.u.f35845a.redact(g11) : null, okio.i.f42656d);
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
            f39151g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), com.squareup.wire.o.PROTO_3);
        }

        public e() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public /* synthetic */ e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) == 0 ? uVar6 : null, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
        }

        public final e a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, unknownFields);
        }

        public final kt.u b() {
            return this.f39153b;
        }

        public final kt.u c() {
            return this.f39154c;
        }

        public final kt.u d() {
            return this.f39156e;
        }

        public final kt.u e() {
            return this.f39155d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39152a, eVar.f39152a) && kotlin.jvm.internal.s.c(this.f39153b, eVar.f39153b) && kotlin.jvm.internal.s.c(this.f39154c, eVar.f39154c) && kotlin.jvm.internal.s.c(this.f39155d, eVar.f39155d) && kotlin.jvm.internal.s.c(this.f39156e, eVar.f39156e) && kotlin.jvm.internal.s.c(this.f39157f, eVar.f39157f);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39152a;
        }

        public final kt.u g() {
            return this.f39157f;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39152a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39153b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39154c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39155d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39156e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39157f;
                int hashCode7 = hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m784newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39152a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39153b;
            if (uVar2 != null) {
                arrayList.add("Calibrating=" + uVar2);
            }
            kt.u uVar3 = this.f39154c;
            if (uVar3 != null) {
                arrayList.add("Closed=" + uVar3);
            }
            kt.u uVar4 = this.f39155d;
            if (uVar4 != null) {
                arrayList.add("Open=" + uVar4);
            }
            kt.u uVar5 = this.f39156e;
            if (uVar5 != null) {
                arrayList.add("Moving=" + uVar5);
            }
            kt.u uVar6 = this.f39157f;
            if (uVar6 != null) {
                arrayList.add("Vent=" + uVar6);
            }
            l02 = e0.l0(arrayList, ", ", "SunRoofState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m784newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, okio.i unknownFields) {
            super(f39151g, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39152a = uVar;
            this.f39153b = uVar2;
            this.f39154c = uVar3;
            this.f39155d = uVar4;
            this.f39156e = uVar5;
            this.f39157f = uVar6;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Calibrating, Closed, Open, Moving, Vent may be non-null".toString());
            }
        }
    }

    static {
        new b(null);
        f39108p1 = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(l.class), com.squareup.wire.o.PROTO_3);
    }

    public l() {
        this(false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 255, null);
    }

    public /* synthetic */ l(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, t tVar, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, okio.i iVar, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) != 0 ? false : z15, (i12 & 32) != 0 ? false : z16, (i12 & 64) != 0 ? false : z17, (i12 & 128) != 0 ? false : z18, (i12 & 256) != 0 ? false : z19, (i12 & 512) != 0 ? false : z21, (i12 & 1024) != 0 ? 0 : i11, (i12 & 2048) != 0 ? false : z22, (i12 & 4096) != 0 ? false : z23, (i12 & PKIFailureInfo.certRevoked) != 0 ? false : z24, (i12 & 16384) != 0 ? false : z25, (i12 & 32768) != 0 ? false : z26, (i12 & 65536) != 0 ? false : z27, (i12 & 131072) != 0 ? null : eVar, (i12 & 262144) != 0 ? null : cVar, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : dVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : tVar, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : instant, (i12 & 4194304) != 0 ? null : bool, (i12 & 8388608) != 0 ? null : bool2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool3, (i12 & 33554432) != 0 ? null : bool4, (i12 & 67108864) != 0 ? null : bool5, (i12 & 134217728) != 0 ? null : bool6, (i12 & 268435456) != 0 ? null : bool7, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool8, (i12 & 1073741824) != 0 ? null : bool9, (i12 & Integer.MIN_VALUE) != 0 ? null : bool10, (i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : bool11, (i13 & 4) != 0 ? null : bool12, (i13 & 8) != 0 ? null : bool13, (i13 & 16) != 0 ? null : bool14, (i13 & 32) != 0 ? null : bool15, (i13 & 64) == 0 ? bool16 : null, (i13 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ l b(l lVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, t tVar, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, okio.i iVar, int i12, int i13, Object obj) {
        return lVar.a((i12 & 1) != 0 ? lVar.f39109a : z11, (i12 & 2) != 0 ? lVar.f39110b : z12, (i12 & 4) != 0 ? lVar.f39112c : z13, (i12 & 8) != 0 ? lVar.f39113d : z14, (i12 & 16) != 0 ? lVar.f39114e : z15, (i12 & 32) != 0 ? lVar.f39115f : z16, (i12 & 64) != 0 ? lVar.f39116g : z17, (i12 & 128) != 0 ? lVar.f39118h : z18, (i12 & 256) != 0 ? lVar.f39119i : z19, (i12 & 512) != 0 ? lVar.f39120j : z21, (i12 & 1024) != 0 ? lVar.f39121k : i11, (i12 & 2048) != 0 ? lVar.f39122l : z22, (i12 & 4096) != 0 ? lVar.f39123m : z23, (i12 & PKIFailureInfo.certRevoked) != 0 ? lVar.f39124n : z24, (i12 & 16384) != 0 ? lVar.f39125o : z25, (i12 & 32768) != 0 ? lVar.f39126p : z26, (i12 & 65536) != 0 ? lVar.f39127q : z27, (i12 & 131072) != 0 ? lVar.f39128t : eVar, (i12 & 262144) != 0 ? lVar.f39129w : cVar, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? lVar.f39130x : dVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? lVar.f39131y : tVar, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? lVar.f39132z : instant, (i12 & 4194304) != 0 ? lVar.A : bool, (i12 & 8388608) != 0 ? lVar.B : bool2, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? lVar.C : bool3, (i12 & 33554432) != 0 ? lVar.E : bool4, (i12 & 67108864) != 0 ? lVar.F : bool5, (i12 & 134217728) != 0 ? lVar.G : bool6, (i12 & 268435456) != 0 ? lVar.H : bool7, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? lVar.K : bool8, (i12 & 1073741824) != 0 ? lVar.L : bool9, (i12 & Integer.MIN_VALUE) != 0 ? lVar.O : bool10, (i13 & 1) != 0 ? lVar.P : num, (i13 & 2) != 0 ? lVar.Q : bool11, (i13 & 4) != 0 ? lVar.R : bool12, (i13 & 8) != 0 ? lVar.T : bool13, (i13 & 16) != 0 ? lVar.Y : bool14, (i13 & 32) != 0 ? lVar.f39111b1 : bool15, (i13 & 64) != 0 ? lVar.f39117g1 : bool16, (i13 & 128) != 0 ? lVar.unknownFields() : iVar);
    }

    public final Instant A() {
        return this.f39132z;
    }

    public final Boolean B() {
        return this.Y;
    }

    public final boolean C() {
        return this.f39125o;
    }

    public final Boolean D() {
        return this.f39111b1;
    }

    public final boolean E() {
        return this.f39126p;
    }

    public final Boolean F() {
        return this.H;
    }

    public final boolean G() {
        return this.f39116g;
    }

    public final Boolean H() {
        return this.L;
    }

    public final boolean I() {
        return this.f39119i;
    }

    public final Boolean J() {
        return this.K;
    }

    public final boolean K() {
        return this.f39118h;
    }

    public final Boolean L() {
        return this.O;
    }

    public final boolean M() {
        return this.f39120j;
    }

    public final Boolean N() {
        return this.R;
    }

    public final boolean O() {
        return this.f39123m;
    }

    public final l a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, t tVar, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new l(z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, i11, z22, z23, z24, z25, z26, z27, eVar, cVar, dVar, tVar, instant, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, num, bool11, bool12, bool13, bool14, bool15, bool16, unknownFields);
    }

    public final c c() {
        return this.f39129w;
    }

    public final Boolean d() {
        return this.A;
    }

    public final boolean e() {
        return this.f39109a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), lVar.unknownFields()) && this.f39109a == lVar.f39109a && this.f39110b == lVar.f39110b && this.f39112c == lVar.f39112c && this.f39113d == lVar.f39113d && this.f39114e == lVar.f39114e && this.f39115f == lVar.f39115f && this.f39116g == lVar.f39116g && this.f39118h == lVar.f39118h && this.f39119i == lVar.f39119i && this.f39120j == lVar.f39120j && this.f39121k == lVar.f39121k && this.f39122l == lVar.f39122l && this.f39123m == lVar.f39123m && this.f39124n == lVar.f39124n && this.f39125o == lVar.f39125o && this.f39126p == lVar.f39126p && this.f39127q == lVar.f39127q && kotlin.jvm.internal.s.c(this.f39128t, lVar.f39128t) && kotlin.jvm.internal.s.c(this.f39129w, lVar.f39129w) && kotlin.jvm.internal.s.c(this.f39130x, lVar.f39130x) && kotlin.jvm.internal.s.c(this.f39131y, lVar.f39131y) && kotlin.jvm.internal.s.c(this.f39132z, lVar.f39132z) && kotlin.jvm.internal.s.c(this.A, lVar.A) && kotlin.jvm.internal.s.c(this.B, lVar.B) && kotlin.jvm.internal.s.c(this.C, lVar.C) && kotlin.jvm.internal.s.c(this.E, lVar.E) && kotlin.jvm.internal.s.c(this.F, lVar.F) && kotlin.jvm.internal.s.c(this.G, lVar.G) && kotlin.jvm.internal.s.c(this.H, lVar.H) && kotlin.jvm.internal.s.c(this.K, lVar.K) && kotlin.jvm.internal.s.c(this.L, lVar.L) && kotlin.jvm.internal.s.c(this.O, lVar.O) && kotlin.jvm.internal.s.c(this.P, lVar.P) && kotlin.jvm.internal.s.c(this.Q, lVar.Q) && kotlin.jvm.internal.s.c(this.R, lVar.R) && kotlin.jvm.internal.s.c(this.T, lVar.T) && kotlin.jvm.internal.s.c(this.Y, lVar.Y) && kotlin.jvm.internal.s.c(this.f39111b1, lVar.f39111b1) && kotlin.jvm.internal.s.c(this.f39117g1, lVar.f39117g1);
        }
        return false;
    }

    public final Boolean f() {
        return this.B;
    }

    public final boolean g() {
        return this.f39110b;
    }

    public final Boolean h() {
        return this.C;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39109a)) * 37) + Boolean.hashCode(this.f39110b)) * 37) + Boolean.hashCode(this.f39112c)) * 37) + Boolean.hashCode(this.f39113d)) * 37) + Boolean.hashCode(this.f39114e)) * 37) + Boolean.hashCode(this.f39115f)) * 37) + Boolean.hashCode(this.f39116g)) * 37) + Boolean.hashCode(this.f39118h)) * 37) + Boolean.hashCode(this.f39119i)) * 37) + Boolean.hashCode(this.f39120j)) * 37) + Integer.hashCode(this.f39121k)) * 37) + Boolean.hashCode(this.f39122l)) * 37) + Boolean.hashCode(this.f39123m)) * 37) + Boolean.hashCode(this.f39124n)) * 37) + Boolean.hashCode(this.f39125o)) * 37) + Boolean.hashCode(this.f39126p)) * 37) + Boolean.hashCode(this.f39127q)) * 37;
            e eVar = this.f39128t;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
            c cVar = this.f39129w;
            int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            d dVar = this.f39130x;
            int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            t tVar = this.f39131y;
            int hashCode5 = (hashCode4 + (tVar != null ? tVar.hashCode() : 0)) * 37;
            Instant instant = this.f39132z;
            int hashCode6 = (hashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
            Boolean bool = this.A;
            int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.B;
            int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Boolean bool3 = this.C;
            int hashCode9 = (hashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
            Boolean bool4 = this.E;
            int hashCode10 = (hashCode9 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
            Boolean bool5 = this.F;
            int hashCode11 = (hashCode10 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
            Boolean bool6 = this.G;
            int hashCode12 = (hashCode11 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
            Boolean bool7 = this.H;
            int hashCode13 = (hashCode12 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
            Boolean bool8 = this.K;
            int hashCode14 = (hashCode13 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
            Boolean bool9 = this.L;
            int hashCode15 = (hashCode14 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
            Boolean bool10 = this.O;
            int hashCode16 = (hashCode15 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
            Integer num = this.P;
            int hashCode17 = (hashCode16 + (num != null ? num.hashCode() : 0)) * 37;
            Boolean bool11 = this.Q;
            int hashCode18 = (hashCode17 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
            Boolean bool12 = this.R;
            int hashCode19 = (hashCode18 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
            Boolean bool13 = this.T;
            int hashCode20 = (hashCode19 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
            Boolean bool14 = this.Y;
            int hashCode21 = (hashCode20 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
            Boolean bool15 = this.f39111b1;
            int hashCode22 = (hashCode21 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
            Boolean bool16 = this.f39117g1;
            int hashCode23 = hashCode22 + (bool16 != null ? bool16.hashCode() : 0);
            this.hashCode = hashCode23;
            return hashCode23;
        }
        return i11;
    }

    public final boolean i() {
        return this.f39112c;
    }

    public final Boolean j() {
        return this.E;
    }

    public final boolean k() {
        return this.f39113d;
    }

    public final Boolean l() {
        return this.F;
    }

    public final boolean m() {
        return this.f39114e;
    }

    public final Boolean n() {
        return this.G;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m781newBuilder();
    }

    public final boolean o() {
        return this.f39115f;
    }

    public final Boolean p() {
        return this.Q;
    }

    public final boolean q() {
        return this.f39122l;
    }

    public final Boolean r() {
        return this.T;
    }

    public final boolean s() {
        return this.f39124n;
    }

    public final Boolean t() {
        return this.f39117g1;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f39109a;
        arrayList.add("door_open_driver_front_OBSOLETE=" + z11);
        boolean z12 = this.f39110b;
        arrayList.add("door_open_driver_rear_OBSOLETE=" + z12);
        boolean z13 = this.f39112c;
        arrayList.add("door_open_passenger_front_OBSOLETE=" + z13);
        boolean z14 = this.f39113d;
        arrayList.add("door_open_passenger_rear_OBSOLETE=" + z14);
        boolean z15 = this.f39114e;
        arrayList.add("door_open_trunk_front_OBSOLETE=" + z15);
        boolean z16 = this.f39115f;
        arrayList.add("door_open_trunk_rear_OBSOLETE=" + z16);
        boolean z17 = this.f39116g;
        arrayList.add("window_open_driver_front_OBSOLETE=" + z17);
        boolean z18 = this.f39118h;
        arrayList.add("window_open_passenger_front_OBSOLETE=" + z18);
        boolean z19 = this.f39119i;
        arrayList.add("window_open_driver_rear_OBSOLETE=" + z19);
        boolean z21 = this.f39120j;
        arrayList.add("window_open_passenger_rear_OBSOLETE=" + z21);
        int i11 = this.f39121k;
        arrayList.add("sun_roof_percent_open_OBSOLETE=" + i11);
        boolean z22 = this.f39122l;
        arrayList.add("locked_OBSOLETE=" + z22);
        boolean z23 = this.f39123m;
        arrayList.add("is_user_present_OBSOLETE=" + z23);
        boolean z24 = this.f39124n;
        arrayList.add("remote_start_OBSOLETE=" + z24);
        boolean z25 = this.f39125o;
        arrayList.add("valet_mode_OBSOLETE=" + z25);
        boolean z26 = this.f39126p;
        arrayList.add("valet_pin_needed_OBSOLETE=" + z26);
        boolean z27 = this.f39127q;
        arrayList.add("sentry_mode_available_OBSOLETE=" + z27);
        e eVar = this.f39128t;
        if (eVar != null) {
            arrayList.add("sun_roof_state=" + eVar);
        }
        c cVar = this.f39129w;
        if (cVar != null) {
            arrayList.add("center_display_state=" + cVar);
        }
        d dVar = this.f39130x;
        if (dVar != null) {
            arrayList.add("sentry_mode_state=" + dVar);
        }
        t tVar = this.f39131y;
        if (tVar != null) {
            arrayList.add("speed_limit_mode=" + tVar);
        }
        Instant instant = this.f39132z;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.A;
        if (bool != null) {
            arrayList.add("door_open_driver_front=" + bool);
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            arrayList.add("door_open_driver_rear=" + bool2);
        }
        Boolean bool3 = this.C;
        if (bool3 != null) {
            arrayList.add("door_open_passenger_front=" + bool3);
        }
        Boolean bool4 = this.E;
        if (bool4 != null) {
            arrayList.add("door_open_passenger_rear=" + bool4);
        }
        Boolean bool5 = this.F;
        if (bool5 != null) {
            arrayList.add("door_open_trunk_front=" + bool5);
        }
        Boolean bool6 = this.G;
        if (bool6 != null) {
            arrayList.add("door_open_trunk_rear=" + bool6);
        }
        Boolean bool7 = this.H;
        if (bool7 != null) {
            arrayList.add("window_open_driver_front=" + bool7);
        }
        Boolean bool8 = this.K;
        if (bool8 != null) {
            arrayList.add("window_open_passenger_front=" + bool8);
        }
        Boolean bool9 = this.L;
        if (bool9 != null) {
            arrayList.add("window_open_driver_rear=" + bool9);
        }
        Boolean bool10 = this.O;
        if (bool10 != null) {
            arrayList.add("window_open_passenger_rear=" + bool10);
        }
        Integer num = this.P;
        if (num != null) {
            arrayList.add("sun_roof_percent_open=" + num);
        }
        Boolean bool11 = this.Q;
        if (bool11 != null) {
            arrayList.add("locked=" + bool11);
        }
        Boolean bool12 = this.R;
        if (bool12 != null) {
            arrayList.add("is_user_present=" + bool12);
        }
        Boolean bool13 = this.T;
        if (bool13 != null) {
            arrayList.add("remote_start=" + bool13);
        }
        Boolean bool14 = this.Y;
        if (bool14 != null) {
            arrayList.add("valet_mode=" + bool14);
        }
        Boolean bool15 = this.f39111b1;
        if (bool15 != null) {
            arrayList.add("valet_pin_needed=" + bool15);
        }
        Boolean bool16 = this.f39117g1;
        if (bool16 != null) {
            arrayList.add("sentry_mode_available=" + bool16);
        }
        l02 = e0.l0(arrayList, ", ", "ClosuresState{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final boolean u() {
        return this.f39127q;
    }

    public final d v() {
        return this.f39130x;
    }

    public final t w() {
        return this.f39131y;
    }

    public final Integer x() {
        return this.P;
    }

    public final int y() {
        return this.f39121k;
    }

    public final e z() {
        return this.f39128t;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m781newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i11, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, e eVar, c cVar, d dVar, t tVar, Instant instant, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, okio.i unknownFields) {
        super(f39108p1, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39109a = z11;
        this.f39110b = z12;
        this.f39112c = z13;
        this.f39113d = z14;
        this.f39114e = z15;
        this.f39115f = z16;
        this.f39116g = z17;
        this.f39118h = z18;
        this.f39119i = z19;
        this.f39120j = z21;
        this.f39121k = i11;
        this.f39122l = z22;
        this.f39123m = z23;
        this.f39124n = z24;
        this.f39125o = z25;
        this.f39126p = z26;
        this.f39127q = z27;
        this.f39128t = eVar;
        this.f39129w = cVar;
        this.f39130x = dVar;
        this.f39131y = tVar;
        this.f39132z = instant;
        this.A = bool;
        this.B = bool2;
        this.C = bool3;
        this.E = bool4;
        this.F = bool5;
        this.G = bool6;
        this.H = bool7;
        this.K = bool8;
        this.L = bool9;
        this.O = bool10;
        this.P = num;
        this.Q = bool11;
        this.R = bool12;
        this.T = bool13;
        this.Y = bool14;
        this.f39111b1 = bool15;
        this.f39117g1 = bool16;
    }
}