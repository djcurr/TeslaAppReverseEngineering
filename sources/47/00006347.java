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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse_RelationshipsJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Relationships;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse_RelationshipsJsonAdapter extends f<CheckInquiryResponse.Relationships> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22632a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CheckInquiryResponse.Verifications> f22633b;

    public CheckInquiryResponse_RelationshipsJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("verifications");
        s.f(a11, "of(\"verifications\")");
        this.f22632a = a11;
        d11 = x0.d();
        f<CheckInquiryResponse.Verifications> f11 = moshi.f(CheckInquiryResponse.Verifications.class, d11, "verifications");
        s.f(f11, "moshi.adapter(CheckInqui…tySet(), \"verifications\")");
        this.f22633b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse.Relationships b(h reader) {
        s.g(reader, "reader");
        reader.g();
        CheckInquiryResponse.Verifications verifications = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22632a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (verifications = this.f22633b.b(reader)) == null) {
                JsonDataException v11 = b.v("verifications", "verifications", reader);
                s.f(v11, "unexpectedNull(\"verifica… \"verifications\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (verifications != null) {
            return new CheckInquiryResponse.Relationships(verifications);
        }
        JsonDataException m11 = b.m("verifications", "verifications", reader);
        s.f(m11, "missingProperty(\"verific… \"verifications\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse.Relationships relationships) {
        s.g(writer, "writer");
        Objects.requireNonNull(relationships, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("verifications");
        this.f22633b.j(writer, relationships.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse.Relationships");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}