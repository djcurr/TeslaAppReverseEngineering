package com.tesla.data.oapi;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import com.tesla.data.oapi.ShareCommandRequestBody;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.TextBundle;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ShareCommandRequestBody_ValueJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/data/oapi/ShareCommandRequestBody$Value;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ShareCommandRequestBody_ValueJsonAdapter extends com.squareup.moshi.f<ShareCommandRequestBody.Value> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21693a;

    /* renamed from: b  reason: collision with root package name */
    private final com.squareup.moshi.f<String> f21694b;

    public ShareCommandRequestBody_ValueJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("android.intent.TYPE", "android.intent.ACTION", "android.intent.extra.TEXT");
        s.f(a11, "of(\"android.intent.TYPE\"…droid.intent.extra.TEXT\")");
        this.f21693a = a11;
        d11 = x0.d();
        com.squareup.moshi.f<String> f11 = moshi.f(String.class, d11, "type");
        s.f(f11, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.f21694b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public ShareCommandRequestBody.Value b(com.squareup.moshi.h reader) {
        s.g(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21693a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                str = this.f21694b.b(reader);
                if (str == null) {
                    JsonDataException v11 = kr.b.v("type", "android.intent.TYPE", reader);
                    s.f(v11, "unexpectedNull(\"type\",\n …oid.intent.TYPE\", reader)");
                    throw v11;
                }
            } else if (G0 == 1) {
                str2 = this.f21694b.b(reader);
                if (str2 == null) {
                    JsonDataException v12 = kr.b.v("action", "android.intent.ACTION", reader);
                    s.f(v12, "unexpectedNull(\"action\",…d.intent.ACTION\", reader)");
                    throw v12;
                }
            } else if (G0 == 2 && (str3 = this.f21694b.b(reader)) == null) {
                JsonDataException v13 = kr.b.v(TextBundle.TEXT_ENTRY, "android.intent.extra.TEXT", reader);
                s.f(v13, "unexpectedNull(\"text\",\n …tent.extra.TEXT\", reader)");
                throw v13;
            }
        }
        reader.l();
        if (str == null) {
            JsonDataException m11 = kr.b.m("type", "android.intent.TYPE", reader);
            s.f(m11, "missingProperty(\"type\", …oid.intent.TYPE\", reader)");
            throw m11;
        } else if (str2 == null) {
            JsonDataException m12 = kr.b.m("action", "android.intent.ACTION", reader);
            s.f(m12, "missingProperty(\"action\"…d.intent.ACTION\", reader)");
            throw m12;
        } else if (str3 != null) {
            return new ShareCommandRequestBody.Value(str, str2, str3);
        } else {
            JsonDataException m13 = kr.b.m(TextBundle.TEXT_ENTRY, "android.intent.extra.TEXT", reader);
            s.f(m13, "missingProperty(\"text\", …tent.extra.TEXT\", reader)");
            throw m13;
        }
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, ShareCommandRequestBody.Value value) {
        s.g(writer, "writer");
        Objects.requireNonNull(value, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("android.intent.TYPE");
        this.f21694b.j(writer, value.c());
        writer.L("android.intent.ACTION");
        this.f21694b.j(writer, value.a());
        writer.L("android.intent.extra.TEXT");
        this.f21694b.j(writer, value.b());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(51);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ShareCommandRequestBody.Value");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}