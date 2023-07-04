package zd;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f60408a = new C1380a();

    /* renamed from: zd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C1380a implements FileFilter {
        C1380a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (name.startsWith("cpu")) {
                for (int i11 = 3; i11 < name.length(); i11++) {
                    if (!Character.isDigit(name.charAt(i11))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private static int a(byte[] bArr, int i11) {
        while (i11 < bArr.length && bArr[i11] != 10) {
            if (Character.isDigit(bArr[i11])) {
                int i12 = i11 + 1;
                while (i12 < bArr.length && Character.isDigit(bArr[i12])) {
                    i12++;
                }
                return Integer.parseInt(new String(bArr, 0, i11, i12 - i11));
            }
            i11++;
        }
        return -1;
    }

    public static int b() {
        int i11 = -1;
        for (int i12 = 0; i12 < f(); i12++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i13 = 0;
                        while (Character.isDigit(bArr[i13]) && i13 < 128) {
                            i13++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i13)));
                        if (valueOf.intValue() > i11) {
                            i11 = valueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i11 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            int h11 = h("cpu MHz", fileInputStream2) * 1000;
            if (h11 > i11) {
                i11 = h11;
            }
            fileInputStream2.close();
        }
        return i11;
    }

    private static int c() {
        return new File("/sys/devices/system/cpu/").listFiles(f60408a).length;
    }

    private static int d(String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                int e11 = e(readLine);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return e11;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static int e(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    public static int f() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            int d11 = d("/sys/devices/system/cpu/possible");
            if (d11 == -1) {
                d11 = d("/sys/devices/system/cpu/present");
            }
            return d11 == -1 ? c() : d11;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static long g(Context context) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        long j11 = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/meminfo");
            j11 = h("MemTotal", fileInputStream) * 1024;
            fileInputStream.close();
        } catch (IOException unused) {
        }
        return j11;
    }

    private static int h(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i11 = 0;
            while (i11 < read) {
                if (bArr[i11] == 10 || i11 == 0) {
                    if (bArr[i11] == 10) {
                        i11++;
                    }
                    for (int i12 = i11; i12 < read; i12++) {
                        int i13 = i12 - i11;
                        if (bArr[i12] != str.charAt(i13)) {
                            break;
                        } else if (i13 == str.length() - 1) {
                            return a(bArr, i12);
                        }
                    }
                    continue;
                }
                i11++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }
}