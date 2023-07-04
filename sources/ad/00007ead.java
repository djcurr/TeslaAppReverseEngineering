package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* loaded from: classes5.dex */
public abstract class a implements o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UninitializedMessageException b() {
        return new UninitializedMessageException(this);
    }

    public void c(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        CodedOutputStream J = CodedOutputStream.J(outputStream, CodedOutputStream.u(CodedOutputStream.v(serializedSize) + serializedSize));
        J.o0(serializedSize);
        a(J);
        J.I();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0651a<BuilderType extends AbstractC0651a> implements o.a {
        /* JADX INFO: Access modifiers changed from: protected */
        public static UninitializedMessageException c(o oVar) {
            return new UninitializedMessageException(oVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: b */
        public abstract BuilderType D(e eVar, f fVar);

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0652a extends FilterInputStream {

            /* renamed from: a  reason: collision with root package name */
            private int f34964a;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0652a(InputStream inputStream, int i11) {
                super(inputStream);
                this.f34964a = i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f34964a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f34964a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f34964a--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j11) {
                long skip = super.skip(Math.min(j11, this.f34964a));
                if (skip >= 0) {
                    this.f34964a = (int) (this.f34964a - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i11, int i12) {
                int i13 = this.f34964a;
                if (i13 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i11, Math.min(i12, i13));
                if (read >= 0) {
                    this.f34964a -= read;
                }
                return read;
            }
        }
    }
}