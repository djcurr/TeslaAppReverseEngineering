package com.tesla.domain.model;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.stripe.android.networking.FraudDetectionData;
import com.tesla.domain.model.adapter.ForceToInt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/tesla/domain/model/VehicleConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/VehicleConfig;", "", "nullableIntAtForceToIntAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleConfigJsonAdapter extends f<VehicleConfig> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21831a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Integer> f21832b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f21833c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Long> f21834d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Boolean> f21835e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Constructor<VehicleConfig> f21836f;
    @ForceToInt
    private final f<Integer> nullableIntAtForceToIntAdapter;

    public VehicleConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("key_version", "car_type", FraudDetectionData.KEY_TIMESTAMP, "motorized_charge_port", "plg", "sun_roof_installed");
        s.f(a11, "of(\"key_version\", \"car_t…g\", \"sun_roof_installed\")");
        this.f21831a = a11;
        d11 = x0.d();
        f<Integer> f11 = moshi.f(Integer.class, d11, "keyVersion");
        s.f(f11, "moshi.adapter(Int::class…emptySet(), \"keyVersion\")");
        this.f21832b = f11;
        d12 = x0.d();
        f<String> f12 = moshi.f(String.class, d12, "carType");
        s.f(f12, "moshi.adapter(String::cl…   emptySet(), \"carType\")");
        this.f21833c = f12;
        d13 = x0.d();
        f<Long> f13 = moshi.f(Long.class, d13, FraudDetectionData.KEY_TIMESTAMP);
        s.f(f13, "moshi.adapter(Long::clas… emptySet(), \"timestamp\")");
        this.f21834d = f13;
        d14 = x0.d();
        f<Boolean> f14 = moshi.f(Boolean.class, d14, "motorizedChargePort");
        s.f(f14, "moshi.adapter(Boolean::c…), \"motorizedChargePort\")");
        this.f21835e = f14;
        f<Integer> f15 = moshi.f(Integer.class, r.f(VehicleConfigJsonAdapter.class, "nullableIntAtForceToIntAdapter"), "sunRoofInstalled");
        s.f(f15, "moshi.adapter(Int::class…er\"), \"sunRoofInstalled\")");
        this.nullableIntAtForceToIntAdapter = f15;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public VehicleConfig b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        Integer num = null;
        String str = null;
        Long l11 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num2 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21831a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    num = this.f21832b.b(reader);
                    i11 &= -2;
                    break;
                case 1:
                    str = this.f21833c.b(reader);
                    i11 &= -3;
                    break;
                case 2:
                    l11 = this.f21834d.b(reader);
                    break;
                case 3:
                    bool = this.f21835e.b(reader);
                    break;
                case 4:
                    bool2 = this.f21835e.b(reader);
                    break;
                case 5:
                    num2 = this.nullableIntAtForceToIntAdapter.b(reader);
                    break;
            }
        }
        reader.l();
        if (i11 == -4) {
            return new VehicleConfig(num, str, l11, bool, bool2, num2);
        }
        Constructor<VehicleConfig> constructor = this.f21836f;
        if (constructor == null) {
            constructor = VehicleConfig.class.getDeclaredConstructor(Integer.class, String.class, Long.class, Boolean.class, Boolean.class, Integer.class, Integer.TYPE, b.f35691c);
            this.f21836f = constructor;
            s.f(constructor, "VehicleConfig::class.jav…his.constructorRef = it }");
        }
        VehicleConfig newInstance = constructor.newInstance(num, str, l11, bool, bool2, num2, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, VehicleConfig vehicleConfig) {
        s.g(writer, "writer");
        Objects.requireNonNull(vehicleConfig, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("key_version");
        this.f21832b.j(writer, vehicleConfig.getKeyVersion());
        writer.L("car_type");
        this.f21833c.j(writer, vehicleConfig.getCarType());
        writer.L(FraudDetectionData.KEY_TIMESTAMP);
        this.f21834d.j(writer, vehicleConfig.getTimestamp());
        writer.L("motorized_charge_port");
        this.f21835e.j(writer, vehicleConfig.getMotorizedChargePort());
        writer.L("plg");
        this.f21835e.j(writer, vehicleConfig.getPowerLiftGate());
        writer.L("sun_roof_installed");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleConfig.getSunRoofInstalled());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VehicleConfig");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}