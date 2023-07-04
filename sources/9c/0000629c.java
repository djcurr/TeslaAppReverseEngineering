package com.withpersona.sdk.inquiry.document.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.document.network.CreateDocumentVerificationResponse;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationResponse_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationResponse$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateDocumentVerificationResponse_DataJsonAdapter extends f<CreateDocumentVerificationResponse.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22360a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22361b;

    public CreateDocumentVerificationResponse_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("id");
        s.f(a11, "of(\"id\")");
        this.f22360a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "id");
        s.f(f11, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22361b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateDocumentVerificationResponse.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22360a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (str = this.f22361b.b(reader)) == null) {
                JsonDataException v11 = b.v("id", "id", reader);
                s.f(v11, "unexpectedNull(\"id\", \"id\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (str != null) {
            return new CreateDocumentVerificationResponse.Data(str);
        }
        JsonDataException m11 = b.m("id", "id", reader);
        s.f(m11, "missingProperty(\"id\", \"id\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateDocumentVerificationResponse.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("id");
        this.f22361b.j(writer, data.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(61);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateDocumentVerificationResponse.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}