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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0003X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/tesla/domain/model/VehicleStateJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/VehicleState;", "", "nullableIntAtForceToIntAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleStateJsonAdapter extends f<VehicleState> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21849a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Boolean> f21850b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f21851c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Integer> f21852d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Long> f21853e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Constructor<VehicleState> f21854f;
    @ForceToInt
    private final f<Integer> nullableIntAtForceToIntAdapter;

    public VehicleStateJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("locked", "sentry_mode", "ft", "rt", "df", "pf", "dr", "pr", "car_version", "remote_start", "remote_start_supported", "fd_window", "fp_window", "rd_window", "rp_window", "sun_roof_state", "sun_roof_percent_open", "api_version", FraudDetectionData.KEY_TIMESTAMP);
        s.f(a11, "of(\"locked\", \"sentry_mod…pi_version\", \"timestamp\")");
        this.f21849a = a11;
        d11 = x0.d();
        f<Boolean> f11 = moshi.f(Boolean.class, d11, "locked");
        s.f(f11, "moshi.adapter(Boolean::c…pe, emptySet(), \"locked\")");
        this.f21850b = f11;
        f<Integer> f12 = moshi.f(Integer.class, r.f(VehicleStateJsonAdapter.class, "nullableIntAtForceToIntAdapter"), "frunk");
        s.f(f12, "moshi.adapter(Int::class…eToIntAdapter\"), \"frunk\")");
        this.nullableIntAtForceToIntAdapter = f12;
        d12 = x0.d();
        f<String> f13 = moshi.f(String.class, d12, "carVersion");
        s.f(f13, "moshi.adapter(String::cl…emptySet(), \"carVersion\")");
        this.f21851c = f13;
        d13 = x0.d();
        f<Integer> f14 = moshi.f(Integer.class, d13, "apiVersion");
        s.f(f14, "moshi.adapter(Int::class…emptySet(), \"apiVersion\")");
        this.f21852d = f14;
        d14 = x0.d();
        f<Long> f15 = moshi.f(Long.class, d14, FraudDetectionData.KEY_TIMESTAMP);
        s.f(f15, "moshi.adapter(Long::clas… emptySet(), \"timestamp\")");
        this.f21853e = f15;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public VehicleState b(h reader) {
        int i11;
        s.g(reader, "reader");
        reader.g();
        int i12 = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        String str = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        String str2 = null;
        Integer num11 = null;
        Integer num12 = null;
        Long l11 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21849a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    continue;
                case 0:
                    bool = this.f21850b.b(reader);
                    continue;
                case 1:
                    bool2 = this.f21850b.b(reader);
                    continue;
                case 2:
                    num = this.nullableIntAtForceToIntAdapter.b(reader);
                    continue;
                case 3:
                    num2 = this.nullableIntAtForceToIntAdapter.b(reader);
                    continue;
                case 4:
                    num3 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -17;
                    continue;
                case 5:
                    num4 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -33;
                    continue;
                case 6:
                    num5 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    num6 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    str = this.f21851c.b(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    bool3 = this.f21850b.b(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    bool4 = this.f21850b.b(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    num7 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    num8 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    num9 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    num10 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    str2 = this.f21851c.b(reader);
                    i11 = -32769;
                    break;
                case 16:
                    num11 = this.nullableIntAtForceToIntAdapter.b(reader);
                    i11 = -65537;
                    break;
                case 17:
                    num12 = this.f21852d.b(reader);
                    i11 = -131073;
                    break;
                case 18:
                    l11 = this.f21853e.b(reader);
                    i11 = -262145;
                    break;
            }
            i12 &= i11;
        }
        reader.l();
        if (i12 == -524273) {
            return new VehicleState(bool, bool2, num, num2, num3, num4, num5, num6, str, bool3, bool4, num7, num8, num9, num10, str2, num11, num12, l11);
        }
        Constructor<VehicleState> constructor = this.f21854f;
        if (constructor == null) {
            constructor = VehicleState.class.getDeclaredConstructor(Boolean.class, Boolean.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, Boolean.class, Boolean.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, Integer.class, Integer.class, Long.class, Integer.TYPE, b.f35691c);
            this.f21854f = constructor;
            s.f(constructor, "VehicleState::class.java…his.constructorRef = it }");
        }
        VehicleState newInstance = constructor.newInstance(bool, bool2, num, num2, num3, num4, num5, num6, str, bool3, bool4, num7, num8, num9, num10, str2, num11, num12, l11, Integer.valueOf(i12), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, VehicleState vehicleState) {
        s.g(writer, "writer");
        Objects.requireNonNull(vehicleState, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("locked");
        this.f21850b.j(writer, vehicleState.getLocked());
        writer.L("sentry_mode");
        this.f21850b.j(writer, vehicleState.getSentryMode());
        writer.L("ft");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getFrunk());
        writer.L("rt");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getTrunk());
        writer.L("df");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getFrontDriverDoor());
        writer.L("pf");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getFrontPassengerDoor());
        writer.L("dr");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getRearDriverDoor());
        writer.L("pr");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getRearPassengerDoor());
        writer.L("car_version");
        this.f21851c.j(writer, vehicleState.getCarVersion());
        writer.L("remote_start");
        this.f21850b.j(writer, vehicleState.getRemoteStarted());
        writer.L("remote_start_supported");
        this.f21850b.j(writer, vehicleState.getRemoteStartSupported());
        writer.L("fd_window");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getFrontDriverWindow());
        writer.L("fp_window");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getFrontPassengerWindow());
        writer.L("rd_window");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getRearDriverWindow());
        writer.L("rp_window");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getRearPassengerWindow());
        writer.L("sun_roof_state");
        this.f21851c.j(writer, vehicleState.getSunRoofState());
        writer.L("sun_roof_percent_open");
        this.nullableIntAtForceToIntAdapter.j(writer, vehicleState.getSunRoofPercentOpen());
        writer.L("api_version");
        this.f21852d.j(writer, vehicleState.getApiVersion());
        writer.L(FraudDetectionData.KEY_TIMESTAMP);
        this.f21853e.j(writer, vehicleState.getTimestamp());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VehicleState");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}