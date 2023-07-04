package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final e0 f16257c;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f16258b;

    static {
        e0 e0Var = new e0();
        f16257c = e0Var;
        e0Var.makeImmutable();
    }

    public e0() {
        this(10);
    }

    private static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            return ((i) obj).x();
        }
        return a0.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c */
    public void add(int i11, String str) {
        b();
        this.f16258b.add(i11, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f16258b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: e */
    public e0 mutableCopyWithCapacity(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f16258b);
            return new e0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public String remove(int i11) {
        b();
        Object remove = this.f16258b.remove(i11);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public Object getRaw(int i11) {
        return this.f16258b.get(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f16258b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public f0 getUnmodifiableView() {
        return isModifiable() ? new o1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public String set(int i11, String str) {
        b();
        return d(this.f16258b.set(i11, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16258b.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void t1(i iVar) {
        b();
        this.f16258b.add(iVar);
        ((AbstractList) this).modCount++;
    }

    public e0(int i11) {
        this(new ArrayList(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends String> collection) {
        b();
        if (collection instanceof f0) {
            collection = ((f0) collection).getUnderlyingElements();
        }
        boolean addAll = this.f16258b.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i11) {
        Object obj = this.f16258b.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String x11 = iVar.x();
            if (iVar.m()) {
                this.f16258b.set(i11, x11);
            }
            return x11;
        }
        byte[] bArr = (byte[]) obj;
        String j11 = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f16258b.set(i11, j11);
        }
        return j11;
    }

    private e0(ArrayList<Object> arrayList) {
        this.f16258b = arrayList;
    }
}