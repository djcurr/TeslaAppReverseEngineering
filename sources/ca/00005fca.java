package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.tesla.data.oapi.Calendar;
import ezvcard.property.Kind;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/Calendar_EventJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/Calendar$Event;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Calendar_EventJsonAdapter extends com.squareup.moshi.f<Calendar.Event> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21567a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21568b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Long> f21569c;

    /* renamed from: d  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21570d;

    /* renamed from: e  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21571e;

    public Calendar_EventJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("all_day", "start", "end", "name", Kind.LOCATION, "description", "organizer", "cancelled", "tentative");
        s.f(a11, "of(\"all_day\", \"start\", \"…\"cancelled\", \"tentative\")");
        this.f21567a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "allDay");
        s.f(f11, "moshi.adapter(Boolean::c…ptySet(),\n      \"allDay\")");
        this.f21568b = f11;
        Class cls2 = Long.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Long> f12 = moshi.f(cls2, d12, "start");
        s.f(f12, "moshi.adapter(Long::clas…ava, emptySet(), \"start\")");
        this.f21569c = f12;
        d13 = x0.d();
        com.squareup.moshi.f<String> f13 = moshi.f(String.class, d13, "name");
        s.f(f13, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.f21570d = f13;
        d14 = x0.d();
        com.squareup.moshi.f<Boolean> f14 = moshi.f(Boolean.class, d14, "cancelled");
        s.f(f14, "moshi.adapter(Boolean::c… emptySet(), \"cancelled\")");
        this.f21571e = f14;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Calendar.Event b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Long l11 = null;
        Long l12 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (reader.p()) {
            switch (reader.G0(this.f21567a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    bool = this.f21568b.b(reader);
                    if (bool == null) {
                        JsonDataException v11 = kr.b.v("allDay", "all_day", reader);
                        s.f(v11, "unexpectedNull(\"allDay\",…       \"all_day\", reader)");
                        throw v11;
                    }
                    break;
                case 1:
                    l11 = this.f21569c.b(reader);
                    if (l11 == null) {
                        JsonDataException v12 = kr.b.v("start", "start", reader);
                        s.f(v12, "unexpectedNull(\"start\", …art\",\n            reader)");
                        throw v12;
                    }
                    break;
                case 2:
                    l12 = this.f21569c.b(reader);
                    if (l12 == null) {
                        JsonDataException v13 = kr.b.v("end", "end", reader);
                        s.f(v13, "unexpectedNull(\"end\", \"end\", reader)");
                        throw v13;
                    }
                    break;
                case 3:
                    str = this.f21570d.b(reader);
                    break;
                case 4:
                    str2 = this.f21570d.b(reader);
                    break;
                case 5:
                    str3 = this.f21570d.b(reader);
                    break;
                case 6:
                    str4 = this.f21570d.b(reader);
                    break;
                case 7:
                    bool2 = this.f21571e.b(reader);
                    break;
                case 8:
                    bool3 = this.f21571e.b(reader);
                    break;
            }
        }
        reader.l();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (l11 != null) {
                long longValue = l11.longValue();
                if (l12 != null) {
                    return new Calendar.Event(booleanValue, longValue, l12.longValue(), str, str2, str3, str4, bool2, bool3);
                }
                JsonDataException m11 = kr.b.m("end", "end", reader);
                s.f(m11, "missingProperty(\"end\", \"end\", reader)");
                throw m11;
            }
            JsonDataException m12 = kr.b.m("start", "start", reader);
            s.f(m12, "missingProperty(\"start\", \"start\", reader)");
            throw m12;
        }
        JsonDataException m13 = kr.b.m("allDay", "all_day", reader);
        s.f(m13, "missingProperty(\"allDay\", \"all_day\", reader)");
        throw m13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, Calendar.Event event) {
        s.g(writer, "writer");
        Objects.requireNonNull(event, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("all_day");
        this.f21568b.j(writer, Boolean.valueOf(event.a()));
        writer.L("start");
        this.f21569c.j(writer, Long.valueOf(event.h()));
        writer.L("end");
        this.f21569c.j(writer, Long.valueOf(event.c()));
        writer.L("name");
        this.f21570d.j(writer, event.e());
        writer.L(Kind.LOCATION);
        this.f21570d.j(writer, event.d());
        writer.L("description");
        this.f21570d.j(writer, event.f());
        writer.L("organizer");
        this.f21570d.j(writer, event.g());
        writer.L("cancelled");
        this.f21571e.j(writer, event.b());
        writer.L("tentative");
        this.f21571e.j(writer, event.i());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Calendar.Event");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}