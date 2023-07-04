package p5;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public class g extends n {
    public g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String r(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String i() {
        return "com.instagram.android";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String j() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        if (!m.k("url", readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string = readableMap.getString("url");
        if (Boolean.valueOf(string.startsWith("instagram://")).booleanValue()) {
            t(string);
        } else if (!m.k("type", readableMap)) {
            Log.e("RNShare", "No type provided");
        } else {
            String string2 = readableMap.getString("type");
            String r11 = r(string2);
            s(string, this.f46202c, Boolean.valueOf(string2.startsWith("image")), r11);
        }
    }

    protected void s(String str, String str2, Boolean bool, String str3) {
        o5.d dVar;
        Boolean valueOf = Boolean.valueOf(m.k("useInternalStorage", this.f46204e) && this.f46204e.getBoolean("useInternalStorage"));
        if (bool.booleanValue()) {
            dVar = new o5.d(str, "image/" + str3, "image", valueOf, this.f46200a);
        } else {
            dVar = new o5.d(str, "video/" + str3, MediaStreamTrack.VIDEO_TRACK_KIND, valueOf, this.f46200a);
        }
        Uri d11 = dVar.d();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", d11);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(d11, str3);
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent createChooser = Intent.createChooser(intent, str2);
        createChooser.addFlags(268435456);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f46200a.getCurrentActivity().grantUriPermission("com.instagram.android", d11, 1);
        this.f46200a.startActivity(createChooser);
        p.d(true, Boolean.TRUE, g().getPackage());
    }

    protected void t(String str) {
        Uri parse = Uri.parse(str);
        g().setAction("android.intent.action.VIEW");
        g().setData(parse);
        super.n();
    }
}