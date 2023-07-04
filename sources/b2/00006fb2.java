package g30;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class f0<E> extends r<E, Set<? extends E>, HashSet<E>> {

    /* renamed from: b  reason: collision with root package name */
    private final e30.f f27575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c30.b<E> eSerializer) {
        super(eSerializer);
        kotlin.jvm.internal.s.g(eSerializer, "eSerializer");
        this.f27575b = new e0(eSerializer.getDescriptor());
    }

    @Override // g30.q, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27575b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public HashSet<E> a() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public int b(HashSet<E> hashSet) {
        kotlin.jvm.internal.s.g(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public void c(HashSet<E> hashSet, int i11) {
        kotlin.jvm.internal.s.g(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.q
    /* renamed from: t */
    public void n(HashSet<E> hashSet, int i11, E e11) {
        kotlin.jvm.internal.s.g(hashSet, "<this>");
        hashSet.add(e11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: u */
    public HashSet<E> k(Set<? extends E> set) {
        kotlin.jvm.internal.s.g(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public Set<E> l(HashSet<E> hashSet) {
        kotlin.jvm.internal.s.g(hashSet, "<this>");
        return hashSet;
    }
}