package com.stripe.android.core.networking;

import e00.a;
import e00.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public interface StripeConnection<ResponseBodyType> extends Closeable {

    /* loaded from: classes2.dex */
    public static abstract class AbstractConnection<ResponseBodyType> implements StripeConnection<ResponseBodyType> {
        private final HttpURLConnection conn;
        public static final Companion Companion = new Companion(null);
        private static final String CHARSET = StandardCharsets.UTF_8.name();

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getCHARSET$stripe_core_release() {
                return AbstractConnection.CHARSET;
            }
        }

        public AbstractConnection(HttpURLConnection conn) {
            s.g(conn, "conn");
            this.conn = conn;
        }

        private final InputStream getResponseStream() {
            int responseCode = getResponseCode();
            boolean z11 = false;
            if (200 <= responseCode && responseCode < 300) {
                z11 = true;
            }
            if (z11) {
                return this.conn.getInputStream();
            }
            return this.conn.getErrorStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream responseStream = getResponseStream();
            if (responseStream != null) {
                responseStream.close();
            }
            this.conn.disconnect();
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ StripeResponse getResponse() {
            int responseCode = getResponseCode();
            ResponseBodyType createBodyFromResponseStream = createBodyFromResponseStream(getResponseStream());
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            s.f(headerFields, "conn.headerFields");
            return new StripeResponse(responseCode, createBodyFromResponseStream, headerFields);
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public /* synthetic */ int getResponseCode() {
            return this.conn.getResponseCode();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Default extends AbstractConnection<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(HttpURLConnection conn) {
            super(conn);
            s.g(conn, "conn");
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public String createBodyFromResponseStream(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            try {
                Scanner useDelimiter = new Scanner(inputStream, AbstractConnection.Companion.getCHARSET$stripe_core_release()).useDelimiter("\\A");
                String next = useDelimiter.hasNext() ? useDelimiter.next() : null;
                b.a(inputStream, null);
                return next;
            } finally {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class FileConnection extends AbstractConnection<File> {
        private final File outputFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileConnection(HttpURLConnection conn, File outputFile) {
            super(conn);
            s.g(conn, "conn");
            s.g(outputFile, "outputFile");
            this.outputFile = outputFile;
        }

        @Override // com.stripe.android.core.networking.StripeConnection
        public File createBodyFromResponseStream(InputStream inputStream) {
            if (inputStream == null) {
                return null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.outputFile);
                a.b(inputStream, fileOutputStream, 0, 2, null);
                b.a(fileOutputStream, null);
                b.a(inputStream, null);
                return this.outputFile;
            } finally {
            }
        }
    }

    ResponseBodyType createBodyFromResponseStream(InputStream inputStream);

    StripeResponse<ResponseBodyType> getResponse();

    int getResponseCode();
}