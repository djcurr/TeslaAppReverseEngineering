package io.realm.internal.async;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class a extends ThreadPoolExecutor {

    /* renamed from: d  reason: collision with root package name */
    private static final int f31914d = a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f31915a;

    /* renamed from: b  reason: collision with root package name */
    private ReentrantLock f31916b;

    /* renamed from: c  reason: collision with root package name */
    private Condition f31917c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.realm.internal.async.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0597a implements FileFilter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Pattern f31918a;

        C0597a(Pattern pattern) {
            this.f31918a = pattern;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return this.f31918a.matcher(file.getName()).matches();
        }
    }

    private a(int i11, int i12) {
        super(i11, i12, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f31916b = reentrantLock;
        this.f31917c = reentrantLock.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    private static int a() {
        int b11 = b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (b11 <= 0) {
            b11 = Runtime.getRuntime().availableProcessors();
        }
        if (b11 <= 0) {
            return 1;
        }
        return 1 + (b11 * 2);
    }

    private static int b(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new C0597a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static a c() {
        int i11 = f31914d;
        return new a(i11, i11);
    }

    public static a d() {
        return new a(1, 1);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f31916b.lock();
        while (this.f31915a) {
            try {
                try {
                    this.f31917c.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.f31916b.unlock();
            }
        }
    }
}