package g30;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class q0<E> extends r<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(c30.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.s.g(eSerializer, "eSerializer");
        this.f27629b = new p0(eSerializer.getDescriptor());
    }

    @Override // g30.q, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27629b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public LinkedHashSet<E> a() {
        return new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public int b(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.s.g(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public void c(LinkedHashSet<E> linkedHashSet, int i11) {
        kotlin.jvm.internal.s.g(linkedHashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q
    /* renamed from: t */
    public void n(LinkedHashSet<E> linkedHashSet, int i11, E e11) {
        kotlin.jvm.internal.s.g(linkedHashSet, "<this>");
        linkedHashSet.add(e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: u */
    public LinkedHashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.s.g(set, "<this>");
        LinkedHashSet<E> linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet<>(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public Set<E> l(LinkedHashSet<E> linkedHashSet) {
        kotlin.jvm.internal.s.g(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}