package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep_CountrySelect_ConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$CountrySelect$Config;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NextStep_CountrySelect_ConfigJsonAdapter extends f<NextStep.CountrySelect.Config> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22733a;

    /* renamed from: b  reason: collision with root package name */
    private final f<List<String>> f22734b;

    public NextStep_CountrySelect_ConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enabledCountryCodes");
        s.f(a11, "of(\"enabledCountryCodes\")");
        this.f22733a = a11;
        ParameterizedType k11 = r.k(List.class, String.class);
        d11 = x0.d();
        f<List<String>> f11 = moshi.f(k11, d11, "enabledCountryCodes");
        s.f(f11, "moshi.adapter(Types.newP…   \"enabledCountryCodes\")");
        this.f22734b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public NextStep.CountrySelect.Config b(h reader) {
        s.g(reader, "reader");
        reader.g();
        List<String> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22733a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                list = this.f22734b.b(reader);
            }
        }
        reader.l();
        return new NextStep.CountrySelect.Config(list);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, NextStep.CountrySelect.Config config) {
        s.g(writer, "writer");
        Objects.requireNonNull(config, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enabledCountryCodes");
        this.f22734b.j(writer, config.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.CountrySelect.Config");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}