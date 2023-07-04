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
public final class j extends com.squareup.wire.f {

    /* renamed from: d4 */
    public static final ProtoAdapter<j> f38966d4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledChargingStartTimeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 29)
    private final long A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPilotCurrent", tag = 120)
    private final Integer A3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "scheduledChargingPendingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 30)
    private final boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerActualCurrent", tag = 121)
    private final Integer B3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "userChargeEnableRequestOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 32)
    private final boolean C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPower", tag = 122)
    private final Integer C3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minutesToFullCharge", tag = 123)
    private final Integer D3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargeEnableRequestOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 33)
    private final boolean E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tripCharging", tag = 125)
    private final Boolean E3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPhasesOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 34)
    private final int F;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeRateMph", tag = 126)
    private final Integer F3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortColdWeatherModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 36)
    private final boolean G;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortDoorOpen", tag = 127)
    private final Boolean G3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeCurrentRequestOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 37)
    private final int H;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledChargingStartTime", tag = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE)
    private final Long H3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "scheduledChargingPending", tag = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)
    private final Boolean I3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "userChargeEnableRequest", tag = 132)
    private final Boolean J3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeCurrentRequestMaxOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 38)
    private final int K;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargeEnableRequest", tag = 133)
    private final Boolean K3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "managedChargingActiveOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 39)
    private final boolean L;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPhases", tag = 134)
    private final Integer L3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortColdWeatherMode", tag = 136)
    private final Boolean M3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeCurrentRequest", tag = 137)
    private final Integer N3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "managedChargingUserCanceledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 40)
    private final boolean O;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeCurrentRequestMax", tag = 138)
    private final Integer O3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "managedChargingStartTimeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 41)
    private final long P;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "managedChargingActive", tag = 139)
    private final Boolean P3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "offPeakHoursEndTimeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 47)
    private final int Q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeRateMphFloatOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 56)
    private final float Q1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 44)
    private final Instant Q2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "managedChargingUserCanceled", tag = 140)
    private final Boolean Q3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ScheduledChargingMode#ADAPTER", jsonName = "scheduledChargingModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 48)
    private final i R;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "managedChargingStartTime", tag = 141)
    private final Long R3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "offPeakHoursEndTime", tag = 147)
    private final Integer S3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargingAmpsOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 49)
    private final int T;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ScheduledChargingMode#ADAPTER", jsonName = "scheduledChargingMode", tag = 148)
    private final i T3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargingAmps", tag = 149)
    private final Integer U3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargingState#ADAPTER", jsonName = "chargingState", label = q.a.OMIT_IDENTITY, tag = 1)
    private final f V1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "scheduledChargingStartTimeMinutes", tag = 150)
    private final Integer V3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "scheduledDepartureTimeMinutes", tag = 151)
    private final Integer W3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "preconditioningEnabled", tag = 152)
    private final Boolean X3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "scheduledChargingStartTimeMinutesOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 50)
    private final int Y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "scheduledChargingStartTimeApp", tag = 153)
    private final Integer Y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "superchargerSessionTripPlanner", tag = 154)
    private final Boolean Z3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: a */
    private final int f38967a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargePortColor_E#ADAPTER", jsonName = "chargePortColor", tag = 155)

    /* renamed from: a4 */
    private final c f38968a4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocStdOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: b */
    private final int f38969b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "scheduledDepartureTimeMinutesOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 51)

    /* renamed from: b1 */
    private final int f38970b1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargerType#ADAPTER", jsonName = "fastChargerType", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b2 */
    private final e f38971b2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeRateMphFloat", tag = 156)

    /* renamed from: b4 */
    private final Float f38972b4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocMinOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: c */
    private final int f38973c;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargeLimitReason#ADAPTER", jsonName = "chargeLimitReason", tag = 157)

    /* renamed from: c4 */
    private final b f38974c4;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocMaxOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: d */
    private final int f38975d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxRangeChargeCounterOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: e */
    private final int f38976e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fastChargerPresentOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: f */
    private final boolean f38977f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "batteryRangeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 11)

    /* renamed from: g */
    private final float f38978g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "preconditioningEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 52)

    /* renamed from: g1 */
    private final boolean f38979g1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargerBrand#ADAPTER", jsonName = "fastChargerBrand", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: g2 */
    private final d f38980g2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "estBatteryRangeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 12)

    /* renamed from: h */
    private final float f38981h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "idealBatteryRangeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 13)

    /* renamed from: i */
    private final float f38982i;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.PreconditioningTimes#ADAPTER", jsonName = "preconditioningTimes", label = q.a.OMIT_IDENTITY, tag = 45)

    /* renamed from: i3 */
    private final kt.i f38983i3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "batteryLevelOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 14)

    /* renamed from: j */
    private final int f38984j;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.OffPeakChargingTimes#ADAPTER", jsonName = "offPeakChargingTimes", label = q.a.OMIT_IDENTITY, tag = 46)

    /* renamed from: j3 */
    private final kt.h f38985j3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "usableBatteryLevelOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 15)

    /* renamed from: k */
    private final int f38986k;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ManagedChargingState#ADAPTER", jsonName = "managedChargingState", label = q.a.OMIT_IDENTITY, tag = 158)

    /* renamed from: k3 */
    private final p f38987k3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeEnergyAddedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 16)

    /* renamed from: l */
    private final float f38988l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSoc", tag = 104)

    /* renamed from: l3 */
    private final Integer f38989l3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeMilesAddedRatedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 17)

    /* renamed from: m */
    private final float f38990m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocStd", tag = 105)

    /* renamed from: m3 */
    private final Integer f38991m3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeMilesAddedIdealOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: n */
    private final float f38992n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocMin", tag = 106)

    /* renamed from: n3 */
    private final Integer f38993n3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerVoltageOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 19)

    /* renamed from: o */
    private final int f38994o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeLimitSocMax", tag = 107)

    /* renamed from: o3 */
    private final Integer f38995o3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPilotCurrentOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: p */
    private final int f38996p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "scheduledChargingStartTimeAppOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 53)

    /* renamed from: p1 */
    private final int f38997p1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$CableType#ADAPTER", jsonName = "connChargeCable", label = q.a.OMIT_IDENTITY, tag = 28)

    /* renamed from: p2 */
    private final a f38998p2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxRangeChargeCounter", tag = 109)

    /* renamed from: p3 */
    private final Integer f38999p3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerActualCurrentOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: q */
    private final int f39000q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fastChargerPresent", tag = 110)

    /* renamed from: q3 */
    private final Boolean f39001q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "batteryRange", tag = 111)

    /* renamed from: r3 */
    private final Float f39002r3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "estBatteryRange", tag = 112)

    /* renamed from: s3 */
    private final Float f39003s3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerPowerOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: t */
    private final int f39004t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "idealBatteryRange", tag = 113)

    /* renamed from: t3 */
    private final Float f39005t3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "batteryLevel", tag = 114)

    /* renamed from: u3 */
    private final Integer f39006u3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "usableBatteryLevel", tag = 115)

    /* renamed from: v3 */
    private final Integer f39007v3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minutesToFullChargeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 23)

    /* renamed from: w */
    private final int f39008w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeEnergyAdded", tag = 116)

    /* renamed from: w3 */
    private final Float f39009w3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tripChargingOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 25)

    /* renamed from: x */
    private final boolean f39010x;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "superchargerSessionTripPlannerOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 54)

    /* renamed from: x1 */
    private final boolean f39011x1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "scheduledDepartureTime", label = q.a.OMIT_IDENTITY, tag = 31)

    /* renamed from: x2 */
    private final Instant f39012x2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeMilesAddedRated", tag = 117)

    /* renamed from: x3 */
    private final Float f39013x3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargeRateMphOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 26)

    /* renamed from: y */
    private final int f39014y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState$ChargePortColor_E#ADAPTER", jsonName = "chargePortColorOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 55)

    /* renamed from: y1 */
    private final c f39015y1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ChargePortLatchState#ADAPTER", jsonName = "chargePortLatch", label = q.a.OMIT_IDENTITY, tag = 35)

    /* renamed from: y2 */
    private final kt.b f39016y2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "chargeMilesAddedIdeal", tag = 118)

    /* renamed from: y3 */
    private final Float f39017y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "chargePortDoorOpenOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 27)

    /* renamed from: z */
    private final boolean f39018z;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "chargerVoltage", tag = 119)

    /* renamed from: z3 */
    private final Integer f39019z3;

    /* loaded from: classes6.dex */
    public static final class a extends com.squareup.wire.f {

        /* renamed from: f */
        public static final ProtoAdapter<a> f39020f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39021a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39022b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39023c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "GBAC", tag = 4)

        /* renamed from: d */
        private final kt.u f39024d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "GBDC", tag = 5)

        /* renamed from: e */
        private final kt.u f39025e;

        /* renamed from: mt.j$a$a */
        /* loaded from: classes6.dex */
        public static final class C0753a extends ProtoAdapter<a> {
            C0753a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ChargeState.CableType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public a decode(com.squareup.wire.k reader) {
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
                        return new a(uVar, uVar2, uVar3, uVar4, uVar5, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, a value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.f());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.e());
                protoAdapter.encodeWithTag(writer, 4, value.b());
                protoAdapter.encodeWithTag(writer, 5, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.f()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.e()) + protoAdapter.encodedSizeWithTag(4, value.b()) + protoAdapter.encodedSizeWithTag(5, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public a redact(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u f11 = value.f();
                kt.u redact = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u d11 = value.d();
                kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u e11 = value.e();
                kt.u redact3 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u b11 = value.b();
                kt.u redact4 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                return value.a(redact, redact2, redact3, redact4, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
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
            f39020f = new C0753a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), com.squareup.wire.o.PROTO_3);
        }

        public a() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) == 0 ? uVar5 : null, (i11 & 32) != 0 ? okio.i.f42656d : iVar);
        }

        public final a a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new a(uVar, uVar2, uVar3, uVar4, uVar5, unknownFields);
        }

        public final kt.u b() {
            return this.f39024d;
        }

        public final kt.u c() {
            return this.f39025e;
        }

        public final kt.u d() {
            return this.f39022b;
        }

        public final kt.u e() {
            return this.f39023c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39021a, aVar.f39021a) && kotlin.jvm.internal.s.c(this.f39022b, aVar.f39022b) && kotlin.jvm.internal.s.c(this.f39023c, aVar.f39023c) && kotlin.jvm.internal.s.c(this.f39024d, aVar.f39024d) && kotlin.jvm.internal.s.c(this.f39025e, aVar.f39025e);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39021a;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39021a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39022b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39023c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39024d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39025e;
                int hashCode6 = hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m774newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39021a;
            if (uVar != null) {
                arrayList.add("SNA=" + uVar);
            }
            kt.u uVar2 = this.f39022b;
            if (uVar2 != null) {
                arrayList.add("IEC=" + uVar2);
            }
            kt.u uVar3 = this.f39023c;
            if (uVar3 != null) {
                arrayList.add("SAE=" + uVar3);
            }
            kt.u uVar4 = this.f39024d;
            if (uVar4 != null) {
                arrayList.add("GB_AC=" + uVar4);
            }
            kt.u uVar5 = this.f39025e;
            if (uVar5 != null) {
                arrayList.add("GB_DC=" + uVar5);
            }
            l02 = e0.l0(arrayList, ", ", "CableType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m774newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, okio.i unknownFields) {
            super(f39020f, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39021a = uVar;
            this.f39022b = uVar2;
            this.f39023c = uVar3;
            this.f39024d = uVar4;
            this.f39025e = uVar5;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5) <= 1)) {
                throw new IllegalArgumentException("At most one of SNA, IEC, SAE, GB_AC, GB_DC may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public enum b implements com.squareup.wire.p {
        ChargeLimitReasonUnknown(0),
        ChargeLimitReasonNone(1),
        ChargeLimitReasonEvse(2),
        ChargeLimitReasonBattTempLow(3),
        ChargeLimitReasonHighSoc(4),
        ChargeLimitReasonCabin(5);
        
        public static final ProtoAdapter<b> ADAPTER;
        public static final C0754b Companion = new C0754b(null);
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

        /* renamed from: mt.j$b$b */
        /* loaded from: classes6.dex */
        public static final class C0754b {
            private C0754b() {
            }

            public /* synthetic */ C0754b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        return null;
                                    }
                                    return b.ChargeLimitReasonCabin;
                                }
                                return b.ChargeLimitReasonHighSoc;
                            }
                            return b.ChargeLimitReasonBattTempLow;
                        }
                        return b.ChargeLimitReasonEvse;
                    }
                    return b.ChargeLimitReasonNone;
                }
                return b.ChargeLimitReasonUnknown;
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
    public enum c implements com.squareup.wire.p {
        ChargePortColorOff(0),
        ChargePortColorRed(1),
        ChargePortColorGreen(2),
        ChargePortColorBlue(3),
        ChargePortColorWhite(4),
        ChargePortColorFlashingGreen(5),
        ChargePortColorFlashingAmber(6),
        ChargePortColorAmber(7),
        ChargePortColorRave(8),
        ChargePortColorDebug(9),
        ChargePortColorFlashingBlue(10);
        
        public static final ProtoAdapter<c> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<c> {
            a(n00.d<c> dVar, com.squareup.wire.o oVar, c cVar) {
                super(dVar, oVar, cVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public c d(int i11) {
                return c.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int i11) {
                switch (i11) {
                    case 0:
                        return c.ChargePortColorOff;
                    case 1:
                        return c.ChargePortColorRed;
                    case 2:
                        return c.ChargePortColorGreen;
                    case 3:
                        return c.ChargePortColorBlue;
                    case 4:
                        return c.ChargePortColorWhite;
                    case 5:
                        return c.ChargePortColorFlashingGreen;
                    case 6:
                        return c.ChargePortColorFlashingAmber;
                    case 7:
                        return c.ChargePortColorAmber;
                    case 8:
                        return c.ChargePortColorRave;
                    case 9:
                        return c.ChargePortColorDebug;
                    case 10:
                        return c.ChargePortColorFlashingBlue;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar;
            ADAPTER = new a(m0.b(c.class), com.squareup.wire.o.PROTO_3, cVar);
        }

        c(int i11) {
            this.value = i11;
        }

        public static final c fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<d> f39026c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39027a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39028b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, n00.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ChargeState.ChargerBrand", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public d decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new d(uVar, uVar2, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, d value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.c());
                protoAdapter.encodeWithTag(writer, 2, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.c()) + protoAdapter.encodedSizeWithTag(2, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public d redact(d value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u c11 = value.c();
                kt.u redact = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u b11 = value.b();
                return value.a(redact, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
            f39026c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), com.squareup.wire.o.PROTO_3);
        }

        public d() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ d(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final d a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new d(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39028b;
        }

        public final kt.u c() {
            return this.f39027a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), dVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39027a, dVar.f39027a) && kotlin.jvm.internal.s.c(this.f39028b, dVar.f39028b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39027a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39028b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m775newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39027a;
            if (uVar != null) {
                arrayList.add("Tesla=" + uVar);
            }
            kt.u uVar2 = this.f39028b;
            if (uVar2 != null) {
                arrayList.add("SNA=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "ChargerBrand{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m775newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39026c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39027a = uVar;
            this.f39028b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of Tesla, SNA may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends com.squareup.wire.f {

        /* renamed from: j */
        public static final ProtoAdapter<e> f39029j;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39030a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39031b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39032c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39033d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39034e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39035f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

        /* renamed from: g */
        private final kt.u f39036g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

        /* renamed from: h */
        private final kt.u f39037h;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

        /* renamed from: i */
        private final kt.u f39038i;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<e> {
            a(com.squareup.wire.b bVar, n00.d<e> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ChargeState.ChargerType", oVar, (Object) null);
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
                kt.u uVar7 = null;
                kt.u uVar8 = null;
                kt.u uVar9 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, reader.e(d11));
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
                protoAdapter.encodeWithTag(writer, 1, value.h());
                protoAdapter.encodeWithTag(writer, 2, value.i());
                protoAdapter.encodeWithTag(writer, 3, value.c());
                protoAdapter.encodeWithTag(writer, 4, value.e());
                protoAdapter.encodeWithTag(writer, 5, value.b());
                protoAdapter.encodeWithTag(writer, 6, value.d());
                protoAdapter.encodeWithTag(writer, 7, value.f());
                protoAdapter.encodeWithTag(writer, 8, value.g());
                protoAdapter.encodeWithTag(writer, 9, value.j());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.h()) + protoAdapter.encodedSizeWithTag(2, value.i()) + protoAdapter.encodedSizeWithTag(3, value.c()) + protoAdapter.encodedSizeWithTag(4, value.e()) + protoAdapter.encodedSizeWithTag(5, value.b()) + protoAdapter.encodedSizeWithTag(6, value.d()) + protoAdapter.encodedSizeWithTag(7, value.f()) + protoAdapter.encodedSizeWithTag(8, value.g()) + protoAdapter.encodedSizeWithTag(9, value.j());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public e redact(e value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u h11 = value.h();
                kt.u redact = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u i11 = value.i();
                kt.u redact2 = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u c11 = value.c();
                kt.u redact3 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u e11 = value.e();
                kt.u redact4 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u b11 = value.b();
                kt.u redact5 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u d11 = value.d();
                kt.u redact6 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u f11 = value.f();
                kt.u redact7 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u g11 = value.g();
                kt.u redact8 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u j11 = value.j();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, j11 != null ? kt.u.f35845a.redact(j11) : null, okio.i.f42656d);
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
            f39029j = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(e.class), com.squareup.wire.o.PROTO_3);
        }

        public e() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        public /* synthetic */ e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) == 0 ? uVar9 : null, (i11 & 512) != 0 ? okio.i.f42656d : iVar);
        }

        public final e a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, unknownFields);
        }

        public final kt.u b() {
            return this.f39034e;
        }

        public final kt.u c() {
            return this.f39032c;
        }

        public final kt.u d() {
            return this.f39035f;
        }

        public final kt.u e() {
            return this.f39033d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), eVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39030a, eVar.f39030a) && kotlin.jvm.internal.s.c(this.f39031b, eVar.f39031b) && kotlin.jvm.internal.s.c(this.f39032c, eVar.f39032c) && kotlin.jvm.internal.s.c(this.f39033d, eVar.f39033d) && kotlin.jvm.internal.s.c(this.f39034e, eVar.f39034e) && kotlin.jvm.internal.s.c(this.f39035f, eVar.f39035f) && kotlin.jvm.internal.s.c(this.f39036g, eVar.f39036g) && kotlin.jvm.internal.s.c(this.f39037h, eVar.f39037h) && kotlin.jvm.internal.s.c(this.f39038i, eVar.f39038i);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39036g;
        }

        public final kt.u g() {
            return this.f39037h;
        }

        public final kt.u h() {
            return this.f39030a;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39030a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39031b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39032c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39033d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39034e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39035f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39036g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39037h;
                int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
                kt.u uVar9 = this.f39038i;
                int hashCode10 = hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0);
                this.hashCode = hashCode10;
                return hashCode10;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39031b;
        }

        public final kt.u j() {
            return this.f39038i;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m776newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39030a;
            if (uVar != null) {
                arrayList.add("SNA=" + uVar);
            }
            kt.u uVar2 = this.f39031b;
            if (uVar2 != null) {
                arrayList.add("Supercharger=" + uVar2);
            }
            kt.u uVar3 = this.f39032c;
            if (uVar3 != null) {
                arrayList.add("Chademo=" + uVar3);
            }
            kt.u uVar4 = this.f39033d;
            if (uVar4 != null) {
                arrayList.add("Gb=" + uVar4);
            }
            kt.u uVar5 = this.f39034e;
            if (uVar5 != null) {
                arrayList.add("ACSingleWireCAN=" + uVar5);
            }
            kt.u uVar6 = this.f39035f;
            if (uVar6 != null) {
                arrayList.add("Combo=" + uVar6);
            }
            kt.u uVar7 = this.f39036g;
            if (uVar7 != null) {
                arrayList.add("MCSingleWireCAN=" + uVar7);
            }
            kt.u uVar8 = this.f39037h;
            if (uVar8 != null) {
                arrayList.add("Other=" + uVar8);
            }
            kt.u uVar9 = this.f39038i;
            if (uVar9 != null) {
                arrayList.add("Tesla=" + uVar9);
            }
            l02 = e0.l0(arrayList, ", ", "ChargerType{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m776newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, okio.i unknownFields) {
            super(f39029j, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39030a = uVar;
            this.f39031b = uVar2;
            this.f39032c = uVar3;
            this.f39033d = uVar4;
            this.f39034e = uVar5;
            this.f39035f = uVar6;
            this.f39036g = uVar7;
            this.f39037h = uVar8;
            this.f39038i = uVar9;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9) <= 1)) {
                throw new IllegalArgumentException("At most one of SNA, Supercharger, Chademo, Gb, ACSingleWireCAN, Combo, MCSingleWireCAN, Other, Tesla may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends com.squareup.wire.f {

        /* renamed from: i */
        public static final ProtoAdapter<f> f39039i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39040a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39041b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39042c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39043d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39044e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39045f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

        /* renamed from: g */
        private final kt.u f39046g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

        /* renamed from: h */
        private final kt.u f39047h;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<f> {
            a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ChargeState.ChargingState", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public f decode(com.squareup.wire.k reader) {
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
                        return new f(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, f value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.i());
                protoAdapter.encodeWithTag(writer, 2, value.e());
                protoAdapter.encodeWithTag(writer, 3, value.f());
                protoAdapter.encodeWithTag(writer, 4, value.g());
                protoAdapter.encodeWithTag(writer, 5, value.c());
                protoAdapter.encodeWithTag(writer, 6, value.d());
                protoAdapter.encodeWithTag(writer, 7, value.h());
                protoAdapter.encodeWithTag(writer, 8, value.b());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.i()) + protoAdapter.encodedSizeWithTag(2, value.e()) + protoAdapter.encodedSizeWithTag(3, value.f()) + protoAdapter.encodedSizeWithTag(4, value.g()) + protoAdapter.encodedSizeWithTag(5, value.c()) + protoAdapter.encodedSizeWithTag(6, value.d()) + protoAdapter.encodedSizeWithTag(7, value.h()) + protoAdapter.encodedSizeWithTag(8, value.b());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public f redact(f value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u i11 = value.i();
                kt.u redact = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u e11 = value.e();
                kt.u redact2 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u f11 = value.f();
                kt.u redact3 = f11 == null ? null : kt.u.f35845a.redact(f11);
                kt.u g11 = value.g();
                kt.u redact4 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u c11 = value.c();
                kt.u redact5 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u d11 = value.d();
                kt.u redact6 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u h11 = value.h();
                kt.u redact7 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u b11 = value.b();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, b11 != null ? kt.u.f35845a.redact(b11) : null, okio.i.f42656d);
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
            f39039i = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(f.class), com.squareup.wire.o.PROTO_3);
        }

        public f() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public /* synthetic */ f(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) == 0 ? uVar8 : null, (i11 & 256) != 0 ? okio.i.f42656d : iVar);
        }

        public final f a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new f(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, unknownFields);
        }

        public final kt.u b() {
            return this.f39047h;
        }

        public final kt.u c() {
            return this.f39044e;
        }

        public final kt.u d() {
            return this.f39045f;
        }

        public final kt.u e() {
            return this.f39041b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), fVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39040a, fVar.f39040a) && kotlin.jvm.internal.s.c(this.f39041b, fVar.f39041b) && kotlin.jvm.internal.s.c(this.f39042c, fVar.f39042c) && kotlin.jvm.internal.s.c(this.f39043d, fVar.f39043d) && kotlin.jvm.internal.s.c(this.f39044e, fVar.f39044e) && kotlin.jvm.internal.s.c(this.f39045f, fVar.f39045f) && kotlin.jvm.internal.s.c(this.f39046g, fVar.f39046g) && kotlin.jvm.internal.s.c(this.f39047h, fVar.f39047h);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39042c;
        }

        public final kt.u g() {
            return this.f39043d;
        }

        public final kt.u h() {
            return this.f39046g;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39040a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39041b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39042c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39043d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39044e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39045f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39046g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39047h;
                int hashCode9 = hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39040a;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m777newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39040a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39041b;
            if (uVar2 != null) {
                arrayList.add("Disconnected=" + uVar2);
            }
            kt.u uVar3 = this.f39042c;
            if (uVar3 != null) {
                arrayList.add("NoPower=" + uVar3);
            }
            kt.u uVar4 = this.f39043d;
            if (uVar4 != null) {
                arrayList.add("Starting=" + uVar4);
            }
            kt.u uVar5 = this.f39044e;
            if (uVar5 != null) {
                arrayList.add("Charging=" + uVar5);
            }
            kt.u uVar6 = this.f39045f;
            if (uVar6 != null) {
                arrayList.add("Complete=" + uVar6);
            }
            kt.u uVar7 = this.f39046g;
            if (uVar7 != null) {
                arrayList.add("Stopped=" + uVar7);
            }
            kt.u uVar8 = this.f39047h;
            if (uVar8 != null) {
                arrayList.add("Calibrating=" + uVar8);
            }
            l02 = e0.l0(arrayList, ", ", "ChargingState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m777newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, okio.i unknownFields) {
            super(f39039i, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39040a = uVar;
            this.f39041b = uVar2;
            this.f39042c = uVar3;
            this.f39043d = uVar4;
            this.f39044e = uVar5;
            this.f39045f = uVar6;
            this.f39046g = uVar7;
            this.f39047h = uVar8;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Disconnected, NoPower, Starting, Charging, Complete, Stopped, Calibrating may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends ProtoAdapter<j> {
        g(com.squareup.wire.b bVar, n00.d<j> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j decode(com.squareup.wire.k reader) {
            i iVar;
            long j11;
            kotlin.jvm.internal.s.g(reader, "reader");
            i iVar2 = i.ScheduledChargingModeOff;
            c cVar = c.ChargePortColorOff;
            long d11 = reader.d();
            int i11 = 0;
            long j12 = 0;
            long j13 = 0;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = false;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z12 = false;
            int i23 = 0;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i24 = 0;
            boolean z17 = false;
            int i25 = 0;
            int i26 = 0;
            boolean z18 = false;
            boolean z19 = false;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            boolean z21 = false;
            int i32 = 0;
            boolean z22 = false;
            f fVar = null;
            e eVar = null;
            d dVar = null;
            a aVar = null;
            Instant instant = null;
            kt.b bVar = null;
            Instant instant2 = null;
            kt.i iVar3 = null;
            kt.h hVar = null;
            p pVar = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Integer num6 = null;
            Integer num7 = null;
            Float f22 = null;
            Float f23 = null;
            Float f24 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            Integer num11 = null;
            Integer num12 = null;
            Boolean bool2 = null;
            Integer num13 = null;
            Boolean bool3 = null;
            Long l11 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Integer num14 = null;
            Boolean bool7 = null;
            Integer num15 = null;
            Integer num16 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Long l12 = null;
            Integer num17 = null;
            i iVar4 = null;
            Integer num18 = null;
            Integer num19 = null;
            Integer num20 = null;
            Boolean bool10 = null;
            Integer num21 = null;
            Boolean bool11 = null;
            c cVar2 = null;
            Float f25 = null;
            b bVar2 = null;
            c cVar3 = cVar;
            int i33 = 0;
            i iVar5 = iVar2;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(i12, i11, i33, i13, i14, z11, f11, f12, f13, i15, i16, f14, f15, f16, i17, i18, i19, i21, i22, z12, i23, z13, j12, z14, z15, z16, i24, z17, i25, i26, z18, z19, j13, i27, iVar5, i28, i29, i31, z21, i32, z22, cVar3, f17, fVar, eVar, dVar, aVar, instant, bVar, instant2, iVar3, hVar, pVar, num, num2, num3, num4, num5, bool, f18, f19, f21, num6, num7, f22, f23, f24, num8, num9, num10, num11, num12, bool2, num13, bool3, l11, bool4, bool5, bool6, num14, bool7, num15, num16, bool8, bool9, l12, num17, iVar4, num18, num19, num20, bool10, num21, bool11, cVar2, f25, bVar2, reader.e(d11));
                }
                if (g11 == 129) {
                    iVar = iVar5;
                    j11 = d11;
                    Long decode = ProtoAdapter.UINT64.decode(reader);
                    b0 b0Var = b0.f54756a;
                    l11 = decode;
                } else if (g11 != 130) {
                    switch (g11) {
                        case 1:
                            iVar = iVar5;
                            j11 = d11;
                            f decode2 = f.f39039i.decode(reader);
                            b0 b0Var2 = b0.f54756a;
                            fVar = decode2;
                            break;
                        case 2:
                            iVar = iVar5;
                            j11 = d11;
                            e decode3 = e.f39029j.decode(reader);
                            b0 b0Var3 = b0.f54756a;
                            eVar = decode3;
                            break;
                        case 3:
                            iVar = iVar5;
                            j11 = d11;
                            d decode4 = d.f39026c.decode(reader);
                            b0 b0Var4 = b0.f54756a;
                            dVar = decode4;
                            break;
                        case 4:
                            iVar = iVar5;
                            j11 = d11;
                            int intValue = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var5 = b0.f54756a;
                            i12 = intValue;
                            break;
                        case 5:
                            iVar = iVar5;
                            j11 = d11;
                            int intValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var6 = b0.f54756a;
                            i11 = intValue2;
                            break;
                        case 6:
                            iVar = iVar5;
                            j11 = d11;
                            int intValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var7 = b0.f54756a;
                            i33 = intValue3;
                            break;
                        case 7:
                            iVar = iVar5;
                            j11 = d11;
                            int intValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            b0 b0Var8 = b0.f54756a;
                            i13 = intValue4;
                            break;
                        default:
                            switch (g11) {
                                case 9:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var9 = b0.f54756a;
                                    i14 = intValue5;
                                    break;
                                case 10:
                                    iVar = iVar5;
                                    j11 = d11;
                                    boolean booleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    b0 b0Var10 = b0.f54756a;
                                    z11 = booleanValue;
                                    break;
                                case 11:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var11 = b0.f54756a;
                                    f11 = floatValue;
                                    break;
                                case 12:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var12 = b0.f54756a;
                                    f12 = floatValue2;
                                    break;
                                case 13:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var13 = b0.f54756a;
                                    f13 = floatValue3;
                                    break;
                                case 14:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var14 = b0.f54756a;
                                    i15 = intValue6;
                                    break;
                                case 15:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var15 = b0.f54756a;
                                    i16 = intValue7;
                                    break;
                                case 16:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var16 = b0.f54756a;
                                    f14 = floatValue4;
                                    break;
                                case 17:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var17 = b0.f54756a;
                                    f15 = floatValue5;
                                    break;
                                case 18:
                                    iVar = iVar5;
                                    j11 = d11;
                                    float floatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    b0 b0Var18 = b0.f54756a;
                                    f16 = floatValue6;
                                    break;
                                case 19:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue8 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var19 = b0.f54756a;
                                    i17 = intValue8;
                                    break;
                                case 20:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue9 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var20 = b0.f54756a;
                                    i18 = intValue9;
                                    break;
                                case 21:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue10 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var21 = b0.f54756a;
                                    i19 = intValue10;
                                    break;
                                case 22:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue11 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var22 = b0.f54756a;
                                    i21 = intValue11;
                                    break;
                                case 23:
                                    iVar = iVar5;
                                    j11 = d11;
                                    int intValue12 = ProtoAdapter.INT32.decode(reader).intValue();
                                    b0 b0Var23 = b0.f54756a;
                                    i22 = intValue12;
                                    break;
                                default:
                                    switch (g11) {
                                        case 25:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var24 = b0.f54756a;
                                            z12 = booleanValue2;
                                            break;
                                        case 26:
                                            iVar = iVar5;
                                            j11 = d11;
                                            int intValue13 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var25 = b0.f54756a;
                                            i23 = intValue13;
                                            break;
                                        case 27:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var26 = b0.f54756a;
                                            z13 = booleanValue3;
                                            break;
                                        case 28:
                                            iVar = iVar5;
                                            j11 = d11;
                                            a decode5 = a.f39020f.decode(reader);
                                            b0 b0Var27 = b0.f54756a;
                                            aVar = decode5;
                                            break;
                                        case 29:
                                            iVar = iVar5;
                                            j11 = d11;
                                            long longValue = ProtoAdapter.UINT64.decode(reader).longValue();
                                            b0 b0Var28 = b0.f54756a;
                                            j12 = longValue;
                                            break;
                                        case 30:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var29 = b0.f54756a;
                                            z14 = booleanValue4;
                                            break;
                                        case 31:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Instant decode6 = ProtoAdapter.INSTANT.decode(reader);
                                            b0 b0Var30 = b0.f54756a;
                                            instant = decode6;
                                            break;
                                        case 32:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var31 = b0.f54756a;
                                            z15 = booleanValue5;
                                            break;
                                        case 33:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var32 = b0.f54756a;
                                            z16 = booleanValue6;
                                            break;
                                        case 34:
                                            iVar = iVar5;
                                            j11 = d11;
                                            int intValue14 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var33 = b0.f54756a;
                                            i24 = intValue14;
                                            break;
                                        case 35:
                                            iVar = iVar5;
                                            j11 = d11;
                                            kt.b decode7 = kt.b.f35728e.decode(reader);
                                            b0 b0Var34 = b0.f54756a;
                                            bVar = decode7;
                                            break;
                                        case 36:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var35 = b0.f54756a;
                                            z17 = booleanValue7;
                                            break;
                                        case 37:
                                            iVar = iVar5;
                                            j11 = d11;
                                            int intValue15 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var36 = b0.f54756a;
                                            i25 = intValue15;
                                            break;
                                        case 38:
                                            iVar = iVar5;
                                            j11 = d11;
                                            int intValue16 = ProtoAdapter.INT32.decode(reader).intValue();
                                            b0 b0Var37 = b0.f54756a;
                                            i26 = intValue16;
                                            break;
                                        case 39:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var38 = b0.f54756a;
                                            z18 = booleanValue8;
                                            break;
                                        case 40:
                                            iVar = iVar5;
                                            j11 = d11;
                                            boolean booleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var39 = b0.f54756a;
                                            z19 = booleanValue9;
                                            break;
                                        case 41:
                                            iVar = iVar5;
                                            j11 = d11;
                                            long longValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                                            b0 b0Var40 = b0.f54756a;
                                            j13 = longValue2;
                                            break;
                                        case 147:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Integer decode8 = ProtoAdapter.UINT32.decode(reader);
                                            b0 b0Var41 = b0.f54756a;
                                            num17 = decode8;
                                            break;
                                        case 148:
                                            iVar = iVar5;
                                            j11 = d11;
                                            try {
                                                iVar4 = i.ADAPTER.decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                                            }
                                            b0 b0Var42 = b0.f54756a;
                                            break;
                                        case 149:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Integer decode9 = ProtoAdapter.INT32.decode(reader);
                                            b0 b0Var43 = b0.f54756a;
                                            num18 = decode9;
                                            break;
                                        case 150:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Integer decode10 = ProtoAdapter.UINT32.decode(reader);
                                            b0 b0Var44 = b0.f54756a;
                                            num19 = decode10;
                                            break;
                                        case 151:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Integer decode11 = ProtoAdapter.UINT32.decode(reader);
                                            b0 b0Var45 = b0.f54756a;
                                            num20 = decode11;
                                            break;
                                        case 152:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Boolean decode12 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var46 = b0.f54756a;
                                            bool10 = decode12;
                                            break;
                                        case 153:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Integer decode13 = ProtoAdapter.SINT32.decode(reader);
                                            b0 b0Var47 = b0.f54756a;
                                            num21 = decode13;
                                            break;
                                        case 154:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Boolean decode14 = ProtoAdapter.BOOL.decode(reader);
                                            b0 b0Var48 = b0.f54756a;
                                            bool11 = decode14;
                                            break;
                                        case 155:
                                            iVar = iVar5;
                                            j11 = d11;
                                            try {
                                                cVar2 = c.ADAPTER.decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                            }
                                            b0 b0Var49 = b0.f54756a;
                                            break;
                                        case 156:
                                            iVar = iVar5;
                                            j11 = d11;
                                            Float decode15 = ProtoAdapter.FLOAT.decode(reader);
                                            b0 b0Var50 = b0.f54756a;
                                            f25 = decode15;
                                            break;
                                        case 157:
                                            iVar = iVar5;
                                            j11 = d11;
                                            try {
                                                bVar2 = b.ADAPTER.decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e13.f20831a));
                                            }
                                            b0 b0Var51 = b0.f54756a;
                                            break;
                                        case 158:
                                            iVar = iVar5;
                                            j11 = d11;
                                            p decode16 = p.f39228e.decode(reader);
                                            b0 b0Var52 = b0.f54756a;
                                            pVar = decode16;
                                            break;
                                        default:
                                            switch (g11) {
                                                case 44:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    Instant decode17 = ProtoAdapter.INSTANT.decode(reader);
                                                    b0 b0Var53 = b0.f54756a;
                                                    instant2 = decode17;
                                                    break;
                                                case 45:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    kt.i decode18 = kt.i.f35783c.decode(reader);
                                                    b0 b0Var54 = b0.f54756a;
                                                    iVar3 = decode18;
                                                    break;
                                                case 46:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    kt.h decode19 = kt.h.f35780c.decode(reader);
                                                    b0 b0Var55 = b0.f54756a;
                                                    hVar = decode19;
                                                    break;
                                                case 47:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    int intValue17 = ProtoAdapter.UINT32.decode(reader).intValue();
                                                    b0 b0Var56 = b0.f54756a;
                                                    i27 = intValue17;
                                                    break;
                                                case 48:
                                                    i iVar6 = iVar5;
                                                    j11 = d11;
                                                    try {
                                                        iVar5 = i.ADAPTER.decode(reader);
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e14.f20831a));
                                                        iVar5 = iVar6;
                                                    }
                                                    b0 b0Var57 = b0.f54756a;
                                                    break;
                                                case 49:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    int intValue18 = ProtoAdapter.INT32.decode(reader).intValue();
                                                    b0 b0Var58 = b0.f54756a;
                                                    i28 = intValue18;
                                                    break;
                                                case 50:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    int intValue19 = ProtoAdapter.UINT32.decode(reader).intValue();
                                                    b0 b0Var59 = b0.f54756a;
                                                    i29 = intValue19;
                                                    break;
                                                case 51:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    int intValue20 = ProtoAdapter.UINT32.decode(reader).intValue();
                                                    b0 b0Var60 = b0.f54756a;
                                                    i31 = intValue20;
                                                    break;
                                                case 52:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    boolean booleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                                    b0 b0Var61 = b0.f54756a;
                                                    z21 = booleanValue10;
                                                    break;
                                                case 53:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    int intValue21 = ProtoAdapter.SINT32.decode(reader).intValue();
                                                    b0 b0Var62 = b0.f54756a;
                                                    i32 = intValue21;
                                                    break;
                                                case 54:
                                                    iVar = iVar5;
                                                    j11 = d11;
                                                    boolean booleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                                    b0 b0Var63 = b0.f54756a;
                                                    z22 = booleanValue11;
                                                    break;
                                                case 55:
                                                    try {
                                                        cVar3 = c.ADAPTER.decode(reader);
                                                        iVar = iVar5;
                                                        j11 = d11;
                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                        iVar = iVar5;
                                                        j11 = d11;
                                                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e15.f20831a));
                                                    }
                                                    b0 b0Var64 = b0.f54756a;
                                                    break;
                                                case 56:
                                                    float floatValue7 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                                    b0 b0Var65 = b0.f54756a;
                                                    f17 = floatValue7;
                                                    j11 = d11;
                                                    continue;
                                                    continue;
                                                    continue;
                                                default:
                                                    switch (g11) {
                                                        case 104:
                                                            Integer decode20 = ProtoAdapter.INT32.decode(reader);
                                                            b0 b0Var66 = b0.f54756a;
                                                            num = decode20;
                                                            break;
                                                        case 105:
                                                            Integer decode21 = ProtoAdapter.INT32.decode(reader);
                                                            b0 b0Var67 = b0.f54756a;
                                                            num2 = decode21;
                                                            break;
                                                        case 106:
                                                            Integer decode22 = ProtoAdapter.INT32.decode(reader);
                                                            b0 b0Var68 = b0.f54756a;
                                                            num3 = decode22;
                                                            break;
                                                        case 107:
                                                            Integer decode23 = ProtoAdapter.INT32.decode(reader);
                                                            b0 b0Var69 = b0.f54756a;
                                                            num4 = decode23;
                                                            break;
                                                        default:
                                                            switch (g11) {
                                                                case 109:
                                                                    Integer decode24 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var70 = b0.f54756a;
                                                                    num5 = decode24;
                                                                    break;
                                                                case 110:
                                                                    Boolean decode25 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var71 = b0.f54756a;
                                                                    bool = decode25;
                                                                    break;
                                                                case 111:
                                                                    Float decode26 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var72 = b0.f54756a;
                                                                    f18 = decode26;
                                                                    break;
                                                                case 112:
                                                                    Float decode27 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var73 = b0.f54756a;
                                                                    f19 = decode27;
                                                                    break;
                                                                case 113:
                                                                    Float decode28 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var74 = b0.f54756a;
                                                                    f21 = decode28;
                                                                    break;
                                                                case 114:
                                                                    Integer decode29 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var75 = b0.f54756a;
                                                                    num6 = decode29;
                                                                    break;
                                                                case 115:
                                                                    Integer decode30 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var76 = b0.f54756a;
                                                                    num7 = decode30;
                                                                    break;
                                                                case 116:
                                                                    Float decode31 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var77 = b0.f54756a;
                                                                    f22 = decode31;
                                                                    break;
                                                                case 117:
                                                                    Float decode32 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var78 = b0.f54756a;
                                                                    f23 = decode32;
                                                                    break;
                                                                case 118:
                                                                    Float decode33 = ProtoAdapter.FLOAT.decode(reader);
                                                                    b0 b0Var79 = b0.f54756a;
                                                                    f24 = decode33;
                                                                    break;
                                                                case 119:
                                                                    Integer decode34 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var80 = b0.f54756a;
                                                                    num8 = decode34;
                                                                    break;
                                                                case 120:
                                                                    Integer decode35 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var81 = b0.f54756a;
                                                                    num9 = decode35;
                                                                    break;
                                                                case 121:
                                                                    Integer decode36 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var82 = b0.f54756a;
                                                                    num10 = decode36;
                                                                    break;
                                                                case 122:
                                                                    Integer decode37 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var83 = b0.f54756a;
                                                                    num11 = decode37;
                                                                    break;
                                                                case 123:
                                                                    Integer decode38 = ProtoAdapter.INT32.decode(reader);
                                                                    b0 b0Var84 = b0.f54756a;
                                                                    num12 = decode38;
                                                                    break;
                                                                default:
                                                                    switch (g11) {
                                                                        case 125:
                                                                            Boolean decode39 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var85 = b0.f54756a;
                                                                            bool2 = decode39;
                                                                            break;
                                                                        case 126:
                                                                            Integer decode40 = ProtoAdapter.INT32.decode(reader);
                                                                            b0 b0Var86 = b0.f54756a;
                                                                            num13 = decode40;
                                                                            break;
                                                                        case 127:
                                                                            Boolean decode41 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var87 = b0.f54756a;
                                                                            bool3 = decode41;
                                                                            break;
                                                                        default:
                                                                            switch (g11) {
                                                                                case 132:
                                                                                    Boolean decode42 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var88 = b0.f54756a;
                                                                                    bool5 = decode42;
                                                                                    break;
                                                                                case 133:
                                                                                    Boolean decode43 = ProtoAdapter.BOOL.decode(reader);
                                                                                    b0 b0Var89 = b0.f54756a;
                                                                                    bool6 = decode43;
                                                                                    break;
                                                                                case 134:
                                                                                    Integer decode44 = ProtoAdapter.INT32.decode(reader);
                                                                                    b0 b0Var90 = b0.f54756a;
                                                                                    num14 = decode44;
                                                                                    break;
                                                                                default:
                                                                                    switch (g11) {
                                                                                        case 136:
                                                                                            Boolean decode45 = ProtoAdapter.BOOL.decode(reader);
                                                                                            b0 b0Var91 = b0.f54756a;
                                                                                            bool7 = decode45;
                                                                                            break;
                                                                                        case 137:
                                                                                            Integer decode46 = ProtoAdapter.INT32.decode(reader);
                                                                                            b0 b0Var92 = b0.f54756a;
                                                                                            num15 = decode46;
                                                                                            break;
                                                                                        case 138:
                                                                                            Integer decode47 = ProtoAdapter.INT32.decode(reader);
                                                                                            b0 b0Var93 = b0.f54756a;
                                                                                            num16 = decode47;
                                                                                            break;
                                                                                        case 139:
                                                                                            Boolean decode48 = ProtoAdapter.BOOL.decode(reader);
                                                                                            b0 b0Var94 = b0.f54756a;
                                                                                            bool8 = decode48;
                                                                                            break;
                                                                                        case 140:
                                                                                            Boolean decode49 = ProtoAdapter.BOOL.decode(reader);
                                                                                            b0 b0Var95 = b0.f54756a;
                                                                                            bool9 = decode49;
                                                                                            break;
                                                                                        case 141:
                                                                                            Long decode50 = ProtoAdapter.UINT64.decode(reader);
                                                                                            b0 b0Var96 = b0.f54756a;
                                                                                            l12 = decode50;
                                                                                            break;
                                                                                        default:
                                                                                            reader.m(g11);
                                                                                            b0 b0Var97 = b0.f54756a;
                                                                                            break;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                    j11 = d11;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                            d11 = j11;
                                    }
                            }
                    }
                } else {
                    iVar = iVar5;
                    j11 = d11;
                    Boolean decode51 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var98 = b0.f54756a;
                    bool4 = decode51;
                }
                iVar5 = iVar;
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.q() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.q()));
            }
            if (value.w() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.w()));
            }
            if (value.u() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.u()));
            }
            if (value.s() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.s()));
            }
            if (value.q0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 9, Integer.valueOf(value.q0()));
            }
            if (value.e0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.e0()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 11, Float.valueOf(value.f()));
            }
            if (!(value.b0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 12, Float.valueOf(value.b0()));
            }
            if (!(value.h0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 13, Float.valueOf(value.h0()));
            }
            if (value.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 14, Integer.valueOf(value.d()));
            }
            if (value.S0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 15, Integer.valueOf(value.S0()));
            }
            if (!(value.n() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 16, Float.valueOf(value.n()));
            }
            if (!(value.A() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 17, Float.valueOf(value.A()));
            }
            if (!(value.y() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 18, Float.valueOf(value.y()));
            }
            if (value.V() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.V()));
            }
            if (value.R() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 20, Integer.valueOf(value.R()));
            }
            if (value.N() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 21, Integer.valueOf(value.N()));
            }
            if (value.T() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 22, Integer.valueOf(value.T()));
            }
            if (value.s0() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 23, Integer.valueOf(value.s0()));
            }
            if (value.Q0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 25, Boolean.valueOf(value.Q0()));
            }
            if (value.J() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 26, Integer.valueOf(value.J()));
            }
            if (value.G()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 27, Boolean.valueOf(value.G()));
            }
            if (value.E0() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 29, Long.valueOf(value.E0()));
            }
            if (value.C0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 30, Boolean.valueOf(value.C0()));
            }
            if (value.U0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 32, Boolean.valueOf(value.U0()));
            }
            if (value.l()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 33, Boolean.valueOf(value.l()));
            }
            if (value.P() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 34, Integer.valueOf(value.P()));
            }
            if (value.C()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.C()));
            }
            if (value.h() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 37, Integer.valueOf(value.h()));
            }
            if (value.j() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 38, Integer.valueOf(value.j()));
            }
            if (value.j0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 39, Boolean.valueOf(value.j0()));
            }
            if (value.o0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 40, Boolean.valueOf(value.o0()));
            }
            if (value.l0() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 41, Long.valueOf(value.l0()));
            }
            if (value.v0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 47, Integer.valueOf(value.v0()));
            }
            if (value.A0() != i.ScheduledChargingModeOff) {
                i.ADAPTER.encodeWithTag(writer, 48, value.A0());
            }
            if (value.X() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 49, Integer.valueOf(value.X()));
            }
            if (value.I0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 50, Integer.valueOf(value.I0()));
            }
            if (value.L0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 51, Integer.valueOf(value.L0()));
            }
            if (value.x0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 52, Boolean.valueOf(value.x0()));
            }
            if (value.G0() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 53, Integer.valueOf(value.G0()));
            }
            if (value.N0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 54, Boolean.valueOf(value.N0()));
            }
            if (value.E() != c.ChargePortColorOff) {
                c.ADAPTER.encodeWithTag(writer, 55, value.E());
            }
            if (!(value.L() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 56, Float.valueOf(value.L()));
            }
            if (value.Y() != null) {
                f.f39039i.encodeWithTag(writer, 1, value.Y());
            }
            if (value.f0() != null) {
                e.f39029j.encodeWithTag(writer, 2, value.f0());
            }
            if (value.c0() != null) {
                d.f39026c.encodeWithTag(writer, 3, value.c0());
            }
            if (value.Z() != null) {
                a.f39020f.encodeWithTag(writer, 28, value.Z());
            }
            if (value.J0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 31, value.J0());
            }
            if (value.H() != null) {
                kt.b.f35728e.encodeWithTag(writer, 35, value.H());
            }
            if (value.O0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 44, value.O0());
            }
            if (value.y0() != null) {
                kt.i.f35783c.encodeWithTag(writer, 45, value.y0());
            }
            if (value.t0() != null) {
                kt.h.f35780c.encodeWithTag(writer, 46, value.t0());
            }
            if (value.m0() != null) {
                p.f39228e.encodeWithTag(writer, 158, value.m0());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(writer, 104, value.p());
            protoAdapter.encodeWithTag(writer, 105, value.v());
            protoAdapter.encodeWithTag(writer, 106, value.t());
            protoAdapter.encodeWithTag(writer, 107, value.r());
            protoAdapter.encodeWithTag(writer, 109, value.p0());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 110, value.d0());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            protoAdapter3.encodeWithTag(writer, 111, value.e());
            protoAdapter3.encodeWithTag(writer, 112, value.a0());
            protoAdapter3.encodeWithTag(writer, 113, value.g0());
            protoAdapter.encodeWithTag(writer, 114, value.c());
            protoAdapter.encodeWithTag(writer, 115, value.R0());
            protoAdapter3.encodeWithTag(writer, 116, value.m());
            protoAdapter3.encodeWithTag(writer, 117, value.z());
            protoAdapter3.encodeWithTag(writer, 118, value.x());
            protoAdapter.encodeWithTag(writer, 119, value.U());
            protoAdapter.encodeWithTag(writer, 120, value.Q());
            protoAdapter.encodeWithTag(writer, 121, value.M());
            protoAdapter.encodeWithTag(writer, 122, value.S());
            protoAdapter.encodeWithTag(writer, 123, value.r0());
            protoAdapter2.encodeWithTag(writer, 125, value.P0());
            protoAdapter.encodeWithTag(writer, 126, value.I());
            protoAdapter2.encodeWithTag(writer, 127, value.F());
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.UINT64;
            protoAdapter4.encodeWithTag(writer, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.D0());
            protoAdapter2.encodeWithTag(writer, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, value.B0());
            protoAdapter2.encodeWithTag(writer, 132, value.T0());
            protoAdapter2.encodeWithTag(writer, 133, value.k());
            protoAdapter.encodeWithTag(writer, 134, value.O());
            protoAdapter2.encodeWithTag(writer, 136, value.B());
            protoAdapter.encodeWithTag(writer, 137, value.g());
            protoAdapter.encodeWithTag(writer, 138, value.i());
            protoAdapter2.encodeWithTag(writer, 139, value.i0());
            protoAdapter2.encodeWithTag(writer, 140, value.n0());
            protoAdapter4.encodeWithTag(writer, 141, value.k0());
            ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.UINT32;
            protoAdapter5.encodeWithTag(writer, 147, value.u0());
            i.ADAPTER.encodeWithTag(writer, 148, value.z0());
            protoAdapter.encodeWithTag(writer, 149, value.W());
            protoAdapter5.encodeWithTag(writer, 150, value.H0());
            protoAdapter5.encodeWithTag(writer, 151, value.K0());
            protoAdapter2.encodeWithTag(writer, 152, value.w0());
            ProtoAdapter.SINT32.encodeWithTag(writer, 153, value.F0());
            protoAdapter2.encodeWithTag(writer, 154, value.M0());
            c.ADAPTER.encodeWithTag(writer, 155, value.D());
            protoAdapter3.encodeWithTag(writer, 156, value.K());
            b.ADAPTER.encodeWithTag(writer, 157, value.o());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.q() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.q()));
            }
            if (value.w() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.w()));
            }
            if (value.u() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.u()));
            }
            if (value.s() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.s()));
            }
            if (value.q0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.q0()));
            }
            if (value.e0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.e0()));
            }
            if (!(value.f() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.f()));
            }
            if (!(value.b0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(12, Float.valueOf(value.b0()));
            }
            if (!(value.h0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(13, Float.valueOf(value.h0()));
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(14, Integer.valueOf(value.d()));
            }
            if (value.S0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(15, Integer.valueOf(value.S0()));
            }
            if (!(value.n() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(16, Float.valueOf(value.n()));
            }
            if (!(value.A() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(17, Float.valueOf(value.A()));
            }
            if (!(value.y() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(18, Float.valueOf(value.y()));
            }
            if (value.V() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.V()));
            }
            if (value.R() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(20, Integer.valueOf(value.R()));
            }
            if (value.N() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.N()));
            }
            if (value.T() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(22, Integer.valueOf(value.T()));
            }
            if (value.s0() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(23, Integer.valueOf(value.s0()));
            }
            if (value.Q0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.Q0()));
            }
            if (value.J() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(26, Integer.valueOf(value.J()));
            }
            if (value.G()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.G()));
            }
            if (value.E0() != 0) {
                z11 += ProtoAdapter.UINT64.encodedSizeWithTag(29, Long.valueOf(value.E0()));
            }
            if (value.C0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(30, Boolean.valueOf(value.C0()));
            }
            if (value.U0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(32, Boolean.valueOf(value.U0()));
            }
            if (value.l()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(33, Boolean.valueOf(value.l()));
            }
            if (value.P() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(34, Integer.valueOf(value.P()));
            }
            if (value.C()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.C()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(37, Integer.valueOf(value.h()));
            }
            if (value.j() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(38, Integer.valueOf(value.j()));
            }
            if (value.j0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(39, Boolean.valueOf(value.j0()));
            }
            if (value.o0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(40, Boolean.valueOf(value.o0()));
            }
            if (value.l0() != 0) {
                z11 += ProtoAdapter.UINT64.encodedSizeWithTag(41, Long.valueOf(value.l0()));
            }
            if (value.v0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(47, Integer.valueOf(value.v0()));
            }
            if (value.A0() != i.ScheduledChargingModeOff) {
                z11 += i.ADAPTER.encodedSizeWithTag(48, value.A0());
            }
            if (value.X() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(49, Integer.valueOf(value.X()));
            }
            if (value.I0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(50, Integer.valueOf(value.I0()));
            }
            if (value.L0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(51, Integer.valueOf(value.L0()));
            }
            if (value.x0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(52, Boolean.valueOf(value.x0()));
            }
            if (value.G0() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(53, Integer.valueOf(value.G0()));
            }
            if (value.N0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(54, Boolean.valueOf(value.N0()));
            }
            if (value.E() != c.ChargePortColorOff) {
                z11 += c.ADAPTER.encodedSizeWithTag(55, value.E());
            }
            if (!(value.L() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(56, Float.valueOf(value.L()));
            }
            if (value.Y() != null) {
                z11 += f.f39039i.encodedSizeWithTag(1, value.Y());
            }
            if (value.f0() != null) {
                z11 += e.f39029j.encodedSizeWithTag(2, value.f0());
            }
            if (value.c0() != null) {
                z11 += d.f39026c.encodedSizeWithTag(3, value.c0());
            }
            if (value.Z() != null) {
                z11 += a.f39020f.encodedSizeWithTag(28, value.Z());
            }
            if (value.J0() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(31, value.J0());
            }
            if (value.H() != null) {
                z11 += kt.b.f35728e.encodedSizeWithTag(35, value.H());
            }
            if (value.O0() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(44, value.O0());
            }
            if (value.y0() != null) {
                z11 += kt.i.f35783c.encodedSizeWithTag(45, value.y0());
            }
            if (value.t0() != null) {
                z11 += kt.h.f35780c.encodedSizeWithTag(46, value.t0());
            }
            if (value.m0() != null) {
                z11 += p.f39228e.encodedSizeWithTag(158, value.m0());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int encodedSizeWithTag = z11 + protoAdapter.encodedSizeWithTag(104, value.p()) + protoAdapter.encodedSizeWithTag(105, value.v()) + protoAdapter.encodedSizeWithTag(106, value.t()) + protoAdapter.encodedSizeWithTag(107, value.r()) + protoAdapter.encodedSizeWithTag(109, value.p0());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(110, value.d0());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(111, value.e()) + protoAdapter3.encodedSizeWithTag(112, value.a0()) + protoAdapter3.encodedSizeWithTag(113, value.g0()) + protoAdapter.encodedSizeWithTag(114, value.c()) + protoAdapter.encodedSizeWithTag(115, value.R0()) + protoAdapter3.encodedSizeWithTag(116, value.m()) + protoAdapter3.encodedSizeWithTag(117, value.z()) + protoAdapter3.encodedSizeWithTag(118, value.x()) + protoAdapter.encodedSizeWithTag(119, value.U()) + protoAdapter.encodedSizeWithTag(120, value.Q()) + protoAdapter.encodedSizeWithTag(121, value.M()) + protoAdapter.encodedSizeWithTag(122, value.S()) + protoAdapter.encodedSizeWithTag(123, value.r0()) + protoAdapter2.encodedSizeWithTag(125, value.P0()) + protoAdapter.encodedSizeWithTag(126, value.I()) + protoAdapter2.encodedSizeWithTag(127, value.F());
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.UINT64;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.D0()) + protoAdapter2.encodedSizeWithTag(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, value.B0()) + protoAdapter2.encodedSizeWithTag(132, value.T0()) + protoAdapter2.encodedSizeWithTag(133, value.k()) + protoAdapter.encodedSizeWithTag(134, value.O()) + protoAdapter2.encodedSizeWithTag(136, value.B()) + protoAdapter.encodedSizeWithTag(137, value.g()) + protoAdapter.encodedSizeWithTag(138, value.i()) + protoAdapter2.encodedSizeWithTag(139, value.i0()) + protoAdapter2.encodedSizeWithTag(140, value.n0()) + protoAdapter4.encodedSizeWithTag(141, value.k0());
            ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.UINT32;
            return encodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(147, value.u0()) + i.ADAPTER.encodedSizeWithTag(148, value.z0()) + protoAdapter.encodedSizeWithTag(149, value.W()) + protoAdapter5.encodedSizeWithTag(150, value.H0()) + protoAdapter5.encodedSizeWithTag(151, value.K0()) + protoAdapter2.encodedSizeWithTag(152, value.w0()) + ProtoAdapter.SINT32.encodedSizeWithTag(153, value.F0()) + protoAdapter2.encodedSizeWithTag(154, value.M0()) + c.ADAPTER.encodedSizeWithTag(155, value.D()) + protoAdapter3.encodedSizeWithTag(156, value.K()) + b.ADAPTER.encodedSizeWithTag(157, value.o());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            kotlin.jvm.internal.s.g(value, "value");
            f Y = value.Y();
            f redact = Y == null ? null : f.f39039i.redact(Y);
            e f02 = value.f0();
            e redact2 = f02 == null ? null : e.f39029j.redact(f02);
            d c02 = value.c0();
            d redact3 = c02 == null ? null : d.f39026c.redact(c02);
            a Z = value.Z();
            a redact4 = Z == null ? null : a.f39020f.redact(Z);
            Instant J0 = value.J0();
            Instant redact5 = J0 == null ? null : ProtoAdapter.INSTANT.redact(J0);
            kt.b H = value.H();
            kt.b redact6 = H == null ? null : kt.b.f35728e.redact(H);
            Instant O0 = value.O0();
            Instant redact7 = O0 == null ? null : ProtoAdapter.INSTANT.redact(O0);
            kt.i y02 = value.y0();
            kt.i redact8 = y02 == null ? null : kt.i.f35783c.redact(y02);
            kt.h t02 = value.t0();
            kt.h redact9 = t02 == null ? null : kt.h.f35780c.redact(t02);
            p m02 = value.m0();
            return j.b(value, 0, 0, 0, 0, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, false, 0, false, 0L, false, false, false, 0, false, 0, 0, false, false, 0L, 0, null, 0, 0, 0, false, 0, false, null, BitmapDescriptorFactory.HUE_RED, redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, m02 == null ? null : p.f39228e.redact(m02), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, -1, -2095105, -1, 1, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum i implements com.squareup.wire.p {
        ScheduledChargingModeOff(0),
        ScheduledChargingModeStartAt(1),
        ScheduledChargingModeDepartBy(2);
        
        public static final ProtoAdapter<i> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<i> {
            a(n00.d<i> dVar, com.squareup.wire.o oVar, i iVar) {
                super(dVar, oVar, iVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public i d(int i11) {
                return i.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final i a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return i.ScheduledChargingModeDepartBy;
                    }
                    return i.ScheduledChargingModeStartAt;
                }
                return i.ScheduledChargingModeOff;
            }
        }

        static {
            i iVar;
            ADAPTER = new a(m0.b(i.class), com.squareup.wire.o.PROTO_3, iVar);
        }

        i(int i11) {
            this.value = i11;
        }

        public static final i fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    static {
        new h(null);
        f38966d4 = new g(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), com.squareup.wire.o.PROTO_3);
    }

    public j() {
        this(0, 0, 0, 0, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, false, 0, false, 0L, false, false, false, 0, false, 0, 0, false, false, 0L, 0, null, 0, 0, 0, false, 0, false, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ j(int r98, int r99, int r100, int r101, int r102, boolean r103, float r104, float r105, float r106, int r107, int r108, float r109, float r110, float r111, int r112, int r113, int r114, int r115, int r116, boolean r117, int r118, boolean r119, long r120, boolean r122, boolean r123, boolean r124, int r125, boolean r126, int r127, int r128, boolean r129, boolean r130, long r131, int r133, mt.j.i r134, int r135, int r136, int r137, boolean r138, int r139, boolean r140, mt.j.c r141, float r142, mt.j.f r143, mt.j.e r144, mt.j.d r145, mt.j.a r146, j$.time.Instant r147, kt.b r148, j$.time.Instant r149, kt.i r150, kt.h r151, mt.p r152, java.lang.Integer r153, java.lang.Integer r154, java.lang.Integer r155, java.lang.Integer r156, java.lang.Integer r157, java.lang.Boolean r158, java.lang.Float r159, java.lang.Float r160, java.lang.Float r161, java.lang.Integer r162, java.lang.Integer r163, java.lang.Float r164, java.lang.Float r165, java.lang.Float r166, java.lang.Integer r167, java.lang.Integer r168, java.lang.Integer r169, java.lang.Integer r170, java.lang.Integer r171, java.lang.Boolean r172, java.lang.Integer r173, java.lang.Boolean r174, java.lang.Long r175, java.lang.Boolean r176, java.lang.Boolean r177, java.lang.Boolean r178, java.lang.Integer r179, java.lang.Boolean r180, java.lang.Integer r181, java.lang.Integer r182, java.lang.Boolean r183, java.lang.Boolean r184, java.lang.Long r185, java.lang.Integer r186, mt.j.i r187, java.lang.Integer r188, java.lang.Integer r189, java.lang.Integer r190, java.lang.Boolean r191, java.lang.Integer r192, java.lang.Boolean r193, mt.j.c r194, java.lang.Float r195, mt.j.b r196, okio.i r197, int r198, int r199, int r200, int r201, kotlin.jvm.internal.DefaultConstructorMarker r202) {
        /*
            Method dump skipped, instructions count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.j.<init>(int, int, int, int, int, boolean, float, float, float, int, int, float, float, float, int, int, int, int, int, boolean, int, boolean, long, boolean, boolean, boolean, int, boolean, int, int, boolean, boolean, long, int, mt.j$i, int, int, int, boolean, int, boolean, mt.j$c, float, mt.j$f, mt.j$e, mt.j$d, mt.j$a, j$.time.Instant, kt.b, j$.time.Instant, kt.i, kt.h, mt.p, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Integer, mt.j$i, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, mt.j$c, java.lang.Float, mt.j$b, okio.i, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ j b(j jVar, int i11, int i12, int i13, int i14, int i15, boolean z11, float f11, float f12, float f13, int i16, int i17, float f14, float f15, float f16, int i18, int i19, int i21, int i22, int i23, boolean z12, int i24, boolean z13, long j11, boolean z14, boolean z15, boolean z16, int i25, boolean z17, int i26, int i27, boolean z18, boolean z19, long j12, int i28, i iVar, int i29, int i31, int i32, boolean z21, int i33, boolean z22, c cVar, float f17, f fVar, e eVar, d dVar, a aVar, Instant instant, kt.b bVar, Instant instant2, kt.i iVar2, kt.h hVar, p pVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Float f18, Float f19, Float f21, Integer num6, Integer num7, Float f22, Float f23, Float f24, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool2, Integer num13, Boolean bool3, Long l11, Boolean bool4, Boolean bool5, Boolean bool6, Integer num14, Boolean bool7, Integer num15, Integer num16, Boolean bool8, Boolean bool9, Long l12, Integer num17, i iVar3, Integer num18, Integer num19, Integer num20, Boolean bool10, Integer num21, Boolean bool11, c cVar2, Float f25, b bVar2, okio.i iVar4, int i34, int i35, int i36, int i37, Object obj) {
        int i38 = (i34 & 1) != 0 ? jVar.f38967a : i11;
        int i39 = (i34 & 2) != 0 ? jVar.f38969b : i12;
        int i41 = (i34 & 4) != 0 ? jVar.f38973c : i13;
        int i42 = (i34 & 8) != 0 ? jVar.f38975d : i14;
        int i43 = (i34 & 16) != 0 ? jVar.f38976e : i15;
        boolean z23 = (i34 & 32) != 0 ? jVar.f38977f : z11;
        float f26 = (i34 & 64) != 0 ? jVar.f38978g : f11;
        float f27 = (i34 & 128) != 0 ? jVar.f38981h : f12;
        float f28 = (i34 & 256) != 0 ? jVar.f38982i : f13;
        int i44 = (i34 & 512) != 0 ? jVar.f38984j : i16;
        int i45 = (i34 & 1024) != 0 ? jVar.f38986k : i17;
        return jVar.a(i38, i39, i41, i42, i43, z23, f26, f27, f28, i44, i45, (i34 & 2048) != 0 ? jVar.f38988l : f14, (i34 & 4096) != 0 ? jVar.f38990m : f15, (i34 & PKIFailureInfo.certRevoked) != 0 ? jVar.f38992n : f16, (i34 & 16384) != 0 ? jVar.f38994o : i18, (i34 & 32768) != 0 ? jVar.f38996p : i19, (i34 & 65536) != 0 ? jVar.f39000q : i21, (i34 & 131072) != 0 ? jVar.f39004t : i22, (i34 & 262144) != 0 ? jVar.f39008w : i23, (i34 & PKIFailureInfo.signerNotTrusted) != 0 ? jVar.f39010x : z12, (i34 & PKIFailureInfo.badCertTemplate) != 0 ? jVar.f39014y : i24, (i34 & PKIFailureInfo.badSenderNonce) != 0 ? jVar.f39018z : z13, (i34 & 4194304) != 0 ? jVar.A : j11, (i34 & 8388608) != 0 ? jVar.B : z14, (16777216 & i34) != 0 ? jVar.C : z15, (i34 & 33554432) != 0 ? jVar.E : z16, (i34 & 67108864) != 0 ? jVar.F : i25, (i34 & 134217728) != 0 ? jVar.G : z17, (i34 & 268435456) != 0 ? jVar.H : i26, (i34 & PKIFailureInfo.duplicateCertReq) != 0 ? jVar.K : i27, (i34 & 1073741824) != 0 ? jVar.L : z18, (i34 & Integer.MIN_VALUE) != 0 ? jVar.O : z19, (i35 & 1) != 0 ? jVar.P : j12, (i35 & 2) != 0 ? jVar.Q : i28, (i35 & 4) != 0 ? jVar.R : iVar, (i35 & 8) != 0 ? jVar.T : i29, (i35 & 16) != 0 ? jVar.Y : i31, (i35 & 32) != 0 ? jVar.f38970b1 : i32, (i35 & 64) != 0 ? jVar.f38979g1 : z21, (i35 & 128) != 0 ? jVar.f38997p1 : i33, (i35 & 256) != 0 ? jVar.f39011x1 : z22, (i35 & 512) != 0 ? jVar.f39015y1 : cVar, (i35 & 1024) != 0 ? jVar.Q1 : f17, (i35 & 2048) != 0 ? jVar.V1 : fVar, (i35 & 4096) != 0 ? jVar.f38971b2 : eVar, (i35 & PKIFailureInfo.certRevoked) != 0 ? jVar.f38980g2 : dVar, (i35 & 16384) != 0 ? jVar.f38998p2 : aVar, (i35 & 32768) != 0 ? jVar.f39012x2 : instant, (i35 & 65536) != 0 ? jVar.f39016y2 : bVar, (i35 & 131072) != 0 ? jVar.Q2 : instant2, (i35 & 262144) != 0 ? jVar.f38983i3 : iVar2, (i35 & PKIFailureInfo.signerNotTrusted) != 0 ? jVar.f38985j3 : hVar, (i35 & PKIFailureInfo.badCertTemplate) != 0 ? jVar.f38987k3 : pVar, (i35 & PKIFailureInfo.badSenderNonce) != 0 ? jVar.f38989l3 : num, (i35 & 4194304) != 0 ? jVar.f38991m3 : num2, (i35 & 8388608) != 0 ? jVar.f38993n3 : num3, (i35 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? jVar.f38995o3 : num4, (i35 & 33554432) != 0 ? jVar.f38999p3 : num5, (i35 & 67108864) != 0 ? jVar.f39001q3 : bool, (i35 & 134217728) != 0 ? jVar.f39002r3 : f18, (i35 & 268435456) != 0 ? jVar.f39003s3 : f19, (i35 & PKIFailureInfo.duplicateCertReq) != 0 ? jVar.f39005t3 : f21, (i35 & 1073741824) != 0 ? jVar.f39006u3 : num6, (i35 & Integer.MIN_VALUE) != 0 ? jVar.f39007v3 : num7, (i36 & 1) != 0 ? jVar.f39009w3 : f22, (i36 & 2) != 0 ? jVar.f39013x3 : f23, (i36 & 4) != 0 ? jVar.f39017y3 : f24, (i36 & 8) != 0 ? jVar.f39019z3 : num8, (i36 & 16) != 0 ? jVar.A3 : num9, (i36 & 32) != 0 ? jVar.B3 : num10, (i36 & 64) != 0 ? jVar.C3 : num11, (i36 & 128) != 0 ? jVar.D3 : num12, (i36 & 256) != 0 ? jVar.E3 : bool2, (i36 & 512) != 0 ? jVar.F3 : num13, (i36 & 1024) != 0 ? jVar.G3 : bool3, (i36 & 2048) != 0 ? jVar.H3 : l11, (i36 & 4096) != 0 ? jVar.I3 : bool4, (i36 & PKIFailureInfo.certRevoked) != 0 ? jVar.J3 : bool5, (i36 & 16384) != 0 ? jVar.K3 : bool6, (i36 & 32768) != 0 ? jVar.L3 : num14, (i36 & 65536) != 0 ? jVar.M3 : bool7, (i36 & 131072) != 0 ? jVar.N3 : num15, (i36 & 262144) != 0 ? jVar.O3 : num16, (i36 & PKIFailureInfo.signerNotTrusted) != 0 ? jVar.P3 : bool8, (i36 & PKIFailureInfo.badCertTemplate) != 0 ? jVar.Q3 : bool9, (i36 & PKIFailureInfo.badSenderNonce) != 0 ? jVar.R3 : l12, (i36 & 4194304) != 0 ? jVar.S3 : num17, (i36 & 8388608) != 0 ? jVar.T3 : iVar3, (i36 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? jVar.U3 : num18, (i36 & 33554432) != 0 ? jVar.V3 : num19, (i36 & 67108864) != 0 ? jVar.W3 : num20, (i36 & 134217728) != 0 ? jVar.X3 : bool10, (i36 & 268435456) != 0 ? jVar.Y3 : num21, (i36 & PKIFailureInfo.duplicateCertReq) != 0 ? jVar.Z3 : bool11, (i36 & 1073741824) != 0 ? jVar.f38968a4 : cVar2, (i36 & Integer.MIN_VALUE) != 0 ? jVar.f38972b4 : f25, (i37 & 1) != 0 ? jVar.f38974c4 : bVar2, (i37 & 2) != 0 ? jVar.unknownFields() : iVar4);
    }

    public final float A() {
        return this.f38990m;
    }

    public final i A0() {
        return this.R;
    }

    public final Boolean B() {
        return this.M3;
    }

    public final Boolean B0() {
        return this.I3;
    }

    public final boolean C() {
        return this.G;
    }

    public final boolean C0() {
        return this.B;
    }

    public final c D() {
        return this.f38968a4;
    }

    public final Long D0() {
        return this.H3;
    }

    public final c E() {
        return this.f39015y1;
    }

    public final long E0() {
        return this.A;
    }

    public final Boolean F() {
        return this.G3;
    }

    public final Integer F0() {
        return this.Y3;
    }

    public final boolean G() {
        return this.f39018z;
    }

    public final int G0() {
        return this.f38997p1;
    }

    public final kt.b H() {
        return this.f39016y2;
    }

    public final Integer H0() {
        return this.V3;
    }

    public final Integer I() {
        return this.F3;
    }

    public final int I0() {
        return this.Y;
    }

    public final int J() {
        return this.f39014y;
    }

    public final Instant J0() {
        return this.f39012x2;
    }

    public final Float K() {
        return this.f38972b4;
    }

    public final Integer K0() {
        return this.W3;
    }

    public final float L() {
        return this.Q1;
    }

    public final int L0() {
        return this.f38970b1;
    }

    public final Integer M() {
        return this.B3;
    }

    public final Boolean M0() {
        return this.Z3;
    }

    public final int N() {
        return this.f39000q;
    }

    public final boolean N0() {
        return this.f39011x1;
    }

    public final Integer O() {
        return this.L3;
    }

    public final Instant O0() {
        return this.Q2;
    }

    public final int P() {
        return this.F;
    }

    public final Boolean P0() {
        return this.E3;
    }

    public final Integer Q() {
        return this.A3;
    }

    public final boolean Q0() {
        return this.f39010x;
    }

    public final int R() {
        return this.f38996p;
    }

    public final Integer R0() {
        return this.f39007v3;
    }

    public final Integer S() {
        return this.C3;
    }

    public final int S0() {
        return this.f38986k;
    }

    public final int T() {
        return this.f39004t;
    }

    public final Boolean T0() {
        return this.J3;
    }

    public final Integer U() {
        return this.f39019z3;
    }

    public final boolean U0() {
        return this.C;
    }

    public final int V() {
        return this.f38994o;
    }

    public final Integer W() {
        return this.U3;
    }

    public final int X() {
        return this.T;
    }

    public final f Y() {
        return this.V1;
    }

    public final a Z() {
        return this.f38998p2;
    }

    public final j a(int i11, int i12, int i13, int i14, int i15, boolean z11, float f11, float f12, float f13, int i16, int i17, float f14, float f15, float f16, int i18, int i19, int i21, int i22, int i23, boolean z12, int i24, boolean z13, long j11, boolean z14, boolean z15, boolean z16, int i25, boolean z17, int i26, int i27, boolean z18, boolean z19, long j12, int i28, i scheduled_charging_mode_OBSOLETE, int i29, int i31, int i32, boolean z21, int i33, boolean z22, c charge_port_color_OBSOLETE, float f17, f fVar, e eVar, d dVar, a aVar, Instant instant, kt.b bVar, Instant instant2, kt.i iVar, kt.h hVar, p pVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Float f18, Float f19, Float f21, Integer num6, Integer num7, Float f22, Float f23, Float f24, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool2, Integer num13, Boolean bool3, Long l11, Boolean bool4, Boolean bool5, Boolean bool6, Integer num14, Boolean bool7, Integer num15, Integer num16, Boolean bool8, Boolean bool9, Long l12, Integer num17, i iVar2, Integer num18, Integer num19, Integer num20, Boolean bool10, Integer num21, Boolean bool11, c cVar, Float f25, b bVar2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(scheduled_charging_mode_OBSOLETE, "scheduled_charging_mode_OBSOLETE");
        kotlin.jvm.internal.s.g(charge_port_color_OBSOLETE, "charge_port_color_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j(i11, i12, i13, i14, i15, z11, f11, f12, f13, i16, i17, f14, f15, f16, i18, i19, i21, i22, i23, z12, i24, z13, j11, z14, z15, z16, i25, z17, i26, i27, z18, z19, j12, i28, scheduled_charging_mode_OBSOLETE, i29, i31, i32, z21, i33, z22, charge_port_color_OBSOLETE, f17, fVar, eVar, dVar, aVar, instant, bVar, instant2, iVar, hVar, pVar, num, num2, num3, num4, num5, bool, f18, f19, f21, num6, num7, f22, f23, f24, num8, num9, num10, num11, num12, bool2, num13, bool3, l11, bool4, bool5, bool6, num14, bool7, num15, num16, bool8, bool9, l12, num17, iVar2, num18, num19, num20, bool10, num21, bool11, cVar, f25, bVar2, unknownFields);
    }

    public final Float a0() {
        return this.f39003s3;
    }

    public final float b0() {
        return this.f38981h;
    }

    public final Integer c() {
        return this.f39006u3;
    }

    public final d c0() {
        return this.f38980g2;
    }

    public final int d() {
        return this.f38984j;
    }

    public final Boolean d0() {
        return this.f39001q3;
    }

    public final Float e() {
        return this.f39002r3;
    }

    public final boolean e0() {
        return this.f38977f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), jVar.unknownFields()) && this.f38967a == jVar.f38967a && this.f38969b == jVar.f38969b && this.f38973c == jVar.f38973c && this.f38975d == jVar.f38975d && this.f38976e == jVar.f38976e && this.f38977f == jVar.f38977f) {
                if (this.f38978g == jVar.f38978g) {
                    if (this.f38981h == jVar.f38981h) {
                        if ((this.f38982i == jVar.f38982i) && this.f38984j == jVar.f38984j && this.f38986k == jVar.f38986k) {
                            if (this.f38988l == jVar.f38988l) {
                                if (this.f38990m == jVar.f38990m) {
                                    if ((this.f38992n == jVar.f38992n) && this.f38994o == jVar.f38994o && this.f38996p == jVar.f38996p && this.f39000q == jVar.f39000q && this.f39004t == jVar.f39004t && this.f39008w == jVar.f39008w && this.f39010x == jVar.f39010x && this.f39014y == jVar.f39014y && this.f39018z == jVar.f39018z && this.A == jVar.A && this.B == jVar.B && this.C == jVar.C && this.E == jVar.E && this.F == jVar.F && this.G == jVar.G && this.H == jVar.H && this.K == jVar.K && this.L == jVar.L && this.O == jVar.O && this.P == jVar.P && this.Q == jVar.Q && this.R == jVar.R && this.T == jVar.T && this.Y == jVar.Y && this.f38970b1 == jVar.f38970b1 && this.f38979g1 == jVar.f38979g1 && this.f38997p1 == jVar.f38997p1 && this.f39011x1 == jVar.f39011x1 && this.f39015y1 == jVar.f39015y1) {
                                        return ((this.Q1 > jVar.Q1 ? 1 : (this.Q1 == jVar.Q1 ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.V1, jVar.V1) && kotlin.jvm.internal.s.c(this.f38971b2, jVar.f38971b2) && kotlin.jvm.internal.s.c(this.f38980g2, jVar.f38980g2) && kotlin.jvm.internal.s.c(this.f38998p2, jVar.f38998p2) && kotlin.jvm.internal.s.c(this.f39012x2, jVar.f39012x2) && kotlin.jvm.internal.s.c(this.f39016y2, jVar.f39016y2) && kotlin.jvm.internal.s.c(this.Q2, jVar.Q2) && kotlin.jvm.internal.s.c(this.f38983i3, jVar.f38983i3) && kotlin.jvm.internal.s.c(this.f38985j3, jVar.f38985j3) && kotlin.jvm.internal.s.c(this.f38987k3, jVar.f38987k3) && kotlin.jvm.internal.s.c(this.f38989l3, jVar.f38989l3) && kotlin.jvm.internal.s.c(this.f38991m3, jVar.f38991m3) && kotlin.jvm.internal.s.c(this.f38993n3, jVar.f38993n3) && kotlin.jvm.internal.s.c(this.f38995o3, jVar.f38995o3) && kotlin.jvm.internal.s.c(this.f38999p3, jVar.f38999p3) && kotlin.jvm.internal.s.c(this.f39001q3, jVar.f39001q3) && kotlin.jvm.internal.s.b(this.f39002r3, jVar.f39002r3) && kotlin.jvm.internal.s.b(this.f39003s3, jVar.f39003s3) && kotlin.jvm.internal.s.b(this.f39005t3, jVar.f39005t3) && kotlin.jvm.internal.s.c(this.f39006u3, jVar.f39006u3) && kotlin.jvm.internal.s.c(this.f39007v3, jVar.f39007v3) && kotlin.jvm.internal.s.b(this.f39009w3, jVar.f39009w3) && kotlin.jvm.internal.s.b(this.f39013x3, jVar.f39013x3) && kotlin.jvm.internal.s.b(this.f39017y3, jVar.f39017y3) && kotlin.jvm.internal.s.c(this.f39019z3, jVar.f39019z3) && kotlin.jvm.internal.s.c(this.A3, jVar.A3) && kotlin.jvm.internal.s.c(this.B3, jVar.B3) && kotlin.jvm.internal.s.c(this.C3, jVar.C3) && kotlin.jvm.internal.s.c(this.D3, jVar.D3) && kotlin.jvm.internal.s.c(this.E3, jVar.E3) && kotlin.jvm.internal.s.c(this.F3, jVar.F3) && kotlin.jvm.internal.s.c(this.G3, jVar.G3) && kotlin.jvm.internal.s.c(this.H3, jVar.H3) && kotlin.jvm.internal.s.c(this.I3, jVar.I3) && kotlin.jvm.internal.s.c(this.J3, jVar.J3) && kotlin.jvm.internal.s.c(this.K3, jVar.K3) && kotlin.jvm.internal.s.c(this.L3, jVar.L3) && kotlin.jvm.internal.s.c(this.M3, jVar.M3) && kotlin.jvm.internal.s.c(this.N3, jVar.N3) && kotlin.jvm.internal.s.c(this.O3, jVar.O3) && kotlin.jvm.internal.s.c(this.P3, jVar.P3) && kotlin.jvm.internal.s.c(this.Q3, jVar.Q3) && kotlin.jvm.internal.s.c(this.R3, jVar.R3) && kotlin.jvm.internal.s.c(this.S3, jVar.S3) && this.T3 == jVar.T3 && kotlin.jvm.internal.s.c(this.U3, jVar.U3) && kotlin.jvm.internal.s.c(this.V3, jVar.V3) && kotlin.jvm.internal.s.c(this.W3, jVar.W3) && kotlin.jvm.internal.s.c(this.X3, jVar.X3) && kotlin.jvm.internal.s.c(this.Y3, jVar.Y3) && kotlin.jvm.internal.s.c(this.Z3, jVar.Z3) && this.f38968a4 == jVar.f38968a4 && kotlin.jvm.internal.s.b(this.f38972b4, jVar.f38972b4) && this.f38974c4 == jVar.f38974c4;
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

    public final float f() {
        return this.f38978g;
    }

    public final e f0() {
        return this.f38971b2;
    }

    public final Integer g() {
        return this.N3;
    }

    public final Float g0() {
        return this.f39005t3;
    }

    public final int h() {
        return this.H;
    }

    public final float h0() {
        return this.f38982i;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f38967a)) * 37) + Integer.hashCode(this.f38969b)) * 37) + Integer.hashCode(this.f38973c)) * 37) + Integer.hashCode(this.f38975d)) * 37) + Integer.hashCode(this.f38976e)) * 37) + Boolean.hashCode(this.f38977f)) * 37) + Float.hashCode(this.f38978g)) * 37) + Float.hashCode(this.f38981h)) * 37) + Float.hashCode(this.f38982i)) * 37) + Integer.hashCode(this.f38984j)) * 37) + Integer.hashCode(this.f38986k)) * 37) + Float.hashCode(this.f38988l)) * 37) + Float.hashCode(this.f38990m)) * 37) + Float.hashCode(this.f38992n)) * 37) + Integer.hashCode(this.f38994o)) * 37) + Integer.hashCode(this.f38996p)) * 37) + Integer.hashCode(this.f39000q)) * 37) + Integer.hashCode(this.f39004t)) * 37) + Integer.hashCode(this.f39008w)) * 37) + Boolean.hashCode(this.f39010x)) * 37) + Integer.hashCode(this.f39014y)) * 37) + Boolean.hashCode(this.f39018z)) * 37) + Long.hashCode(this.A)) * 37) + Boolean.hashCode(this.B)) * 37) + Boolean.hashCode(this.C)) * 37) + Boolean.hashCode(this.E)) * 37) + Integer.hashCode(this.F)) * 37) + Boolean.hashCode(this.G)) * 37) + Integer.hashCode(this.H)) * 37) + Integer.hashCode(this.K)) * 37) + Boolean.hashCode(this.L)) * 37) + Boolean.hashCode(this.O)) * 37) + Long.hashCode(this.P)) * 37) + Integer.hashCode(this.Q)) * 37) + this.R.hashCode()) * 37) + Integer.hashCode(this.T)) * 37) + Integer.hashCode(this.Y)) * 37) + Integer.hashCode(this.f38970b1)) * 37) + Boolean.hashCode(this.f38979g1)) * 37) + Integer.hashCode(this.f38997p1)) * 37) + Boolean.hashCode(this.f39011x1)) * 37) + this.f39015y1.hashCode()) * 37) + Float.hashCode(this.Q1)) * 37;
            f fVar = this.V1;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 37;
            e eVar = this.f38971b2;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 37;
            d dVar = this.f38980g2;
            int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            a aVar = this.f38998p2;
            int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 37;
            Instant instant = this.f39012x2;
            int hashCode6 = (hashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
            kt.b bVar = this.f39016y2;
            int hashCode7 = (hashCode6 + (bVar != null ? bVar.hashCode() : 0)) * 37;
            Instant instant2 = this.Q2;
            int hashCode8 = (hashCode7 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
            kt.i iVar = this.f38983i3;
            int hashCode9 = (hashCode8 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            kt.h hVar = this.f38985j3;
            int hashCode10 = (hashCode9 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            p pVar = this.f38987k3;
            int hashCode11 = (hashCode10 + (pVar != null ? pVar.hashCode() : 0)) * 37;
            Integer num = this.f38989l3;
            int hashCode12 = (hashCode11 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.f38991m3;
            int hashCode13 = (hashCode12 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Integer num3 = this.f38993n3;
            int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 37;
            Integer num4 = this.f38995o3;
            int hashCode15 = (hashCode14 + (num4 != null ? num4.hashCode() : 0)) * 37;
            Integer num5 = this.f38999p3;
            int hashCode16 = (hashCode15 + (num5 != null ? num5.hashCode() : 0)) * 37;
            Boolean bool = this.f39001q3;
            int hashCode17 = (hashCode16 + (bool != null ? bool.hashCode() : 0)) * 37;
            Float f11 = this.f39002r3;
            int hashCode18 = (hashCode17 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.f39003s3;
            int hashCode19 = (hashCode18 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.f39005t3;
            int hashCode20 = (hashCode19 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Integer num6 = this.f39006u3;
            int hashCode21 = (hashCode20 + (num6 != null ? num6.hashCode() : 0)) * 37;
            Integer num7 = this.f39007v3;
            int hashCode22 = (hashCode21 + (num7 != null ? num7.hashCode() : 0)) * 37;
            Float f14 = this.f39009w3;
            int hashCode23 = (hashCode22 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Float f15 = this.f39013x3;
            int hashCode24 = (hashCode23 + (f15 != null ? f15.hashCode() : 0)) * 37;
            Float f16 = this.f39017y3;
            int hashCode25 = (hashCode24 + (f16 != null ? f16.hashCode() : 0)) * 37;
            Integer num8 = this.f39019z3;
            int hashCode26 = (hashCode25 + (num8 != null ? num8.hashCode() : 0)) * 37;
            Integer num9 = this.A3;
            int hashCode27 = (hashCode26 + (num9 != null ? num9.hashCode() : 0)) * 37;
            Integer num10 = this.B3;
            int hashCode28 = (hashCode27 + (num10 != null ? num10.hashCode() : 0)) * 37;
            Integer num11 = this.C3;
            int hashCode29 = (hashCode28 + (num11 != null ? num11.hashCode() : 0)) * 37;
            Integer num12 = this.D3;
            int hashCode30 = (hashCode29 + (num12 != null ? num12.hashCode() : 0)) * 37;
            Boolean bool2 = this.E3;
            int hashCode31 = (hashCode30 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Integer num13 = this.F3;
            int hashCode32 = (hashCode31 + (num13 != null ? num13.hashCode() : 0)) * 37;
            Boolean bool3 = this.G3;
            int hashCode33 = (hashCode32 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
            Long l11 = this.H3;
            int hashCode34 = (hashCode33 + (l11 != null ? l11.hashCode() : 0)) * 37;
            Boolean bool4 = this.I3;
            int hashCode35 = (hashCode34 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
            Boolean bool5 = this.J3;
            int hashCode36 = (hashCode35 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
            Boolean bool6 = this.K3;
            int hashCode37 = (hashCode36 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
            Integer num14 = this.L3;
            int hashCode38 = (hashCode37 + (num14 != null ? num14.hashCode() : 0)) * 37;
            Boolean bool7 = this.M3;
            int hashCode39 = (hashCode38 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
            Integer num15 = this.N3;
            int hashCode40 = (hashCode39 + (num15 != null ? num15.hashCode() : 0)) * 37;
            Integer num16 = this.O3;
            int hashCode41 = (hashCode40 + (num16 != null ? num16.hashCode() : 0)) * 37;
            Boolean bool8 = this.P3;
            int hashCode42 = (hashCode41 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
            Boolean bool9 = this.Q3;
            int hashCode43 = (hashCode42 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
            Long l12 = this.R3;
            int hashCode44 = (hashCode43 + (l12 != null ? l12.hashCode() : 0)) * 37;
            Integer num17 = this.S3;
            int hashCode45 = (hashCode44 + (num17 != null ? num17.hashCode() : 0)) * 37;
            i iVar2 = this.T3;
            int hashCode46 = (hashCode45 + (iVar2 != null ? iVar2.hashCode() : 0)) * 37;
            Integer num18 = this.U3;
            int hashCode47 = (hashCode46 + (num18 != null ? num18.hashCode() : 0)) * 37;
            Integer num19 = this.V3;
            int hashCode48 = (hashCode47 + (num19 != null ? num19.hashCode() : 0)) * 37;
            Integer num20 = this.W3;
            int hashCode49 = (hashCode48 + (num20 != null ? num20.hashCode() : 0)) * 37;
            Boolean bool10 = this.X3;
            int hashCode50 = (hashCode49 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
            Integer num21 = this.Y3;
            int hashCode51 = (hashCode50 + (num21 != null ? num21.hashCode() : 0)) * 37;
            Boolean bool11 = this.Z3;
            int hashCode52 = (hashCode51 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
            c cVar = this.f38968a4;
            int hashCode53 = (hashCode52 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            Float f17 = this.f38972b4;
            int hashCode54 = (hashCode53 + (f17 != null ? f17.hashCode() : 0)) * 37;
            b bVar2 = this.f38974c4;
            int hashCode55 = hashCode54 + (bVar2 != null ? bVar2.hashCode() : 0);
            this.hashCode = hashCode55;
            return hashCode55;
        }
        return i11;
    }

    public final Integer i() {
        return this.O3;
    }

    public final Boolean i0() {
        return this.P3;
    }

    public final int j() {
        return this.K;
    }

    public final boolean j0() {
        return this.L;
    }

    public final Boolean k() {
        return this.K3;
    }

    public final Long k0() {
        return this.R3;
    }

    public final boolean l() {
        return this.E;
    }

    public final long l0() {
        return this.P;
    }

    public final Float m() {
        return this.f39009w3;
    }

    public final p m0() {
        return this.f38987k3;
    }

    public final float n() {
        return this.f38988l;
    }

    public final Boolean n0() {
        return this.Q3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m773newBuilder();
    }

    public final b o() {
        return this.f38974c4;
    }

    public final boolean o0() {
        return this.O;
    }

    public final Integer p() {
        return this.f38989l3;
    }

    public final Integer p0() {
        return this.f38999p3;
    }

    public final int q() {
        return this.f38967a;
    }

    public final int q0() {
        return this.f38976e;
    }

    public final Integer r() {
        return this.f38995o3;
    }

    public final Integer r0() {
        return this.D3;
    }

    public final int s() {
        return this.f38975d;
    }

    public final int s0() {
        return this.f39008w;
    }

    public final Integer t() {
        return this.f38993n3;
    }

    public final kt.h t0() {
        return this.f38985j3;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f38967a;
        arrayList.add("charge_limit_soc_OBSOLETE=" + i11);
        int i12 = this.f38969b;
        arrayList.add("charge_limit_soc_std_OBSOLETE=" + i12);
        int i13 = this.f38973c;
        arrayList.add("charge_limit_soc_min_OBSOLETE=" + i13);
        int i14 = this.f38975d;
        arrayList.add("charge_limit_soc_max_OBSOLETE=" + i14);
        int i15 = this.f38976e;
        arrayList.add("max_range_charge_counter_OBSOLETE=" + i15);
        boolean z11 = this.f38977f;
        arrayList.add("fast_charger_present_OBSOLETE=" + z11);
        float f11 = this.f38978g;
        arrayList.add("battery_range_OBSOLETE=" + f11);
        float f12 = this.f38981h;
        arrayList.add("est_battery_range_OBSOLETE=" + f12);
        float f13 = this.f38982i;
        arrayList.add("ideal_battery_range_OBSOLETE=" + f13);
        int i16 = this.f38984j;
        arrayList.add("battery_level_OBSOLETE=" + i16);
        int i17 = this.f38986k;
        arrayList.add("usable_battery_level_OBSOLETE=" + i17);
        float f14 = this.f38988l;
        arrayList.add("charge_energy_added_OBSOLETE=" + f14);
        float f15 = this.f38990m;
        arrayList.add("charge_miles_added_rated_OBSOLETE=" + f15);
        float f16 = this.f38992n;
        arrayList.add("charge_miles_added_ideal_OBSOLETE=" + f16);
        int i18 = this.f38994o;
        arrayList.add("charger_voltage_OBSOLETE=" + i18);
        int i19 = this.f38996p;
        arrayList.add("charger_pilot_current_OBSOLETE=" + i19);
        int i21 = this.f39000q;
        arrayList.add("charger_actual_current_OBSOLETE=" + i21);
        int i22 = this.f39004t;
        arrayList.add("charger_power_OBSOLETE=" + i22);
        int i23 = this.f39008w;
        arrayList.add("minutes_to_full_charge_OBSOLETE=" + i23);
        boolean z12 = this.f39010x;
        arrayList.add("trip_charging_OBSOLETE=" + z12);
        int i24 = this.f39014y;
        arrayList.add("charge_rate_mph_OBSOLETE=" + i24);
        boolean z13 = this.f39018z;
        arrayList.add("charge_port_door_open_OBSOLETE=" + z13);
        long j11 = this.A;
        arrayList.add("scheduled_charging_start_time_OBSOLETE=" + j11);
        boolean z14 = this.B;
        arrayList.add("scheduled_charging_pending_OBSOLETE=" + z14);
        boolean z15 = this.C;
        arrayList.add("user_charge_enable_request_OBSOLETE=" + z15);
        boolean z16 = this.E;
        arrayList.add("charge_enable_request_OBSOLETE=" + z16);
        int i25 = this.F;
        arrayList.add("charger_phases_OBSOLETE=" + i25);
        boolean z17 = this.G;
        arrayList.add("charge_port_cold_weather_mode_OBSOLETE=" + z17);
        int i26 = this.H;
        arrayList.add("charge_current_request_OBSOLETE=" + i26);
        int i27 = this.K;
        arrayList.add("charge_current_request_max_OBSOLETE=" + i27);
        boolean z18 = this.L;
        arrayList.add("managed_charging_active_OBSOLETE=" + z18);
        boolean z19 = this.O;
        arrayList.add("managed_charging_user_canceled_OBSOLETE=" + z19);
        long j12 = this.P;
        arrayList.add("managed_charging_start_time_OBSOLETE=" + j12);
        int i28 = this.Q;
        arrayList.add("off_peak_hours_end_time_OBSOLETE=" + i28);
        i iVar = this.R;
        arrayList.add("scheduled_charging_mode_OBSOLETE=" + iVar);
        int i29 = this.T;
        arrayList.add("charging_amps_OBSOLETE=" + i29);
        int i31 = this.Y;
        arrayList.add("scheduled_charging_start_time_minutes_OBSOLETE=" + i31);
        int i32 = this.f38970b1;
        arrayList.add("scheduled_departure_time_minutes_OBSOLETE=" + i32);
        boolean z21 = this.f38979g1;
        arrayList.add("preconditioning_enabled_OBSOLETE=" + z21);
        int i33 = this.f38997p1;
        arrayList.add("scheduled_charging_start_time_app_OBSOLETE=" + i33);
        boolean z22 = this.f39011x1;
        arrayList.add("supercharger_session_trip_planner_OBSOLETE=" + z22);
        c cVar = this.f39015y1;
        arrayList.add("charge_port_color_OBSOLETE=" + cVar);
        float f17 = this.Q1;
        arrayList.add("charge_rate_mph_float_OBSOLETE=" + f17);
        f fVar = this.V1;
        if (fVar != null) {
            arrayList.add("charging_state=" + fVar);
        }
        e eVar = this.f38971b2;
        if (eVar != null) {
            arrayList.add("fast_charger_type=" + eVar);
        }
        d dVar = this.f38980g2;
        if (dVar != null) {
            arrayList.add("fast_charger_brand=" + dVar);
        }
        a aVar = this.f38998p2;
        if (aVar != null) {
            arrayList.add("conn_charge_cable=" + aVar);
        }
        Instant instant = this.f39012x2;
        if (instant != null) {
            arrayList.add("scheduled_departure_time=" + instant);
        }
        kt.b bVar = this.f39016y2;
        if (bVar != null) {
            arrayList.add("charge_port_latch=" + bVar);
        }
        Instant instant2 = this.Q2;
        if (instant2 != null) {
            arrayList.add("timestamp=" + instant2);
        }
        kt.i iVar2 = this.f38983i3;
        if (iVar2 != null) {
            arrayList.add("preconditioning_times=" + iVar2);
        }
        kt.h hVar = this.f38985j3;
        if (hVar != null) {
            arrayList.add("off_peak_charging_times=" + hVar);
        }
        p pVar = this.f38987k3;
        if (pVar != null) {
            arrayList.add("managed_charging_state=" + pVar);
        }
        Integer num = this.f38989l3;
        if (num != null) {
            arrayList.add("charge_limit_soc=" + num);
        }
        Integer num2 = this.f38991m3;
        if (num2 != null) {
            arrayList.add("charge_limit_soc_std=" + num2);
        }
        Integer num3 = this.f38993n3;
        if (num3 != null) {
            arrayList.add("charge_limit_soc_min=" + num3);
        }
        Integer num4 = this.f38995o3;
        if (num4 != null) {
            arrayList.add("charge_limit_soc_max=" + num4);
        }
        Integer num5 = this.f38999p3;
        if (num5 != null) {
            arrayList.add("max_range_charge_counter=" + num5);
        }
        Boolean bool = this.f39001q3;
        if (bool != null) {
            arrayList.add("fast_charger_present=" + bool);
        }
        Float f18 = this.f39002r3;
        if (f18 != null) {
            arrayList.add("battery_range=" + f18);
        }
        Float f19 = this.f39003s3;
        if (f19 != null) {
            arrayList.add("est_battery_range=" + f19);
        }
        Float f21 = this.f39005t3;
        if (f21 != null) {
            arrayList.add("ideal_battery_range=" + f21);
        }
        Integer num6 = this.f39006u3;
        if (num6 != null) {
            arrayList.add("battery_level=" + num6);
        }
        Integer num7 = this.f39007v3;
        if (num7 != null) {
            arrayList.add("usable_battery_level=" + num7);
        }
        Float f22 = this.f39009w3;
        if (f22 != null) {
            arrayList.add("charge_energy_added=" + f22);
        }
        Float f23 = this.f39013x3;
        if (f23 != null) {
            arrayList.add("charge_miles_added_rated=" + f23);
        }
        Float f24 = this.f39017y3;
        if (f24 != null) {
            arrayList.add("charge_miles_added_ideal=" + f24);
        }
        Integer num8 = this.f39019z3;
        if (num8 != null) {
            arrayList.add("charger_voltage=" + num8);
        }
        Integer num9 = this.A3;
        if (num9 != null) {
            arrayList.add("charger_pilot_current=" + num9);
        }
        Integer num10 = this.B3;
        if (num10 != null) {
            arrayList.add("charger_actual_current=" + num10);
        }
        Integer num11 = this.C3;
        if (num11 != null) {
            arrayList.add("charger_power=" + num11);
        }
        Integer num12 = this.D3;
        if (num12 != null) {
            arrayList.add("minutes_to_full_charge=" + num12);
        }
        Boolean bool2 = this.E3;
        if (bool2 != null) {
            arrayList.add("trip_charging=" + bool2);
        }
        Integer num13 = this.F3;
        if (num13 != null) {
            arrayList.add("charge_rate_mph=" + num13);
        }
        Boolean bool3 = this.G3;
        if (bool3 != null) {
            arrayList.add("charge_port_door_open=" + bool3);
        }
        Long l11 = this.H3;
        if (l11 != null) {
            arrayList.add("scheduled_charging_start_time=" + l11);
        }
        Boolean bool4 = this.I3;
        if (bool4 != null) {
            arrayList.add("scheduled_charging_pending=" + bool4);
        }
        Boolean bool5 = this.J3;
        if (bool5 != null) {
            arrayList.add("user_charge_enable_request=" + bool5);
        }
        Boolean bool6 = this.K3;
        if (bool6 != null) {
            arrayList.add("charge_enable_request=" + bool6);
        }
        Integer num14 = this.L3;
        if (num14 != null) {
            arrayList.add("charger_phases=" + num14);
        }
        Boolean bool7 = this.M3;
        if (bool7 != null) {
            arrayList.add("charge_port_cold_weather_mode=" + bool7);
        }
        Integer num15 = this.N3;
        if (num15 != null) {
            arrayList.add("charge_current_request=" + num15);
        }
        Integer num16 = this.O3;
        if (num16 != null) {
            arrayList.add("charge_current_request_max=" + num16);
        }
        Boolean bool8 = this.P3;
        if (bool8 != null) {
            arrayList.add("managed_charging_active=" + bool8);
        }
        Boolean bool9 = this.Q3;
        if (bool9 != null) {
            arrayList.add("managed_charging_user_canceled=" + bool9);
        }
        Long l12 = this.R3;
        if (l12 != null) {
            arrayList.add("managed_charging_start_time=" + l12);
        }
        Integer num17 = this.S3;
        if (num17 != null) {
            arrayList.add("off_peak_hours_end_time=" + num17);
        }
        i iVar3 = this.T3;
        if (iVar3 != null) {
            arrayList.add("scheduled_charging_mode=" + iVar3);
        }
        Integer num18 = this.U3;
        if (num18 != null) {
            arrayList.add("charging_amps=" + num18);
        }
        Integer num19 = this.V3;
        if (num19 != null) {
            arrayList.add("scheduled_charging_start_time_minutes=" + num19);
        }
        Integer num20 = this.W3;
        if (num20 != null) {
            arrayList.add("scheduled_departure_time_minutes=" + num20);
        }
        Boolean bool10 = this.X3;
        if (bool10 != null) {
            arrayList.add("preconditioning_enabled=" + bool10);
        }
        Integer num21 = this.Y3;
        if (num21 != null) {
            arrayList.add("scheduled_charging_start_time_app=" + num21);
        }
        Boolean bool11 = this.Z3;
        if (bool11 != null) {
            arrayList.add("supercharger_session_trip_planner=" + bool11);
        }
        c cVar2 = this.f38968a4;
        if (cVar2 != null) {
            arrayList.add("charge_port_color=" + cVar2);
        }
        Float f25 = this.f38972b4;
        if (f25 != null) {
            arrayList.add("charge_rate_mph_float=" + f25);
        }
        b bVar2 = this.f38974c4;
        if (bVar2 != null) {
            arrayList.add("charge_limit_reason=" + bVar2);
        }
        l02 = e0.l0(arrayList, ", ", "ChargeState{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final int u() {
        return this.f38973c;
    }

    public final Integer u0() {
        return this.S3;
    }

    public final Integer v() {
        return this.f38991m3;
    }

    public final int v0() {
        return this.Q;
    }

    public final int w() {
        return this.f38969b;
    }

    public final Boolean w0() {
        return this.X3;
    }

    public final Float x() {
        return this.f39017y3;
    }

    public final boolean x0() {
        return this.f38979g1;
    }

    public final float y() {
        return this.f38992n;
    }

    public final kt.i y0() {
        return this.f38983i3;
    }

    public final Float z() {
        return this.f39013x3;
    }

    public final i z0() {
        return this.T3;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m773newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, int i12, int i13, int i14, int i15, boolean z11, float f11, float f12, float f13, int i16, int i17, float f14, float f15, float f16, int i18, int i19, int i21, int i22, int i23, boolean z12, int i24, boolean z13, long j11, boolean z14, boolean z15, boolean z16, int i25, boolean z17, int i26, int i27, boolean z18, boolean z19, long j12, int i28, i scheduled_charging_mode_OBSOLETE, int i29, int i31, int i32, boolean z21, int i33, boolean z22, c charge_port_color_OBSOLETE, float f17, f fVar, e eVar, d dVar, a aVar, Instant instant, kt.b bVar, Instant instant2, kt.i iVar, kt.h hVar, p pVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Float f18, Float f19, Float f21, Integer num6, Integer num7, Float f22, Float f23, Float f24, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool2, Integer num13, Boolean bool3, Long l11, Boolean bool4, Boolean bool5, Boolean bool6, Integer num14, Boolean bool7, Integer num15, Integer num16, Boolean bool8, Boolean bool9, Long l12, Integer num17, i iVar2, Integer num18, Integer num19, Integer num20, Boolean bool10, Integer num21, Boolean bool11, c cVar, Float f25, b bVar2, okio.i unknownFields) {
        super(f38966d4, unknownFields);
        kotlin.jvm.internal.s.g(scheduled_charging_mode_OBSOLETE, "scheduled_charging_mode_OBSOLETE");
        kotlin.jvm.internal.s.g(charge_port_color_OBSOLETE, "charge_port_color_OBSOLETE");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f38967a = i11;
        this.f38969b = i12;
        this.f38973c = i13;
        this.f38975d = i14;
        this.f38976e = i15;
        this.f38977f = z11;
        this.f38978g = f11;
        this.f38981h = f12;
        this.f38982i = f13;
        this.f38984j = i16;
        this.f38986k = i17;
        this.f38988l = f14;
        this.f38990m = f15;
        this.f38992n = f16;
        this.f38994o = i18;
        this.f38996p = i19;
        this.f39000q = i21;
        this.f39004t = i22;
        this.f39008w = i23;
        this.f39010x = z12;
        this.f39014y = i24;
        this.f39018z = z13;
        this.A = j11;
        this.B = z14;
        this.C = z15;
        this.E = z16;
        this.F = i25;
        this.G = z17;
        this.H = i26;
        this.K = i27;
        this.L = z18;
        this.O = z19;
        this.P = j12;
        this.Q = i28;
        this.R = scheduled_charging_mode_OBSOLETE;
        this.T = i29;
        this.Y = i31;
        this.f38970b1 = i32;
        this.f38979g1 = z21;
        this.f38997p1 = i33;
        this.f39011x1 = z22;
        this.f39015y1 = charge_port_color_OBSOLETE;
        this.Q1 = f17;
        this.V1 = fVar;
        this.f38971b2 = eVar;
        this.f38980g2 = dVar;
        this.f38998p2 = aVar;
        this.f39012x2 = instant;
        this.f39016y2 = bVar;
        this.Q2 = instant2;
        this.f38983i3 = iVar;
        this.f38985j3 = hVar;
        this.f38987k3 = pVar;
        this.f38989l3 = num;
        this.f38991m3 = num2;
        this.f38993n3 = num3;
        this.f38995o3 = num4;
        this.f38999p3 = num5;
        this.f39001q3 = bool;
        this.f39002r3 = f18;
        this.f39003s3 = f19;
        this.f39005t3 = f21;
        this.f39006u3 = num6;
        this.f39007v3 = num7;
        this.f39009w3 = f22;
        this.f39013x3 = f23;
        this.f39017y3 = f24;
        this.f39019z3 = num8;
        this.A3 = num9;
        this.B3 = num10;
        this.C3 = num11;
        this.D3 = num12;
        this.E3 = bool2;
        this.F3 = num13;
        this.G3 = bool3;
        this.H3 = l11;
        this.I3 = bool4;
        this.J3 = bool5;
        this.K3 = bool6;
        this.L3 = num14;
        this.M3 = bool7;
        this.N3 = num15;
        this.O3 = num16;
        this.P3 = bool8;
        this.Q3 = bool9;
        this.R3 = l12;
        this.S3 = num17;
        this.T3 = iVar2;
        this.U3 = num18;
        this.V3 = num19;
        this.W3 = num20;
        this.X3 = bool10;
        this.Y3 = num21;
        this.Z3 = bool11;
        this.f38968a4 = cVar;
        this.f38972b4 = f25;
        this.f38974c4 = bVar2;
    }
}