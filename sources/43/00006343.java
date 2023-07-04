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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse_AttributesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse$Attributes;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckInquiryResponse_AttributesJsonAdapter extends f<CheckInquiryResponse.Attributes> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22620a;

    /* renamed from: b  reason: collision with root package name */
    private final f<NextStep> f22621b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f22622c;

    public CheckInquiryResponse_AttributesJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("nextStep", "selectedCountryCode", "birthdate", "nameFirst", "nameMiddle", "nameLast", "addressStreet1", "addressStreet2", "addressCity", "addressSubdivision", "addressSubdivisionAbbr", "addressPostalCode", "addressCountryCode", "phoneNumber");
        s.f(a11, "of(\"nextStep\", \"selected…ntryCode\", \"phoneNumber\")");
        this.f22620a = a11;
        d11 = x0.d();
        f<NextStep> f11 = moshi.f(NextStep.class, d11, "nextStep");
        s.f(f11, "moshi.adapter(NextStep::…  emptySet(), \"nextStep\")");
        this.f22621b = f11;
        d12 = x0.d();
        f<String> f12 = moshi.f(String.class, d12, "selectedCountryCode");
        s.f(f12, "moshi.adapter(String::cl…), \"selectedCountryCode\")");
        this.f22622c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckInquiryResponse.Attributes b(h reader) {
        s.g(reader, "reader");
        reader.g();
        NextStep nextStep = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (reader.p()) {
            switch (reader.G0(this.f22620a)) {
                case -1:
                    reader.Q0();
                    reader.R0();
                    break;
                case 0:
                    nextStep = this.f22621b.b(reader);
                    if (nextStep == null) {
                        JsonDataException v11 = b.v("nextStep", "nextStep", reader);
                        s.f(v11, "unexpectedNull(\"nextStep…      \"nextStep\", reader)");
                        throw v11;
                    }
                    break;
                case 1:
                    str = this.f22622c.b(reader);
                    break;
                case 2:
                    str2 = this.f22622c.b(reader);
                    break;
                case 3:
                    str3 = this.f22622c.b(reader);
                    break;
                case 4:
                    str4 = this.f22622c.b(reader);
                    break;
                case 5:
                    str5 = this.f22622c.b(reader);
                    break;
                case 6:
                    str6 = this.f22622c.b(reader);
                    break;
                case 7:
                    str7 = this.f22622c.b(reader);
                    break;
                case 8:
                    str8 = this.f22622c.b(reader);
                    break;
                case 9:
                    str9 = this.f22622c.b(reader);
                    break;
                case 10:
                    str10 = this.f22622c.b(reader);
                    break;
                case 11:
                    str11 = this.f22622c.b(reader);
                    break;
                case 12:
                    str12 = this.f22622c.b(reader);
                    break;
                case 13:
                    str13 = this.f22622c.b(reader);
                    break;
            }
        }
        reader.l();
        if (nextStep != null) {
            return new CheckInquiryResponse.Attributes(nextStep, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
        }
        JsonDataException m11 = b.m("nextStep", "nextStep", reader);
        s.f(m11, "missingProperty(\"nextStep\", \"nextStep\", reader)");
        throw m11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckInquiryResponse.Attributes attributes) {
        s.g(writer, "writer");
        Objects.requireNonNull(attributes, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("nextStep");
        this.f22621b.j(writer, attributes.l());
        writer.L("selectedCountryCode");
        this.f22622c.j(writer, attributes.n());
        writer.L("birthdate");
        this.f22622c.j(writer, attributes.h());
        writer.L("nameFirst");
        this.f22622c.j(writer, attributes.i());
        writer.L("nameMiddle");
        this.f22622c.j(writer, attributes.k());
        writer.L("nameLast");
        this.f22622c.j(writer, attributes.j());
        writer.L("addressStreet1");
        this.f22622c.j(writer, attributes.d());
        writer.L("addressStreet2");
        this.f22622c.j(writer, attributes.e());
        writer.L("addressCity");
        this.f22622c.j(writer, attributes.a());
        writer.L("addressSubdivision");
        this.f22622c.j(writer, attributes.f());
        writer.L("addressSubdivisionAbbr");
        this.f22622c.j(writer, attributes.g());
        writer.L("addressPostalCode");
        this.f22622c.j(writer, attributes.c());
        writer.L("addressCountryCode");
        this.f22622c.j(writer, attributes.b());
        writer.L("phoneNumber");
        this.f22622c.j(writer, attributes.m());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckInquiryResponse.Attributes");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}