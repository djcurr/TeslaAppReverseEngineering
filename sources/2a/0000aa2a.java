package p5;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class b extends n {
    public b(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p5.m
    protected String c() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // p5.m
    protected String i() {
        return "com.facebook.pages.app";
    }

    @Override // p5.m
    protected String j() {
        return null;
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        n();
    }
}