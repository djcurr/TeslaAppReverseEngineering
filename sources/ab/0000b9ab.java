package v7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private boolean f54308a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f54309b = new androidx.collection.b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, h8.f> f54310c = new HashMap();

    /* loaded from: classes.dex */
    class a implements Comparator<v3.d<String, Float>> {
        a(l lVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(v3.d<String, Float> dVar, v3.d<String, Float> dVar2) {
            float floatValue = dVar.f54020b.floatValue();
            float floatValue2 = dVar2.f54020b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f11);
    }

    public l() {
        new a(this);
    }

    public void a(String str, float f11) {
        if (this.f54308a) {
            h8.f fVar = this.f54310c.get(str);
            if (fVar == null) {
                fVar = new h8.f();
                this.f54310c.put(str, fVar);
            }
            fVar.a(f11);
            if (str.equals("__container")) {
                for (b bVar : this.f54309b) {
                    bVar.a(f11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z11) {
        this.f54308a = z11;
    }
}