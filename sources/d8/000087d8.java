package mt;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import vz.b0;
import wz.e0;

/* loaded from: classes6.dex */
public final class v extends com.squareup.wire.f {
    public static final ProtoAdapter<v> U3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 54)
    private final float A;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFr", tag = 152)
    private final Float A3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 56)
    private final boolean B;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRl", tag = 153)
    private final Float B3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModePlusOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 57)
    private final boolean C;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRr", tag = 154)
    private final Float C3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceMode", tag = 156)
    private final Boolean D3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 62)
    private final boolean E;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModePlus", tag = 157)
    private final Boolean E3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 63)
    private final boolean F;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFl", tag = CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256)
    private final Boolean F3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 64)
    private final boolean G;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFr", tag = CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384)
    private final Boolean G3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 65)
    private final boolean H;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRl", tag = CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256)
    private final Boolean H3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRr", tag = CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384)
    private final Boolean I3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFl", tag = CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256)
    private final Boolean J3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 66)
    private final boolean K;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFr", tag = CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384)
    private final Boolean K3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 67)
    private final boolean L;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRl", tag = 168)
    private final Boolean L3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRr", tag = CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384)
    private final Boolean M3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpFrontValue", tag = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256)
    private final Float N3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 68)
    private final boolean O;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpRearValue", tag = CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384)
    private final Float O3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 69)
    private final boolean P;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowAuthorizedMobileDevicesOnly", tag = 73)
    private final Boolean P3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpFrontValueOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 70)
    private final float Q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFl", label = q.a.OMIT_IDENTITY, tag = 58)
    private final Instant Q1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carVersion", tag = 108)
    private final String Q2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "driveRailOn", tag = 75)
    private final Boolean Q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpRearValueOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 71)
    private final float R;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDriveEnabled", tag = 76)
    private final Boolean R3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDrivePinSet", tag = 77)
    private final Boolean S3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$AutoparkStyle#ADAPTER", jsonName = "autoparkStyle", label = q.a.OMIT_IDENTITY, tag = 34)
    private final b T;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "featureBitmask", label = q.a.PACKED, tag = 55)
    private final List<Integer> T3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFr", label = q.a.OMIT_IDENTITY, tag = 59)
    private final Instant V1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$SpoilerState#ADAPTER", jsonName = "activeSpoilerState", label = q.a.OMIT_IDENTITY, tag = 37)
    private final i Y;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "apiVersionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final int f39383a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carVersionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: b */
    private final String f39384b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SoftwareUpdate#ADAPTER", jsonName = "softwareUpdate", label = q.a.OMIT_IDENTITY, tag = 38)

    /* renamed from: b1 */
    private final s f39385b1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRl", label = q.a.OMIT_IDENTITY, tag = 60)

    /* renamed from: b2 */
    private final Instant f39386b2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedVersionOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: c */
    private final String f39387c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autopilotHashOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: d */
    private final String f39388d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleNameOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 18)

    /* renamed from: e */
    private final String f39389e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notificationsSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 20)

    /* renamed from: f */
    private final boolean f39390f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 21)

    /* renamed from: g */
    private final boolean f39391g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaState#ADAPTER", jsonName = "mediaState", label = q.a.OMIT_IDENTITY, tag = 39)

    /* renamed from: g1 */
    private final r f39392g1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRr", label = q.a.OMIT_IDENTITY, tag = 61)

    /* renamed from: g2 */
    private final Instant f39393g2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 22)

    /* renamed from: h */
    private final boolean f39394h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastAutoparkErrorOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 31)

    /* renamed from: i */
    private final String f39395i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedVersion", tag = 109)

    /* renamed from: i3 */
    private final String f39396i3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "homelinkDeviceCountOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 33)

    /* renamed from: j */
    private final int f39397j;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autopilotHash", tag = 110)

    /* renamed from: j3 */
    private final String f39398j3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "smartSummonAvailableOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 35)

    /* renamed from: k */
    private final boolean f39399k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleName", tag = 118)

    /* renamed from: k3 */
    private final String f39400k3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "summonStandbyModeEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 36)

    /* renamed from: l */
    private final boolean f39401l;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notificationsSupported", tag = 120)

    /* renamed from: l3 */
    private final Boolean f39402l3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "patsyModeOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 41)

    /* renamed from: m */
    private final boolean f39403m;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartSupported", tag = 121)

    /* renamed from: m3 */
    private final Boolean f39404m3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamAvailableOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 42)

    /* renamed from: n */
    private final boolean f39405n;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartEnabled", tag = 122)

    /* renamed from: n3 */
    private final Boolean f39406n3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "vehicleSelfTestRequestedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 44)

    /* renamed from: o */
    private final boolean f39407o;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastAutoparkError", tag = com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE)

    /* renamed from: o3 */
    private final String f39408o3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleSelfTestProgressOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 45)

    /* renamed from: p */
    private final int f39409p;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 43)

    /* renamed from: p1 */
    private final Instant f39410p1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaInfo#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 72)

    /* renamed from: p2 */
    private final q f39411p2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "homelinkDeviceCount", tag = 133)

    /* renamed from: p3 */
    private final Integer f39412p3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "calendarSupportedOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 48)

    /* renamed from: q */
    private final boolean f39413q;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "smartSummonAvailable", tag = 135)

    /* renamed from: q3 */
    private final Boolean f39414q3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "summonStandbyModeEnabled", tag = 136)

    /* renamed from: r3 */
    private final Boolean f39415r3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "patsyMode", tag = 141)

    /* renamed from: s3 */
    private final Boolean f39416s3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveAvailableOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 49)

    /* renamed from: t */
    private final boolean f39417t;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamAvailable", tag = 142)

    /* renamed from: t3 */
    private final Boolean f39418t3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "vehicleSelfTestRequested", tag = 144)

    /* renamed from: u3 */
    private final Boolean f39419u3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleSelfTestProgress", tag = 145)

    /* renamed from: v3 */
    private final Integer f39420v3;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$DashCamState_E#ADAPTER", jsonName = "dashcamStateOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 50)

    /* renamed from: w */
    private final f f39421w;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "calendarSupported", tag = 148)

    /* renamed from: w3 */
    private final Boolean f39422w3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 51)

    /* renamed from: x */
    private final float f39423x;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$AutoparkVersion#ADAPTER", jsonName = "autoparkVersion", label = q.a.OMIT_IDENTITY, tag = 46)

    /* renamed from: x1 */
    private final c f39424x1;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$GuestMode#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 74)

    /* renamed from: x2 */
    private final h f39425x2;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveAvailable", tag = 149)

    /* renamed from: x3 */
    private final Boolean f39426x3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFrOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 52)

    /* renamed from: y */
    private final float f39427y;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$AutoparkState#ADAPTER", jsonName = "autoparkState", label = q.a.OMIT_IDENTITY, tag = 47)

    /* renamed from: y1 */
    private final a f39428y1;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "apiVersion", tag = 101)

    /* renamed from: y2 */
    private final Integer f39429y2;
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState$DashCamState_E#ADAPTER", jsonName = "dashcamState", tag = 150)

    /* renamed from: y3 */
    private final f f39430y3;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRlOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 53)

    /* renamed from: z */
    private final float f39431z;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFl", tag = 151)

    /* renamed from: z3 */
    private final Float f39432z3;

    /* loaded from: classes6.dex */
    public static final class a extends com.squareup.wire.f {

        /* renamed from: m */
        public static final ProtoAdapter<a> f39433m;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39434a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39435b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39436c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39437d;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)

        /* renamed from: e */
        private final kt.u f39438e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)

        /* renamed from: f */
        private final kt.u f39439f;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)

        /* renamed from: g */
        private final kt.u f39440g;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)

        /* renamed from: h */
        private final kt.u f39441h;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)

        /* renamed from: i */
        private final kt.u f39442i;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)

        /* renamed from: j */
        private final kt.u f39443j;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)

        /* renamed from: k */
        private final kt.u f39444k;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)

        /* renamed from: l */
        private final kt.u f39445l;

        /* renamed from: mt.v$a$a */
        /* loaded from: classes6.dex */
        public static final class C0760a extends ProtoAdapter<a> {
            C0760a(com.squareup.wire.b bVar, n00.d<a> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState.AutoparkState", oVar, (Object) null);
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
                kt.u uVar6 = null;
                kt.u uVar7 = null;
                kt.u uVar8 = null;
                kt.u uVar9 = null;
                kt.u uVar10 = null;
                kt.u uVar11 = null;
                kt.u uVar12 = null;
                while (true) {
                    int g11 = reader.g();
                    kt.u uVar13 = uVar12;
                    if (g11 == -1) {
                        return new a(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar13, reader.e(d11));
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
                        case 11:
                            uVar11 = kt.u.f35845a.decode(reader);
                            break;
                        case 12:
                            uVar12 = kt.u.f35845a.decode(reader);
                            continue;
                        default:
                            reader.m(g11);
                            break;
                    }
                    uVar12 = uVar13;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, a value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.l());
                protoAdapter.encodeWithTag(writer, 2, value.m());
                protoAdapter.encodeWithTag(writer, 3, value.j());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                protoAdapter.encodeWithTag(writer, 5, value.d());
                protoAdapter.encodeWithTag(writer, 6, value.e());
                protoAdapter.encodeWithTag(writer, 7, value.g());
                protoAdapter.encodeWithTag(writer, 8, value.i());
                protoAdapter.encodeWithTag(writer, 9, value.b());
                protoAdapter.encodeWithTag(writer, 10, value.h());
                protoAdapter.encodeWithTag(writer, 11, value.k());
                protoAdapter.encodeWithTag(writer, 12, value.f());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.l()) + protoAdapter.encodedSizeWithTag(2, value.m()) + protoAdapter.encodedSizeWithTag(3, value.j()) + protoAdapter.encodedSizeWithTag(4, value.c()) + protoAdapter.encodedSizeWithTag(5, value.d()) + protoAdapter.encodedSizeWithTag(6, value.e()) + protoAdapter.encodedSizeWithTag(7, value.g()) + protoAdapter.encodedSizeWithTag(8, value.i()) + protoAdapter.encodedSizeWithTag(9, value.b()) + protoAdapter.encodedSizeWithTag(10, value.h()) + protoAdapter.encodedSizeWithTag(11, value.k()) + protoAdapter.encodedSizeWithTag(12, value.f());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public a redact(a value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u l11 = value.l();
                kt.u redact = l11 == null ? null : kt.u.f35845a.redact(l11);
                kt.u m11 = value.m();
                kt.u redact2 = m11 == null ? null : kt.u.f35845a.redact(m11);
                kt.u j11 = value.j();
                kt.u redact3 = j11 == null ? null : kt.u.f35845a.redact(j11);
                kt.u c11 = value.c();
                kt.u redact4 = c11 == null ? null : kt.u.f35845a.redact(c11);
                kt.u d11 = value.d();
                kt.u redact5 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u e11 = value.e();
                kt.u redact6 = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u g11 = value.g();
                kt.u redact7 = g11 == null ? null : kt.u.f35845a.redact(g11);
                kt.u i11 = value.i();
                kt.u redact8 = i11 == null ? null : kt.u.f35845a.redact(i11);
                kt.u b11 = value.b();
                kt.u redact9 = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u h11 = value.h();
                kt.u redact10 = h11 == null ? null : kt.u.f35845a.redact(h11);
                kt.u k11 = value.k();
                kt.u redact11 = k11 == null ? null : kt.u.f35845a.redact(k11);
                kt.u f11 = value.f();
                return value.a(redact, redact2, redact3, redact4, redact5, redact6, redact7, redact8, redact9, redact10, redact11, f11 != null ? kt.u.f35845a.redact(f11) : null, okio.i.f42656d);
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
            f39433m = new C0760a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(a.class), com.squareup.wire.o.PROTO_3);
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }

        public /* synthetic */ a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) != 0 ? null : uVar4, (i11 & 16) != 0 ? null : uVar5, (i11 & 32) != 0 ? null : uVar6, (i11 & 64) != 0 ? null : uVar7, (i11 & 128) != 0 ? null : uVar8, (i11 & 256) != 0 ? null : uVar9, (i11 & 512) != 0 ? null : uVar10, (i11 & 1024) != 0 ? null : uVar11, (i11 & 2048) == 0 ? uVar12 : null, (i11 & 4096) != 0 ? okio.i.f42656d : iVar);
        }

        public final a a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new a(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, unknownFields);
        }

        public final kt.u b() {
            return this.f39442i;
        }

        public final kt.u c() {
            return this.f39437d;
        }

        public final kt.u d() {
            return this.f39438e;
        }

        public final kt.u e() {
            return this.f39439f;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), aVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39434a, aVar.f39434a) && kotlin.jvm.internal.s.c(this.f39435b, aVar.f39435b) && kotlin.jvm.internal.s.c(this.f39436c, aVar.f39436c) && kotlin.jvm.internal.s.c(this.f39437d, aVar.f39437d) && kotlin.jvm.internal.s.c(this.f39438e, aVar.f39438e) && kotlin.jvm.internal.s.c(this.f39439f, aVar.f39439f) && kotlin.jvm.internal.s.c(this.f39440g, aVar.f39440g) && kotlin.jvm.internal.s.c(this.f39441h, aVar.f39441h) && kotlin.jvm.internal.s.c(this.f39442i, aVar.f39442i) && kotlin.jvm.internal.s.c(this.f39443j, aVar.f39443j) && kotlin.jvm.internal.s.c(this.f39444k, aVar.f39444k) && kotlin.jvm.internal.s.c(this.f39445l, aVar.f39445l);
            }
            return false;
        }

        public final kt.u f() {
            return this.f39445l;
        }

        public final kt.u g() {
            return this.f39440g;
        }

        public final kt.u h() {
            return this.f39443j;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39434a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39435b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39436c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39437d;
                int hashCode5 = (hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0)) * 37;
                kt.u uVar5 = this.f39438e;
                int hashCode6 = (hashCode5 + (uVar5 != null ? uVar5.hashCode() : 0)) * 37;
                kt.u uVar6 = this.f39439f;
                int hashCode7 = (hashCode6 + (uVar6 != null ? uVar6.hashCode() : 0)) * 37;
                kt.u uVar7 = this.f39440g;
                int hashCode8 = (hashCode7 + (uVar7 != null ? uVar7.hashCode() : 0)) * 37;
                kt.u uVar8 = this.f39441h;
                int hashCode9 = (hashCode8 + (uVar8 != null ? uVar8.hashCode() : 0)) * 37;
                kt.u uVar9 = this.f39442i;
                int hashCode10 = (hashCode9 + (uVar9 != null ? uVar9.hashCode() : 0)) * 37;
                kt.u uVar10 = this.f39443j;
                int hashCode11 = (hashCode10 + (uVar10 != null ? uVar10.hashCode() : 0)) * 37;
                kt.u uVar11 = this.f39444k;
                int hashCode12 = (hashCode11 + (uVar11 != null ? uVar11.hashCode() : 0)) * 37;
                kt.u uVar12 = this.f39445l;
                int hashCode13 = hashCode12 + (uVar12 != null ? uVar12.hashCode() : 0);
                this.hashCode = hashCode13;
                return hashCode13;
            }
            return i11;
        }

        public final kt.u i() {
            return this.f39441h;
        }

        public final kt.u j() {
            return this.f39436c;
        }

        public final kt.u k() {
            return this.f39444k;
        }

        public final kt.u l() {
            return this.f39434a;
        }

        public final kt.u m() {
            return this.f39435b;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m808newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39434a;
            if (uVar != null) {
                arrayList.add("Standby=" + uVar);
            }
            kt.u uVar2 = this.f39435b;
            if (uVar2 != null) {
                arrayList.add("Unavailable=" + uVar2);
            }
            kt.u uVar3 = this.f39436c;
            if (uVar3 != null) {
                arrayList.add("Ready=" + uVar3);
            }
            kt.u uVar4 = this.f39437d;
            if (uVar4 != null) {
                arrayList.add("ActiveForward=" + uVar4);
            }
            kt.u uVar5 = this.f39438e;
            if (uVar5 != null) {
                arrayList.add("ActiveReverse=" + uVar5);
            }
            kt.u uVar6 = this.f39439f;
            if (uVar6 != null) {
                arrayList.add("Disabled=" + uVar6);
            }
            kt.u uVar7 = this.f39440g;
            if (uVar7 != null) {
                arrayList.add("Panic=" + uVar7);
            }
            kt.u uVar8 = this.f39441h;
            if (uVar8 != null) {
                arrayList.add("Preparing=" + uVar8);
            }
            kt.u uVar9 = this.f39442i;
            if (uVar9 != null) {
                arrayList.add("Aborting=" + uVar9);
            }
            kt.u uVar10 = this.f39443j;
            if (uVar10 != null) {
                arrayList.add("Paused=" + uVar10);
            }
            kt.u uVar11 = this.f39444k;
            if (uVar11 != null) {
                arrayList.add("Resuming=" + uVar11);
            }
            kt.u uVar12 = this.f39445l;
            if (uVar12 != null) {
                arrayList.add("OpeningGate=" + uVar12);
            }
            l02 = e0.l0(arrayList, ", ", "AutoparkState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m808newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, kt.u uVar5, kt.u uVar6, kt.u uVar7, kt.u uVar8, kt.u uVar9, kt.u uVar10, kt.u uVar11, kt.u uVar12, okio.i unknownFields) {
            super(f39433m, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39434a = uVar;
            this.f39435b = uVar2;
            this.f39436c = uVar3;
            this.f39437d = uVar4;
            this.f39438e = uVar5;
            this.f39439f = uVar6;
            this.f39440g = uVar7;
            this.f39441h = uVar8;
            this.f39442i = uVar9;
            this.f39443j = uVar10;
            this.f39444k = uVar11;
            this.f39445l = uVar12;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12) <= 1)) {
                throw new IllegalArgumentException("At most one of Standby, Unavailable, Ready, ActiveForward, ActiveReverse, Disabled, Panic, Preparing, Aborting, Paused, Resuming, OpeningGate may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<b> f39446c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39447a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39448b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<b> {
            a(com.squareup.wire.b bVar, n00.d<b> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState.AutoparkStyle", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public b decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                kt.u uVar = null;
                kt.u uVar2 = null;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new b(uVar, uVar2, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, b value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.b());
                protoAdapter.encodeWithTag(writer, 2, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.b()) + protoAdapter.encodedSizeWithTag(2, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public b redact(b value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u b11 = value.b();
                kt.u redact = b11 == null ? null : kt.u.f35845a.redact(b11);
                kt.u c11 = value.c();
                return value.a(redact, c11 != null ? kt.u.f35845a.redact(c11) : null, okio.i.f42656d);
            }
        }

        /* renamed from: mt.v$b$b */
        /* loaded from: classes6.dex */
        public static final class C0761b {
            private C0761b() {
            }

            public /* synthetic */ C0761b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C0761b(null);
            f39446c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b.class), com.squareup.wire.o.PROTO_3);
        }

        public b() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ b(kt.u uVar, kt.u uVar2, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
        }

        public final b a(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new b(uVar, uVar2, unknownFields);
        }

        public final kt.u b() {
            return this.f39447a;
        }

        public final kt.u c() {
            return this.f39448b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), bVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39447a, bVar.f39447a) && kotlin.jvm.internal.s.c(this.f39448b, bVar.f39448b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39447a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39448b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m809newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39447a;
            if (uVar != null) {
                arrayList.add("Deadman=" + uVar);
            }
            kt.u uVar2 = this.f39448b;
            if (uVar2 != null) {
                arrayList.add("Standard=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "AutoparkStyle{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m809newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39446c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39447a = uVar;
            this.f39448b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of Deadman, Standard may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends com.squareup.wire.f {

        /* renamed from: c */
        public static final ProtoAdapter<c> f39449c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39450a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39451b;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, n00.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState.AutoparkVersion", oVar, (Object) null);
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
            f39449c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(c.class), com.squareup.wire.o.PROTO_3);
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
            return this.f39450a;
        }

        public final kt.u c() {
            return this.f39451b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), cVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39450a, cVar.f39450a) && kotlin.jvm.internal.s.c(this.f39451b, cVar.f39451b);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39450a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39451b;
                int hashCode3 = hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m810newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39450a;
            if (uVar != null) {
                arrayList.add("version2=" + uVar);
            }
            kt.u uVar2 = this.f39451b;
            if (uVar2 != null) {
                arrayList.add("version3=" + uVar2);
            }
            l02 = e0.l0(arrayList, ", ", "AutoparkVersion{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m810newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kt.u uVar, kt.u uVar2, okio.i unknownFields) {
            super(f39449c, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39450a = uVar;
            this.f39451b = uVar2;
            if (!(mr.d.c(uVar, uVar2) <= 1)) {
                throw new IllegalArgumentException("At most one of version2, version3 may be non-null".toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends ProtoAdapter<v> {
        d(com.squareup.wire.b bVar, n00.d<v> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public v decode(com.squareup.wire.k reader) {
            long j11;
            ArrayList arrayList;
            String str;
            String str2;
            String str3;
            kotlin.jvm.internal.s.g(reader, "reader");
            f fVar = f.Unavailable;
            ArrayList arrayList2 = new ArrayList();
            long d11 = reader.d();
            String str4 = "";
            String str5 = "";
            String str6 = str5;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i11 = 0;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i12 = 0;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int i13 = 0;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            boolean z31 = false;
            boolean z32 = false;
            b bVar = null;
            i iVar = null;
            s sVar = null;
            r rVar = null;
            Instant instant = null;
            c cVar = null;
            a aVar = null;
            Instant instant2 = null;
            Instant instant3 = null;
            Instant instant4 = null;
            Instant instant5 = null;
            q qVar = null;
            h hVar = null;
            Integer num = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str11 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            f fVar2 = null;
            Float f17 = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Float f22 = null;
            Float f23 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            ArrayList arrayList3 = arrayList2;
            f fVar3 = fVar;
            String str12 = str6;
            String str13 = str12;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new v(i11, str4, str12, str13, str5, z11, z12, z13, str6, i12, z14, z15, z16, z17, z18, i13, z19, z21, fVar3, f11, f12, f13, f14, z22, z23, z24, z25, z26, z27, z28, z29, z31, z32, f15, f16, bVar, iVar, sVar, rVar, instant, cVar, aVar, arrayList3, instant2, instant3, instant4, instant5, qVar, hVar, num, str7, str8, str9, str10, bool, bool2, bool3, str11, num2, bool4, bool5, bool6, bool7, bool8, num3, bool9, bool10, fVar2, f17, f18, f19, f21, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, f22, f23, bool21, bool22, bool23, bool24, reader.e(d11));
                }
                ArrayList arrayList4 = arrayList3;
                if (g11 == 135) {
                    j11 = d11;
                    arrayList = arrayList4;
                    Boolean decode = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var = b0.f54756a;
                    bool4 = decode;
                } else if (g11 == 136) {
                    j11 = d11;
                    arrayList = arrayList4;
                    Boolean decode2 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var2 = b0.f54756a;
                    bool5 = decode2;
                } else if (g11 == 141) {
                    j11 = d11;
                    arrayList = arrayList4;
                    Boolean decode3 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var3 = b0.f54756a;
                    bool6 = decode3;
                } else if (g11 == 142) {
                    j11 = d11;
                    arrayList = arrayList4;
                    Boolean decode4 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var4 = b0.f54756a;
                    bool7 = decode4;
                } else if (g11 == 144) {
                    j11 = d11;
                    arrayList = arrayList4;
                    Boolean decode5 = ProtoAdapter.BOOL.decode(reader);
                    b0 b0Var5 = b0.f54756a;
                    bool8 = decode5;
                } else if (g11 != 145) {
                    switch (g11) {
                        case 1:
                            j11 = d11;
                            arrayList = arrayList4;
                            i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                            b0 b0Var6 = b0.f54756a;
                            break;
                        case 18:
                            j11 = d11;
                            arrayList = arrayList4;
                            String decode6 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var7 = b0.f54756a;
                            str5 = decode6;
                            break;
                        case 31:
                            j11 = d11;
                            arrayList = arrayList4;
                            String decode7 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var8 = b0.f54756a;
                            str6 = decode7;
                            break;
                        case 41:
                            j11 = d11;
                            arrayList = arrayList4;
                            z16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var9 = b0.f54756a;
                            break;
                        case 42:
                            j11 = d11;
                            arrayList = arrayList4;
                            z17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var10 = b0.f54756a;
                            break;
                        case 43:
                            j11 = d11;
                            arrayList = arrayList4;
                            Instant decode8 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var11 = b0.f54756a;
                            instant = decode8;
                            break;
                        case 44:
                            j11 = d11;
                            arrayList = arrayList4;
                            z18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var12 = b0.f54756a;
                            break;
                        case 45:
                            j11 = d11;
                            arrayList = arrayList4;
                            i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                            b0 b0Var13 = b0.f54756a;
                            break;
                        case 46:
                            j11 = d11;
                            arrayList = arrayList4;
                            c decode9 = c.f39449c.decode(reader);
                            b0 b0Var14 = b0.f54756a;
                            cVar = decode9;
                            break;
                        case 47:
                            j11 = d11;
                            arrayList = arrayList4;
                            a decode10 = a.f39433m.decode(reader);
                            b0 b0Var15 = b0.f54756a;
                            aVar = decode10;
                            break;
                        case 48:
                            j11 = d11;
                            arrayList = arrayList4;
                            z19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var16 = b0.f54756a;
                            break;
                        case 49:
                            j11 = d11;
                            arrayList = arrayList4;
                            z21 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var17 = b0.f54756a;
                            break;
                        case 50:
                            j11 = d11;
                            String str14 = str4;
                            arrayList = arrayList4;
                            try {
                                fVar3 = f.ADAPTER.decode(reader);
                                str = str12;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                str = str12;
                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            }
                            b0 b0Var18 = b0.f54756a;
                            str4 = str14;
                            str12 = str;
                            break;
                        case 51:
                            j11 = d11;
                            arrayList = arrayList4;
                            f11 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var19 = b0.f54756a;
                            break;
                        case 52:
                            j11 = d11;
                            arrayList = arrayList4;
                            f12 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var20 = b0.f54756a;
                            break;
                        case 53:
                            j11 = d11;
                            arrayList = arrayList4;
                            f13 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var21 = b0.f54756a;
                            break;
                        case 54:
                            j11 = d11;
                            arrayList = arrayList4;
                            f14 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var22 = b0.f54756a;
                            break;
                        case 55:
                            j11 = d11;
                            str2 = str4;
                            arrayList = arrayList4;
                            arrayList.add(ProtoAdapter.UINT32.decode(reader));
                            str4 = str2;
                            break;
                        case 56:
                            j11 = d11;
                            z22 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var23 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 57:
                            j11 = d11;
                            z23 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var24 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 58:
                            j11 = d11;
                            Instant decode11 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var25 = b0.f54756a;
                            instant2 = decode11;
                            arrayList = arrayList4;
                            break;
                        case 59:
                            j11 = d11;
                            Instant decode12 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var26 = b0.f54756a;
                            instant3 = decode12;
                            arrayList = arrayList4;
                            break;
                        case 60:
                            j11 = d11;
                            Instant decode13 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var27 = b0.f54756a;
                            instant4 = decode13;
                            arrayList = arrayList4;
                            break;
                        case 61:
                            j11 = d11;
                            Instant decode14 = ProtoAdapter.INSTANT.decode(reader);
                            b0 b0Var28 = b0.f54756a;
                            instant5 = decode14;
                            arrayList = arrayList4;
                            break;
                        case 62:
                            j11 = d11;
                            z24 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var29 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 63:
                            j11 = d11;
                            z25 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var30 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 64:
                            j11 = d11;
                            z26 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var31 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 65:
                            j11 = d11;
                            z27 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var32 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 66:
                            j11 = d11;
                            z28 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var33 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 67:
                            j11 = d11;
                            z29 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var34 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 68:
                            j11 = d11;
                            z31 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var35 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 69:
                            j11 = d11;
                            z32 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            b0 b0Var36 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 70:
                            j11 = d11;
                            f15 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var37 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 71:
                            j11 = d11;
                            f16 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            b0 b0Var38 = b0.f54756a;
                            arrayList = arrayList4;
                            break;
                        case 72:
                            j11 = d11;
                            q decode15 = q.f39233n.decode(reader);
                            b0 b0Var39 = b0.f54756a;
                            qVar = decode15;
                            arrayList = arrayList4;
                            break;
                        case 73:
                            j11 = d11;
                            Boolean decode16 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var40 = b0.f54756a;
                            bool21 = decode16;
                            arrayList = arrayList4;
                            break;
                        case 74:
                            j11 = d11;
                            h decode17 = h.f39452b.decode(reader);
                            b0 b0Var41 = b0.f54756a;
                            hVar = decode17;
                            arrayList = arrayList4;
                            break;
                        case 75:
                            j11 = d11;
                            Boolean decode18 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var42 = b0.f54756a;
                            bool22 = decode18;
                            arrayList = arrayList4;
                            break;
                        case 76:
                            j11 = d11;
                            Boolean decode19 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var43 = b0.f54756a;
                            bool23 = decode19;
                            arrayList = arrayList4;
                            break;
                        case 77:
                            j11 = d11;
                            Boolean decode20 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var44 = b0.f54756a;
                            bool24 = decode20;
                            arrayList = arrayList4;
                            break;
                        case 101:
                            j11 = d11;
                            Integer decode21 = ProtoAdapter.UINT32.decode(reader);
                            b0 b0Var45 = b0.f54756a;
                            num = decode21;
                            arrayList = arrayList4;
                            break;
                        case 118:
                            j11 = d11;
                            String decode22 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var46 = b0.f54756a;
                            str10 = decode22;
                            arrayList = arrayList4;
                            break;
                        case SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE:
                            j11 = d11;
                            String decode23 = ProtoAdapter.STRING.decode(reader);
                            b0 b0Var47 = b0.f54756a;
                            str11 = decode23;
                            arrayList = arrayList4;
                            break;
                        case 133:
                            j11 = d11;
                            Integer decode24 = ProtoAdapter.UINT32.decode(reader);
                            b0 b0Var48 = b0.f54756a;
                            num2 = decode24;
                            arrayList = arrayList4;
                            break;
                        case 156:
                            j11 = d11;
                            Boolean decode25 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var49 = b0.f54756a;
                            bool11 = decode25;
                            arrayList = arrayList4;
                            break;
                        case 157:
                            j11 = d11;
                            Boolean decode26 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var50 = b0.f54756a;
                            bool12 = decode26;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                            j11 = d11;
                            Boolean decode27 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var51 = b0.f54756a;
                            bool13 = decode27;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                            j11 = d11;
                            Boolean decode28 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var52 = b0.f54756a;
                            bool14 = decode28;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                            j11 = d11;
                            Boolean decode29 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var53 = b0.f54756a;
                            bool15 = decode29;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                            j11 = d11;
                            Boolean decode30 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var54 = b0.f54756a;
                            bool16 = decode30;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256 /* 166 */:
                            j11 = d11;
                            Boolean decode31 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var55 = b0.f54756a;
                            bool17 = decode31;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 /* 167 */:
                            j11 = d11;
                            Boolean decode32 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var56 = b0.f54756a;
                            bool18 = decode32;
                            arrayList = arrayList4;
                            break;
                        case 168:
                            j11 = d11;
                            Boolean decode33 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var57 = b0.f54756a;
                            bool19 = decode33;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                            j11 = d11;
                            Boolean decode34 = ProtoAdapter.BOOL.decode(reader);
                            b0 b0Var58 = b0.f54756a;
                            bool20 = decode34;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                            j11 = d11;
                            Float decode35 = ProtoAdapter.FLOAT.decode(reader);
                            b0 b0Var59 = b0.f54756a;
                            f22 = decode35;
                            arrayList = arrayList4;
                            break;
                        case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                            j11 = d11;
                            Float decode36 = ProtoAdapter.FLOAT.decode(reader);
                            b0 b0Var60 = b0.f54756a;
                            f23 = decode36;
                            arrayList = arrayList4;
                            break;
                        default:
                            switch (g11) {
                                case 8:
                                    j11 = d11;
                                    String decode37 = ProtoAdapter.STRING.decode(reader);
                                    b0 b0Var61 = b0.f54756a;
                                    str4 = decode37;
                                    arrayList = arrayList4;
                                    break;
                                case 9:
                                    j11 = d11;
                                    String decode38 = ProtoAdapter.STRING.decode(reader);
                                    b0 b0Var62 = b0.f54756a;
                                    str12 = decode38;
                                    arrayList = arrayList4;
                                    break;
                                case 10:
                                    j11 = d11;
                                    String decode39 = ProtoAdapter.STRING.decode(reader);
                                    b0 b0Var63 = b0.f54756a;
                                    str13 = decode39;
                                    arrayList = arrayList4;
                                    break;
                                default:
                                    switch (g11) {
                                        case 20:
                                            j11 = d11;
                                            z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var64 = b0.f54756a;
                                            arrayList = arrayList4;
                                            break;
                                        case 21:
                                            j11 = d11;
                                            z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var65 = b0.f54756a;
                                            arrayList = arrayList4;
                                            break;
                                        case 22:
                                            j11 = d11;
                                            z13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            b0 b0Var66 = b0.f54756a;
                                            arrayList = arrayList4;
                                            break;
                                        default:
                                            switch (g11) {
                                                case 33:
                                                    j11 = d11;
                                                    i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                                                    b0 b0Var67 = b0.f54756a;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 34:
                                                    j11 = d11;
                                                    b decode40 = b.f39446c.decode(reader);
                                                    b0 b0Var68 = b0.f54756a;
                                                    bVar = decode40;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 35:
                                                    j11 = d11;
                                                    z14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                                    b0 b0Var69 = b0.f54756a;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 36:
                                                    j11 = d11;
                                                    z15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                                    b0 b0Var70 = b0.f54756a;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 37:
                                                    j11 = d11;
                                                    i decode41 = i.f39454e.decode(reader);
                                                    b0 b0Var71 = b0.f54756a;
                                                    iVar = decode41;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 38:
                                                    j11 = d11;
                                                    s decode42 = s.f39250n.decode(reader);
                                                    b0 b0Var72 = b0.f54756a;
                                                    sVar = decode42;
                                                    arrayList = arrayList4;
                                                    break;
                                                case 39:
                                                    j11 = d11;
                                                    r decode43 = r.f39247c.decode(reader);
                                                    b0 b0Var73 = b0.f54756a;
                                                    rVar = decode43;
                                                    arrayList = arrayList4;
                                                    break;
                                                default:
                                                    switch (g11) {
                                                        case 108:
                                                            j11 = d11;
                                                            String decode44 = ProtoAdapter.STRING.decode(reader);
                                                            b0 b0Var74 = b0.f54756a;
                                                            str7 = decode44;
                                                            arrayList = arrayList4;
                                                            break;
                                                        case 109:
                                                            j11 = d11;
                                                            String decode45 = ProtoAdapter.STRING.decode(reader);
                                                            b0 b0Var75 = b0.f54756a;
                                                            str8 = decode45;
                                                            arrayList = arrayList4;
                                                            break;
                                                        case 110:
                                                            j11 = d11;
                                                            String decode46 = ProtoAdapter.STRING.decode(reader);
                                                            b0 b0Var76 = b0.f54756a;
                                                            str9 = decode46;
                                                            arrayList = arrayList4;
                                                            break;
                                                        default:
                                                            switch (g11) {
                                                                case 120:
                                                                    j11 = d11;
                                                                    Boolean decode47 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var77 = b0.f54756a;
                                                                    bool = decode47;
                                                                    arrayList = arrayList4;
                                                                    break;
                                                                case 121:
                                                                    j11 = d11;
                                                                    Boolean decode48 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var78 = b0.f54756a;
                                                                    bool2 = decode48;
                                                                    arrayList = arrayList4;
                                                                    break;
                                                                case 122:
                                                                    j11 = d11;
                                                                    Boolean decode49 = ProtoAdapter.BOOL.decode(reader);
                                                                    b0 b0Var79 = b0.f54756a;
                                                                    bool3 = decode49;
                                                                    arrayList = arrayList4;
                                                                    break;
                                                                default:
                                                                    switch (g11) {
                                                                        case 148:
                                                                            j11 = d11;
                                                                            Boolean decode50 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var80 = b0.f54756a;
                                                                            bool9 = decode50;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 149:
                                                                            j11 = d11;
                                                                            Boolean decode51 = ProtoAdapter.BOOL.decode(reader);
                                                                            b0 b0Var81 = b0.f54756a;
                                                                            bool10 = decode51;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 150:
                                                                            try {
                                                                                fVar2 = f.ADAPTER.decode(reader);
                                                                                j11 = d11;
                                                                                str3 = str4;
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                                                                j11 = d11;
                                                                                str3 = str4;
                                                                                reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                                                                            }
                                                                            b0 b0Var82 = b0.f54756a;
                                                                            str4 = str3;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 151:
                                                                            Float decode52 = ProtoAdapter.FLOAT.decode(reader);
                                                                            b0 b0Var83 = b0.f54756a;
                                                                            f17 = decode52;
                                                                            j11 = d11;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 152:
                                                                            Float decode53 = ProtoAdapter.FLOAT.decode(reader);
                                                                            b0 b0Var84 = b0.f54756a;
                                                                            f18 = decode53;
                                                                            j11 = d11;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 153:
                                                                            Float decode54 = ProtoAdapter.FLOAT.decode(reader);
                                                                            b0 b0Var85 = b0.f54756a;
                                                                            f19 = decode54;
                                                                            j11 = d11;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        case 154:
                                                                            Float decode55 = ProtoAdapter.FLOAT.decode(reader);
                                                                            b0 b0Var86 = b0.f54756a;
                                                                            f21 = decode55;
                                                                            j11 = d11;
                                                                            arrayList = arrayList4;
                                                                            break;
                                                                        default:
                                                                            reader.m(g11);
                                                                            b0 b0Var87 = b0.f54756a;
                                                                            j11 = d11;
                                                                            str2 = str4;
                                                                            arrayList = arrayList4;
                                                                            str4 = str2;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    j11 = d11;
                    arrayList = arrayList4;
                    Integer decode56 = ProtoAdapter.UINT32.decode(reader);
                    b0 b0Var88 = b0.f54756a;
                    num3 = decode56;
                }
                arrayList3 = arrayList;
                d11 = j11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, v value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.f()));
            }
            if (!kotlin.jvm.internal.s.c(value.o(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 8, value.o());
            }
            if (!kotlin.jvm.internal.s.c(value.u(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.u());
            }
            if (!kotlin.jvm.internal.s.c(value.k(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 10, value.k());
            }
            if (!kotlin.jvm.internal.s.c(value.F0(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 18, value.F0());
            }
            if (value.F()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.F()));
            }
            if (value.N()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 21, Boolean.valueOf(value.N()));
            }
            if (value.L()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.L()));
            }
            if (!kotlin.jvm.internal.s.c(value.B(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 31, value.B());
            }
            if (value.z() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 33, Integer.valueOf(value.z()));
            }
            if (value.T()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 35, Boolean.valueOf(value.T()));
            }
            if (value.W()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.W()));
            }
            if (value.H()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 41, Boolean.valueOf(value.H()));
            }
            if (value.L0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 42, Boolean.valueOf(value.L0()));
            }
            if (value.J0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 44, Boolean.valueOf(value.J0()));
            }
            if (value.H0() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 45, Integer.valueOf(value.H0()));
            }
            if (value.m()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 48, Boolean.valueOf(value.m()));
            }
            if (value.q()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 49, Boolean.valueOf(value.q()));
            }
            if (value.s() != f.Unavailable) {
                f.ADAPTER.encodeWithTag(writer, 50, value.s());
            }
            if (!(value.l0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 51, Float.valueOf(value.l0()));
            }
            if (!(value.n0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 52, Float.valueOf(value.n0()));
            }
            if (!(value.p0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 53, Float.valueOf(value.p0()));
            }
            if (!(value.r0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 54, Float.valueOf(value.r0()));
            }
            if (value.P()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 56, Boolean.valueOf(value.P()));
            }
            if (value.R()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 57, Boolean.valueOf(value.R()));
            }
            if (value.Z()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 62, Boolean.valueOf(value.Z()));
            }
            if (value.b0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 63, Boolean.valueOf(value.b0()));
            }
            if (value.d0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 64, Boolean.valueOf(value.d0()));
            }
            if (value.f0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 65, Boolean.valueOf(value.f0()));
            }
            if (value.x0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 66, Boolean.valueOf(value.x0()));
            }
            if (value.z0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 67, Boolean.valueOf(value.z0()));
            }
            if (value.B0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 68, Boolean.valueOf(value.B0()));
            }
            if (value.D0()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 69, Boolean.valueOf(value.D0()));
            }
            if (!(value.t0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 70, Float.valueOf(value.t0()));
            }
            if (!(value.v0() == BitmapDescriptorFactory.HUE_RED)) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 71, Float.valueOf(value.v0()));
            }
            if (value.h() != null) {
                b.f39446c.encodeWithTag(writer, 34, value.h());
            }
            if (value.c() != null) {
                i.f39454e.encodeWithTag(writer, 37, value.c());
            }
            if (value.U() != null) {
                s.f39250n.encodeWithTag(writer, 38, value.U());
            }
            if (value.D() != null) {
                r.f39247c.encodeWithTag(writer, 39, value.D());
            }
            if (value.X() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 43, value.X());
            }
            if (value.i() != null) {
                c.f39449c.encodeWithTag(writer, 46, value.i());
            }
            if (value.g() != null) {
                a.f39433m.encodeWithTag(writer, 47, value.g());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 55, value.w());
            if (value.g0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 58, value.g0());
            }
            if (value.h0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 59, value.h0());
            }
            if (value.i0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 60, value.i0());
            }
            if (value.j0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 61, value.j0());
            }
            if (value.C() != null) {
                q.f39233n.encodeWithTag(writer, 72, value.C());
            }
            if (value.x() != null) {
                h.f39452b.encodeWithTag(writer, 74, value.x());
            }
            protoAdapter.encodeWithTag(writer, 101, value.e());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(writer, 108, value.n());
            protoAdapter2.encodeWithTag(writer, 109, value.t());
            protoAdapter2.encodeWithTag(writer, 110, value.j());
            protoAdapter2.encodeWithTag(writer, 118, value.E0());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(writer, 120, value.E());
            protoAdapter3.encodeWithTag(writer, 121, value.M());
            protoAdapter3.encodeWithTag(writer, 122, value.K());
            protoAdapter2.encodeWithTag(writer, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, value.A());
            protoAdapter.encodeWithTag(writer, 133, value.y());
            protoAdapter3.encodeWithTag(writer, 135, value.S());
            protoAdapter3.encodeWithTag(writer, 136, value.V());
            protoAdapter3.encodeWithTag(writer, 141, value.G());
            protoAdapter3.encodeWithTag(writer, 142, value.K0());
            protoAdapter3.encodeWithTag(writer, 144, value.I0());
            protoAdapter.encodeWithTag(writer, 145, value.G0());
            protoAdapter3.encodeWithTag(writer, 148, value.l());
            protoAdapter3.encodeWithTag(writer, 149, value.p());
            f.ADAPTER.encodeWithTag(writer, 150, value.r());
            ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
            protoAdapter4.encodeWithTag(writer, 151, value.k0());
            protoAdapter4.encodeWithTag(writer, 152, value.m0());
            protoAdapter4.encodeWithTag(writer, 153, value.o0());
            protoAdapter4.encodeWithTag(writer, 154, value.q0());
            protoAdapter3.encodeWithTag(writer, 156, value.O());
            protoAdapter3.encodeWithTag(writer, 157, value.Q());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, value.Y());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, value.a0());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, value.c0());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, value.e0());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, value.w0());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, value.y0());
            protoAdapter3.encodeWithTag(writer, 168, value.A0());
            protoAdapter3.encodeWithTag(writer, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, value.C0());
            protoAdapter4.encodeWithTag(writer, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, value.s0());
            protoAdapter4.encodeWithTag(writer, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, value.u0());
            protoAdapter3.encodeWithTag(writer, 73, value.d());
            protoAdapter3.encodeWithTag(writer, 75, value.v());
            protoAdapter3.encodeWithTag(writer, 76, value.I());
            protoAdapter3.encodeWithTag(writer, 77, value.J());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.f() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.f()));
            }
            if (!kotlin.jvm.internal.s.c(value.o(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(8, value.o());
            }
            if (!kotlin.jvm.internal.s.c(value.u(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.u());
            }
            if (!kotlin.jvm.internal.s.c(value.k(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(10, value.k());
            }
            if (!kotlin.jvm.internal.s.c(value.F0(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(18, value.F0());
            }
            if (value.F()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.F()));
            }
            if (value.N()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.N()));
            }
            if (value.L()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.L()));
            }
            if (!kotlin.jvm.internal.s.c(value.B(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(31, value.B());
            }
            if (value.z() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(33, Integer.valueOf(value.z()));
            }
            if (value.T()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(35, Boolean.valueOf(value.T()));
            }
            if (value.W()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.W()));
            }
            if (value.H()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.H()));
            }
            if (value.L0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.L0()));
            }
            if (value.J0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(44, Boolean.valueOf(value.J0()));
            }
            if (value.H0() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(45, Integer.valueOf(value.H0()));
            }
            if (value.m()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(48, Boolean.valueOf(value.m()));
            }
            if (value.q()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(49, Boolean.valueOf(value.q()));
            }
            if (value.s() != f.Unavailable) {
                z11 += f.ADAPTER.encodedSizeWithTag(50, value.s());
            }
            if (!(value.l0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(51, Float.valueOf(value.l0()));
            }
            if (!(value.n0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(52, Float.valueOf(value.n0()));
            }
            if (!(value.p0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(53, Float.valueOf(value.p0()));
            }
            if (!(value.r0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(54, Float.valueOf(value.r0()));
            }
            if (value.P()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(56, Boolean.valueOf(value.P()));
            }
            if (value.R()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(57, Boolean.valueOf(value.R()));
            }
            if (value.Z()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(62, Boolean.valueOf(value.Z()));
            }
            if (value.b0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(63, Boolean.valueOf(value.b0()));
            }
            if (value.d0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(64, Boolean.valueOf(value.d0()));
            }
            if (value.f0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(65, Boolean.valueOf(value.f0()));
            }
            if (value.x0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(66, Boolean.valueOf(value.x0()));
            }
            if (value.z0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(67, Boolean.valueOf(value.z0()));
            }
            if (value.B0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(68, Boolean.valueOf(value.B0()));
            }
            if (value.D0()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(69, Boolean.valueOf(value.D0()));
            }
            if (!(value.t0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(70, Float.valueOf(value.t0()));
            }
            if (!(value.v0() == BitmapDescriptorFactory.HUE_RED)) {
                z11 += ProtoAdapter.FLOAT.encodedSizeWithTag(71, Float.valueOf(value.v0()));
            }
            if (value.h() != null) {
                z11 += b.f39446c.encodedSizeWithTag(34, value.h());
            }
            if (value.c() != null) {
                z11 += i.f39454e.encodedSizeWithTag(37, value.c());
            }
            if (value.U() != null) {
                z11 += s.f39250n.encodedSizeWithTag(38, value.U());
            }
            if (value.D() != null) {
                z11 += r.f39247c.encodedSizeWithTag(39, value.D());
            }
            if (value.X() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(43, value.X());
            }
            if (value.i() != null) {
                z11 += c.f39449c.encodedSizeWithTag(46, value.i());
            }
            if (value.g() != null) {
                z11 += a.f39433m.encodedSizeWithTag(47, value.g());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = z11 + protoAdapter.asPacked().encodedSizeWithTag(55, value.w());
            if (value.g0() != null) {
                encodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(58, value.g0());
            }
            if (value.h0() != null) {
                encodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(59, value.h0());
            }
            if (value.i0() != null) {
                encodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(60, value.i0());
            }
            if (value.j0() != null) {
                encodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(61, value.j0());
            }
            if (value.C() != null) {
                encodedSizeWithTag += q.f39233n.encodedSizeWithTag(72, value.C());
            }
            if (value.x() != null) {
                encodedSizeWithTag += h.f39452b.encodedSizeWithTag(74, value.x());
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(101, value.e());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(108, value.n()) + protoAdapter2.encodedSizeWithTag(109, value.t()) + protoAdapter2.encodedSizeWithTag(110, value.j()) + protoAdapter2.encodedSizeWithTag(118, value.E0());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int encodedSizeWithTag4 = encodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(120, value.E()) + protoAdapter3.encodedSizeWithTag(121, value.M()) + protoAdapter3.encodedSizeWithTag(122, value.K()) + protoAdapter2.encodedSizeWithTag(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, value.A()) + protoAdapter.encodedSizeWithTag(133, value.y()) + protoAdapter3.encodedSizeWithTag(135, value.S()) + protoAdapter3.encodedSizeWithTag(136, value.V()) + protoAdapter3.encodedSizeWithTag(141, value.G()) + protoAdapter3.encodedSizeWithTag(142, value.K0()) + protoAdapter3.encodedSizeWithTag(144, value.I0()) + protoAdapter.encodedSizeWithTag(145, value.G0()) + protoAdapter3.encodedSizeWithTag(148, value.l()) + protoAdapter3.encodedSizeWithTag(149, value.p()) + f.ADAPTER.encodedSizeWithTag(150, value.r());
            ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
            return encodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(151, value.k0()) + protoAdapter4.encodedSizeWithTag(152, value.m0()) + protoAdapter4.encodedSizeWithTag(153, value.o0()) + protoAdapter4.encodedSizeWithTag(154, value.q0()) + protoAdapter3.encodedSizeWithTag(156, value.O()) + protoAdapter3.encodedSizeWithTag(157, value.Q()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, value.Y()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, value.a0()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, value.c0()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, value.e0()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, value.w0()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, value.y0()) + protoAdapter3.encodedSizeWithTag(168, value.A0()) + protoAdapter3.encodedSizeWithTag(CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, value.C0()) + protoAdapter4.encodedSizeWithTag(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, value.s0()) + protoAdapter4.encodedSizeWithTag(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, value.u0()) + protoAdapter3.encodedSizeWithTag(73, value.d()) + protoAdapter3.encodedSizeWithTag(75, value.v()) + protoAdapter3.encodedSizeWithTag(76, value.I()) + protoAdapter3.encodedSizeWithTag(77, value.J());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public v redact(v value) {
            kotlin.jvm.internal.s.g(value, "value");
            b h11 = value.h();
            b redact = h11 == null ? null : b.f39446c.redact(h11);
            i c11 = value.c();
            i redact2 = c11 == null ? null : i.f39454e.redact(c11);
            s U = value.U();
            s redact3 = U == null ? null : s.f39250n.redact(U);
            r D = value.D();
            r redact4 = D == null ? null : r.f39247c.redact(D);
            Instant X = value.X();
            Instant redact5 = X == null ? null : ProtoAdapter.INSTANT.redact(X);
            c i11 = value.i();
            c redact6 = i11 == null ? null : c.f39449c.redact(i11);
            a g11 = value.g();
            a redact7 = g11 == null ? null : a.f39433m.redact(g11);
            Instant g02 = value.g0();
            Instant redact8 = g02 == null ? null : ProtoAdapter.INSTANT.redact(g02);
            Instant h02 = value.h0();
            Instant redact9 = h02 == null ? null : ProtoAdapter.INSTANT.redact(h02);
            Instant i02 = value.i0();
            Instant redact10 = i02 == null ? null : ProtoAdapter.INSTANT.redact(i02);
            Instant j02 = value.j0();
            Instant redact11 = j02 == null ? null : ProtoAdapter.INSTANT.redact(j02);
            q C = value.C();
            q redact12 = C == null ? null : q.f39233n.redact(C);
            h x11 = value.x();
            return v.b(value, 0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, redact, redact2, redact3, redact4, redact5, redact6, redact7, null, redact8, redact9, redact10, redact11, redact12, x11 == null ? null : h.f39452b.redact(x11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.i.f42656d, -1, -130041, 16777215, null);
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
        Unavailable(0),
        Available(1),
        Recording(2),
        Saved(3),
        Streaming(4),
        NoSpace(5);
        
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
                                if (i11 != 4) {
                                    if (i11 != 5) {
                                        return null;
                                    }
                                    return f.NoSpace;
                                }
                                return f.Streaming;
                            }
                            return f.Saved;
                        }
                        return f.Recording;
                    }
                    return f.Available;
                }
                return f.Unavailable;
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
    public enum g implements com.squareup.wire.p {
        MOBILE_APP_FEATURE_ACTIVE(0),
        MOBILE_APP_FEATURE_CLIMATE_KEEPER(1),
        MOBILE_APP_FEATURE_UNLOCK_STOP_CHARGE(2),
        MOBILE_APP_FEATURE_SET_RATE_TARIFF(3),
        MOBILE_APP_FEATURE_GET_RATE_TARIFF(4),
        MOBILE_APP_FEATURE_DRIVENOTE(5),
        MOBILE_APP_FEATURE_CLIMATE_KEEPER_OVERRIDE(6),
        MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST(7),
        MOBILE_APP_FEATURE_SENTRY_CAM_FLASH_LIGHTS(8),
        MOBILE_APP_FEATURE_BOOMBOX(9),
        MOBILE_APP_FEATURE_DOOR_UNLATCH(10),
        MOBILE_APP_FEATURE_SEAT_HEATERS_INSTALLED(11),
        MOBILE_APP_FEATURE_LAST_SEEN_TPMS(12),
        MOBILE_APP_FEATURE_UI_CHARGE_PORT(13),
        MOBILE_APP_FEATURE_MONITOR_AND_CHARGE_ROLES(14),
        MOBILE_APP_FEATURE_PROTO_FLOATS(15),
        MOBILE_APP_FEATURE_BLUETOOTH_PAIRING(16),
        MOBILE_APP_FEATURE_HMAC_AUTHENTICATION(17),
        MOBILE_APP_COP_USER_SET_TEMP(18),
        MOBILE_APP_FEATURE_MEDIA_DETAILS(19),
        MOBILE_APP_FEATURE_RESPONSE_CACHE(20),
        MOBILE_APP_FEATURE_SCC(22),
        MOBILE_APP_FEATURE_SENTRY_CAM_WITH_DOG_MODE(23),
        MOBILE_APP_FEATURE_AUTO_STEERING_WHEEL_HEAT(24),
        MOBILE_APP_FEATURE_MANAGED_CHARGING(25),
        MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND_DECPRECATED(26),
        MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND(27),
        MOBILE_APP_FEATURE_SEND_NAVIGATION_ROUTE(28),
        MOBILE_APP_FEATURE_RED_BRAKE_CALIPER_FIX(29),
        MOBILE_APP_FEATURE_PIN_TO_DRIVE(30),
        MOBILE_APP_COP_NOT_RUNNING_REASON(31),
        MOBILE_APP_FEATURE_SET_VEHICLE_NAME(32),
        MOBILE_APP_FEATURE_VEHICLE_DATA_PII_V2(33),
        MOBILE_APP_FEATURE_BOOMBOX_V2(34);
        
        public static final ProtoAdapter<g> ADAPTER;
        public static final b Companion = new b(null);
        private final int value;

        /* loaded from: classes6.dex */
        public static final class a extends com.squareup.wire.a<g> {
            a(n00.d<g> dVar, com.squareup.wire.o oVar, g gVar) {
                super(dVar, oVar, gVar);
            }

            @Override // com.squareup.wire.a
            /* renamed from: f */
            public g d(int i11) {
                return g.Companion.a(i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(int i11) {
                switch (i11) {
                    case 0:
                        return g.MOBILE_APP_FEATURE_ACTIVE;
                    case 1:
                        return g.MOBILE_APP_FEATURE_CLIMATE_KEEPER;
                    case 2:
                        return g.MOBILE_APP_FEATURE_UNLOCK_STOP_CHARGE;
                    case 3:
                        return g.MOBILE_APP_FEATURE_SET_RATE_TARIFF;
                    case 4:
                        return g.MOBILE_APP_FEATURE_GET_RATE_TARIFF;
                    case 5:
                        return g.MOBILE_APP_FEATURE_DRIVENOTE;
                    case 6:
                        return g.MOBILE_APP_FEATURE_CLIMATE_KEEPER_OVERRIDE;
                    case 7:
                        return g.MOBILE_APP_FEATURE_SIGNED_VIDEO_REQUEST;
                    case 8:
                        return g.MOBILE_APP_FEATURE_SENTRY_CAM_FLASH_LIGHTS;
                    case 9:
                        return g.MOBILE_APP_FEATURE_BOOMBOX;
                    case 10:
                        return g.MOBILE_APP_FEATURE_DOOR_UNLATCH;
                    case 11:
                        return g.MOBILE_APP_FEATURE_SEAT_HEATERS_INSTALLED;
                    case 12:
                        return g.MOBILE_APP_FEATURE_LAST_SEEN_TPMS;
                    case 13:
                        return g.MOBILE_APP_FEATURE_UI_CHARGE_PORT;
                    case 14:
                        return g.MOBILE_APP_FEATURE_MONITOR_AND_CHARGE_ROLES;
                    case 15:
                        return g.MOBILE_APP_FEATURE_PROTO_FLOATS;
                    case 16:
                        return g.MOBILE_APP_FEATURE_BLUETOOTH_PAIRING;
                    case 17:
                        return g.MOBILE_APP_FEATURE_HMAC_AUTHENTICATION;
                    case 18:
                        return g.MOBILE_APP_COP_USER_SET_TEMP;
                    case 19:
                        return g.MOBILE_APP_FEATURE_MEDIA_DETAILS;
                    case 20:
                        return g.MOBILE_APP_FEATURE_RESPONSE_CACHE;
                    case 21:
                    default:
                        return null;
                    case 22:
                        return g.MOBILE_APP_FEATURE_SCC;
                    case 23:
                        return g.MOBILE_APP_FEATURE_SENTRY_CAM_WITH_DOG_MODE;
                    case 24:
                        return g.MOBILE_APP_FEATURE_AUTO_STEERING_WHEEL_HEAT;
                    case 25:
                        return g.MOBILE_APP_FEATURE_MANAGED_CHARGING;
                    case 26:
                        return g.MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND_DECPRECATED;
                    case 27:
                        return g.MOBILE_APP_FEATURE_TOGGLE_REMOTE_SERVICE_ACCESS_COMMAND;
                    case 28:
                        return g.MOBILE_APP_FEATURE_SEND_NAVIGATION_ROUTE;
                    case 29:
                        return g.MOBILE_APP_FEATURE_RED_BRAKE_CALIPER_FIX;
                    case 30:
                        return g.MOBILE_APP_FEATURE_PIN_TO_DRIVE;
                    case 31:
                        return g.MOBILE_APP_COP_NOT_RUNNING_REASON;
                    case 32:
                        return g.MOBILE_APP_FEATURE_SET_VEHICLE_NAME;
                    case 33:
                        return g.MOBILE_APP_FEATURE_VEHICLE_DATA_PII_V2;
                    case 34:
                        return g.MOBILE_APP_FEATURE_BOOMBOX_V2;
                }
            }
        }

        static {
            g gVar;
            ADAPTER = new a(m0.b(g.class), com.squareup.wire.o.PROTO_3, gVar);
        }

        g(int i11) {
            this.value = i11;
        }

        public static final g fromValue(int i11) {
            return Companion.a(i11);
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends com.squareup.wire.f {

        /* renamed from: b */
        public static final ProtoAdapter<h> f39452b;
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)

        /* renamed from: a */
        private final boolean f39453a;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<h> {
            a(com.squareup.wire.b bVar, n00.d<h> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState.GuestMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: a */
            public h decode(com.squareup.wire.k reader) {
                kotlin.jvm.internal.s.g(reader, "reader");
                long d11 = reader.d();
                boolean z11 = false;
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new h(z11, reader.e(d11));
                    }
                    if (g11 == 1) {
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.m(g11);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: b */
            public void encode(com.squareup.wire.l writer, h value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                if (value.c()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.c()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(h value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                return value.c() ? z11 + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.c())) : z11;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public h redact(h value) {
                kotlin.jvm.internal.s.g(value, "value");
                return h.b(value, false, okio.i.f42656d, 1, null);
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
            f39452b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(h.class), com.squareup.wire.o.PROTO_3);
        }

        public h() {
            this(false, null, 3, null);
        }

        public /* synthetic */ h(boolean z11, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
        }

        public static /* synthetic */ h b(h hVar, boolean z11, okio.i iVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = hVar.f39453a;
            }
            if ((i11 & 2) != 0) {
                iVar = hVar.unknownFields();
            }
            return hVar.a(z11, iVar);
        }

        public final h a(boolean z11, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new h(z11, unknownFields);
        }

        public final boolean c() {
            return this.f39453a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), hVar.unknownFields()) && this.f39453a == hVar.f39453a;
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39453a);
                this.hashCode = hashCode;
                return hashCode;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m811newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            boolean z11 = this.f39453a;
            arrayList.add("GuestModeActive=" + z11);
            l02 = e0.l0(arrayList, ", ", "GuestMode{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m811newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z11, okio.i unknownFields) {
            super(f39452b, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39453a = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends com.squareup.wire.f {

        /* renamed from: e */
        public static final ProtoAdapter<i> f39454e;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)

        /* renamed from: a */
        private final kt.u f39455a;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)

        /* renamed from: b */
        private final kt.u f39456b;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)

        /* renamed from: c */
        private final kt.u f39457c;
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)

        /* renamed from: d */
        private final kt.u f39458d;

        /* loaded from: classes6.dex */
        public static final class a extends ProtoAdapter<i> {
            a(com.squareup.wire.b bVar, n00.d<i> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState.SpoilerState", oVar, (Object) null);
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
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new i(uVar, uVar2, uVar3, uVar4, reader.e(d11));
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
            public void encode(com.squareup.wire.l writer, i value) {
                kotlin.jvm.internal.s.g(writer, "writer");
                kotlin.jvm.internal.s.g(value, "value");
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                protoAdapter.encodeWithTag(writer, 1, value.e());
                protoAdapter.encodeWithTag(writer, 2, value.d());
                protoAdapter.encodeWithTag(writer, 3, value.b());
                protoAdapter.encodeWithTag(writer, 4, value.c());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: c */
            public int encodedSize(i value) {
                kotlin.jvm.internal.s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<kt.u> protoAdapter = kt.u.f35845a;
                return z11 + protoAdapter.encodedSizeWithTag(1, value.e()) + protoAdapter.encodedSizeWithTag(2, value.d()) + protoAdapter.encodedSizeWithTag(3, value.b()) + protoAdapter.encodedSizeWithTag(4, value.c());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* renamed from: d */
            public i redact(i value) {
                kotlin.jvm.internal.s.g(value, "value");
                kt.u e11 = value.e();
                kt.u redact = e11 == null ? null : kt.u.f35845a.redact(e11);
                kt.u d11 = value.d();
                kt.u redact2 = d11 == null ? null : kt.u.f35845a.redact(d11);
                kt.u b11 = value.b();
                kt.u redact3 = b11 == null ? null : kt.u.f35845a.redact(b11);
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
            f39454e = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(i.class), com.squareup.wire.o.PROTO_3);
        }

        public i() {
            this(null, null, null, null, null, 31, null);
        }

        public /* synthetic */ i(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : uVar, (i11 & 2) != 0 ? null : uVar2, (i11 & 4) != 0 ? null : uVar3, (i11 & 8) == 0 ? uVar4 : null, (i11 & 16) != 0 ? okio.i.f42656d : iVar);
        }

        public final i a(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            return new i(uVar, uVar2, uVar3, uVar4, unknownFields);
        }

        public final kt.u b() {
            return this.f39457c;
        }

        public final kt.u c() {
            return this.f39458d;
        }

        public final kt.u d() {
            return this.f39456b;
        }

        public final kt.u e() {
            return this.f39455a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return kotlin.jvm.internal.s.c(unknownFields(), iVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f39455a, iVar.f39455a) && kotlin.jvm.internal.s.c(this.f39456b, iVar.f39456b) && kotlin.jvm.internal.s.c(this.f39457c, iVar.f39457c) && kotlin.jvm.internal.s.c(this.f39458d, iVar.f39458d);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 == 0) {
                int hashCode = unknownFields().hashCode() * 37;
                kt.u uVar = this.f39455a;
                int hashCode2 = (hashCode + (uVar != null ? uVar.hashCode() : 0)) * 37;
                kt.u uVar2 = this.f39456b;
                int hashCode3 = (hashCode2 + (uVar2 != null ? uVar2.hashCode() : 0)) * 37;
                kt.u uVar3 = this.f39457c;
                int hashCode4 = (hashCode3 + (uVar3 != null ? uVar3.hashCode() : 0)) * 37;
                kt.u uVar4 = this.f39458d;
                int hashCode5 = hashCode4 + (uVar4 != null ? uVar4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }
            return i11;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ f.a newBuilder() {
            return (f.a) m812newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            String l02;
            ArrayList arrayList = new ArrayList();
            kt.u uVar = this.f39455a;
            if (uVar != null) {
                arrayList.add("Unknown=" + uVar);
            }
            kt.u uVar2 = this.f39456b;
            if (uVar2 != null) {
                arrayList.add("Retracted=" + uVar2);
            }
            kt.u uVar3 = this.f39457c;
            if (uVar3 != null) {
                arrayList.add("Extended=" + uVar3);
            }
            kt.u uVar4 = this.f39458d;
            if (uVar4 != null) {
                arrayList.add("Fault=" + uVar4);
            }
            l02 = e0.l0(arrayList, ", ", "SpoilerState{", "}", 0, null, null, 56, null);
            return l02;
        }

        /* renamed from: newBuilder */
        public /* synthetic */ Void m812newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kt.u uVar, kt.u uVar2, kt.u uVar3, kt.u uVar4, okio.i unknownFields) {
            super(f39454e, unknownFields);
            kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
            this.f39455a = uVar;
            this.f39456b = uVar2;
            this.f39457c = uVar3;
            this.f39458d = uVar4;
            if (!(mr.d.e(uVar, uVar2, uVar3, uVar4, new Object[0]) <= 1)) {
                throw new IllegalArgumentException("At most one of Unknown, Retracted, Extended, Fault may be non-null".toString());
            }
        }
    }

    static {
        new e(null);
        U3 = new d(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(v.class), com.squareup.wire.o.PROTO_3);
    }

    public v() {
        this(0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 33554431, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ v(int r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, boolean r93, boolean r94, boolean r95, java.lang.String r96, int r97, boolean r98, boolean r99, boolean r100, boolean r101, boolean r102, int r103, boolean r104, boolean r105, mt.v.f r106, float r107, float r108, float r109, float r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, boolean r118, boolean r119, boolean r120, float r121, float r122, mt.v.b r123, mt.v.i r124, mt.s r125, mt.r r126, j$.time.Instant r127, mt.v.c r128, mt.v.a r129, java.util.List r130, j$.time.Instant r131, j$.time.Instant r132, j$.time.Instant r133, j$.time.Instant r134, mt.q r135, mt.v.h r136, java.lang.Integer r137, java.lang.String r138, java.lang.String r139, java.lang.String r140, java.lang.String r141, java.lang.Boolean r142, java.lang.Boolean r143, java.lang.Boolean r144, java.lang.String r145, java.lang.Integer r146, java.lang.Boolean r147, java.lang.Boolean r148, java.lang.Boolean r149, java.lang.Boolean r150, java.lang.Boolean r151, java.lang.Integer r152, java.lang.Boolean r153, java.lang.Boolean r154, mt.v.f r155, java.lang.Float r156, java.lang.Float r157, java.lang.Float r158, java.lang.Float r159, java.lang.Boolean r160, java.lang.Boolean r161, java.lang.Boolean r162, java.lang.Boolean r163, java.lang.Boolean r164, java.lang.Boolean r165, java.lang.Boolean r166, java.lang.Boolean r167, java.lang.Boolean r168, java.lang.Boolean r169, java.lang.Float r170, java.lang.Float r171, java.lang.Boolean r172, java.lang.Boolean r173, java.lang.Boolean r174, java.lang.Boolean r175, okio.i r176, int r177, int r178, int r179, kotlin.jvm.internal.DefaultConstructorMarker r180) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.v.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, int, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, mt.v$f, float, float, float, float, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, float, float, mt.v$b, mt.v$i, mt.s, mt.r, j$.time.Instant, mt.v$c, mt.v$a, java.util.List, j$.time.Instant, j$.time.Instant, j$.time.Instant, j$.time.Instant, mt.q, mt.v$h, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, mt.v$f, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, okio.i, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v b(v vVar, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, String str5, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, f fVar, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, b bVar, i iVar, s sVar, r rVar, Instant instant, c cVar, a aVar, List list, Instant instant2, Instant instant3, Instant instant4, Instant instant5, q qVar, h hVar, Integer num, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, f fVar2, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, okio.i iVar2, int i14, int i15, int i16, Object obj) {
        return vVar.a((i14 & 1) != 0 ? vVar.f39383a : i11, (i14 & 2) != 0 ? vVar.f39384b : str, (i14 & 4) != 0 ? vVar.f39387c : str2, (i14 & 8) != 0 ? vVar.f39388d : str3, (i14 & 16) != 0 ? vVar.f39389e : str4, (i14 & 32) != 0 ? vVar.f39390f : z11, (i14 & 64) != 0 ? vVar.f39391g : z12, (i14 & 128) != 0 ? vVar.f39394h : z13, (i14 & 256) != 0 ? vVar.f39395i : str5, (i14 & 512) != 0 ? vVar.f39397j : i12, (i14 & 1024) != 0 ? vVar.f39399k : z14, (i14 & 2048) != 0 ? vVar.f39401l : z15, (i14 & 4096) != 0 ? vVar.f39403m : z16, (i14 & PKIFailureInfo.certRevoked) != 0 ? vVar.f39405n : z17, (i14 & 16384) != 0 ? vVar.f39407o : z18, (i14 & 32768) != 0 ? vVar.f39409p : i13, (i14 & 65536) != 0 ? vVar.f39413q : z19, (i14 & 131072) != 0 ? vVar.f39417t : z21, (i14 & 262144) != 0 ? vVar.f39421w : fVar, (i14 & PKIFailureInfo.signerNotTrusted) != 0 ? vVar.f39423x : f11, (i14 & PKIFailureInfo.badCertTemplate) != 0 ? vVar.f39427y : f12, (i14 & PKIFailureInfo.badSenderNonce) != 0 ? vVar.f39431z : f13, (i14 & 4194304) != 0 ? vVar.A : f14, (i14 & 8388608) != 0 ? vVar.B : z22, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? vVar.C : z23, (i14 & 33554432) != 0 ? vVar.E : z24, (i14 & 67108864) != 0 ? vVar.F : z25, (i14 & 134217728) != 0 ? vVar.G : z26, (i14 & 268435456) != 0 ? vVar.H : z27, (i14 & PKIFailureInfo.duplicateCertReq) != 0 ? vVar.K : z28, (i14 & 1073741824) != 0 ? vVar.L : z29, (i14 & Integer.MIN_VALUE) != 0 ? vVar.O : z31, (i15 & 1) != 0 ? vVar.P : z32, (i15 & 2) != 0 ? vVar.Q : f15, (i15 & 4) != 0 ? vVar.R : f16, (i15 & 8) != 0 ? vVar.T : bVar, (i15 & 16) != 0 ? vVar.Y : iVar, (i15 & 32) != 0 ? vVar.f39385b1 : sVar, (i15 & 64) != 0 ? vVar.f39392g1 : rVar, (i15 & 128) != 0 ? vVar.f39410p1 : instant, (i15 & 256) != 0 ? vVar.f39424x1 : cVar, (i15 & 512) != 0 ? vVar.f39428y1 : aVar, (i15 & 1024) != 0 ? vVar.T3 : list, (i15 & 2048) != 0 ? vVar.Q1 : instant2, (i15 & 4096) != 0 ? vVar.V1 : instant3, (i15 & PKIFailureInfo.certRevoked) != 0 ? vVar.f39386b2 : instant4, (i15 & 16384) != 0 ? vVar.f39393g2 : instant5, (i15 & 32768) != 0 ? vVar.f39411p2 : qVar, (i15 & 65536) != 0 ? vVar.f39425x2 : hVar, (i15 & 131072) != 0 ? vVar.f39429y2 : num, (i15 & 262144) != 0 ? vVar.Q2 : str6, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? vVar.f39396i3 : str7, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? vVar.f39398j3 : str8, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? vVar.f39400k3 : str9, (i15 & 4194304) != 0 ? vVar.f39402l3 : bool, (i15 & 8388608) != 0 ? vVar.f39404m3 : bool2, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? vVar.f39406n3 : bool3, (i15 & 33554432) != 0 ? vVar.f39408o3 : str10, (i15 & 67108864) != 0 ? vVar.f39412p3 : num2, (i15 & 134217728) != 0 ? vVar.f39414q3 : bool4, (i15 & 268435456) != 0 ? vVar.f39415r3 : bool5, (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? vVar.f39416s3 : bool6, (i15 & 1073741824) != 0 ? vVar.f39418t3 : bool7, (i15 & Integer.MIN_VALUE) != 0 ? vVar.f39419u3 : bool8, (i16 & 1) != 0 ? vVar.f39420v3 : num3, (i16 & 2) != 0 ? vVar.f39422w3 : bool9, (i16 & 4) != 0 ? vVar.f39426x3 : bool10, (i16 & 8) != 0 ? vVar.f39430y3 : fVar2, (i16 & 16) != 0 ? vVar.f39432z3 : f17, (i16 & 32) != 0 ? vVar.A3 : f18, (i16 & 64) != 0 ? vVar.B3 : f19, (i16 & 128) != 0 ? vVar.C3 : f21, (i16 & 256) != 0 ? vVar.D3 : bool11, (i16 & 512) != 0 ? vVar.E3 : bool12, (i16 & 1024) != 0 ? vVar.F3 : bool13, (i16 & 2048) != 0 ? vVar.G3 : bool14, (i16 & 4096) != 0 ? vVar.H3 : bool15, (i16 & PKIFailureInfo.certRevoked) != 0 ? vVar.I3 : bool16, (i16 & 16384) != 0 ? vVar.J3 : bool17, (i16 & 32768) != 0 ? vVar.K3 : bool18, (i16 & 65536) != 0 ? vVar.L3 : bool19, (i16 & 131072) != 0 ? vVar.M3 : bool20, (i16 & 262144) != 0 ? vVar.N3 : f22, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? vVar.O3 : f23, (i16 & PKIFailureInfo.badCertTemplate) != 0 ? vVar.P3 : bool21, (i16 & PKIFailureInfo.badSenderNonce) != 0 ? vVar.Q3 : bool22, (i16 & 4194304) != 0 ? vVar.R3 : bool23, (i16 & 8388608) != 0 ? vVar.S3 : bool24, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? vVar.unknownFields() : iVar2);
    }

    public final String A() {
        return this.f39408o3;
    }

    public final Boolean A0() {
        return this.L3;
    }

    public final String B() {
        return this.f39395i;
    }

    public final boolean B0() {
        return this.O;
    }

    public final q C() {
        return this.f39411p2;
    }

    public final Boolean C0() {
        return this.M3;
    }

    public final r D() {
        return this.f39392g1;
    }

    public final boolean D0() {
        return this.P;
    }

    public final Boolean E() {
        return this.f39402l3;
    }

    public final String E0() {
        return this.f39400k3;
    }

    public final boolean F() {
        return this.f39390f;
    }

    public final String F0() {
        return this.f39389e;
    }

    public final Boolean G() {
        return this.f39416s3;
    }

    public final Integer G0() {
        return this.f39420v3;
    }

    public final boolean H() {
        return this.f39403m;
    }

    public final int H0() {
        return this.f39409p;
    }

    public final Boolean I() {
        return this.R3;
    }

    public final Boolean I0() {
        return this.f39419u3;
    }

    public final Boolean J() {
        return this.S3;
    }

    public final boolean J0() {
        return this.f39407o;
    }

    public final Boolean K() {
        return this.f39406n3;
    }

    public final Boolean K0() {
        return this.f39418t3;
    }

    public final boolean L() {
        return this.f39394h;
    }

    public final boolean L0() {
        return this.f39405n;
    }

    public final Boolean M() {
        return this.f39404m3;
    }

    public final boolean N() {
        return this.f39391g;
    }

    public final Boolean O() {
        return this.D3;
    }

    public final boolean P() {
        return this.B;
    }

    public final Boolean Q() {
        return this.E3;
    }

    public final boolean R() {
        return this.C;
    }

    public final Boolean S() {
        return this.f39414q3;
    }

    public final boolean T() {
        return this.f39399k;
    }

    public final s U() {
        return this.f39385b1;
    }

    public final Boolean V() {
        return this.f39415r3;
    }

    public final boolean W() {
        return this.f39401l;
    }

    public final Instant X() {
        return this.f39410p1;
    }

    public final Boolean Y() {
        return this.F3;
    }

    public final boolean Z() {
        return this.E;
    }

    public final v a(int i11, String car_version_OBSOLETE, String detailed_version_OBSOLETE, String autopilot_hash_OBSOLETE, String vehicle_name_OBSOLETE, boolean z11, boolean z12, boolean z13, String last_autopark_error_OBSOLETE, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, f dashcam_state_OBSOLETE, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, b bVar, i iVar, s sVar, r rVar, Instant instant, c cVar, a aVar, List<Integer> feature_bitmask, Instant instant2, Instant instant3, Instant instant4, Instant instant5, q qVar, h hVar, Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, f fVar, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(car_version_OBSOLETE, "car_version_OBSOLETE");
        kotlin.jvm.internal.s.g(detailed_version_OBSOLETE, "detailed_version_OBSOLETE");
        kotlin.jvm.internal.s.g(autopilot_hash_OBSOLETE, "autopilot_hash_OBSOLETE");
        kotlin.jvm.internal.s.g(vehicle_name_OBSOLETE, "vehicle_name_OBSOLETE");
        kotlin.jvm.internal.s.g(last_autopark_error_OBSOLETE, "last_autopark_error_OBSOLETE");
        kotlin.jvm.internal.s.g(dashcam_state_OBSOLETE, "dashcam_state_OBSOLETE");
        kotlin.jvm.internal.s.g(feature_bitmask, "feature_bitmask");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new v(i11, car_version_OBSOLETE, detailed_version_OBSOLETE, autopilot_hash_OBSOLETE, vehicle_name_OBSOLETE, z11, z12, z13, last_autopark_error_OBSOLETE, i12, z14, z15, z16, z17, z18, i13, z19, z21, dashcam_state_OBSOLETE, f11, f12, f13, f14, z22, z23, z24, z25, z26, z27, z28, z29, z31, z32, f15, f16, bVar, iVar, sVar, rVar, instant, cVar, aVar, feature_bitmask, instant2, instant3, instant4, instant5, qVar, hVar, num, str, str2, str3, str4, bool, bool2, bool3, str5, num2, bool4, bool5, bool6, bool7, bool8, num3, bool9, bool10, fVar, f17, f18, f19, f21, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, f22, f23, bool21, bool22, bool23, bool24, unknownFields);
    }

    public final Boolean a0() {
        return this.G3;
    }

    public final boolean b0() {
        return this.F;
    }

    public final i c() {
        return this.Y;
    }

    public final Boolean c0() {
        return this.H3;
    }

    public final Boolean d() {
        return this.P3;
    }

    public final boolean d0() {
        return this.G;
    }

    public final Integer e() {
        return this.f39429y2;
    }

    public final Boolean e0() {
        return this.I3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (kotlin.jvm.internal.s.c(unknownFields(), vVar.unknownFields()) && this.f39383a == vVar.f39383a && kotlin.jvm.internal.s.c(this.f39384b, vVar.f39384b) && kotlin.jvm.internal.s.c(this.f39387c, vVar.f39387c) && kotlin.jvm.internal.s.c(this.f39388d, vVar.f39388d) && kotlin.jvm.internal.s.c(this.f39389e, vVar.f39389e) && this.f39390f == vVar.f39390f && this.f39391g == vVar.f39391g && this.f39394h == vVar.f39394h && kotlin.jvm.internal.s.c(this.f39395i, vVar.f39395i) && this.f39397j == vVar.f39397j && this.f39399k == vVar.f39399k && this.f39401l == vVar.f39401l && this.f39403m == vVar.f39403m && this.f39405n == vVar.f39405n && this.f39407o == vVar.f39407o && this.f39409p == vVar.f39409p && this.f39413q == vVar.f39413q && this.f39417t == vVar.f39417t && this.f39421w == vVar.f39421w) {
                if (this.f39423x == vVar.f39423x) {
                    if (this.f39427y == vVar.f39427y) {
                        if (this.f39431z == vVar.f39431z) {
                            if ((this.A == vVar.A) && this.B == vVar.B && this.C == vVar.C && this.E == vVar.E && this.F == vVar.F && this.G == vVar.G && this.H == vVar.H && this.K == vVar.K && this.L == vVar.L && this.O == vVar.O && this.P == vVar.P) {
                                if (this.Q == vVar.Q) {
                                    return ((this.R > vVar.R ? 1 : (this.R == vVar.R ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.T, vVar.T) && kotlin.jvm.internal.s.c(this.Y, vVar.Y) && kotlin.jvm.internal.s.c(this.f39385b1, vVar.f39385b1) && kotlin.jvm.internal.s.c(this.f39392g1, vVar.f39392g1) && kotlin.jvm.internal.s.c(this.f39410p1, vVar.f39410p1) && kotlin.jvm.internal.s.c(this.f39424x1, vVar.f39424x1) && kotlin.jvm.internal.s.c(this.f39428y1, vVar.f39428y1) && kotlin.jvm.internal.s.c(this.T3, vVar.T3) && kotlin.jvm.internal.s.c(this.Q1, vVar.Q1) && kotlin.jvm.internal.s.c(this.V1, vVar.V1) && kotlin.jvm.internal.s.c(this.f39386b2, vVar.f39386b2) && kotlin.jvm.internal.s.c(this.f39393g2, vVar.f39393g2) && kotlin.jvm.internal.s.c(this.f39411p2, vVar.f39411p2) && kotlin.jvm.internal.s.c(this.f39425x2, vVar.f39425x2) && kotlin.jvm.internal.s.c(this.f39429y2, vVar.f39429y2) && kotlin.jvm.internal.s.c(this.Q2, vVar.Q2) && kotlin.jvm.internal.s.c(this.f39396i3, vVar.f39396i3) && kotlin.jvm.internal.s.c(this.f39398j3, vVar.f39398j3) && kotlin.jvm.internal.s.c(this.f39400k3, vVar.f39400k3) && kotlin.jvm.internal.s.c(this.f39402l3, vVar.f39402l3) && kotlin.jvm.internal.s.c(this.f39404m3, vVar.f39404m3) && kotlin.jvm.internal.s.c(this.f39406n3, vVar.f39406n3) && kotlin.jvm.internal.s.c(this.f39408o3, vVar.f39408o3) && kotlin.jvm.internal.s.c(this.f39412p3, vVar.f39412p3) && kotlin.jvm.internal.s.c(this.f39414q3, vVar.f39414q3) && kotlin.jvm.internal.s.c(this.f39415r3, vVar.f39415r3) && kotlin.jvm.internal.s.c(this.f39416s3, vVar.f39416s3) && kotlin.jvm.internal.s.c(this.f39418t3, vVar.f39418t3) && kotlin.jvm.internal.s.c(this.f39419u3, vVar.f39419u3) && kotlin.jvm.internal.s.c(this.f39420v3, vVar.f39420v3) && kotlin.jvm.internal.s.c(this.f39422w3, vVar.f39422w3) && kotlin.jvm.internal.s.c(this.f39426x3, vVar.f39426x3) && this.f39430y3 == vVar.f39430y3 && kotlin.jvm.internal.s.b(this.f39432z3, vVar.f39432z3) && kotlin.jvm.internal.s.b(this.A3, vVar.A3) && kotlin.jvm.internal.s.b(this.B3, vVar.B3) && kotlin.jvm.internal.s.b(this.C3, vVar.C3) && kotlin.jvm.internal.s.c(this.D3, vVar.D3) && kotlin.jvm.internal.s.c(this.E3, vVar.E3) && kotlin.jvm.internal.s.c(this.F3, vVar.F3) && kotlin.jvm.internal.s.c(this.G3, vVar.G3) && kotlin.jvm.internal.s.c(this.H3, vVar.H3) && kotlin.jvm.internal.s.c(this.I3, vVar.I3) && kotlin.jvm.internal.s.c(this.J3, vVar.J3) && kotlin.jvm.internal.s.c(this.K3, vVar.K3) && kotlin.jvm.internal.s.c(this.L3, vVar.L3) && kotlin.jvm.internal.s.c(this.M3, vVar.M3) && kotlin.jvm.internal.s.b(this.N3, vVar.N3) && kotlin.jvm.internal.s.b(this.O3, vVar.O3) && kotlin.jvm.internal.s.c(this.P3, vVar.P3) && kotlin.jvm.internal.s.c(this.Q3, vVar.Q3) && kotlin.jvm.internal.s.c(this.R3, vVar.R3) && kotlin.jvm.internal.s.c(this.S3, vVar.S3);
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

    public final int f() {
        return this.f39383a;
    }

    public final boolean f0() {
        return this.H;
    }

    public final a g() {
        return this.f39428y1;
    }

    public final Instant g0() {
        return this.Q1;
    }

    public final b h() {
        return this.T;
    }

    public final Instant h0() {
        return this.V1;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f39383a)) * 37) + this.f39384b.hashCode()) * 37) + this.f39387c.hashCode()) * 37) + this.f39388d.hashCode()) * 37) + this.f39389e.hashCode()) * 37) + Boolean.hashCode(this.f39390f)) * 37) + Boolean.hashCode(this.f39391g)) * 37) + Boolean.hashCode(this.f39394h)) * 37) + this.f39395i.hashCode()) * 37) + Integer.hashCode(this.f39397j)) * 37) + Boolean.hashCode(this.f39399k)) * 37) + Boolean.hashCode(this.f39401l)) * 37) + Boolean.hashCode(this.f39403m)) * 37) + Boolean.hashCode(this.f39405n)) * 37) + Boolean.hashCode(this.f39407o)) * 37) + Integer.hashCode(this.f39409p)) * 37) + Boolean.hashCode(this.f39413q)) * 37) + Boolean.hashCode(this.f39417t)) * 37) + this.f39421w.hashCode()) * 37) + Float.hashCode(this.f39423x)) * 37) + Float.hashCode(this.f39427y)) * 37) + Float.hashCode(this.f39431z)) * 37) + Float.hashCode(this.A)) * 37) + Boolean.hashCode(this.B)) * 37) + Boolean.hashCode(this.C)) * 37) + Boolean.hashCode(this.E)) * 37) + Boolean.hashCode(this.F)) * 37) + Boolean.hashCode(this.G)) * 37) + Boolean.hashCode(this.H)) * 37) + Boolean.hashCode(this.K)) * 37) + Boolean.hashCode(this.L)) * 37) + Boolean.hashCode(this.O)) * 37) + Boolean.hashCode(this.P)) * 37) + Float.hashCode(this.Q)) * 37) + Float.hashCode(this.R)) * 37;
            b bVar = this.T;
            int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
            i iVar = this.Y;
            int hashCode3 = (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 37;
            s sVar = this.f39385b1;
            int hashCode4 = (hashCode3 + (sVar != null ? sVar.hashCode() : 0)) * 37;
            r rVar = this.f39392g1;
            int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 37;
            Instant instant = this.f39410p1;
            int hashCode6 = (hashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
            c cVar = this.f39424x1;
            int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 37;
            a aVar = this.f39428y1;
            int hashCode8 = (((hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 37) + this.T3.hashCode()) * 37;
            Instant instant2 = this.Q1;
            int hashCode9 = (hashCode8 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
            Instant instant3 = this.V1;
            int hashCode10 = (hashCode9 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
            Instant instant4 = this.f39386b2;
            int hashCode11 = (hashCode10 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
            Instant instant5 = this.f39393g2;
            int hashCode12 = (hashCode11 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
            q qVar = this.f39411p2;
            int hashCode13 = (hashCode12 + (qVar != null ? qVar.hashCode() : 0)) * 37;
            h hVar = this.f39425x2;
            int hashCode14 = (hashCode13 + (hVar != null ? hVar.hashCode() : 0)) * 37;
            Integer num = this.f39429y2;
            int hashCode15 = (hashCode14 + (num != null ? num.hashCode() : 0)) * 37;
            String str = this.Q2;
            int hashCode16 = (hashCode15 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.f39396i3;
            int hashCode17 = (hashCode16 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.f39398j3;
            int hashCode18 = (hashCode17 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.f39400k3;
            int hashCode19 = (hashCode18 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.f39402l3;
            int hashCode20 = (hashCode19 + (bool != null ? bool.hashCode() : 0)) * 37;
            Boolean bool2 = this.f39404m3;
            int hashCode21 = (hashCode20 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
            Boolean bool3 = this.f39406n3;
            int hashCode22 = (hashCode21 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
            String str5 = this.f39408o3;
            int hashCode23 = (hashCode22 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Integer num2 = this.f39412p3;
            int hashCode24 = (hashCode23 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool4 = this.f39414q3;
            int hashCode25 = (hashCode24 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
            Boolean bool5 = this.f39415r3;
            int hashCode26 = (hashCode25 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
            Boolean bool6 = this.f39416s3;
            int hashCode27 = (hashCode26 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
            Boolean bool7 = this.f39418t3;
            int hashCode28 = (hashCode27 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
            Boolean bool8 = this.f39419u3;
            int hashCode29 = (hashCode28 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
            Integer num3 = this.f39420v3;
            int hashCode30 = (hashCode29 + (num3 != null ? num3.hashCode() : 0)) * 37;
            Boolean bool9 = this.f39422w3;
            int hashCode31 = (hashCode30 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
            Boolean bool10 = this.f39426x3;
            int hashCode32 = (hashCode31 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
            f fVar = this.f39430y3;
            int hashCode33 = (hashCode32 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            Float f11 = this.f39432z3;
            int hashCode34 = (hashCode33 + (f11 != null ? f11.hashCode() : 0)) * 37;
            Float f12 = this.A3;
            int hashCode35 = (hashCode34 + (f12 != null ? f12.hashCode() : 0)) * 37;
            Float f13 = this.B3;
            int hashCode36 = (hashCode35 + (f13 != null ? f13.hashCode() : 0)) * 37;
            Float f14 = this.C3;
            int hashCode37 = (hashCode36 + (f14 != null ? f14.hashCode() : 0)) * 37;
            Boolean bool11 = this.D3;
            int hashCode38 = (hashCode37 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
            Boolean bool12 = this.E3;
            int hashCode39 = (hashCode38 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
            Boolean bool13 = this.F3;
            int hashCode40 = (hashCode39 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
            Boolean bool14 = this.G3;
            int hashCode41 = (hashCode40 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
            Boolean bool15 = this.H3;
            int hashCode42 = (hashCode41 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
            Boolean bool16 = this.I3;
            int hashCode43 = (hashCode42 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
            Boolean bool17 = this.J3;
            int hashCode44 = (hashCode43 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
            Boolean bool18 = this.K3;
            int hashCode45 = (hashCode44 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
            Boolean bool19 = this.L3;
            int hashCode46 = (hashCode45 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
            Boolean bool20 = this.M3;
            int hashCode47 = (hashCode46 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
            Float f15 = this.N3;
            int hashCode48 = (hashCode47 + (f15 != null ? f15.hashCode() : 0)) * 37;
            Float f16 = this.O3;
            int hashCode49 = (hashCode48 + (f16 != null ? f16.hashCode() : 0)) * 37;
            Boolean bool21 = this.P3;
            int hashCode50 = (hashCode49 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
            Boolean bool22 = this.Q3;
            int hashCode51 = (hashCode50 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
            Boolean bool23 = this.R3;
            int hashCode52 = (hashCode51 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
            Boolean bool24 = this.S3;
            int hashCode53 = hashCode52 + (bool24 != null ? bool24.hashCode() : 0);
            this.hashCode = hashCode53;
            return hashCode53;
        }
        return i11;
    }

    public final c i() {
        return this.f39424x1;
    }

    public final Instant i0() {
        return this.f39386b2;
    }

    public final String j() {
        return this.f39398j3;
    }

    public final Instant j0() {
        return this.f39393g2;
    }

    public final String k() {
        return this.f39388d;
    }

    public final Float k0() {
        return this.f39432z3;
    }

    public final Boolean l() {
        return this.f39422w3;
    }

    public final float l0() {
        return this.f39423x;
    }

    public final boolean m() {
        return this.f39413q;
    }

    public final Float m0() {
        return this.A3;
    }

    public final String n() {
        return this.Q2;
    }

    public final float n0() {
        return this.f39427y;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m807newBuilder();
    }

    public final String o() {
        return this.f39384b;
    }

    public final Float o0() {
        return this.B3;
    }

    public final Boolean p() {
        return this.f39426x3;
    }

    public final float p0() {
        return this.f39431z;
    }

    public final boolean q() {
        return this.f39417t;
    }

    public final Float q0() {
        return this.C3;
    }

    public final f r() {
        return this.f39430y3;
    }

    public final float r0() {
        return this.A;
    }

    public final f s() {
        return this.f39421w;
    }

    public final Float s0() {
        return this.N3;
    }

    public final String t() {
        return this.f39396i3;
    }

    public final float t0() {
        return this.Q;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f39383a;
        arrayList.add("api_version_OBSOLETE=" + i11);
        String i12 = mr.d.i(this.f39384b);
        arrayList.add("car_version_OBSOLETE=" + i12);
        String i13 = mr.d.i(this.f39387c);
        arrayList.add("detailed_version_OBSOLETE=" + i13);
        String i14 = mr.d.i(this.f39388d);
        arrayList.add("autopilot_hash_OBSOLETE=" + i14);
        String i15 = mr.d.i(this.f39389e);
        arrayList.add("vehicle_name_OBSOLETE=" + i15);
        boolean z11 = this.f39390f;
        arrayList.add("notifications_supported_OBSOLETE=" + z11);
        boolean z12 = this.f39391g;
        arrayList.add("remote_start_supported_OBSOLETE=" + z12);
        boolean z13 = this.f39394h;
        arrayList.add("remote_start_enabled_OBSOLETE=" + z13);
        String i16 = mr.d.i(this.f39395i);
        arrayList.add("last_autopark_error_OBSOLETE=" + i16);
        int i17 = this.f39397j;
        arrayList.add("homelink_device_count_OBSOLETE=" + i17);
        boolean z14 = this.f39399k;
        arrayList.add("smart_summon_available_OBSOLETE=" + z14);
        boolean z15 = this.f39401l;
        arrayList.add("summon_standby_mode_enabled_OBSOLETE=" + z15);
        boolean z16 = this.f39403m;
        arrayList.add("patsy_mode_OBSOLETE=" + z16);
        boolean z17 = this.f39405n;
        arrayList.add("webcam_available_OBSOLETE=" + z17);
        boolean z18 = this.f39407o;
        arrayList.add("vehicle_self_test_requested_OBSOLETE=" + z18);
        int i18 = this.f39409p;
        arrayList.add("vehicle_self_test_progress_OBSOLETE=" + i18);
        boolean z19 = this.f39413q;
        arrayList.add("calendar_supported_OBSOLETE=" + z19);
        boolean z21 = this.f39417t;
        arrayList.add("dashcam_clip_save_available_OBSOLETE=" + z21);
        f fVar = this.f39421w;
        arrayList.add("dashcam_state_OBSOLETE=" + fVar);
        float f11 = this.f39423x;
        arrayList.add("tpms_pressure_fl_OBSOLETE=" + f11);
        float f12 = this.f39427y;
        arrayList.add("tpms_pressure_fr_OBSOLETE=" + f12);
        float f13 = this.f39431z;
        arrayList.add("tpms_pressure_rl_OBSOLETE=" + f13);
        float f14 = this.A;
        arrayList.add("tpms_pressure_rr_OBSOLETE=" + f14);
        boolean z22 = this.B;
        arrayList.add("service_mode_OBSOLETE=" + z22);
        boolean z23 = this.C;
        arrayList.add("service_mode_plus_OBSOLETE=" + z23);
        boolean z24 = this.E;
        arrayList.add("tpms_hard_warning_fl_OBSOLETE=" + z24);
        boolean z25 = this.F;
        arrayList.add("tpms_hard_warning_fr_OBSOLETE=" + z25);
        boolean z26 = this.G;
        arrayList.add("tpms_hard_warning_rl_OBSOLETE=" + z26);
        boolean z27 = this.H;
        arrayList.add("tpms_hard_warning_rr_OBSOLETE=" + z27);
        boolean z28 = this.K;
        arrayList.add("tpms_soft_warning_fl_OBSOLETE=" + z28);
        boolean z29 = this.L;
        arrayList.add("tpms_soft_warning_fr_OBSOLETE=" + z29);
        boolean z31 = this.O;
        arrayList.add("tpms_soft_warning_rl_OBSOLETE=" + z31);
        boolean z32 = this.P;
        arrayList.add("tpms_soft_warning_rr_OBSOLETE=" + z32);
        float f15 = this.Q;
        arrayList.add("tpms_rcp_front_value_OBSOLETE=" + f15);
        float f16 = this.R;
        arrayList.add("tpms_rcp_rear_value_OBSOLETE=" + f16);
        b bVar = this.T;
        if (bVar != null) {
            arrayList.add("autopark_style=" + bVar);
        }
        i iVar = this.Y;
        if (iVar != null) {
            arrayList.add("active_spoiler_state=" + iVar);
        }
        s sVar = this.f39385b1;
        if (sVar != null) {
            arrayList.add("software_update=" + sVar);
        }
        r rVar = this.f39392g1;
        if (rVar != null) {
            arrayList.add("media_state=" + rVar);
        }
        Instant instant = this.f39410p1;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        c cVar = this.f39424x1;
        if (cVar != null) {
            arrayList.add("autopark_version=" + cVar);
        }
        a aVar = this.f39428y1;
        if (aVar != null) {
            arrayList.add("autopark_state=" + aVar);
        }
        if (!this.T3.isEmpty()) {
            List<Integer> list = this.T3;
            arrayList.add("feature_bitmask=" + list);
        }
        Instant instant2 = this.Q1;
        if (instant2 != null) {
            arrayList.add("tpms_last_seen_pressure_time_fl=" + instant2);
        }
        Instant instant3 = this.V1;
        if (instant3 != null) {
            arrayList.add("tpms_last_seen_pressure_time_fr=" + instant3);
        }
        Instant instant4 = this.f39386b2;
        if (instant4 != null) {
            arrayList.add("tpms_last_seen_pressure_time_rl=" + instant4);
        }
        Instant instant5 = this.f39393g2;
        if (instant5 != null) {
            arrayList.add("tpms_last_seen_pressure_time_rr=" + instant5);
        }
        q qVar = this.f39411p2;
        if (qVar != null) {
            arrayList.add("mediaInfo=" + qVar);
        }
        h hVar = this.f39425x2;
        if (hVar != null) {
            arrayList.add("guestMode=" + hVar);
        }
        Integer num = this.f39429y2;
        if (num != null) {
            arrayList.add("api_version=" + num);
        }
        String str = this.Q2;
        if (str != null) {
            String i19 = mr.d.i(str);
            arrayList.add("car_version=" + i19);
        }
        String str2 = this.f39396i3;
        if (str2 != null) {
            String i21 = mr.d.i(str2);
            arrayList.add("detailed_version=" + i21);
        }
        String str3 = this.f39398j3;
        if (str3 != null) {
            String i22 = mr.d.i(str3);
            arrayList.add("autopilot_hash=" + i22);
        }
        String str4 = this.f39400k3;
        if (str4 != null) {
            String i23 = mr.d.i(str4);
            arrayList.add("vehicle_name=" + i23);
        }
        Boolean bool = this.f39402l3;
        if (bool != null) {
            arrayList.add("notifications_supported=" + bool);
        }
        Boolean bool2 = this.f39404m3;
        if (bool2 != null) {
            arrayList.add("remote_start_supported=" + bool2);
        }
        Boolean bool3 = this.f39406n3;
        if (bool3 != null) {
            arrayList.add("remote_start_enabled=" + bool3);
        }
        String str5 = this.f39408o3;
        if (str5 != null) {
            String i24 = mr.d.i(str5);
            arrayList.add("last_autopark_error=" + i24);
        }
        Integer num2 = this.f39412p3;
        if (num2 != null) {
            arrayList.add("homelink_device_count=" + num2);
        }
        Boolean bool4 = this.f39414q3;
        if (bool4 != null) {
            arrayList.add("smart_summon_available=" + bool4);
        }
        Boolean bool5 = this.f39415r3;
        if (bool5 != null) {
            arrayList.add("summon_standby_mode_enabled=" + bool5);
        }
        Boolean bool6 = this.f39416s3;
        if (bool6 != null) {
            arrayList.add("patsy_mode=" + bool6);
        }
        Boolean bool7 = this.f39418t3;
        if (bool7 != null) {
            arrayList.add("webcam_available=" + bool7);
        }
        Boolean bool8 = this.f39419u3;
        if (bool8 != null) {
            arrayList.add("vehicle_self_test_requested=" + bool8);
        }
        Integer num3 = this.f39420v3;
        if (num3 != null) {
            arrayList.add("vehicle_self_test_progress=" + num3);
        }
        Boolean bool9 = this.f39422w3;
        if (bool9 != null) {
            arrayList.add("calendar_supported=" + bool9);
        }
        Boolean bool10 = this.f39426x3;
        if (bool10 != null) {
            arrayList.add("dashcam_clip_save_available=" + bool10);
        }
        f fVar2 = this.f39430y3;
        if (fVar2 != null) {
            arrayList.add("dashcam_state=" + fVar2);
        }
        Float f17 = this.f39432z3;
        if (f17 != null) {
            arrayList.add("tpms_pressure_fl=" + f17);
        }
        Float f18 = this.A3;
        if (f18 != null) {
            arrayList.add("tpms_pressure_fr=" + f18);
        }
        Float f19 = this.B3;
        if (f19 != null) {
            arrayList.add("tpms_pressure_rl=" + f19);
        }
        Float f21 = this.C3;
        if (f21 != null) {
            arrayList.add("tpms_pressure_rr=" + f21);
        }
        Boolean bool11 = this.D3;
        if (bool11 != null) {
            arrayList.add("service_mode=" + bool11);
        }
        Boolean bool12 = this.E3;
        if (bool12 != null) {
            arrayList.add("service_mode_plus=" + bool12);
        }
        Boolean bool13 = this.F3;
        if (bool13 != null) {
            arrayList.add("tpms_hard_warning_fl=" + bool13);
        }
        Boolean bool14 = this.G3;
        if (bool14 != null) {
            arrayList.add("tpms_hard_warning_fr=" + bool14);
        }
        Boolean bool15 = this.H3;
        if (bool15 != null) {
            arrayList.add("tpms_hard_warning_rl=" + bool15);
        }
        Boolean bool16 = this.I3;
        if (bool16 != null) {
            arrayList.add("tpms_hard_warning_rr=" + bool16);
        }
        Boolean bool17 = this.J3;
        if (bool17 != null) {
            arrayList.add("tpms_soft_warning_fl=" + bool17);
        }
        Boolean bool18 = this.K3;
        if (bool18 != null) {
            arrayList.add("tpms_soft_warning_fr=" + bool18);
        }
        Boolean bool19 = this.L3;
        if (bool19 != null) {
            arrayList.add("tpms_soft_warning_rl=" + bool19);
        }
        Boolean bool20 = this.M3;
        if (bool20 != null) {
            arrayList.add("tpms_soft_warning_rr=" + bool20);
        }
        Float f22 = this.N3;
        if (f22 != null) {
            arrayList.add("tpms_rcp_front_value=" + f22);
        }
        Float f23 = this.O3;
        if (f23 != null) {
            arrayList.add("tpms_rcp_rear_value=" + f23);
        }
        Boolean bool21 = this.P3;
        if (bool21 != null) {
            arrayList.add("allow_authorized_mobile_devices_only=" + bool21);
        }
        Boolean bool22 = this.Q3;
        if (bool22 != null) {
            arrayList.add("drive_rail_on=" + bool22);
        }
        Boolean bool23 = this.R3;
        if (bool23 != null) {
            arrayList.add("pin_to_drive_enabled=" + bool23);
        }
        Boolean bool24 = this.S3;
        if (bool24 != null) {
            arrayList.add("pin_to_drive_pin_set=" + bool24);
        }
        l02 = e0.l0(arrayList, ", ", "VehicleState{", "}", 0, null, null, 56, null);
        return l02;
    }

    public final String u() {
        return this.f39387c;
    }

    public final Float u0() {
        return this.O3;
    }

    public final Boolean v() {
        return this.Q3;
    }

    public final float v0() {
        return this.R;
    }

    public final List<Integer> w() {
        return this.T3;
    }

    public final Boolean w0() {
        return this.J3;
    }

    public final h x() {
        return this.f39425x2;
    }

    public final boolean x0() {
        return this.K;
    }

    public final Integer y() {
        return this.f39412p3;
    }

    public final Boolean y0() {
        return this.K3;
    }

    public final int z() {
        return this.f39397j;
    }

    public final boolean z0() {
        return this.L;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m807newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i11, String car_version_OBSOLETE, String detailed_version_OBSOLETE, String autopilot_hash_OBSOLETE, String vehicle_name_OBSOLETE, boolean z11, boolean z12, boolean z13, String last_autopark_error_OBSOLETE, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, f dashcam_state_OBSOLETE, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, b bVar, i iVar, s sVar, r rVar, Instant instant, c cVar, a aVar, List<Integer> feature_bitmask, Instant instant2, Instant instant3, Instant instant4, Instant instant5, q qVar, h hVar, Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, f fVar, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, okio.i unknownFields) {
        super(U3, unknownFields);
        kotlin.jvm.internal.s.g(car_version_OBSOLETE, "car_version_OBSOLETE");
        kotlin.jvm.internal.s.g(detailed_version_OBSOLETE, "detailed_version_OBSOLETE");
        kotlin.jvm.internal.s.g(autopilot_hash_OBSOLETE, "autopilot_hash_OBSOLETE");
        kotlin.jvm.internal.s.g(vehicle_name_OBSOLETE, "vehicle_name_OBSOLETE");
        kotlin.jvm.internal.s.g(last_autopark_error_OBSOLETE, "last_autopark_error_OBSOLETE");
        kotlin.jvm.internal.s.g(dashcam_state_OBSOLETE, "dashcam_state_OBSOLETE");
        kotlin.jvm.internal.s.g(feature_bitmask, "feature_bitmask");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39383a = i11;
        this.f39384b = car_version_OBSOLETE;
        this.f39387c = detailed_version_OBSOLETE;
        this.f39388d = autopilot_hash_OBSOLETE;
        this.f39389e = vehicle_name_OBSOLETE;
        this.f39390f = z11;
        this.f39391g = z12;
        this.f39394h = z13;
        this.f39395i = last_autopark_error_OBSOLETE;
        this.f39397j = i12;
        this.f39399k = z14;
        this.f39401l = z15;
        this.f39403m = z16;
        this.f39405n = z17;
        this.f39407o = z18;
        this.f39409p = i13;
        this.f39413q = z19;
        this.f39417t = z21;
        this.f39421w = dashcam_state_OBSOLETE;
        this.f39423x = f11;
        this.f39427y = f12;
        this.f39431z = f13;
        this.A = f14;
        this.B = z22;
        this.C = z23;
        this.E = z24;
        this.F = z25;
        this.G = z26;
        this.H = z27;
        this.K = z28;
        this.L = z29;
        this.O = z31;
        this.P = z32;
        this.Q = f15;
        this.R = f16;
        this.T = bVar;
        this.Y = iVar;
        this.f39385b1 = sVar;
        this.f39392g1 = rVar;
        this.f39410p1 = instant;
        this.f39424x1 = cVar;
        this.f39428y1 = aVar;
        this.Q1 = instant2;
        this.V1 = instant3;
        this.f39386b2 = instant4;
        this.f39393g2 = instant5;
        this.f39411p2 = qVar;
        this.f39425x2 = hVar;
        this.f39429y2 = num;
        this.Q2 = str;
        this.f39396i3 = str2;
        this.f39398j3 = str3;
        this.f39400k3 = str4;
        this.f39402l3 = bool;
        this.f39404m3 = bool2;
        this.f39406n3 = bool3;
        this.f39408o3 = str5;
        this.f39412p3 = num2;
        this.f39414q3 = bool4;
        this.f39415r3 = bool5;
        this.f39416s3 = bool6;
        this.f39418t3 = bool7;
        this.f39419u3 = bool8;
        this.f39420v3 = num3;
        this.f39422w3 = bool9;
        this.f39426x3 = bool10;
        this.f39430y3 = fVar;
        this.f39432z3 = f17;
        this.A3 = f18;
        this.B3 = f19;
        this.C3 = f21;
        this.D3 = bool11;
        this.E3 = bool12;
        this.F3 = bool13;
        this.G3 = bool14;
        this.H3 = bool15;
        this.I3 = bool16;
        this.J3 = bool17;
        this.K3 = bool18;
        this.L3 = bool19;
        this.M3 = bool20;
        this.N3 = f22;
        this.O3 = f23;
        this.P3 = bool21;
        this.Q3 = bool22;
        this.R3 = bool23;
        this.S3 = bool24;
        this.T3 = mr.d.g("feature_bitmask", feature_bitmask);
    }
}