package com.tesla.features;

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
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/features/FeaturesConfigEnvelopeJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/features/FeaturesConfigEnvelope;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FeaturesConfigEnvelopeJsonAdapter extends f<FeaturesConfigEnvelope> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21856a;

    /* renamed from: b  reason: collision with root package name */
    private final f<FeaturesConfig> f21857b;

    public FeaturesConfigEnvelopeJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("response");
        s.f(a11, "of(\"response\")");
        this.f21856a = a11;
        d11 = x0.d();
        f<FeaturesConfig> f11 = moshi.f(FeaturesConfig.class, d11, "config");
        s.f(f11, "moshi.adapter(FeaturesCo…va, emptySet(), \"config\")");
        this.f21857b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public FeaturesConfigEnvelope b(h reader) {
        s.g(reader, "reader");
        reader.g();
        FeaturesConfig featuresConfig = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21856a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (featuresConfig = this.f21857b.b(reader)) == null) {
                JsonDataException v11 = b.v("config", "response", reader);
                s.f(v11, "unexpectedNull(\"config\",…      \"response\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (featuresConfig != null) {
            return new FeaturesConfigEnvelope(featuresConfig);
        }
        JsonDataException m11 = b.m("config", "response", reader);
        s.f(m11, "missingProperty(\"config\", \"response\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, FeaturesConfigEnvelope featuresConfigEnvelope) {
        s.g(writer, "writer");
        Objects.requireNonNull(featuresConfigEnvelope, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("response");
        this.f21857b.j(writer, featuresConfigEnvelope.getConfig());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FeaturesConfigEnvelope");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}