package ezvcard;

import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.FormattedName;
import ezvcard.property.Kind;
import ezvcard.property.Label;
import ezvcard.property.Organization;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;
import ezvcard.property.VCardProperty;
import ezvcard.util.g;
import ezvcard.util.h;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vw.c;
import vw.d;

/* loaded from: classes5.dex */
public class VCard implements Iterable<VCardProperty> {

    /* renamed from: a */
    private VCardVersion f25371a;

    /* renamed from: b */
    private final g<Class<? extends VCardProperty>, VCardProperty> f25372b;

    /* loaded from: classes5.dex */
    public class a<T extends VCardProperty> extends AbstractList<T> {

        /* renamed from: a */
        protected final Class<T> f25373a;

        /* renamed from: b */
        protected final List<VCardProperty> f25374b;

        public a(VCard vCard, Class<T> cls) {
            this.f25373a = cls;
            this.f25374b = vCard.f25372b.e(cls);
        }

        private T c(VCardProperty vCardProperty) {
            return this.f25373a.cast(vCardProperty);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public void add(int i11, T t11) {
            this.f25374b.add(i11, t11);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public T get(int i11) {
            return c(this.f25374b.get(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: e */
        public T remove(int i11) {
            return c(this.f25374b.remove(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f */
        public T set(int i11, T t11) {
            return c(this.f25374b.set(i11, t11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f25374b.size();
        }
    }

    public VCard() {
        this(VCardVersion.V3_0);
    }

    public void c(Label label) {
        d(label);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(VCardProperty vCardProperty) {
        this.f25372b.f(vCardProperty.getClass(), vCardProperty);
    }

    public List<Address> e() {
        return m(Address.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VCard vCard = (VCard) obj;
            if (this.f25371a == vCard.f25371a && this.f25372b.size() == vCard.f25372b.size()) {
                Iterator<Map.Entry<Class<? extends VCardProperty>, List<VCardProperty>>> it2 = this.f25372b.iterator();
                while (it2.hasNext()) {
                    Map.Entry<Class<? extends VCardProperty>, List<VCardProperty>> next = it2.next();
                    List<VCardProperty> value = next.getValue();
                    List<VCardProperty> e11 = vCard.f25372b.e(next.getKey());
                    if (value.size() != e11.size()) {
                        return false;
                    }
                    ArrayList arrayList = new ArrayList(e11);
                    for (VCardProperty vCardProperty : value) {
                        if (!arrayList.remove(vCardProperty)) {
                            return false;
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public List<Email> f() {
        return m(Email.class);
    }

    public FormattedName h() {
        return (FormattedName) n(FormattedName.class);
    }

    public int hashCode() {
        VCardVersion vCardVersion = this.f25371a;
        int hashCode = (vCardVersion == null ? 0 : vCardVersion.hashCode()) + 31;
        int i11 = 1;
        for (VCardProperty vCardProperty : this.f25372b.m()) {
            i11 += vCardProperty.hashCode();
        }
        return (hashCode * 31) + i11;
    }

    public Kind i() {
        return (Kind) n(Kind.class);
    }

    @Override // java.lang.Iterable
    public Iterator<VCardProperty> iterator() {
        return this.f25372b.m().iterator();
    }

    public Organization j() {
        return (Organization) n(Organization.class);
    }

    public Collection<VCardProperty> k() {
        return this.f25372b.m();
    }

    public <T extends VCardProperty> List<T> m(Class<T> cls) {
        return new a(this, cls);
    }

    public <T extends VCardProperty> T n(Class<T> cls) {
        return cls.cast(this.f25372b.d(cls));
    }

    public StructuredName o() {
        return (StructuredName) n(StructuredName.class);
    }

    public List<Telephone> p() {
        return m(Telephone.class);
    }

    public VCardVersion q() {
        return this.f25371a;
    }

    public void r(VCardVersion vCardVersion) {
        this.f25371a = vCardVersion;
    }

    public d s(VCardVersion vCardVersion) {
        d dVar = new d();
        if (o() == null && (vCardVersion == VCardVersion.V2_1 || vCardVersion == VCardVersion.V3_0)) {
            dVar.c(null, new c(0, new Object[0]));
        }
        if (h() == null && (vCardVersion == VCardVersion.V3_0 || vCardVersion == VCardVersion.V4_0)) {
            dVar.c(null, new c(1, new Object[0]));
        }
        Iterator<VCardProperty> it2 = iterator();
        while (it2.hasNext()) {
            VCardProperty next = it2.next();
            List<c> validate = next.validate(vCardVersion, this);
            if (!validate.isEmpty()) {
                dVar.b(next, validate);
            }
        }
        return dVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("version=");
        sb2.append(this.f25371a);
        for (VCardProperty vCardProperty : this.f25372b.m()) {
            sb2.append(h.f25469a);
            sb2.append(vCardProperty);
        }
        return sb2.toString();
    }

    public VCard(VCardVersion vCardVersion) {
        this.f25372b = new g<>();
        this.f25371a = vCardVersion;
    }

    public VCard(VCard vCard) {
        this.f25372b = new g<>();
        this.f25371a = vCard.f25371a;
        for (VCardProperty vCardProperty : vCard.k()) {
            d(vCardProperty.copy());
        }
    }
}