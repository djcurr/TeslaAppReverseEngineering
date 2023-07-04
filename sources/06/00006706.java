package e30;

import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h {

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<f>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f24581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f24582b;

        a(f fVar) {
            this.f24582b = fVar;
            this.f24581a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public f next() {
            f fVar = this.f24582b;
            int d11 = fVar.d();
            int i11 = this.f24581a;
            this.f24581a = i11 - 1;
            return fVar.g(d11 - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24581a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Iterator<String>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f24583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f24584b;

        b(f fVar) {
            this.f24584b = fVar;
            this.f24583a = fVar.d();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            f fVar = this.f24584b;
            int d11 = fVar.d();
            int i11 = this.f24583a;
            this.f24583a = i11 - 1;
            return fVar.e(d11 - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24583a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Iterable<f>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f24585a;

        public c(f fVar) {
            this.f24585a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f24585a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterable<String>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f24586a;

        public d(f fVar) {
            this.f24586a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f24586a);
        }
    }

    public static final Iterable<f> a(f fVar) {
        s.g(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable<String> b(f fVar) {
        s.g(fVar, "<this>");
        return new d(fVar);
    }
}