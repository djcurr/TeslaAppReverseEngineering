package com.tesla.features;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kr.b;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/features/SignalingJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/features/Signaling;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SignalingJsonAdapter extends f<Signaling> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21863a;

    /* renamed from: b  reason: collision with root package name */
    private final f<Boolean> f21864b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Constructor<Signaling> f21865c;

    public SignalingJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("enabled");
        s.f(a11, "of(\"enabled\")");
        this.f21863a = a11;
        Class cls = Boolean.TYPE;
        d11 = x0.d();
        f<Boolean> f11 = moshi.f(cls, d11, "enabled");
        s.f(f11, "moshi.adapter(Boolean::c…tySet(),\n      \"enabled\")");
        this.f21864b = f11;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Signaling b(h reader) {
        s.g(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.g();
        int i11 = -1;
        while (reader.p()) {
            int G0 = reader.G0(this.f21863a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                bool = this.f21864b.b(reader);
                if (bool == null) {
                    JsonDataException v11 = b.v("enabled", "enabled", reader);
                    s.f(v11, "unexpectedNull(\"enabled\"…       \"enabled\", reader)");
                    throw v11;
                }
                i11 &= -2;
            } else {
                continue;
            }
        }
        reader.l();
        if (i11 == -2) {
            return new Signaling(bool.booleanValue());
        }
        Constructor<Signaling> constructor = this.f21865c;
        if (constructor == null) {
            constructor = Signaling.class.getDeclaredConstructor(Boolean.TYPE, Integer.TYPE, b.f35691c);
            this.f21865c = constructor;
            s.f(constructor, "Signaling::class.java.ge…his.constructorRef = it }");
        }
        Signaling newInstance = constructor.newInstance(bool, Integer.valueOf(i11), null);
        s.f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, Signaling signaling) {
        s.g(writer, "writer");
        Objects.requireNonNull(signaling, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("enabled");
        this.f21864b.j(writer, Boolean.valueOf(signaling.getEnabled()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Signaling");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}