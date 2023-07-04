package com.google.android.gms.internal.clearcut;

/* loaded from: classes3.dex */
final class zzee {
    private final String info;
    private int position = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(String str) {
        this.info = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean hasNext() {
        return this.position < this.info.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int next() {
        String str = this.info;
        int i11 = this.position;
        this.position = i11 + 1;
        char charAt = str.charAt(i11);
        if (charAt < 55296) {
            return charAt;
        }
        int i12 = charAt & 8191;
        int i13 = 13;
        while (true) {
            String str2 = this.info;
            int i14 = this.position;
            this.position = i14 + 1;
            char charAt2 = str2.charAt(i14);
            if (charAt2 < 55296) {
                return i12 | (charAt2 << i13);
            }
            i12 |= (charAt2 & 8191) << i13;
            i13 += 13;
        }
    }
}