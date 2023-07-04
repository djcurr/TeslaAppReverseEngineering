package com.withpersona.sdk.inquiry.governmentid.network;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.squareup.moshi.r;
import com.withpersona.sdk.inquiry.governmentid.network.CheckVerificationResponse;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse_AttributesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse$Attributes;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CheckVerificationResponse_AttributesJsonAdapter extends f<CheckVerificationResponse.Attributes> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f22513a;

    /* renamed from: b  reason: collision with root package name */
    private final f<String> f22514b;

    /* renamed from: c  reason: collision with root package name */
    private final f<List<String>> f22515c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Constructor<CheckVerificationResponse.Attributes> f22516d;

    public CheckVerificationResponse_AttributesJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a(PermissionsResponse.STATUS_KEY, "entityConfidenceReasons");
        s.f(a11, "of(\"status\",\n      \"entityConfidenceReasons\")");
        this.f22513a = a11;
        d11 = x0.d();
        f<String> f11 = moshi.f(String.class, d11, PermissionsResponse.STATUS_KEY);
        s.f(f11, "moshi.adapter(String::cl…ptySet(),\n      \"status\")");
        this.f22514b = f11;
        ParameterizedType k11 = r.k(List.class, String.class);
        d12 = x0.d();
        f<List<String>> f12 = moshi.f(k11, d12, "entityConfidenceReasons");
        s.f(f12, "moshi.adapter(Types.newP…entityConfidenceReasons\")");
        this.f22515c = f12;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public CheckVerificationResponse.Attributes b(h reader) {
        s.g(reader, "reader");
        reader.g();
        int i11 = -1;
        String str = null;
        List<String> list = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f22513a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f22514b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v(PermissionsResponse.STATUS_KEY, PermissionsResponse.STATUS_KEY, reader);
                    s.f(v11, "unexpectedNull(\"status\",…        \"status\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                list = this.f22515c.b(reader);
                i11 &= -3;
            }
        }
        reader.l();
        if (i11 == -3) {
            if (str != null) {
                return new CheckVerificationResponse.Attributes(str, list);
            }
            JsonDataException m11 = kr.b.m(PermissionsResponse.STATUS_KEY, PermissionsResponse.STATUS_KEY, reader);
            s.f(m11, "missingProperty(\"status\", \"status\", reader)");
            throw m11;
        }
        Constructor<CheckVerificationResponse.Attributes> constructor = this.f22516d;
        if (constructor == null) {
            constructor = CheckVerificationResponse.Attributes.class.getDeclaredConstructor(String.class, List.class, Integer.TYPE, kr.b.f35691c);
            this.f22516d = constructor;
            s.f(constructor, "CheckVerificationRespons…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (str == null) {
            JsonDataException m12 = kr.b.m(PermissionsResponse.STATUS_KEY, PermissionsResponse.STATUS_KEY, reader);
            s.f(m12, "missingProperty(\"status\", \"status\", reader)");
            throw m12;
        }
        objArr[0] = str;
        objArr[1] = list;
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = null;
        CheckVerificationResponse.Attributes newInstance = constructor.newInstance(objArr);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, CheckVerificationResponse.Attributes attributes) {
        s.g(writer, "writer");
        Objects.requireNonNull(attributes, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L(PermissionsResponse.STATUS_KEY);
        this.f22514b.j(writer, attributes.b());
        writer.L("entityConfidenceReasons");
        this.f22515c.j(writer, attributes.a());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CheckVerificationResponse.Attributes");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}