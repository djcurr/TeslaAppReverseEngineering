package e00;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k implements u20.h<String> {

    /* renamed from: a  reason: collision with root package name */
    private final BufferedReader f24397a;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator<String>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private String f24398a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f24399b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f24398a;
                this.f24398a = null;
                s.e(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24398a == null && !this.f24399b) {
                String readLine = k.this.f24397a.readLine();
                this.f24398a = readLine;
                if (readLine == null) {
                    this.f24399b = true;
                }
            }
            return this.f24398a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(BufferedReader reader) {
        s.g(reader, "reader");
        this.f24397a = reader;
    }

    @Override // u20.h
    public Iterator<String> iterator() {
        return new a();
    }
}