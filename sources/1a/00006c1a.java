package ezvcard.parameter;

import ezvcard.VCardVersion;
import org.spongycastle.i18n.TextBundle;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes5.dex */
public class TelephoneType extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<TelephoneType> f25402b = new d<>(TelephoneType.class);
    @vw.b({VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final TelephoneType f25403c;

    static {
        new TelephoneType("bbs");
        new TelephoneType("car");
        new TelephoneType("cell");
        new TelephoneType("fax");
        new TelephoneType("home");
        new TelephoneType("isdn");
        new TelephoneType("modem");
        new TelephoneType("msg");
        new TelephoneType("pager");
        new TelephoneType("pcs");
        f25403c = new TelephoneType("pref");
        new TelephoneType(TextBundle.TEXT_ENTRY);
        new TelephoneType("textphone");
        new TelephoneType(MediaStreamTrack.VIDEO_TRACK_KIND);
        new TelephoneType("voice");
        new TelephoneType("work");
    }

    private TelephoneType(String str) {
        super(str);
    }

    public static TelephoneType d(String str) {
        return (TelephoneType) f25402b.e(str);
    }
}