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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse_VerificationDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$VerificationData;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse_VerificationDataJsonAdapter extends f<CheckInquiryResponse.VerificationData> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22634a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22635b;

    public CheckInquiryResponse_VerificationDataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("id", "type");
        s.f(a11, "of(\"id\", \"type\")");
        this.f22634a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "id");
        s.f(f11, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f22635b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse.VerificationData b(h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22634a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22635b.b(reader);
                if (str == null) {
                    JsonDataException v11 = b.v("id", "id", reader);
                    s.f(v11, "unexpectedNull(\"id\", \"id\", reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (str2 = this.f22635b.b(reader)) == null) {
                JsonDataException v12 = b.v("type", "type", reader);
                s.f(v12, "unexpectedNull(\"type\", \"type\",\n            reader)");
                throw v12;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = b.m("id", "id", reader);
            s.f(m11, "missingProperty(\"id\", \"id\", reader)");
            throw m11;
        } else if (str2 != null) {
            return new CheckInquiryResponse.VerificationData(str, str2);
        } else {
            JsonDataException m12 = b.m("type", "type", reader);
            s.f(m12, "missingProperty(\"type\", \"type\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse.VerificationData verificationData) {
        s.g(writer, "writer");
        Objects.requireNonNull(verificationData, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("id");
        this.f22635b.j(writer, verificationData.a());
        writer.L("type");
        this.f22635b.j(writer, verificationData.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse.VerificationData");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}