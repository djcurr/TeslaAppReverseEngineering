package com.tesla.report;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/tesla/report/ScreenshotReport;", "", "", "component1", "component2", "Lcom/tesla/report/ReportType;", "component3", "Lcom/tesla/report/Origin;", "component4", "screenshotData", "reportId", "type", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getScreenshotData", "()Ljava/lang/String;", "getReportId", "Lcom/tesla/report/ReportType;", "getType", "()Lcom/tesla/report/ReportType;", "Lcom/tesla/report/Origin;", "getOrigin", "()Lcom/tesla/report/Origin;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/tesla/report/ReportType;Lcom/tesla/report/Origin;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenshotReport {
    @b(name = AppMeasurementSdk.ConditionalUserProperty.ORIGIN)
    private final Origin origin;
    @b(name = "report_id")
    private final String reportId;
    @b(name = "screenshot_data")
    private final String screenshotData;
    @b(name = "type")
    private final ReportType type;

    public ScreenshotReport(String screenshotData, String reportId, ReportType type, Origin origin) {
        s.g(screenshotData, "screenshotData");
        s.g(reportId, "reportId");
        s.g(type, "type");
        s.g(origin, "origin");
        this.screenshotData = screenshotData;
        this.reportId = reportId;
        this.type = type;
        this.origin = origin;
    }

    public static /* synthetic */ ScreenshotReport copy$default(ScreenshotReport screenshotReport, String str, String str2, ReportType reportType, Origin origin, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = screenshotReport.screenshotData;
        }
        if ((i11 & 2) != 0) {
            str2 = screenshotReport.reportId;
        }
        if ((i11 & 4) != 0) {
            reportType = screenshotReport.type;
        }
        if ((i11 & 8) != 0) {
            origin = screenshotReport.origin;
        }
        return screenshotReport.copy(str, str2, reportType, origin);
    }

    public final String component1() {
        return this.screenshotData;
    }

    public final String component2() {
        return this.reportId;
    }

    public final ReportType component3() {
        return this.type;
    }

    public final Origin component4() {
        return this.origin;
    }

    public final ScreenshotReport copy(String screenshotData, String reportId, ReportType type, Origin origin) {
        s.g(screenshotData, "screenshotData");
        s.g(reportId, "reportId");
        s.g(type, "type");
        s.g(origin, "origin");
        return new ScreenshotReport(screenshotData, reportId, type, origin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScreenshotReport) {
            ScreenshotReport screenshotReport = (ScreenshotReport) obj;
            return s.c(this.screenshotData, screenshotReport.screenshotData) && s.c(this.reportId, screenshotReport.reportId) && this.type == screenshotReport.type && this.origin == screenshotReport.origin;
        }
        return false;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getReportId() {
        return this.reportId;
    }

    public final String getScreenshotData() {
        return this.screenshotData;
    }

    public final ReportType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.screenshotData.hashCode() * 31) + this.reportId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.origin.hashCode();
    }

    public String toString() {
        String str = this.screenshotData;
        String str2 = this.reportId;
        ReportType reportType = this.type;
        Origin origin = this.origin;
        return "ScreenshotReport(screenshotData=" + str + ", reportId=" + str2 + ", type=" + reportType + ", origin=" + origin + ")";
    }

    public /* synthetic */ ScreenshotReport(String str, String str2, ReportType reportType, Origin origin, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? ReportType.SCREENSHOT : reportType, (i11 & 8) != 0 ? Origin.MOBILE_APP : origin);
    }
}