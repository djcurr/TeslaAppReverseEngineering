package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import je.q;

/* loaded from: classes3.dex */
public class d {
    public static Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static q.c b() {
        return q.c.f33453e;
    }

    public static q.c c(String str) {
        if ("contain".equals(str)) {
            return q.c.f33450b;
        }
        if ("cover".equals(str)) {
            return q.c.f33453e;
        }
        if ("stretch".equals(str)) {
            return q.c.f33449a;
        }
        if ("center".equals(str)) {
            return q.c.f33452d;
        }
        if ("repeat".equals(str)) {
            return i.f12543g;
        }
        if (str == null) {
            return b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static Shader.TileMode d(String str) {
        if (!"contain".equals(str) && !"cover".equals(str) && !"stretch".equals(str) && !"center".equals(str)) {
            if ("repeat".equals(str)) {
                return Shader.TileMode.REPEAT;
            }
            if (str == null) {
                return a();
            }
            throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
        }
        return Shader.TileMode.CLAMP;
    }
}