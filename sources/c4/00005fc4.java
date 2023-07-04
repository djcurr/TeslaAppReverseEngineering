package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.tesla.data.oapi.Calendar;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/CalendarJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/Calendar;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarJsonAdapter extends com.squareup.moshi.f<Calendar> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21555a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21556b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<List<Calendar.Event>> f21557c;

    public CalendarJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("name", "color", "events");
        s.f(a11, "of(\"name\", \"color\", \"events\")");
        this.f21555a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "name");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.f21556b = f11;
        ParameterizedType k11 = r.k(List.class, Calendar.Event.class);
        d12 = x0.d();
        com.squareup.moshi.f<List<Calendar.Event>> f12 = moshi.f(k11, d12, "events");
        s.f(f12, "moshi.adapter(Types.newP…    emptySet(), \"events\")");
        this.f21557c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Calendar b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        List<Calendar.Event> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21555a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21556b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("name", "name", reader);
                    s.f(v11, "unexpectedNull(\"name\", \"name\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f21556b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = kr.b.v("color", "color", reader);
                    s.f(v12, "unexpectedNull(\"color\", …lor\",\n            reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (list = this.f21557c.b(reader)) == null) {
                JsonDataException v13 = kr.b.v("events", "events", reader);
                s.f(v13, "unexpectedNull(\"events\",…        \"events\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("name", "name", reader);
            s.f(m11, "missingProperty(\"name\", \"name\", reader)");
            throw m11;
        } else if (str2 == null) {
            JsonDataException m12 = kr.b.m("color", "color", reader);
            s.f(m12, "missingProperty(\"color\", \"color\", reader)");
            throw m12;
        } else if (list != null) {
            return new Calendar(str, str2, list);
        } else {
            JsonDataException m13 = kr.b.m("events", "events", reader);
            s.f(m13, "missingProperty(\"events\", \"events\", reader)");
            throw m13;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, Calendar calendar) {
        s.g(writer, "writer");
        Objects.requireNonNull(calendar, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("name");
        this.f21556b.j(writer, calendar.c());
        writer.L("color");
        this.f21556b.j(writer, calendar.a());
        writer.L("events");
        this.f21557c.j(writer, calendar.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Calendar");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}