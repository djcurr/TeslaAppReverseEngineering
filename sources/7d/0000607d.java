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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/domain/model/ClimateStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/ClimateState;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ClimateStateJsonAdapter extends f<ClimateState> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21810a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Boolean> f21811b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Integer> f21812c;

    /* renamed from: d  reason: collision with root package name */
    private final f<String> f21813d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Double> f21814e;

    public ClimateStateJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("is_climate_on", "is_preconditioning", "bioweapon_mode", "defrost_mode", "climate_keeper_mode", "inside_temp");
        s.f(a11, "of(\"is_climate_on\",\n    …per_mode\", \"inside_temp\")");
        this.f21810a = a11;
        d11 = x0.d();
        f<Boolean> f11 = moshi.f(Boolean.class, d11, "isClimateOn");
        s.f(f11, "moshi.adapter(Boolean::c…mptySet(), \"isClimateOn\")");
        this.f21811b = f11;
        d12 = x0.d();
        f<Integer> f12 = moshi.f(Integer.class, d12, "defrostMode");
        s.f(f12, "moshi.adapter(Int::class…mptySet(), \"defrostMode\")");
        this.f21812c = f12;
        d13 = x0.d();
        f<String> f13 = moshi.f(String.class, d13, "climateKeeperMode");
        s.f(f13, "moshi.adapter(String::cl…t(), \"climateKeeperMode\")");
        this.f21813d = f13;
        d14 = x0.d();
        f<Double> f14 = moshi.f(Double.class, d14, "interiorTemperature");
        s.f(f14, "moshi.adapter(Double::cl…), \"interiorTemperature\")");
        this.f21814e = f14;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ClimateState b(h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        String str = null;
        Double d11 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21810a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    bool = this.f21811b.b(reader);
                    break;
                case 1:
                    bool2 = this.f21811b.b(reader);
                    break;
                case 2:
                    bool3 = this.f21811b.b(reader);
                    break;
                case 3:
                    num = this.f21812c.b(reader);
                    break;
                case 4:
                    str = this.f21813d.b(reader);
                    break;
                case 5:
                    d11 = this.f21814e.b(reader);
                    break;
            }
        }
        reader.l();
        return new ClimateState(bool, bool2, bool3, num, str, d11);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ClimateState climateState) {
        s.g(writer, "writer");
        Objects.requireNonNull(climateState, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("is_climate_on");
        this.f21811b.j(writer, climateState.isClimateOn());
        writer.L("is_preconditioning");
        this.f21811b.j(writer, climateState.isPreconditioning());
        writer.L("bioweapon_mode");
        this.f21811b.j(writer, climateState.getBioweaponModeOn());
        writer.L("defrost_mode");
        this.f21812c.j(writer, climateState.getDefrostMode());
        writer.L("climate_keeper_mode");
        this.f21813d.j(writer, climateState.getClimateKeeperMode());
        writer.L("inside_temp");
        this.f21814e.j(writer, climateState.getInteriorTemperature());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClimateState");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}