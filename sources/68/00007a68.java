package ix;

import freemarker.ext.beans.e0;
import java.lang.ref.ReferenceQueue;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class e extends f {

    /* renamed from: j  reason: collision with root package name */
    private static final WeakHashMap f32823j = new WeakHashMap();

    /* renamed from: k  reason: collision with root package name */
    private static final ReferenceQueue f32824k = new ReferenceQueue();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements e0.a {

        /* renamed from: a  reason: collision with root package name */
        private static final a f32825a = new a();

        private a() {
        }

        @Override // freemarker.ext.beans.e0.a
        public freemarker.ext.beans.i a(freemarker.ext.beans.j jVar) {
            return new d(jVar, true);
        }
    }

    public e(p pVar) {
        super(pVar);
    }

    public d l() {
        return (d) e0.a(this, f32823j, f32824k, a.f32825a);
    }
}