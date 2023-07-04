package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SetScheduledDepartureBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SetScheduledDepartureBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetScheduledDepartureBodyJsonAdapter extends com.squareup.moshi.f<SetScheduledDepartureBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21671a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21672b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Integer> f21673c;

    public SetScheduledDepartureBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enable", "departure_time", "preconditioning_enabled", "preconditioning_weekdays_only", "off_peak_charging_enabled", "off_peak_charging_weekdays_only", "end_off_peak_time");
        s.f(a11, "of(\"enable\", \"departure_…ly\", \"end_off_peak_time\")");
        this.f21671a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "enable");
        s.f(f11, "moshi.adapter(Boolean::c…ptySet(),\n      \"enable\")");
        this.f21672b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<Integer> f12 = moshi.f(Integer.class, d12, "departureTime");
        s.f(f12, "moshi.adapter(Int::class…tySet(), \"departureTime\")");
        this.f21673c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SetScheduledDepartureBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Integer num2 = null;
        while (true) {
            Integer num3 = num2;
            Integer num4 = num;
            Boolean bool6 = bool5;
            if (reader.p()) {
                switch (reader.G0(this.f21671a)) {
                    case -1:
                        reader.Q0();
                        reader.R0();
                        num2 = num3;
                        num = num4;
                        break;
                    case 0:
                        bool = this.f21672b.b(reader);
                        if (bool == null) {
                            JsonDataException v11 = kr.b.v("enable", "enable", reader);
                            s.f(v11, "unexpectedNull(\"enable\",…        \"enable\", reader)");
                            throw v11;
                        }
                        num2 = num3;
                        num = num4;
                        break;
                    case 1:
                        num = this.f21673c.b(reader);
                        num2 = num3;
                        break;
                    case 2:
                        bool2 = this.f21672b.b(reader);
                        if (bool2 == null) {
                            JsonDataException v12 = kr.b.v("preconditioningEnabled", "preconditioning_enabled", reader);
                            s.f(v12, "unexpectedNull(\"precondi…tioning_enabled\", reader)");
                            throw v12;
                        }
                        num2 = num3;
                        num = num4;
                        break;
                    case 3:
                        bool3 = this.f21672b.b(reader);
                        if (bool3 == null) {
                            JsonDataException v13 = kr.b.v("preconditioningWeekdaysOnly", "preconditioning_weekdays_only", reader);
                            s.f(v13, "unexpectedNull(\"precondi…g_weekdays_only\", reader)");
                            throw v13;
                        }
                        num2 = num3;
                        num = num4;
                        break;
                    case 4:
                        bool4 = this.f21672b.b(reader);
                        if (bool4 == null) {
                            JsonDataException v14 = kr.b.v("offPeakChargingEnabled", "off_peak_charging_enabled", reader);
                            s.f(v14, "unexpectedNull(\"offPeakC…harging_enabled\", reader)");
                            throw v14;
                        }
                        num2 = num3;
                        num = num4;
                        break;
                    case 5:
                        bool5 = this.f21672b.b(reader);
                        if (bool5 == null) {
                            JsonDataException v15 = kr.b.v("offPeakChargingWeekdaysOnly", "off_peak_charging_weekdays_only", reader);
                            s.f(v15, "unexpectedNull(\"offPeakC…g_weekdays_only\", reader)");
                            throw v15;
                        }
                        num2 = num3;
                        num = num4;
                        continue;
                    case 6:
                        num2 = this.f21673c.b(reader);
                        num = num4;
                        break;
                    default:
                        num2 = num3;
                        num = num4;
                        break;
                }
                bool5 = bool6;
            } else {
                reader.l();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (bool2 != null) {
                        boolean booleanValue2 = bool2.booleanValue();
                        if (bool3 != null) {
                            boolean booleanValue3 = bool3.booleanValue();
                            if (bool4 != null) {
                                boolean booleanValue4 = bool4.booleanValue();
                                if (bool6 != null) {
                                    return new SetScheduledDepartureBody(booleanValue, num4, booleanValue2, booleanValue3, booleanValue4, bool6.booleanValue(), num3);
                                }
                                JsonDataException m11 = kr.b.m("offPeakChargingWeekdaysOnly", "off_peak_charging_weekdays_only", reader);
                                s.f(m11, "missingProperty(\"offPeak…g_weekdays_only\", reader)");
                                throw m11;
                            }
                            JsonDataException m12 = kr.b.m("offPeakChargingEnabled", "off_peak_charging_enabled", reader);
                            s.f(m12, "missingProperty(\"offPeak…led\",\n            reader)");
                            throw m12;
                        }
                        JsonDataException m13 = kr.b.m("preconditioningWeekdaysOnly", "preconditioning_weekdays_only", reader);
                        s.f(m13, "missingProperty(\"precond…g_weekdays_only\", reader)");
                        throw m13;
                    }
                    JsonDataException m14 = kr.b.m("preconditioningEnabled", "preconditioning_enabled", reader);
                    s.f(m14, "missingProperty(\"precond…tioning_enabled\", reader)");
                    throw m14;
                }
                JsonDataException m15 = kr.b.m("enable", "enable", reader);
                s.f(m15, "missingProperty(\"enable\", \"enable\", reader)");
                throw m15;
            }
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SetScheduledDepartureBody setScheduledDepartureBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(setScheduledDepartureBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enable");
        this.f21672b.j(writer, Boolean.valueOf(setScheduledDepartureBody.b()));
        writer.L("departure_time");
        this.f21673c.j(writer, setScheduledDepartureBody.a());
        writer.L("preconditioning_enabled");
        this.f21672b.j(writer, Boolean.valueOf(setScheduledDepartureBody.f()));
        writer.L("preconditioning_weekdays_only");
        this.f21672b.j(writer, Boolean.valueOf(setScheduledDepartureBody.g()));
        writer.L("off_peak_charging_enabled");
        this.f21672b.j(writer, Boolean.valueOf(setScheduledDepartureBody.d()));
        writer.L("off_peak_charging_weekdays_only");
        this.f21672b.j(writer, Boolean.valueOf(setScheduledDepartureBody.e()));
        writer.L("end_off_peak_time");
        this.f21673c.j(writer, setScheduledDepartureBody.c());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SetScheduledDepartureBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}