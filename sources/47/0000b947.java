package v5;

import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.s;
import okio.c0;
import okio.r;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final h f54069c = new h();

    /* renamed from: a  reason: collision with root package name */
    private static final c f54067a = new c(new ColorDrawable(), false);

    /* renamed from: b  reason: collision with root package name */
    private static final c0 f54068b = r.b();

    private h() {
    }

    @Override // v5.f
    public Object a(t5.b bVar, okio.h hVar, c6.g gVar, j jVar, zz.d<? super c> dVar) {
        try {
            kotlin.coroutines.jvm.internal.b.d(hVar.C1(f54068b));
            e00.b.a(hVar, null);
            return f54067a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                e00.b.a(hVar, th2);
                throw th3;
            }
        }
    }

    @Override // v5.f
    public boolean b(okio.h source, String str) {
        s.g(source, "source");
        return false;
    }
}