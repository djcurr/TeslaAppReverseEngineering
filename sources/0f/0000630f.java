package com.withpersona.sdk.inquiry.governmentid.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationResponse;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateVerificationResponse_DataJsonAdapter extends f<CreateVerificationResponse.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22537a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22538b;

    /* renamed from: c  reason: collision with root package name */
    private final f<CreateVerificationResponse.Attributes> f22539c;

    public CreateVerificationResponse_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("id", "attributes");
        s.f(a11, "of(\"id\", \"attributes\")");
        this.f22537a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "id");
        s.f(f11, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22538b = f11;
        d12 = x0.d();
        f<CreateVerificationResponse.Attributes> f12 = moshi.f(CreateVerificationResponse.Attributes.class, d12, "attributes");
        s.f(f12, "moshi.adapter(CreateVeri…emptySet(), \"attributes\")");
        this.f22539c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateVerificationResponse.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        CreateVerificationResponse.Attributes attributes = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22537a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22538b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("id", "id", reader);
                    s.f(v11, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (attributes = this.f22539c.b(reader)) == null) {
                JsonDataException v12 = kr.b.v("attributes", "attributes", reader);
                s.f(v12, "unexpectedNull(\"attributes\", \"attributes\", reader)");
                throw v12;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("id", "id", reader);
            s.f(m11, "missingProperty(\"id\", \"id\", reader)");
            throw m11;
        } else if (attributes != null) {
            return new CreateVerificationResponse.Data(str, attributes);
        } else {
            JsonDataException m12 = kr.b.m("attributes", "attributes", reader);
            s.f(m12, "missingProperty(\"attribu…s\", \"attributes\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateVerificationResponse.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("id");
        this.f22538b.j(writer, data.b());
        writer.L("attributes");
        this.f22539c.j(writer, data.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateVerificationResponse.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}