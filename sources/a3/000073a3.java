package hq;

import com.adyen.checkout.components.model.payments.request.Address;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends ArrayList<Object> implements List<Object>, c {
    public static String d(List<? extends Object> list, g gVar) {
        StringBuilder sb2 = new StringBuilder();
        try {
            h(list, sb2, gVar);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void h(Iterable<? extends Object> iterable, Appendable appendable, g gVar) {
        if (iterable == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            kq.d.f35678g.a(iterable, appendable, gVar);
        }
    }

    public void b(Appendable appendable) {
        h(this, appendable, i.f29395a);
    }

    public void c(Appendable appendable, g gVar) {
        h(this, appendable, gVar);
    }

    @Override // hq.b
    public String e() {
        return d(this, i.f29395a);
    }

    @Override // hq.c
    public String f(g gVar) {
        return d(this, gVar);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return e();
    }
}