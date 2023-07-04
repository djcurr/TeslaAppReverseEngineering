package io.grpc.okhttp.internal;

import java.io.UnsupportedEncodingException;
import org.spongycastle.i18n.LocalizedMessage;

/* loaded from: classes5.dex */
public final class c {
    public static String a(String str, String str2) {
        try {
            String a11 = okio.i.s((str + ":" + str2).getBytes(LocalizedMessage.DEFAULT_ENCODING)).a();
            return "Basic " + a11;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}