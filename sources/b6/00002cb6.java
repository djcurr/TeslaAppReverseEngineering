package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzjw {
    private static final int zzadq = 11;
    private static final int zzadr = 12;
    private static final int zzads = 16;
    private static final int zzadt = 26;
    public static final int[] zzzb = new int[0];
    private static final long[] zzadu = new long[0];
    private static final float[] zzadv = new float[0];
    private static final double[] zzadw = new double[0];
    private static final boolean[] zzadx = new boolean[0];
    public static final String[] zzady = new String[0];
    private static final byte[][] zzadz = new byte[0];
    public static final byte[] zzaea = new byte[0];

    public static final int zzb(zzjk zzjkVar, int i11) {
        int position = zzjkVar.getPosition();
        zzjkVar.zzal(i11);
        int i12 = 1;
        while (zzjkVar.zzdq() == i11) {
            zzjkVar.zzal(i11);
            i12++;
        }
        zzjkVar.zzw(position, i11);
        return i12;
    }
}