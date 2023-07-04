package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/NextStep_GovernmentId_ConfigJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/NextStep$GovernmentId$Config;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NextStep_GovernmentId_ConfigJsonAdapter extends f<NextStep.GovernmentId.Config> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22757a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Map<String, List<Id>>> f22758b;

    public NextStep_GovernmentId_ConfigJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enabledIdClassesByCountry");
        s.f(a11, "of(\"enabledIdClassesByCountry\")");
        this.f22757a = a11;
        ParameterizedType k11 = r.k(Map.class, String.class, r.k(List.class, Id.class));
        d11 = x0.d();
        f<Map<String, List<Id>>> f11 = moshi.f(k11, d11, "enabledIdClassesByCountry");
        s.f(f11, "moshi.adapter(Types.newP…abledIdClassesByCountry\")");
        this.f22758b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public NextStep.GovernmentId.Config b(h reader) {
        s.g(reader, "reader");
        reader.g();
        Map<String, List<Id>> map = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22757a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                map = this.f22758b.b(reader);
            }
        }
        reader.l();
        return new NextStep.GovernmentId.Config(map);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, NextStep.GovernmentId.Config config) {
        s.g(writer, "writer");
        Objects.requireNonNull(config, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enabledIdClassesByCountry");
        this.f22758b.j(writer, config.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.GovernmentId.Config");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}