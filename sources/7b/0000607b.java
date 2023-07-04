package com.tesla.domain.model;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/domain/model/ChargeStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/ChargeState;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ChargeStateJsonAdapter extends f<ChargeState> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21805a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f21806b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Integer> f21807c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Double> f21808d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Boolean> f21809e;

    public ChargeStateJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("charging_state", "battery_level", "time_to_full_charge", "usable_battery_level", "ideal_battery_range", "battery_range", "charge_port_door_open", "charge_port_latch");
        s.f(a11, "of(\"charging_state\", \"ba…en\", \"charge_port_latch\")");
        this.f21805a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "chargingState");
        s.f(f11, "moshi.adapter(String::cl…tySet(), \"chargingState\")");
        this.f21806b = f11;
        d12 = x0.d();
        f<Integer> f12 = moshi.f(Integer.class, d12, "batteryLevel");
        s.f(f12, "moshi.adapter(Int::class…ptySet(), \"batteryLevel\")");
        this.f21807c = f12;
        d13 = x0.d();
        f<Double> f13 = moshi.f(Double.class, d13, "timeToFullCharge");
        s.f(f13, "moshi.adapter(Double::cl…et(), \"timeToFullCharge\")");
        this.f21808d = f13;
        d14 = x0.d();
        f<Boolean> f14 = moshi.f(Boolean.class, d14, "chargePortDoorOpen");
        s.f(f14, "moshi.adapter(Boolean::c…(), \"chargePortDoorOpen\")");
        this.f21809e = f14;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ChargeState b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        Integer num = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Boolean bool = null;
        String str2 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21805a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    str = this.f21806b.b(reader);
                    break;
                case 1:
                    num = this.f21807c.b(reader);
                    break;
                case 2:
                    d11 = this.f21808d.b(reader);
                    break;
                case 3:
                    d12 = this.f21808d.b(reader);
                    break;
                case 4:
                    d13 = this.f21808d.b(reader);
                    break;
                case 5:
                    d14 = this.f21808d.b(reader);
                    break;
                case 6:
                    bool = this.f21809e.b(reader);
                    break;
                case 7:
                    str2 = this.f21806b.b(reader);
                    break;
            }
        }
        reader.l();
        return new ChargeState(str, num, d11, d12, d13, d14, bool, str2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ChargeState chargeState) {
        s.g(writer, "writer");
        Objects.requireNonNull(chargeState, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("charging_state");
        this.f21806b.j(writer, chargeState.getChargingState());
        writer.L("battery_level");
        this.f21807c.j(writer, chargeState.getBatteryLevel());
        writer.L("time_to_full_charge");
        this.f21808d.j(writer, chargeState.getTimeToFullCharge());
        writer.L("usable_battery_level");
        this.f21808d.j(writer, chargeState.getUsableBatteryLevel());
        writer.L("ideal_battery_range");
        this.f21808d.j(writer, chargeState.getIdealBatteryRange());
        writer.L("battery_range");
        this.f21808d.j(writer, chargeState.getBatteryRange());
        writer.L("charge_port_door_open");
        this.f21809e.j(writer, chargeState.getChargePortDoorOpen());
        writer.L("charge_port_latch");
        this.f21806b.j(writer, chargeState.getChargePortLatch());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ChargeState");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}