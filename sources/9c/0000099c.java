package androidx.work;

import android.content.Context;
import androidx.work.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements x4.a<b0> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6467a = q.f("WrkMgrInitializer");

    @Override // x4.a
    public List<Class<? extends x4.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // x4.a
    /* renamed from: c */
    public b0 b(Context context) {
        q.c().a(f6467a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        b0.k(context, new b.C0115b().a());
        return b0.i(context);
    }
}