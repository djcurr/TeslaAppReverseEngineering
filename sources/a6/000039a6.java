package com.google.firebase.perf.util;

import ch.qos.logback.core.util.FileSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g BYTES;
    public static final g GIGABYTES;
    public static final g KILOBYTES;
    public static final g MEGABYTES;
    public static final g TERABYTES;
    long numBytes;

    /* loaded from: classes2.dex */
    enum a extends g {
        a(String str, int i11, long j11) {
            super(str, i11, j11, null);
        }

        @Override // com.google.firebase.perf.util.g
        public long convert(long j11, g gVar) {
            return gVar.toTerabytes(j11);
        }
    }

    static {
        a aVar = new a("TERABYTES", 0, 1099511627776L);
        TERABYTES = aVar;
        g gVar = new g("GIGABYTES", 1, FileSize.GB_COEFFICIENT) { // from class: com.google.firebase.perf.util.g.b
            @Override // com.google.firebase.perf.util.g
            public long convert(long j11, g gVar2) {
                return gVar2.toGigabytes(j11);
            }
        };
        GIGABYTES = gVar;
        g gVar2 = new g("MEGABYTES", 2, FileSize.MB_COEFFICIENT) { // from class: com.google.firebase.perf.util.g.c
            @Override // com.google.firebase.perf.util.g
            public long convert(long j11, g gVar3) {
                return gVar3.toMegabytes(j11);
            }
        };
        MEGABYTES = gVar2;
        g gVar3 = new g("KILOBYTES", 3, 1024L) { // from class: com.google.firebase.perf.util.g.d
            @Override // com.google.firebase.perf.util.g
            public long convert(long j11, g gVar4) {
                return gVar4.toKilobytes(j11);
            }
        };
        KILOBYTES = gVar3;
        g gVar4 = new g("BYTES", 4, 1L) { // from class: com.google.firebase.perf.util.g.e
            @Override // com.google.firebase.perf.util.g
            public long convert(long j11, g gVar5) {
                return gVar5.toBytes(j11);
            }
        };
        BYTES = gVar4;
        $VALUES = new g[]{aVar, gVar, gVar2, gVar3, gVar4};
    }

    /* synthetic */ g(String str, int i11, long j11, a aVar) {
        this(str, i11, j11);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public abstract long convert(long j11, g gVar);

    public long toBytes(long j11) {
        return j11 * this.numBytes;
    }

    public long toGigabytes(long j11) {
        return (j11 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j11) {
        return (j11 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j11) {
        return (j11 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j11) {
        return (j11 * this.numBytes) / TERABYTES.numBytes;
    }

    private g(String str, int i11, long j11) {
        this.numBytes = j11;
    }
}