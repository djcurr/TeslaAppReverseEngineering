package com.tesla.features;

import ch.qos.logback.core.CoreConstants;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/features/FeaturesConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/features/FeaturesConfig;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FeaturesConfigJsonAdapter extends f<FeaturesConfig> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21858a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Signaling> f21859b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<FeaturesConfig> f21860c;

    public FeaturesConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("signaling");
        s.f(a11, "of(\"signaling\")");
        this.f21858a = a11;
        d11 = x0.d();
        f<Signaling> f11 = moshi.f(Signaling.class, d11, "signaling");
        s.f(f11, "moshi.adapter(Signaling:… emptySet(), \"signaling\")");
        this.f21859b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public FeaturesConfig b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        Signaling signaling = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21858a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                signaling = this.f21859b.b(reader);
                if (signaling == null) {
                    JsonDataException v11 = b.v("signaling", "signaling", reader);
                    s.f(v11, "unexpectedNull(\"signalin…     \"signaling\", reader)");
                    throw v11;
                }
                i11 &= -2;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -2) {
            Objects.requireNonNull(signaling, "null cannot be cast to non-null type com.tesla.features.Signaling");
            return new FeaturesConfig(signaling);
        }
        Constructor<FeaturesConfig> constructor = this.f21860c;
        if (constructor == null) {
            constructor = FeaturesConfig.class.getDeclaredConstructor(Signaling.class, Integer.TYPE, b.f35691c);
            this.f21860c = constructor;
            s.f(constructor, "FeaturesConfig::class.ja…his.constructorRef = it }");
        }
        FeaturesConfig newInstance = constructor.newInstance(signaling, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, FeaturesConfig featuresConfig) {
        s.g(writer, "writer");
        Objects.requireNonNull(featuresConfig, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("signaling");
        this.f21859b.j(writer, featuresConfig.getSignaling());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FeaturesConfig");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}