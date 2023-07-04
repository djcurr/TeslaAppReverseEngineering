package cf;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import gf.f;
import hf.i;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9068a;

    /* renamed from: b  reason: collision with root package name */
    private static a f9069b;

    public static a a(f fVar, jf.f fVar2, i<gd.d, nf.c> iVar, boolean z11, ExecutorService executorService) {
        if (!f9068a) {
            try {
                f9069b = (a) AnimatedFactoryV2Impl.class.getConstructor(f.class, jf.f.class, i.class, Boolean.TYPE, kd.f.class).newInstance(fVar, fVar2, iVar, Boolean.valueOf(z11), executorService);
            } catch (Throwable unused) {
            }
            if (f9069b != null) {
                f9068a = true;
            }
        }
        return f9069b;
    }
}