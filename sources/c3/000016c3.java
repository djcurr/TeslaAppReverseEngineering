package com.facebook.imagepipeline.nativecode;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static e f11303a;

    static {
        try {
            f11303a = (e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
        } catch (Throwable unused) {
        }
    }

    public static e a() {
        return f11303a;
    }
}