package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.util.Objects;

/* loaded from: classes3.dex */
final class b extends o {

    /* renamed from: a  reason: collision with root package name */
    private final am.a0 f16474a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16475b;

    /* renamed from: c  reason: collision with root package name */
    private final File f16476c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(am.a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.f16474a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f16475b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f16476c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o
    public am.a0 b() {
        return this.f16474a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o
    public File c() {
        return this.f16476c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o
    public String d() {
        return this.f16475b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f16474a.equals(oVar.b()) && this.f16475b.equals(oVar.d()) && this.f16476c.equals(oVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f16474a.hashCode() ^ 1000003) * 1000003) ^ this.f16475b.hashCode()) * 1000003) ^ this.f16476c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f16474a + ", sessionId=" + this.f16475b + ", reportFile=" + this.f16476c + "}";
    }
}