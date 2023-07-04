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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ClimateKeeperModeBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ClimateKeeperModeBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ClimateKeeperModeBodyJsonAdapter extends com.squareup.moshi.f<ClimateKeeperModeBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21587a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<ClimateKeeperMode> f21588b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21589c;

    public ClimateKeeperModeBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("climate_keeper_mode", "manual_override");
        s.f(a11, "of(\"climate_keeper_mode\",\n      \"manual_override\")");
        this.f21587a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<ClimateKeeperMode> f11 = moshi.f(ClimateKeeperMode.class, d11, "climateKeeperMode");
        s.f(f11, "moshi.adapter(ClimateKee…t(), \"climateKeeperMode\")");
        this.f21588b = f11;
        Class cls = Boolean.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Boolean> f12 = moshi.f(cls, d12, "manualOverride");
        s.f(f12, "moshi.adapter(Boolean::c…,\n      \"manualOverride\")");
        this.f21589c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ClimateKeeperModeBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        ClimateKeeperMode climateKeeperMode = null;
        Boolean bool = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21587a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                climateKeeperMode = this.f21588b.b(reader);
                if (climateKeeperMode == null) {
                    JsonDataException v11 = kr.b.v("climateKeeperMode", "climate_keeper_mode", reader);
                    s.f(v11, "unexpectedNull(\"climateK…ate_keeper_mode\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (bool = this.f21589c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("manualOverride", "manual_override", reader);
                s.f(v12, "unexpectedNull(\"manualOv…manual_override\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (climateKeeperMode == null) {
            JsonDataException m11 = kr.b.m("climateKeeperMode", "climate_keeper_mode", reader);
            s.f(m11, "missingProperty(\"climate…ate_keeper_mode\", reader)");
            throw m11;
        } else if (bool != null) {
            return new ClimateKeeperModeBody(climateKeeperMode, bool.booleanValue());
        } else {
            JsonDataException m12 = kr.b.m("manualOverride", "manual_override", reader);
            s.f(m12, "missingProperty(\"manualO…manual_override\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ClimateKeeperModeBody climateKeeperModeBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(climateKeeperModeBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("climate_keeper_mode");
        this.f21588b.j(writer, climateKeeperModeBody.a());
        writer.L("manual_override");
        this.f21589c.j(writer, Boolean.valueOf(climateKeeperModeBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClimateKeeperModeBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}