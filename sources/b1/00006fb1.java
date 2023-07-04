package g30;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class f<E> extends r<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c30.b<E> element) {
        super(element);
        kotlin.jvm.internal.s.g(element, "element");
        this.f27574b = new e(element.getDescriptor());
    }

    @Override // g30.q, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27574b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public ArrayList<E> a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public int b(ArrayList<E> arrayList) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public void c(ArrayList<E> arrayList, int i11) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        arrayList.ensureCapacity(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q
    /* renamed from: t */
    public void n(ArrayList<E> arrayList, int i11, E e11) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        arrayList.add(i11, e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: u */
    public ArrayList<E> k(List<? extends E> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public List<E> l(ArrayList<E> arrayList) {
        kotlin.jvm.internal.s.g(arrayList, "<this>");
        return arrayList;
    }
}