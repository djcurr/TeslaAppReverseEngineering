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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/UpdateChargeOnSolarFeatureRequestBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/UpdateChargeOnSolarFeatureRequestBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateChargeOnSolarFeatureRequestBodyJsonAdapter extends com.squareup.moshi.f<UpdateChargeOnSolarFeatureRequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21714a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21715b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Float> f21716c;

    public UpdateChargeOnSolarFeatureRequestBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enabled", "lower_charge_limit", "upper_charge_limit");
        s.f(a11, "of(\"enabled\", \"lower_cha…    \"upper_charge_limit\")");
        this.f21714a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "enabled");
        s.f(f11, "moshi.adapter(Boolean::c…tySet(),\n      \"enabled\")");
        this.f21715b = f11;
        Class cls2 = Float.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Float> f12 = moshi.f(cls2, d12, "lowerChargeLimit");
        s.f(f12, "moshi.adapter(Float::cla…      \"lowerChargeLimit\")");
        this.f21716c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public UpdateChargeOnSolarFeatureRequestBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Float f11 = null;
        Float f12 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21714a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bool = this.f21715b.b(reader);
                if (bool == null) {
                    JsonDataException v11 = kr.b.v("enabled", "enabled", reader);
                    s.f(v11, "unexpectedNull(\"enabled\"…       \"enabled\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                f11 = this.f21716c.b(reader);
                if (f11 == null) {
                    JsonDataException v12 = kr.b.v("lowerChargeLimit", "lower_charge_limit", reader);
                    s.f(v12, "unexpectedNull(\"lowerCha…er_charge_limit\", reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (f12 = this.f21716c.b(reader)) == null) {
                JsonDataException v13 = kr.b.v("upperChargeLimit", "upper_charge_limit", reader);
                s.f(v13, "unexpectedNull(\"upperCha…er_charge_limit\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (f11 != null) {
                float floatValue = f11.floatValue();
                if (f12 != null) {
                    return new UpdateChargeOnSolarFeatureRequestBody(booleanValue, floatValue, f12.floatValue());
                }
                JsonDataException m11 = kr.b.m("upperChargeLimit", "upper_charge_limit", reader);
                s.f(m11, "missingProperty(\"upperCh…er_charge_limit\", reader)");
                throw m11;
            }
            JsonDataException m12 = kr.b.m("lowerChargeLimit", "lower_charge_limit", reader);
            s.f(m12, "missingProperty(\"lowerCh…er_charge_limit\", reader)");
            throw m12;
        }
        JsonDataException m13 = kr.b.m("enabled", "enabled", reader);
        s.f(m13, "missingProperty(\"enabled\", \"enabled\", reader)");
        throw m13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, UpdateChargeOnSolarFeatureRequestBody updateChargeOnSolarFeatureRequestBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(updateChargeOnSolarFeatureRequestBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enabled");
        this.f21715b.j(writer, Boolean.valueOf(updateChargeOnSolarFeatureRequestBody.a()));
        writer.L("lower_charge_limit");
        this.f21716c.j(writer, Float.valueOf(updateChargeOnSolarFeatureRequestBody.b()));
        writer.L("upper_charge_limit");
        this.f21716c.j(writer, Float.valueOf(updateChargeOnSolarFeatureRequestBody.c()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UpdateChargeOnSolarFeatureRequestBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}