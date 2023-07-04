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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/CalendarSyncParametersJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/CalendarSyncParameters;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarSyncParametersJsonAdapter extends com.squareup.moshi.f<CalendarSyncParameters> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21564a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21565b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21566c;

    public CalendarSyncParametersJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("reason", "sync_enabled", "vehicle_id");
        s.f(a11, "of(\"reason\", \"sync_enabled\",\n      \"vehicle_id\")");
        this.f21564a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "reason");
        s.f(f11, "moshi.adapter(String::cl…ptySet(),\n      \"reason\")");
        this.f21565b = f11;
        Class cls = Boolean.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Boolean> f12 = moshi.f(cls, d12, "enabled");
        s.f(f12, "moshi.adapter(Boolean::c…tySet(),\n      \"enabled\")");
        this.f21566c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CalendarSyncParameters b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21564a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21565b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("reason", "reason", reader);
                    s.f(v11, "unexpectedNull(\"reason\",…        \"reason\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                bool = this.f21566c.b(reader);
                if (bool == null) {
                    JsonDataException v12 = kr.b.v("enabled", "sync_enabled", reader);
                    s.f(v12, "unexpectedNull(\"enabled\"…  \"sync_enabled\", reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (str2 = this.f21565b.b(reader)) == null) {
                JsonDataException v13 = kr.b.v("vehicleId", "vehicle_id", reader);
                s.f(v13, "unexpectedNull(\"vehicleI…    \"vehicle_id\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("reason", "reason", reader);
            s.f(m11, "missingProperty(\"reason\", \"reason\", reader)");
            throw m11;
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (str2 != null) {
                return new CalendarSyncParameters(str, booleanValue, str2);
            }
            JsonDataException m12 = kr.b.m("vehicleId", "vehicle_id", reader);
            s.f(m12, "missingProperty(\"vehicleId\", \"vehicle_id\", reader)");
            throw m12;
        } else {
            JsonDataException m13 = kr.b.m("enabled", "sync_enabled", reader);
            s.f(m13, "missingProperty(\"enabled\", \"sync_enabled\", reader)");
            throw m13;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CalendarSyncParameters calendarSyncParameters) {
        s.g(writer, "writer");
        Objects.requireNonNull(calendarSyncParameters, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("reason");
        this.f21565b.j(writer, calendarSyncParameters.d());
        writer.L("sync_enabled");
        this.f21566c.j(writer, Boolean.valueOf(calendarSyncParameters.c()));
        writer.L("vehicle_id");
        this.f21565b.j(writer, calendarSyncParameters.e());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CalendarSyncParameters");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}