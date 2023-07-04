package org.webrtc;

/* loaded from: classes4.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.width == size.width && this.height == size.height;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        return i11 + "x" + i12;
    }
}