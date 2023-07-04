package pp;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class d extends f {

    /* renamed from: a  reason: collision with root package name */
    Logger f46812a;

    public d(String str) {
        this.f46812a = Logger.getLogger(str);
    }

    @Override // pp.f
    public void b(String str) {
        this.f46812a.log(Level.FINE, str);
    }
}