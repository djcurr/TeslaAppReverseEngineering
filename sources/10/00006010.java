package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.stripe.android.networking.FraudDetectionData;
import com.tesla.data.oapi.ShareCommandRequestBody;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ShareCommandRequestBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ShareCommandRequestBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ShareCommandRequestBodyJsonAdapter extends com.squareup.moshi.f<ShareCommandRequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21689a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21690b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<ShareCommandRequestBody.Value> f21691c;

    /* renamed from: d  reason: collision with root package name */
    private final com.squareup.moshi.f<Long> f21692d;

    public ShareCommandRequestBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("type", "value", "locale", FraudDetectionData.KEY_TIMESTAMP);
        s.f(a11, "of(\"type\", \"value\", \"locale\",\n      \"timestamp\")");
        this.f21689a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "type");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f21690b = f11;
        d12 = x0.d();
        com.squareup.moshi.f<ShareCommandRequestBody.Value> f12 = moshi.f(ShareCommandRequestBody.Value.class, d12, "value");
        s.f(f12, "moshi.adapter(ShareComma…ava, emptySet(), \"value\")");
        this.f21691c = f12;
        Class cls = Long.TYPE;
        d13 = x0.d();
        com.squareup.moshi.f<Long> f13 = moshi.f(cls, d13, FraudDetectionData.KEY_TIMESTAMP);
        s.f(f13, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.f21692d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ShareCommandRequestBody b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        Long l11 = null;
        String str = null;
        ShareCommandRequestBody.Value value = null;
        String str2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21689a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21690b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("type", "type", reader);
                    s.f(v11, "unexpectedNull(\"type\", \"type\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                value = this.f21691c.b(reader);
                if (value == null) {
                    JsonDataException v12 = kr.b.v("value__", "value", reader);
                    s.f(v12, "unexpectedNull(\"value__\"…         \"value\", reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                str2 = this.f21690b.b(reader);
                if (str2 == null) {
                    JsonDataException v13 = kr.b.v("locale", "locale", reader);
                    s.f(v13, "unexpectedNull(\"locale\",…        \"locale\", reader)");
                    throw v13;
                }
            } else if (G0 == 3 && (l11 = this.f21692d.b(reader)) == null) {
                JsonDataException v14 = kr.b.v(FraudDetectionData.KEY_TIMESTAMP, FraudDetectionData.KEY_TIMESTAMP, reader);
                s.f(v14, "unexpectedNull(\"timestam…     \"timestamp\", reader)");
                throw v14;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("type", "type", reader);
            s.f(m11, "missingProperty(\"type\", \"type\", reader)");
            throw m11;
        } else if (value == null) {
            JsonDataException m12 = kr.b.m("value__", "value", reader);
            s.f(m12, "missingProperty(\"value__\", \"value\", reader)");
            throw m12;
        } else if (str2 == null) {
            JsonDataException m13 = kr.b.m("locale", "locale", reader);
            s.f(m13, "missingProperty(\"locale\", \"locale\", reader)");
            throw m13;
        } else if (l11 != null) {
            return new ShareCommandRequestBody(str, value, str2, l11.longValue());
        } else {
            JsonDataException m14 = kr.b.m(FraudDetectionData.KEY_TIMESTAMP, FraudDetectionData.KEY_TIMESTAMP, reader);
            s.f(m14, "missingProperty(\"timestamp\", \"timestamp\", reader)");
            throw m14;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ShareCommandRequestBody shareCommandRequestBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(shareCommandRequestBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("type");
        this.f21690b.j(writer, shareCommandRequestBody.c());
        writer.L("value");
        this.f21691c.j(writer, shareCommandRequestBody.d());
        writer.L("locale");
        this.f21690b.j(writer, shareCommandRequestBody.a());
        writer.L(FraudDetectionData.KEY_TIMESTAMP);
        this.f21692d.j(writer, Long.valueOf(shareCommandRequestBody.b()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShareCommandRequestBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}