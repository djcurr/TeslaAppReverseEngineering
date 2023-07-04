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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/HVACBioweaponModeBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/HVACBioweaponModeBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class HVACBioweaponModeBodyJsonAdapter extends com.squareup.moshi.f<HVACBioweaponModeBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21606a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21607b;

    public HVACBioweaponModeBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("on", "manual_override");
        s.f(a11, "of(\"on\", \"manual_override\")");
        this.f21606a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Boolean> f11 = moshi.f(cls, d11, "on");
        s.f(f11, "moshi.adapter(Boolean::c…, emptySet(),\n      \"on\")");
        this.f21607b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public HVACBioweaponModeBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21606a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bool = this.f21607b.b(reader);
                if (bool == null) {
                    JsonDataException v11 = kr.b.v("on", "on", reader);
                    s.f(v11, "unexpectedNull(\"on\", \"on\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (bool2 = this.f21607b.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("manualOverride", "manual_override", reader);
                s.f(v12, "unexpectedNull(\"manualOv…manual_override\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (bool2 != null) {
                return new HVACBioweaponModeBody(booleanValue, bool2.booleanValue());
            }
            JsonDataException m11 = kr.b.m("manualOverride", "manual_override", reader);
            s.f(m11, "missingProperty(\"manualO…manual_override\", reader)");
            throw m11;
        }
        JsonDataException m12 = kr.b.m("on", "on", reader);
        s.f(m12, "missingProperty(\"on\", \"on\", reader)");
        throw m12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, HVACBioweaponModeBody hVACBioweaponModeBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(hVACBioweaponModeBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("on");
        this.f21607b.j(writer, Boolean.valueOf(hVACBioweaponModeBody.b()));
        writer.L("manual_override");
        this.f21607b.j(writer, Boolean.valueOf(hVACBioweaponModeBody.a()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("HVACBioweaponModeBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}