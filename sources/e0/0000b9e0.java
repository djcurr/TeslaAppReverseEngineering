package v9;

import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public Stack<e> f54423a = new Stack<>();

    public void a() {
        if (c()) {
            return;
        }
        Iterator<e> it2 = this.f54423a.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
        this.f54423a.clear();
    }

    public void b(e eVar) {
        this.f54423a.push(eVar);
    }

    public boolean c() {
        return this.f54423a.isEmpty();
    }

    public e d() {
        return this.f54423a.pop();
    }
}