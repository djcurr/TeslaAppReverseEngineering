package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse_VerificationsJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Verifications;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse_VerificationsJsonAdapter extends f<CheckInquiryResponse.Verifications> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22636a;

    /* renamed from: b  reason: collision with root package name */
    private final f<List<CheckInquiryResponse.VerificationData>> f22637b;

    public CheckInquiryResponse_VerificationsJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA);
        s.f(a11, "of(\"data\")");
        this.f22636a = a11;
        ParameterizedType k11 = r.k(List.class, CheckInquiryResponse.VerificationData.class);
        d11 = x0.d();
        f<List<CheckInquiryResponse.VerificationData>> f11 = moshi.f(k11, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(Types.newP…ava), emptySet(), \"data\")");
        this.f22637b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse.Verifications b(h reader) {
        s.g(reader, "reader");
        reader.g();
        List<CheckInquiryResponse.VerificationData> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22636a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (list = this.f22637b.b(reader)) == null) {
                JsonDataException v11 = b.v("data_", MessageExtension.FIELD_DATA, reader);
                s.f(v11, "unexpectedNull(\"data_\", \"data\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (list != null) {
            return new CheckInquiryResponse.Verifications(list);
        }
        JsonDataException m11 = b.m("data_", MessageExtension.FIELD_DATA, reader);
        s.f(m11, "missingProperty(\"data_\", \"data\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse.Verifications verifications) {
        s.g(writer, "writer");
        Objects.requireNonNull(verifications, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22637b.j(writer, verifications.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse.Verifications");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}