package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class o1 extends AbstractList<String> implements f0, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f16352a;

    /* loaded from: classes3.dex */
    class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        ListIterator<String> f16353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16354b;

        a(int i11) {
            this.f16354b = i11;
            this.f16353a = o1.this.f16352a.listIterator(i11);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.f16353a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.f16353a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16353a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16353a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16353a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f16353a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<String> f16356a;

        b() {
            this.f16356a = o1.this.f16352a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.f16356a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16356a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o1(f0 f0Var) {
        this.f16352a = f0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public Object getRaw(int i11) {
        return this.f16352a.getRaw(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public List<?> getUnderlyingElements() {
        return this.f16352a.getUnderlyingElements();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public f0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i11) {
        return new a(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16352a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void t1(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i11) {
        return (String) this.f16352a.get(i11);
    }
}