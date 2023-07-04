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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponseJsonAdapter extends f<CheckInquiryResponse> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22617a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CheckInquiryResponse.Data> f22618b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<CheckInquiryResponse.Included>> f22619c;

    public CheckInquiryResponseJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA, "included");
        s.f(a11, "of(\"data\", \"included\")");
        this.f22617a = a11;
        d11 = x0.d();
        f<CheckInquiryResponse.Data> f11 = moshi.f(CheckInquiryResponse.Data.class, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(CheckInqui…java, emptySet(), \"data\")");
        this.f22618b = f11;
        ParameterizedType k11 = r.k(List.class, CheckInquiryResponse.Included.class);
        d12 = x0.d();
        f<List<CheckInquiryResponse.Included>> f12 = moshi.f(k11, d12, "included");
        s.f(f12, "moshi.adapter(Types.newP…, emptySet(), \"included\")");
        this.f22619c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse b(h reader) {
        s.g(reader, "reader");
        reader.g();
        CheckInquiryResponse.Data data = null;
        List<CheckInquiryResponse.Included> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22617a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                data = this.f22618b.b(reader);
                if (data == null) {
                    JsonDataException v11 = b.v("data_", MessageExtension.FIELD_DATA, reader);
                    s.f(v11, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                list = this.f22619c.b(reader);
            }
        }
        reader.l();
        if (data != null) {
            return new CheckInquiryResponse(data, list);
        }
        JsonDataException m11 = b.m("data_", MessageExtension.FIELD_DATA, reader);
        s.f(m11, "missingProperty(\"data_\", \"data\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse checkInquiryResponse) {
        s.g(writer, "writer");
        Objects.requireNonNull(checkInquiryResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22618b.j(writer, checkInquiryResponse.a());
        writer.L("included");
        this.f22619c.j(writer, checkInquiryResponse.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}