package com.tesla.report;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import org.spongycastle.i18n.ErrorBundle;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/report/ScreenshotReportEnvelopeJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/report/ScreenshotReportEnvelope;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "report_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenshotReportEnvelopeJsonAdapter extends f<ScreenshotReportEnvelope> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21958a;

    /* renamed from: b  reason: collision with root package name */
    private final f<ScreenshotReport> f21959b;

    public ScreenshotReportEnvelopeJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(ErrorBundle.DETAIL_ENTRY);
        s.f(a11, "of(\"details\")");
        this.f21958a = a11;
        d11 = x0.d();
        f<ScreenshotReport> f11 = moshi.f(ScreenshotReport.class, d11, ErrorBundle.DETAIL_ENTRY);
        s.f(f11, "moshi.adapter(Screenshot…a, emptySet(), \"details\")");
        this.f21959b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ScreenshotReportEnvelope b(h reader) {
        s.g(reader, "reader");
        reader.g();
        ScreenshotReport screenshotReport = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21958a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (screenshotReport = this.f21959b.b(reader)) == null) {
                JsonDataException v11 = b.v(ErrorBundle.DETAIL_ENTRY, ErrorBundle.DETAIL_ENTRY, reader);
                s.f(v11, "unexpectedNull(\"details\", \"details\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (screenshotReport != null) {
            return new ScreenshotReportEnvelope(screenshotReport);
        }
        JsonDataException m11 = b.m(ErrorBundle.DETAIL_ENTRY, ErrorBundle.DETAIL_ENTRY, reader);
        s.f(m11, "missingProperty(\"details\", \"details\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ScreenshotReportEnvelope screenshotReportEnvelope) {
        s.g(writer, "writer");
        Objects.requireNonNull(screenshotReportEnvelope, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(ErrorBundle.DETAIL_ENTRY);
        this.f21959b.j(writer, screenshotReportEnvelope.getDetails());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ScreenshotReportEnvelope");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}