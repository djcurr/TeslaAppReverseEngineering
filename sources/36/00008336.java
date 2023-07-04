package ln;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f37243b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f37244a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f37243b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f37243b;
                if (dVar == null) {
                    dVar = new d();
                    f37243b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f37244a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f37244a);
        }
        return unmodifiableSet;
    }
}