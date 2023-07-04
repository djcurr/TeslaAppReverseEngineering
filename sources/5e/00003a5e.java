package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;

@KeepForSdk
/* loaded from: classes2.dex */
public class i {

    /* renamed from: b */
    private static final Object f17243b = new Object();

    /* renamed from: c */
    private static i f17244c;

    /* renamed from: a */
    private ul.n f17245a;

    private i() {
    }

    @KeepForSdk
    public static i c() {
        i iVar;
        synchronized (f17243b) {
            Preconditions.checkState(f17244c != null, "MlKitContext has not been initialized");
            iVar = (i) Preconditions.checkNotNull(f17244c);
        }
        return iVar;
    }

    public static i d(Context context) {
        i iVar;
        synchronized (f17243b) {
            Preconditions.checkState(f17244c == null, "MlKitContext is already initialized");
            i iVar2 = new i();
            f17244c = iVar2;
            Context e11 = e(context);
            ul.n e12 = ul.n.i(TaskExecutors.MAIN_THREAD).d(ul.g.c(e11, MlKitComponentDiscoveryService.class).b()).b(ul.d.p(e11, Context.class, new Class[0])).b(ul.d.p(iVar2, i.class, new Class[0])).e();
            iVar2.f17245a = e12;
            e12.l(true);
            iVar = f17244c;
        }
        return iVar;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @KeepForSdk
    public <T> T a(Class<T> cls) {
        Preconditions.checkState(f17244c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f17245a);
        return (T) this.f17245a.a(cls);
    }

    @KeepForSdk
    public Context b() {
        return (Context) a(Context.class);
    }
}