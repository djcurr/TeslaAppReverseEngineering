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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep_Selfie_ConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$Selfie$Config;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NextStep_Selfie_ConfigJsonAdapter extends f<NextStep.Selfie.Config> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22764a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22765b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Boolean> f22766c;

    public NextStep_Selfie_ConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("requireSelfieMatch", "skipStart");
        s.f(a11, "of(\"requireSelfieMatch\", \"skipStart\")");
        this.f22764a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "requireSelfieMatch");
        s.f(f11, "moshi.adapter(String::cl…(), \"requireSelfieMatch\")");
        this.f22765b = f11;
        d12 = x0.d();
        f<Boolean> f12 = moshi.f(Boolean.class, d12, "skipStart");
        s.f(f12, "moshi.adapter(Boolean::c… emptySet(), \"skipStart\")");
        this.f22766c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public NextStep.Selfie.Config b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        Boolean bool = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22764a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22765b.b(reader);
            } else if (G0 == 1) {
                bool = this.f22766c.b(reader);
            }
        }
        reader.l();
        return new NextStep.Selfie.Config(str, bool);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, NextStep.Selfie.Config config) {
        s.g(writer, "writer");
        Objects.requireNonNull(config, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("requireSelfieMatch");
        this.f22765b.j(writer, config.a());
        writer.L("skipStart");
        this.f22766c.j(writer, config.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.Selfie.Config");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}