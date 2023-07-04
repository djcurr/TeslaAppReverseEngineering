package com.withpersona.sdk.inquiry.phone.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.phone.network.SubmitConfirmationCodeResponse;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeResponse_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/phone/network/SubmitConfirmationCodeResponse$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "phone_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SubmitConfirmationCodeResponse_DataJsonAdapter extends f<SubmitConfirmationCodeResponse.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22844a;

    /* renamed from: b  reason: collision with root package name */
    private final f<SubmitConfirmationCodeResponse.Attributes> f22845b;

    public SubmitConfirmationCodeResponse_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("attributes");
        s.f(a11, "of(\"attributes\")");
        this.f22844a = a11;
        d11 = x0.d();
        f<SubmitConfirmationCodeResponse.Attributes> f11 = moshi.f(SubmitConfirmationCodeResponse.Attributes.class, d11, "attributes");
        s.f(f11, "moshi.adapter(SubmitConf…emptySet(), \"attributes\")");
        this.f22845b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public SubmitConfirmationCodeResponse.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        SubmitConfirmationCodeResponse.Attributes attributes = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22844a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0 && (attributes = this.f22845b.b(reader)) == null) {
                JsonDataException v11 = b.v("attributes", "attributes", reader);
                s.f(v11, "unexpectedNull(\"attributes\", \"attributes\", reader)");
                throw v11;
            }
        }
        reader.l();
        if (attributes != null) {
            return new SubmitConfirmationCodeResponse.Data(attributes);
        }
        JsonDataException m11 = b.m("attributes", "attributes", reader);
        s.f(m11, "missingProperty(\"attribu…s\", \"attributes\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, SubmitConfirmationCodeResponse.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("attributes");
        this.f22845b.j(writer, data.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SubmitConfirmationCodeResponse.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}