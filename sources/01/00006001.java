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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SetCabinOverheatProtectionBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/SetCabinOverheatProtectionBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetCabinOverheatProtectionBodyJsonAdapter extends com.squareup.moshi.f<SetCabinOverheatProtectionBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21654a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21655b;

    public SetCabinOverheatProtectionBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("fan_only", "on");
        s.f(a11, "of(\"fan_only\", \"on\")");
        this.f21654a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "fanOnly");
        s.f(f11, "moshi.adapter(Boolean::c…tySet(),\n      \"fanOnly\")");
        this.f21655b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SetCabinOverheatProtectionBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21654a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bool = this.f21655b.b(reader);
                if (bool == null) {
                    JsonDataException v11 = kr.b.v("fanOnly", "fan_only", reader);
                    s.f(v11, "unexpectedNull(\"fanOnly\"…      \"fan_only\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (bool2 = this.f21655b.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("on", "on", reader);
                s.f(v12, "unexpectedNull(\"on\", \"on\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bool2 != null) {
                return new SetCabinOverheatProtectionBody(booleanValue, bool2.booleanValue());
            }
            JsonDataException m11 = kr.b.m("on", "on", reader);
            s.f(m11, "missingProperty(\"on\", \"on\", reader)");
            throw m11;
        }
        JsonDataException m12 = kr.b.m("fanOnly", "fan_only", reader);
        s.f(m12, "missingProperty(\"fanOnly\", \"fan_only\", reader)");
        throw m12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SetCabinOverheatProtectionBody setCabinOverheatProtectionBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(setCabinOverheatProtectionBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("fan_only");
        this.f21655b.j(writer, Boolean.valueOf(setCabinOverheatProtectionBody.a()));
        writer.L("on");
        this.f21655b.j(writer, Boolean.valueOf(setCabinOverheatProtectionBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SetCabinOverheatProtectionBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}