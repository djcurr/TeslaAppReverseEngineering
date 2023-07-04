package n5;

import bolts.UnobservedTaskException;
import n5.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private e<?> f40527a;

    public g(e<?> eVar) {
        this.f40527a = eVar;
    }

    public void a() {
        this.f40527a = null;
    }

    protected void finalize() {
        e.d k11;
        try {
            e<?> eVar = this.f40527a;
            if (eVar != null && (k11 = e.k()) != null) {
                k11.a(eVar, new UnobservedTaskException(eVar.i()));
            }
        } finally {
            super.finalize();
        }
    }
}