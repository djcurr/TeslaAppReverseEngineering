package kq;

import hq.g;
import hq.i;

/* loaded from: classes2.dex */
public class a implements e<Object> {
    @Override // kq.e
    public <E> void a(E e11, Appendable appendable, g gVar) {
        Object[] objArr;
        gVar.c(appendable);
        boolean z11 = false;
        for (Object obj : (Object[]) e11) {
            if (z11) {
                gVar.m(appendable);
            } else {
                z11 = true;
            }
            i.b(obj, appendable, gVar);
        }
        gVar.d(appendable);
    }
}