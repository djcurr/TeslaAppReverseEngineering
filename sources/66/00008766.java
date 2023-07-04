package mt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class k extends com.squareup.wire.f {
    public static final ProtoAdapter<k> S3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterNoPowerOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 23)
    private final boolean A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sideMirrorHeaters", tag = 127)
    private final Boolean A3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeaterOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 25)
    private final boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreconditioning", tag = 128)
    private final Boolean B3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "wiperBladeHeaterOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 26)
    private final boolean C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteHeaterControlEnabled", tag = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE)
    private final Boolean C3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeOn", tag = 134)
    private final Boolean D3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sideMirrorHeatersOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 27)
    private final boolean E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoConditioningOn", tag = 136)
    private final Boolean E3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreconditioningOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 28)
    private final boolean F;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateLeft", tag = 137)
    private final Boolean F3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteHeaterControlEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 29)
    private final boolean G;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateRight", tag = 138)
    private final Boolean G3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeOnOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 34)
    private final boolean H;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontLeft", tag = 139)
    private final Integer H3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontRight", tag = 140)
    private final Integer I3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowCabinOverheatProtection", tag = 141)
    private final Boolean J3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoConditioningOnOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 36)
    private final boolean K;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsFanOnlyCabinOverheatProtection", tag = 142)
    private final Boolean K3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateLeftOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 37)
    private final boolean L;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CabinOverheatProtection_E#ADAPTER", jsonName = "cabinOverheatProtection", tag = 143)
    private final b L3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cabinOverheatProtectionActivelyCooling", tag = 144)
    private final Boolean M3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CopActivationTemp#ADAPTER", jsonName = "copActivationTemperature", tag = 146)
    private final f N3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateRightOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 38)
    private final boolean O;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSteeringWheelHeat", tag = 147)
    private final Boolean O3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontLeftOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 39)
    private final int P;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.StwHeatLevel#ADAPTER", jsonName = "steeringWheelHeatLevel", tag = 148)
    private final kt.q P3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontRightOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 40)
    private final int Q;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$DefrostMode#ADAPTER", jsonName = "defrostMode", label = q.a.OMIT_IDENTITY, tag = 35)
    private final g Q1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFrontDefrosterOn", tag = 107)
    private final Boolean Q2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$HvacAutoRequest#ADAPTER", jsonName = "hvacAutoRequest", tag = 150)
    private final h Q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowCabinOverheatProtectionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 41)
    private final boolean R;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$COPNotRunningReason#ADAPTER", jsonName = "copNotRunningReason", tag = 151)
    private final a R3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsFanOnlyCabinOverheatProtectionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 42)
    private final boolean T;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "insideTempCelsius", tag = 101)
    private final Float V1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CabinOverheatProtection_E#ADAPTER", jsonName = "cabinOverheatProtectionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 43)
    private final b Y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "insideTempCelsiusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final float f39048a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "outsideTempCelsiusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b */
    private final float f39049b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cabinOverheatProtectionActivelyCoolingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 44)

    /* renamed from: b1 */
    private final boolean f39050b1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "outsideTempCelsius", tag = 102)

    /* renamed from: b2 */
    private final Float f39051b2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempSettingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c */
    private final float f39052c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempSettingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d */
    private final float f39053d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "leftTempDirectionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e */
    private final int f39054e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rightTempDirectionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f */
    private final int f39055f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFrontDefrosterOnOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g */
    private final boolean f39056g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "copActivationTempOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 45)

    /* renamed from: g1 */
    private final float f39057g1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempSetting", tag = 103)

    /* renamed from: g2 */
    private final Float f39058g2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRearDefrosterOnOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h */
    private final boolean f39059h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fanStatusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i */
    private final int f39060i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRearDefrosterOn", tag = 108)

    /* renamed from: i3 */
    private final Boolean f39061i3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClimateOnOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j */
    private final boolean f39062j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fanStatus", tag = 109)

    /* renamed from: j3 */
    private final Integer f39063j3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minAvailTempCelsiusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: k */
    private final float f39064k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClimateOn", tag = 110)

    /* renamed from: k3 */
    private final Boolean f39065k3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxAvailTempCelsiusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: l */
    private final float f39066l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minAvailTempCelsius", tag = 111)

    /* renamed from: l3 */
    private final Float f39067l3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterLeftOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: m */
    private final int f39068m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxAvailTempCelsius", tag = 112)

    /* renamed from: m3 */
    private final Float f39069m3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRightOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: n */
    private final int f39070n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterLeft", tag = 113)

    /* renamed from: n3 */
    private final Integer f39071n3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: o */
    private final int f39072o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRight", tag = 114)

    /* renamed from: o3 */
    private final Integer f39073o3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: p */
    private final int f39074p;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$HvacAutoRequest#ADAPTER", jsonName = "hvacAutoRequestOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 50)

    /* renamed from: p1 */
    private final h f39075p1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempSetting", tag = 104)

    /* renamed from: p2 */
    private final Float f39076p2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeft", tag = 115)

    /* renamed from: p3 */
    private final Integer f39077p3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearCenterOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: q */
    private final int f39078q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRight", tag = 116)

    /* renamed from: q3 */
    private final Integer f39079q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearCenter", tag = 117)

    /* renamed from: r3 */
    private final Integer f39080r3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightBack", tag = 118)

    /* renamed from: s3 */
    private final Integer f39081s3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightBackOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: t */
    private final int f39082t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftBack", tag = 119)

    /* renamed from: t3 */
    private final Integer f39083t3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowRight", tag = 120)

    /* renamed from: u3 */
    private final Integer f39084u3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowLeft", tag = 121)

    /* renamed from: v3 */
    private final Integer f39085v3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftBackOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: w */
    private final int f39086w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeater", tag = 122)

    /* renamed from: w3 */
    private final Boolean f39087w3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowRightOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: x */
    private final int f39088x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$ClimateKeeperMode#ADAPTER", jsonName = "climateKeeperMode", label = q.a.OMIT_IDENTITY, tag = 30)

    /* renamed from: x1 */
    private final c f39089x1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "leftTempDirection", tag = 105)

    /* renamed from: x2 */
    private final Integer f39090x2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterNoPower", tag = 123)

    /* renamed from: x3 */
    private final Boolean f39091x3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowLeftOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: y */
    private final int f39092y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 33)

    /* renamed from: y1 */
    private final Instant f39093y1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rightTempDirection", tag = 106)

    /* renamed from: y2 */
    private final Integer f39094y2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeater", tag = 125)

    /* renamed from: y3 */
    private final Boolean f39095y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: z */
    private final boolean f39096z;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "wiperBladeHeater", tag = 126)

    /* renamed from: z3 */
    private final Boolean f39097z3;

    /* loaded from: classes6.dex */
    public enum a implements com.squareup.wire.p {
        COPNotRunningReasonNoReason(0),
        COPNotRunningReasonUserInteraction(1),
        COPNotRunningReasonEnergyConsumptionReached(2),
        COPNotRunningReasonTimeout(3),
        COPNotRunningReasonLowSolarLoad(4),
        COPNotRunningReasonFault(5),
        COPNotRunningReasonCabinBelowThreshold(6);
        
        public static final ProtoAdapter<a> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* renamed from: mt.k$a$a */
        /* loaded from: classes6.dex */
        public static final class C0755a extends com.squareup.wire.a<a> {
            C0755a(n00.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
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
                switch (i11) {
                    case 0:
                        return a.COPNotRunningReasonNoReason;
                    case 1:
                        return a.COPNotRunningReasonUserInteraction;
                    case 2:
                        return a.COPNotRunningReasonEnergyConsumptionReached;
                    case 3:
                        return a.COPNotRunningReasonTimeout;
                    case 4:
                        return a.COPNotRunningReasonLowSolarLoad;
                    case 5:
                        return a.COPNotRunningReasonFault;
                    case 6:
                        return a.COPNotRunningReasonCabinBelowThreshold;
                    default:
                        return null;
                }
            }
        }

        static {
            a aVar;
            ADAPTER = new C0755a(m0.b(a.class), com.squareup.wire.o.PROTO_3, aVar);
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
    public enum b implements com.squareup.wire.p {
        CabinOverheatProtectionOff(0),
        CabinOverheatProtectionOn(1),
        CabinOverheatProtectionFanOnly(2);
        
        public static final ProtoAdapter<b> ADAPTER;
        public static final C0756b Companion = new C0756b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<b> {
            a(n00.d<b> dVar, com.squareup.wire.o oVar, b bVar) {
                super(dVar, oVar, bVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public b d(int i11) {
                return b.Companion.a(i11);
            }
        }

        /* renamed from: mt.k$b$b */
        /* loaded from: classes6.dex */
        public static final class C0756b {
            private C0756b() {
            }

            public /* synthetic */ C0756b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return b.CabinOverheatProtectionFanOnly;
                    }
                    return b.CabinOverheatProtectionOn;
                }
                return b.CabinOverheatProtectionOff;
            }
        }

        static {
            b bVar;
            ADAPTER = new a(m0.b(b.class), com.squareup.wire.o.PROTO_3, bVar);
        }

        b(int i11) {
            this.value = i11;
        }

        public static final b fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: f */
        public static final ProtoAdapter<c> f39098f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39099a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39100b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39101c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39102d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39103e;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState.ClimateKeeperMode", oVar, (Object) null);
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
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new c(uVar, uVar2, uVar3, uVar4, uVar5, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, c value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.f());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                protoAdapter.encodeWithTag(writer, 3, value.d());
                protoAdapter.encodeWithTag(writer, 4, value.b());
                protoAdapter.encodeWithTag(writer, 5, value.e());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.d()) + protoAdapter.encodedSizeWithTag(4, value.b()) + protoAdapter.encodedSizeWithTag(5, value.e());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public c redact(c value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u f11 = value.f();
                kt.u redact = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u c11 = value.c();
                kt.u redact2 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u d11 = value.d();
                kt.u redact3 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u b11 = value.b();
                kt.u redact4 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u e11 = value.e();
                return value.a(redact, redact2, redact3, redact4, e11 != null ? kt.u.f35845a.redact(e11) : null, okio.i.f42656d);
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
            f39098f = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), com.squareup.wire.o.PROTO_3);
        }

        public c() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) == 0 ? uVar5 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
        }

        public final c a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new c(uVar, uVar2, uVar3, uVar4, uVar5, unknownFields);
        }

        public final kt.u b() {
            return this.f39102d;
        }

        public final kt.u c() {
            return this.f39100b;
        }

        public final kt.u d() {
            return this.f39101c;
        }

        public final kt.u e() {
            return this.f39103e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39099a, cVar.f39099a) && kotlin.jvm.internal.s.c(this.f39100b, cVar.f39100b) && kotlin.jvm.internal.s.c(this.f39101c, cVar.f39101c) && kotlin.jvm.internal.s.c(this.f39102d, cVar.f39102d) && kotlin.jvm.internal.s.c(this.f39103e, cVar.f39103e);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39099a;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39099a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39100b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39101c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39102d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39103e;
                int hashCode6 = hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m779newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39099a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39100b;
            if (uVar2 != null) {
                arrayList.add("Off=" + uVar2);
            }
            kt.u uVar3 = this.f39101c;
            if (uVar3 != null) {
                arrayList.add("On=" + uVar3);
            }
            kt.u uVar4 = this.f39102d;
            if (uVar4 != null) {
                arrayList.add("Dog=" + uVar4);
            }
            kt.u uVar5 = this.f39103e;
            if (uVar5 != null) {
                arrayList.add("Party=" + uVar5);
            }
            l02 = e0.l0(arrayList, ", ", "ClimateKeeperMode{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m779newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            super(f39098f, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39099a = uVar;
            this.f39100b = uVar2;
            this.f39101c = uVar3;
            this.f39102d = uVar4;
            this.f39103e = uVar5;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Off, On, Dog, Party may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends ProtoAdapter<k> {
        d(com.squareup.wire.b bVar, n00.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public k decode(com.squareup.wire.k reader) {
            b bVar;
            long j11;
            kotlin.jvm.internal.s.g(reader, "reader");
            b bVar2 = b.CabinOverheatProtectionOff;
            h hVar = h.HvacAutoRequestOn;
            long d11 = reader.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            boolean z12 = false;
            int i13 = 0;
            boolean z13 = false;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            int i24 = 0;
            int i25 = 0;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            c cVar = null;
            Instant instant = null;
            g gVar = null;
            Float f17 = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num3 = null;
            Boolean bool3 = null;
            Float f22 = null;
            Float f23 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            Integer num11 = null;
            Integer num12 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Integer num13 = null;
            Integer num14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            b bVar3 = null;
            Boolean bool17 = null;
            f fVar = null;
            Boolean bool18 = null;
            kt.q qVar = null;
            h hVar2 = null;
            a aVar = null;
            h hVar3 = hVar;
            float f24 = 0.0f;
            b bVar4 = bVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new k(f24, f11, f12, f13, i11, i12, z11, z12, i13, z13, f14, f15, i14, i15, i16, i17, i18, i19, i21, i22, i23, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, i24, i25, z26, z27, bVar4, z28, f16, hVar3, cVar, instant, gVar, f17, f18, f19, f21, num, num2, bool, bool2, num3, bool3, f22, f23, num4, num5, num6, num7, num8, num9, num10, num11, num12, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, num13, num14, bool15, bool16, bVar3, bool17, fVar, bool18, qVar, hVar2, aVar, reader.e(d11));
                }
                if (g11 == 50) {
                    bVar = bVar4;
                    j11 = d11;
                    try {
                        hVar3 = h.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                    b0 b0Var = b0.f54756a;
                } else if (g11 == 134) {
                    bVar = bVar4;
                    j11 = d11;
                    Boolean decode = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var2 = b0.f54756a;
                    bool11 = decode;
                } else if (g11 == 150) {
                    bVar = bVar4;
                    j11 = d11;
                    try {
                        hVar2 = h.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                    b0 b0Var3 = b0.f54756a;
                } else if (g11 != 151) {
                    switch (g11) {
                        case 1:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var4 = b0.f54756a;
                            f24 = floatValue;
                            break;
                        case 2:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var5 = b0.f54756a;
                            f11 = floatValue2;
                            break;
                        case 3:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var6 = b0.f54756a;
                            f12 = floatValue3;
                            break;
                        case 4:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var7 = b0.f54756a;
                            f13 = floatValue4;
                            break;
                        case 5:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var8 = b0.f54756a;
                            i11 = intValue;
                            break;
                        case 6:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var9 = b0.f54756a;
                            i12 = intValue2;
                            break;
                        case 7:
                            bVar = bVar4;
                            j11 = d11;
                            boolean booleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var10 = b0.f54756a;
                            z11 = booleanValue;
                            break;
                        case 8:
                            bVar = bVar4;
                            j11 = d11;
                            boolean booleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var11 = b0.f54756a;
                            z12 = booleanValue2;
                            break;
                        case 9:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var12 = b0.f54756a;
                            i13 = intValue3;
                            break;
                        case 10:
                            bVar = bVar4;
                            j11 = d11;
                            boolean booleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var13 = b0.f54756a;
                            z13 = booleanValue3;
                            break;
                        case 11:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var14 = b0.f54756a;
                            f14 = floatValue5;
                            break;
                        case 12:
                            bVar = bVar4;
                            j11 = d11;
                            float floatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var15 = b0.f54756a;
                            f15 = floatValue6;
                            break;
                        case 13:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var16 = b0.f54756a;
                            i14 = intValue4;
                            break;
                        case 14:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var17 = b0.f54756a;
                            i15 = intValue5;
                            break;
                        case 15:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var18 = b0.f54756a;
                            i16 = intValue6;
                            break;
                        case 16:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var19 = b0.f54756a;
                            i17 = intValue7;
                            break;
                        case 17:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue8 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var20 = b0.f54756a;
                            i18 = intValue8;
                            break;
                        case 18:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue9 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var21 = b0.f54756a;
                            i19 = intValue9;
                            break;
                        case 19:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue10 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var22 = b0.f54756a;
                            i21 = intValue10;
                            break;
                        case 20:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue11 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var23 = b0.f54756a;
                            i22 = intValue11;
                            break;
                        case 21:
                            bVar = bVar4;
                            j11 = d11;
                            int intValue12 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var24 = b0.f54756a;
                            i23 = intValue12;
                            break;
                        case 22:
                            bVar = bVar4;
                            j11 = d11;
                            boolean booleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var25 = b0.f54756a;
                            z14 = booleanValue4;
                            break;
                        case 23:
                            bVar = bVar4;
                            j11 = d11;
                            boolean booleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var26 = b0.f54756a;
                            z15 = booleanValue5;
                            break;
                        default:
                            switch (g11) {
                                case 25:
                                    bVar = bVar4;
                                    j11 = d11;
                                    boolean booleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var27 = b0.f54756a;
                                    z16 = booleanValue6;
                                    break;
                                case 26:
                                    bVar = bVar4;
                                    j11 = d11;
                                    boolean booleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var28 = b0.f54756a;
                                    z17 = booleanValue7;
                                    break;
                                case 27:
                                    bVar = bVar4;
                                    j11 = d11;
                                    boolean booleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var29 = b0.f54756a;
                                    z18 = booleanValue8;
                                    break;
                                case 28:
                                    bVar = bVar4;
                                    j11 = d11;
                                    boolean booleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var30 = b0.f54756a;
                                    z19 = booleanValue9;
                                    break;
                                case 29:
                                    bVar = bVar4;
                                    j11 = d11;
                                    boolean booleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var31 = b0.f54756a;
                                    z21 = booleanValue10;
                                    break;
                                case 30:
                                    bVar = bVar4;
                                    j11 = d11;
                                    c decode2 = c.f39098f.decode(reader);
                                    b0 b0Var32 = b0.f54756a;
                                    cVar = decode2;
                                    break;
                                default:
                                    switch (g11) {
                                        case 33:
                                            bVar = bVar4;
                                            j11 = d11;
                                            Instant decode3 = ProtoAdapter.INSTANT.decode(reader);
                                            b0 b0Var33 = b0.f54756a;
                                            instant = decode3;
                                            break;
                                        case 34:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var34 = b0.f54756a;
                                            z22 = booleanValue11;
                                            break;
                                        case 35:
                                            bVar = bVar4;
                                            j11 = d11;
                                            g decode4 = g.f39104d.decode(reader);
                                            b0 b0Var35 = b0.f54756a;
                                            gVar = decode4;
                                            break;
                                        case 36:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var36 = b0.f54756a;
                                            z23 = booleanValue12;
                                            break;
                                        case 37:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var37 = b0.f54756a;
                                            z24 = booleanValue13;
                                            break;
                                        case 38:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var38 = b0.f54756a;
                                            z25 = booleanValue14;
                                            break;
                                        case 39:
                                            bVar = bVar4;
                                            j11 = d11;
                                            int intValue13 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var39 = b0.f54756a;
                                            i24 = intValue13;
                                            break;
                                        case 40:
                                            bVar = bVar4;
                                            j11 = d11;
                                            int intValue14 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var40 = b0.f54756a;
                                            i25 = intValue14;
                                            break;
                                        case 41:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var41 = b0.f54756a;
                                            z26 = booleanValue15;
                                            break;
                                        case 42:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var42 = b0.f54756a;
                                            z27 = booleanValue16;
                                            break;
                                        case 43:
                                            b bVar5 = bVar4;
                                            j11 = d11;
                                            try {
                                                bVar4 = b.ADAPTER.decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                                                bVar4 = bVar5;
                                            }
                                            b0 b0Var43 = b0.f54756a;
                                            continue;
                                            d11 = j11;
                                        case 44:
                                            bVar = bVar4;
                                            j11 = d11;
                                            boolean booleanValue17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var44 = b0.f54756a;
                                            z28 = booleanValue17;
                                            break;
                                        case 45:
                                            bVar = bVar4;
                                            j11 = d11;
                                            float floatValue7 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                            b0 b0Var45 = b0.f54756a;
                                            f16 = floatValue7;
                                            break;
                                        default:
                                            switch (g11) {
                                                case 101:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode5 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var46 = b0.f54756a;
                                                    f17 = decode5;
                                                    break;
                                                case 102:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode6 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var47 = b0.f54756a;
                                                    f18 = decode6;
                                                    break;
                                                case 103:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode7 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var48 = b0.f54756a;
                                                    f19 = decode7;
                                                    break;
                                                case 104:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode8 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var49 = b0.f54756a;
                                                    f21 = decode8;
                                                    break;
                                                case 105:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode9 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var50 = b0.f54756a;
                                                    num = decode9;
                                                    break;
                                                case 106:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode10 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var51 = b0.f54756a;
                                                    num2 = decode10;
                                                    break;
                                                case 107:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Boolean decode11 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var52 = b0.f54756a;
                                                    bool = decode11;
                                                    break;
                                                case 108:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Boolean decode12 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var53 = b0.f54756a;
                                                    bool2 = decode12;
                                                    break;
                                                case 109:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode13 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var54 = b0.f54756a;
                                                    num3 = decode13;
                                                    break;
                                                case 110:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Boolean decode14 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var55 = b0.f54756a;
                                                    bool3 = decode14;
                                                    break;
                                                case 111:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode15 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var56 = b0.f54756a;
                                                    f22 = decode15;
                                                    break;
                                                case 112:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Float decode16 = ProtoAdapter.FLOAT.decode(reader);
                                                    b0 b0Var57 = b0.f54756a;
                                                    f23 = decode16;
                                                    break;
                                                case 113:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode17 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var58 = b0.f54756a;
                                                    num4 = decode17;
                                                    break;
                                                case 114:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode18 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var59 = b0.f54756a;
                                                    num5 = decode18;
                                                    break;
                                                case 115:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode19 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var60 = b0.f54756a;
                                                    num6 = decode19;
                                                    break;
                                                case 116:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode20 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var61 = b0.f54756a;
                                                    num7 = decode20;
                                                    break;
                                                case 117:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode21 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var62 = b0.f54756a;
                                                    num8 = decode21;
                                                    break;
                                                case 118:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode22 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var63 = b0.f54756a;
                                                    num9 = decode22;
                                                    break;
                                                case 119:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode23 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var64 = b0.f54756a;
                                                    num10 = decode23;
                                                    break;
                                                case 120:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode24 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var65 = b0.f54756a;
                                                    num11 = decode24;
                                                    break;
                                                case 121:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Integer decode25 = ProtoAdapter.INT32.decode(reader);
                                                    b0 b0Var66 = b0.f54756a;
                                                    num12 = decode25;
                                                    break;
                                                case 122:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Boolean decode26 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var67 = b0.f54756a;
                                                    bool4 = decode26;
                                                    break;
                                                case 123:
                                                    bVar = bVar4;
                                                    j11 = d11;
                                                    Boolean decode27 = ProtoAdapter.BOOL.decode(reader);
                                                    b0 b0Var68 = b0.f54756a;
                                                    bool5 = decode27;
                                                    break;
                                                default:
                                                    switch (g11) {
                                                        case 125:
                                                            bVar = bVar4;
                                                            j11 = d11;
                                                            Boolean decode28 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var69 = b0.f54756a;
                                                            bool6 = decode28;
                                                            break;
                                                        case 126:
                                                            bVar = bVar4;
                                                            j11 = d11;
                                                            Boolean decode29 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var70 = b0.f54756a;
                                                            bool7 = decode29;
                                                            break;
                                                        case 127:
                                                            bVar = bVar4;
                                                            j11 = d11;
                                                            Boolean decode30 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var71 = b0.f54756a;
                                                            bool8 = decode30;
                                                            break;
                                                        case 128:
                                                            bVar = bVar4;
                                                            j11 = d11;
                                                            Boolean decode31 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var72 = b0.f54756a;
                                                            bool9 = decode31;
                                                            break;
                                                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                                            bVar = bVar4;
                                                            j11 = d11;
                                                            Boolean decode32 = ProtoAdapter.BOOL.decode(reader);
                                                            b0 b0Var73 = b0.f54756a;
                                                            bool10 = decode32;
                                                            break;
                                                        default:
                                                            switch (g11) {
                                                                case 136:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode33 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var74 = b0.f54756a;
                                                                    bool12 = decode33;
                                                                    break;
                                                                case 137:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode34 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var75 = b0.f54756a;
                                                                    bool13 = decode34;
                                                                    break;
                                                                case 138:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode35 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var76 = b0.f54756a;
                                                                    bool14 = decode35;
                                                                    break;
                                                                case 139:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Integer decode36 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var77 = b0.f54756a;
                                                                    num13 = decode36;
                                                                    break;
                                                                case 140:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Integer decode37 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var78 = b0.f54756a;
                                                                    num14 = decode37;
                                                                    break;
                                                                case 141:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode38 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var79 = b0.f54756a;
                                                                    bool15 = decode38;
                                                                    break;
                                                                case 142:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode39 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var80 = b0.f54756a;
                                                                    bool16 = decode39;
                                                                    break;
                                                                case 143:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    try {
                                                                        bVar3 = b.ADAPTER.decode(reader);
                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                                                                    }
                                                                    b0 b0Var81 = b0.f54756a;
                                                                    break;
                                                                case 144:
                                                                    bVar = bVar4;
                                                                    j11 = d11;
                                                                    Boolean decode40 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var82 = b0.f54756a;
                                                                    bool17 = decode40;
                                                                    break;
                                                                default:
                                                                    switch (g11) {
                                                                        case 146:
                                                                            bVar = bVar4;
                                                                            j11 = d11;
                                                                            try {
                                                                                fVar = f.ADAPTER.decode(reader);
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                                                                            }
                                                                            b0 b0Var83 = b0.f54756a;
                                                                            break;
                                                                        case 147:
                                                                            bVar = bVar4;
                                                                            j11 = d11;
                                                                            Boolean decode41 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var84 = b0.f54756a;
                                                                            bool18 = decode41;
                                                                            break;
                                                                        case 148:
                                                                            try {
                                                                                qVar = kt.q.ADAPTER.decode(reader);
                                                                                bVar = bVar4;
                                                                                j11 = d11;
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                                                                bVar = bVar4;
                                                                                j11 = d11;
                                                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e16.f20831a));
                                                                            }
                                                                            b0 b0Var85 = b0.f54756a;
                                                                            break;
                                                                        default:
                                                                            reader.m(g11);
                                                                            b0 b0Var86 = b0.f54756a;
                                                                            j11 = d11;
                                                                            continue;
                                                                            continue;
                                                                            continue;
                                                                    }
                                                            }
                                                    }
                                            }
                                            d11 = j11;
                                    }
                            }
                    }
                } else {
                    bVar = bVar4;
                    j11 = d11;
                    try {
                        aVar = a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e17.f20831a));
                    }
                    b0 b0Var87 = b0.f54756a;
                }
                bVar4 = bVar;
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, k value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!(value.F() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.F()));
            }
            if (!(value.N() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.N()));
            }
            if (!(value.z() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.z()));
            }
            if (!(value.P() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.P()));
            }
            if (value.H() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.H()));
            }
            if (value.T() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.T()));
            }
            if (value.F0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.F0()));
            }
            if (value.J0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.J0()));
            }
            if (value.B() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 9, Integer.valueOf(value.B()));
            }
            if (value.D0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.D0()));
            }
            if (!(value.L() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 11, Float.valueOf(value.L()));
            }
            if (!(value.J() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 12, Float.valueOf(value.J()));
            }
            if (value.Z() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 13, Integer.valueOf(value.Z()));
            }
            if (value.l0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 14, Integer.valueOf(value.l0()));
            }
            if (value.d0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 15, Integer.valueOf(value.d0()));
            }
            if (value.h0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.h0()));
            }
            if (value.b0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 17, Integer.valueOf(value.b0()));
            }
            if (value.j0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 18, Integer.valueOf(value.j0()));
            }
            if (value.f0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.f0()));
            }
            if (value.p0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 20, Integer.valueOf(value.p0()));
            }
            if (value.n0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 21, Integer.valueOf(value.n0()));
            }
            if (value.k()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.k()));
            }
            if (value.m()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.m()));
            }
            if (value.u0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 25, Boolean.valueOf(value.u0()));
            }
            if (value.z0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 26, Boolean.valueOf(value.z0()));
            }
            if (value.r0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 27, Boolean.valueOf(value.r0()));
            }
            if (value.H0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 28, Boolean.valueOf(value.H0()));
            }
            if (value.R()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 29, Boolean.valueOf(value.R()));
            }
            if (value.o()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 34, Boolean.valueOf(value.o()));
            }
            if (value.B0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.B0()));
            }
            if (value.f()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 37, Boolean.valueOf(value.f()));
            }
            if (value.h()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 38, Boolean.valueOf(value.h()));
            }
            if (value.V() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 39, Integer.valueOf(value.V()));
            }
            if (value.X() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 40, Integer.valueOf(value.X()));
            }
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 41, Boolean.valueOf(value.d()));
            }
            if (value.w0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 42, Boolean.valueOf(value.w0()));
            }
            if (value.q() != b.CabinOverheatProtectionOff) {
                b.ADAPTER.encodeWithTag(writer, 43, value.q());
            }
            if (value.s()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 44, Boolean.valueOf(value.s()));
            }
            if (!(value.u() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 45, Float.valueOf(value.u()));
            }
            if (value.D() != h.HvacAutoRequestOn) {
                h.ADAPTER.encodeWithTag(writer, 50, value.D());
            }
            if (value.t() != null) {
                c.f39098f.encodeWithTag(writer, 30, value.t());
            }
            if (value.x0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 33, value.x0());
            }
            if (value.x() != null) {
                g.f39104d.encodeWithTag(writer, 35, value.x());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 101, value.E());
            protoAdapter.encodeWithTag(writer, 102, value.M());
            protoAdapter.encodeWithTag(writer, 103, value.y());
            protoAdapter.encodeWithTag(writer, 104, value.O());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 105, value.G());
            protoAdapter2.encodeWithTag(writer, 106, value.S());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(writer, 107, value.E0());
            protoAdapter3.encodeWithTag(writer, 108, value.I0());
            protoAdapter2.encodeWithTag(writer, 109, value.A());
            protoAdapter3.encodeWithTag(writer, 110, value.C0());
            protoAdapter.encodeWithTag(writer, 111, value.K());
            protoAdapter.encodeWithTag(writer, 112, value.I());
            protoAdapter2.encodeWithTag(writer, 113, value.Y());
            protoAdapter2.encodeWithTag(writer, 114, value.k0());
            protoAdapter2.encodeWithTag(writer, 115, value.c0());
            protoAdapter2.encodeWithTag(writer, 116, value.g0());
            protoAdapter2.encodeWithTag(writer, 117, value.a0());
            protoAdapter2.encodeWithTag(writer, 118, value.i0());
            protoAdapter2.encodeWithTag(writer, 119, value.e0());
            protoAdapter2.encodeWithTag(writer, 120, value.o0());
            protoAdapter2.encodeWithTag(writer, 121, value.m0());
            protoAdapter3.encodeWithTag(writer, 122, value.j());
            protoAdapter3.encodeWithTag(writer, 123, value.l());
            protoAdapter3.encodeWithTag(writer, 125, value.t0());
            protoAdapter3.encodeWithTag(writer, 126, value.y0());
            protoAdapter3.encodeWithTag(writer, 127, value.q0());
            protoAdapter3.encodeWithTag(writer, 128, value.G0());
            protoAdapter3.encodeWithTag(writer, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.Q());
            protoAdapter3.encodeWithTag(writer, 134, value.n());
            protoAdapter3.encodeWithTag(writer, 136, value.A0());
            protoAdapter3.encodeWithTag(writer, 137, value.e());
            protoAdapter3.encodeWithTag(writer, 138, value.g());
            protoAdapter2.encodeWithTag(writer, 139, value.U());
            protoAdapter2.encodeWithTag(writer, 140, value.W());
            protoAdapter3.encodeWithTag(writer, 141, value.c());
            protoAdapter3.encodeWithTag(writer, 142, value.v0());
            b.ADAPTER.encodeWithTag(writer, 143, value.p());
            protoAdapter3.encodeWithTag(writer, 144, value.r());
            f.ADAPTER.encodeWithTag(writer, 146, value.v());
            protoAdapter3.encodeWithTag(writer, 147, value.i());
            kt.q.ADAPTER.encodeWithTag(writer, 148, value.s0());
            h.ADAPTER.encodeWithTag(writer, 150, value.C());
            a.ADAPTER.encodeWithTag(writer, 151, value.w());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(k value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.F() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.F()));
            }
            if (!(value.N() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.N()));
            }
            if (!(value.z() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.z()));
            }
            if (!(value.P() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.P()));
            }
            if (value.H() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.H()));
            }
            if (value.T() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.T()));
            }
            if (value.F0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.F0()));
            }
            if (value.J0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.J0()));
            }
            if (value.B() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.B()));
            }
            if (value.D0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.D0()));
            }
            if (!(value.L() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.L()));
            }
            if (!(value.J() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(12, Float.valueOf(value.J()));
            }
            if (value.Z() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.Z()));
            }
            if (value.l0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(14, Integer.valueOf(value.l0()));
            }
            if (value.d0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(15, Integer.valueOf(value.d0()));
            }
            if (value.h0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.h0()));
            }
            if (value.b0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.b0()));
            }
            if (value.j0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.j0()));
            }
            if (value.f0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.f0()));
            }
            if (value.p0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(20, Integer.valueOf(value.p0()));
            }
            if (value.n0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.n0()));
            }
            if (value.k()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.k()));
            }
            if (value.m()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.m()));
            }
            if (value.u0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.u0()));
            }
            if (value.z0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(26, Boolean.valueOf(value.z0()));
            }
            if (value.r0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.r0()));
            }
            if (value.H0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(28, Boolean.valueOf(value.H0()));
            }
            if (value.R()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(29, Boolean.valueOf(value.R()));
            }
            if (value.o()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(34, Boolean.valueOf(value.o()));
            }
            if (value.B0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.B0()));
            }
            if (value.f()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(37, Boolean.valueOf(value.f()));
            }
            if (value.h()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(38, Boolean.valueOf(value.h()));
            }
            if (value.V() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(39, Integer.valueOf(value.V()));
            }
            if (value.X() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(40, Integer.valueOf(value.X()));
            }
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.d()));
            }
            if (value.w0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.w0()));
            }
            if (value.q() != b.CabinOverheatProtectionOff) {
                z11 += b.ADAPTER.encodedSizeWithTag(43, value.q());
            }
            if (value.s()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(44, Boolean.valueOf(value.s()));
            }
            if (!(value.u() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(45, Float.valueOf(value.u()));
            }
            if (value.D() != h.HvacAutoRequestOn) {
                z11 += h.ADAPTER.encodedSizeWithTag(50, value.D());
            }
            if (value.t() != null) {
                z11 += c.f39098f.encodedSizeWithTag(30, value.t());
            }
            if (value.x0() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(33, value.x0());
            }
            if (value.x() != null) {
                z11 += g.f39104d.encodedSizeWithTag(35, value.x());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(101, value.E()) + protoAdapter.encodedSizeWithTag(102, value.M()) + protoAdapter.encodedSizeWithTag(103, value.y()) + protoAdapter.encodedSizeWithTag(104, value.O());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(105, value.G()) + protoAdapter2.encodedSizeWithTag(106, value.S());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(107, value.E0()) + protoAdapter3.encodedSizeWithTag(108, value.I0()) + protoAdapter2.encodedSizeWithTag(109, value.A()) + protoAdapter3.encodedSizeWithTag(110, value.C0()) + protoAdapter.encodedSizeWithTag(111, value.K()) + protoAdapter.encodedSizeWithTag(112, value.I()) + protoAdapter2.encodedSizeWithTag(113, value.Y()) + protoAdapter2.encodedSizeWithTag(114, value.k0()) + protoAdapter2.encodedSizeWithTag(115, value.c0()) + protoAdapter2.encodedSizeWithTag(116, value.g0()) + protoAdapter2.encodedSizeWithTag(117, value.a0()) + protoAdapter2.encodedSizeWithTag(118, value.i0()) + protoAdapter2.encodedSizeWithTag(119, value.e0()) + protoAdapter2.encodedSizeWithTag(120, value.o0()) + protoAdapter2.encodedSizeWithTag(121, value.m0()) + protoAdapter3.encodedSizeWithTag(122, value.j()) + protoAdapter3.encodedSizeWithTag(123, value.l()) + protoAdapter3.encodedSizeWithTag(125, value.t0()) + protoAdapter3.encodedSizeWithTag(126, value.y0()) + protoAdapter3.encodedSizeWithTag(127, value.q0()) + protoAdapter3.encodedSizeWithTag(128, value.G0()) + protoAdapter3.encodedSizeWithTag(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.Q()) + protoAdapter3.encodedSizeWithTag(134, value.n()) + protoAdapter3.encodedSizeWithTag(136, value.A0()) + protoAdapter3.encodedSizeWithTag(137, value.e()) + protoAdapter3.encodedSizeWithTag(138, value.g()) + protoAdapter2.encodedSizeWithTag(139, value.U()) + protoAdapter2.encodedSizeWithTag(140, value.W()) + protoAdapter3.encodedSizeWithTag(141, value.c()) + protoAdapter3.encodedSizeWithTag(142, value.v0()) + b.ADAPTER.encodedSizeWithTag(143, value.p()) + protoAdapter3.encodedSizeWithTag(144, value.r()) + f.ADAPTER.encodedSizeWithTag(146, value.v()) + protoAdapter3.encodedSizeWithTag(147, value.i()) + kt.q.ADAPTER.encodedSizeWithTag(148, value.s0()) + h.ADAPTER.encodedSizeWithTag(150, value.C()) + a.ADAPTER.encodedSizeWithTag(151, value.w());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public k redact(k value) {
            kotlin.jvm.internal.s.g(value, "value");
            c t11 = value.t();
            c redact = t11 == null ? null : c.f39098f.redact(t11);
            Instant x02 = value.x0();
            Instant redact2 = x02 == null ? null : ProtoAdapter.INSTANT.redact(x02);
            g x11 = value.x();
            return k.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, redact, redact2, x11 == null ? null : g.f39104d.redact(x11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, -1, -1793, 4194303, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum f implements com.squareup.wire.p {
        CopActivationTempUnspecified(0),
        CopActivationTempLow(1),
        CopActivationTempMedium(2),
        CopActivationTempHigh(3);
        
        public static final ProtoAdapter<f> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<f> {
            a(n00.d<f> dVar, com.squareup.wire.o oVar, f fVar) {
                super(dVar, oVar, fVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public f d(int i11) {
                return f.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return f.CopActivationTempHigh;
                        }
                        return f.CopActivationTempMedium;
                    }
                    return f.CopActivationTempLow;
                }
                return f.CopActivationTempUnspecified;
            }
        }

        static {
            f fVar;
            ADAPTER = new a(m0.b(f.class), com.squareup.wire.o.PROTO_3, fVar);
        }

        f(int i11) {
            this.value = i11;
        }

        public static final f fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends com.squareup.wire.f {

        /* renamed from: d */
        public static final ProtoAdapter<g> f39104d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39105a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39106b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39107c;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<g> {
            a(com.squareup.wire.b bVar, n00.d<g> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState.DefrostMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public g decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                kt.u uVar3 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new g(uVar, uVar2, uVar3, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, g value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.d());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(g value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.d()) + protoAdapter.encodedSizeWithTag(2, value.c()) + protoAdapter.encodedSizeWithTag(3, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public g redact(g value) {
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
            f39104d = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), com.squareup.wire.o.PROTO_3);
        }

        public g() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ g(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
        }

        public final g a(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new g(uVar, uVar2, uVar3, unknownFields);
        }

        public final kt.u b() {
            return this.f39107c;
        }

        public final kt.u c() {
            return this.f39106b;
        }

        public final kt.u d() {
            return this.f39105a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), gVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39105a, gVar.f39105a) && kotlin.jvm.internal.s.c(this.f39106b, gVar.f39106b) && kotlin.jvm.internal.s.c(this.f39107c, gVar.f39107c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39105a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39106b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39107c;
                int hashCode4 = hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m780newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39105a;
            if (uVar != null) {
                arrayList.add("Off=" + uVar);
            }
            kt.u uVar2 = this.f39106b;
            if (uVar2 != null) {
                arrayList.add("Normal=" + uVar2);
            }
            kt.u uVar3 = this.f39107c;
            if (uVar3 != null) {
                arrayList.add("Max=" + uVar3);
            }
            l02 = e0.l0(arrayList, ", ", "DefrostMode{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m780newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kt.u uVar, kt.u uVar2, kt.u uVar3, okio.i unknownFields) {
            super(f39104d, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39105a = uVar;
            this.f39106b = uVar2;
            this.f39107c = uVar3;
            if (!(mr.d.d(uVar, uVar2, uVar3) <= 1)) {
                throw new IllegalArgumentException("At most one of Off, Normal, Max may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum h implements com.squareup.wire.p {
        HvacAutoRequestOn(0),
        HvacAutoRequestOverride(1);
        
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
                        return null;
                    }
                    return h.HvacAutoRequestOverride;
                }
                return h.HvacAutoRequestOn;
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

    static {
        new e(null);
        S3 = new d(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(k.class), com.squareup.wire.o.PROTO_3);
    }

    public k() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 8388607, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ k(float r86, float r87, float r88, float r89, int r90, int r91, boolean r92, boolean r93, int r94, boolean r95, float r96, float r97, int r98, int r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, boolean r107, boolean r108, boolean r109, boolean r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, int r118, int r119, boolean r120, boolean r121, mt.k.b r122, boolean r123, float r124, mt.k.h r125, mt.k.c r126, j$.time.Instant r127, mt.k.g r128, java.lang.Float r129, java.lang.Float r130, java.lang.Float r131, java.lang.Float r132, java.lang.Integer r133, java.lang.Integer r134, java.lang.Boolean r135, java.lang.Boolean r136, java.lang.Integer r137, java.lang.Boolean r138, java.lang.Float r139, java.lang.Float r140, java.lang.Integer r141, java.lang.Integer r142, java.lang.Integer r143, java.lang.Integer r144, java.lang.Integer r145, java.lang.Integer r146, java.lang.Integer r147, java.lang.Integer r148, java.lang.Integer r149, java.lang.Boolean r150, java.lang.Boolean r151, java.lang.Boolean r152, java.lang.Boolean r153, java.lang.Boolean r154, java.lang.Boolean r155, java.lang.Boolean r156, java.lang.Boolean r157, java.lang.Boolean r158, java.lang.Boolean r159, java.lang.Boolean r160, java.lang.Integer r161, java.lang.Integer r162, java.lang.Boolean r163, java.lang.Boolean r164, mt.k.b r165, java.lang.Boolean r166, mt.k.f r167, java.lang.Boolean r168, kt.q r169, mt.k.h r170, mt.k.a r171, okio.i r172, int r173, int r174, int r175, kotlin.jvm.internal.DefaultConstructorMarker r176) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.k.<init>(float, float, float, float, int, int, boolean, boolean, int, boolean, float, float, int, int, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int, boolean, boolean, mt.k$b, boolean, float, mt.k$h, mt.k$c, j$.time.Instant, mt.k$g, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, mt.k$b, java.lang.Boolean, mt.k$f, java.lang.Boolean, kt.q, mt.k$h, mt.k$a, okio.i, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ k b(k kVar, float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b bVar, boolean z28, float f17, h hVar, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Boolean bool15, Boolean bool16, b bVar2, Boolean bool17, f fVar, Boolean bool18, kt.q qVar, h hVar2, a aVar, okio.i iVar, int i26, int i27, int i28, Object obj) {
        return kVar.a((i26 & 1) != 0 ? kVar.f39048a : f11, (i26 & 2) != 0 ? kVar.f39049b : f12, (i26 & 4) != 0 ? kVar.f39052c : f13, (i26 & 8) != 0 ? kVar.f39053d : f14, (i26 & 16) != 0 ? kVar.f39054e : i11, (i26 & 32) != 0 ? kVar.f39055f : i12, (i26 & 64) != 0 ? kVar.f39056g : z11, (i26 & 128) != 0 ? kVar.f39059h : z12, (i26 & 256) != 0 ? kVar.f39060i : i13, (i26 & 512) != 0 ? kVar.f39062j : z13, (i26 & 1024) != 0 ? kVar.f39064k : f15, (i26 & 2048) != 0 ? kVar.f39066l : f16, (i26 & 4096) != 0 ? kVar.f39068m : i14, (i26 & PKIFailureInfo.certRevoked) != 0 ? kVar.f39070n : i15, (i26 & 16384) != 0 ? kVar.f39072o : i16, (i26 & 32768) != 0 ? kVar.f39074p : i17, (i26 & 65536) != 0 ? kVar.f39078q : i18, (i26 & 131072) != 0 ? kVar.f39082t : i19, (i26 & 262144) != 0 ? kVar.f39086w : i21, (i26 & PKIFailureInfo.signerNotTrusted) != 0 ? kVar.f39088x : i22, (i26 & PKIFailureInfo.badCertTemplate) != 0 ? kVar.f39092y : i23, (i26 & PKIFailureInfo.badSenderNonce) != 0 ? kVar.f39096z : z14, (i26 & 4194304) != 0 ? kVar.A : z15, (i26 & 8388608) != 0 ? kVar.B : z16, (i26 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? kVar.C : z17, (i26 & 33554432) != 0 ? kVar.E : z18, (i26 & 67108864) != 0 ? kVar.F : z19, (i26 & 134217728) != 0 ? kVar.G : z21, (i26 & 268435456) != 0 ? kVar.H : z22, (i26 & PKIFailureInfo.duplicateCertReq) != 0 ? kVar.K : z23, (i26 & 1073741824) != 0 ? kVar.L : z24, (i26 & Integer.MIN_VALUE) != 0 ? kVar.O : z25, (i27 & 1) != 0 ? kVar.P : i24, (i27 & 2) != 0 ? kVar.Q : i25, (i27 & 4) != 0 ? kVar.R : z26, (i27 & 8) != 0 ? kVar.T : z27, (i27 & 16) != 0 ? kVar.Y : bVar, (i27 & 32) != 0 ? kVar.f39050b1 : z28, (i27 & 64) != 0 ? kVar.f39057g1 : f17, (i27 & 128) != 0 ? kVar.f39075p1 : hVar, (i27 & 256) != 0 ? kVar.f39089x1 : cVar, (i27 & 512) != 0 ? kVar.f39093y1 : instant, (i27 & 1024) != 0 ? kVar.Q1 : gVar, (i27 & 2048) != 0 ? kVar.V1 : f18, (i27 & 4096) != 0 ? kVar.f39051b2 : f19, (i27 & PKIFailureInfo.certRevoked) != 0 ? kVar.f39058g2 : f21, (i27 & 16384) != 0 ? kVar.f39076p2 : f22, (i27 & 32768) != 0 ? kVar.f39090x2 : num, (i27 & 65536) != 0 ? kVar.f39094y2 : num2, (i27 & 131072) != 0 ? kVar.Q2 : bool, (i27 & 262144) != 0 ? kVar.f39061i3 : bool2, (i27 & PKIFailureInfo.signerNotTrusted) != 0 ? kVar.f39063j3 : num3, (i27 & PKIFailureInfo.badCertTemplate) != 0 ? kVar.f39065k3 : bool3, (i27 & PKIFailureInfo.badSenderNonce) != 0 ? kVar.f39067l3 : f23, (i27 & 4194304) != 0 ? kVar.f39069m3 : f24, (i27 & 8388608) != 0 ? kVar.f39071n3 : num4, (i27 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? kVar.f39073o3 : num5, (i27 & 33554432) != 0 ? kVar.f39077p3 : num6, (i27 & 67108864) != 0 ? kVar.f39079q3 : num7, (i27 & 134217728) != 0 ? kVar.f39080r3 : num8, (i27 & 268435456) != 0 ? kVar.f39081s3 : num9, (i27 & PKIFailureInfo.duplicateCertReq) != 0 ? kVar.f39083t3 : num10, (i27 & 1073741824) != 0 ? kVar.f39084u3 : num11, (i27 & Integer.MIN_VALUE) != 0 ? kVar.f39085v3 : num12, (i28 & 1) != 0 ? kVar.f39087w3 : bool4, (i28 & 2) != 0 ? kVar.f39091x3 : bool5, (i28 & 4) != 0 ? kVar.f39095y3 : bool6, (i28 & 8) != 0 ? kVar.f39097z3 : bool7, (i28 & 16) != 0 ? kVar.A3 : bool8, (i28 & 32) != 0 ? kVar.B3 : bool9, (i28 & 64) != 0 ? kVar.C3 : bool10, (i28 & 128) != 0 ? kVar.D3 : bool11, (i28 & 256) != 0 ? kVar.E3 : bool12, (i28 & 512) != 0 ? kVar.F3 : bool13, (i28 & 1024) != 0 ? kVar.G3 : bool14, (i28 & 2048) != 0 ? kVar.H3 : num13, (i28 & 4096) != 0 ? kVar.I3 : num14, (i28 & PKIFailureInfo.certRevoked) != 0 ? kVar.J3 : bool15, (i28 & 16384) != 0 ? kVar.K3 : bool16, (i28 & 32768) != 0 ? kVar.L3 : bVar2, (i28 & 65536) != 0 ? kVar.M3 : bool17, (i28 & 131072) != 0 ? kVar.N3 : fVar, (i28 & 262144) != 0 ? kVar.O3 : bool18, (i28 & PKIFailureInfo.signerNotTrusted) != 0 ? kVar.P3 : qVar, (i28 & PKIFailureInfo.badCertTemplate) != 0 ? kVar.Q3 : hVar2, (i28 & PKIFailureInfo.badSenderNonce) != 0 ? kVar.R3 : aVar, (i28 & 4194304) != 0 ? kVar.unknownFields() : iVar);
    }

    public final Integer A() {
        return this.f39063j3;
    }

    public final Boolean A0() {
        return this.E3;
    }

    public final int B() {
        return this.f39060i;
    }

    public final boolean B0() {
        return this.K;
    }

    public final h C() {
        return this.Q3;
    }

    public final Boolean C0() {
        return this.f39065k3;
    }

    public final h D() {
        return this.f39075p1;
    }

    public final boolean D0() {
        return this.f39062j;
    }

    public final Float E() {
        return this.V1;
    }

    public final Boolean E0() {
        return this.Q2;
    }

    public final float F() {
        return this.f39048a;
    }

    public final boolean F0() {
        return this.f39056g;
    }

    public final Integer G() {
        return this.f39090x2;
    }

    public final Boolean G0() {
        return this.B3;
    }

    public final int H() {
        return this.f39054e;
    }

    public final boolean H0() {
        return this.F;
    }

    public final Float I() {
        return this.f39069m3;
    }

    public final Boolean I0() {
        return this.f39061i3;
    }

    public final float J() {
        return this.f39066l;
    }

    public final boolean J0() {
        return this.f39059h;
    }

    public final Float K() {
        return this.f39067l3;
    }

    public final float L() {
        return this.f39064k;
    }

    public final Float M() {
        return this.f39051b2;
    }

    public final float N() {
        return this.f39049b;
    }

    public final Float O() {
        return this.f39076p2;
    }

    public final float P() {
        return this.f39053d;
    }

    public final Boolean Q() {
        return this.C3;
    }

    public final boolean R() {
        return this.G;
    }

    public final Integer S() {
        return this.f39094y2;
    }

    public final int T() {
        return this.f39055f;
    }

    public final Integer U() {
        return this.H3;
    }

    public final int V() {
        return this.P;
    }

    public final Integer W() {
        return this.I3;
    }

    public final int X() {
        return this.Q;
    }

    public final Integer Y() {
        return this.f39071n3;
    }

    public final int Z() {
        return this.f39068m;
    }

    public final k a(float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b cabin_overheat_protection_OBSOLETE, boolean z28, float f17, h hvac_auto_request_OBSOLETE, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Boolean bool15, Boolean bool16, b bVar, Boolean bool17, f fVar, Boolean bool18, kt.q qVar, h hVar, a aVar, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(cabin_overheat_protection_OBSOLETE, "cabin_overheat_protection_OBSOLETE");
        kotlin.jvm.internal.s.g(hvac_auto_request_OBSOLETE, "hvac_auto_request_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new k(f11, f12, f13, f14, i11, i12, z11, z12, i13, z13, f15, f16, i14, i15, i16, i17, i18, i19, i21, i22, i23, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, i24, i25, z26, z27, cabin_overheat_protection_OBSOLETE, z28, f17, hvac_auto_request_OBSOLETE, cVar, instant, gVar, f18, f19, f21, f22, num, num2, bool, bool2, num3, bool3, f23, f24, num4, num5, num6, num7, num8, num9, num10, num11, num12, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, num13, num14, bool15, bool16, bVar, bool17, fVar, bool18, qVar, hVar, aVar, unknownFields);
    }

    public final Integer a0() {
        return this.f39080r3;
    }

    public final int b0() {
        return this.f39078q;
    }

    public final Boolean c() {
        return this.J3;
    }

    public final Integer c0() {
        return this.f39077p3;
    }

    public final boolean d() {
        return this.R;
    }

    public final int d0() {
        return this.f39072o;
    }

    public final Boolean e() {
        return this.F3;
    }

    public final Integer e0() {
        return this.f39083t3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), kVar.unknownFields())) {
                if (this.f39048a == kVar.f39048a) {
                    if (this.f39049b == kVar.f39049b) {
                        if (this.f39052c == kVar.f39052c) {
                            if ((this.f39053d == kVar.f39053d) && this.f39054e == kVar.f39054e && this.f39055f == kVar.f39055f && this.f39056g == kVar.f39056g && this.f39059h == kVar.f39059h && this.f39060i == kVar.f39060i && this.f39062j == kVar.f39062j) {
                                if (this.f39064k == kVar.f39064k) {
                                    if ((this.f39066l == kVar.f39066l) && this.f39068m == kVar.f39068m && this.f39070n == kVar.f39070n && this.f39072o == kVar.f39072o && this.f39074p == kVar.f39074p && this.f39078q == kVar.f39078q && this.f39082t == kVar.f39082t && this.f39086w == kVar.f39086w && this.f39088x == kVar.f39088x && this.f39092y == kVar.f39092y && this.f39096z == kVar.f39096z && this.A == kVar.A && this.B == kVar.B && this.C == kVar.C && this.E == kVar.E && this.F == kVar.F && this.G == kVar.G && this.H == kVar.H && this.K == kVar.K && this.L == kVar.L && this.O == kVar.O && this.P == kVar.P && this.Q == kVar.Q && this.R == kVar.R && this.T == kVar.T && this.Y == kVar.Y && this.f39050b1 == kVar.f39050b1) {
                                        return ((this.f39057g1 > kVar.f39057g1 ? 1 : (this.f39057g1 == kVar.f39057g1 ? 0 : -1)) == 0) && this.f39075p1 == kVar.f39075p1 && kotlin.jvm.internal.s.c(this.f39089x1, kVar.f39089x1) && kotlin.jvm.internal.s.c(this.f39093y1, kVar.f39093y1) && kotlin.jvm.internal.s.c(this.Q1, kVar.Q1) && kotlin.jvm.internal.s.b(this.V1, kVar.V1) && kotlin.jvm.internal.s.b(this.f39051b2, kVar.f39051b2) && kotlin.jvm.internal.s.b(this.f39058g2, kVar.f39058g2) && kotlin.jvm.internal.s.b(this.f39076p2, kVar.f39076p2) && kotlin.jvm.internal.s.c(this.f39090x2, kVar.f39090x2) && kotlin.jvm.internal.s.c(this.f39094y2, kVar.f39094y2) && kotlin.jvm.internal.s.c(this.Q2, kVar.Q2) && kotlin.jvm.internal.s.c(this.f39061i3, kVar.f39061i3) && kotlin.jvm.internal.s.c(this.f39063j3, kVar.f39063j3) && kotlin.jvm.internal.s.c(this.f39065k3, kVar.f39065k3) && kotlin.jvm.internal.s.b(this.f39067l3, kVar.f39067l3) && kotlin.jvm.internal.s.b(this.f39069m3, kVar.f39069m3) && kotlin.jvm.internal.s.c(this.f39071n3, kVar.f39071n3) && kotlin.jvm.internal.s.c(this.f39073o3, kVar.f39073o3) && kotlin.jvm.internal.s.c(this.f39077p3, kVar.f39077p3) && kotlin.jvm.internal.s.c(this.f39079q3, kVar.f39079q3) && kotlin.jvm.internal.s.c(this.f39080r3, kVar.f39080r3) && kotlin.jvm.internal.s.c(this.f39081s3, kVar.f39081s3) && kotlin.jvm.internal.s.c(this.f39083t3, kVar.f39083t3) && kotlin.jvm.internal.s.c(this.f39084u3, kVar.f39084u3) && kotlin.jvm.internal.s.c(this.f39085v3, kVar.f39085v3) && kotlin.jvm.internal.s.c(this.f39087w3, kVar.f39087w3) && kotlin.jvm.internal.s.c(this.f39091x3, kVar.f39091x3) && kotlin.jvm.internal.s.c(this.f39095y3, kVar.f39095y3) && kotlin.jvm.internal.s.c(this.f39097z3, kVar.f39097z3) && kotlin.jvm.internal.s.c(this.A3, kVar.A3) && kotlin.jvm.internal.s.c(this.B3, kVar.B3) && kotlin.jvm.internal.s.c(this.C3, kVar.C3) && kotlin.jvm.internal.s.c(this.D3, kVar.D3) && kotlin.jvm.internal.s.c(this.E3, kVar.E3) && kotlin.jvm.internal.s.c(this.F3, kVar.F3) && kotlin.jvm.internal.s.c(this.G3, kVar.G3) && kotlin.jvm.internal.s.c(this.H3, kVar.H3) && kotlin.jvm.internal.s.c(this.I3, kVar.I3) && kotlin.jvm.internal.s.c(this.J3, kVar.J3) && kotlin.jvm.internal.s.c(this.K3, kVar.K3) && this.L3 == kVar.L3 && kotlin.jvm.internal.s.c(this.M3, kVar.M3) && this.N3 == kVar.N3 && kotlin.jvm.internal.s.c(this.O3, kVar.O3) && this.P3 == kVar.P3 && this.Q3 == kVar.Q3 && this.R3 == kVar.R3;
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
        return false;
    }

    public final boolean f() {
        return this.L;
    }

    public final int f0() {
        return this.f39086w;
    }

    public final Boolean g() {
        return this.G3;
    }

    public final Integer g0() {
        return this.f39079q3;
    }

    public final boolean h() {
        return this.O;
    }

    public final int h0() {
        return this.f39074p;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Float.hashCode(this.f39048a)) * 37) + Float.hashCode(this.f39049b)) * 37) + Float.hashCode(this.f39052c)) * 37) + Float.hashCode(this.f39053d)) * 37) + Integer.hashCode(this.f39054e)) * 37) + Integer.hashCode(this.f39055f)) * 37) + Boolean.hashCode(this.f39056g)) * 37) + Boolean.hashCode(this.f39059h)) * 37) + Integer.hashCode(this.f39060i)) * 37) + Boolean.hashCode(this.f39062j)) * 37) + Float.hashCode(this.f39064k)) * 37) + Float.hashCode(this.f39066l)) * 37) + Integer.hashCode(this.f39068m)) * 37) + Integer.hashCode(this.f39070n)) * 37) + Integer.hashCode(this.f39072o)) * 37) + Integer.hashCode(this.f39074p)) * 37) + Integer.hashCode(this.f39078q)) * 37) + Integer.hashCode(this.f39082t)) * 37) + Integer.hashCode(this.f39086w)) * 37) + Integer.hashCode(this.f39088x)) * 37) + Integer.hashCode(this.f39092y)) * 37) + Boolean.hashCode(this.f39096z)) * 37) + Boolean.hashCode(this.A)) * 37) + Boolean.hashCode(this.B)) * 37) + Boolean.hashCode(this.C)) * 37) + Boolean.hashCode(this.E)) * 37) + Boolean.hashCode(this.F)) * 37) + Boolean.hashCode(this.G)) * 37) + Boolean.hashCode(this.H)) * 37) + Boolean.hashCode(this.K)) * 37) + Boolean.hashCode(this.L)) * 37) + Boolean.hashCode(this.O)) * 37) + Integer.hashCode(this.P)) * 37) + Integer.hashCode(this.Q)) * 37) + Boolean.hashCode(this.R)) * 37) + Boolean.hashCode(this.T)) * 37) + this.Y.hashCode()) * 37) + Boolean.hashCode(this.f39050b1)) * 37) + Float.hashCode(this.f39057g1)) * 37) + this.f39075p1.hashCode()) * 37;
            c cVar = this.f39089x1;
            int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
            Instant instant = this.f39093y1;
            int hashCode3 = (hashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
            g gVar = this.Q1;
            int hashCode4 = (hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            Float f11 = this.V1;
            int hashCode5 = (hashCode4 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f39051b2;
            int hashCode6 = (hashCode5 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.f39058g2;
            int hashCode7 = (hashCode6 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.f39076p2;
            int hashCode8 = (hashCode7 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Integer num = this.f39090x2;
            int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f39094y2;
            int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool = this.Q2;
            int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39061i3;
            int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Integer num3 = this.f39063j3;
            int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 37;
            Boolean bool3 = this.f39065k3;
            int hashCode14 = (hashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
            Float f15 = this.f39067l3;
            int hashCode15 = (hashCode14 + (f15 != null ? f15.hashCode() : 0)) * 37;
            Float f16 = this.f39069m3;
            int hashCode16 = (hashCode15 + (f16 != null ? f16.hashCode() : 0)) * 37;
            Integer num4 = this.f39071n3;
            int hashCode17 = (hashCode16 + (num4 != null ? num4.hashCode() : 0)) * 37;
            Integer num5 = this.f39073o3;
            int hashCode18 = (hashCode17 + (num5 != null ? num5.hashCode() : 0)) * 37;
            Integer num6 = this.f39077p3;
            int hashCode19 = (hashCode18 + (num6 != null ? num6.hashCode() : 0)) * 37;
            Integer num7 = this.f39079q3;
            int hashCode20 = (hashCode19 + (num7 != null ? num7.hashCode() : 0)) * 37;
            Integer num8 = this.f39080r3;
            int hashCode21 = (hashCode20 + (num8 != null ? num8.hashCode() : 0)) * 37;
            Integer num9 = this.f39081s3;
            int hashCode22 = (hashCode21 + (num9 != null ? num9.hashCode() : 0)) * 37;
            Integer num10 = this.f39083t3;
            int hashCode23 = (hashCode22 + (num10 != null ? num10.hashCode() : 0)) * 37;
            Integer num11 = this.f39084u3;
            int hashCode24 = (hashCode23 + (num11 != null ? num11.hashCode() : 0)) * 37;
            Integer num12 = this.f39085v3;
            int hashCode25 = (hashCode24 + (num12 != null ? num12.hashCode() : 0)) * 37;
            Boolean bool4 = this.f39087w3;
            int hashCode26 = (hashCode25 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
            Boolean bool5 = this.f39091x3;
            int hashCode27 = (hashCode26 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
            Boolean bool6 = this.f39095y3;
            int hashCode28 = (hashCode27 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
            Boolean bool7 = this.f39097z3;
            int hashCode29 = (hashCode28 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
            Boolean bool8 = this.A3;
            int hashCode30 = (hashCode29 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
            Boolean bool9 = this.B3;
            int hashCode31 = (hashCode30 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
            Boolean bool10 = this.C3;
            int hashCode32 = (hashCode31 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
            Boolean bool11 = this.D3;
            int hashCode33 = (hashCode32 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
            Boolean bool12 = this.E3;
            int hashCode34 = (hashCode33 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
            Boolean bool13 = this.F3;
            int hashCode35 = (hashCode34 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
            Boolean bool14 = this.G3;
            int hashCode36 = (hashCode35 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
            Integer num13 = this.H3;
            int hashCode37 = (hashCode36 + (num13 != null ? num13.hashCode() : 0)) * 37;
            Integer num14 = this.I3;
            int hashCode38 = (hashCode37 + (num14 != null ? num14.hashCode() : 0)) * 37;
            Boolean bool15 = this.J3;
            int hashCode39 = (hashCode38 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
            Boolean bool16 = this.K3;
            int hashCode40 = (hashCode39 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
            b bVar = this.L3;
            int hashCode41 = (hashCode40 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            Boolean bool17 = this.M3;
            int hashCode42 = (hashCode41 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
            f fVar = this.N3;
            int hashCode43 = (hashCode42 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            Boolean bool18 = this.O3;
            int hashCode44 = (hashCode43 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
            kt.q qVar = this.P3;
            int hashCode45 = (hashCode44 + (qVar != null ? qVar.hashCode() : 0)) * 37;
            h hVar = this.Q3;
            int hashCode46 = (hashCode45 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            a aVar = this.R3;
            int hashCode47 = hashCode46 + (aVar != null ? aVar.hashCode() : 0);
            this.hashCode = hashCode47;
            return hashCode47;
        }
        return i11;
    }

    public final Boolean i() {
        return this.O3;
    }

    public final Integer i0() {
        return this.f39081s3;
    }

    public final Boolean j() {
        return this.f39087w3;
    }

    public final int j0() {
        return this.f39082t;
    }

    public final boolean k() {
        return this.f39096z;
    }

    public final Integer k0() {
        return this.f39073o3;
    }

    public final Boolean l() {
        return this.f39091x3;
    }

    public final int l0() {
        return this.f39070n;
    }

    public final boolean m() {
        return this.A;
    }

    public final Integer m0() {
        return this.f39085v3;
    }

    public final Boolean n() {
        return this.D3;
    }

    public final int n0() {
        return this.f39092y;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m778newBuilder();
    }

    public final boolean o() {
        return this.H;
    }

    public final Integer o0() {
        return this.f39084u3;
    }

    public final b p() {
        return this.L3;
    }

    public final int p0() {
        return this.f39088x;
    }

    public final b q() {
        return this.Y;
    }

    public final Boolean q0() {
        return this.A3;
    }

    public final Boolean r() {
        return this.M3;
    }

    public final boolean r0() {
        return this.E;
    }

    public final boolean s() {
        return this.f39050b1;
    }

    public final kt.q s0() {
        return this.P3;
    }

    public final c t() {
        return this.f39089x1;
    }

    public final Boolean t0() {
        return this.f39095y3;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        float f11 = this.f39048a;
        arrayList.add("inside_temp_celsius_OBSOLETE=" + f11);
        float f12 = this.f39049b;
        arrayList.add("outside_temp_celsius_OBSOLETE=" + f12);
        float f13 = this.f39052c;
        arrayList.add("driver_temp_setting_OBSOLETE=" + f13);
        float f14 = this.f39053d;
        arrayList.add("passenger_temp_setting_OBSOLETE=" + f14);
        int i11 = this.f39054e;
        arrayList.add("left_temp_direction_OBSOLETE=" + i11);
        int i12 = this.f39055f;
        arrayList.add("right_temp_direction_OBSOLETE=" + i12);
        boolean z11 = this.f39056g;
        arrayList.add("is_front_defroster_on_OBSOLETE=" + z11);
        boolean z12 = this.f39059h;
        arrayList.add("is_rear_defroster_on_OBSOLETE=" + z12);
        int i13 = this.f39060i;
        arrayList.add("fan_status_OBSOLETE=" + i13);
        boolean z13 = this.f39062j;
        arrayList.add("is_climate_on_OBSOLETE=" + z13);
        float f15 = this.f39064k;
        arrayList.add("min_avail_temp_celsius_OBSOLETE=" + f15);
        float f16 = this.f39066l;
        arrayList.add("max_avail_temp_celsius_OBSOLETE=" + f16);
        int i14 = this.f39068m;
        arrayList.add("seat_heater_left_OBSOLETE=" + i14);
        int i15 = this.f39070n;
        arrayList.add("seat_heater_right_OBSOLETE=" + i15);
        int i16 = this.f39072o;
        arrayList.add("seat_heater_rear_left_OBSOLETE=" + i16);
        int i17 = this.f39074p;
        arrayList.add("seat_heater_rear_right_OBSOLETE=" + i17);
        int i18 = this.f39078q;
        arrayList.add("seat_heater_rear_center_OBSOLETE=" + i18);
        int i19 = this.f39082t;
        arrayList.add("seat_heater_rear_right_back_OBSOLETE=" + i19);
        int i21 = this.f39086w;
        arrayList.add("seat_heater_rear_left_back_OBSOLETE=" + i21);
        int i22 = this.f39088x;
        arrayList.add("seat_heater_third_row_right_OBSOLETE=" + i22);
        int i23 = this.f39092y;
        arrayList.add("seat_heater_third_row_left_OBSOLETE=" + i23);
        boolean z14 = this.f39096z;
        arrayList.add("battery_heater_OBSOLETE=" + z14);
        boolean z15 = this.A;
        arrayList.add("battery_heater_no_power_OBSOLETE=" + z15);
        boolean z16 = this.B;
        arrayList.add("steering_wheel_heater_OBSOLETE=" + z16);
        boolean z17 = this.C;
        arrayList.add("wiper_blade_heater_OBSOLETE=" + z17);
        boolean z18 = this.E;
        arrayList.add("side_mirror_heaters_OBSOLETE=" + z18);
        boolean z19 = this.F;
        arrayList.add("is_preconditioning_OBSOLETE=" + z19);
        boolean z21 = this.G;
        arrayList.add("remote_heater_control_enabled_OBSOLETE=" + z21);
        boolean z22 = this.H;
        arrayList.add("bioweapon_mode_on_OBSOLETE=" + z22);
        boolean z23 = this.K;
        arrayList.add("is_auto_conditioning_on_OBSOLETE=" + z23);
        boolean z24 = this.L;
        arrayList.add("auto_seat_climate_left_OBSOLETE=" + z24);
        boolean z25 = this.O;
        arrayList.add("auto_seat_climate_right_OBSOLETE=" + z25);
        int i24 = this.P;
        arrayList.add("seat_fan_front_left_OBSOLETE=" + i24);
        int i25 = this.Q;
        arrayList.add("seat_fan_front_right_OBSOLETE=" + i25);
        boolean z26 = this.R;
        arrayList.add("allow_cabin_overheat_protection_OBSOLETE=" + z26);
        boolean z27 = this.T;
        arrayList.add("supports_fan_only_cabin_overheat_protection_OBSOLETE=" + z27);
        b bVar = this.Y;
        arrayList.add("cabin_overheat_protection_OBSOLETE=" + bVar);
        boolean z28 = this.f39050b1;
        arrayList.add("cabin_overheat_protection_actively_cooling_OBSOLETE=" + z28);
        float f17 = this.f39057g1;
        arrayList.add("cop_activation_temp_OBSOLETE=" + f17);
        h hVar = this.f39075p1;
        arrayList.add("hvac_auto_request_OBSOLETE=" + hVar);
        c cVar = this.f39089x1;
        if (cVar != null) {
            arrayList.add("climate_keeper_mode=" + cVar);
        }
        Instant instant = this.f39093y1;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        g gVar = this.Q1;
        if (gVar != null) {
            arrayList.add("defrost_mode=" + gVar);
        }
        Float f18 = this.V1;
        if (f18 != null) {
            arrayList.add("inside_temp_celsius=" + f18);
        }
        Float f19 = this.f39051b2;
        if (f19 != null) {
            arrayList.add("outside_temp_celsius=" + f19);
        }
        Float f21 = this.f39058g2;
        if (f21 != null) {
            arrayList.add("driver_temp_setting=" + f21);
        }
        Float f22 = this.f39076p2;
        if (f22 != null) {
            arrayList.add("passenger_temp_setting=" + f22);
        }
        Integer num = this.f39090x2;
        if (num != null) {
            arrayList.add("left_temp_direction=" + num);
        }
        Integer num2 = this.f39094y2;
        if (num2 != null) {
            arrayList.add("right_temp_direction=" + num2);
        }
        Boolean bool = this.Q2;
        if (bool != null) {
            arrayList.add("is_front_defroster_on=" + bool);
        }
        Boolean bool2 = this.f39061i3;
        if (bool2 != null) {
            arrayList.add("is_rear_defroster_on=" + bool2);
        }
        Integer num3 = this.f39063j3;
        if (num3 != null) {
            arrayList.add("fan_status=" + num3);
        }
        Boolean bool3 = this.f39065k3;
        if (bool3 != null) {
            arrayList.add("is_climate_on=" + bool3);
        }
        Float f23 = this.f39067l3;
        if (f23 != null) {
            arrayList.add("min_avail_temp_celsius=" + f23);
        }
        Float f24 = this.f39069m3;
        if (f24 != null) {
            arrayList.add("max_avail_temp_celsius=" + f24);
        }
        Integer num4 = this.f39071n3;
        if (num4 != null) {
            arrayList.add("seat_heater_left=" + num4);
        }
        Integer num5 = this.f39073o3;
        if (num5 != null) {
            arrayList.add("seat_heater_right=" + num5);
        }
        Integer num6 = this.f39077p3;
        if (num6 != null) {
            arrayList.add("seat_heater_rear_left=" + num6);
        }
        Integer num7 = this.f39079q3;
        if (num7 != null) {
            arrayList.add("seat_heater_rear_right=" + num7);
        }
        Integer num8 = this.f39080r3;
        if (num8 != null) {
            arrayList.add("seat_heater_rear_center=" + num8);
        }
        Integer num9 = this.f39081s3;
        if (num9 != null) {
            arrayList.add("seat_heater_rear_right_back=" + num9);
        }
        Integer num10 = this.f39083t3;
        if (num10 != null) {
            arrayList.add("seat_heater_rear_left_back=" + num10);
        }
        Integer num11 = this.f39084u3;
        if (num11 != null) {
            arrayList.add("seat_heater_third_row_right=" + num11);
        }
        Integer num12 = this.f39085v3;
        if (num12 != null) {
            arrayList.add("seat_heater_third_row_left=" + num12);
        }
        Boolean bool4 = this.f39087w3;
        if (bool4 != null) {
            arrayList.add("battery_heater=" + bool4);
        }
        Boolean bool5 = this.f39091x3;
        if (bool5 != null) {
            arrayList.add("battery_heater_no_power=" + bool5);
        }
        Boolean bool6 = this.f39095y3;
        if (bool6 != null) {
            arrayList.add("steering_wheel_heater=" + bool6);
        }
        Boolean bool7 = this.f39097z3;
        if (bool7 != null) {
            arrayList.add("wiper_blade_heater=" + bool7);
        }
        Boolean bool8 = this.A3;
        if (bool8 != null) {
            arrayList.add("side_mirror_heaters=" + bool8);
        }
        Boolean bool9 = this.B3;
        if (bool9 != null) {
            arrayList.add("is_preconditioning=" + bool9);
        }
        Boolean bool10 = this.C3;
        if (bool10 != null) {
            arrayList.add("remote_heater_control_enabled=" + bool10);
        }
        Boolean bool11 = this.D3;
        if (bool11 != null) {
            arrayList.add("bioweapon_mode_on=" + bool11);
        }
        Boolean bool12 = this.E3;
        if (bool12 != null) {
            arrayList.add("is_auto_conditioning_on=" + bool12);
        }
        Boolean bool13 = this.F3;
        if (bool13 != null) {
            arrayList.add("auto_seat_climate_left=" + bool13);
        }
        Boolean bool14 = this.G3;
        if (bool14 != null) {
            arrayList.add("auto_seat_climate_right=" + bool14);
        }
        Integer num13 = this.H3;
        if (num13 != null) {
            arrayList.add("seat_fan_front_left=" + num13);
        }
        Integer num14 = this.I3;
        if (num14 != null) {
            arrayList.add("seat_fan_front_right=" + num14);
        }
        Boolean bool15 = this.J3;
        if (bool15 != null) {
            arrayList.add("allow_cabin_overheat_protection=" + bool15);
        }
        Boolean bool16 = this.K3;
        if (bool16 != null) {
            arrayList.add("supports_fan_only_cabin_overheat_protection=" + bool16);
        }
        b bVar2 = this.L3;
        if (bVar2 != null) {
            arrayList.add("cabin_overheat_protection=" + bVar2);
        }
        Boolean bool17 = this.M3;
        if (bool17 != null) {
            arrayList.add("cabin_overheat_protection_actively_cooling=" + bool17);
        }
        f fVar = this.N3;
        if (fVar != null) {
            arrayList.add("cop_activation_temperature=" + fVar);
        }
        Boolean bool18 = this.O3;
        if (bool18 != null) {
            arrayList.add("auto_steering_wheel_heat=" + bool18);
        }
        kt.q qVar = this.P3;
        if (qVar != null) {
            arrayList.add("steering_wheel_heat_level=" + qVar);
        }
        h hVar2 = this.Q3;
        if (hVar2 != null) {
            arrayList.add("hvac_auto_request=" + hVar2);
        }
        a aVar = this.R3;
        if (aVar != null) {
            arrayList.add("cop_not_running_reason=" + aVar);
        }
        l02 = e0.l0(arrayList, ", ", "ClimateState{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final float u() {
        return this.f39057g1;
    }

    public final boolean u0() {
        return this.B;
    }

    public final f v() {
        return this.N3;
    }

    public final Boolean v0() {
        return this.K3;
    }

    public final a w() {
        return this.R3;
    }

    public final boolean w0() {
        return this.T;
    }

    public final g x() {
        return this.Q1;
    }

    public final Instant x0() {
        return this.f39093y1;
    }

    public final Float y() {
        return this.f39058g2;
    }

    public final Boolean y0() {
        return this.f39097z3;
    }

    public final float z() {
        return this.f39052c;
    }

    public final boolean z0() {
        return this.C;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m778newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b cabin_overheat_protection_OBSOLETE, boolean z28, float f17, h hvac_auto_request_OBSOLETE, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Boolean bool15, Boolean bool16, b bVar, Boolean bool17, f fVar, Boolean bool18, kt.q qVar, h hVar, a aVar, okio.i unknownFields) {
        super(S3, unknownFields);
        kotlin.jvm.internal.s.g(cabin_overheat_protection_OBSOLETE, "cabin_overheat_protection_OBSOLETE");
        kotlin.jvm.internal.s.g(hvac_auto_request_OBSOLETE, "hvac_auto_request_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39048a = f11;
        this.f39049b = f12;
        this.f39052c = f13;
        this.f39053d = f14;
        this.f39054e = i11;
        this.f39055f = i12;
        this.f39056g = z11;
        this.f39059h = z12;
        this.f39060i = i13;
        this.f39062j = z13;
        this.f39064k = f15;
        this.f39066l = f16;
        this.f39068m = i14;
        this.f39070n = i15;
        this.f39072o = i16;
        this.f39074p = i17;
        this.f39078q = i18;
        this.f39082t = i19;
        this.f39086w = i21;
        this.f39088x = i22;
        this.f39092y = i23;
        this.f39096z = z14;
        this.A = z15;
        this.B = z16;
        this.C = z17;
        this.E = z18;
        this.F = z19;
        this.G = z21;
        this.H = z22;
        this.K = z23;
        this.L = z24;
        this.O = z25;
        this.P = i24;
        this.Q = i25;
        this.R = z26;
        this.T = z27;
        this.Y = cabin_overheat_protection_OBSOLETE;
        this.f39050b1 = z28;
        this.f39057g1 = f17;
        this.f39075p1 = hvac_auto_request_OBSOLETE;
        this.f39089x1 = cVar;
        this.f39093y1 = instant;
        this.Q1 = gVar;
        this.V1 = f18;
        this.f39051b2 = f19;
        this.f39058g2 = f21;
        this.f39076p2 = f22;
        this.f39090x2 = num;
        this.f39094y2 = num2;
        this.Q2 = bool;
        this.f39061i3 = bool2;
        this.f39063j3 = num3;
        this.f39065k3 = bool3;
        this.f39067l3 = f23;
        this.f39069m3 = f24;
        this.f39071n3 = num4;
        this.f39073o3 = num5;
        this.f39077p3 = num6;
        this.f39079q3 = num7;
        this.f39080r3 = num8;
        this.f39081s3 = num9;
        this.f39083t3 = num10;
        this.f39084u3 = num11;
        this.f39085v3 = num12;
        this.f39087w3 = bool4;
        this.f39091x3 = bool5;
        this.f39095y3 = bool6;
        this.f39097z3 = bool7;
        this.A3 = bool8;
        this.B3 = bool9;
        this.C3 = bool10;
        this.D3 = bool11;
        this.E3 = bool12;
        this.F3 = bool13;
        this.G3 = bool14;
        this.H3 = num13;
        this.I3 = num14;
        this.J3 = bool15;
        this.K3 = bool16;
        this.L3 = bVar;
        this.M3 = bool17;
        this.N3 = fVar;
        this.O3 = bool18;
        this.P3 = qVar;
        this.Q3 = hVar;
        this.R3 = aVar;
    }
}