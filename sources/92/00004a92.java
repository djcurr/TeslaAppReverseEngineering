package com.squareup.picasso;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f20649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20650b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20651c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20652d;

    /* renamed from: e  reason: collision with root package name */
    public final long f20653e;

    /* renamed from: f  reason: collision with root package name */
    public final long f20654f;

    /* renamed from: g  reason: collision with root package name */
    public final long f20655g;

    /* renamed from: h  reason: collision with root package name */
    public final long f20656h;

    /* renamed from: i  reason: collision with root package name */
    public final long f20657i;

    /* renamed from: j  reason: collision with root package name */
    public final long f20658j;

    /* renamed from: k  reason: collision with root package name */
    public final int f20659k;

    /* renamed from: l  reason: collision with root package name */
    public final int f20660l;

    /* renamed from: m  reason: collision with root package name */
    public final int f20661m;

    /* renamed from: n  reason: collision with root package name */
    public final long f20662n;

    public b0(int i11, int i12, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, int i13, int i14, int i15, long j19) {
        this.f20649a = i11;
        this.f20650b = i12;
        this.f20651c = j11;
        this.f20652d = j12;
        this.f20653e = j13;
        this.f20654f = j14;
        this.f20655g = j15;
        this.f20656h = j16;
        this.f20657i = j17;
        this.f20658j = j18;
        this.f20659k = i13;
        this.f20660l = i14;
        this.f20661m = i15;
        this.f20662n = j19;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f20649a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f20650b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f20650b / this.f20649a) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f20651c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f20652d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f20659k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f20653e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f20656h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f20660l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f20654f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f20661m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f20655g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f20657i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f20658j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f20649a + ", size=" + this.f20650b + ", cacheHits=" + this.f20651c + ", cacheMisses=" + this.f20652d + ", downloadCount=" + this.f20659k + ", totalDownloadSize=" + this.f20653e + ", averageDownloadSize=" + this.f20656h + ", totalOriginalBitmapSize=" + this.f20654f + ", totalTransformedBitmapSize=" + this.f20655g + ", averageOriginalBitmapSize=" + this.f20657i + ", averageTransformedBitmapSize=" + this.f20658j + ", originalBitmapCount=" + this.f20660l + ", transformedBitmapCount=" + this.f20661m + ", timeStamp=" + this.f20662n + CoreConstants.CURLY_RIGHT;
    }
}