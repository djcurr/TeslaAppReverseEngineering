package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.withpersona.sdk.inquiry.internal.network.UpdateInquiryRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest_DataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Data;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateInquiryRequest_DataJsonAdapter extends f<UpdateInquiryRequest.Data> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22784a;

    /* renamed from: b  reason: collision with root package name */
    private final f<UpdateInquiryRequest.Attributes> f22785b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f22786c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Constructor<UpdateInquiryRequest.Data> f22787d;

    public UpdateInquiryRequest_DataJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("attributes", "type");
        s.f(a11, "of(\"attributes\", \"type\")");
        this.f22784a = a11;
        d11 = x0.d();
        f<UpdateInquiryRequest.Attributes> f11 = moshi.f(UpdateInquiryRequest.Attributes.class, d11, "attributes");
        s.f(f11, "moshi.adapter(UpdateInqu…emptySet(), \"attributes\")");
        this.f22785b = f11;
        d12 = x0.d();
        f<String> f12 = moshi.f(String.class, d12, "type");
        s.f(f12, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f22786c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public UpdateInquiryRequest.Data b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        UpdateInquiryRequest.Attributes attributes = null;
        String str = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22784a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                attributes = this.f22785b.b(reader);
                if (attributes == null) {
                    JsonDataException v11 = b.v("attributes", "attributes", reader);
                    s.f(v11, "unexpectedNull(\"attributes\", \"attributes\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str = this.f22786c.b(reader);
                if (str == null) {
                    JsonDataException v12 = b.v("type", "type", reader);
                    s.f(v12, "unexpectedNull(\"type\", \"type\", reader)");
                    throw v12;
                }
                i11 &= -3;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -3) {
            if (attributes != null) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                return new UpdateInquiryRequest.Data(attributes, str);
            }
            JsonDataException m11 = b.m("attributes", "attributes", reader);
            s.f(m11, "missingProperty(\"attribu…s\", \"attributes\", reader)");
            throw m11;
        }
        Constructor<UpdateInquiryRequest.Data> constructor = this.f22787d;
        if (constructor == null) {
            constructor = UpdateInquiryRequest.Data.class.getDeclaredConstructor(UpdateInquiryRequest.Attributes.class, String.class, Integer.TYPE, b.f35691c);
            this.f22787d = constructor;
            s.f(constructor, "UpdateInquiryRequest.Dat…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (attributes == null) {
            JsonDataException m12 = b.m("attributes", "attributes", reader);
            s.f(m12, "missingProperty(\"attribu…s\", \"attributes\", reader)");
            throw m12;
        }
        objArr[0] = attributes;
        objArr[1] = str;
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = null;
        UpdateInquiryRequest.Data newInstance = constructor.newInstance(objArr);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, UpdateInquiryRequest.Data data) {
        s.g(writer, "writer");
        Objects.requireNonNull(data, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("attributes");
        this.f22785b.j(writer, data.a());
        writer.L("type");
        this.f22786c.j(writer, data.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UpdateInquiryRequest.Data");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}