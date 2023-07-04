package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ChangeSunroofStateBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ChangeSunroofStateBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ChangeSunroofStateBodyJsonAdapter extends com.squareup.moshi.f<ChangeSunroofStateBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21580a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<SunroofStateChange> f21581b;

    public ChangeSunroofStateBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("state");
        s.f(a11, "of(\"state\")");
        this.f21580a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<SunroofStateChange> f11 = moshi.f(SunroofStateChange.class, d11, "state");
        s.f(f11, "moshi.adapter(SunroofSta…ava, emptySet(), \"state\")");
        this.f21581b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ChangeSunroofStateBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        SunroofStateChange sunroofStateChange = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21580a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (sunroofStateChange = this.f21581b.b(reader)) == null) {
                JsonDataException v11 = kr.b.v("state", "state", reader);
                s.f(v11, "unexpectedNull(\"state\", \"state\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (sunroofStateChange != null) {
            return new ChangeSunroofStateBody(sunroofStateChange);
        }
        JsonDataException m11 = kr.b.m("state", "state", reader);
        s.f(m11, "missingProperty(\"state\", \"state\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ChangeSunroofStateBody changeSunroofStateBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(changeSunroofStateBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("state");
        this.f21581b.j(writer, changeSunroofStateBody.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ChangeSunroofStateBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}