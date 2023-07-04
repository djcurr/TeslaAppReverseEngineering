package kz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f35924b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f35925a = new ArrayList();

    private b() {
    }

    public static b a() {
        return f35924b;
    }

    @VisibleForTesting
    String b() {
        return "/sys/devices/system/cpu";
    }

    public List<Integer> c() {
        if (!this.f35925a.isEmpty()) {
            return this.f35925a;
        }
        File[] listFiles = new File(b()).listFiles();
        if (listFiles == null) {
            return new ArrayList();
        }
        for (File file : listFiles) {
            if (file.getName().matches("cpu[0-9]+")) {
                File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                if (file2.exists() && file2.canRead()) {
                    try {
                        String b11 = rz.c.b(file2);
                        if (b11 != null) {
                            this.f35925a.add(Integer.valueOf((int) (Long.parseLong(b11.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
        }
        return this.f35925a;
    }
}