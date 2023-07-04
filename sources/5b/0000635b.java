package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionRequest;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest_MetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Meta;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquirySessionRequest_MetaJsonAdapter extends f<CreateInquirySessionRequest.Meta> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22670a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22671b;

    public CreateInquirySessionRequest_MetaJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("inquiryId");
        s.f(a11, "of(\"inquiryId\")");
        this.f22670a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "inquiryId");
        s.f(f11, "moshi.adapter(String::cl…Set(),\n      \"inquiryId\")");
        this.f22671b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateInquirySessionRequest.Meta b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22670a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (str = this.f22671b.b(reader)) == null) {
                JsonDataException v11 = b.v("inquiryId", "inquiryId", reader);
                s.f(v11, "unexpectedNull(\"inquiryI…     \"inquiryId\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (str != null) {
            return new CreateInquirySessionRequest.Meta(str);
        }
        JsonDataException m11 = b.m("inquiryId", "inquiryId", reader);
        s.f(m11, "missingProperty(\"inquiryId\", \"inquiryId\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateInquirySessionRequest.Meta meta) {
        s.g(writer, "writer");
        Objects.requireNonNull(meta, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("inquiryId");
        this.f22671b.j(writer, meta.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateInquirySessionRequest.Meta");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}