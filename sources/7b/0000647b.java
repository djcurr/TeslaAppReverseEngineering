package cw;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class f implements tw.e<androidx.activity.result.d<Uri>> {

    /* renamed from: a  reason: collision with root package name */
    private final a f23154a;

    public f(a aVar) {
        this.f23154a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static androidx.activity.result.d<Uri> c(a aVar) {
        return (androidx.activity.result.d) tw.h.e(aVar.b());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public androidx.activity.result.d<Uri> get() {
        return c(this.f23154a);
    }
}