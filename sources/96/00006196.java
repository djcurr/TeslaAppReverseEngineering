package com.tesla.report;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/report/LogReportJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/report/LogReport;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class LogReportJsonAdapter extends f<LogReport> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21952a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Integer> f21953b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f21954c;

    /* renamed from: d  reason: collision with root package name */
    private final f<ReportType> f21955d;

    /* renamed from: e  reason: collision with root package name */
    private final f<Origin> f21956e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Constructor<LogReport> f21957f;

    public LogReportJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        Set<? extends Annotation> d14;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("sequence", "total", "log_entries", "report_id", "type", AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        s.f(a11, "of(\"sequence\", \"total\",\n…rt_id\", \"type\", \"origin\")");
        this.f21952a = a11;
        Class cls = Integer.TYPE;
        d11 = x0.d();
        f<Integer> f11 = moshi.f(cls, d11, "sequence");
        s.f(f11, "moshi.adapter(Int::class…, emptySet(), \"sequence\")");
        this.f21953b = f11;
        d12 = x0.d();
        f<String> f12 = moshi.f(String.class, d12, "logEntries");
        s.f(f12, "moshi.adapter(String::cl…et(),\n      \"logEntries\")");
        this.f21954c = f12;
        d13 = x0.d();
        f<ReportType> f13 = moshi.f(ReportType.class, d13, "type");
        s.f(f13, "moshi.adapter(ReportType…      emptySet(), \"type\")");
        this.f21955d = f13;
        d14 = x0.d();
        f<Origin> f14 = moshi.f(Origin.class, d14, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        s.f(f14, "moshi.adapter(Origin::cl…ptySet(),\n      \"origin\")");
        this.f21956e = f14;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public LogReport b(h reader) {
        String str;
        Class<String> cls = String.class;
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        ReportType reportType = null;
        Origin origin = null;
        while (true) {
            Class<String> cls2 = cls;
            if (reader.p()) {
                switch (reader.G0(this.f21952a)) {
                    case -1:
                        reader.Q0();
                        reader.R0();
                        break;
                    case 0:
                        num = this.f21953b.b(reader);
                        if (num == null) {
                            JsonDataException v11 = b.v("sequence", "sequence", reader);
                            s.f(v11, "unexpectedNull(\"sequence…      \"sequence\", reader)");
                            throw v11;
                        }
                        break;
                    case 1:
                        num2 = this.f21953b.b(reader);
                        if (num2 == null) {
                            JsonDataException v12 = b.v("total", "total", reader);
                            s.f(v12, "unexpectedNull(\"total\", …tal\",\n            reader)");
                            throw v12;
                        }
                        break;
                    case 2:
                        str2 = this.f21954c.b(reader);
                        if (str2 == null) {
                            JsonDataException v13 = b.v("logEntries", "log_entries", reader);
                            s.f(v13, "unexpectedNull(\"logEntri…   \"log_entries\", reader)");
                            throw v13;
                        }
                        break;
                    case 3:
                        str3 = this.f21954c.b(reader);
                        if (str3 == null) {
                            JsonDataException v14 = b.v("reportId", "report_id", reader);
                            s.f(v14, "unexpectedNull(\"reportId…     \"report_id\", reader)");
                            throw v14;
                        }
                        break;
                    case 4:
                        reportType = this.f21955d.b(reader);
                        if (reportType == null) {
                            JsonDataException v15 = b.v("type", "type", reader);
                            s.f(v15, "unexpectedNull(\"type\", \"…e\",\n              reader)");
                            throw v15;
                        }
                        i11 &= -17;
                        break;
                    case 5:
                        origin = this.f21956e.b(reader);
                        if (origin == null) {
                            JsonDataException v16 = b.v(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, reader);
                            s.f(v16, "unexpectedNull(\"origin\",…n\",\n              reader)");
                            throw v16;
                        }
                        i11 &= -33;
                        break;
                }
                cls = cls2;
            } else {
                reader.l();
                if (i11 == -49) {
                    if (num != null) {
                        int intValue = num.intValue();
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (str2 == null) {
                                JsonDataException m11 = b.m("logEntries", "log_entries", reader);
                                s.f(m11, "missingProperty(\"logEntr…s\",\n              reader)");
                                throw m11;
                            } else if (str3 != null) {
                                Objects.requireNonNull(reportType, "null cannot be cast to non-null type com.tesla.report.ReportType");
                                Objects.requireNonNull(origin, "null cannot be cast to non-null type com.tesla.report.Origin");
                                return new LogReport(intValue, intValue2, str2, str3, reportType, origin);
                            } else {
                                JsonDataException m12 = b.m("reportId", "report_id", reader);
                                s.f(m12, "missingProperty(\"reportId\", \"report_id\", reader)");
                                throw m12;
                            }
                        }
                        JsonDataException m13 = b.m("total", "total", reader);
                        s.f(m13, "missingProperty(\"total\", \"total\", reader)");
                        throw m13;
                    }
                    JsonDataException m14 = b.m("sequence", "sequence", reader);
                    s.f(m14, "missingProperty(\"sequence\", \"sequence\", reader)");
                    throw m14;
                }
                Constructor<LogReport> constructor = this.f21957f;
                if (constructor == null) {
                    str = "log_entries";
                    Class cls3 = Integer.TYPE;
                    constructor = LogReport.class.getDeclaredConstructor(cls3, cls3, cls2, cls2, ReportType.class, Origin.class, cls3, b.f35691c);
                    this.f21957f = constructor;
                    s.f(constructor, "LogReport::class.java.ge…his.constructorRef = it }");
                } else {
                    str = "log_entries";
                }
                Object[] objArr = new Object[8];
                if (num != null) {
                    objArr[0] = Integer.valueOf(num.intValue());
                    if (num2 != null) {
                        objArr[1] = Integer.valueOf(num2.intValue());
                        if (str2 == null) {
                            JsonDataException m15 = b.m("logEntries", str, reader);
                            s.f(m15, "missingProperty(\"logEntr…\", \"log_entries\", reader)");
                            throw m15;
                        }
                        objArr[2] = str2;
                        if (str3 == null) {
                            JsonDataException m16 = b.m("reportId", "report_id", reader);
                            s.f(m16, "missingProperty(\"reportId\", \"report_id\", reader)");
                            throw m16;
                        }
                        objArr[3] = str3;
                        objArr[4] = reportType;
                        objArr[5] = origin;
                        objArr[6] = Integer.valueOf(i11);
                        objArr[7] = null;
                        LogReport newInstance = constructor.newInstance(objArr);
                        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    JsonDataException m17 = b.m("total", "total", reader);
                    s.f(m17, "missingProperty(\"total\", \"total\", reader)");
                    throw m17;
                }
                JsonDataException m18 = b.m("sequence", "sequence", reader);
                s.f(m18, "missingProperty(\"sequence\", \"sequence\", reader)");
                throw m18;
            }
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, LogReport logReport) {
        s.g(writer, "writer");
        Objects.requireNonNull(logReport, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("sequence");
        this.f21953b.j(writer, Integer.valueOf(logReport.getSequence()));
        writer.L("total");
        this.f21953b.j(writer, Integer.valueOf(logReport.getTotal()));
        writer.L("log_entries");
        this.f21954c.j(writer, logReport.getLogEntries());
        writer.L("report_id");
        this.f21954c.j(writer, logReport.getReportId());
        writer.L("type");
        this.f21955d.j(writer, logReport.getType());
        writer.L(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f21956e.j(writer, logReport.getOrigin());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LogReport");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}