package freemarker.ext.beans;

import java.lang.ref.WeakReference;
import org.zeroturnaround.javarebel.ClassEventListener;
import org.zeroturnaround.javarebel.ReloaderFactory;

/* loaded from: classes5.dex */
class r implements o {

    /* loaded from: classes5.dex */
    private static class a implements ClassEventListener {
        a(p pVar) {
            new WeakReference(pVar);
        }
    }

    r() {
    }

    @Override // freemarker.ext.beans.o
    public void a(p pVar) {
        ReloaderFactory.getInstance().addClassReloadListener(new a(pVar));
    }
}