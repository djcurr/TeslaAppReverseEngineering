package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.File;

/* loaded from: classes.dex */
public final class GlideApp {
    private GlideApp() {
    }

    public static void enableHardwareBitmaps() {
        c.d();
    }

    public static c get(Context context) {
        return c.e(context);
    }

    public static File getPhotoCacheDir(Context context) {
        return c.l(context);
    }

    @Deprecated
    public static void init(c cVar) {
        c.r(cVar);
    }

    public static void tearDown() {
        c.w();
    }

    public static GlideRequests with(Context context) {
        return (GlideRequests) c.C(context);
    }

    public static File getPhotoCacheDir(Context context, String str) {
        return c.m(context, str);
    }

    public static void init(Context context, d dVar) {
        c.q(context, dVar);
    }

    public static GlideRequests with(Activity activity) {
        return (GlideRequests) c.A(activity);
    }

    public static GlideRequests with(h hVar) {
        return (GlideRequests) c.F(hVar);
    }

    public static GlideRequests with(Fragment fragment) {
        return (GlideRequests) c.E(fragment);
    }

    @Deprecated
    public static GlideRequests with(android.app.Fragment fragment) {
        return (GlideRequests) c.B(fragment);
    }

    public static GlideRequests with(View view) {
        return (GlideRequests) c.D(view);
    }
}