package com.drew.imaging.png;

/* loaded from: classes.dex */
public enum a {
    Greyscale(0, "Greyscale", 1, 2, 4, 8, 16),
    TrueColor(2, "True Color", 8, 16),
    IndexedColor(3, "Indexed Color", 1, 2, 4, 8),
    GreyscaleWithAlpha(4, "Greyscale with Alpha", 8, 16),
    TrueColorWithAlpha(6, "True Color with Alpha", 8, 16);
    
    private final int[] _allowedBitDepths;
    private final String _description;
    private final int _numericValue;

    a(int i11, String str, int... iArr) {
        this._numericValue = i11;
        this._description = str;
        this._allowedBitDepths = iArr;
    }

    public static a fromNumericValue(int i11) {
        a[] aVarArr;
        for (a aVar : (a[]) a.class.getEnumConstants()) {
            if (aVar.getNumericValue() == i11) {
                return aVar;
            }
        }
        return null;
    }

    public int[] getAllowedBitDepths() {
        return this._allowedBitDepths;
    }

    public String getDescription() {
        return this._description;
    }

    public int getNumericValue() {
        return this._numericValue;
    }
}