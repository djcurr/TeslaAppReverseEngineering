package vw;

import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.text.NumberFormat;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class d implements Iterable<Map.Entry<VCardProperty, List<c>>> {

    /* renamed from: a  reason: collision with root package name */
    private final g<VCardProperty, c> f54647a = new g<>(new IdentityHashMap());

    public void b(VCardProperty vCardProperty, List<c> list) {
        this.f54647a.h(vCardProperty, list);
    }

    public void c(VCardProperty vCardProperty, c cVar) {
        this.f54647a.f(vCardProperty, cVar);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<VCardProperty, List<c>>> iterator() {
        return this.f54647a.iterator();
    }

    public String toString() {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setMinimumIntegerDigits(2);
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<VCardProperty, List<c>>> it2 = this.f54647a.iterator();
        while (it2.hasNext()) {
            Map.Entry<VCardProperty, List<c>> next = it2.next();
            VCardProperty key = next.getKey();
            for (c cVar : next.getValue()) {
                if (key != null) {
                    sb2.append('[');
                    sb2.append(key.getClass().getSimpleName());
                    sb2.append("] | ");
                }
                Integer a11 = cVar.a();
                if (a11 != null) {
                    sb2.append('W');
                    sb2.append(integerInstance.format(a11));
                    sb2.append(": ");
                }
                sb2.append(cVar.b());
                sb2.append(h.f25469a);
            }
        }
        return sb2.toString();
    }
}