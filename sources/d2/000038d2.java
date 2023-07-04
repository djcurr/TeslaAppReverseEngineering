package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f16571a;

    /* renamed from: b  reason: collision with root package name */
    private final dm.f f16572b;

    public m(String str, dm.f fVar) {
        this.f16571a = str;
        this.f16572b = fVar;
    }

    private File b() {
        return this.f16572b.d(this.f16571a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e11) {
            wl.f f11 = wl.f.f();
            f11.e("Error creating marker: " + this.f16571a, e11);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}