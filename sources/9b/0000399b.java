package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class i {

    /* renamed from: f  reason: collision with root package name */
    private static final fn.a f17012f = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f17013a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityManager f17014b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f17015c;

    /* renamed from: d  reason: collision with root package name */
    private final String f17016d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f17017e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    private String a() {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f17014b.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return this.f17017e.getPackageName();
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 16) {
            return com.google.firebase.perf.util.k.c(com.google.firebase.perf.util.g.BYTES.toKilobytes(this.f17015c.totalMem));
        }
        return f("/proc/meminfo");
    }

    public int c() {
        return com.google.firebase.perf.util.k.c(com.google.firebase.perf.util.g.BYTES.toKilobytes(this.f17013a.maxMemory()));
    }

    public int d() {
        return com.google.firebase.perf.util.k.c(com.google.firebase.perf.util.g.MEGABYTES.toKilobytes(this.f17014b.getMemoryClass()));
    }

    public String e() {
        return this.f17016d;
    }

    int f(String str) {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e11) {
            fn.a aVar = f17012f;
            aVar.j("Unable to read '" + str + "' file: " + e11.getMessage());
        } catch (NumberFormatException e12) {
            fn.a aVar2 = f17012f;
            aVar2.j("Unable to parse '" + str + "' file: " + e12.getMessage());
        }
        do {
            try {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } while (!readLine.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return parseInt;
    }

    i(Runtime runtime, Context context) {
        this.f17013a = runtime;
        this.f17017e = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f17014b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f17015c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
        this.f17016d = a();
    }
}