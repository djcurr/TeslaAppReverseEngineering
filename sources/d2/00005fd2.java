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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ChargingAmpsBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ChargingAmpsBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ChargingAmpsBodyJsonAdapter extends com.squareup.moshi.f<ChargingAmpsBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21583a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Integer> f21584b;

    public ChargingAmpsBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("charging_amps");
        s.f(a11, "of(\"charging_amps\")");
        this.f21583a = a11;
        Class cls = Integer.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Integer> f11 = moshi.f(cls, d11, "chargingAmps");
        s.f(f11, "moshi.adapter(Int::class…(),\n      \"chargingAmps\")");
        this.f21584b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ChargingAmpsBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Integer num = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21583a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (num = this.f21584b.b(reader)) == null) {
                JsonDataException v11 = kr.b.v("chargingAmps", "charging_amps", reader);
                s.f(v11, "unexpectedNull(\"charging… \"charging_amps\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (num != null) {
            return new ChargingAmpsBody(num.intValue());
        }
        JsonDataException m11 = kr.b.m("chargingAmps", "charging_amps", reader);
        s.f(m11, "missingProperty(\"chargin…mps\",\n            reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ChargingAmpsBody chargingAmpsBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(chargingAmpsBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("charging_amps");
        this.f21584b.j(writer, Integer.valueOf(chargingAmpsBody.a()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ChargingAmpsBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}