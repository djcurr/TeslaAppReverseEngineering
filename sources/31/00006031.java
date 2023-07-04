package com.tesla.data.oapi;

import android.content.Context;
import com.tesla.data.oapi.ShareCommandRequestBody;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f21736a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21737b;

    /* loaded from: classes6.dex */
    public static final class a extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActuateTrunkBody body) {
            super("ACTUATE_TRUNK", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ActuateTrunkBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ActuateTrunkBodyJsonAdapter(moshi).toJson(body)");
            this.f21738c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21738c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class a0 extends i {
        public a0() {
            super("MEDIA_TOGGLE_PLAYBACK", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class a1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(ActivateSpeedLimitBody body) {
            super("SPEED_LIMIT_DEACTIVATE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ActivateSpeedLimitBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ActivateSpeedLimitBodyJs…apter(moshi).toJson(body)");
            this.f21739c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21739c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21740c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AddManagedChargingSiteBody body) {
            super("ADD_MANAGED_CHARGING_SITE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new AddManagedChargingSiteBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "AddManagedChargingSiteBo…apter(moshi).toJson(body)");
            this.f21740c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21740c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(MediaVolumeBody body) {
            super("ADJUST_VOLUME", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new MediaVolumeBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "MediaVolumeBodyJsonAdapter(moshi).toJson(body)");
            this.f21741c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21741c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b1 extends i {
        public b1() {
            super("START_CHARGE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AutoSeatClimateBody body) {
            super("REMOTE_AUTO_SEAT_CLIMATE_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new AutoSeatClimateBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "AutoSeatClimateBodyJsonAdapter(moshi).toJson(body)");
            this.f21742c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21742c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c0 extends i {
        public c0() {
            super("MEDIA_VOLUME_DOWN", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21743c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(RemoteSteeringWheelHeaterBody body) {
            super("REMOTE_STEERING_WHEEL_HEATER_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new RemoteSteeringWheelHeaterBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "RemoteSteeringWheelHeate…apter(moshi).toJson(body)");
            this.f21743c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21743c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AutoStwHeatBody body) {
            super("REMOTE_AUTO_STEERING_WHEEL_HEAT_CLIMATE_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new AutoStwHeatBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "AutoStwHeatBodyJsonAdapter(moshi).toJson(body)");
            this.f21744c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21744c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d0 extends i {
        public d0() {
            super("MEDIA_VOLUME_UP", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d1 extends i {
        public d1() {
            super("STOP_CHARGE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21745c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BoomboxBody body) {
            super("REMOTE_BOOMBOX", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new BoomboxBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "BoomboxBodyJsonAdapter(moshi).toJson(body)");
            this.f21745c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21745c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e0 extends i {
        public e0() {
            super("NAVIGATION_ROUTE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21746c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(StwHeatLevelBody body) {
            super("REMOTE_STEERING_WHEEL_HEAT_LEVEL_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new StwHeatLevelBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "StwHeatLevelBodyJsonAdapter(moshi).toJson(body)");
            this.f21746c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21746c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21747c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CalendarSyncBody body) {
            super("CALENDAR_SYNC", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new CalendarSyncBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "CalendarSyncBodyJsonAdapter(moshi).toJson(body)");
            this.f21747c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21747c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(FetchNearbyChargingBody body) {
            super("NEARBY_CHARGING_SITES", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new FetchNearbyChargingBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "FetchNearbyChargingBodyJ…apter(moshi).toJson(body)");
            this.f21748c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21748c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class f1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(TakeDriveNoteBody body) {
            super("TAKE_DRIVENOTE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new TakeDriveNoteBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "TakeDriveNoteBodyJsonAdapter(moshi).toJson(body)");
            this.f21749c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21749c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends i {
        public g() {
            super("CANCEL_SOFTWARE_UPDATE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class g0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(RemoteSeatHeaterBody body) {
            super("REMOTE_SEAT_HEATER_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new RemoteSeatHeaterBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "RemoteSeatHeaterBodyJson…apter(moshi).toJson(body)");
            this.f21750c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21750c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class g1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(TriggerHomelinkBody body) {
            super("TRIGGER_HOMELINK", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new TriggerHomelinkBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "TriggerHomelinkBodyJsonAdapter(moshi).toJson(body)");
            this.f21751c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21751c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ChangeChargeLimitBody body) {
            super("CHANGE_CHARGE_LIMIT", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ChangeChargeLimitBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ChangeChargeLimitBodyJso…apter(moshi).toJson(body)");
            this.f21752c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21752c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class h0 extends i {
        public h0() {
            super("REMOTE_START", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class h1 extends i {
        public h1() {
            super("UNLOCK", null);
        }
    }

    /* renamed from: com.tesla.data.oapi.i$i  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0393i extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21753c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0393i(ChangeClimateTemperatureSettingBody body) {
            super("CHANGE_CLIMATE_TEMPERATURE_SETTING", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ChangeClimateTemperatureSettingBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ChangeClimateTemperature…apter(moshi).toJson(body)");
            this.f21753c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21753c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class i0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(RemoveManagedChargingSiteBody body) {
            super("REMOVE_MANAGED_CHARGING_SITE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new RemoveManagedChargingSiteBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "RemoveManagedChargingSit…apter(moshi).toJson(body)");
            this.f21754c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21754c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class i1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21755c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(UpdateChargeOnSolarFeatureRequestBody body) {
            super("UPDATE_CHARGE_ON_SOLAR_FEATURE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new UpdateChargeOnSolarFeatureRequestBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "UpdateChargeOnSolarFeatu…apter(moshi).toJson(body)");
            this.f21755c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21755c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ChangeSunroofStateBody body) {
            super("CHANGE_SUNROOF_STATE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ChangeSunroofStateBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ChangeSunroofStateBodyJs…apter(moshi).toJson(body)");
            this.f21756c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21756c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class j0 extends i {
        public j0() {
            super("RESET_VALET_PIN", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class j1 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21757c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j1(WindowControlBody body) {
            super("WINDOW_CONTROL", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new WindowControlBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "WindowControlBodyJsonAdapter(moshi).toJson(body)");
            this.f21757c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21757c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends i {
        public k() {
            super("CHARGE_PORT_DOOR_CLOSE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class k0 extends i {
        public k0() {
            super("SCHEDULE_SOFTWARE_UPDATE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends i {
        public l() {
            super("CHARGE_PORT_DOOR_OPEN", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class l0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(SetScheduledChargingBody body) {
            super("SCHEDULED_CHARGING", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetScheduledChargingBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetScheduledChargingBody…apter(moshi).toJson(body)");
            this.f21758c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21758c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class m extends i {
        public m() {
            super("CLIMATE_OFF", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class m0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(SetScheduledDepartureBody body) {
            super("SCHEDULED_DEPARTURE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetScheduledDepartureBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetScheduledDepartureBod…apter(moshi).toJson(body)");
            this.f21759c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21759c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class n extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ClimateOnBody body) {
            super("CLIMATE_ON", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ClimateOnBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ClimateOnBodyJsonAdapter(moshi).toJson(body)");
            this.f21760c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21760c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class n0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21761c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(SeatCoolingBody body) {
            super("REMOTE_SEAT_COOLING_REQUEST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SeatCoolingBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SeatCoolingBodyJsonAdapter(moshi).toJson(body)");
            this.f21761c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21761c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class o extends i {
        public o() {
            super("DASHCAM_SAVE_CLIP", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class o0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(SendGPSToVehicleBody body) {
            super("SEND_GPS_TO_VEHICLE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SendGPSToVehicleBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SendGPSToVehicleBodyJson…apter(moshi).toJson(body)");
            this.f21762c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21762c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class p extends i {
        public p() {
            super("FLASH_LIGHTS", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class p0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(NavigationSuperchargerRequestBody body) {
            super("SEND_SC_TO_VEHICLE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new NavigationSuperchargerRequestBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "NavigationSuperchargerRe…apter(moshi).toJson(body)");
            this.f21763c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21763c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class q extends i {
        public q() {
            super("GET_CHARGE_ON_SOLAR_FEATURE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class q0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final Locale f21764c;

        /* renamed from: d  reason: collision with root package name */
        private final String f21765d;

        /* renamed from: e  reason: collision with root package name */
        private final ShareCommandRequestBody.Value f21766e;

        /* renamed from: f  reason: collision with root package name */
        private final ShareCommandRequestBody f21767f;

        /* renamed from: g  reason: collision with root package name */
        private final String f21768g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String text, Context context) {
            super("SEND_TO_VEHICLE", null);
            kotlin.jvm.internal.s.g(text, "text");
            kotlin.jvm.internal.s.g(context, "context");
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            kotlin.jvm.internal.s.f(locale, "context.resources.configuration.locales.get(0)");
            this.f21764c = locale;
            String str = locale.getLanguage() + "-" + locale.getCountry();
            this.f21765d = str;
            ShareCommandRequestBody.Value value = new ShareCommandRequestBody.Value("text/plain", "android.intent.action.SEND", text);
            this.f21766e = value;
            ShareCommandRequestBody shareCommandRequestBody = new ShareCommandRequestBody("share_ext_content_raw", value, str, System.currentTimeMillis());
            this.f21767f = shareCommandRequestBody;
            String i11 = new ShareCommandRequestBodyJsonAdapter(c()).i(shareCommandRequestBody);
            kotlin.jvm.internal.s.f(i11, "ShareCommandRequestBodyJ…apter(moshi).toJson(body)");
            this.f21768g = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21768g;
        }
    }

    /* loaded from: classes6.dex */
    public static final class r extends i {
        public r() {
            super("GET_MANAGED_CHARGING_SITES", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class r0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(SetCabinOverheatProtectionBody body) {
            super("SET_CABIN_OVERHEAT_PROTECTION", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetCabinOverheatProtectionBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetCabinOverheatProtecti…apter(moshi).toJson(body)");
            this.f21769c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21769c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class s extends i {
        public s() {
            super("HONK_HORN", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class s0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21770c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(ChargingAmpsBody body) {
            super("CHARGING_AMPS", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ChargingAmpsBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ChargingAmpsBodyJsonAdapter(moshi).toJson(body)");
            this.f21770c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21770c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class t extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(HVACBioweaponModeBody body) {
            super("HVAC_BIOWEAPON_MODE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new HVACBioweaponModeBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "HVACBioweaponModeBodyJso…apter(moshi).toJson(body)");
            this.f21771c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21771c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class t0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(ClimateKeeperModeBody body) {
            super("SET_CLIMATE_KEEPER_MODE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ClimateKeeperModeBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ClimateKeeperModeBodyJso…apter(moshi).toJson(body)");
            this.f21772c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21772c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class u extends i {
        public u() {
            super("LOCK", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class u0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21773c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(SetCopTempBody body) {
            super("SET_COP_TEMP", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetCopTempBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetCopTempBodyJsonAdapter(moshi).toJson(body)");
            this.f21773c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21773c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class v extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(MaxDefrostBody body) {
            super("MAX_DEFROST", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new MaxDefrostBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "MaxDefrostBodyJsonAdapter(moshi).toJson(body)");
            this.f21774c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21774c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class v0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(SetSentryModeBody body) {
            super("SET_SENTRY_MODE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetSentryModeBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetSentryModeBodyJsonAdapter(moshi).toJson(body)");
            this.f21775c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21775c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class w extends i {
        public w() {
            super("MEDIA_NEXT_FAVORITE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class w0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(SpeedLimitSetLimitBody body) {
            super("SPEED_LIMIT_SET_LIMIT", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SpeedLimitSetLimitBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SpeedLimitSetLimitBodyJs…apter(moshi).toJson(body)");
            this.f21776c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21776c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class x extends i {
        public x() {
            super("MEDIA_NEXT_TRACK", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class x0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(SetValetModeBody body) {
            super("SET_VALET_MODE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new SetValetModeBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "SetValetModeBodyJsonAdapter(moshi).toJson(body)");
            this.f21777c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21777c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class y extends i {
        public y() {
            super("MEDIA_PREVIOUS_FAVORITE", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class y0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(ActivateSpeedLimitBody body) {
            super("SPEED_LIMIT_ACTIVATE", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ActivateSpeedLimitBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ActivateSpeedLimitBodyJs…apter(moshi).toJson(body)");
            this.f21778c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21778c;
        }
    }

    /* loaded from: classes6.dex */
    public static final class z extends i {
        public z() {
            super("MEDIA_PREVIOUS_TRACK", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class z0 extends i {

        /* renamed from: c  reason: collision with root package name */
        private final String f21779c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(ActivateSpeedLimitBody body) {
            super("SPEED_LIMIT_CLEAR_PIN", null);
            kotlin.jvm.internal.s.g(body, "body");
            String i11 = new ActivateSpeedLimitBodyJsonAdapter(c()).i(body);
            kotlin.jvm.internal.s.f(i11, "ActivateSpeedLimitBodyJs…apter(moshi).toJson(body)");
            this.f21779c = i11;
        }

        @Override // com.tesla.data.oapi.i
        public String b() {
            return this.f21779c;
        }
    }

    private i(String str) {
        this.f21736a = str;
    }

    public /* synthetic */ i(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f21736a;
    }

    public String b() {
        return this.f21737b;
    }

    public final com.squareup.moshi.p c() {
        return com.tesla.data.oapi.a.f21724a.a();
    }
}