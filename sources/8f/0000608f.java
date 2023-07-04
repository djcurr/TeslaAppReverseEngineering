package com.tesla.domain.model;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import expo.modules.contacts.EXColumns;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/domain/model/VehicleJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/Vehicle;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleJsonAdapter extends f<Vehicle> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21837a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f21838b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Integer> f21839c;

    /* renamed from: d  reason: collision with root package name */
    private final f<VehicleConfig> f21840d;

    /* renamed from: e  reason: collision with root package name */
    private final f<String> f21841e;

    /* renamed from: f  reason: collision with root package name */
    private final f<ChargeState> f21842f;

    /* renamed from: g  reason: collision with root package name */
    private final f<VehicleState> f21843g;

    /* renamed from: h  reason: collision with root package name */
    private final f<GuiSettings> f21844h;

    /* renamed from: i  reason: collision with root package name */
    private final f<DriveState> f21845i;

    /* renamed from: j  reason: collision with root package name */
    private final f<ClimateState> f21846j;

    /* renamed from: k  reason: collision with root package name */
    private final f<List<ReverseGeocodedObject>> f21847k;

    /* renamed from: l  reason: collision with root package name */
    private final f<Boolean> f21848l;

    public VehicleJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        Set<? extends Annotation> d15;
        Set<? extends Annotation> d16;
        Set<? extends Annotation> d17;
        Set<? extends Annotation> d18;
        Set<? extends Annotation> d19;
        Set<? extends Annotation> d21;
        Set<? extends Annotation> d22;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("vin", "id", "api_version", "vehicle_config", "snapshotConfigHash", EXColumns.DISPLAY_NAME, "charge_state", "vehicle_state", "gui_settings", "drive_state", "climate_state", "reverse_geocoded_object", "is_predelivery");
        s.f(a11, "of(\"vin\", \"id\", \"api_ver…bject\", \"is_predelivery\")");
        this.f21837a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "vin");
        s.f(f11, "moshi.adapter(String::cl… emptySet(),\n      \"vin\")");
        this.f21838b = f11;
        d12 = x0.d();
        f<Integer> f12 = moshi.f(Integer.class, d12, "apiVersion");
        s.f(f12, "moshi.adapter(Int::class…emptySet(), \"apiVersion\")");
        this.f21839c = f12;
        d13 = x0.d();
        f<VehicleConfig> f13 = moshi.f(VehicleConfig.class, d13, "config");
        s.f(f13, "moshi.adapter(VehicleCon…va, emptySet(), \"config\")");
        this.f21840d = f13;
        d14 = x0.d();
        f<String> f14 = moshi.f(String.class, d14, "snapshotConfigHash");
        s.f(f14, "moshi.adapter(String::cl…(), \"snapshotConfigHash\")");
        this.f21841e = f14;
        d15 = x0.d();
        f<ChargeState> f15 = moshi.f(ChargeState.class, d15, "chargeState");
        s.f(f15, "moshi.adapter(ChargeStat…mptySet(), \"chargeState\")");
        this.f21842f = f15;
        d16 = x0.d();
        f<VehicleState> f16 = moshi.f(VehicleState.class, d16, "vehicleState");
        s.f(f16, "moshi.adapter(VehicleSta…ptySet(), \"vehicleState\")");
        this.f21843g = f16;
        d17 = x0.d();
        f<GuiSettings> f17 = moshi.f(GuiSettings.class, d17, "guiSettings");
        s.f(f17, "moshi.adapter(GuiSetting…mptySet(), \"guiSettings\")");
        this.f21844h = f17;
        d18 = x0.d();
        f<DriveState> f18 = moshi.f(DriveState.class, d18, "driveState");
        s.f(f18, "moshi.adapter(DriveState…emptySet(), \"driveState\")");
        this.f21845i = f18;
        d19 = x0.d();
        f<ClimateState> f19 = moshi.f(ClimateState.class, d19, "climateState");
        s.f(f19, "moshi.adapter(ClimateSta…ptySet(), \"climateState\")");
        this.f21846j = f19;
        ParameterizedType k11 = r.k(List.class, ReverseGeocodedObject.class);
        d21 = x0.d();
        f<List<ReverseGeocodedObject>> f21 = moshi.f(k11, d21, "reverseGeocodedObject");
        s.f(f21, "moshi.adapter(Types.newP… \"reverseGeocodedObject\")");
        this.f21847k = f21;
        d22 = x0.d();
        f<Boolean> f22 = moshi.f(Boolean.class, d22, "isPreDelivery");
        s.f(f22, "moshi.adapter(Boolean::c…tySet(), \"isPreDelivery\")");
        this.f21848l = f22;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Vehicle b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        Integer num = null;
        VehicleConfig vehicleConfig = null;
        String str3 = null;
        String str4 = null;
        ChargeState chargeState = null;
        VehicleState vehicleState = null;
        GuiSettings guiSettings = null;
        DriveState driveState = null;
        ClimateState climateState = null;
        List<ReverseGeocodedObject> list = null;
        Boolean bool = null;
        while (true) {
            List<ReverseGeocodedObject> list2 = list;
            if (reader.p()) {
                switch (reader.G0(this.f21837a)) {
                    case -1:
                        reader.Q0();
                        reader.R0();
                        break;
                    case 0:
                        str = this.f21838b.b(reader);
                        if (str == null) {
                            JsonDataException v11 = b.v("vin", "vin", reader);
                            s.f(v11, "unexpectedNull(\"vin\", \"vin\", reader)");
                            throw v11;
                        }
                        break;
                    case 1:
                        str2 = this.f21838b.b(reader);
                        if (str2 == null) {
                            JsonDataException v12 = b.v("id", "id", reader);
                            s.f(v12, "unexpectedNull(\"id\", \"id\", reader)");
                            throw v12;
                        }
                        break;
                    case 2:
                        num = this.f21839c.b(reader);
                        break;
                    case 3:
                        vehicleConfig = this.f21840d.b(reader);
                        break;
                    case 4:
                        str3 = this.f21841e.b(reader);
                        break;
                    case 5:
                        str4 = this.f21841e.b(reader);
                        break;
                    case 6:
                        chargeState = this.f21842f.b(reader);
                        break;
                    case 7:
                        vehicleState = this.f21843g.b(reader);
                        break;
                    case 8:
                        guiSettings = this.f21844h.b(reader);
                        break;
                    case 9:
                        driveState = this.f21845i.b(reader);
                        break;
                    case 10:
                        climateState = this.f21846j.b(reader);
                        break;
                    case 11:
                        list = this.f21847k.b(reader);
                        continue;
                    case 12:
                        bool = this.f21848l.b(reader);
                        break;
                }
                list = list2;
            } else {
                reader.l();
                if (str == null) {
                    JsonDataException m11 = b.m("vin", "vin", reader);
                    s.f(m11, "missingProperty(\"vin\", \"vin\", reader)");
                    throw m11;
                } else if (str2 != null) {
                    return new Vehicle(str, str2, num, vehicleConfig, str3, str4, chargeState, vehicleState, guiSettings, driveState, climateState, list2, bool);
                } else {
                    JsonDataException m12 = b.m("id", "id", reader);
                    s.f(m12, "missingProperty(\"id\", \"id\", reader)");
                    throw m12;
                }
            }
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, Vehicle vehicle) {
        s.g(writer, "writer");
        Objects.requireNonNull(vehicle, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("vin");
        this.f21838b.j(writer, vehicle.getVin());
        writer.L("id");
        this.f21838b.j(writer, vehicle.getId());
        writer.L("api_version");
        this.f21839c.j(writer, vehicle.getApiVersion());
        writer.L("vehicle_config");
        this.f21840d.j(writer, vehicle.getConfig());
        writer.L("snapshotConfigHash");
        this.f21841e.j(writer, vehicle.getSnapshotConfigHash());
        writer.L(EXColumns.DISPLAY_NAME);
        this.f21841e.j(writer, vehicle.getDisplayName());
        writer.L("charge_state");
        this.f21842f.j(writer, vehicle.getChargeState());
        writer.L("vehicle_state");
        this.f21843g.j(writer, vehicle.getVehicleState());
        writer.L("gui_settings");
        this.f21844h.j(writer, vehicle.getGuiSettings());
        writer.L("drive_state");
        this.f21845i.j(writer, vehicle.getDriveState());
        writer.L("climate_state");
        this.f21846j.j(writer, vehicle.getClimateState());
        writer.L("reverse_geocoded_object");
        this.f21847k.j(writer, vehicle.getReverseGeocodedObject());
        writer.L("is_predelivery");
        this.f21848l.j(writer, vehicle.isPreDelivery());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Vehicle");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}