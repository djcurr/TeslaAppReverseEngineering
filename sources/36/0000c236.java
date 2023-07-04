package y70;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class i {

    /* renamed from: d  reason: collision with root package name */
    private static final List<i> f59368d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f59369a;

    /* renamed from: b  reason: collision with root package name */
    o f59370b;

    /* renamed from: c  reason: collision with root package name */
    i f59371c;

    private i(Object obj, o oVar) {
        this.f59369a = obj;
        this.f59370b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(o oVar, Object obj) {
        List<i> list = f59368d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                i remove = list.remove(size - 1);
                remove.f59369a = obj;
                remove.f59370b = oVar;
                remove.f59371c = null;
                return remove;
            }
            return new i(obj, oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(i iVar) {
        iVar.f59369a = null;
        iVar.f59370b = null;
        iVar.f59371c = null;
        List<i> list = f59368d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(iVar);
            }
        }
    }
}