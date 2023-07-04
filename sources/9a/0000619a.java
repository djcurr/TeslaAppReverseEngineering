package com.tesla.report;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.ErrorBundle;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tesla/report/ScreenshotReportEnvelope;", "", "Lcom/tesla/report/ScreenshotReport;", "component1", ErrorBundle.DETAIL_ENTRY, "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/tesla/report/ScreenshotReport;", "getDetails", "()Lcom/tesla/report/ScreenshotReport;", "<init>", "(Lcom/tesla/report/ScreenshotReport;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenshotReportEnvelope {
    @b(name = ErrorBundle.DETAIL_ENTRY)
    private final ScreenshotReport details;

    public ScreenshotReportEnvelope(ScreenshotReport details) {
        s.g(details, "details");
        this.details = details;
    }

    public static /* synthetic */ ScreenshotReportEnvelope copy$default(ScreenshotReportEnvelope screenshotReportEnvelope, ScreenshotReport screenshotReport, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            screenshotReport = screenshotReportEnvelope.details;
        }
        return screenshotReportEnvelope.copy(screenshotReport);
    }

    public final ScreenshotReport component1() {
        return this.details;
    }

    public final ScreenshotReportEnvelope copy(ScreenshotReport details) {
        s.g(details, "details");
        return new ScreenshotReportEnvelope(details);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenshotReportEnvelope) && s.c(this.details, ((ScreenshotReportEnvelope) obj).details);
    }

    public final ScreenshotReport getDetails() {
        return this.details;
    }

    public int hashCode() {
        return this.details.hashCode();
    }

    public String toString() {
        ScreenshotReport screenshotReport = this.details;
        return "ScreenshotReportEnvelope(details=" + screenshotReport + ")";
    }
}