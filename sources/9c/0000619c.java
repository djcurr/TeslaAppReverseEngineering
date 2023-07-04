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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/report/ScreenshotReportJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/report/ScreenshotReport;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenshotReportJsonAdapter extends f<ScreenshotReport> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21960a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f21961b;

    /* renamed from: c  reason: collision with root package name */
    private final f<ReportType> f21962c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Origin> f21963d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Constructor<ScreenshotReport> f21964e;

    public ScreenshotReportJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("screenshot_data", "report_id", "type", AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        s.f(a11, "of(\"screenshot_data\", \"r…,\n      \"type\", \"origin\")");
        this.f21960a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "screenshotData");
        s.f(f11, "moshi.adapter(String::cl…,\n      \"screenshotData\")");
        this.f21961b = f11;
        d12 = x0.d();
        f<ReportType> f12 = moshi.f(ReportType.class, d12, "type");
        s.f(f12, "moshi.adapter(ReportType…      emptySet(), \"type\")");
        this.f21962c = f12;
        d13 = x0.d();
        f<Origin> f13 = moshi.f(Origin.class, d13, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        s.f(f13, "moshi.adapter(Origin::cl…ptySet(),\n      \"origin\")");
        this.f21963d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ScreenshotReport b(h reader) {
        String str;
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        String str2 = null;
        String str3 = null;
        ReportType reportType = null;
        Origin origin = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21960a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str2 = this.f21961b.b(reader);
                if (str2 == null) {
                    JsonDataException v11 = b.v("screenshotData", "screenshot_data", reader);
                    s.f(v11, "unexpectedNull(\"screensh…screenshot_data\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str3 = this.f21961b.b(reader);
                if (str3 == null) {
                    JsonDataException v12 = b.v("reportId", "report_id", reader);
                    s.f(v12, "unexpectedNull(\"reportId…     \"report_id\", reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                reportType = this.f21962c.b(reader);
                if (reportType == null) {
                    JsonDataException v13 = b.v("type", "type", reader);
                    s.f(v13, "unexpectedNull(\"type\", \"…e\",\n              reader)");
                    throw v13;
                }
                i11 &= -5;
            } else if (G0 == 3) {
                origin = this.f21963d.b(reader);
                if (origin == null) {
                    JsonDataException v14 = b.v(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, reader);
                    s.f(v14, "unexpectedNull(\"origin\",…n\",\n              reader)");
                    throw v14;
                }
                i11 &= -9;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -13) {
            if (str2 == null) {
                JsonDataException m11 = b.m("screenshotData", "screenshot_data", reader);
                s.f(m11, "missingProperty(\"screens…screenshot_data\", reader)");
                throw m11;
            } else if (str3 != null) {
                Objects.requireNonNull(reportType, "null cannot be cast to non-null type com.tesla.report.ReportType");
                Objects.requireNonNull(origin, "null cannot be cast to non-null type com.tesla.report.Origin");
                return new ScreenshotReport(str2, str3, reportType, origin);
            } else {
                JsonDataException m12 = b.m("reportId", "report_id", reader);
                s.f(m12, "missingProperty(\"reportId\", \"report_id\", reader)");
                throw m12;
            }
        }
        Constructor<ScreenshotReport> constructor = this.f21964e;
        if (constructor == null) {
            str = "missingProperty(\"screens…screenshot_data\", reader)";
            constructor = ScreenshotReport.class.getDeclaredConstructor(String.class, String.class, ReportType.class, Origin.class, Integer.TYPE, b.f35691c);
            this.f21964e = constructor;
            s.f(constructor, "ScreenshotReport::class.…his.constructorRef = it }");
        } else {
            str = "missingProperty(\"screens…screenshot_data\", reader)";
        }
        Object[] objArr = new Object[6];
        if (str2 == null) {
            JsonDataException m13 = b.m("screenshotData", "screenshot_data", reader);
            s.f(m13, str);
            throw m13;
        }
        objArr[0] = str2;
        if (str3 == null) {
            JsonDataException m14 = b.m("reportId", "report_id", reader);
            s.f(m14, "missingProperty(\"reportId\", \"report_id\", reader)");
            throw m14;
        }
        objArr[1] = str3;
        objArr[2] = reportType;
        objArr[3] = origin;
        objArr[4] = Integer.valueOf(i11);
        objArr[5] = null;
        ScreenshotReport newInstance = constructor.newInstance(objArr);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ScreenshotReport screenshotReport) {
        s.g(writer, "writer");
        Objects.requireNonNull(screenshotReport, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("screenshot_data");
        this.f21961b.j(writer, screenshotReport.getScreenshotData());
        writer.L("report_id");
        this.f21961b.j(writer, screenshotReport.getReportId());
        writer.L("type");
        this.f21962c.j(writer, screenshotReport.getType());
        writer.L(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f21963d.j(writer, screenshotReport.getOrigin());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ScreenshotReport");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}