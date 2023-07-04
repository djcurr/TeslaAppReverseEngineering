package rd;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import md.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f49346h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f49347i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b  reason: collision with root package name */
    private volatile File f49349b;

    /* renamed from: d  reason: collision with root package name */
    private volatile File f49351d;

    /* renamed from: e  reason: collision with root package name */
    private long f49352e;

    /* renamed from: a  reason: collision with root package name */
    private volatile StatFs f49348a = null;

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f49350c = null;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f49354g = false;

    /* renamed from: f  reason: collision with root package name */
    private final Lock f49353f = new ReentrantLock();

    /* renamed from: rd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC1077a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f49354g) {
            return;
        }
        this.f49353f.lock();
        try {
            if (!this.f49354g) {
                this.f49349b = Environment.getDataDirectory();
                this.f49351d = Environment.getExternalStorageDirectory();
                g();
                this.f49354g = true;
            }
        } finally {
            this.f49353f.unlock();
        }
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            if (f49346h == null) {
                f49346h = new a();
            }
            aVar = f49346h;
        }
        return aVar;
    }

    private void e() {
        if (this.f49353f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f49352e > f49347i) {
                    g();
                }
            } finally {
                this.f49353f.unlock();
            }
        }
    }

    private void g() {
        this.f49348a = h(this.f49348a, this.f49349b);
        this.f49350c = h(this.f49350c, this.f49351d);
        this.f49352e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th2) {
            throw p.a(th2);
        }
    }

    public long c(EnumC1077a enumC1077a) {
        long blockSize;
        long availableBlocks;
        b();
        e();
        StatFs statFs = enumC1077a == EnumC1077a.INTERNAL ? this.f49348a : this.f49350c;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                availableBlocks = statFs.getAvailableBlocksLong();
            } else {
                blockSize = statFs.getBlockSize();
                availableBlocks = statFs.getAvailableBlocks();
            }
            return blockSize * availableBlocks;
        }
        return 0L;
    }

    public boolean f(EnumC1077a enumC1077a, long j11) {
        b();
        long c11 = c(enumC1077a);
        return c11 <= 0 || c11 < j11;
    }
}