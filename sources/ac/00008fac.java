package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f42681a = Logger.getLogger("okio.Okio");

    public static final c0 b(File appendingSink) {
        kotlin.jvm.internal.s.g(appendingSink, "$this$appendingSink");
        return r.g(new FileOutputStream(appendingSink, true));
    }

    public static final boolean c(AssertionError isAndroidGetsocknameError) {
        kotlin.jvm.internal.s.g(isAndroidGetsocknameError, "$this$isAndroidGetsocknameError");
        if (isAndroidGetsocknameError.getCause() != null) {
            String message = isAndroidGetsocknameError.getMessage();
            return message != null ? kotlin.text.w.M(message, "getsockname failed", false, 2, null) : false;
        }
        return false;
    }

    public static final c0 d(File sink, boolean z11) {
        kotlin.jvm.internal.s.g(sink, "$this$sink");
        return r.g(new FileOutputStream(sink, z11));
    }

    public static final c0 e(OutputStream sink) {
        kotlin.jvm.internal.s.g(sink, "$this$sink");
        return new v(sink, new f0());
    }

    public static final c0 f(Socket sink) {
        kotlin.jvm.internal.s.g(sink, "$this$sink");
        d0 d0Var = new d0(sink);
        OutputStream outputStream = sink.getOutputStream();
        kotlin.jvm.internal.s.f(outputStream, "getOutputStream()");
        return d0Var.sink(new v(outputStream, d0Var));
    }

    public static /* synthetic */ c0 g(File file, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return r.f(file, z11);
    }

    public static final e0 h(File source) {
        kotlin.jvm.internal.s.g(source, "$this$source");
        return r.k(new FileInputStream(source));
    }

    public static final e0 i(InputStream source) {
        kotlin.jvm.internal.s.g(source, "$this$source");
        return new q(source, new f0());
    }

    public static final e0 j(Socket source) {
        kotlin.jvm.internal.s.g(source, "$this$source");
        d0 d0Var = new d0(source);
        InputStream inputStream = source.getInputStream();
        kotlin.jvm.internal.s.f(inputStream, "getInputStream()");
        return d0Var.source(new q(inputStream, d0Var));
    }
}