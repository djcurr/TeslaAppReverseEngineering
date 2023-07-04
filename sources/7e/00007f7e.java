package kotlinx.coroutines;

import zz.g;

/* loaded from: classes5.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: e1  reason: collision with root package name */
    public static final a f35225e1 = a.f35226a;

    /* loaded from: classes5.dex */
    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f35226a = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th2);
}