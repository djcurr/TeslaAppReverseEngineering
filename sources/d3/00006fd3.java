package g30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class o1<ElementKlass, Element extends ElementKlass> extends q<Element, Element[], ArrayList<Element>> {

    /* renamed from: b  reason: collision with root package name */
    private final n00.d<ElementKlass> f27621b;

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27622c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(n00.d<ElementKlass> kClass, c30.b<Element> eSerializer) {
        super(eSerializer, null);
        kotlin.jvm.internal.s.g(kClass, "kClass");
        kotlin.jvm.internal.s.g(eSerializer, "eSerializer");
        this.f27621b = kClass;
        this.f27622c = new d(eSerializer.getDescriptor());
    }

    @Override // g30.q, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27622c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: o */
    public ArrayList<Element> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: p */
    public int b(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public void c(ArrayList<Element> arrayList, int i11) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public Iterator<Element> d(Element[] elementArr) {
        kotlin.jvm.internal.s.g(elementArr, "<this>");
        return kotlin.jvm.internal.c.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public int e(Element[] elementArr) {
        kotlin.jvm.internal.s.g(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q
    /* renamed from: t */
    public void n(ArrayList<Element> arrayList, int i11, Element element) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        arrayList.add(i11, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: u */
    public ArrayList<Element> k(Element[] elementArr) {
        List e11;
        kotlin.jvm.internal.s.g(elementArr, "<this>");
        e11 = wz.o.e(elementArr);
        return new ArrayList<>(e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public Element[] l(ArrayList<Element> arrayList) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        return (Element[]) d1.n(arrayList, this.f27621b);
    }
}