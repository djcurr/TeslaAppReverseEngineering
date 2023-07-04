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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SetScheduledChargingBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SetScheduledChargingBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetScheduledChargingBodyJsonAdapter extends com.squareup.moshi.f<SetScheduledChargingBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21661a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21662b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Integer> f21663c;

    public SetScheduledChargingBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enable", "time");
        s.f(a11, "of(\"enable\", \"time\")");
        this.f21661a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "enable");
        s.f(f11, "moshi.adapter(Boolean::c…ptySet(),\n      \"enable\")");
        this.f21662b = f11;
        Class cls2 = Integer.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Integer> f12 = moshi.f(cls2, d12, "time");
        s.f(f12, "moshi.adapter(Int::class.java, emptySet(), \"time\")");
        this.f21663c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SetScheduledChargingBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Integer num = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21661a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bool = this.f21662b.b(reader);
                if (bool == null) {
                    JsonDataException v11 = kr.b.v("enable", "enable", reader);
                    s.f(v11, "unexpectedNull(\"enable\",…        \"enable\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (num = this.f21663c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("time", "time", reader);
                s.f(v12, "unexpectedNull(\"time\", \"time\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (num != null) {
                return new SetScheduledChargingBody(booleanValue, num.intValue());
            }
            JsonDataException m11 = kr.b.m("time", "time", reader);
            s.f(m11, "missingProperty(\"time\", \"time\", reader)");
            throw m11;
        }
        JsonDataException m12 = kr.b.m("enable", "enable", reader);
        s.f(m12, "missingProperty(\"enable\", \"enable\", reader)");
        throw m12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SetScheduledChargingBody setScheduledChargingBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(setScheduledChargingBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enable");
        this.f21662b.j(writer, Boolean.valueOf(setScheduledChargingBody.a()));
        writer.L("time");
        this.f21663c.j(writer, Integer.valueOf(setScheduledChargingBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SetScheduledChargingBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}