package io.sentry;

import java.util.Queue;

/* loaded from: classes5.dex */
final class a4<E> extends z3<E> implements Queue<E> {
    private a4(Queue<E> queue) {
        super(queue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> a4<E> d(Queue<E> queue) {
        return new a4<>(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.z3
    /* renamed from: c */
    public Queue<E> b() {
        return (Queue) super.b();
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.f32737b) {
            element = b().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f32737b) {
            equals = b().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f32737b) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e11) {
        boolean offer;
        synchronized (this.f32737b) {
            offer = b().offer(e11);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.f32737b) {
            peek = b().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.f32737b) {
            poll = b().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.f32737b) {
            remove = b().remove();
        }
        return remove;
    }
}