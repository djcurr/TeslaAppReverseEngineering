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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/TriggerHomelinkBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/TriggerHomelinkBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TriggerHomelinkBodyJsonAdapter extends com.squareup.moshi.f<TriggerHomelinkBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21708a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Float> f21709b;

    public TriggerHomelinkBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("lat", "lon");
        s.f(a11, "of(\"lat\", \"lon\")");
        this.f21708a = a11;
        Class cls = Float.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Float> f11 = moshi.f(cls, d11, "latitude");
        s.f(f11, "moshi.adapter(Float::cla…ySet(),\n      \"latitude\")");
        this.f21709b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public TriggerHomelinkBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Float f11 = null;
        Float f12 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21708a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                f11 = this.f21709b.b(reader);
                if (f11 == null) {
                    JsonDataException v11 = kr.b.v("latitude", "lat", reader);
                    s.f(v11, "unexpectedNull(\"latitude…           \"lat\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (f12 = this.f21709b.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("longitude", "lon", reader);
                s.f(v12, "unexpectedNull(\"longitud…           \"lon\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (f11 != null) {
            float floatValue = f11.floatValue();
            if (f12 != null) {
                return new TriggerHomelinkBody(floatValue, f12.floatValue());
            }
            JsonDataException m11 = kr.b.m("longitude", "lon", reader);
            s.f(m11, "missingProperty(\"longitude\", \"lon\", reader)");
            throw m11;
        }
        JsonDataException m12 = kr.b.m("latitude", "lat", reader);
        s.f(m12, "missingProperty(\"latitude\", \"lat\", reader)");
        throw m12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, TriggerHomelinkBody triggerHomelinkBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(triggerHomelinkBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("lat");
        this.f21709b.j(writer, Float.valueOf(triggerHomelinkBody.a()));
        writer.L("lon");
        this.f21709b.j(writer, Float.valueOf(triggerHomelinkBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("TriggerHomelinkBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}