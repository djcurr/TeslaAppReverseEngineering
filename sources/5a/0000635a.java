package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CreateInquirySessionRequest_DataJsonAdapter extends f<CreateInquirySessionRequest.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22667a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22668b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<CreateInquirySessionRequest.Data> f22669c;

    public CreateInquirySessionRequest_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("type");
        s.f(a11, "of(\"type\")");
        this.f22667a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "type");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f22668b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CreateInquirySessionRequest.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        String str = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22667a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22668b.b(reader);
                if (str == null) {
                    JsonDataException v11 = b.v("type", "type", reader);
                    s.f(v11, "unexpectedNull(\"type\", \"type\", reader)");
                    throw v11;
                }
                i11 &= -2;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -2) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            return new CreateInquirySessionRequest.Data(str);
        }
        Constructor<CreateInquirySessionRequest.Data> constructor = this.f22669c;
        if (constructor == null) {
            constructor = CreateInquirySessionRequest.Data.class.getDeclaredConstructor(String.class, Integer.TYPE, b.f35691c);
            this.f22669c = constructor;
            s.f(constructor, "CreateInquirySessionRequ…his.constructorRef = it }");
        }
        CreateInquirySessionRequest.Data newInstance = constructor.newInstance(str, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CreateInquirySessionRequest.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("type");
        this.f22668b.j(writer, data.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CreateInquirySessionRequest.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}