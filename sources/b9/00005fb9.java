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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/AddManagedChargingSiteBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/AddManagedChargingSiteBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AddManagedChargingSiteBodyJsonAdapter extends com.squareup.moshi.f<AddManagedChargingSiteBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21518a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21519b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Float> f21520c;

    public AddManagedChargingSiteBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("public_key", "din", "lat", "lon");
        s.f(a11, "of(\"public_key\", \"din\", \"lat\", \"lon\")");
        this.f21518a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "publicKey");
        s.f(f11, "moshi.adapter(String::cl…Set(),\n      \"publicKey\")");
        this.f21519b = f11;
        Class cls = Float.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Float> f12 = moshi.f(cls, d12, "latitude");
        s.f(f12, "moshi.adapter(Float::cla…ySet(),\n      \"latitude\")");
        this.f21520c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public AddManagedChargingSiteBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        Float f11 = null;
        Float f12 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21518a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21519b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("publicKey", "public_key", reader);
                    s.f(v11, "unexpectedNull(\"publicKe…    \"public_key\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f21519b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = kr.b.v("din", "din", reader);
                    s.f(v12, "unexpectedNull(\"din\", \"din\", reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                f11 = this.f21520c.b(reader);
                if (f11 == null) {
                    JsonDataException v13 = kr.b.v("latitude", "lat", reader);
                    s.f(v13, "unexpectedNull(\"latitude…           \"lat\", reader)");
                    throw v13;
                }
            } else if (G0 == 3 && (f12 = this.f21520c.b(reader)) == null) {
                JsonDataException v14 = kr.b.v("longitude", "lon", reader);
                s.f(v14, "unexpectedNull(\"longitud…           \"lon\", reader)");
                throw v14;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("publicKey", "public_key", reader);
            s.f(m11, "missingProperty(\"publicKey\", \"public_key\", reader)");
            throw m11;
        } else if (str2 == null) {
            JsonDataException m12 = kr.b.m("din", "din", reader);
            s.f(m12, "missingProperty(\"din\", \"din\", reader)");
            throw m12;
        } else if (f11 != null) {
            float floatValue = f11.floatValue();
            if (f12 != null) {
                return new AddManagedChargingSiteBody(str, str2, floatValue, f12.floatValue());
            }
            JsonDataException m13 = kr.b.m("longitude", "lon", reader);
            s.f(m13, "missingProperty(\"longitude\", \"lon\", reader)");
            throw m13;
        } else {
            JsonDataException m14 = kr.b.m("latitude", "lat", reader);
            s.f(m14, "missingProperty(\"latitude\", \"lat\", reader)");
            throw m14;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, AddManagedChargingSiteBody addManagedChargingSiteBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(addManagedChargingSiteBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("public_key");
        this.f21519b.j(writer, addManagedChargingSiteBody.d());
        writer.L("din");
        this.f21519b.j(writer, addManagedChargingSiteBody.a());
        writer.L("lat");
        this.f21520c.j(writer, Float.valueOf(addManagedChargingSiteBody.b()));
        writer.L("lon");
        this.f21520c.j(writer, Float.valueOf(addManagedChargingSiteBody.c()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AddManagedChargingSiteBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}