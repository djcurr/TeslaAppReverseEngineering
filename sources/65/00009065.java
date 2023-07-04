package on;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import pn.n;

/* loaded from: classes2.dex */
public final class l {
    public static com.google.gson.k a(tn.a aVar) {
        boolean z11;
        try {
            try {
                aVar.Q0();
                z11 = false;
                try {
                    return n.V.b(aVar);
                } catch (EOFException e11) {
                    e = e11;
                    if (z11) {
                        return com.google.gson.l.f17206a;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e12) {
                throw new JsonSyntaxException(e12);
            } catch (IOException e13) {
                throw new JsonIOException(e13);
            } catch (NumberFormatException e14) {
                throw new JsonSyntaxException(e14);
            }
        } catch (EOFException e15) {
            e = e15;
            z11 = true;
        }
    }

    public static void b(com.google.gson.k kVar, com.google.gson.stream.b bVar) {
        n.V.d(bVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a extends Writer {

        /* renamed from: a */
        private final Appendable f42833a;

        /* renamed from: b */
        private final C0855a f42834b = new C0855a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: on.l$a$a */
        /* loaded from: classes2.dex */
        public static class C0855a implements CharSequence {

            /* renamed from: a */
            char[] f42835a;

            C0855a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i11) {
                return this.f42835a[i11];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f42835a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i11, int i12) {
                return new String(this.f42835a, i11, i12 - i11);
            }
        }

        a(Appendable appendable) {
            this.f42833a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            C0855a c0855a = this.f42834b;
            c0855a.f42835a = cArr;
            this.f42833a.append(c0855a, i11, i12 + i11);
        }

        @Override // java.io.Writer
        public void write(int i11) {
            this.f42833a.append((char) i11);
        }
    }
}