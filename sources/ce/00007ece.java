package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: b  reason: collision with root package name */
    public static final m f35028b = new l().getUnmodifiableView();

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f35029a;

    public l() {
        this.f35029a = new ArrayList();
    }

    private static d c(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof String) {
            return d.h((String) obj);
        }
        return d.e((byte[]) obj);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            return ((d) obj).w();
        }
        return i.b((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i11, String str) {
        this.f35029a.add(i11, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f35029a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public String remove(int i11) {
        Object remove = this.f35029a.remove(i11);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public String set(int i11, String str) {
        return d(this.f35029a.set(i11, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d getByteString(int i11) {
        Object obj = this.f35029a.get(i11);
        d c11 = c(obj);
        if (c11 != obj) {
            this.f35029a.set(i11, c11);
        }
        return c11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f35029a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m getUnmodifiableView() {
        return new u(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void p0(d dVar) {
        this.f35029a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f35029a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).getUnderlyingElements();
        }
        boolean addAll = this.f35029a.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i11) {
        Object obj = this.f35029a.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String w11 = dVar.w();
            if (dVar.n()) {
                this.f35029a.set(i11, w11);
            }
            return w11;
        }
        byte[] bArr = (byte[]) obj;
        String b11 = i.b(bArr);
        if (i.a(bArr)) {
            this.f35029a.set(i11, b11);
        }
        return b11;
    }

    public l(m mVar) {
        this.f35029a = new ArrayList(mVar.size());
        addAll(mVar);
    }
}