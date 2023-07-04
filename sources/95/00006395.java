package com.withpersona.sdk.inquiry.internal.network;

import ch.qos.logback.core.CoreConstants;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest_AttributesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest$Attributes;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateInquiryRequest_AttributesJsonAdapter extends f<UpdateInquiryRequest.Attributes> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22780a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22781b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Boolean> f22782c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Constructor<UpdateInquiryRequest.Attributes> f22783d;

    public UpdateInquiryRequest_AttributesJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("selectedCountryCode", "acceptedPolicies");
        s.f(a11, "of(\"selectedCountryCode\"…      \"acceptedPolicies\")");
        this.f22780a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, "selectedCountryCode");
        s.f(f11, "moshi.adapter(String::cl…), \"selectedCountryCode\")");
        this.f22781b = f11;
        d12 = x0.d();
        f<Boolean> f12 = moshi.f(Boolean.class, d12, "acceptedPolicies");
        s.f(f12, "moshi.adapter(Boolean::c…et(), \"acceptedPolicies\")");
        this.f22782c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public UpdateInquiryRequest.Attributes b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        String str = null;
        Boolean bool = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22780a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22781b.b(reader);
                i11 &= -2;
            } else if (G0 == 1) {
                bool = this.f22782c.b(reader);
                i11 &= -3;
            }
        }
        reader.l();
        if (i11 == -4) {
            return new UpdateInquiryRequest.Attributes(str, bool);
        }
        Constructor<UpdateInquiryRequest.Attributes> constructor = this.f22783d;
        if (constructor == null) {
            constructor = UpdateInquiryRequest.Attributes.class.getDeclaredConstructor(String.class, Boolean.class, Integer.TYPE, b.f35691c);
            this.f22783d = constructor;
            s.f(constructor, "UpdateInquiryRequest.Att…his.constructorRef = it }");
        }
        UpdateInquiryRequest.Attributes newInstance = constructor.newInstance(str, bool, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, UpdateInquiryRequest.Attributes attributes) {
        s.g(writer, "writer");
        Objects.requireNonNull(attributes, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("selectedCountryCode");
        this.f22781b.j(writer, attributes.b());
        writer.L("acceptedPolicies");
        this.f22782c.j(writer, attributes.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UpdateInquiryRequest.Attributes");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}