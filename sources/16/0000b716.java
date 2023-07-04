package u4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f53106e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f53107a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f53108b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f53109c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f53110d;

    public a(String str, File file, boolean z11) {
        File file2 = new File(file, str + ".lck");
        this.f53107a = file2;
        this.f53108b = a(file2.getAbsolutePath());
        this.f53109c = z11;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f53106e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f53108b.lock();
        if (this.f53109c) {
            try {
                FileChannel channel = new FileOutputStream(this.f53107a).getChannel();
                this.f53110d = channel;
                channel.lock();
            } catch (IOException e11) {
                throw new IllegalStateException("Unable to grab copy lock.", e11);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f53110d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f53108b.unlock();
    }
}