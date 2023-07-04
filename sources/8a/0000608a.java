package com.tesla.domain.model;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/domain/model/ReverseGeocodedObjectJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/domain/model/ReverseGeocodedObject;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReverseGeocodedObjectJsonAdapter extends f<ReverseGeocodedObject> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21827a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f21828b;

    public ReverseGeocodedObjectJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("name", "city");
        s.f(a11, "of(\"name\", \"city\")");
        this.f21827a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "name");
        s.f(f11, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.f21828b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ReverseGeocodedObject b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21827a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21828b.b(reader);
            } else if (G0 == 1) {
                str2 = this.f21828b.b(reader);
            }
        }
        reader.l();
        return new ReverseGeocodedObject(str, str2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ReverseGeocodedObject reverseGeocodedObject) {
        s.g(writer, "writer");
        Objects.requireNonNull(reverseGeocodedObject, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("name");
        this.f21828b.j(writer, reverseGeocodedObject.getName());
        writer.L("city");
        this.f21828b.j(writer, reverseGeocodedObject.getCity());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ReverseGeocodedObject");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}