package ei;

import ak.k0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f25138c = new e(new int[]{2}, 8);

    /* renamed from: d  reason: collision with root package name */
    private static final e f25139d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f25140a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25141b;

    public e(int[] iArr, int i11) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25140a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f25140a = new int[0];
        }
        this.f25141b = i11;
    }

    private static boolean a() {
        return k0.f477a >= 17 && "Amazon".equals(k0.f479c);
    }

    public static e b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static e c(Context context, Intent intent) {
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f25139d;
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f25138c;
    }

    public int d() {
        return this.f25141b;
    }

    public boolean e(int i11) {
        return Arrays.binarySearch(this.f25140a, i11) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return Arrays.equals(this.f25140a, eVar.f25140a) && this.f25141b == eVar.f25141b;
        }
        return false;
    }

    public int hashCode() {
        return this.f25141b + (Arrays.hashCode(this.f25140a) * 31);
    }

    public String toString() {
        int i11 = this.f25141b;
        String arrays = Arrays.toString(this.f25140a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i11);
        sb2.append(", supportedEncodings=");
        sb2.append(arrays);
        sb2.append("]");
        return sb2.toString();
    }
}