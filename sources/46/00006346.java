package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse_IncludedJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Included;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse_IncludedJsonAdapter extends f<CheckInquiryResponse.Included> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22629a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22630b;

    /* renamed from: c  reason: collision with root package name */
    private final f<CheckInquiryResponse.IncludedAttributes> f22631c;

    public CheckInquiryResponse_IncludedJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("type", "id", "attributes");
        s.f(a11, "of(\"type\", \"id\", \"attributes\")");
        this.f22629a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "type");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f22630b = f11;
        d12 = x0.d();
        f<CheckInquiryResponse.IncludedAttributes> f12 = moshi.f(CheckInquiryResponse.IncludedAttributes.class, d12, "attributes");
        s.f(f12, "moshi.adapter(CheckInqui…emptySet(), \"attributes\")");
        this.f22631c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse.Included b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        CheckInquiryResponse.IncludedAttributes includedAttributes = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22629a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22630b.b(reader);
                if (str == null) {
                    JsonDataException v11 = b.v("type", "type", reader);
                    s.f(v11, "unexpectedNull(\"type\", \"type\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f22630b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = b.v("id", "id", reader);
                    s.f(v12, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v12;
                }
            } else if (G0 == 2) {
                includedAttributes = this.f22631c.b(reader);
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = b.m("type", "type", reader);
            s.f(m11, "missingProperty(\"type\", \"type\", reader)");
            throw m11;
        } else if (str2 != null) {
            return new CheckInquiryResponse.Included(str, str2, includedAttributes);
        } else {
            JsonDataException m12 = b.m("id", "id", reader);
            s.f(m12, "missingProperty(\"id\", \"id\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse.Included included) {
        s.g(writer, "writer");
        Objects.requireNonNull(included, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("type");
        this.f22630b.j(writer, included.c());
        writer.L("id");
        this.f22630b.j(writer, included.b());
        writer.L("attributes");
        this.f22631c.j(writer, included.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse.Included");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}