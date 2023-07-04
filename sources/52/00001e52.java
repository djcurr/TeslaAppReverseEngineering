package com.google.android.gms.common.images;

/* loaded from: classes3.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i11, int i12) {
        this.zaa = i11;
        this.zab = i12;
    }

    public static Size parseSize(String str) {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            }
            throw zaa(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i11 = this.zab;
        int i12 = this.zaa;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        int i11 = this.zaa;
        int i12 = this.zab;
        return i11 + "x" + i12;
    }
}