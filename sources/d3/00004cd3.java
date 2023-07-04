package com.stripe.android.core.networking;

import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.StripeFileParams;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import e00.a;
import e00.b;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URLConnection;
import java.util.Map;
import k00.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlin.text.o;
import kotlin.text.v;
import vz.b0;

/* loaded from: classes2.dex */
public class FileUploadRequest extends StripeRequest {
    protected static final Companion Companion = new Companion(null);
    private static final String HOST = "https://files.stripe.com/v1/files";
    public static final String LINE_BREAK = "\r\n";
    private final String boundary;
    private final StripeFileParams fileParams;
    private final Map<String, String> headers;
    private final RequestHeadersFactory headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private Map<String, String> postHeaders;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createBoundary() {
            return String.valueOf(c.f34202a.g(0L, Long.MAX_VALUE));
        }
    }

    public /* synthetic */ FileUploadRequest(StripeFileParams stripeFileParams, ApiRequest.Options options, AppInfo appInfo, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeFileParams, options, (i11 & 4) != 0 ? null : appInfo, (i11 & 8) != 0 ? Companion.createBoundary() : str);
    }

    protected final String getBoundary() {
        return this.boundary;
    }

    public final String getFileMetadata() {
        String f11;
        String name = this.fileParams.getFile$stripe_core_release().getName();
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(name);
        f11 = o.f("\n                --" + this.boundary + "\n                Content-Disposition: form-data; name=\"file\"; filename=\"" + ((Object) name) + "\"\n                Content-Type: " + ((Object) guessContentTypeFromName) + "\n                Content-Transfer-Encoding: binary\n\n\n            ");
        return f11;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public final String getPurposeContents() {
        String f11;
        f11 = o.f("\n                --" + this.boundary + "\n                Content-Disposition: form-data; name=\"purpose\"\n\n                " + this.fileParams.getPurpose$stripe_core_release().getCode() + "\n\n            ");
        return f11;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    protected final void writeFile(OutputStream outputStream) {
        s.g(outputStream, "outputStream");
        a.b(new FileInputStream(this.fileParams.getFile$stripe_core_release()), outputStream, 0, 2, null);
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        s.g(outputStream, "outputStream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, d.f35187b);
        try {
            PrintWriter printWriter = new PrintWriter((Writer) outputStreamWriter, true);
            writeString(printWriter, getPurposeContents());
            writeString(printWriter, getFileMetadata());
            writeFile(outputStream);
            printWriter.write(LINE_BREAK);
            printWriter.write("--" + getBoundary() + "--");
            printWriter.flush();
            b0 b0Var = b0.f54756a;
            b.a(printWriter, null);
            b.a(outputStreamWriter, null);
        } finally {
        }
    }

    protected final void writeString(PrintWriter writer, String contents) {
        String D;
        s.g(writer, "writer");
        s.g(contents, "contents");
        D = v.D(contents, "\n", LINE_BREAK, false, 4, null);
        writer.write(D);
        writer.flush();
    }

    public FileUploadRequest(StripeFileParams fileParams, ApiRequest.Options options, AppInfo appInfo, String boundary) {
        s.g(fileParams, "fileParams");
        s.g(options, "options");
        s.g(boundary, "boundary");
        this.fileParams = fileParams;
        this.boundary = boundary;
        RequestHeadersFactory.FileUpload fileUpload = new RequestHeadersFactory.FileUpload(options, appInfo, null, null, null, boundary, 28, null);
        this.headersFactory = fileUpload;
        this.method = StripeRequest.Method.POST;
        this.mimeType = StripeRequest.MimeType.MultipartForm;
        this.url = HOST;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = fileUpload.create();
        this.postHeaders = fileUpload.createPostHeader();
    }
}