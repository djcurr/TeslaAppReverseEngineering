package freemarker.ext.beans;

import freemarker.core.BugException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class e0 {

    /* loaded from: classes5.dex */
    public interface a {
        i a(j jVar);
    }

    public static i a(j jVar, Map map, ReferenceQueue referenceQueue, a aVar) {
        Map map2;
        Reference reference;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        synchronized (map) {
            map2 = (Map) map.get(contextClassLoader);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(contextClassLoader, map2);
                reference = null;
            } else {
                reference = (Reference) map2.get(jVar);
            }
        }
        i iVar = reference != null ? (i) reference.get() : null;
        if (iVar != null) {
            return iVar;
        }
        j jVar2 = (j) jVar.a(true);
        i a11 = aVar.a(jVar2);
        if (a11.k()) {
            synchronized (map) {
                Reference reference2 = (Reference) map2.get(jVar2);
                i iVar2 = reference2 != null ? (i) reference2.get() : null;
                if (iVar2 == null) {
                    map2.put(jVar2, new WeakReference(a11, referenceQueue));
                } else {
                    a11 = iVar2;
                }
            }
            b(map, referenceQueue);
            return a11;
        }
        throw new BugException();
    }

    private static void b(Map map, ReferenceQueue referenceQueue) {
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            synchronized (map) {
                Iterator it2 = map.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Iterator it3 = ((Map) it2.next()).values().iterator();
                    while (it3.hasNext()) {
                        if (it3.next() == poll) {
                            it3.remove();
                            break;
                        }
                    }
                }
            }
        }
    }
}