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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ActivateSpeedLimitBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ActivateSpeedLimitBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ActivateSpeedLimitBodyJsonAdapter extends com.squareup.moshi.f<ActivateSpeedLimitBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21509a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21510b;

    public ActivateSpeedLimitBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("pin");
        s.f(a11, "of(\"pin\")");
        this.f21509a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "pin");
        s.f(f11, "moshi.adapter(String::cl… emptySet(),\n      \"pin\")");
        this.f21510b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ActivateSpeedLimitBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21509a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (str = this.f21510b.b(reader)) == null) {
                JsonDataException v11 = kr.b.v("pin", "pin", reader);
                s.f(v11, "unexpectedNull(\"pin\", \"pin\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (str != null) {
            return new ActivateSpeedLimitBody(str);
        }
        JsonDataException m11 = kr.b.m("pin", "pin", reader);
        s.f(m11, "missingProperty(\"pin\", \"pin\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ActivateSpeedLimitBody activateSpeedLimitBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(activateSpeedLimitBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("pin");
        this.f21510b.j(writer, activateSpeedLimitBody.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ActivateSpeedLimitBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}