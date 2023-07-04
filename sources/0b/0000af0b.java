package qx;

import com.google.common.base.u;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.f1;
import io.grpc.l0;
import io.grpc.s0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile ExtensionRegistryLite f48686a = ExtensionRegistryLite.getEmptyRegistry();

    /* loaded from: classes5.dex */
    private static final class a<T extends MessageLite> implements s0.c {

        /* renamed from: c  reason: collision with root package name */
        private static final ThreadLocal<Reference<byte[]>> f48687c = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        private final Parser<T> f48688a;

        /* renamed from: b  reason: collision with root package name */
        private final T f48689b;

        a(T t11) {
            this.f48689b = t11;
            this.f48688a = (Parser<T>) t11.getParserForType();
        }

        private T d(CodedInputStream codedInputStream) {
            T parseFrom = this.f48688a.parseFrom(codedInputStream, b.f48686a);
            try {
                codedInputStream.checkLastTagWas(0);
                return parseFrom;
            } catch (InvalidProtocolBufferException e11) {
                e11.setUnfinishedMessage(parseFrom);
                throw e11;
            }
        }

        @Override // io.grpc.s0.c
        /* renamed from: c */
        public T b(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof qx.a) && ((qx.a) inputStream).j() == this.f48688a) {
                try {
                    return (T) ((qx.a) inputStream).g();
                } catch (IllegalStateException unused) {
                }
            }
            CodedInputStream codedInputStream = null;
            try {
                if (inputStream instanceof l0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f48687c;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i11 = available;
                        while (i11 > 0) {
                            int read = inputStream.read(bArr, available - i11, i11);
                            if (read == -1) {
                                break;
                            }
                            i11 -= read;
                        }
                        if (i11 == 0) {
                            codedInputStream = CodedInputStream.newInstance(bArr, 0, available);
                        } else {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i11));
                        }
                    } else if (available == 0) {
                        return this.f48689b;
                    }
                }
                if (codedInputStream == null) {
                    codedInputStream = CodedInputStream.newInstance(inputStream);
                }
                codedInputStream.setSizeLimit(Integer.MAX_VALUE);
                try {
                    return d(codedInputStream);
                } catch (InvalidProtocolBufferException e11) {
                    throw f1.f30570n.r("Invalid protobuf byte sequence").q(e11).d();
                }
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // io.grpc.s0.c
        /* renamed from: e */
        public InputStream a(T t11) {
            return new qx.a(t11, this.f48688a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(InputStream inputStream, OutputStream outputStream) {
        u.p(inputStream, "inputStream cannot be null!");
        u.p(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    public static <T extends MessageLite> s0.c<T> b(T t11) {
        return new a(t11);
    }
}