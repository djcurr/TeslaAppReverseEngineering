package com.tesla.messagebuilder.util;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.m;
import com.squareup.moshi.p;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBodyJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/tesla/messagebuilder/util/RemoteBuildingRequestBody;", "Lcom/squareup/moshi/p;", "moshi", "<init>", "(Lcom/squareup/moshi/p;)V", "messagebuilder_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteBuildingRequestBodyJsonAdapter extends f<RemoteBuildingRequestBody> {

    /* renamed from: a  reason: collision with root package name */
    private final h.b f21880a;

    /* renamed from: b  reason: collision with root package name */
    private final f<VehicleSessionInfoDataBody> f21881b;

    /* renamed from: c  reason: collision with root package name */
    private final f<String> f21882c;

    /* renamed from: d  reason: collision with root package name */
    private final f<Boolean> f21883d;

    public RemoteBuildingRequestBodyJsonAdapter(p moshi) {
        Set<? extends Annotation> d11;
        Set<? extends Annotation> d12;
        Set<? extends Annotation> d13;
        s.g(moshi, "moshi");
        h.b a11 = h.b.a("session_info", "public_key", "generate_command", "backup", "fleet");
        s.f(a11, "of(\"session_info\", \"publ…mand\", \"backup\", \"fleet\")");
        this.f21880a = a11;
        d11 = x0.d();
        f<VehicleSessionInfoDataBody> f11 = moshi.f(VehicleSessionInfoDataBody.class, d11, "sessionInfo");
        s.f(f11, "moshi.adapter(VehicleSes…mptySet(), \"sessionInfo\")");
        this.f21881b = f11;
        d12 = x0.d();
        f<String> f12 = moshi.f(String.class, d12, "publicKey");
        s.f(f12, "moshi.adapter(String::cl… emptySet(), \"publicKey\")");
        this.f21882c = f12;
        d13 = x0.d();
        f<Boolean> f13 = moshi.f(Boolean.class, d13, "generateCommand");
        s.f(f13, "moshi.adapter(Boolean::c…Set(), \"generateCommand\")");
        this.f21883d = f13;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public RemoteBuildingRequestBody b(h reader) {
        s.g(reader, "reader");
        reader.g();
        VehicleSessionInfoDataBody vehicleSessionInfoDataBody = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (reader.p()) {
            int G0 = reader.G0(this.f21880a);
            if (G0 == -1) {
                reader.Q0();
                reader.R0();
            } else if (G0 == 0) {
                vehicleSessionInfoDataBody = this.f21881b.b(reader);
            } else if (G0 == 1) {
                str = this.f21882c.b(reader);
            } else if (G0 == 2) {
                bool = this.f21883d.b(reader);
            } else if (G0 == 3) {
                bool2 = this.f21883d.b(reader);
            } else if (G0 == 4) {
                bool3 = this.f21883d.b(reader);
            }
        }
        reader.l();
        return new RemoteBuildingRequestBody(vehicleSessionInfoDataBody, str, bool, bool2, bool3);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m writer, RemoteBuildingRequestBody remoteBuildingRequestBody) {
        s.g(writer, "writer");
        Objects.requireNonNull(remoteBuildingRequestBody, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.j();
        writer.L("session_info");
        this.f21881b.j(writer, remoteBuildingRequestBody.getSessionInfo());
        writer.L("public_key");
        this.f21882c.j(writer, remoteBuildingRequestBody.getPublicKey());
        writer.L("generate_command");
        this.f21883d.j(writer, remoteBuildingRequestBody.getGenerateCommand());
        writer.L("backup");
        this.f21883d.j(writer, remoteBuildingRequestBody.isBackupKey());
        writer.L("fleet");
        this.f21883d.j(writer, remoteBuildingRequestBody.isFleetKey());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("RemoteBuildingRequestBody");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}