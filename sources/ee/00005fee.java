package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.tesla.data.HttpMethodType;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/OwnerApiEndpointJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/OwnerApiEndpoint;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OwnerApiEndpointJsonAdapter extends com.squareup.moshi.f<OwnerApiEndpoint> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21625a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<HttpMethodType> f21626b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21627c;

    /* renamed from: d  reason: collision with root package name */
    private final com.squareup.moshi.f<Boolean> f21628d;

    public OwnerApiEndpointJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("TYPE", "URI", "AUTH");
        s.f(a11, "of(\"TYPE\", \"URI\", \"AUTH\")");
        this.f21625a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<HttpMethodType> f11 = moshi.f(HttpMethodType.class, d11, "method");
        s.f(f11, "moshi.adapter(HttpMethod…va, emptySet(), \"method\")");
        this.f21626b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<String> f12 = moshi.f(String.class, d12, "uri");
        s.f(f12, "moshi.adapter(String::cl… emptySet(),\n      \"uri\")");
        this.f21627c = f12;
        Class cls = Boolean.TYPE;
        d13 = x0.d();
        com.squareup.moshi.f<Boolean> f13 = moshi.f(cls, d13, "isAuthenticated");
        s.f(f13, "moshi.adapter(Boolean::c…\n      \"isAuthenticated\")");
        this.f21628d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public OwnerApiEndpoint b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        HttpMethodType httpMethodType = null;
        String str = null;
        Boolean bool = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21625a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                httpMethodType = this.f21626b.b(reader);
                if (httpMethodType == null) {
                    JsonDataException v11 = kr.b.v("method", "TYPE", reader);
                    s.f(v11, "unexpectedNull(\"method\",…          \"TYPE\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str = this.f21627c.b(reader);
                if (str == null) {
                    JsonDataException v12 = kr.b.v("uri", "URI", reader);
                    s.f(v12, "unexpectedNull(\"uri\", \"URI\", reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (bool = this.f21628d.b(reader)) == null) {
                JsonDataException v13 = kr.b.v("isAuthenticated", "AUTH", reader);
                s.f(v13, "unexpectedNull(\"isAuthenticated\", \"AUTH\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (httpMethodType == null) {
            JsonDataException m11 = kr.b.m("method", "TYPE", reader);
            s.f(m11, "missingProperty(\"method\", \"TYPE\", reader)");
            throw m11;
        } else if (str == null) {
            JsonDataException m12 = kr.b.m("uri", "URI", reader);
            s.f(m12, "missingProperty(\"uri\", \"URI\", reader)");
            throw m12;
        } else if (bool != null) {
            return new OwnerApiEndpoint(httpMethodType, str, bool.booleanValue());
        } else {
            JsonDataException m13 = kr.b.m("isAuthenticated", "AUTH", reader);
            s.f(m13, "missingProperty(\"isAuthe…UTH\",\n            reader)");
            throw m13;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, OwnerApiEndpoint ownerApiEndpoint) {
        s.g(writer, "writer");
        Objects.requireNonNull(ownerApiEndpoint, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("TYPE");
        this.f21626b.j(writer, ownerApiEndpoint.getMethod());
        writer.L("URI");
        this.f21627c.j(writer, ownerApiEndpoint.getUri());
        writer.L("AUTH");
        this.f21628d.j(writer, Boolean.valueOf(ownerApiEndpoint.isAuthenticated()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OwnerApiEndpoint");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}