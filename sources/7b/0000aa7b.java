package pa;

import android.content.Context;
import ha.h;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class c<T> implements h<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final h<?> f46420b = new c();

    private c() {
    }

    public static <T> c<T> c() {
        return (c) f46420b;
    }

    @Override // ha.h
    public ja.c<T> a(Context context, ja.c<T> cVar, int i11, int i12) {
        return cVar;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
    }
}