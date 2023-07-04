package com.stripe.android.stripe3ds2.transaction;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import e00.b;
import e00.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import v20.i;
import vz.b0;
import vz.q;
import vz.r;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeHttpClient implements HttpClient {
    private final ConnectionFactory connectionFactory;
    private final ErrorReporter errorReporter;
    private final String url;
    private final g workContext;

    /* loaded from: classes6.dex */
    public interface ConnectionFactory {
        HttpURLConnection create(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class DefaultConnectionFactory implements ConnectionFactory {
        @Override // com.stripe.android.stripe3ds2.transaction.StripeHttpClient.ConnectionFactory
        public HttpURLConnection create(String url) {
            s.g(url, "url");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection());
            Objects.requireNonNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) uRLConnection;
        }
    }

    public StripeHttpClient(String url, ConnectionFactory connectionFactory, ErrorReporter errorReporter, g workContext) {
        s.g(url, "url");
        s.g(connectionFactory, "connectionFactory");
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
        this.url = url;
        this.connectionFactory = connectionFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    private final HttpURLConnection createConnection() {
        return this.connectionFactory.create(this.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpURLConnection createGetConnection() {
        HttpURLConnection createConnection = createConnection();
        createConnection.setDoInput(true);
        return createConnection;
    }

    private final HttpURLConnection createPostConnection(String str, String str2) {
        HttpURLConnection createConnection = createConnection();
        createConnection.setRequestMethod("POST");
        createConnection.setDoOutput(true);
        createConnection.setRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, str2);
        createConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
        return createConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpResponse doPostRequestInternal(String str, String str2) {
        HttpURLConnection createPostConnection = createPostConnection(str, str2);
        OutputStream os2 = createPostConnection.getOutputStream();
        try {
            s.f(os2, "os");
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.f(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os2, UTF_8);
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
            b0 b0Var = b0.f54756a;
            b.a(outputStreamWriter, null);
            b.a(os2, null);
            createPostConnection.connect();
            return handlePostResponse$3ds2sdk_release(createPostConnection);
        } finally {
        }
    }

    private final String getResponseBody(InputStream inputStream) {
        Object b11;
        try {
            q.a aVar = q.f54772b;
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, d.f35187b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, PKIFailureInfo.certRevoked);
            String e11 = l.e(bufferedReader);
            b.a(bufferedReader, null);
            b11 = q.b(e11);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        String str = q.g(b11) ? null : b11;
        return str == null ? "" : str;
    }

    private final boolean isSuccessfulResponse(int i11) {
        return 200 <= i11 && i11 < 300;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doGetRequest(zz.d<? super InputStream> dVar) {
        return i.g(this.workContext, new StripeHttpClient$doGetRequest$2(this, null), dVar);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.HttpClient
    public Object doPostRequest(String str, String str2, zz.d<? super HttpResponse> dVar) {
        return i.g(this.workContext, new StripeHttpClient$doPostRequest$2(this, str, str2, null), dVar);
    }

    public final HttpResponse handlePostResponse$3ds2sdk_release(HttpURLConnection conn) {
        s.g(conn, "conn");
        int responseCode = conn.getResponseCode();
        if (isSuccessfulResponse(responseCode)) {
            InputStream inputStream = conn.getInputStream();
            s.f(inputStream, "conn.inputStream");
            return new HttpResponse(getResponseBody(inputStream), conn.getContentType());
        }
        throw new SDKRuntimeException("Unsuccessful response code from " + this.url + ": " + responseCode, null, 2, null);
    }

    public /* synthetic */ StripeHttpClient(String str, ConnectionFactory connectionFactory, ErrorReporter errorReporter, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? new DefaultConnectionFactory() : connectionFactory, errorReporter, gVar);
    }
}