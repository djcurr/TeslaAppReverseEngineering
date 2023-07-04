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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/FetchNearbyChargingBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/FetchNearbyChargingBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FetchNearbyChargingBodyJsonAdapter extends com.squareup.moshi.f<FetchNearbyChargingBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21601a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<Integer> f21602b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21603c;

    public FetchNearbyChargingBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("radius", "count", "include_metadata", "detail");
        s.f(a11, "of(\"radius\", \"count\",\n  …lude_metadata\", \"detail\")");
        this.f21601a = a11;
        Class cls = Integer.TYPE;
        d11 = x0.d();
        com.squareup.moshi.f<Integer> f11 = moshi.f(cls, d11, "radius");
        s.f(f11, "moshi.adapter(Int::class…va, emptySet(), \"radius\")");
        this.f21602b = f11;
        Class cls2 = Boolean.TYPE;
        d12 = x0.d();
        com.squareup.moshi.f<Boolean> f12 = moshi.f(cls2, d12, "includeMetadata");
        s.f(f12, "moshi.adapter(Boolean::c…\n      \"includeMetadata\")");
        this.f21603c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public FetchNearbyChargingBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21601a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                num = this.f21602b.b(reader);
                if (num == null) {
                    JsonDataException v11 = kr.b.v("radius", "radius", reader);
                    s.f(v11, "unexpectedNull(\"radius\",…ius\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                num2 = this.f21602b.b(reader);
                if (num2 == null) {
                    JsonDataException v12 = kr.b.v("count", "count", reader);
                    s.f(v12, "unexpectedNull(\"count\", …unt\",\n            reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                bool = this.f21603c.b(reader);
                if (bool == null) {
                    JsonDataException v13 = kr.b.v("includeMetadata", "include_metadata", reader);
                    s.f(v13, "unexpectedNull(\"includeM…nclude_metadata\", reader)");
                    throw v13;
                }
            } else if (G0 == 3 && (bool2 = this.f21603c.b(reader)) == null) {
                JsonDataException v14 = kr.b.v("detail", "detail", reader);
                s.f(v14, "unexpectedNull(\"detail\",…        \"detail\", reader)");
                throw v14;
            }
        }
        reader.l();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (bool2 != null) {
                        return new FetchNearbyChargingBody(intValue, intValue2, booleanValue, bool2.booleanValue());
                    }
                    JsonDataException m11 = kr.b.m("detail", "detail", reader);
                    s.f(m11, "missingProperty(\"detail\", \"detail\", reader)");
                    throw m11;
                }
                JsonDataException m12 = kr.b.m("includeMetadata", "include_metadata", reader);
                s.f(m12, "missingProperty(\"include…nclude_metadata\", reader)");
                throw m12;
            }
            JsonDataException m13 = kr.b.m("count", "count", reader);
            s.f(m13, "missingProperty(\"count\", \"count\", reader)");
            throw m13;
        }
        JsonDataException m14 = kr.b.m("radius", "radius", reader);
        s.f(m14, "missingProperty(\"radius\", \"radius\", reader)");
        throw m14;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, FetchNearbyChargingBody fetchNearbyChargingBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(fetchNearbyChargingBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("radius");
        this.f21602b.j(writer, Integer.valueOf(fetchNearbyChargingBody.d()));
        writer.L("count");
        this.f21602b.j(writer, Integer.valueOf(fetchNearbyChargingBody.a()));
        writer.L("include_metadata");
        this.f21603c.j(writer, Boolean.valueOf(fetchNearbyChargingBody.c()));
        writer.L("detail");
        this.f21603c.j(writer, Boolean.valueOf(fetchNearbyChargingBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FetchNearbyChargingBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}