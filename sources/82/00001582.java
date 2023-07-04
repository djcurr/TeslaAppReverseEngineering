package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import ch.qos.logback.classic.Level;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f10788g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f10789h;

    /* renamed from: i  reason: collision with root package name */
    private static final File f10790i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile r f10791j;

    /* renamed from: k  reason: collision with root package name */
    private static volatile int f10792k;

    /* renamed from: b  reason: collision with root package name */
    private final int f10794b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10795c;

    /* renamed from: d  reason: collision with root package name */
    private int f10796d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10797e = true;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f10798f = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10793a = f();

    static {
        int i11 = Build.VERSION.SDK_INT;
        f10788g = i11 < 29;
        f10789h = i11 >= 26;
        f10790i = new File("/proc/self/fd");
        f10792k = -1;
    }

    r() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10794b = Level.INFO_INT;
            this.f10795c = 0;
            return;
        }
        this.f10794b = 700;
        this.f10795c = 128;
    }

    private boolean a() {
        return f10788g && !this.f10798f.get();
    }

    public static r b() {
        if (f10791j == null) {
            synchronized (r.class) {
                if (f10791j == null) {
                    f10791j = new r();
                }
            }
        }
        return f10791j;
    }

    private int c() {
        if (f10792k != -1) {
            return f10792k;
        }
        return this.f10794b;
    }

    private synchronized boolean d() {
        boolean z11 = true;
        int i11 = this.f10796d + 1;
        this.f10796d = i11;
        if (i11 >= 50) {
            this.f10796d = 0;
            int length = f10790i.list().length;
            long c11 = c();
            if (length >= c11) {
                z11 = false;
            }
            this.f10797e = z11;
            if (!z11 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c11);
            }
        }
        return this.f10797e;
    }

    private static boolean f() {
        return (g() || h()) ? false : true;
    }

    private static boolean g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String str : Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play")) {
            if (Build.MODEL.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean e(int i11, int i12, boolean z11, boolean z12) {
        if (!z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f10793a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f10789h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i13 = this.f10795c;
            if (i11 < i13) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i12 < i13) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (d()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(int i11, int i12, BitmapFactory.Options options, boolean z11, boolean z12) {
        boolean e11 = e(i11, i12, z11, z12);
        if (e11) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e11;
    }

    public void j() {
        bb.k.b();
        this.f10798f.set(true);
    }
}