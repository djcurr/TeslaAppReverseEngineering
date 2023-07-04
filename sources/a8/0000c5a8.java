package zv;

import android.content.Context;

/* loaded from: classes6.dex */
public final class i implements tw.e<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final h f60899a;

    public i(h hVar) {
        this.f60899a = hVar;
    }

    public static Context a(h hVar) {
        return (Context) tw.h.e(hVar.a());
    }

    public static i b(h hVar) {
        return new i(hVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Context get() {
        return a(this.f60899a);
    }
}