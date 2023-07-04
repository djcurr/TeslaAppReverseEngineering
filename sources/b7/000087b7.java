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
import org.spongycastle.crypto.tls.CipherSuite;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class u extends com.squareup.wire.f {

    /* renamed from: e4 */
    public static final ProtoAdapter<u> f39282e4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSeatCoolingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 45)
    private final boolean A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "keyVersion", tag = 125)
    private final Integer A3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsPressuresSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 47)
    private final boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "mobileEnabled", tag = 126)
    private final Boolean B3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleBadgingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 48)
    private final int C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "defaultChargeToMax", tag = 134)
    private final Boolean C3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeaterInstalled", tag = 136)
    private final Boolean D3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paintColorOverrideOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 46)
    private final String E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeSupported", tag = 137)
    private final Boolean E3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exteriorTrimOverrideOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 49)
    private final String F;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkSupported", tag = 138)
    private final Boolean F3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$HeadlampType_E#ADAPTER", jsonName = "headlampTypeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 50)
    private final h G;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamSupported", tag = 139)
    private final Boolean G3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$AuxParkLamps_E#ADAPTER", jsonName = "auxParkLampsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 54)
    private final a H;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeSupported", tag = 141)
    private final Boolean H3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveSupported", tag = 142)
    private final Boolean I3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasPws", tag = 143)
    private final Boolean J3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRavenOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 55)
    private final boolean K;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "utcOffset", tag = 144)
    private final Integer K3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAutoSeatClimateOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 56)
    private final boolean L;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSeatCooling", tag = 145)
    private final Boolean L3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsPressuresSupported", tag = 147)
    private final Boolean M3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleBadging", tag = 148)
    private final Integer N3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasFrontRowSeatHeatersOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 57)
    private final boolean O;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "paintColorOverride", tag = 146)
    private final String O3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasThirdRowSeatHeatersOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 58)
    private final boolean P;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exteriorTrimOverride", tag = 149)
    private final String P3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsQrPairingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 59)
    private final boolean Q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ExteriorColor#ADAPTER", jsonName = "exteriorColor", label = q.a.OMIT_IDENTITY, tag = 13)
    private final kt.e Q1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$InteriorTrimType#ADAPTER", jsonName = "interiorTrimType", label = q.a.OMIT_IDENTITY, tag = 28)
    private final i Q2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$HeadlampType_E#ADAPTER", jsonName = "headlampType", tag = 150)
    private final h Q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vinOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 60)
    private final String R;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$AuxParkLamps_E#ADAPTER", jsonName = "auxParkLamps", tag = 154)
    private final a R3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRaven", tag = 155)
    private final Boolean S3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.VehicleBadging#ADAPTER", jsonName = "carSpecialType", label = q.a.OMIT_IDENTITY, tag = 1)
    private final kt.t T;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAutoSeatClimate", tag = 156)
    private final Boolean T3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasFrontRowSeatHeaters", tag = 157)
    private final Boolean U3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.RearSeatHeaters#ADAPTER", jsonName = "rearSeatHeaters", label = q.a.OMIT_IDENTITY, tag = 16)
    private final kt.k V1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasThirdRowSeatHeaters", tag = 158)
    private final Boolean V3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsQrPairing", tag = 159)
    private final Boolean W3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 160)
    private final String X3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.CarTrim#ADAPTER", jsonName = "carTrim", label = q.a.OMIT_IDENTITY, tag = 2)
    private final kt.a Y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableWindowVentClose", tag = CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384)
    private final Boolean Y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamSelfieSupported", tag = CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256)
    private final Boolean Z3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useRangeBadgingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: a */
    private final boolean f39283a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "copUserSetTempSupported", tag = CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384)

    /* renamed from: a4 */
    private final Boolean f39284a4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rangePlusBadgingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b */
    private final boolean f39285b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$CarType#ADAPTER", jsonName = "carType", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: b1 */
    private final b f39286b1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SeatType#ADAPTER", jsonName = "seatType", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: b2 */
    private final kt.n f39287b2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAutoStwHeat", tag = CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256)

    /* renamed from: b4 */
    private final Boolean f39288b4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasLudicrousModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: c */
    private final boolean f39289c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "redBrakeCalipers", tag = 61)

    /* renamed from: c4 */
    private final Boolean f39290c4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canActuateTrunksOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: d */
    private final boolean f39291d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$RearLightType#ADAPTER", jsonName = "rearlightType", tag = CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384)

    /* renamed from: d4 */
    private final k f39292d4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAirSuspensionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: e */
    private final boolean f39293e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rhdOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: f */
    private final boolean f39294f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "plgOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: g */
    private final boolean f39295g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SunRoofType#ADAPTER", jsonName = "sunRoofInstalled", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: g1 */
    private final kt.r f39296g1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.RearSeatType#ADAPTER", jsonName = "rearSeatType", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: g2 */
    private final kt.l f39297g2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "eceRestrictionsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: h */
    private final boolean f39298h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "euVehicleOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: i */
    private final boolean f39299i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$DriverAssist#ADAPTER", jsonName = "driverAssist", label = q.a.OMIT_IDENTITY, tag = 29)

    /* renamed from: i3 */
    private final e f39300i3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "motorizedChargePortOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: j */
    private final boolean f39301j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$PerformancePackage#ADAPTER", jsonName = "performancePackage", label = q.a.OMIT_IDENTITY, tag = 30)

    /* renamed from: j3 */
    private final j f39302j3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canAcceptNavigationRequestsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 24)

    /* renamed from: k */
    private final boolean f39303k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$FrontDriveUnit#ADAPTER", jsonName = "frontDriveUnit", label = q.a.OMIT_IDENTITY, tag = 31)

    /* renamed from: k3 */
    private final g f39304k3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "keyVersionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 25)

    /* renamed from: l */
    private final int f39305l;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.RearDriveUnit#ADAPTER", jsonName = "rearDriveUnit", label = q.a.OMIT_IDENTITY, tag = 32)

    /* renamed from: l3 */
    private final kt.j f39306l3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "mobileEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 26)

    /* renamed from: m */
    private final boolean f39307m;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.EfficiencyPackage#ADAPTER", jsonName = "efficiencyPackage", label = q.a.OMIT_IDENTITY, tag = 33)

    /* renamed from: m3 */
    private final kt.d f39308m3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "defaultChargeToMaxOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 34)

    /* renamed from: n */
    private final boolean f39309n;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$ExteriorTrimType#ADAPTER", jsonName = "exteriorTrimType", label = q.a.OMIT_IDENTITY, tag = 35)

    /* renamed from: n3 */
    private final f f39310n3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeaterInstalledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 36)

    /* renamed from: o */
    private final boolean f39311o;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig$SteeringWheelType#ADAPTER", jsonName = "steeringWheelType", label = q.a.OMIT_IDENTITY, tag = 40)

    /* renamed from: o3 */
    private final l f39312o3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sentryModeSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 37)

    /* renamed from: p */
    private final boolean f39313p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.WheelType#ADAPTER", jsonName = "wheelType", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: p1 */
    private final kt.v f39314p1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ThirdRowSeatType#ADAPTER", jsonName = "thirdRowSeatType", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: p2 */
    private final kt.s f39315p2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useRangeBadging", tag = 103)

    /* renamed from: p3 */
    private final Boolean f39316p3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 38)

    /* renamed from: q */
    private final boolean f39317q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rangePlusBadging", tag = 104)

    /* renamed from: q3 */
    private final Boolean f39318q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasLudicrousMode", tag = 105)

    /* renamed from: r3 */
    private final Boolean f39319r3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canActuateTrunks", tag = 106)

    /* renamed from: s3 */
    private final Boolean f39320s3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 39)

    /* renamed from: t */
    private final boolean f39321t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasAirSuspension", tag = 110)

    /* renamed from: t3 */
    private final Boolean f39322t3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 114)

    /* renamed from: u3 */
    private final Boolean f39323u3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 115)

    /* renamed from: v3 */
    private final Boolean f39324v3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 41)

    /* renamed from: w */
    private final boolean f39325w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "eceRestrictions", tag = 120)

    /* renamed from: w3 */
    private final Boolean f39326w3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 42)

    /* renamed from: x */
    private final boolean f39327x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.SpoilerType#ADAPTER", jsonName = "spoilerType", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: x1 */
    private final kt.p f39328x1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargePortType#ADAPTER", jsonName = "chargePortType", label = q.a.OMIT_IDENTITY, tag = 23)

    /* renamed from: x2 */
    private final kt.c f39329x2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "euVehicle", tag = 121)

    /* renamed from: x3 */
    private final Boolean f39330x3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasPwsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 43)

    /* renamed from: y */
    private final boolean f39331y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.RoofColor#ADAPTER", jsonName = "roofColor", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: y1 */
    private final kt.m f39332y1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 27)

    /* renamed from: y2 */
    private final Instant f39333y2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "motorizedChargePort", tag = 122)

    /* renamed from: y3 */
    private final Boolean f39334y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "utcOffsetOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 44)

    /* renamed from: z */
    private final int f39335z;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "canAcceptNavigationRequests", tag = 124)

    /* renamed from: z3 */
    private final Boolean f39336z3;

    /* loaded from: classes6.dex */
    public enum a implements com.squareup.wire.p {
        AuxParkLampsNaBase(0),
        AuxParkLampsNaPremium(1),
        AuxParkLampsEu(2),
        AuxParkLampsNone(3);
        
        public static final ProtoAdapter<a> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* renamed from: mt.u$a$a */
        /* loaded from: classes6.dex */
        public static final class C0758a extends com.squareup.wire.a<a> {
            C0758a(n00.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
                super(dVar, oVar, aVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public a d(int i11) {
                return a.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return a.AuxParkLampsNone;
                        }
                        return a.AuxParkLampsEu;
                    }
                    return a.AuxParkLampsNaPremium;
                }
                return a.AuxParkLampsNaBase;
            }
        }

        static {
            a aVar;
            ADAPTER = new C0758a(m0.b(a.class), com.squareup.wire.o.PROTO_3, aVar);
        }

        a(int i11) {
            this.value = i11;
        }

        public static final a fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends com.squareup.wire.f {

        /* renamed from: i */
        public static final ProtoAdapter<b> f39337i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39338a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39339b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39340c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39341d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39342e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39343f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

        /* renamed from: g */
        private final kt.u f39344g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

        /* renamed from: h */
        private final kt.u f39345h;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<b> {
            a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.CarType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public b decode(com.squareup.wire.k reader) {
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
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new b(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, reader.e(d11));
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
                        default:
                            reader.m(g11);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, b value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.d());
                protoAdapter.encodeWithTag(writer, 2, value.f());
                protoAdapter.encodeWithTag(writer, 3, value.e());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                protoAdapter.encodeWithTag(writer, 5, value.g());
                protoAdapter.encodeWithTag(writer, 6, value.h());
                protoAdapter.encodeWithTag(writer, 7, value.b());
                protoAdapter.encodeWithTag(writer, 8, value.i());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.f()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.g()) + protoAdapter.encodedSizeWithTag(6, value.h()) + protoAdapter.encodedSizeWithTag(7, value.b()) + protoAdapter.encodedSizeWithTag(8, value.i());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public b redact(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u d11 = value.d();
                kt.u redact = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u f11 = value.f();
                kt.u redact2 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u e11 = value.e();
                kt.u redact3 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u c11 = value.c();
                kt.u redact4 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u g11 = value.g();
                kt.u redact5 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u h11 = value.h();
                kt.u redact6 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u b11 = value.b();
                kt.u redact7 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u i11 = value.i();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, i11 != null ? kt.u.f35845a.redact(i11) : null, okio.i.f42656d);
            }
        }

        /* renamed from: mt.u$b$b */
        /* loaded from: classes6.dex */
        public static final class C0759b {
            private C0759b() {
            }

            public /* synthetic */ C0759b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0759b(null);
            f39337i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), com.squareup.wire.o.PROTO_3);
        }

        public b() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public /* synthetic */ b(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) == 0 ? uVar8 : null, (i11 & 256) != 0 ? okio.i.f42656d : iVar);
        }

        public final b a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new b(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, unknownFields);
        }

        public final kt.u b() {
            return this.f39344g;
        }

        public final kt.u c() {
            return this.f39341d;
        }

        public final kt.u d() {
            return this.f39338a;
        }

        public final kt.u e() {
            return this.f39340c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39338a, bVar.f39338a) && kotlin.jvm.internal.s.c(this.f39339b, bVar.f39339b) && kotlin.jvm.internal.s.c(this.f39340c, bVar.f39340c) && kotlin.jvm.internal.s.c(this.f39341d, bVar.f39341d) && kotlin.jvm.internal.s.c(this.f39342e, bVar.f39342e) && kotlin.jvm.internal.s.c(this.f39343f, bVar.f39343f) && kotlin.jvm.internal.s.c(this.f39344g, bVar.f39344g) && kotlin.jvm.internal.s.c(this.f39345h, bVar.f39345h);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39339b;
        }

        public final kt.u g() {
            return this.f39342e;
        }

        public final kt.u h() {
            return this.f39343f;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39338a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39339b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39340c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39341d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39342e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39343f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39344g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39345h;
                int hashCode9 = hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39345h;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m800newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39338a;
            if (uVar != null) {
                arrayList.add("CarTypeModelS=" + uVar);
            }
            kt.u uVar2 = this.f39339b;
            if (uVar2 != null) {
                arrayList.add("CarTypeModelX=" + uVar2);
            }
            kt.u uVar3 = this.f39340c;
            if (uVar3 != null) {
                arrayList.add("CarTypeModelS2=" + uVar3);
            }
            kt.u uVar4 = this.f39341d;
            if (uVar4 != null) {
                arrayList.add("CarTypeModel3=" + uVar4);
            }
            kt.u uVar5 = this.f39342e;
            if (uVar5 != null) {
                arrayList.add("CarTypeModelY=" + uVar5);
            }
            kt.u uVar6 = this.f39343f;
            if (uVar6 != null) {
                arrayList.add("CarTypeSemiTruck=" + uVar6);
            }
            kt.u uVar7 = this.f39344g;
            if (uVar7 != null) {
                arrayList.add("CarTypeLychee=" + uVar7);
            }
            kt.u uVar8 = this.f39345h;
            if (uVar8 != null) {
                arrayList.add("CarTypeTamarind=" + uVar8);
            }
            l02 = e0.l0(arrayList, ", ", "CarType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m800newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i unknownFields) {
            super(f39337i, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39338a = uVar;
            this.f39339b = uVar2;
            this.f39340c = uVar3;
            this.f39341d = uVar4;
            this.f39342e = uVar5;
            this.f39343f = uVar6;
            this.f39344g = uVar7;
            this.f39345h = uVar8;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8) <= 1)) {
                throw new IllegalArgumentException("At most one of CarTypeModelS, CarTypeModelX, CarTypeModelS2, CarTypeModel3, CarTypeModelY, CarTypeSemiTruck, CarTypeLychee, CarTypeTamarind may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends ProtoAdapter<u> {
        c(com.squareup.wire.b bVar, n00.d<u> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public u decode(com.squareup.wire.k reader) {
            h hVar;
            long j11;
            kotlin.jvm.internal.s.g(reader, "reader");
            h hVar2 = h.HeadlampTypePremium;
            a aVar = a.AuxParkLampsNaBase;
            long d11 = reader.d();
            String str = "";
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
            boolean z22 = false;
            int i11 = 0;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z31 = false;
            boolean z32 = false;
            int i12 = 0;
            boolean z33 = false;
            boolean z34 = false;
            int i13 = 0;
            boolean z35 = false;
            boolean z36 = false;
            boolean z37 = false;
            boolean z38 = false;
            boolean z39 = false;
            kt.t tVar = null;
            kt.a aVar2 = null;
            b bVar = null;
            kt.r rVar = null;
            kt.v vVar = null;
            kt.p pVar = null;
            kt.m mVar = null;
            kt.e eVar = null;
            kt.k kVar = null;
            kt.n nVar = null;
            kt.l lVar = null;
            kt.s sVar = null;
            kt.c cVar = null;
            Instant instant = null;
            i iVar = null;
            e eVar2 = null;
            j jVar = null;
            g gVar = null;
            kt.j jVar2 = null;
            kt.d dVar = null;
            f fVar = null;
            l lVar2 = null;
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
            Boolean bool11 = null;
            Integer num = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Integer num2 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Integer num3 = null;
            String str2 = null;
            String str3 = null;
            h hVar3 = null;
            a aVar3 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            String str4 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Boolean bool30 = null;
            Boolean bool31 = null;
            Boolean bool32 = null;
            k kVar2 = null;
            a aVar4 = aVar;
            String str5 = str;
            String str6 = str5;
            h hVar4 = hVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new u(z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, i11, z23, z24, z25, z26, z27, z28, z29, z31, z32, i12, z33, z34, i13, str5, str6, hVar4, aVar4, z35, z36, z37, z38, z39, str, tVar, aVar2, bVar, rVar, vVar, pVar, mVar, eVar, kVar, nVar, lVar, sVar, cVar, instant, iVar, eVar2, jVar, gVar, jVar2, dVar, fVar, lVar2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, num, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, num2, bool21, bool22, num3, str2, str3, hVar3, aVar3, bool23, bool24, bool25, bool26, bool27, str4, bool28, bool29, bool30, bool31, bool32, kVar2, reader.e(d11));
                }
                if (g11 == 110) {
                    hVar = hVar4;
                    j11 = d11;
                    Boolean decode = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var = b0.f54756a;
                    bool5 = decode;
                } else if (g11 == 134) {
                    hVar = hVar4;
                    j11 = d11;
                    Boolean decode2 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var2 = b0.f54756a;
                    bool13 = decode2;
                } else if (g11 == 114) {
                    hVar = hVar4;
                    j11 = d11;
                    Boolean decode3 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var3 = b0.f54756a;
                    bool6 = decode3;
                } else if (g11 != 115) {
                    switch (g11) {
                        case 1:
                            hVar = hVar4;
                            j11 = d11;
                            kt.t decode4 = kt.t.f35840e.decode(reader);
                            b0 b0Var4 = b0.f54756a;
                            tVar = decode4;
                            break;
                        case 2:
                            hVar = hVar4;
                            j11 = d11;
                            kt.a decode5 = kt.a.Q.decode(reader);
                            b0 b0Var5 = b0.f54756a;
                            aVar2 = decode5;
                            break;
                        case 3:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var6 = b0.f54756a;
                            z11 = booleanValue;
                            break;
                        case 4:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var7 = b0.f54756a;
                            z12 = booleanValue2;
                            break;
                        case 5:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var8 = b0.f54756a;
                            z13 = booleanValue3;
                            break;
                        case 6:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var9 = b0.f54756a;
                            z14 = booleanValue4;
                            break;
                        case 7:
                            hVar = hVar4;
                            j11 = d11;
                            b decode6 = b.f39337i.decode(reader);
                            b0 b0Var10 = b0.f54756a;
                            bVar = decode6;
                            break;
                        case 8:
                            hVar = hVar4;
                            j11 = d11;
                            kt.r decode7 = kt.r.f35831d.decode(reader);
                            b0 b0Var11 = b0.f54756a;
                            rVar = decode7;
                            break;
                        case 9:
                            hVar = hVar4;
                            j11 = d11;
                            kt.v decode8 = kt.v.f35846i3.decode(reader);
                            b0 b0Var12 = b0.f54756a;
                            vVar = decode8;
                            break;
                        case 10:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var13 = b0.f54756a;
                            z15 = booleanValue5;
                            break;
                        case 11:
                            hVar = hVar4;
                            j11 = d11;
                            kt.p decode9 = kt.p.f35827d.decode(reader);
                            b0 b0Var14 = b0.f54756a;
                            pVar = decode9;
                            break;
                        case 12:
                            hVar = hVar4;
                            j11 = d11;
                            kt.m decode10 = kt.m.f35811e.decode(reader);
                            b0 b0Var15 = b0.f54756a;
                            mVar = decode10;
                            break;
                        case 13:
                            hVar = hVar4;
                            j11 = d11;
                            kt.e decode11 = kt.e.E.decode(reader);
                            b0 b0Var16 = b0.f54756a;
                            eVar = decode11;
                            break;
                        case 14:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var17 = b0.f54756a;
                            z16 = booleanValue6;
                            break;
                        case 15:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var18 = b0.f54756a;
                            z17 = booleanValue7;
                            break;
                        case 16:
                            hVar = hVar4;
                            j11 = d11;
                            kt.k decode12 = kt.k.f35794f.decode(reader);
                            b0 b0Var19 = b0.f54756a;
                            kVar = decode12;
                            break;
                        case 17:
                            hVar = hVar4;
                            j11 = d11;
                            kt.n decode13 = kt.n.f35816d.decode(reader);
                            b0 b0Var20 = b0.f54756a;
                            nVar = decode13;
                            break;
                        case 18:
                            hVar = hVar4;
                            j11 = d11;
                            kt.l decode14 = kt.l.f35800k.decode(reader);
                            b0 b0Var21 = b0.f54756a;
                            lVar = decode14;
                            break;
                        case 19:
                            hVar = hVar4;
                            j11 = d11;
                            kt.s decode15 = kt.s.f35835e.decode(reader);
                            b0 b0Var22 = b0.f54756a;
                            sVar = decode15;
                            break;
                        case 20:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var23 = b0.f54756a;
                            z18 = booleanValue8;
                            break;
                        case 21:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var24 = b0.f54756a;
                            z19 = booleanValue9;
                            break;
                        case 22:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var25 = b0.f54756a;
                            z21 = booleanValue10;
                            break;
                        case 23:
                            hVar = hVar4;
                            j11 = d11;
                            kt.c decode16 = kt.c.f35733e.decode(reader);
                            b0 b0Var26 = b0.f54756a;
                            cVar = decode16;
                            break;
                        case 24:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var27 = b0.f54756a;
                            z22 = booleanValue11;
                            break;
                        case 25:
                            hVar = hVar4;
                            j11 = d11;
                            int intValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            b0 b0Var28 = b0.f54756a;
                            i11 = intValue;
                            break;
                        case 26:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var29 = b0.f54756a;
                            z23 = booleanValue12;
                            break;
                        case 27:
                            hVar = hVar4;
                            j11 = d11;
                            Instant decode17 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var30 = b0.f54756a;
                            instant = decode17;
                            break;
                        case 28:
                            hVar = hVar4;
                            j11 = d11;
                            i decode18 = i.f39359o.decode(reader);
                            b0 b0Var31 = b0.f54756a;
                            iVar = decode18;
                            break;
                        case 29:
                            hVar = hVar4;
                            j11 = d11;
                            e decode19 = e.f39346f.decode(reader);
                            b0 b0Var32 = b0.f54756a;
                            eVar2 = decode19;
                            break;
                        case 30:
                            hVar = hVar4;
                            j11 = d11;
                            j decode20 = j.f39374e.decode(reader);
                            b0 b0Var33 = b0.f54756a;
                            jVar = decode20;
                            break;
                        case 31:
                            hVar = hVar4;
                            j11 = d11;
                            g decode21 = g.f39356c.decode(reader);
                            b0 b0Var34 = b0.f54756a;
                            gVar = decode21;
                            break;
                        case 32:
                            hVar = hVar4;
                            j11 = d11;
                            kt.j decode22 = kt.j.f35786h.decode(reader);
                            b0 b0Var35 = b0.f54756a;
                            jVar2 = decode22;
                            break;
                        case 33:
                            hVar = hVar4;
                            j11 = d11;
                            kt.d decode23 = kt.d.f35738q.decode(reader);
                            b0 b0Var36 = b0.f54756a;
                            dVar = decode23;
                            break;
                        case 34:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var37 = b0.f54756a;
                            z24 = booleanValue13;
                            break;
                        case 35:
                            hVar = hVar4;
                            j11 = d11;
                            f decode24 = f.f39352d.decode(reader);
                            b0 b0Var38 = b0.f54756a;
                            fVar = decode24;
                            break;
                        case 36:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var39 = b0.f54756a;
                            z25 = booleanValue14;
                            break;
                        case 37:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var40 = b0.f54756a;
                            z26 = booleanValue15;
                            break;
                        case 38:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var41 = b0.f54756a;
                            z27 = booleanValue16;
                            break;
                        case 39:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var42 = b0.f54756a;
                            z28 = booleanValue17;
                            break;
                        case 40:
                            hVar = hVar4;
                            j11 = d11;
                            l decode25 = l.f39379d.decode(reader);
                            b0 b0Var43 = b0.f54756a;
                            lVar2 = decode25;
                            break;
                        case 41:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var44 = b0.f54756a;
                            z29 = booleanValue18;
                            break;
                        case 42:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var45 = b0.f54756a;
                            z31 = booleanValue19;
                            break;
                        case 43:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue20 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var46 = b0.f54756a;
                            z32 = booleanValue20;
                            break;
                        case 44:
                            hVar = hVar4;
                            j11 = d11;
                            int intValue2 = ProtoAdapter.SINT32.decode(reader).intValue();
                            b0 b0Var47 = b0.f54756a;
                            i12 = intValue2;
                            break;
                        case 45:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue21 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var48 = b0.f54756a;
                            z33 = booleanValue21;
                            break;
                        case 46:
                            hVar = hVar4;
                            j11 = d11;
                            String decode26 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var49 = b0.f54756a;
                            str5 = decode26;
                            break;
                        case 47:
                            hVar = hVar4;
                            j11 = d11;
                            boolean booleanValue22 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var50 = b0.f54756a;
                            z34 = booleanValue22;
                            break;
                        case 48:
                            hVar = hVar4;
                            j11 = d11;
                            int intValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                            b0 b0Var51 = b0.f54756a;
                            i13 = intValue3;
                            break;
                        case 49:
                            hVar = hVar4;
                            j11 = d11;
                            String decode27 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var52 = b0.f54756a;
                            str6 = decode27;
                            break;
                        case 50:
                            h hVar5 = hVar4;
                            j11 = d11;
                            try {
                                hVar4 = h.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                hVar4 = hVar5;
                            }
                            b0 b0Var53 = b0.f54756a;
                            continue;
                            d11 = j11;
                        default:
                            switch (g11) {
                                case 54:
                                    hVar = hVar4;
                                    j11 = d11;
                                    try {
                                        aVar4 = a.ADAPTER.decode(reader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                    }
                                    b0 b0Var54 = b0.f54756a;
                                    break;
                                case 55:
                                    hVar = hVar4;
                                    j11 = d11;
                                    boolean booleanValue23 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var55 = b0.f54756a;
                                    z35 = booleanValue23;
                                    break;
                                case 56:
                                    hVar = hVar4;
                                    j11 = d11;
                                    boolean booleanValue24 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var56 = b0.f54756a;
                                    z36 = booleanValue24;
                                    break;
                                case 57:
                                    hVar = hVar4;
                                    j11 = d11;
                                    boolean booleanValue25 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var57 = b0.f54756a;
                                    z37 = booleanValue25;
                                    break;
                                case 58:
                                    hVar = hVar4;
                                    j11 = d11;
                                    boolean booleanValue26 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var58 = b0.f54756a;
                                    z38 = booleanValue26;
                                    break;
                                case 59:
                                    hVar = hVar4;
                                    j11 = d11;
                                    boolean booleanValue27 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var59 = b0.f54756a;
                                    z39 = booleanValue27;
                                    break;
                                case 60:
                                    hVar = hVar4;
                                    j11 = d11;
                                    String decode28 = ProtoAdapter.STRING.decode(reader);
                                    b0 b0Var60 = b0.f54756a;
                                    str = decode28;
                                    break;
                                case 61:
                                    hVar = hVar4;
                                    j11 = d11;
                                    Boolean decode29 = ProtoAdapter.BOOL.decode(reader);
                                    b0 b0Var61 = b0.f54756a;
                                    bool32 = decode29;
                                    break;
                                default:
                                    switch (g11) {
                                        case 103:
                                            hVar = hVar4;
                                            j11 = d11;
                                            Boolean decode30 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var62 = b0.f54756a;
                                            bool = decode30;
                                            break;
                                        case 104:
                                            hVar = hVar4;
                                            j11 = d11;
                                            Boolean decode31 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var63 = b0.f54756a;
                                            bool2 = decode31;
                                            break;
                                        case 105:
                                            hVar = hVar4;
                                            j11 = d11;
                                            Boolean decode32 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var64 = b0.f54756a;
                                            bool3 = decode32;
                                            break;
                                        case 106:
                                            hVar = hVar4;
                                            j11 = d11;
                                            Boolean decode33 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var65 = b0.f54756a;
                                            bool4 = decode33;
                                            break;
                                        default:
                                            switch (g11) {
                                                case 120:
                                                    hVar = hVar4;
                                                    j11 = d11;
                                                    Boolean decode34 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var66 = b0.f54756a;
                                                    bool8 = decode34;
                                                    break;
                                                case 121:
                                                    hVar = hVar4;
                                                    j11 = d11;
                                                    Boolean decode35 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var67 = b0.f54756a;
                                                    bool9 = decode35;
                                                    break;
                                                case 122:
                                                    hVar = hVar4;
                                                    j11 = d11;
                                                    Boolean decode36 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var68 = b0.f54756a;
                                                    bool10 = decode36;
                                                    break;
                                                default:
                                                    switch (g11) {
                                                        case 124:
                                                            hVar = hVar4;
                                                            j11 = d11;
                                                            Boolean decode37 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var69 = b0.f54756a;
                                                            bool11 = decode37;
                                                            break;
                                                        case 125:
                                                            hVar = hVar4;
                                                            j11 = d11;
                                                            Integer decode38 = ProtoAdapter.UINT32.decode(reader);
                                                            b0 b0Var70 = b0.f54756a;
                                                            num = decode38;
                                                            break;
                                                        case 126:
                                                            hVar = hVar4;
                                                            j11 = d11;
                                                            Boolean decode39 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var71 = b0.f54756a;
                                                            bool12 = decode39;
                                                            break;
                                                        default:
                                                            switch (g11) {
                                                                case 136:
                                                                    hVar = hVar4;
                                                                    j11 = d11;
                                                                    Boolean decode40 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var72 = b0.f54756a;
                                                                    bool14 = decode40;
                                                                    break;
                                                                case 137:
                                                                    hVar = hVar4;
                                                                    j11 = d11;
                                                                    Boolean decode41 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var73 = b0.f54756a;
                                                                    bool15 = decode41;
                                                                    break;
                                                                case 138:
                                                                    hVar = hVar4;
                                                                    j11 = d11;
                                                                    Boolean decode42 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var74 = b0.f54756a;
                                                                    bool16 = decode42;
                                                                    break;
                                                                case 139:
                                                                    hVar = hVar4;
                                                                    j11 = d11;
                                                                    Boolean decode43 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var75 = b0.f54756a;
                                                                    bool17 = decode43;
                                                                    break;
                                                                default:
                                                                    switch (g11) {
                                                                        case 141:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Boolean decode44 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var76 = b0.f54756a;
                                                                            bool18 = decode44;
                                                                            break;
                                                                        case 142:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Boolean decode45 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var77 = b0.f54756a;
                                                                            bool19 = decode45;
                                                                            break;
                                                                        case 143:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Boolean decode46 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var78 = b0.f54756a;
                                                                            bool20 = decode46;
                                                                            break;
                                                                        case 144:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Integer decode47 = ProtoAdapter.SINT32.decode(reader);
                                                                            b0 b0Var79 = b0.f54756a;
                                                                            num2 = decode47;
                                                                            break;
                                                                        case 145:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Boolean decode48 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var80 = b0.f54756a;
                                                                            bool21 = decode48;
                                                                            break;
                                                                        case 146:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            String decode49 = ProtoAdapter.STRING.decode(reader);
                                                                            b0 b0Var81 = b0.f54756a;
                                                                            str2 = decode49;
                                                                            break;
                                                                        case 147:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Boolean decode50 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var82 = b0.f54756a;
                                                                            bool22 = decode50;
                                                                            break;
                                                                        case 148:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            Integer decode51 = ProtoAdapter.UINT32.decode(reader);
                                                                            b0 b0Var83 = b0.f54756a;
                                                                            num3 = decode51;
                                                                            break;
                                                                        case 149:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            String decode52 = ProtoAdapter.STRING.decode(reader);
                                                                            b0 b0Var84 = b0.f54756a;
                                                                            str3 = decode52;
                                                                            break;
                                                                        case 150:
                                                                            hVar = hVar4;
                                                                            j11 = d11;
                                                                            try {
                                                                                hVar3 = h.ADAPTER.decode(reader);
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                                                                            }
                                                                            b0 b0Var85 = b0.f54756a;
                                                                            break;
                                                                        default:
                                                                            switch (g11) {
                                                                                case 154:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    try {
                                                                                        aVar3 = a.ADAPTER.decode(reader);
                                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                                                                                    }
                                                                                    b0 b0Var86 = b0.f54756a;
                                                                                    break;
                                                                                case 155:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode53 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var87 = b0.f54756a;
                                                                                    bool23 = decode53;
                                                                                    break;
                                                                                case 156:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode54 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var88 = b0.f54756a;
                                                                                    bool24 = decode54;
                                                                                    break;
                                                                                case 157:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode55 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var89 = b0.f54756a;
                                                                                    bool25 = decode55;
                                                                                    break;
                                                                                case 158:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode56 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var90 = b0.f54756a;
                                                                                    bool26 = decode56;
                                                                                    break;
                                                                                case 159:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode57 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var91 = b0.f54756a;
                                                                                    bool27 = decode57;
                                                                                    break;
                                                                                case 160:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    String decode58 = ProtoAdapter.STRING.decode(reader);
                                                                                    b0 b0Var92 = b0.f54756a;
                                                                                    str4 = decode58;
                                                                                    break;
                                                                                case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode59 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var93 = b0.f54756a;
                                                                                    bool28 = decode59;
                                                                                    break;
                                                                                case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode60 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var94 = b0.f54756a;
                                                                                    bool29 = decode60;
                                                                                    break;
                                                                                case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode61 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var95 = b0.f54756a;
                                                                                    bool30 = decode61;
                                                                                    break;
                                                                                case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                                                                    hVar = hVar4;
                                                                                    j11 = d11;
                                                                                    Boolean decode62 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var96 = b0.f54756a;
                                                                                    bool31 = decode62;
                                                                                    break;
                                                                                case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                                                                    try {
                                                                                        kVar2 = k.ADAPTER.decode(reader);
                                                                                        hVar = hVar4;
                                                                                        j11 = d11;
                                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                                                        hVar = hVar4;
                                                                                        j11 = d11;
                                                                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                                                                                    }
                                                                                    b0 b0Var97 = b0.f54756a;
                                                                                    break;
                                                                                default:
                                                                                    reader.m(g11);
                                                                                    b0 b0Var98 = b0.f54756a;
                                                                                    j11 = d11;
                                                                                    continue;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                            d11 = j11;
                    }
                } else {
                    hVar = hVar4;
                    j11 = d11;
                    Boolean decode63 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var99 = b0.f54756a;
                    bool7 = decode63;
                }
                hVar4 = hVar;
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, u value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.J0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.J0()));
            }
            if (value.l0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.l0()));
            }
            if (value.N()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.N()));
            }
            if (value.j()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.j()));
            }
            if (value.G()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.G()));
            }
            if (value.s0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.s0()));
            }
            if (value.j0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 15, Boolean.valueOf(value.j0()));
            }
            if (value.w()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.w()));
            }
            if (value.z()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 21, Boolean.valueOf(value.z()));
            }
            if (value.e0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.e0()));
            }
            if (value.h()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 24, Boolean.valueOf(value.h()));
            }
            if (value.a0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 25, Integer.valueOf(value.a0()));
            }
            if (value.c0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 26, Boolean.valueOf(value.c0()));
            }
            if (value.s()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 34, Boolean.valueOf(value.s()));
            }
            if (value.z0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.z0()));
            }
            if (value.w0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 37, Boolean.valueOf(value.w0()));
            }
            if (value.X()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 38, Boolean.valueOf(value.X()));
            }
            if (value.S0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 39, Boolean.valueOf(value.S0()));
            }
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 41, Boolean.valueOf(value.f()));
            }
            if (value.q()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 42, Boolean.valueOf(value.q()));
            }
            if (value.P()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 43, Boolean.valueOf(value.P()));
            }
            if (value.L0() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 44, Integer.valueOf(value.L0()));
            }
            if (value.R()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 45, Boolean.valueOf(value.R()));
            }
            if (value.H0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 47, Boolean.valueOf(value.H0()));
            }
            if (value.N0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 48, Integer.valueOf(value.N0()));
            }
            if (!kotlin.jvm.internal.s.c(value.g0(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 46, value.g0());
            }
            if (!kotlin.jvm.internal.s.c(value.C(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 49, value.C());
            }
            if (value.V() != h.HeadlampTypePremium) {
                h.ADAPTER.encodeWithTag(writer, 50, value.V());
            }
            if (value.d() != a.AuxParkLampsNaBase) {
                a.ADAPTER.encodeWithTag(writer, 54, value.d());
            }
            if (value.V0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 55, Boolean.valueOf(value.V0()));
            }
            if (value.I()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 56, Boolean.valueOf(value.I()));
            }
            if (value.L()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 57, Boolean.valueOf(value.L()));
            }
            if (value.T()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 58, Boolean.valueOf(value.T()));
            }
            if (value.D0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 59, Boolean.valueOf(value.D0()));
            }
            if (!kotlin.jvm.internal.s.c(value.P0(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 60, value.P0());
            }
            if (value.k() != null) {
                kt.t.f35840e.encodeWithTag(writer, 1, value.k());
            }
            if (value.l() != null) {
                kt.a.Q.encodeWithTag(writer, 2, value.l());
            }
            if (value.m() != null) {
                b.f39337i.encodeWithTag(writer, 7, value.m());
            }
            if (value.B0() != null) {
                kt.r.f35831d.encodeWithTag(writer, 8, value.B0());
            }
            if (value.T0() != null) {
                kt.v.f35846i3.encodeWithTag(writer, 9, value.T0());
            }
            if (value.x0() != null) {
                kt.p.f35827d.encodeWithTag(writer, 11, value.x0());
            }
            if (value.t0() != null) {
                kt.m.f35811e.encodeWithTag(writer, 12, value.t0());
            }
            if (value.A() != null) {
                kt.e.E.encodeWithTag(writer, 13, value.A());
            }
            if (value.n0() != null) {
                kt.k.f35794f.encodeWithTag(writer, 16, value.n0());
            }
            if (value.u0() != null) {
                kt.n.f35816d.encodeWithTag(writer, 17, value.u0());
            }
            if (value.o0() != null) {
                kt.l.f35800k.encodeWithTag(writer, 18, value.o0());
            }
            if (value.E0() != null) {
                kt.s.f35835e.encodeWithTag(writer, 19, value.E0());
            }
            if (value.n() != null) {
                kt.c.f35733e.encodeWithTag(writer, 23, value.n());
            }
            if (value.F0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 27, value.F0());
            }
            if (value.Y() != null) {
                i.f39359o.encodeWithTag(writer, 28, value.Y());
            }
            if (value.u() != null) {
                e.f39346f.encodeWithTag(writer, 29, value.u());
            }
            if (value.h0() != null) {
                j.f39374e.encodeWithTag(writer, 30, value.h0());
            }
            if (value.E() != null) {
                g.f39356c.encodeWithTag(writer, 31, value.E());
            }
            if (value.m0() != null) {
                kt.j.f35786h.encodeWithTag(writer, 32, value.m0());
            }
            if (value.x() != null) {
                kt.d.f35738q.encodeWithTag(writer, 33, value.x());
            }
            if (value.D() != null) {
                f.f39352d.encodeWithTag(writer, 35, value.D());
            }
            if (value.A0() != null) {
                l.f39379d.encodeWithTag(writer, 40, value.A0());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 103, value.I0());
            protoAdapter.encodeWithTag(writer, 104, value.k0());
            protoAdapter.encodeWithTag(writer, 105, value.M());
            protoAdapter.encodeWithTag(writer, 106, value.i());
            protoAdapter.encodeWithTag(writer, 110, value.F());
            protoAdapter.encodeWithTag(writer, 114, value.r0());
            protoAdapter.encodeWithTag(writer, 115, value.i0());
            protoAdapter.encodeWithTag(writer, 120, value.v());
            protoAdapter.encodeWithTag(writer, 121, value.y());
            protoAdapter.encodeWithTag(writer, 122, value.d0());
            protoAdapter.encodeWithTag(writer, 124, value.g());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(writer, 125, value.Z());
            protoAdapter.encodeWithTag(writer, 126, value.b0());
            protoAdapter.encodeWithTag(writer, 134, value.r());
            protoAdapter.encodeWithTag(writer, 136, value.y0());
            protoAdapter.encodeWithTag(writer, 137, value.v0());
            protoAdapter.encodeWithTag(writer, 138, value.W());
            protoAdapter.encodeWithTag(writer, 139, value.R0());
            protoAdapter.encodeWithTag(writer, 141, value.e());
            protoAdapter.encodeWithTag(writer, 142, value.p());
            protoAdapter.encodeWithTag(writer, 143, value.O());
            ProtoAdapter.SINT32.encodeWithTag(writer, 144, value.K0());
            protoAdapter.encodeWithTag(writer, 145, value.Q());
            protoAdapter.encodeWithTag(writer, 147, value.G0());
            protoAdapter2.encodeWithTag(writer, 148, value.M0());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(writer, 146, value.f0());
            protoAdapter3.encodeWithTag(writer, 149, value.B());
            h.ADAPTER.encodeWithTag(writer, 150, value.U());
            a.ADAPTER.encodeWithTag(writer, 154, value.c());
            protoAdapter.encodeWithTag(writer, 155, value.U0());
            protoAdapter.encodeWithTag(writer, 156, value.H());
            protoAdapter.encodeWithTag(writer, 157, value.K());
            protoAdapter.encodeWithTag(writer, 158, value.S());
            protoAdapter.encodeWithTag(writer, 159, value.C0());
            protoAdapter3.encodeWithTag(writer, 160, value.O0());
            protoAdapter.encodeWithTag(writer, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, value.t());
            protoAdapter.encodeWithTag(writer, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, value.Q0());
            protoAdapter.encodeWithTag(writer, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, value.o());
            protoAdapter.encodeWithTag(writer, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, value.J());
            protoAdapter.encodeWithTag(writer, 61, value.q0());
            k.ADAPTER.encodeWithTag(writer, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, value.p0());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(u value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.J0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.J0()));
            }
            if (value.l0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.l0()));
            }
            if (value.N()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.N()));
            }
            if (value.j()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.j()));
            }
            if (value.G()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.G()));
            }
            if (value.s0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.s0()));
            }
            if (value.j0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.j0()));
            }
            if (value.w()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.w()));
            }
            if (value.z()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.z()));
            }
            if (value.e0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.e0()));
            }
            if (value.h()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.h()));
            }
            if (value.a0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(25, Integer.valueOf(value.a0()));
            }
            if (value.c0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(26, Boolean.valueOf(value.c0()));
            }
            if (value.s()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(34, Boolean.valueOf(value.s()));
            }
            if (value.z0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.z0()));
            }
            if (value.w0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(37, Boolean.valueOf(value.w0()));
            }
            if (value.X()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(38, Boolean.valueOf(value.X()));
            }
            if (value.S0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(39, Boolean.valueOf(value.S0()));
            }
            if (value.f()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.f()));
            }
            if (value.q()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.q()));
            }
            if (value.P()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(43, Boolean.valueOf(value.P()));
            }
            if (value.L0() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(44, Integer.valueOf(value.L0()));
            }
            if (value.R()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(45, Boolean.valueOf(value.R()));
            }
            if (value.H0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(47, Boolean.valueOf(value.H0()));
            }
            if (value.N0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(48, Integer.valueOf(value.N0()));
            }
            if (!kotlin.jvm.internal.s.c(value.g0(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(46, value.g0());
            }
            if (!kotlin.jvm.internal.s.c(value.C(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(49, value.C());
            }
            if (value.V() != h.HeadlampTypePremium) {
                z11 += h.ADAPTER.encodedSizeWithTag(50, value.V());
            }
            if (value.d() != a.AuxParkLampsNaBase) {
                z11 += a.ADAPTER.encodedSizeWithTag(54, value.d());
            }
            if (value.V0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(55, Boolean.valueOf(value.V0()));
            }
            if (value.I()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(56, Boolean.valueOf(value.I()));
            }
            if (value.L()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(57, Boolean.valueOf(value.L()));
            }
            if (value.T()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(58, Boolean.valueOf(value.T()));
            }
            if (value.D0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(59, Boolean.valueOf(value.D0()));
            }
            if (!kotlin.jvm.internal.s.c(value.P0(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(60, value.P0());
            }
            if (value.k() != null) {
                z11 += kt.t.f35840e.encodedSizeWithTag(1, value.k());
            }
            if (value.l() != null) {
                z11 += kt.a.Q.encodedSizeWithTag(2, value.l());
            }
            if (value.m() != null) {
                z11 += b.f39337i.encodedSizeWithTag(7, value.m());
            }
            if (value.B0() != null) {
                z11 += kt.r.f35831d.encodedSizeWithTag(8, value.B0());
            }
            if (value.T0() != null) {
                z11 += kt.v.f35846i3.encodedSizeWithTag(9, value.T0());
            }
            if (value.x0() != null) {
                z11 += kt.p.f35827d.encodedSizeWithTag(11, value.x0());
            }
            if (value.t0() != null) {
                z11 += kt.m.f35811e.encodedSizeWithTag(12, value.t0());
            }
            if (value.A() != null) {
                z11 += kt.e.E.encodedSizeWithTag(13, value.A());
            }
            if (value.n0() != null) {
                z11 += kt.k.f35794f.encodedSizeWithTag(16, value.n0());
            }
            if (value.u0() != null) {
                z11 += kt.n.f35816d.encodedSizeWithTag(17, value.u0());
            }
            if (value.o0() != null) {
                z11 += kt.l.f35800k.encodedSizeWithTag(18, value.o0());
            }
            if (value.E0() != null) {
                z11 += kt.s.f35835e.encodedSizeWithTag(19, value.E0());
            }
            if (value.n() != null) {
                z11 += kt.c.f35733e.encodedSizeWithTag(23, value.n());
            }
            if (value.F0() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(27, value.F0());
            }
            if (value.Y() != null) {
                z11 += i.f39359o.encodedSizeWithTag(28, value.Y());
            }
            if (value.u() != null) {
                z11 += e.f39346f.encodedSizeWithTag(29, value.u());
            }
            if (value.h0() != null) {
                z11 += j.f39374e.encodedSizeWithTag(30, value.h0());
            }
            if (value.E() != null) {
                z11 += g.f39356c.encodedSizeWithTag(31, value.E());
            }
            if (value.m0() != null) {
                z11 += kt.j.f35786h.encodedSizeWithTag(32, value.m0());
            }
            if (value.x() != null) {
                z11 += kt.d.f35738q.encodedSizeWithTag(33, value.x());
            }
            if (value.D() != null) {
                z11 += f.f39352d.encodedSizeWithTag(35, value.D());
            }
            if (value.A0() != null) {
                z11 += l.f39379d.encodedSizeWithTag(40, value.A0());
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(103, value.I0()) + protoAdapter.encodedSizeWithTag(104, value.k0()) + protoAdapter.encodedSizeWithTag(105, value.M()) + protoAdapter.encodedSizeWithTag(106, value.i()) + protoAdapter.encodedSizeWithTag(110, value.F()) + protoAdapter.encodedSizeWithTag(114, value.r0()) + protoAdapter.encodedSizeWithTag(115, value.i0()) + protoAdapter.encodedSizeWithTag(120, value.v()) + protoAdapter.encodedSizeWithTag(121, value.y()) + protoAdapter.encodedSizeWithTag(122, value.d0()) + protoAdapter.encodedSizeWithTag(124, value.g());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(125, value.Z()) + protoAdapter.encodedSizeWithTag(126, value.b0()) + protoAdapter.encodedSizeWithTag(134, value.r()) + protoAdapter.encodedSizeWithTag(136, value.y0()) + protoAdapter.encodedSizeWithTag(137, value.v0()) + protoAdapter.encodedSizeWithTag(138, value.W()) + protoAdapter.encodedSizeWithTag(139, value.R0()) + protoAdapter.encodedSizeWithTag(141, value.e()) + protoAdapter.encodedSizeWithTag(142, value.p()) + protoAdapter.encodedSizeWithTag(143, value.O()) + ProtoAdapter.SINT32.encodedSizeWithTag(144, value.K0()) + protoAdapter.encodedSizeWithTag(145, value.Q()) + protoAdapter.encodedSizeWithTag(147, value.G0()) + protoAdapter2.encodedSizeWithTag(148, value.M0());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(146, value.f0()) + protoAdapter3.encodedSizeWithTag(149, value.B()) + h.ADAPTER.encodedSizeWithTag(150, value.U()) + a.ADAPTER.encodedSizeWithTag(154, value.c()) + protoAdapter.encodedSizeWithTag(155, value.U0()) + protoAdapter.encodedSizeWithTag(156, value.H()) + protoAdapter.encodedSizeWithTag(157, value.K()) + protoAdapter.encodedSizeWithTag(158, value.S()) + protoAdapter.encodedSizeWithTag(159, value.C0()) + protoAdapter3.encodedSizeWithTag(160, value.O0()) + protoAdapter.encodedSizeWithTag(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, value.t()) + protoAdapter.encodedSizeWithTag(CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, value.Q0()) + protoAdapter.encodedSizeWithTag(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, value.o()) + protoAdapter.encodedSizeWithTag(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, value.J()) + protoAdapter.encodedSizeWithTag(61, value.q0()) + k.ADAPTER.encodedSizeWithTag(CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, value.p0());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public u redact(u value) {
            kotlin.jvm.internal.s.g(value, "value");
            kt.t k11 = value.k();
            kt.t redact = k11 == null ? null : kt.t.f35840e.redact(k11);
            kt.a l11 = value.l();
            kt.a redact2 = l11 == null ? null : kt.a.Q.redact(l11);
            b m11 = value.m();
            b redact3 = m11 == null ? null : b.f39337i.redact(m11);
            kt.r B0 = value.B0();
            kt.r redact4 = B0 == null ? null : kt.r.f35831d.redact(B0);
            kt.v T0 = value.T0();
            kt.v redact5 = T0 == null ? null : kt.v.f35846i3.redact(T0);
            kt.p x02 = value.x0();
            kt.p redact6 = x02 == null ? null : kt.p.f35827d.redact(x02);
            kt.m t02 = value.t0();
            kt.m redact7 = t02 == null ? null : kt.m.f35811e.redact(t02);
            kt.e A = value.A();
            kt.e redact8 = A == null ? null : kt.e.E.redact(A);
            kt.k n02 = value.n0();
            kt.k redact9 = n02 == null ? null : kt.k.f35794f.redact(n02);
            kt.n u02 = value.u0();
            kt.n redact10 = u02 == null ? null : kt.n.f35816d.redact(u02);
            kt.l o02 = value.o0();
            kt.l redact11 = o02 == null ? null : kt.l.f35800k.redact(o02);
            kt.s E0 = value.E0();
            kt.s redact12 = E0 == null ? null : kt.s.f35835e.redact(E0);
            kt.c n11 = value.n();
            kt.c redact13 = n11 == null ? null : kt.c.f35733e.redact(n11);
            Instant F0 = value.F0();
            Instant redact14 = F0 == null ? null : ProtoAdapter.INSTANT.redact(F0);
            i Y = value.Y();
            i redact15 = Y == null ? null : i.f39359o.redact(Y);
            e u11 = value.u();
            e redact16 = u11 == null ? null : e.f39346f.redact(u11);
            j h02 = value.h0();
            j redact17 = h02 == null ? null : j.f39374e.redact(h02);
            g E = value.E();
            g redact18 = E == null ? null : g.f39356c.redact(E);
            kt.j m02 = value.m0();
            kt.j redact19 = m02 == null ? null : kt.j.f35786h.redact(m02);
            kt.d x11 = value.x();
            kt.d redact20 = x11 == null ? null : kt.d.f35738q.redact(x11);
            f D = value.D();
            f redact21 = D == null ? null : f.f39352d.redact(D);
            l A0 = value.A0();
            return u.b(value, false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, false, 0, false, false, 0, null, null, null, null, false, false, false, false, false, null, redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, redact14, redact15, redact16, redact17, redact18, redact19, redact20, redact21, A0 == null ? null : l.f39379d.redact(A0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, -1, -33554425, -1, 3, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends com.squareup.wire.f {

        /* renamed from: f */
        public static final ProtoAdapter<e> f39346f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39347a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39348b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39349c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "ParkerPascal25", tag = 4)

        /* renamed from: d */
        private final kt.u f39350d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39351e;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.DriverAssist", oVar, (Object) null);
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
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(uVar, uVar2, uVar3, uVar4, uVar5, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 == 3) {
                        uVar3 = kt.u.f35845a.decode(reader);
                    } else if (g11 == 4) {
                        uVar4 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 5) {
                        reader.m(g11);
                    } else {
                        uVar5 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, e value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.c());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.d());
                protoAdapter.encodeWithTag(writer, 4, value.e());
                protoAdapter.encodeWithTag(writer, 5, value.f());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.e()) + protoAdapter.encodedSizeWithTag(5, value.f());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public e redact(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u c11 = value.c();
                kt.u redact = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                kt.u redact3 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u e11 = value.e();
                kt.u redact4 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u f11 = value.f();
                return value.a(redact, redact2, redact3, redact4, f11 != null ? kt.u.f35845a.redact(f11) : null, okio.i.f42656d);
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
            f39346f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), com.squareup.wire.o.PROTO_3);
        }

        public e() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) == 0 ? uVar5 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
        }

        public final e a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new e(uVar, uVar2, uVar3, uVar4, uVar5, unknownFields);
        }

        public final kt.u b() {
            return this.f39348b;
        }

        public final kt.u c() {
            return this.f39347a;
        }

        public final kt.u d() {
            return this.f39349c;
        }

        public final kt.u e() {
            return this.f39350d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39347a, eVar.f39347a) && kotlin.jvm.internal.s.c(this.f39348b, eVar.f39348b) && kotlin.jvm.internal.s.c(this.f39349c, eVar.f39349c) && kotlin.jvm.internal.s.c(this.f39350d, eVar.f39350d) && kotlin.jvm.internal.s.c(this.f39351e, eVar.f39351e);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39351e;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39347a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39348b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39349c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39350d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39351e;
                int hashCode6 = hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m801newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39347a;
            if (uVar != null) {
                arrayList.add("None=" + uVar);
            }
            kt.u uVar2 = this.f39348b;
            if (uVar2 != null) {
                arrayList.add("MonoCam=" + uVar2);
            }
            kt.u uVar3 = this.f39349c;
            if (uVar3 != null) {
                arrayList.add("ParkerPascal=" + uVar3);
            }
            kt.u uVar4 = this.f39350d;
            if (uVar4 != null) {
                arrayList.add("ParkerPascal2_5=" + uVar4);
            }
            kt.u uVar5 = this.f39351e;
            if (uVar5 != null) {
                arrayList.add("TeslaAP3=" + uVar5);
            }
            l02 = e0.l0(arrayList, ", ", "DriverAssist{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m801newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            super(f39346f, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39347a = uVar;
            this.f39348b = uVar2;
            this.f39349c = uVar3;
            this.f39350d = uVar4;
            this.f39351e = uVar5;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1)) {
                throw new IllegalArgumentException("At most one of None, MonoCam, ParkerPascal, ParkerPascal2_5, TeslaAP3 may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends com.squareup.wire.f {

        /* renamed from: d */
        public static final ProtoAdapter<f> f39352d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: a */
        private final kt.u f39353a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "STANDARDCHROME", tag = 3)

        /* renamed from: b */
        private final kt.u f39354b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "SATINBLACK", tag = 4)

        /* renamed from: c */
        private final kt.u f39355c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<f> {
            a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.ExteriorTrimType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public f decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new f(uVar, uVar2, uVar3, reader.e(d11));
                    } else if (g11 == 2) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 3) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 4) {
                        reader.m(g11);
                    } else {
                        uVar3 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, f value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.c());
                protoAdapter.encodeWithTag(writer, 4, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.c()) + protoAdapter.encodedSizeWithTag(4, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public f redact(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u d11 = value.d();
                kt.u redact = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u c11 = value.c();
                kt.u redact2 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                return value.a(redact, redact2, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
            f39352d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), com.squareup.wire.o.PROTO_3);
        }

        public f() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ f(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
        }

        public final f a(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new f(uVar, uVar2, uVar3, unknownFields);
        }

        public final kt.u b() {
            return this.f39355c;
        }

        public final kt.u c() {
            return this.f39354b;
        }

        public final kt.u d() {
            return this.f39353a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), fVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39353a, fVar.f39353a) && kotlin.jvm.internal.s.c(this.f39354b, fVar.f39354b) && kotlin.jvm.internal.s.c(this.f39355c, fVar.f39355c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39353a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39354b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39355c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m802newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39353a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39354b;
            if (uVar2 != null) {
                arrayList.add("STANDARD_CHROME=" + uVar2);
            }
            kt.u uVar3 = this.f39355c;
            if (uVar3 != null) {
                arrayList.add("SATIN_BLACK=" + uVar3);
            }
            l02 = e0.l0(arrayList, ", ", "ExteriorTrimType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m802newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            super(f39352d, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39353a = uVar;
            this.f39354b = uVar2;
            this.f39355c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, STANDARD_CHROME, SATIN_BLACK may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<g> f39356c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39357a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39358b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<g> {
            a(com.squareup.wire.b bVar, n00.d<g> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.FrontDriveUnit", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public g decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new g(uVar, uVar2, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, g value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(g value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public g redact(g value) {
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
            f39356c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), com.squareup.wire.o.PROTO_3);
        }

        public g() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ g(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final g a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new g(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39357a;
        }

        public final kt.u c() {
            return this.f39358b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), gVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39357a, gVar.f39357a) && kotlin.jvm.internal.s.c(this.f39358b, gVar.f39358b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39357a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39358b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m803newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39357a;
            if (uVar != null) {
                arrayList.add("NoneOrSmall=" + uVar);
            }
            kt.u uVar2 = this.f39358b;
            if (uVar2 != null) {
                arrayList.add("PermanentMagnet=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "FrontDriveUnit{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m803newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39356c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39357a = uVar;
            this.f39358b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of NoneOrSmall, PermanentMagnet may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum h implements com.squareup.wire.p {
        HeadlampTypePremium(0),
        HeadlampTypeGlobal(1),
        HeadlampTypeHalogen(2),
        HeadlampTypeHid(3),
        HeadlampTypeLed(4);
        
        public static final ProtoAdapter<h> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<h> {
            a(n00.d<h> dVar, com.squareup.wire.o oVar, h hVar) {
                super(dVar, oVar, hVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public h d(int i11) {
                return h.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final h a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return null;
                                }
                                return h.HeadlampTypeLed;
                            }
                            return h.HeadlampTypeHid;
                        }
                        return h.HeadlampTypeHalogen;
                    }
                    return h.HeadlampTypeGlobal;
                }
                return h.HeadlampTypePremium;
            }
        }

        static {
            h hVar;
            ADAPTER = new a(m0.b(h.class), com.squareup.wire.o.PROTO_3, hVar);
        }

        h(int i11) {
            this.value = i11;
        }

        public static final h fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends com.squareup.wire.f {

        /* renamed from: o */
        public static final ProtoAdapter<i> f39359o;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: a */
        private final kt.u f39360a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: b */
        private final kt.u f39361b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: c */
        private final kt.u f39362c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "BLACKCONSOLE2", tag = 6)

        /* renamed from: d */
        private final kt.u f39363d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "WHITECONSOLE2", tag = 7)

        /* renamed from: e */
        private final kt.u f39364e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "ALLBLACK", tag = 8)

        /* renamed from: f */
        private final kt.u f39365f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "BLACKANDWHITE", tag = 9)

        /* renamed from: g */
        private final kt.u f39366g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

        /* renamed from: h */
        private final kt.u f39367h;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "WALNUTCREAM", tag = 12)

        /* renamed from: i */
        private final kt.u f39368i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "WALNUTWHITE", tag = 13)

        /* renamed from: j */
        private final kt.u f39369j;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "EBONYBLACK", tag = 14)

        /* renamed from: k */
        private final kt.u f39370k;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARBONCREAM", tag = 15)

        /* renamed from: l */
        private final kt.u f39371l;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARBONWHITE", tag = 16)

        /* renamed from: m */
        private final kt.u f39372m;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "CARBONBLACK", tag = 17)

        /* renamed from: n */
        private final kt.u f39373n;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<i> {
            a(com.squareup.wire.b bVar, n00.d<i> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.InteriorTrimType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public i decode(com.squareup.wire.k reader) {
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
                kt.u uVar11 = null;
                kt.u uVar12 = null;
                kt.u uVar13 = null;
                kt.u uVar14 = null;
                while (true) {
                    int g11 = reader.g();
                    kt.u uVar15 = uVar12;
                    if (g11 == -1) {
                        return new i(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar15, uVar14, uVar13, reader.e(d11));
                    }
                    switch (g11) {
                        case 3:
                            uVar = kt.u.f35845a.decode(reader);
                            break;
                        case 4:
                            uVar2 = kt.u.f35845a.decode(reader);
                            break;
                        case 5:
                            uVar3 = kt.u.f35845a.decode(reader);
                            break;
                        case 6:
                            uVar4 = kt.u.f35845a.decode(reader);
                            break;
                        case 7:
                            uVar5 = kt.u.f35845a.decode(reader);
                            break;
                        case 8:
                            uVar6 = kt.u.f35845a.decode(reader);
                            break;
                        case 9:
                            uVar7 = kt.u.f35845a.decode(reader);
                            break;
                        case 10:
                            uVar8 = kt.u.f35845a.decode(reader);
                            break;
                        case 11:
                        default:
                            reader.m(g11);
                            break;
                        case 12:
                            uVar9 = kt.u.f35845a.decode(reader);
                            break;
                        case 13:
                            uVar10 = kt.u.f35845a.decode(reader);
                            break;
                        case 14:
                            uVar11 = kt.u.f35845a.decode(reader);
                            break;
                        case 15:
                            uVar12 = kt.u.f35845a.decode(reader);
                            continue;
                        case 16:
                            uVar14 = kt.u.f35845a.decode(reader);
                            break;
                        case 17:
                            uVar13 = kt.u.f35845a.decode(reader);
                            break;
                    }
                    uVar12 = uVar15;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, i value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 3, value.k());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                protoAdapter.encodeWithTag(writer, 5, value.n());
                protoAdapter.encodeWithTag(writer, 6, value.e());
                protoAdapter.encodeWithTag(writer, 7, value.o());
                protoAdapter.encodeWithTag(writer, 8, value.b());
                protoAdapter.encodeWithTag(writer, 9, value.d());
                protoAdapter.encodeWithTag(writer, 10, value.i());
                protoAdapter.encodeWithTag(writer, 12, value.l());
                protoAdapter.encodeWithTag(writer, 13, value.m());
                protoAdapter.encodeWithTag(writer, 14, value.j());
                protoAdapter.encodeWithTag(writer, 15, value.g());
                protoAdapter.encodeWithTag(writer, 16, value.h());
                protoAdapter.encodeWithTag(writer, 17, value.f());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(i value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(3, value.k()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.n()) + protoAdapter.encodedSizeWithTag(6, value.e()) + protoAdapter.encodedSizeWithTag(7, value.o()) + protoAdapter.encodedSizeWithTag(8, value.b()) + protoAdapter.encodedSizeWithTag(9, value.d()) + protoAdapter.encodedSizeWithTag(10, value.i()) + protoAdapter.encodedSizeWithTag(12, value.l()) + protoAdapter.encodedSizeWithTag(13, value.m()) + protoAdapter.encodedSizeWithTag(14, value.j()) + protoAdapter.encodedSizeWithTag(15, value.g()) + protoAdapter.encodedSizeWithTag(16, value.h()) + protoAdapter.encodedSizeWithTag(17, value.f());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public i redact(i value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u k11 = value.k();
                kt.u redact = k11 == null ? null : kt.u.f35845a.redact(k11);
                kt.u c11 = value.c();
                kt.u redact2 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u n11 = value.n();
                kt.u redact3 = n11 == null ? null : kt.u.f35845a.redact(n11);
                kt.u e11 = value.e();
                kt.u redact4 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u o11 = value.o();
                kt.u redact5 = o11 == null ? null : kt.u.f35845a.redact(o11);
                kt.u b11 = value.b();
                kt.u redact6 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                kt.u redact7 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u i11 = value.i();
                kt.u redact8 = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u l11 = value.l();
                kt.u redact9 = l11 == null ? null : kt.u.f35845a.redact(l11);
                kt.u m11 = value.m();
                kt.u redact10 = m11 == null ? null : kt.u.f35845a.redact(m11);
                kt.u j11 = value.j();
                kt.u redact11 = j11 == null ? null : kt.u.f35845a.redact(j11);
                kt.u g11 = value.g();
                kt.u redact12 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u h11 = value.h();
                kt.u redact13 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u f11 = value.f();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, redact12, redact13, f11 != null ? kt.u.f35845a.redact(f11) : null, okio.i.f42656d);
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
            f39359o = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), com.squareup.wire.o.PROTO_3);
        }

        public i() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }

        public /* synthetic */ i(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) != 0 ? null : uVar10, (i11 & 1024) != 0 ? null : uVar11, (i11 & 2048) != 0 ? null : uVar12, (i11 & 4096) != 0 ? null : uVar13, (i11 & PKIFailureInfo.certRevoked) == 0 ? uVar14 : null, (i11 & 16384) != 0 ? okio.i.f42656d : iVar);
        }

        public final i a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new i(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, unknownFields);
        }

        public final kt.u b() {
            return this.f39365f;
        }

        public final kt.u c() {
            return this.f39361b;
        }

        public final kt.u d() {
            return this.f39366g;
        }

        public final kt.u e() {
            return this.f39363d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), iVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39360a, iVar.f39360a) && kotlin.jvm.internal.s.c(this.f39361b, iVar.f39361b) && kotlin.jvm.internal.s.c(this.f39362c, iVar.f39362c) && kotlin.jvm.internal.s.c(this.f39363d, iVar.f39363d) && kotlin.jvm.internal.s.c(this.f39364e, iVar.f39364e) && kotlin.jvm.internal.s.c(this.f39365f, iVar.f39365f) && kotlin.jvm.internal.s.c(this.f39366g, iVar.f39366g) && kotlin.jvm.internal.s.c(this.f39367h, iVar.f39367h) && kotlin.jvm.internal.s.c(this.f39368i, iVar.f39368i) && kotlin.jvm.internal.s.c(this.f39369j, iVar.f39369j) && kotlin.jvm.internal.s.c(this.f39370k, iVar.f39370k) && kotlin.jvm.internal.s.c(this.f39371l, iVar.f39371l) && kotlin.jvm.internal.s.c(this.f39372m, iVar.f39372m) && kotlin.jvm.internal.s.c(this.f39373n, iVar.f39373n);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39373n;
        }

        public final kt.u g() {
            return this.f39371l;
        }

        public final kt.u h() {
            return this.f39372m;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39360a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39361b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39362c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39363d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39364e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39365f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39366g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39367h;
                int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
                kt.u uVar9 = this.f39368i;
                int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
                kt.u uVar10 = this.f39369j;
                int hashCode11 = (hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0)) * 37;
                kt.u uVar11 = this.f39370k;
                int hashCode12 = (hashCode11 + (uVar11 != null ? uVar11.hashCode() : 0)) * 37;
                kt.u uVar12 = this.f39371l;
                int hashCode13 = (hashCode12 + (uVar12 != null ? uVar12.hashCode() : 0)) * 37;
                kt.u uVar13 = this.f39372m;
                int hashCode14 = (hashCode13 + (uVar13 != null ? uVar13.hashCode() : 0)) * 37;
                kt.u uVar14 = this.f39373n;
                int hashCode15 = hashCode14 + (uVar14 != null ? uVar14.hashCode() : 0);
                this.hashCode = hashCode15;
                return hashCode15;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39367h;
        }

        public final kt.u j() {
            return this.f39370k;
        }

        public final kt.u k() {
            return this.f39360a;
        }

        public final kt.u l() {
            return this.f39368i;
        }

        public final kt.u m() {
            return this.f39369j;
        }

        public final kt.u n() {
            return this.f39362c;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m804newBuilder();
        }

        public final kt.u o() {
            return this.f39364e;
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39360a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39361b;
            if (uVar2 != null) {
                arrayList.add("BLACK=" + uVar2);
            }
            kt.u uVar3 = this.f39362c;
            if (uVar3 != null) {
                arrayList.add("WHITE=" + uVar3);
            }
            kt.u uVar4 = this.f39363d;
            if (uVar4 != null) {
                arrayList.add("BLACK_CONSOLE_2=" + uVar4);
            }
            kt.u uVar5 = this.f39364e;
            if (uVar5 != null) {
                arrayList.add("WHITE_CONSOLE_2=" + uVar5);
            }
            kt.u uVar6 = this.f39365f;
            if (uVar6 != null) {
                arrayList.add("ALL_BLACK=" + uVar6);
            }
            kt.u uVar7 = this.f39366g;
            if (uVar7 != null) {
                arrayList.add("BLACK_AND_WHITE=" + uVar7);
            }
            kt.u uVar8 = this.f39367h;
            if (uVar8 != null) {
                arrayList.add("CREAM=" + uVar8);
            }
            kt.u uVar9 = this.f39368i;
            if (uVar9 != null) {
                arrayList.add("WALNUT_CREAM=" + uVar9);
            }
            kt.u uVar10 = this.f39369j;
            if (uVar10 != null) {
                arrayList.add("WALNUT_WHITE=" + uVar10);
            }
            kt.u uVar11 = this.f39370k;
            if (uVar11 != null) {
                arrayList.add("EBONY_BLACK=" + uVar11);
            }
            kt.u uVar12 = this.f39371l;
            if (uVar12 != null) {
                arrayList.add("CARBON_CREAM=" + uVar12);
            }
            kt.u uVar13 = this.f39372m;
            if (uVar13 != null) {
                arrayList.add("CARBON_WHITE=" + uVar13);
            }
            kt.u uVar14 = this.f39373n;
            if (uVar14 != null) {
                arrayList.add("CARBON_BLACK=" + uVar14);
            }
            l02 = e0.l0(arrayList, ", ", "InteriorTrimType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m804newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, kt.u uVar13, kt.u uVar14, okio.i unknownFields) {
            super(f39359o, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39360a = uVar;
            this.f39361b = uVar2;
            this.f39362c = uVar3;
            this.f39363d = uVar4;
            this.f39364e = uVar5;
            this.f39365f = uVar6;
            this.f39366g = uVar7;
            this.f39367h = uVar8;
            this.f39368i = uVar9;
            this.f39369j = uVar10;
            this.f39370k = uVar11;
            this.f39371l = uVar12;
            this.f39372m = uVar13;
            this.f39373n = uVar14;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, BLACK, WHITE, BLACK_CONSOLE_2, WHITE_CONSOLE_2, ALL_BLACK, BLACK_AND_WHITE, CREAM, WALNUT_CREAM, WALNUT_WHITE, EBONY_BLACK, CARBON_CREAM, CARBON_WHITE, CARBON_BLACK may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends com.squareup.wire.f {

        /* renamed from: e */
        public static final ProtoAdapter<j> f39374e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39375a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39376b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39377c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39378d;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<j> {
            a(com.squareup.wire.b bVar, n00.d<j> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.PerformancePackage", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public j decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                kt.u uVar4 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new j(uVar, uVar2, uVar3, uVar4, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 == 3) {
                        uVar3 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 4) {
                        reader.m(g11);
                    } else {
                        uVar4 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, j value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.d());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.e());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(j value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public j redact(j value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u d11 = value.d();
                kt.u redact = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u b11 = value.b();
                kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u e11 = value.e();
                kt.u redact3 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u c11 = value.c();
                return value.a(redact, redact2, redact3, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39374e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), com.squareup.wire.o.PROTO_3);
        }

        public j() {
            this(null, null, null, null, null, 31, null);
        }

        public /* synthetic */ j(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
        }

        public final j a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new j(uVar, uVar2, uVar3, uVar4, unknownFields);
        }

        public final kt.u b() {
            return this.f39376b;
        }

        public final kt.u c() {
            return this.f39378d;
        }

        public final kt.u d() {
            return this.f39375a;
        }

        public final kt.u e() {
            return this.f39377c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), jVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39375a, jVar.f39375a) && kotlin.jvm.internal.s.c(this.f39376b, jVar.f39376b) && kotlin.jvm.internal.s.c(this.f39377c, jVar.f39377c) && kotlin.jvm.internal.s.c(this.f39378d, jVar.f39378d);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39375a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39376b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39377c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39378d;
                int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m805newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39375a;
            if (uVar != null) {
                arrayList.add("None=" + uVar);
            }
            kt.u uVar2 = this.f39376b;
            if (uVar2 != null) {
                arrayList.add("Base=" + uVar2);
            }
            kt.u uVar3 = this.f39377c;
            if (uVar3 != null) {
                arrayList.add("Performance=" + uVar3);
            }
            kt.u uVar4 = this.f39378d;
            if (uVar4 != null) {
                arrayList.add("BasePlus=" + uVar4);
            }
            l02 = e0.l0(arrayList, ", ", "PerformancePackage{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m805newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            super(f39374e, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39375a = uVar;
            this.f39376b = uVar2;
            this.f39377c = uVar3;
            this.f39378d = uVar4;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
                throw new IllegalArgumentException("At most one of None, Base, Performance, BasePlus may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum k implements com.squareup.wire.p {
        RearLightTypeNA(0),
        RearLightTypeGlobal(2);
        
        public static final ProtoAdapter<k> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<k> {
            a(n00.d<k> dVar, com.squareup.wire.o oVar, k kVar) {
                super(dVar, oVar, kVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public k d(int i11) {
                return k.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final k a(int i11) {
                if (i11 != 0) {
                    if (i11 != 2) {
                        return null;
                    }
                    return k.RearLightTypeGlobal;
                }
                return k.RearLightTypeNA;
            }
        }

        static {
            k kVar;
            ADAPTER = new a(m0.b(k.class), com.squareup.wire.o.PROTO_3, kVar);
        }

        k(int i11) {
            this.value = i11;
        }

        public static final k fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends com.squareup.wire.f {

        /* renamed from: d */
        public static final ProtoAdapter<l> f39379d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39380a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39381b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39382c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<l> {
            a(com.squareup.wire.b bVar, n00.d<l> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleConfig.SteeringWheelType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public l decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new l(uVar, uVar2, uVar3, reader.e(d11));
                    } else if (g11 == 1) {
                        uVar = kt.u.f35845a.decode(reader);
                    } else if (g11 == 2) {
                        uVar2 = kt.u.f35845a.decode(reader);
                    } else if (g11 != 3) {
                        reader.m(g11);
                    } else {
                        uVar3 = kt.u.f35845a.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, l value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.c());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                protoAdapter.encodeWithTag(writer, 3, value.d());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(l value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.b()) + protoAdapter.encodedSizeWithTag(3, value.d());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public l redact(l value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u c11 = value.c();
                kt.u redact = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                kt.u redact2 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                return value.a(redact, redact2, d11 != null ? kt.u.f35845a.redact(d11) : null, okio.i.f42656d);
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
            f39379d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(l.class), com.squareup.wire.o.PROTO_3);
        }

        public l() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ l(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
        }

        public final l a(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new l(uVar, uVar2, uVar3, unknownFields);
        }

        public final kt.u b() {
            return this.f39381b;
        }

        public final kt.u c() {
            return this.f39380a;
        }

        public final kt.u d() {
            return this.f39382c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), lVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39380a, lVar.f39380a) && kotlin.jvm.internal.s.c(this.f39381b, lVar.f39381b) && kotlin.jvm.internal.s.c(this.f39382c, lVar.f39382c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39380a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39381b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39382c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m806newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39380a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39381b;
            if (uVar2 != null) {
                arrayList.add("Round=" + uVar2);
            }
            kt.u uVar3 = this.f39382c;
            if (uVar3 != null) {
                arrayList.add("Yoke=" + uVar3);
            }
            l02 = e0.l0(arrayList, ", ", "SteeringWheelType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m806newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            super(f39379d, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39380a = uVar;
            this.f39381b = uVar2;
            this.f39382c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Round, Yoke may be non-null".toString());
            }
        }
    }

    static {
        new d(null);
        f39282e4 = new c(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(u.class), com.squareup.wire.o.PROTO_3);
    }

    public u() {
        this(false, false, false, false, false, false, false, false, false, false, false, 0, false, false, false, false, false, false, false, false, false, 0, false, false, 0, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ u(boolean r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, boolean r103, boolean r104, boolean r105, boolean r106, boolean r107, int r108, boolean r109, boolean r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, int r118, boolean r119, boolean r120, int r121, java.lang.String r122, java.lang.String r123, mt.u.h r124, mt.u.a r125, boolean r126, boolean r127, boolean r128, boolean r129, boolean r130, java.lang.String r131, kt.t r132, kt.a r133, mt.u.b r134, kt.r r135, kt.v r136, kt.p r137, kt.m r138, kt.e r139, kt.k r140, kt.n r141, kt.l r142, kt.s r143, kt.c r144, j$.time.Instant r145, mt.u.i r146, mt.u.e r147, mt.u.j r148, mt.u.g r149, kt.j r150, kt.d r151, mt.u.f r152, mt.u.l r153, java.lang.Boolean r154, java.lang.Boolean r155, java.lang.Boolean r156, java.lang.Boolean r157, java.lang.Boolean r158, java.lang.Boolean r159, java.lang.Boolean r160, java.lang.Boolean r161, java.lang.Boolean r162, java.lang.Boolean r163, java.lang.Boolean r164, java.lang.Integer r165, java.lang.Boolean r166, java.lang.Boolean r167, java.lang.Boolean r168, java.lang.Boolean r169, java.lang.Boolean r170, java.lang.Boolean r171, java.lang.Boolean r172, java.lang.Boolean r173, java.lang.Boolean r174, java.lang.Integer r175, java.lang.Boolean r176, java.lang.Boolean r177, java.lang.Integer r178, java.lang.String r179, java.lang.String r180, mt.u.h r181, mt.u.a r182, java.lang.Boolean r183, java.lang.Boolean r184, java.lang.Boolean r185, java.lang.Boolean r186, java.lang.Boolean r187, java.lang.String r188, java.lang.Boolean r189, java.lang.Boolean r190, java.lang.Boolean r191, java.lang.Boolean r192, java.lang.Boolean r193, mt.u.k r194, okio.i r195, int r196, int r197, int r198, int r199, kotlin.jvm.internal.DefaultConstructorMarker r200) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.u.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, int, java.lang.String, java.lang.String, mt.u$h, mt.u$a, boolean, boolean, boolean, boolean, boolean, java.lang.String, kt.t, kt.a, mt.u$b, kt.r, kt.v, kt.p, kt.m, kt.e, kt.k, kt.n, kt.l, kt.s, kt.c, j$.time.Instant, mt.u$i, mt.u$e, mt.u$j, mt.u$g, kt.j, kt.d, mt.u$f, mt.u$l, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, mt.u$h, mt.u$a, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, mt.u$k, okio.i, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ u b(u uVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, int i11, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, int i12, boolean z33, boolean z34, int i13, String str, String str2, h hVar, a aVar, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, String str3, kt.t tVar, kt.a aVar2, b bVar, kt.r rVar, kt.v vVar, kt.p pVar, kt.m mVar, kt.e eVar, kt.k kVar, kt.n nVar, kt.l lVar, kt.s sVar, kt.c cVar, Instant instant, i iVar, e eVar2, j jVar, g gVar, kt.j jVar2, kt.d dVar, f fVar, l lVar2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Integer num2, Boolean bool21, Boolean bool22, Integer num3, String str4, String str5, h hVar2, a aVar3, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, String str6, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, k kVar2, okio.i iVar2, int i14, int i15, int i16, int i17, Object obj) {
        return uVar.a((i14 & 1) != 0 ? uVar.f39283a : z11, (i14 & 2) != 0 ? uVar.f39285b : z12, (i14 & 4) != 0 ? uVar.f39289c : z13, (i14 & 8) != 0 ? uVar.f39291d : z14, (i14 & 16) != 0 ? uVar.f39293e : z15, (i14 & 32) != 0 ? uVar.f39294f : z16, (i14 & 64) != 0 ? uVar.f39295g : z17, (i14 & 128) != 0 ? uVar.f39298h : z18, (i14 & 256) != 0 ? uVar.f39299i : z19, (i14 & 512) != 0 ? uVar.f39301j : z21, (i14 & 1024) != 0 ? uVar.f39303k : z22, (i14 & 2048) != 0 ? uVar.f39305l : i11, (i14 & 4096) != 0 ? uVar.f39307m : z23, (i14 & PKIFailureInfo.certRevoked) != 0 ? uVar.f39309n : z24, (i14 & 16384) != 0 ? uVar.f39311o : z25, (i14 & 32768) != 0 ? uVar.f39313p : z26, (i14 & 65536) != 0 ? uVar.f39317q : z27, (i14 & 131072) != 0 ? uVar.f39321t : z28, (i14 & 262144) != 0 ? uVar.f39325w : z29, (i14 & PKIFailureInfo.signerNotTrusted) != 0 ? uVar.f39327x : z31, (i14 & PKIFailureInfo.badCertTemplate) != 0 ? uVar.f39331y : z32, (i14 & PKIFailureInfo.badSenderNonce) != 0 ? uVar.f39335z : i12, (i14 & 4194304) != 0 ? uVar.A : z33, (i14 & 8388608) != 0 ? uVar.B : z34, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? uVar.C : i13, (i14 & 33554432) != 0 ? uVar.E : str, (i14 & 67108864) != 0 ? uVar.F : str2, (i14 & 134217728) != 0 ? uVar.G : hVar, (i14 & 268435456) != 0 ? uVar.H : aVar, (i14 & PKIFailureInfo.duplicateCertReq) != 0 ? uVar.K : z35, (i14 & 1073741824) != 0 ? uVar.L : z36, (i14 & Integer.MIN_VALUE) != 0 ? uVar.O : z37, (i15 & 1) != 0 ? uVar.P : z38, (i15 & 2) != 0 ? uVar.Q : z39, (i15 & 4) != 0 ? uVar.R : str3, (i15 & 8) != 0 ? uVar.T : tVar, (i15 & 16) != 0 ? uVar.Y : aVar2, (i15 & 32) != 0 ? uVar.f39286b1 : bVar, (i15 & 64) != 0 ? uVar.f39296g1 : rVar, (i15 & 128) != 0 ? uVar.f39314p1 : vVar, (i15 & 256) != 0 ? uVar.f39328x1 : pVar, (i15 & 512) != 0 ? uVar.f39332y1 : mVar, (i15 & 1024) != 0 ? uVar.Q1 : eVar, (i15 & 2048) != 0 ? uVar.V1 : kVar, (i15 & 4096) != 0 ? uVar.f39287b2 : nVar, (i15 & PKIFailureInfo.certRevoked) != 0 ? uVar.f39297g2 : lVar, (i15 & 16384) != 0 ? uVar.f39315p2 : sVar, (i15 & 32768) != 0 ? uVar.f39329x2 : cVar, (i15 & 65536) != 0 ? uVar.f39333y2 : instant, (i15 & 131072) != 0 ? uVar.Q2 : iVar, (i15 & 262144) != 0 ? uVar.f39300i3 : eVar2, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? uVar.f39302j3 : jVar, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? uVar.f39304k3 : gVar, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? uVar.f39306l3 : jVar2, (i15 & 4194304) != 0 ? uVar.f39308m3 : dVar, (i15 & 8388608) != 0 ? uVar.f39310n3 : fVar, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? uVar.f39312o3 : lVar2, (i15 & 33554432) != 0 ? uVar.f39316p3 : bool, (i15 & 67108864) != 0 ? uVar.f39318q3 : bool2, (i15 & 134217728) != 0 ? uVar.f39319r3 : bool3, (i15 & 268435456) != 0 ? uVar.f39320s3 : bool4, (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? uVar.f39322t3 : bool5, (i15 & 1073741824) != 0 ? uVar.f39323u3 : bool6, (i15 & Integer.MIN_VALUE) != 0 ? uVar.f39324v3 : bool7, (i16 & 1) != 0 ? uVar.f39326w3 : bool8, (i16 & 2) != 0 ? uVar.f39330x3 : bool9, (i16 & 4) != 0 ? uVar.f39334y3 : bool10, (i16 & 8) != 0 ? uVar.f39336z3 : bool11, (i16 & 16) != 0 ? uVar.A3 : num, (i16 & 32) != 0 ? uVar.B3 : bool12, (i16 & 64) != 0 ? uVar.C3 : bool13, (i16 & 128) != 0 ? uVar.D3 : bool14, (i16 & 256) != 0 ? uVar.E3 : bool15, (i16 & 512) != 0 ? uVar.F3 : bool16, (i16 & 1024) != 0 ? uVar.G3 : bool17, (i16 & 2048) != 0 ? uVar.H3 : bool18, (i16 & 4096) != 0 ? uVar.I3 : bool19, (i16 & PKIFailureInfo.certRevoked) != 0 ? uVar.J3 : bool20, (i16 & 16384) != 0 ? uVar.K3 : num2, (i16 & 32768) != 0 ? uVar.L3 : bool21, (i16 & 65536) != 0 ? uVar.M3 : bool22, (i16 & 131072) != 0 ? uVar.N3 : num3, (i16 & 262144) != 0 ? uVar.O3 : str4, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? uVar.P3 : str5, (i16 & PKIFailureInfo.badCertTemplate) != 0 ? uVar.Q3 : hVar2, (i16 & PKIFailureInfo.badSenderNonce) != 0 ? uVar.R3 : aVar3, (i16 & 4194304) != 0 ? uVar.S3 : bool23, (i16 & 8388608) != 0 ? uVar.T3 : bool24, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? uVar.U3 : bool25, (i16 & 33554432) != 0 ? uVar.V3 : bool26, (i16 & 67108864) != 0 ? uVar.W3 : bool27, (i16 & 134217728) != 0 ? uVar.X3 : str6, (i16 & 268435456) != 0 ? uVar.Y3 : bool28, (i16 & PKIFailureInfo.duplicateCertReq) != 0 ? uVar.Z3 : bool29, (i16 & 1073741824) != 0 ? uVar.f39284a4 : bool30, (i16 & Integer.MIN_VALUE) != 0 ? uVar.f39288b4 : bool31, (i17 & 1) != 0 ? uVar.f39290c4 : bool32, (i17 & 2) != 0 ? uVar.f39292d4 : kVar2, (i17 & 4) != 0 ? uVar.unknownFields() : iVar2);
    }

    public final kt.e A() {
        return this.Q1;
    }

    public final l A0() {
        return this.f39312o3;
    }

    public final String B() {
        return this.P3;
    }

    public final kt.r B0() {
        return this.f39296g1;
    }

    public final String C() {
        return this.F;
    }

    public final Boolean C0() {
        return this.W3;
    }

    public final f D() {
        return this.f39310n3;
    }

    public final boolean D0() {
        return this.Q;
    }

    public final g E() {
        return this.f39304k3;
    }

    public final kt.s E0() {
        return this.f39315p2;
    }

    public final Boolean F() {
        return this.f39322t3;
    }

    public final Instant F0() {
        return this.f39333y2;
    }

    public final boolean G() {
        return this.f39293e;
    }

    public final Boolean G0() {
        return this.M3;
    }

    public final Boolean H() {
        return this.T3;
    }

    public final boolean H0() {
        return this.B;
    }

    public final boolean I() {
        return this.L;
    }

    public final Boolean I0() {
        return this.f39316p3;
    }

    public final Boolean J() {
        return this.f39288b4;
    }

    public final boolean J0() {
        return this.f39283a;
    }

    public final Boolean K() {
        return this.U3;
    }

    public final Integer K0() {
        return this.K3;
    }

    public final boolean L() {
        return this.O;
    }

    public final int L0() {
        return this.f39335z;
    }

    public final Boolean M() {
        return this.f39319r3;
    }

    public final Integer M0() {
        return this.N3;
    }

    public final boolean N() {
        return this.f39289c;
    }

    public final int N0() {
        return this.C;
    }

    public final Boolean O() {
        return this.J3;
    }

    public final String O0() {
        return this.X3;
    }

    public final boolean P() {
        return this.f39331y;
    }

    public final String P0() {
        return this.R;
    }

    public final Boolean Q() {
        return this.L3;
    }

    public final Boolean Q0() {
        return this.Z3;
    }

    public final boolean R() {
        return this.A;
    }

    public final Boolean R0() {
        return this.G3;
    }

    public final Boolean S() {
        return this.V3;
    }

    public final boolean S0() {
        return this.f39321t;
    }

    public final boolean T() {
        return this.P;
    }

    public final kt.v T0() {
        return this.f39314p1;
    }

    public final h U() {
        return this.Q3;
    }

    public final Boolean U0() {
        return this.S3;
    }

    public final h V() {
        return this.G;
    }

    public final boolean V0() {
        return this.K;
    }

    public final Boolean W() {
        return this.F3;
    }

    public final boolean X() {
        return this.f39317q;
    }

    public final i Y() {
        return this.Q2;
    }

    public final Integer Z() {
        return this.A3;
    }

    public final u a(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, int i11, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, int i12, boolean z33, boolean z34, int i13, String paint_color_override_OBSOLETE, String exterior_trim_override_OBSOLETE, h headlamp_type_OBSOLETE, a aux_park_lamps_OBSOLETE, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, String vin_OBSOLETE, kt.t tVar, kt.a aVar, b bVar, kt.r rVar, kt.v vVar, kt.p pVar, kt.m mVar, kt.e eVar, kt.k kVar, kt.n nVar, kt.l lVar, kt.s sVar, kt.c cVar, Instant instant, i iVar, e eVar2, j jVar, g gVar, kt.j jVar2, kt.d dVar, f fVar, l lVar2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Integer num2, Boolean bool21, Boolean bool22, Integer num3, String str, String str2, h hVar, a aVar2, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, String str3, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, k kVar2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(paint_color_override_OBSOLETE, "paint_color_override_OBSOLETE");
        kotlin.jvm.internal.s.g(exterior_trim_override_OBSOLETE, "exterior_trim_override_OBSOLETE");
        kotlin.jvm.internal.s.g(headlamp_type_OBSOLETE, "headlamp_type_OBSOLETE");
        kotlin.jvm.internal.s.g(aux_park_lamps_OBSOLETE, "aux_park_lamps_OBSOLETE");
        kotlin.jvm.internal.s.g(vin_OBSOLETE, "vin_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new u(z11, z12, z13, z14, z15, z16, z17, z18, z19, z21, z22, i11, z23, z24, z25, z26, z27, z28, z29, z31, z32, i12, z33, z34, i13, paint_color_override_OBSOLETE, exterior_trim_override_OBSOLETE, headlamp_type_OBSOLETE, aux_park_lamps_OBSOLETE, z35, z36, z37, z38, z39, vin_OBSOLETE, tVar, aVar, bVar, rVar, vVar, pVar, mVar, eVar, kVar, nVar, lVar, sVar, cVar, instant, iVar, eVar2, jVar, gVar, jVar2, dVar, fVar, lVar2, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, num, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, num2, bool21, bool22, num3, str, str2, hVar, aVar2, bool23, bool24, bool25, bool26, bool27, str3, bool28, bool29, bool30, bool31, bool32, kVar2, unknownFields);
    }

    public final int a0() {
        return this.f39305l;
    }

    public final Boolean b0() {
        return this.B3;
    }

    public final a c() {
        return this.R3;
    }

    public final boolean c0() {
        return this.f39307m;
    }

    public final a d() {
        return this.H;
    }

    public final Boolean d0() {
        return this.f39334y3;
    }

    public final Boolean e() {
        return this.H3;
    }

    public final boolean e0() {
        return this.f39301j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), uVar.unknownFields()) && this.f39283a == uVar.f39283a && this.f39285b == uVar.f39285b && this.f39289c == uVar.f39289c && this.f39291d == uVar.f39291d && this.f39293e == uVar.f39293e && this.f39294f == uVar.f39294f && this.f39295g == uVar.f39295g && this.f39298h == uVar.f39298h && this.f39299i == uVar.f39299i && this.f39301j == uVar.f39301j && this.f39303k == uVar.f39303k && this.f39305l == uVar.f39305l && this.f39307m == uVar.f39307m && this.f39309n == uVar.f39309n && this.f39311o == uVar.f39311o && this.f39313p == uVar.f39313p && this.f39317q == uVar.f39317q && this.f39321t == uVar.f39321t && this.f39325w == uVar.f39325w && this.f39327x == uVar.f39327x && this.f39331y == uVar.f39331y && this.f39335z == uVar.f39335z && this.A == uVar.A && this.B == uVar.B && this.C == uVar.C && kotlin.jvm.internal.s.c(this.E, uVar.E) && kotlin.jvm.internal.s.c(this.F, uVar.F) && this.G == uVar.G && this.H == uVar.H && this.K == uVar.K && this.L == uVar.L && this.O == uVar.O && this.P == uVar.P && this.Q == uVar.Q && kotlin.jvm.internal.s.c(this.R, uVar.R) && kotlin.jvm.internal.s.c(this.T, uVar.T) && kotlin.jvm.internal.s.c(this.Y, uVar.Y) && kotlin.jvm.internal.s.c(this.f39286b1, uVar.f39286b1) && kotlin.jvm.internal.s.c(this.f39296g1, uVar.f39296g1) && kotlin.jvm.internal.s.c(this.f39314p1, uVar.f39314p1) && kotlin.jvm.internal.s.c(this.f39328x1, uVar.f39328x1) && kotlin.jvm.internal.s.c(this.f39332y1, uVar.f39332y1) && kotlin.jvm.internal.s.c(this.Q1, uVar.Q1) && kotlin.jvm.internal.s.c(this.V1, uVar.V1) && kotlin.jvm.internal.s.c(this.f39287b2, uVar.f39287b2) && kotlin.jvm.internal.s.c(this.f39297g2, uVar.f39297g2) && kotlin.jvm.internal.s.c(this.f39315p2, uVar.f39315p2) && kotlin.jvm.internal.s.c(this.f39329x2, uVar.f39329x2) && kotlin.jvm.internal.s.c(this.f39333y2, uVar.f39333y2) && kotlin.jvm.internal.s.c(this.Q2, uVar.Q2) && kotlin.jvm.internal.s.c(this.f39300i3, uVar.f39300i3) && kotlin.jvm.internal.s.c(this.f39302j3, uVar.f39302j3) && kotlin.jvm.internal.s.c(this.f39304k3, uVar.f39304k3) && kotlin.jvm.internal.s.c(this.f39306l3, uVar.f39306l3) && kotlin.jvm.internal.s.c(this.f39308m3, uVar.f39308m3) && kotlin.jvm.internal.s.c(this.f39310n3, uVar.f39310n3) && kotlin.jvm.internal.s.c(this.f39312o3, uVar.f39312o3) && kotlin.jvm.internal.s.c(this.f39316p3, uVar.f39316p3) && kotlin.jvm.internal.s.c(this.f39318q3, uVar.f39318q3) && kotlin.jvm.internal.s.c(this.f39319r3, uVar.f39319r3) && kotlin.jvm.internal.s.c(this.f39320s3, uVar.f39320s3) && kotlin.jvm.internal.s.c(this.f39322t3, uVar.f39322t3) && kotlin.jvm.internal.s.c(this.f39323u3, uVar.f39323u3) && kotlin.jvm.internal.s.c(this.f39324v3, uVar.f39324v3) && kotlin.jvm.internal.s.c(this.f39326w3, uVar.f39326w3) && kotlin.jvm.internal.s.c(this.f39330x3, uVar.f39330x3) && kotlin.jvm.internal.s.c(this.f39334y3, uVar.f39334y3) && kotlin.jvm.internal.s.c(this.f39336z3, uVar.f39336z3) && kotlin.jvm.internal.s.c(this.A3, uVar.A3) && kotlin.jvm.internal.s.c(this.B3, uVar.B3) && kotlin.jvm.internal.s.c(this.C3, uVar.C3) && kotlin.jvm.internal.s.c(this.D3, uVar.D3) && kotlin.jvm.internal.s.c(this.E3, uVar.E3) && kotlin.jvm.internal.s.c(this.F3, uVar.F3) && kotlin.jvm.internal.s.c(this.G3, uVar.G3) && kotlin.jvm.internal.s.c(this.H3, uVar.H3) && kotlin.jvm.internal.s.c(this.I3, uVar.I3) && kotlin.jvm.internal.s.c(this.J3, uVar.J3) && kotlin.jvm.internal.s.c(this.K3, uVar.K3) && kotlin.jvm.internal.s.c(this.L3, uVar.L3) && kotlin.jvm.internal.s.c(this.M3, uVar.M3) && kotlin.jvm.internal.s.c(this.N3, uVar.N3) && kotlin.jvm.internal.s.c(this.O3, uVar.O3) && kotlin.jvm.internal.s.c(this.P3, uVar.P3) && this.Q3 == uVar.Q3 && this.R3 == uVar.R3 && kotlin.jvm.internal.s.c(this.S3, uVar.S3) && kotlin.jvm.internal.s.c(this.T3, uVar.T3) && kotlin.jvm.internal.s.c(this.U3, uVar.U3) && kotlin.jvm.internal.s.c(this.V3, uVar.V3) && kotlin.jvm.internal.s.c(this.W3, uVar.W3) && kotlin.jvm.internal.s.c(this.X3, uVar.X3) && kotlin.jvm.internal.s.c(this.Y3, uVar.Y3) && kotlin.jvm.internal.s.c(this.Z3, uVar.Z3) && kotlin.jvm.internal.s.c(this.f39284a4, uVar.f39284a4) && kotlin.jvm.internal.s.c(this.f39288b4, uVar.f39288b4) && kotlin.jvm.internal.s.c(this.f39290c4, uVar.f39290c4) && this.f39292d4 == uVar.f39292d4;
        }
        return false;
    }

    public final boolean f() {
        return this.f39325w;
    }

    public final String f0() {
        return this.O3;
    }

    public final Boolean g() {
        return this.f39336z3;
    }

    public final String g0() {
        return this.E;
    }

    public final boolean h() {
        return this.f39303k;
    }

    public final j h0() {
        return this.f39302j3;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39283a)) * 37) + Boolean.hashCode(this.f39285b)) * 37) + Boolean.hashCode(this.f39289c)) * 37) + Boolean.hashCode(this.f39291d)) * 37) + Boolean.hashCode(this.f39293e)) * 37) + Boolean.hashCode(this.f39294f)) * 37) + Boolean.hashCode(this.f39295g)) * 37) + Boolean.hashCode(this.f39298h)) * 37) + Boolean.hashCode(this.f39299i)) * 37) + Boolean.hashCode(this.f39301j)) * 37) + Boolean.hashCode(this.f39303k)) * 37) + Integer.hashCode(this.f39305l)) * 37) + Boolean.hashCode(this.f39307m)) * 37) + Boolean.hashCode(this.f39309n)) * 37) + Boolean.hashCode(this.f39311o)) * 37) + Boolean.hashCode(this.f39313p)) * 37) + Boolean.hashCode(this.f39317q)) * 37) + Boolean.hashCode(this.f39321t)) * 37) + Boolean.hashCode(this.f39325w)) * 37) + Boolean.hashCode(this.f39327x)) * 37) + Boolean.hashCode(this.f39331y)) * 37) + Integer.hashCode(this.f39335z)) * 37) + Boolean.hashCode(this.A)) * 37) + Boolean.hashCode(this.B)) * 37) + Integer.hashCode(this.C)) * 37) + this.E.hashCode()) * 37) + this.F.hashCode()) * 37) + this.G.hashCode()) * 37) + this.H.hashCode()) * 37) + Boolean.hashCode(this.K)) * 37) + Boolean.hashCode(this.L)) * 37) + Boolean.hashCode(this.O)) * 37) + Boolean.hashCode(this.P)) * 37) + Boolean.hashCode(this.Q)) * 37) + this.R.hashCode()) * 37;
            kt.t tVar = this.T;
            int hashCode2 = (hashCode + (tVar != null ? tVar.hashCode() : 0)) * 37;
            kt.a aVar = this.Y;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 37;
            b bVar = this.f39286b1;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            kt.r rVar = this.f39296g1;
            int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 37;
            kt.v vVar = this.f39314p1;
            int hashCode6 = (hashCode5 + (vVar != null ? vVar.hashCode() : 0)) * 37;
            kt.p pVar = this.f39328x1;
            int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 37;
            kt.m mVar = this.f39332y1;
            int hashCode8 = (hashCode7 + (mVar != null ? mVar.hashCode() : 0)) * 37;
            kt.e eVar = this.Q1;
            int hashCode9 = (hashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            kt.k kVar = this.V1;
            int hashCode10 = (hashCode9 + (kVar != null ? kVar.hashCode() : 0)) * 37;
            kt.n nVar = this.f39287b2;
            int hashCode11 = (hashCode10 + (nVar != null ? nVar.hashCode() : 0)) * 37;
            kt.l lVar = this.f39297g2;
            int hashCode12 = (hashCode11 + (lVar != null ? lVar.hashCode() : 0)) * 37;
            kt.s sVar = this.f39315p2;
            int hashCode13 = (hashCode12 + (sVar != null ? sVar.hashCode() : 0)) * 37;
            kt.c cVar = this.f39329x2;
            int hashCode14 = (hashCode13 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            Instant instant = this.f39333y2;
            int hashCode15 = (hashCode14 + (instant != null ? instant.hashCode() : 0)) * 37;
            i iVar = this.Q2;
            int hashCode16 = (hashCode15 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            e eVar2 = this.f39300i3;
            int hashCode17 = (hashCode16 + (eVar2 != null ? eVar2.hashCode() : 0)) * 37;
            j jVar = this.f39302j3;
            int hashCode18 = (hashCode17 + (jVar != null ? jVar.hashCode() : 0)) * 37;
            g gVar = this.f39304k3;
            int hashCode19 = (hashCode18 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            kt.j jVar2 = this.f39306l3;
            int hashCode20 = (hashCode19 + (jVar2 != null ? jVar2.hashCode() : 0)) * 37;
            kt.d dVar = this.f39308m3;
            int hashCode21 = (hashCode20 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            f fVar = this.f39310n3;
            int hashCode22 = (hashCode21 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            l lVar2 = this.f39312o3;
            int hashCode23 = (hashCode22 + (lVar2 != null ? lVar2.hashCode() : 0)) * 37;
            Boolean bool = this.f39316p3;
            int hashCode24 = (hashCode23 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39318q3;
            int hashCode25 = (hashCode24 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Boolean bool3 = this.f39319r3;
            int hashCode26 = (hashCode25 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
            Boolean bool4 = this.f39320s3;
            int hashCode27 = (hashCode26 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
            Boolean bool5 = this.f39322t3;
            int hashCode28 = (hashCode27 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
            Boolean bool6 = this.f39323u3;
            int hashCode29 = (hashCode28 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
            Boolean bool7 = this.f39324v3;
            int hashCode30 = (hashCode29 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
            Boolean bool8 = this.f39326w3;
            int hashCode31 = (hashCode30 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
            Boolean bool9 = this.f39330x3;
            int hashCode32 = (hashCode31 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
            Boolean bool10 = this.f39334y3;
            int hashCode33 = (hashCode32 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
            Boolean bool11 = this.f39336z3;
            int hashCode34 = (hashCode33 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
            Integer num = this.A3;
            int hashCode35 = (hashCode34 + (num != null ? num.hashCode() : 0)) * 37;
            Boolean bool12 = this.B3;
            int hashCode36 = (hashCode35 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
            Boolean bool13 = this.C3;
            int hashCode37 = (hashCode36 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
            Boolean bool14 = this.D3;
            int hashCode38 = (hashCode37 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
            Boolean bool15 = this.E3;
            int hashCode39 = (hashCode38 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
            Boolean bool16 = this.F3;
            int hashCode40 = (hashCode39 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
            Boolean bool17 = this.G3;
            int hashCode41 = (hashCode40 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
            Boolean bool18 = this.H3;
            int hashCode42 = (hashCode41 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
            Boolean bool19 = this.I3;
            int hashCode43 = (hashCode42 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
            Boolean bool20 = this.J3;
            int hashCode44 = (hashCode43 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
            Integer num2 = this.K3;
            int hashCode45 = (hashCode44 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool21 = this.L3;
            int hashCode46 = (hashCode45 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
            Boolean bool22 = this.M3;
            int hashCode47 = (hashCode46 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
            Integer num3 = this.N3;
            int hashCode48 = (hashCode47 + (num3 != null ? num3.hashCode() : 0)) * 37;
            String str = this.O3;
            int hashCode49 = (hashCode48 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.P3;
            int hashCode50 = (hashCode49 + (str2 != null ? str2.hashCode() : 0)) * 37;
            h hVar = this.Q3;
            int hashCode51 = (hashCode50 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            a aVar2 = this.R3;
            int hashCode52 = (hashCode51 + (aVar2 != null ? aVar2.hashCode() : 0)) * 37;
            Boolean bool23 = this.S3;
            int hashCode53 = (hashCode52 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
            Boolean bool24 = this.T3;
            int hashCode54 = (hashCode53 + (bool24 != null ? bool24.hashCode() : 0)) * 37;
            Boolean bool25 = this.U3;
            int hashCode55 = (hashCode54 + (bool25 != null ? bool25.hashCode() : 0)) * 37;
            Boolean bool26 = this.V3;
            int hashCode56 = (hashCode55 + (bool26 != null ? bool26.hashCode() : 0)) * 37;
            Boolean bool27 = this.W3;
            int hashCode57 = (hashCode56 + (bool27 != null ? bool27.hashCode() : 0)) * 37;
            String str3 = this.X3;
            int hashCode58 = (hashCode57 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Boolean bool28 = this.Y3;
            int hashCode59 = (hashCode58 + (bool28 != null ? bool28.hashCode() : 0)) * 37;
            Boolean bool29 = this.Z3;
            int hashCode60 = (hashCode59 + (bool29 != null ? bool29.hashCode() : 0)) * 37;
            Boolean bool30 = this.f39284a4;
            int hashCode61 = (hashCode60 + (bool30 != null ? bool30.hashCode() : 0)) * 37;
            Boolean bool31 = this.f39288b4;
            int hashCode62 = (hashCode61 + (bool31 != null ? bool31.hashCode() : 0)) * 37;
            Boolean bool32 = this.f39290c4;
            int hashCode63 = (hashCode62 + (bool32 != null ? bool32.hashCode() : 0)) * 37;
            k kVar2 = this.f39292d4;
            int hashCode64 = hashCode63 + (kVar2 != null ? kVar2.hashCode() : 0);
            this.hashCode = hashCode64;
            return hashCode64;
        }
        return i11;
    }

    public final Boolean i() {
        return this.f39320s3;
    }

    public final Boolean i0() {
        return this.f39324v3;
    }

    public final boolean j() {
        return this.f39291d;
    }

    public final boolean j0() {
        return this.f39295g;
    }

    public final kt.t k() {
        return this.T;
    }

    public final Boolean k0() {
        return this.f39318q3;
    }

    public final kt.a l() {
        return this.Y;
    }

    public final boolean l0() {
        return this.f39285b;
    }

    public final b m() {
        return this.f39286b1;
    }

    public final kt.j m0() {
        return this.f39306l3;
    }

    public final kt.c n() {
        return this.f39329x2;
    }

    public final kt.k n0() {
        return this.V1;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m799newBuilder();
    }

    public final Boolean o() {
        return this.f39284a4;
    }

    public final kt.l o0() {
        return this.f39297g2;
    }

    public final Boolean p() {
        return this.I3;
    }

    public final k p0() {
        return this.f39292d4;
    }

    public final boolean q() {
        return this.f39327x;
    }

    public final Boolean q0() {
        return this.f39290c4;
    }

    public final Boolean r() {
        return this.C3;
    }

    public final Boolean r0() {
        return this.f39323u3;
    }

    public final boolean s() {
        return this.f39309n;
    }

    public final boolean s0() {
        return this.f39294f;
    }

    public final Boolean t() {
        return this.Y3;
    }

    public final kt.m t0() {
        return this.f39332y1;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f39283a;
        arrayList.add("use_range_badging_OBSOLETE=" + z11);
        boolean z12 = this.f39285b;
        arrayList.add("range_plus_badging_OBSOLETE=" + z12);
        boolean z13 = this.f39289c;
        arrayList.add("has_ludicrous_mode_OBSOLETE=" + z13);
        boolean z14 = this.f39291d;
        arrayList.add("can_actuate_trunks_OBSOLETE=" + z14);
        boolean z15 = this.f39293e;
        arrayList.add("has_air_suspension_OBSOLETE=" + z15);
        boolean z16 = this.f39294f;
        arrayList.add("rhd_OBSOLETE=" + z16);
        boolean z17 = this.f39295g;
        arrayList.add("plg_OBSOLETE=" + z17);
        boolean z18 = this.f39298h;
        arrayList.add("ece_restrictions_OBSOLETE=" + z18);
        boolean z19 = this.f39299i;
        arrayList.add("eu_vehicle_OBSOLETE=" + z19);
        boolean z21 = this.f39301j;
        arrayList.add("motorized_charge_port_OBSOLETE=" + z21);
        boolean z22 = this.f39303k;
        arrayList.add("can_accept_navigation_requests_OBSOLETE=" + z22);
        int i11 = this.f39305l;
        arrayList.add("key_version_OBSOLETE=" + i11);
        boolean z23 = this.f39307m;
        arrayList.add("mobile_enabled_OBSOLETE=" + z23);
        boolean z24 = this.f39309n;
        arrayList.add("default_charge_to_max_OBSOLETE=" + z24);
        boolean z25 = this.f39311o;
        arrayList.add("steering_wheel_heater_installed_OBSOLETE=" + z25);
        boolean z26 = this.f39313p;
        arrayList.add("sentry_mode_supported_OBSOLETE=" + z26);
        boolean z27 = this.f39317q;
        arrayList.add("homelink_supported_OBSOLETE=" + z27);
        boolean z28 = this.f39321t;
        arrayList.add("webcam_supported_OBSOLETE=" + z28);
        boolean z29 = this.f39325w;
        arrayList.add("bioweapon_mode_supported_OBSOLETE=" + z29);
        boolean z31 = this.f39327x;
        arrayList.add("dashcam_clip_save_supported_OBSOLETE=" + z31);
        boolean z32 = this.f39331y;
        arrayList.add("has_pws_OBSOLETE=" + z32);
        int i12 = this.f39335z;
        arrayList.add("utc_offset_OBSOLETE=" + i12);
        boolean z33 = this.A;
        arrayList.add("has_seat_cooling_OBSOLETE=" + z33);
        boolean z34 = this.B;
        arrayList.add("tpms_pressures_supported_OBSOLETE=" + z34);
        int i13 = this.C;
        arrayList.add("vehicle_badging_OBSOLETE=" + i13);
        String i14 = mr.d.i(this.E);
        arrayList.add("paint_color_override_OBSOLETE=" + i14);
        String i15 = mr.d.i(this.F);
        arrayList.add("exterior_trim_override_OBSOLETE=" + i15);
        h hVar = this.G;
        arrayList.add("headlamp_type_OBSOLETE=" + hVar);
        a aVar = this.H;
        arrayList.add("aux_park_lamps_OBSOLETE=" + aVar);
        boolean z35 = this.K;
        arrayList.add("is_raven_OBSOLETE=" + z35);
        boolean z36 = this.L;
        arrayList.add("has_auto_seat_climate_OBSOLETE=" + z36);
        boolean z37 = this.O;
        arrayList.add("has_front_row_seat_heaters_OBSOLETE=" + z37);
        boolean z38 = this.P;
        arrayList.add("has_third_row_seat_heaters_OBSOLETE=" + z38);
        boolean z39 = this.Q;
        arrayList.add("supports_qr_pairing_OBSOLETE=" + z39);
        String i16 = mr.d.i(this.R);
        arrayList.add("vin_OBSOLETE=" + i16);
        kt.t tVar = this.T;
        if (tVar != null) {
            arrayList.add("car_special_type=" + tVar);
        }
        kt.a aVar2 = this.Y;
        if (aVar2 != null) {
            arrayList.add("car_trim=" + aVar2);
        }
        b bVar = this.f39286b1;
        if (bVar != null) {
            arrayList.add("car_type=" + bVar);
        }
        kt.r rVar = this.f39296g1;
        if (rVar != null) {
            arrayList.add("sun_roof_installed=" + rVar);
        }
        kt.v vVar = this.f39314p1;
        if (vVar != null) {
            arrayList.add("wheel_type=" + vVar);
        }
        kt.p pVar = this.f39328x1;
        if (pVar != null) {
            arrayList.add("spoiler_type=" + pVar);
        }
        kt.m mVar = this.f39332y1;
        if (mVar != null) {
            arrayList.add("roof_color=" + mVar);
        }
        kt.e eVar = this.Q1;
        if (eVar != null) {
            arrayList.add("exterior_color=" + eVar);
        }
        kt.k kVar = this.V1;
        if (kVar != null) {
            arrayList.add("rear_seat_heaters=" + kVar);
        }
        kt.n nVar = this.f39287b2;
        if (nVar != null) {
            arrayList.add("seat_type=" + nVar);
        }
        kt.l lVar = this.f39297g2;
        if (lVar != null) {
            arrayList.add("rear_seat_type=" + lVar);
        }
        kt.s sVar = this.f39315p2;
        if (sVar != null) {
            arrayList.add("third_row_seat_type=" + sVar);
        }
        kt.c cVar = this.f39329x2;
        if (cVar != null) {
            arrayList.add("charge_port_type=" + cVar);
        }
        Instant instant = this.f39333y2;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        i iVar = this.Q2;
        if (iVar != null) {
            arrayList.add("interior_trim_type=" + iVar);
        }
        e eVar2 = this.f39300i3;
        if (eVar2 != null) {
            arrayList.add("driver_assist=" + eVar2);
        }
        j jVar = this.f39302j3;
        if (jVar != null) {
            arrayList.add("performance_package=" + jVar);
        }
        g gVar = this.f39304k3;
        if (gVar != null) {
            arrayList.add("front_drive_unit=" + gVar);
        }
        kt.j jVar2 = this.f39306l3;
        if (jVar2 != null) {
            arrayList.add("rear_drive_unit=" + jVar2);
        }
        kt.d dVar = this.f39308m3;
        if (dVar != null) {
            arrayList.add("efficiency_package=" + dVar);
        }
        f fVar = this.f39310n3;
        if (fVar != null) {
            arrayList.add("exterior_trim_type=" + fVar);
        }
        l lVar2 = this.f39312o3;
        if (lVar2 != null) {
            arrayList.add("steering_wheel_type=" + lVar2);
        }
        Boolean bool = this.f39316p3;
        if (bool != null) {
            arrayList.add("use_range_badging=" + bool);
        }
        Boolean bool2 = this.f39318q3;
        if (bool2 != null) {
            arrayList.add("range_plus_badging=" + bool2);
        }
        Boolean bool3 = this.f39319r3;
        if (bool3 != null) {
            arrayList.add("has_ludicrous_mode=" + bool3);
        }
        Boolean bool4 = this.f39320s3;
        if (bool4 != null) {
            arrayList.add("can_actuate_trunks=" + bool4);
        }
        Boolean bool5 = this.f39322t3;
        if (bool5 != null) {
            arrayList.add("has_air_suspension=" + bool5);
        }
        Boolean bool6 = this.f39323u3;
        if (bool6 != null) {
            arrayList.add("rhd=" + bool6);
        }
        Boolean bool7 = this.f39324v3;
        if (bool7 != null) {
            arrayList.add("plg=" + bool7);
        }
        Boolean bool8 = this.f39326w3;
        if (bool8 != null) {
            arrayList.add("ece_restrictions=" + bool8);
        }
        Boolean bool9 = this.f39330x3;
        if (bool9 != null) {
            arrayList.add("eu_vehicle=" + bool9);
        }
        Boolean bool10 = this.f39334y3;
        if (bool10 != null) {
            arrayList.add("motorized_charge_port=" + bool10);
        }
        Boolean bool11 = this.f39336z3;
        if (bool11 != null) {
            arrayList.add("can_accept_navigation_requests=" + bool11);
        }
        Integer num = this.A3;
        if (num != null) {
            arrayList.add("key_version=" + num);
        }
        Boolean bool12 = this.B3;
        if (bool12 != null) {
            arrayList.add("mobile_enabled=" + bool12);
        }
        Boolean bool13 = this.C3;
        if (bool13 != null) {
            arrayList.add("default_charge_to_max=" + bool13);
        }
        Boolean bool14 = this.D3;
        if (bool14 != null) {
            arrayList.add("steering_wheel_heater_installed=" + bool14);
        }
        Boolean bool15 = this.E3;
        if (bool15 != null) {
            arrayList.add("sentry_mode_supported=" + bool15);
        }
        Boolean bool16 = this.F3;
        if (bool16 != null) {
            arrayList.add("homelink_supported=" + bool16);
        }
        Boolean bool17 = this.G3;
        if (bool17 != null) {
            arrayList.add("webcam_supported=" + bool17);
        }
        Boolean bool18 = this.H3;
        if (bool18 != null) {
            arrayList.add("bioweapon_mode_supported=" + bool18);
        }
        Boolean bool19 = this.I3;
        if (bool19 != null) {
            arrayList.add("dashcam_clip_save_supported=" + bool19);
        }
        Boolean bool20 = this.J3;
        if (bool20 != null) {
            arrayList.add("has_pws=" + bool20);
        }
        Integer num2 = this.K3;
        if (num2 != null) {
            arrayList.add("utc_offset=" + num2);
        }
        Boolean bool21 = this.L3;
        if (bool21 != null) {
            arrayList.add("has_seat_cooling=" + bool21);
        }
        Boolean bool22 = this.M3;
        if (bool22 != null) {
            arrayList.add("tpms_pressures_supported=" + bool22);
        }
        Integer num3 = this.N3;
        if (num3 != null) {
            arrayList.add("vehicle_badging=" + num3);
        }
        String str = this.O3;
        if (str != null) {
            String i17 = mr.d.i(str);
            arrayList.add("paint_color_override=" + i17);
        }
        String str2 = this.P3;
        if (str2 != null) {
            String i18 = mr.d.i(str2);
            arrayList.add("exterior_trim_override=" + i18);
        }
        h hVar2 = this.Q3;
        if (hVar2 != null) {
            arrayList.add("headlamp_type=" + hVar2);
        }
        a aVar3 = this.R3;
        if (aVar3 != null) {
            arrayList.add("aux_park_lamps=" + aVar3);
        }
        Boolean bool23 = this.S3;
        if (bool23 != null) {
            arrayList.add("is_raven=" + bool23);
        }
        Boolean bool24 = this.T3;
        if (bool24 != null) {
            arrayList.add("has_auto_seat_climate=" + bool24);
        }
        Boolean bool25 = this.U3;
        if (bool25 != null) {
            arrayList.add("has_front_row_seat_heaters=" + bool25);
        }
        Boolean bool26 = this.V3;
        if (bool26 != null) {
            arrayList.add("has_third_row_seat_heaters=" + bool26);
        }
        Boolean bool27 = this.W3;
        if (bool27 != null) {
            arrayList.add("supports_qr_pairing=" + bool27);
        }
        String str3 = this.X3;
        if (str3 != null) {
            String i19 = mr.d.i(str3);
            arrayList.add("vin=" + i19);
        }
        Boolean bool28 = this.Y3;
        if (bool28 != null) {
            arrayList.add("disable_window_vent_close=" + bool28);
        }
        Boolean bool29 = this.Z3;
        if (bool29 != null) {
            arrayList.add("webcam_selfie_supported=" + bool29);
        }
        Boolean bool30 = this.f39284a4;
        if (bool30 != null) {
            arrayList.add("cop_user_set_temp_supported=" + bool30);
        }
        Boolean bool31 = this.f39288b4;
        if (bool31 != null) {
            arrayList.add("has_auto_stw_heat=" + bool31);
        }
        Boolean bool32 = this.f39290c4;
        if (bool32 != null) {
            arrayList.add("red_brake_calipers=" + bool32);
        }
        k kVar2 = this.f39292d4;
        if (kVar2 != null) {
            arrayList.add("rearlight_type=" + kVar2);
        }
        l02 = e0.l0(arrayList, ", ", "VehicleConfig{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final e u() {
        return this.f39300i3;
    }

    public final kt.n u0() {
        return this.f39287b2;
    }

    public final Boolean v() {
        return this.f39326w3;
    }

    public final Boolean v0() {
        return this.E3;
    }

    public final boolean w() {
        return this.f39298h;
    }

    public final boolean w0() {
        return this.f39313p;
    }

    public final kt.d x() {
        return this.f39308m3;
    }

    public final kt.p x0() {
        return this.f39328x1;
    }

    public final Boolean y() {
        return this.f39330x3;
    }

    public final Boolean y0() {
        return this.D3;
    }

    public final boolean z() {
        return this.f39299i;
    }

    public final boolean z0() {
        return this.f39311o;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m799newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, int i11, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, int i12, boolean z33, boolean z34, int i13, String paint_color_override_OBSOLETE, String exterior_trim_override_OBSOLETE, h headlamp_type_OBSOLETE, a aux_park_lamps_OBSOLETE, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, String vin_OBSOLETE, kt.t tVar, kt.a aVar, b bVar, kt.r rVar, kt.v vVar, kt.p pVar, kt.m mVar, kt.e eVar, kt.k kVar, kt.n nVar, kt.l lVar, kt.s sVar, kt.c cVar, Instant instant, i iVar, e eVar2, j jVar, g gVar, kt.j jVar2, kt.d dVar, f fVar, l lVar2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Integer num2, Boolean bool21, Boolean bool22, Integer num3, String str, String str2, h hVar, a aVar2, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, String str3, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, k kVar2, okio.i unknownFields) {
        super(f39282e4, unknownFields);
        kotlin.jvm.internal.s.g(paint_color_override_OBSOLETE, "paint_color_override_OBSOLETE");
        kotlin.jvm.internal.s.g(exterior_trim_override_OBSOLETE, "exterior_trim_override_OBSOLETE");
        kotlin.jvm.internal.s.g(headlamp_type_OBSOLETE, "headlamp_type_OBSOLETE");
        kotlin.jvm.internal.s.g(aux_park_lamps_OBSOLETE, "aux_park_lamps_OBSOLETE");
        kotlin.jvm.internal.s.g(vin_OBSOLETE, "vin_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39283a = z11;
        this.f39285b = z12;
        this.f39289c = z13;
        this.f39291d = z14;
        this.f39293e = z15;
        this.f39294f = z16;
        this.f39295g = z17;
        this.f39298h = z18;
        this.f39299i = z19;
        this.f39301j = z21;
        this.f39303k = z22;
        this.f39305l = i11;
        this.f39307m = z23;
        this.f39309n = z24;
        this.f39311o = z25;
        this.f39313p = z26;
        this.f39317q = z27;
        this.f39321t = z28;
        this.f39325w = z29;
        this.f39327x = z31;
        this.f39331y = z32;
        this.f39335z = i12;
        this.A = z33;
        this.B = z34;
        this.C = i13;
        this.E = paint_color_override_OBSOLETE;
        this.F = exterior_trim_override_OBSOLETE;
        this.G = headlamp_type_OBSOLETE;
        this.H = aux_park_lamps_OBSOLETE;
        this.K = z35;
        this.L = z36;
        this.O = z37;
        this.P = z38;
        this.Q = z39;
        this.R = vin_OBSOLETE;
        this.T = tVar;
        this.Y = aVar;
        this.f39286b1 = bVar;
        this.f39296g1 = rVar;
        this.f39314p1 = vVar;
        this.f39328x1 = pVar;
        this.f39332y1 = mVar;
        this.Q1 = eVar;
        this.V1 = kVar;
        this.f39287b2 = nVar;
        this.f39297g2 = lVar;
        this.f39315p2 = sVar;
        this.f39329x2 = cVar;
        this.f39333y2 = instant;
        this.Q2 = iVar;
        this.f39300i3 = eVar2;
        this.f39302j3 = jVar;
        this.f39304k3 = gVar;
        this.f39306l3 = jVar2;
        this.f39308m3 = dVar;
        this.f39310n3 = fVar;
        this.f39312o3 = lVar2;
        this.f39316p3 = bool;
        this.f39318q3 = bool2;
        this.f39319r3 = bool3;
        this.f39320s3 = bool4;
        this.f39322t3 = bool5;
        this.f39323u3 = bool6;
        this.f39324v3 = bool7;
        this.f39326w3 = bool8;
        this.f39330x3 = bool9;
        this.f39334y3 = bool10;
        this.f39336z3 = bool11;
        this.A3 = num;
        this.B3 = bool12;
        this.C3 = bool13;
        this.D3 = bool14;
        this.E3 = bool15;
        this.F3 = bool16;
        this.G3 = bool17;
        this.H3 = bool18;
        this.I3 = bool19;
        this.J3 = bool20;
        this.K3 = num2;
        this.L3 = bool21;
        this.M3 = bool22;
        this.N3 = num3;
        this.O3 = str;
        this.P3 = str2;
        this.Q3 = hVar;
        this.R3 = aVar2;
        this.S3 = bool23;
        this.T3 = bool24;
        this.U3 = bool25;
        this.V3 = bool26;
        this.W3 = bool27;
        this.X3 = str3;
        this.Y3 = bool28;
        this.Z3 = bool29;
        this.f39284a4 = bool30;
        this.f39288b4 = bool31;
        this.f39290c4 = bool32;
        this.f39292d4 = kVar2;
    }
}