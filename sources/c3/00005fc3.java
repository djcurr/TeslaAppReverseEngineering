package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import expo.modules.constants.ExponentInstallationId;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/CalendarDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/CalendarData;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarDataJsonAdapter extends com.squareup.moshi.f<CalendarData> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21551a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21552b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21553c;

    /* renamed from: d  reason: collision with root package name */
    private final com.squareup.moshi.f<List<Calendar>> f21554d;

    public CalendarDataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("access_disabled", "phone_name", "notification_disabled", "background_disabled", ExponentInstallationId.LEGACY_UUID_KEY, "reason", "calendars");
        s.f(a11, "of(\"access_disabled\", \"p…\", \"reason\", \"calendars\")");
        this.f21551a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "accessDisabled");
        s.f(f11, "moshi.adapter(Boolean::c…,\n      \"accessDisabled\")");
        this.f21552b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<String> f12 = moshi.f(String.class, d12, "phoneName");
        s.f(f12, "moshi.adapter(String::cl…Set(),\n      \"phoneName\")");
        this.f21553c = f12;
        ParameterizedType k11 = r.k(List.class, Calendar.class);
        d13 = x0.d();
        com.squareup.moshi.f<List<Calendar>> f13 = moshi.f(k11, d13, "calendars");
        s.f(f13, "moshi.adapter(Types.newP…Set(),\n      \"calendars\")");
        this.f21554d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CalendarData b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<Calendar> list = null;
        while (true) {
            List<Calendar> list2 = list;
            String str4 = str3;
            String str5 = str2;
            Boolean bool4 = bool3;
            Boolean bool5 = bool2;
            if (reader.p()) {
                switch (reader.G0(this.f21551a)) {
                    case -1:
                        reader.Q0();
                        reader.R0();
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                    case 0:
                        bool = this.f21552b.b(reader);
                        if (bool == null) {
                            JsonDataException v11 = kr.b.v("accessDisabled", "access_disabled", reader);
                            s.f(v11, "unexpectedNull(\"accessDi…access_disabled\", reader)");
                            throw v11;
                        }
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                    case 1:
                        str = this.f21553c.b(reader);
                        if (str == null) {
                            JsonDataException v12 = kr.b.v("phoneName", "phone_name", reader);
                            s.f(v12, "unexpectedNull(\"phoneNam…    \"phone_name\", reader)");
                            throw v12;
                        }
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                    case 2:
                        bool2 = this.f21552b.b(reader);
                        if (bool2 == null) {
                            JsonDataException v13 = kr.b.v("notificationDisabled", "notification_disabled", reader);
                            s.f(v13, "unexpectedNull(\"notifica…cation_disabled\", reader)");
                            throw v13;
                        }
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        continue;
                    case 3:
                        bool3 = this.f21552b.b(reader);
                        if (bool3 == null) {
                            JsonDataException v14 = kr.b.v("backgroundDisabled", "background_disabled", reader);
                            s.f(v14, "unexpectedNull(\"backgrou…ground_disabled\", reader)");
                            throw v14;
                        }
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        break;
                    case 4:
                        str2 = this.f21553c.b(reader);
                        if (str2 == null) {
                            JsonDataException v15 = kr.b.v(ExponentInstallationId.LEGACY_UUID_KEY, ExponentInstallationId.LEGACY_UUID_KEY, reader);
                            s.f(v15, "unexpectedNull(\"uuid\", \"uuid\",\n            reader)");
                            throw v15;
                        }
                        list = list2;
                        str3 = str4;
                        bool3 = bool4;
                        break;
                    case 5:
                        str3 = this.f21553c.b(reader);
                        if (str3 == null) {
                            JsonDataException v16 = kr.b.v("reason", "reason", reader);
                            s.f(v16, "unexpectedNull(\"reason\",…        \"reason\", reader)");
                            throw v16;
                        }
                        list = list2;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                    case 6:
                        list = this.f21554d.b(reader);
                        if (list == null) {
                            JsonDataException v17 = kr.b.v("calendars", "calendars", reader);
                            s.f(v17, "unexpectedNull(\"calendars\", \"calendars\", reader)");
                            throw v17;
                        }
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                    default:
                        list = list2;
                        str3 = str4;
                        str2 = str5;
                        bool3 = bool4;
                        break;
                }
                bool2 = bool5;
            } else {
                reader.l();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (str == null) {
                        JsonDataException m11 = kr.b.m("phoneName", "phone_name", reader);
                        s.f(m11, "missingProperty(\"phoneName\", \"phone_name\", reader)");
                        throw m11;
                    } else if (bool5 != null) {
                        boolean booleanValue2 = bool5.booleanValue();
                        if (bool4 != null) {
                            boolean booleanValue3 = bool4.booleanValue();
                            if (str5 == null) {
                                JsonDataException m12 = kr.b.m(ExponentInstallationId.LEGACY_UUID_KEY, ExponentInstallationId.LEGACY_UUID_KEY, reader);
                                s.f(m12, "missingProperty(\"uuid\", \"uuid\", reader)");
                                throw m12;
                            } else if (str4 == null) {
                                JsonDataException m13 = kr.b.m("reason", "reason", reader);
                                s.f(m13, "missingProperty(\"reason\", \"reason\", reader)");
                                throw m13;
                            } else if (list2 != null) {
                                return new CalendarData(booleanValue, str, booleanValue2, booleanValue3, str5, str4, list2);
                            } else {
                                JsonDataException m14 = kr.b.m("calendars", "calendars", reader);
                                s.f(m14, "missingProperty(\"calendars\", \"calendars\", reader)");
                                throw m14;
                            }
                        }
                        JsonDataException m15 = kr.b.m("backgroundDisabled", "background_disabled", reader);
                        s.f(m15, "missingProperty(\"backgro…ground_disabled\", reader)");
                        throw m15;
                    } else {
                        JsonDataException m16 = kr.b.m("notificationDisabled", "notification_disabled", reader);
                        s.f(m16, "missingProperty(\"notific…cation_disabled\", reader)");
                        throw m16;
                    }
                }
                JsonDataException m17 = kr.b.m("accessDisabled", "access_disabled", reader);
                s.f(m17, "missingProperty(\"accessD…access_disabled\", reader)");
                throw m17;
            }
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CalendarData calendarData) {
        s.g(writer, "writer");
        Objects.requireNonNull(calendarData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("access_disabled");
        this.f21552b.j(writer, Boolean.valueOf(calendarData.a()));
        writer.L("phone_name");
        this.f21553c.j(writer, calendarData.e());
        writer.L("notification_disabled");
        this.f21552b.j(writer, Boolean.valueOf(calendarData.d()));
        writer.L("background_disabled");
        this.f21552b.j(writer, Boolean.valueOf(calendarData.b()));
        writer.L(ExponentInstallationId.LEGACY_UUID_KEY);
        this.f21553c.j(writer, calendarData.g());
        writer.L("reason");
        this.f21553c.j(writer, calendarData.f());
        writer.L("calendars");
        this.f21554d.j(writer, calendarData.c());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CalendarData");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}