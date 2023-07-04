package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionResponse;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquirySessionResponseJsonAdapter extends f<CreateInquirySessionResponse> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22676a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CreateInquirySessionResponse.Data> f22677b;

    /* renamed from: c  reason: collision with root package name */
    private final f<CreateInquirySessionResponse.Meta> f22678c;

    public CreateInquirySessionResponseJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(MessageExtension.FIELD_DATA, "meta");
        s.f(a11, "of(\"data\", \"meta\")");
        this.f22676a = a11;
        d11 = x0.d();
        f<CreateInquirySessionResponse.Data> f11 = moshi.f(CreateInquirySessionResponse.Data.class, d11, MessageExtension.FIELD_DATA);
        s.f(f11, "moshi.adapter(CreateInqu…java, emptySet(), \"data\")");
        this.f22677b = f11;
        d12 = x0.d();
        f<CreateInquirySessionResponse.Meta> f12 = moshi.f(CreateInquirySessionResponse.Meta.class, d12, "meta");
        s.f(f12, "moshi.adapter(CreateInqu…java, emptySet(), \"meta\")");
        this.f22678c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateInquirySessionResponse b(h reader) {
        s.g(reader, "reader");
        reader.g();
        CreateInquirySessionResponse.Data data = null;
        CreateInquirySessionResponse.Meta meta = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22676a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                data = this.f22677b.b(reader);
                if (data == null) {
                    JsonDataException v11 = b.v("data_", MessageExtension.FIELD_DATA, reader);
                    s.f(v11, "unexpectedNull(\"data_\", …ata\",\n            reader)");
                    throw v11;
                }
            } else if (G0 == 1 && (meta = this.f22678c.b(reader)) == null) {
                JsonDataException v12 = b.v("meta", "meta", reader);
                s.f(v12, "unexpectedNull(\"meta\", \"meta\",\n            reader)");
                throw v12;
            }
        }
        reader.l();
        if (data == null) {
            JsonDataException m11 = b.m("data_", MessageExtension.FIELD_DATA, reader);
            s.f(m11, "missingProperty(\"data_\", \"data\", reader)");
            throw m11;
        } else if (meta != null) {
            return new CreateInquirySessionResponse(data, meta);
        } else {
            JsonDataException m12 = b.m("meta", "meta", reader);
            s.f(m12, "missingProperty(\"meta\", \"meta\", reader)");
            throw m12;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateInquirySessionResponse createInquirySessionResponse) {
        s.g(writer, "writer");
        Objects.requireNonNull(createInquirySessionResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(MessageExtension.FIELD_DATA);
        this.f22677b.j(writer, createInquirySessionResponse.a());
        writer.L("meta");
        this.f22678c.j(writer, createInquirySessionResponse.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateInquirySessionResponse");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}