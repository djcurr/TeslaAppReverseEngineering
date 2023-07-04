package p5;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class c extends n {
    public c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String c() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String i() {
        return "com.facebook.katana";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String j() {
        return null;
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        n();
    }
}