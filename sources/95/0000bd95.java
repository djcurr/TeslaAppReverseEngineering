package ww;

import ezvcard.VCard;
import ezvcard.property.Address;
import ezvcard.property.Label;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import yw.s0;

/* loaded from: classes5.dex */
public abstract class c implements Closeable {

    /* renamed from: a */
    protected final List<b> f56432a = new ArrayList();

    /* renamed from: b */
    protected s0 f56433b = new s0();

    /* renamed from: c */
    protected a f56434c;

    protected abstract VCard a();

    public void g(VCard vCard, List<Label> list) {
        List<Address> e11 = vCard.e();
        for (Label label : list) {
            boolean z11 = true;
            HashSet hashSet = new HashSet(label.getTypes());
            Iterator<Address> it2 = e11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Address next = it2.next();
                if (next.getLabel() == null && new HashSet(next.getTypes()).equals(hashSet)) {
                    next.setLabel(label.getValue());
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                vCard.c(label);
            }
        }
    }

    public List<b> j() {
        return new ArrayList(this.f56432a);
    }

    public VCard l() {
        this.f56432a.clear();
        this.f56434c = new a();
        return a();
    }

    public void m(s0 s0Var) {
        this.f56433b = s0Var;
    }
}