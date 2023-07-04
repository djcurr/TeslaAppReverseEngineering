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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JE\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u000e\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0010\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0011\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/tesla/report/LogReport;", "", "", "component1", "component2", "", "component3", "component4", "Lcom/tesla/report/ReportType;", "component5", "Lcom/tesla/report/Origin;", "component6", "sequence", "total", "logEntries", "reportId", "type", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "copy", "toString", "hashCode", "other", "", "equals", "I", "getSequence", "()I", "getTotal", "Ljava/lang/String;", "getLogEntries", "()Ljava/lang/String;", "getReportId", "Lcom/tesla/report/ReportType;", "getType", "()Lcom/tesla/report/ReportType;", "Lcom/tesla/report/Origin;", "getOrigin", "()Lcom/tesla/report/Origin;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Lcom/tesla/report/ReportType;Lcom/tesla/report/Origin;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class LogReport {
    @b(name = "log_entries")
    private final String logEntries;
    @b(name = AppMeasurementSdk.ConditionalUserProperty.ORIGIN)
    private final Origin origin;
    @b(name = "report_id")
    private final String reportId;
    @b(name = "sequence")
    private final int sequence;
    @b(name = "total")
    private final int total;
    @b(name = "type")
    private final ReportType type;

    public LogReport(int i11, int i12, String logEntries, String reportId, ReportType type, Origin origin) {
        s.g(logEntries, "logEntries");
        s.g(reportId, "reportId");
        s.g(type, "type");
        s.g(origin, "origin");
        this.sequence = i11;
        this.total = i12;
        this.logEntries = logEntries;
        this.reportId = reportId;
        this.type = type;
        this.origin = origin;
    }

    public static /* synthetic */ LogReport copy$default(LogReport logReport, int i11, int i12, String str, String str2, ReportType reportType, Origin origin, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = logReport.sequence;
        }
        if ((i13 & 2) != 0) {
            i12 = logReport.total;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            str = logReport.logEntries;
        }
        String str3 = str;
        if ((i13 & 8) != 0) {
            str2 = logReport.reportId;
        }
        String str4 = str2;
        if ((i13 & 16) != 0) {
            reportType = logReport.type;
        }
        ReportType reportType2 = reportType;
        if ((i13 & 32) != 0) {
            origin = logReport.origin;
        }
        return logReport.copy(i11, i14, str3, str4, reportType2, origin);
    }

    public final int component1() {
        return this.sequence;
    }

    public final int component2() {
        return this.total;
    }

    public final String component3() {
        return this.logEntries;
    }

    public final String component4() {
        return this.reportId;
    }

    public final ReportType component5() {
        return this.type;
    }

    public final Origin component6() {
        return this.origin;
    }

    public final LogReport copy(int i11, int i12, String logEntries, String reportId, ReportType type, Origin origin) {
        s.g(logEntries, "logEntries");
        s.g(reportId, "reportId");
        s.g(type, "type");
        s.g(origin, "origin");
        return new LogReport(i11, i12, logEntries, reportId, type, origin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogReport) {
            LogReport logReport = (LogReport) obj;
            return this.sequence == logReport.sequence && this.total == logReport.total && s.c(this.logEntries, logReport.logEntries) && s.c(this.reportId, logReport.reportId) && this.type == logReport.type && this.origin == logReport.origin;
        }
        return false;
    }

    public final String getLogEntries() {
        return this.logEntries;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getReportId() {
        return this.reportId;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final int getTotal() {
        return this.total;
    }

    public final ReportType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.sequence) * 31) + Integer.hashCode(this.total)) * 31) + this.logEntries.hashCode()) * 31) + this.reportId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.origin.hashCode();
    }

    public String toString() {
        int i11 = this.sequence;
        int i12 = this.total;
        String str = this.logEntries;
        String str2 = this.reportId;
        ReportType reportType = this.type;
        Origin origin = this.origin;
        return "LogReport(sequence=" + i11 + ", total=" + i12 + ", logEntries=" + str + ", reportId=" + str2 + ", type=" + reportType + ", origin=" + origin + ")";
    }

    public /* synthetic */ LogReport(int i11, int i12, String str, String str2, ReportType reportType, Origin origin, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, str, str2, (i13 & 16) != 0 ? ReportType.LOG : reportType, (i13 & 32) != 0 ? Origin.MOBILE_APP : origin);
    }
}