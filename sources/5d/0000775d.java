package io.grpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public interface l extends n, u {

    /* loaded from: classes5.dex */
    public static final class a implements l {
        @Override // io.grpc.n, io.grpc.u
        public String a() {
            return "gzip";
        }

        @Override // io.grpc.u
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.n
        public OutputStream compress(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public static final l f31488a = new b();

        private b() {
        }

        @Override // io.grpc.n, io.grpc.u
        public String a() {
            return "identity";
        }

        @Override // io.grpc.u
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.n
        public OutputStream compress(OutputStream outputStream) {
            return outputStream;
        }
    }
}