package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep_Failed_ConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Failed$Config;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NextStep_Failed_ConfigJsonAdapter extends f<NextStep.Failed.Config> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22748a;

    /* renamed from: b  reason: collision with root package name */
    private final f<NextStep.b> f22749b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Boolean> f22750c;

    /* renamed from: d  reason: collision with root package name */
    private final f<NextStep.Failed.CustomTranslations> f22751d;

    public NextStep_Failed_ConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("pictograph", "hasSupport", "customTranslations");
        s.f(a11, "of(\"pictograph\", \"hasSup…    \"customTranslations\")");
        this.f22748a = a11;
        d11 = x0.d();
        f<NextStep.b> f11 = moshi.f(NextStep.b.class, d11, "pictograph");
        s.f(f11, "moshi.adapter(NextStep.P…emptySet(), \"pictograph\")");
        this.f22749b = f11;
        d12 = x0.d();
        f<Boolean> f12 = moshi.f(Boolean.class, d12, "hasSupport");
        s.f(f12, "moshi.adapter(Boolean::c…emptySet(), \"hasSupport\")");
        this.f22750c = f12;
        d13 = x0.d();
        f<NextStep.Failed.CustomTranslations> f13 = moshi.f(NextStep.Failed.CustomTranslations.class, d13, "customTranslations");
        s.f(f13, "moshi.adapter(NextStep.F…    \"customTranslations\")");
        this.f22751d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public NextStep.Failed.Config b(h reader) {
        s.g(reader, "reader");
        reader.g();
        NextStep.b bVar = null;
        Boolean bool = null;
        NextStep.Failed.CustomTranslations customTranslations = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22748a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bVar = this.f22749b.b(reader);
            } else if (G0 == 1) {
                bool = this.f22750c.b(reader);
            } else if (G0 == 2) {
                customTranslations = this.f22751d.b(reader);
            }
        }
        reader.l();
        return new NextStep.Failed.Config(bVar, bool, customTranslations);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, NextStep.Failed.Config config) {
        s.g(writer, "writer");
        Objects.requireNonNull(config, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("pictograph");
        this.f22749b.j(writer, config.c());
        writer.L("hasSupport");
        this.f22750c.j(writer, config.b());
        writer.L("customTranslations");
        this.f22751d.j(writer, config.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.Failed.Config");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}