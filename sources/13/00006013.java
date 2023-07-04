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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SpeedLimitSetLimitBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SpeedLimitSetLimitBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SpeedLimitSetLimitBodyJsonAdapter extends com.squareup.moshi.f<SpeedLimitSetLimitBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21696a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Double> f21697b;

    public SpeedLimitSetLimitBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("limit_mph");
        s.f(a11, "of(\"limit_mph\")");
        this.f21696a = a11;
        Class cls = Double.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Double> f11 = moshi.f(cls, d11, "limitMPH");
        s.f(f11, "moshi.adapter(Double::cl…ySet(),\n      \"limitMPH\")");
        this.f21697b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SpeedLimitSetLimitBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Double d11 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21696a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (d11 = this.f21697b.b(reader)) == null) {
                JsonDataException v11 = kr.b.v("limitMPH", "limit_mph", reader);
                s.f(v11, "unexpectedNull(\"limitMPH…     \"limit_mph\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (d11 != null) {
            return new SpeedLimitSetLimitBody(d11.doubleValue());
        }
        JsonDataException m11 = kr.b.m("limitMPH", "limit_mph", reader);
        s.f(m11, "missingProperty(\"limitMPH\", \"limit_mph\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SpeedLimitSetLimitBody speedLimitSetLimitBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(speedLimitSetLimitBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("limit_mph");
        this.f21697b.j(writer, Double.valueOf(speedLimitSetLimitBody.a()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SpeedLimitSetLimitBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}